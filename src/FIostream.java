/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly_lab5;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author dinh thang
 */
public class FIostream {
    public static void main(String[] args) {
        
        String filename ="data.txt";
        
        try {
           FileOutputStream fos = new  FileOutputStream(filename) ;
           int i=100;
           char c='a';
           String s = "hello";
           fos.write(i);
           fos.write(c);
           fos.write(s.getBytes());
            System.out.println("đã ghi xong");
           fos.close();
            
            System.out.println("đọc ghi xong");
            FileInputStream fis = new    FileInputStream(filename);
            System.out.println("i="+fis.read());
             System.out.println("c="+ (char)fis.read());
              System.out.println(" s=" +fis.read());
             int ch;
             while((ch= fis.read())!=-1){
                 System.out.println((char)ch);
             }
                   
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}
