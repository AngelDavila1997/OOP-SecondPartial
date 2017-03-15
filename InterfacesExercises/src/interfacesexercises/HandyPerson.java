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
public class HandyPerson extends Human implements Plumber, Electrician{

    public HandyPerson(String name) {
        super(name);
    }

    @Override
    public String unplugDrain() {
        return "Did the activity";
    }

    @Override
    public String changeBulb() {
        return "Did the activity";
    }

    @Override
    public String toString() {
        return "HandyPerson{" + name + '}';
    }
    
    
}
