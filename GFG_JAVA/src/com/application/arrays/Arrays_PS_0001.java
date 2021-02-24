package com.application.arrays;

import java.util.Arrays;

public class Arrays_PS_0001 {
	
	// https://practice.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/0/?track=amazon-arrays&batchId=192#
	
	// Given an unsorted array arr[] of size N, rotate it by D elements in the 
	// counter-clockwise direction.
	// Example 1:
	// Input:
	// N = 5, D = 2
	// arr[] = {1,2,3,4,5}
	// Output: 3 4 5 1 2
	// Explanation: 1 2 3 4 5  when rotated
	// by 2 elements, it becomes 3 4 5 1 2.

	int a[] = {1,2,3,4,5};
	int d=2;
	int n=5;
	public void run() {
		//	1 2 3 4 5
		// [1 2] [3 4 5]
		// [2 1] [5 4 3]
		// [ [2 1] [5 4 3] ]
		// 3 4 5 1 2
		int nd=d%n;
        int j=nd;
        for(int i=0;i<nd/2;i++){
            int temp=a[i];
            a[i]=a[j-1];
            a[j-1]=temp;
            j--;
        }
        j=n;
        for(int i=nd;i<(n+nd-1)/2;i++){
            int temp=a[i];
            a[i]=a[j-1];
            a[j-1]=temp;
            j--;
        }
        j=n;
        for(int i=0;i<n/2;i++){
            int temp=a[i];
            a[i]=a[j-1];
            a[j-1]=temp;
            j--;
        }
	}
	public void printArr(int[] arr) {
		for(int i:arr) {
			System.out.println(i);
		}
		System.out.println("#########################");
	}
}
