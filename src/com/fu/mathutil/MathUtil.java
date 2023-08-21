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
public class MathUtil {

    //n! = 1.2.3.4.5.6...n
    //Quy ước : 0! 1!.....
    // không có giai thừ chứa số âm
    //20! là vừa khớp kiểu long, kiểu long tối đa 18 con số 0
    //21! lố kiểu long
    // nếu đưa vào âm, 21 giai thừa thì không làm
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) 
            throw new IllegalArgumentException("Invalid argument. n must be between 0..20");
        
        // ham dung lien khong can return

        //n da nam trong 0->20
        if (n == 0 || n == 1) 
            return 1;
        
        long product =1;
        for (int i = 2; i <=n; i++) {
            product *=i;
        }
        return product;

    }
}
