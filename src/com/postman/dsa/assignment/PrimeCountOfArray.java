package com.postman.dsa.assignment;

import java.util.Scanner;

public class PrimeCountOfArray {
	
	    public static boolean isPrime(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        if (num <= 3) {
	            return true;
	        }
	        if (num % 2 == 0 || num % 3 == 0) {
	            return false;
	        }
	        
	        for (int i = 5; i * i <= num; i += 6) {
	            if (num % i == 0 || num % (i + 2) == 0) {
	                return false;
	            }
	        }
	        
	        return true;
	    }
	    
	    public static int countPrimes(int[] arr) {
	        int count = 0;
	        for (int num : arr) {
	            if (isPrime(num)) {
	                count++;
	            }
	        }
	        return count;
	    }
	    
	    public static void main(String[] args) {
	    	
	    	Scanner sc= new Scanner(System.in);
	    	System.out.println("Enter the array size");
	    	int size=sc.nextInt();
	    	int[] arr=new int[size];
	    	System.out.println("Enter the array elements");
	    	for(int i=0;i<arr.length;i++)
	    	{
	    		arr[i]=sc.nextInt();
	    	}


	        int primeCount = countPrimes(arr);
	        System.out.println( primeCount);
	    }
	}



