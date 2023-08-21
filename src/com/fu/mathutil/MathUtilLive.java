/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author Tuan Dat
 */
public class MathUtilLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long result = MathUtil.getFactorial(5);
        System.out.println("5! = 120; actual: "+result);
        System.out.println("6! = 720; actual: "+MathUtil.getFactorial(6));
        System.out.println("0! = 1; actual: "+MathUtil.getFactorial(0));
        
        // them code sau lan dau tien code len server  - code len server chieu nay
        System.out.println("1! = 1; actual: "+MathUtil.getFactorial(1));
        System.out.println("3! = 6; actual: "+MathUtil.getFactorial(3));
    }
    
}
