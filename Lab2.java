import javax.swing.*;
import java.text.*;
public class Lab2 {
  /** 
   * Derek Cacciotti
   * CISS 110
   * Coding Assignment 1: 3 Numbers
   **/
    
    public static void main(String[] args) { 
        // strings
        String snum1, snum2,snum3;
        //floats
        float fnum1,fnum2,fnum3;
        float fresult;
        
        // decimal formatter for 2 places 
        DecimalFormat df = new DecimalFormat("#,###,##0.00");
        
        // show input dialog box snum1
        snum1 = JOptionPane.showInputDialog("Please Enter Number 1");
        // parsing the string to float
       fnum1 = Float.parseFloat(snum1);
       
       // dialog box for snum2
       snum2 = JOptionPane.showInputDialog("Please Enter Number 2 ");
       // parsing 
       fnum2 = Float.parseFloat(snum2);
       // do while loop to prompt the user again if fnum3 is 0
       do
       {
           snum3 = JOptionPane.showInputDialog("Please Enter  Number 3");
           fnum3 = Float.parseFloat(snum3);
       } // end of loop 
       while (fnum3 == 0);
       // displaying the numbers entered
       JOptionPane.showMessageDialog(null,"Your numbers are: " + fnum1 + "\t" + fnum2 + "\t" + fnum3 + "\t"); 
       
       
       // results 
       fresult= fnum1 + fnum2 % fnum3; 
       // displaying results to the user
      JOptionPane.showMessageDialog(null, df.format(fresult)); 
      
    }
}