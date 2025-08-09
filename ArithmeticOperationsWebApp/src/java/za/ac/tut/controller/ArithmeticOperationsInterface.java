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
public interface ArithmeticOperationsInterface {
    public int add(int num1, int num2) throws NumberException;
    public int substract(int num1, int num2) throws NumberException;
    public int multiply(int num1, int num2) throws NumberException;
    public int divide(int num1, int num2) throws NumberException;
}
