/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.app;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class myclint extends Thread{
    String s;
    String name;
    
    public myclint(String name1)
    {
        name=name1;
    }
    @Override
    public  void run() {
       
    Scanner cin = new Scanner(System.in); 
        try {
            Socket s1=new Socket("localhost",1234 );
            
            DataInputStream dis = new DataInputStream(s1.getInputStream());
            DataOutputStream dos = new DataOutputStream(s1.getOutputStream());
            while(true){
                System.out.println("enter you massage" +name);
                s=cin.nextLine();
                dos.writeUTF(s);
                
                /*try {
                    Thread.sleep(10);
                } catch (InterruptedException ex) {Logger.getLogger(myclint.class.getName()).log(Level.SEVERE, null, ex);}*/
            }
        } catch (IOException ex) {
            Logger.getLogger(myclint.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
