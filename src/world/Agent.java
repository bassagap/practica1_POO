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
    public Agent (Vec2D pos, Vec2D obj, double radius, int id){
        this.pos = pos;
        this.obj = obj;
        this.radius = radius;
        this.id = id;
        this.speed = new Vec2D (1,1);
        this.weight = this.radius * 2;
        this.maxSpeed = new Vec2D (2,2);
        this.dir = this.getDirToObj();

    }
    // Methods:
    public double getRadius() {
        return this.radius;
    }
    public Vec2D getPos(){
        return this.pos;
    }
    public Vec2D getDir(){
        return this.dir;
    }
    public Vec2D getObj(){
        return this.obj;
    }
    public void setPos (Vec2D vector){
        this.pos=vector;
    }
    public void setObj (Vec2D vector){
        this.obj=vector;
    }
    public void setDir (Vec2D vector){
        this.dir=vector;
    }
    public Vec2D getDirToObj(){
        Vec2D vector = this.obj;
        vector.minus(this.pos);
        vector.normalize();
        return vector; 
    }
    public Boolean objReached() {
        return (obj.dist(pos) < 10);
    }
    public void update() {    
        this.pos.setX(this.pos.getX() + this.speed.getX()*this.dir.getX());
        this.pos.setY(this.pos.getY() + this.speed.getY()*this.dir.getY());
    }
    public Boolean collisionWith(Agent a) {
        Boolean collided = false;
        double sum = this.radius + a.getRadius();  
        if(this.pos.dist(a.pos) <= sum){
            collided = true;
        }    
        return collided;
    }
    public String toString(){
        return "Agent { id: " + id + ", position: {" + pos.getX() + "," + pos.getY() + "}, objective: {" + obj.getX() + "," + obj.getY() + "}";   
    }
}
