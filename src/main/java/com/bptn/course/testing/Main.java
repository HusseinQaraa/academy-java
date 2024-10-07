package com.bptn.course.testing;

public class Main {
    public static void main(String[] args) {
    	
    	int[] arr = {1, 2, 3 ,4};
    	
    	try {
    		System.out.println(arr[7]);
    		
    	} catch(Exception e) {
    		System.out.println("Error : " + e + " was thrown trying to print the code in the try block!");
    	
    	} finally {
    		System.out.println("The try catch block is finished!");
    	}
    	
    	
    
    	}
    }
