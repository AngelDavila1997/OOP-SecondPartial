/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesexercises;

/**
 *
 * @author PC
 */
public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int radius, int x, int y, int xSpeed, int ySpeed) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MovableCircle{" + "radius=" + radius + ", center=" + center + '}';
    }

    @Override
    public void moveUp() {
       this.center.y += center.ySpeed;
    }

    @Override
    public void moveDown() {
       this.center.y -= center.ySpeed;
    }

    @Override
    public void moveLeft() {
        this.center.x -= center.xSpeed;
    }

    @Override
    public void moveRight() {
        this.center.x += center.xSpeed;
    }

            
}
