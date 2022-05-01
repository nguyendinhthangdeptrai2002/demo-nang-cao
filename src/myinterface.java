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
public class myinterface  implements   Runnable{
    
    @Override
   public void  run()
    {
        for (int i=10;i>0;--i)
        {
            System.out.println("my thread "+i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
        System.out.println("ve 0");
    }
}
