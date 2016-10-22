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
    public Agent getAgent(){
        return this.agents[0]; 
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
                    a.getDir().turn(av.angle(bv));
                    b.getDir().turn(bv.angle(av));
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
