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
public class ResizableCircle extends Circle implements Resizable{

    public ResizableCircle(double radius) {
        super(radius);
    }
    public ResizableCircle() {
        super(1.0);
    }
    @Override
    public void resize(int percent) {
        this.radius += ((100 + percent) / 100);
    }
    
}
