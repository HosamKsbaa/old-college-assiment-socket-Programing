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
public class MyApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        myserv ser=new myserv();
        ser.start();
         
         myclint cli2 =new myclint("clint 2");
         cli2.start();
         
    }
    
}
