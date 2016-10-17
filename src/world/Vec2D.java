package world;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author martisanchez
 */
public class Vec2D {
   private double x; 
   private double y;
   
   public Vec2D(double x_, double y_) { x = x_; y = y_; }
   public void setX( double x_ ) { x = x_;}
   public void setY( double y_ ) { y = y_;}
   public  double getX() { return x;}
   public double getY() { return y;}   
   
   void sum(Vec2D v) { x += v.getX(); y += v.getY(); }
   void minus(Vec2D v) { x -= v.getX(); y -= v.getY(); }
   
   double dist(Vec2D v) { 
       return Math.sqrt((x - v.getX())*(x - v.getX()) + (y - v.getY())*(y - v.getY())); 
   }
   
   void normalize() {
       x = x / Math.sqrt(x*x + y*y);
       y = y / Math.sqrt(x*x + y*y);
   }
   
   
   public void turn( double angle ) {
       double xrot = x*Math.cos(angle) - y*Math.sin(angle);
       y = x*Math.sin(angle) + y*Math.cos(angle);
       x = xrot;
   }

   public double angle( Vec2D v ) {
       	return Math.atan2( x*v.getY() - y*v.getY(), x*v.getX() + y*v.getY() );
   }
   
   void turnTo( Vec2D v ) {
       x += (v.x-x) / 50.0;
       y += (v.y-y) / 50.0;

   }
   
   public String toString() {
       return "(" + x + " " + y + ")";
   }
}
