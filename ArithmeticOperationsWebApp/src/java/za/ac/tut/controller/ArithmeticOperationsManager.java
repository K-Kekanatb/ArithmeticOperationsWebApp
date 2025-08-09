/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.controller;

/**
 *
 * @author khuts
 */
public class ArithmeticOperationsManager implements ArithmeticOperationsInterface {

    @Override
    public int add(int num1, int num2) throws NumberException {
       
       if(isValid(num1, num2)){
            return (num1 + num2);
       }else {
           throw new NumberException("The numbers must be positive [" + num1 + "," + num2 + "]");
       }
        
        
    }

    @Override
    public int substract(int num1, int num2) throws NumberException {
       
       if(isValid(num1, num2)){
            return (num1 - num2);
       }else {
           throw new NumberException("The numbers must be positive [" + num1 + "," + num2 + "]");
       }
    }

    @Override
    public int multiply(int num1, int num2) throws NumberException {
       
       if(isValid(num1, num2)){
            return (num1 * num2);
       }else {
           throw new NumberException("The numbers must be positive [" + num1 + "," + num2 + "]");
       }
    }

    @Override
    public int divide(int num1, int num2) throws NumberException {
        
       if(isValid(num1, num2)){
            return (num1 / num2);
       }else {
           throw new NumberException("The numbers must be positive [" + num1 + "," + num2 + "]");
       }
    }
    
    public boolean isValid(int num1, int num2) {
        boolean valid = false;
        
        if(num1 >= 0 && num2 >= 0) {
            valid = true;
        }
        
        return valid;
    }
    
}
