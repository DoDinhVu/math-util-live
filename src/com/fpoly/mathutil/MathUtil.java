/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.mathutil;

/**
 *
 * @author Admin
 */
public class MathUtil {

    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument . n musr be between 0..20");
        }

        // Hàm dừng liền , không return.
        if (n == 0 || n == 1) {
            return 1; //  dừng ngay khi n đặc biệt
        }
        // Xuống đến đây n - 2...2- rồi
        // Chơi for hoặc đệ quy - recursion
        // Kĩ thuật nhồi con heo đất
        // i = 2 , i = 3 , i - 4...... nhồi liên tục i vào tích 
        long product = 1; // tích khởi đầu bằng 1 nhồi 2 3 4 5 6
        for (int i = 2; i <= n; i++) {
            product = product * i;
        }// nhân từ 2 đến hết
        return product;

    }

}
