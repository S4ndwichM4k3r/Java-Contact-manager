/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg12;

/**
 *
 * @author jaked
 */

import javax.swing.*;
public class Lab12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] names = new String[30];
        names[0] = "Gina"; names[1] = "Marcia";
        names[2] = "Rita"; names[3] = "Jennifer";
        names[4] = "Fred"; names[5] = "Neil";
        names[6] = "Judy"; names[7] = "Arlene";
        names[8] = "LaWanda"; names[9] = "Deepak";
        //Strings for the names
        
        String numbers[] = new String[30];
        numbers[0] = "2122256642";
        numbers[1] = "1122225642";
        numbers[3] = "1615543789";
        numbers[4] = "0254587691";
        numbers[5] = "1111112222";
        numbers[6] = "6666666666";
        numbers[7] = "7777777777";
        numbers[8] = "8888888888";
        numbers[9] = "9999999999";
        //Corresponding numbers for the names
        
        String entryName, entryPhone;
        int x;
        boolean isFound = false;
        int highest = 10;
        entryName = JOptionPane.showInputDialog(null, 
        "Enter name to look up. Type 'quit' to quit.");
        //Just setting up for the main part of the code including getting that initial dialog box.
        
        while(highest < 30 && !entryName.equals("quit")){
            for(x = 0; x < highest; ++x)
                if(entryName.equals(names[x])){
                    isFound = true;
                    JOptionPane.showMessageDialog(null,
                        names[x] + "'s phone number is " + numbers[x]);
                    x = highest;
                }
                
                if(!isFound){
                    entryPhone=JOptionPane.showInputDialog(null,
                        "Enter phone number for " + entryName);
                    names[highest] = entryName;
                    numbers[highest] = entryPhone;
                    ++highest;
                }
                /*All this above me is part of the loop. it'll look for numbers that we have a
                 *name attatched to it. If it does not find a name, it shall ask for the number
                 *of the name before promptly adding it to the array.
                */
                entryName = JOptionPane.showInputDialog(null,
                        "Enter name to look up. Type 'quit' to quit.");
                isFound = false;
        }
    }
    
}
