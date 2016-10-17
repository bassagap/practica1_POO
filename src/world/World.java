/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package world;
import world.Agent;
import world.Vec2D;
/**
 *
 * @author u124308
 */
public class World {
    private int width, height, screenMargin, numAgents; 
    Agent[] agents;
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
      return null;  
    }
    public void processCollisions(){
        
    }
    public void update() {
        
    }
    public void run(int steps) {
        
    }
}
