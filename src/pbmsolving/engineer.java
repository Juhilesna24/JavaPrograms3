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
public class engineer {
    public static void main(String args[])
    {
        char a[][] = {
            {'E'},
            {'E','D'},
            {'E','D','D','E'},
            {'E','D','D','E','D','E','E','D'}
        };
        int l,p,i,j;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter level and position");
        l = in.nextInt();
        p = in.nextInt();
        
        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a[i].length;j++)
            {
                if((i == l-1)&&(j==p-1))
                {
                    if(a[i][j] == 'E')
                    {
                        System.out.println("Engineer");
                    }
                    else{
                        System.out.println("Doctor");
                    }
                }
            }
        }
    }
    
}
