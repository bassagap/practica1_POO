/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package world;
import java.util.Random;
/**
 *
 * @author u124308
 */
public class World {
    private int width, height, screenMargin, numAgents; 
    Agent[] agents;
    public World() {
        width = 800;
        height = 600;
        screenMargin = 30;
        numAgents = 10;
        agents = new Agent[numAgents];
        for ( int i = 0; i < numAgents; i++){
            double randRad = 5 + Math.random()*(this.screenMargin/2); 
            this.agents[i] = new Agent(this.randomPointInsideWorld(),this.randomPointInsideWorld(), randRad, 10);
        };
    }
    public int getW() {
        return this.width;
    }
    public int getH() {
        return this.height;
    }
    public int getNumAgents() {
        return this.numAgents;
    }
    public Agent getAgent(int i){
        return this.agents[i]; 
    }
    public Vec2D randomPointInsideWorld() {
        Random random = new Random();
        return new Vec2D(random.nextInt(width-screenMargin*2)+screenMargin,random.nextInt(height-screenMargin*2)+screenMargin); 
    }
    public void processCollisions(){
        for(Agent a:agents) {
            for(Agent b:agents) {
                if(a.collisionWith(b)) {
                    Vec2D av = a.getDir();
                    Vec2D bv = b.getDir();
                    // Rotation
                    int aAngleCoeff = (av.angle(bv)>bv.angle(bv))?-1:1;
                    double aRadiusCoeff = (a.getRadius()/b.getRadius());
                    double angle = (av.angle(bv)+bv.angle(bv))/2;
                    av.rotate(aAngleCoeff*(angle*aRadiusCoeff+180));
                    bv.rotate((-1*aAngleCoeff)*(aRadiusCoeff+180));
                }
            }
        }
    }
    public void update() {
        for(Agent a:agents) {
            a.update();
            // Reset Objective if met
            if(a.objReached()) a.setObj(this.randomPointInsideWorld());
            a.getDir().rotateInDirectionOf(a.getDirToObj()); // Turn agent towards Objective
        }
    }
    public void run(int steps) {
        for(int i=0;i<steps;i++) update();
    }
}
