/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fflow
 */
public class Gauge {
    private int value;
    
    public Gauge() {
    
    }
    
    public void increase() {
        if(this.value < 5) {
            value++;
        }
    }
    public void decrease() {
        if(this.value > 0) {
            value--;
        }
    }
    public int value() {
        return value;
    }
    public boolean full() {
        if (value == 5) {
            return true;
        } else {
            return false;
        }
    }
}
