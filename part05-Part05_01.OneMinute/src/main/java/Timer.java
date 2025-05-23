/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eduardo
 */
public class Timer {

    //private int value;
    private int seconds;
    private int hundreth;

    public Timer() {
        this.seconds = 0;
        this.hundreth = 0;

    }

    public void advance() {
        this.hundreth += 1;

        if (this.hundreth >= 100) {
            this.seconds += 1;
            this.hundreth = 0;
        } else if (this.seconds >= 100) {
            this.seconds = 0;
        }

    }

    public String toString() {
        if (this.hundreth < 10 && this.seconds < 10) {
            return "0" + this.seconds + ":0" + this.hundreth;
        } else if (this.seconds < 10 && this.hundreth > 10) {
            return "0" + this.seconds + ":" + this.hundreth;
        }

        return this.seconds + ":" + this.hundreth;
    }

}
