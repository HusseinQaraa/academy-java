package com.bptn.course.calculator;
import java.util.*;

public class Calculator {
	void method() {
        try {
          try {
            int[] arr = {1, 2, 3, 4};
            System.out.println(arr[0]);
            System.out.println(arr[6]);
          }  catch(ArithmeticException e) {
                System.out.println("ArithmeticException occurred");
          }  
        }      catch(ArrayIndexOutOfBoundsException ae){
              System.out.println("ArrayIndexOutOfBoundsException is handled in the outer catch block");
        }
  // main() method to run the program
        public static void main(String args[]) {
        Main nestedTryBlockSolutionObject = new Main();
        nestedTryBlockSolutionObject.method();
    }
  
          
      }	
}
