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
public class Circle implements GeometricObject{
    protected double radius = 1.0;

    public Circle(double radius) {
        this.radius = radius; 
    }
    
    @Override
    public double getPerimeter() {
        return Math.PI*2*this.radius;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius, 2);
    }
    
}
