/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package world;

/**
 *
 * @author u124308
 */
public class Agent {
    // Properties:
    
    private Vec2D speed;
    private Vec2D maxSpeed;
    private Vec2D pos;
    private Vec2D dir;
    private Vec2D obj;
    private double radius;
    private double weight;
    private int id;
    

//Contructor
    public Agent (int x, int y, double radius, double weight, int id){
        this.speed = new Vec2D(x, y);
        this.maxSpeed = new Vec2D(x, y);
        this.pos = new Vec2D(x, y);
        this.dir = new Vec2D(x, y);
        this.obj = new Vec2D(x, y);
        this.radius = radius;
        this.weight = weight;
        this.id = id;
    }
    // Methods:
    public double getRadius() {
        return this.radius;
    }
    public Vec2D getDirToObject() {
        
    }
    public void update() {
        
    }
    public Boolean collisionWith() {
        
    }
    public String toString(){
        
    }
    
}
