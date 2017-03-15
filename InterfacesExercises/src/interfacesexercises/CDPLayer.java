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
public class CDPLayer implements Player{

    public CDPLayer() {
    }

    @Override
    public void play() {
        System.out.println("The CDPlayer is playing");
    }

    @Override
    public void stop() {
         System.out.println("The CDPlayer stopped.");
    }

    @Override
    public void pause() {
       System.out.println("The CDPlayer is paused");
    }

    @Override
    public void reverse() {
        System.out.println("The CDPlayer is going on reverse.");
    }
    
}
