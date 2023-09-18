/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.fpoly.mathutil;

/**
 *
 * @author Admin
 */
public class MathUtilLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long result = MathUtil.getFactorial(5);
        System.out.println("5! = 120 ; actual: "+result);
        System.out.println("0! = 1 ; actual: "+MathUtil.getFactorial(0));

       // MathUtil.getFactorial(-5); //Ném ngoại lệ thật rồi , ai biểu cà chớn làm chi
        
        //Kĩ thuật kiểm thử phần mềm : ước lượng gái trị trả về của hàm là gì 
        // expeceted valua: 5! = 120 
        //
    }
    
}
