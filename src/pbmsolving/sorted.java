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
public class sorted {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,i,count=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n");
        n = in.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array");
        for(i=0;i<n;i++)
        {
            a[i] = in.nextInt();
        }
        for(i=1;i<n;i++)
        {
            if(a[i-1]<a[i])
            {
               
            }else{
                count=count+3;
            }
        }
        System.out.println(count);
    }
    
}
