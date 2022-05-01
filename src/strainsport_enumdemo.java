/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poy_lab7;

import javax.smartcardio.Card;


/**
 *
 * @author dinh thang
 */
public enum strainsport_enumdemo {
    Card(60),thang,dep ,trai,THaNG;
    private  int speed;
    private strainsport_enumdemo(int speed){
        this.speed = speed;
    }
    public void setpeed(int speed){
        this.speed=speed;
    }
            
}
