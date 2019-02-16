/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbmsolving;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author my pc
 */
public class employee {
    public static void main(String args[]){
        int n,i;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n");
        n = in.nextInt();
        String ename[] = new String[n];
        int sal[] = new int[n];
        int temp;
        String t;
        
        System.out.println("Enter name and salary");
        for(i=0;i<n;i++)
        {
            ename[i] = in.next();
            sal[i] = in.nextInt();
        }

        Arrays.sort(sal);
        Arrays.sort(ename);
        for(i=0;i<sal.length;i++)
        {
            System.out.println(ename[i]+sal[i]);
        }
        
        
        
    }
}
