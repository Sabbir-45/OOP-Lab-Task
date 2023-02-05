//5. Take four integer values named A, B, C and D. Solve the following equation and print the result. [A=5, B=6, C=7, D=8]
//a) (A * B - C * D)
//b) 2A - B + 3D
//c) A2 + B2 - C2 + D2
//d) A3 + B - C2

package com.mycompany.labtask1;

public class SloveEquation {
     public static void main(String[] args) {
      
        int A=5;
        int B=6;
        int C=7;
        int D=8;
        
        int result1= (A * B - C * D);
        int result2= (2*A - B + 3*D);
        int result3= (A*2 + B*2 - C*2 + D*2);
        int result4= (A*3 + B - C*2);
        
        System.out.println("Result 1:" +result1);
        System.out.println("Result 2:" +result2);
        System.out.println("Result 3:" +result3);
        System.out.println("Result 4:" +result4);
        
    }
}

