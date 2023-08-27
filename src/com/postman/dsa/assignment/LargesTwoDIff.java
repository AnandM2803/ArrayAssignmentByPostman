package com.postman.dsa.assignment;

import java.util.Scanner;

public class LargesTwoDIff {

	static int large1;
	static int large2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array size");
		int size=sc.nextInt();
		System.out.println("Eeter the array elementrs");
		int[] arr=new int[size];
		for(int a=0;a<arr.length;a++)
		{
			arr[a]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int k=0;k<arr.length;k++)
		{
			large1=arr[arr.length-1];
			large2=arr[arr.length-2];
		}
		System.out.println(large1-large2);
	}

}
