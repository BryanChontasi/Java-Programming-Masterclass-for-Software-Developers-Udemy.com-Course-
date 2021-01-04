package com.bryanchontasi;

import java.util.Scanner;

/**
 * @author Bryan Chontasi
 * @created 04/01/2021 -  18:50
 * @project ScopeChallenge
 */
public class X {
    private int x;

    public X(Scanner x) {
        System.out.println("Please enter a number: ");
        this.x = x.nextInt();
    }
    public void x(){
        for (int x = 1; x<13; x++){
            System.out.println(x + " times " + this.x + " equals " + x * this.x);
        }
    }
}
