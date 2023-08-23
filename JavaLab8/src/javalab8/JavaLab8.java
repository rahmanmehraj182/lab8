/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javalab8;

/**
 *
 * @author Student
 */
import java.util.*;

class Calculator{
    private int a;
    private int b;
    Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int add(){
        if(a < 0 || b < 0){
            throw new ArithmeticException("Number must be bigger than zero");
        }else
        return this.a + this.b;
    }
    public int subtract(){
        if(a < 0 || b < 0){
            throw new ArithmeticException("Number must be bigger than zero");
        }else
        return this.a - this.b;
    }
     public int multiply(){
        if(a == 0 || b == 0){
            throw new ArithmeticException("Number can't be zero");
        }else
        return this.a * this.b;
    }
     
     public int divide(){
        if(a == 0 || b == 0){
            throw new ArithmeticException("Number can't be zero" );
        }else
        return this.a / this.b;
    }
}
public class JavaLab8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String a; String b;
        int aa ,  bb;
        Scanner inp = new Scanner(System.in);
        
       
        try{
             a= inp.next();
             b = inp.next();
             aa = Integer.parseInt(a);
             bb = Integer.parseInt(b);
             Calculator o = new Calculator(aa, bb); 
             Calculator o2 = new Calculator(aa, bb); 
             Calculator o3 = new Calculator(aa, bb); 
             Calculator o4 = new Calculator(aa, bb); 
            try{
                System.out.println(o.multiply());
            }catch(ArithmeticException e){
                System.out.println(e);
            }
            
            try{
                System.out.println(o.add());
            }catch(ArithmeticException e){
                System.out.println(e);
            }
            
            try{
                System.out.println(o.divide());
            }catch(ArithmeticException e){
                System.out.println(e);
            }
            
            try{
                System.out.println(o.subtract());
            }catch(ArithmeticException e){
                System.out.println(e);
            }
            
            
        }catch(NumberFormatException e){
            System.out.println(e  + "Input should be number");
        }
        
    }
    
}
