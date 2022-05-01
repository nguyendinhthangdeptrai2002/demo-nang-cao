/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly_lab5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author dinh thang
 */
public class objoistream {
    public static void main(String[] args) {
        String filename ="stock.dat";
        try {
            FileOutputStream fos= new  FileOutputStream( filename);
            ObjectOutputStream oos =new ObjectOutputStream(fos);
            stock [] stock ={
                new stock(101,"nokia",230.50,20),
                new stock(102,"sámung",150.50,30),
                new stock(103,"motorola",30.50,10),
                new stock(104,"iphone",20.50,2)
            };
            oos.writeObject(stock);
            System.out.println("đã ghi xong");
            oos.close();
            
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new  ObjectInputStream(fis);
            stock[] sts = (stock[]) ois.readObject();
            
            for (stock st :sts){
                System.out.println(st);
                
            }
            System.out.println("đã đọc xong file.");
            ois.close();fis.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
