/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javalab8;

/**
 *
 * @author Student
 */
class MyException extends Exception{
    MyException(String a){
        super(a);
    }            
}
public class Product {
    public void productCheck(int w) throws MyException{
        if(w < 100){
//            MyException o = new
            throw new MyException("product is invalid");
        }else{
            System.out.println("weight is :" + w);
        }
    }
    public static void main(String[] args){
        Product p = new Product();
        try{
            p.productCheck(50);
        }catch(MyException e){
            System.out.println(e );
        }
    }
}
