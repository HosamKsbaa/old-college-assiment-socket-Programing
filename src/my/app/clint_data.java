/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.app;

import java.io.DataInputStream;
import java.io.DataOutputStream;

/**
 *
 * @author User
 */
public class clint_data {
    String username;
    Boolean states_on_of;
    DataInputStream cin;
    DataOutputStream cout;
    
    public clint_data(String username,Boolean states_on_of, DataInputStream cin,DataOutputStream cout)
    {
    this.username=username;
    this.states_on_of=states_on_of;
    this.cin=cin;
    this.cout=cout;
    }
    
    
}
