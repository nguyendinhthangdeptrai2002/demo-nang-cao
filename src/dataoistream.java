/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly_lab5;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author dinh thang
 */
public class dataoistream {
    public static void main(String[] args) {
        String filename =   "datastream.txt";
        try {
             FileOutputStream fos = new FileOutputStream(filename);
             DataOutputStream dos = new DataOutputStream(fos);
             dos.write(100);
             dos.writeDouble(5.5);
              dos.writeChar('b');
             dos.writeUTF("data output");
             
             System.out.println("đã ghi xong");
             dos.close(); fos.close();
             
             FileInputStream fis = new FileInputStream(filename);
             DataInputStream dis = new DataInputStream(fis);
             
             System.out.println("int="+dis.readInt());
             System.out.println("double ="+dis.readDouble());
             System.out.println("char =" +dis.readChar());
             
             
        } catch (Exception e) {
        }
    }
}
