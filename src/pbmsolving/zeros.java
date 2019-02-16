/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbmsolving;

import java.util.Scanner;

/**
 *
 * @author my pc
 */
public class zeros {
    public static void main(String args[])
    {
        String s;
        int i,count=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 0s and 1s in String");
        s = in.next();
        for(i=1;i<s.length();i++)
        {
            if(s.charAt(i-1) == s.charAt(i))
            {
                count++;
            }
        }
        System.out.println(count);
    }
    
}
