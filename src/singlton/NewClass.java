/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlton;

/**
 *
 * @author zero1
 */
public class NewClass {
  public static void main(String args[]) 
    { 
        Singlton x = Singlton.getInstance(); 
  
        Singlton y = Singlton.getInstance(); 
  
        y.setTitle("rame");
  
       
  
        System.out.println("String from x is " + x.getTitle()); 
        System.out.println("String from y is " + y.getTitle()); 
  
        
    }    
}
