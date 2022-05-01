/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.lab6;

/**
 *
 * @author dinh thang
 */
public class demointerface {
    public static void main(String[] args) {
        
        myinterface myinterface = new myinterface();
        Thread t1= new Thread(myinterface);
        t1.start();
        
    }
}
