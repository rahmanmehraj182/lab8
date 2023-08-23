/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javalab8;

import java.util.*;

/**
 *
 * @author Student
 */
public class Problem3 {
    public static void main(String[] args){
        int[] arr = new int[100];
        
        for(int i = 0; i < 100; ++i){
            int a =(int)(Math.random() * 100);
            arr[i] = a;
        }
        Scanner inp = new Scanner(System.in);
        
        int ind= inp.nextInt();
        try{
            System.out.println(arr[ind]);
        }catch(ArrayIndexOutOfBoundsException  e){
            System.out.println(e);
            
        }
    }
}
