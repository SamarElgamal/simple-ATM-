
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rotanan
 */
public class Client {
    public int number=0;
    String Creditnum;
    String PIN; 
    double Balance; 
    String[] History= new String[5];

public boolean Login (String Creditnum,String PIN){   
    if (this.Creditnum.equals(Creditnum)&&this.PIN.equals(PIN))
    {
        return true;
}  
    return false;
}
 Client(String x,String y, double z){
    Creditnum=x;
    PIN=y;
    Balance=z;
}
public void Deposit (String z){
    double x=Double.parseDouble(z);
    Balance=Balance+x;
    int i;
    for(i=4;i>0;i--){
        Variables.History[i]=Variables.History[i-1];
    }
    Variables.History[0]="You have deposited"+x+"Your balance is now $"+Balance;
}
public boolean withdraw(String y){
    double x=Double.parseDouble(y);
    if (x<Balance){
        Balance=Balance-x;
        int i;
        for(i=4;i>0;i--){
            Variables.History[i]=Variables.History[i-1];
        }
            Variables.History[0]="you have withdrawn"+x+"Your balance is now $"+Balance; 
            
            return true;
    }
    JOptionPane.showMessageDialog(null, "Insufficient funds");
    return false;
}
public String tellBalance(){
    return Double.toString(Balance);
}

public String next(){          
    
    if (Variables.i==0){
        
       return("Following transactions cannot be displayed");
    //System.out.println("Error");
}
    
    System.out.println(History[Variables.i]);
    
    return Variables.History[Variables.i--];
    }
public String previous(){
    
    if(Variables.i==4){
       // System.out.println("Error");
        return("Previous transactions cannot be displayed");
    }
    
    System.out.println(History[Variables.i]);
    return Variables.History[Variables.i++];         
}     
}
