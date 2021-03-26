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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class clint_handeler extends Thread {
    
     DataInputStream dis; 
     DataOutputStream dos; 
     Socket s;
    public clint_handeler(Socket s, DataInputStream dis, DataOutputStream dos)  
    { 
        this.s = s; 
        this.dis = dis; 
        this.dos = dos; 
    }
    @Override
    public void run()
    {
        while(true){
            try {
                System.out.println("server says"+"   "+dis.readUTF());
            } catch (IOException ex) {
                Logger.getLogger(clint_handeler.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
