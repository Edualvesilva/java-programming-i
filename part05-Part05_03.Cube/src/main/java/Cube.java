/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eduardo
 */
public class Cube {

    private int length;
    private int volume;

    public Cube(int edgeLength) {
        this.length = edgeLength;
        this.volume = 0;
    }

    public int volume() {
        this.volume = this.length * this.length * this.length;
        return this.volume;
    }
    
    public String toString(){return "The length of the edge is "+this.length+" and the volume "+this.volume()+"";}

}
