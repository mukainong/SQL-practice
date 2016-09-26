/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.math.*;

/**
 *
 * @author mukainong
 */
public class Spirograph {
    public static void main(String[] args) {
        double R = 5.0, r = 1.0, a = 4.0;
    
        for(double t = 0.0; t < 10*Math.PI; t+=0.01) {
            double x = (R+r)*Math.cos((r/R)*t) - a*Math.cos((1+r/R)*t);
            double y = (R+r)*Math.sin((r/R)*t) - a*Math.sin((1+r/R)*t);
            System.out.println((-118.289+x)+","+(34.021+y));
        }
    }
}
