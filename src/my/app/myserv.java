/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.app;

/**
 *
 * @author User
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
public class myserv extends Thread{
    @Override
    public void run(){
       
    
        
         try {
             ServerSocket s2=new ServerSocket(1234);
             while(true){
                Socket s1=s2.accept();
                System.out.println("A new client is connected : " + s2);
                
                 DataInputStream cin=new DataInputStream(s1.getInputStream());
                 DataOutputStream cout=new DataOutputStream(s1.getOutputStream());
                 System.out.println("Assigning new thread for this client"); 
                 
                 clint_handeler t1 =new clint_handeler(s1,cin,cout);
                 t1.start();
                
             }
             
         } catch (IOException ex) {
             Logger.getLogger(myserv.class.getName()).log(Level.SEVERE, null, ex);
         }
            
            
            
            
            
            
            
            
            
            
        
    }
    
}
