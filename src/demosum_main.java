/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poy_lab7;

/**
 *
 * @author dinh thang
 */
public class demosum_main {
    public static void main(String[] args) {
        strainsport_enumdemo tp;
        tp = strainsport_enumdemo.dep;
        System.out.println(""+tp);
        switch(tp)
        {
            case Card:
                System.out.println("đây là cái oto chạy với tốc độ");
                break;
                case  thang:
                    System.out.println("quá là đẹp trai");
                    break;
                case dep:
                    System.out.println("ok");
                    break;
        }
    }
}
