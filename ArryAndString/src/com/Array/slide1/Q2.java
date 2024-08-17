package com.Array.slide1;

//Q2. Write a Java program to find the maximum and minimum value
//of an array without sorting.
public class Q2 {
public static void main(String[] args) {
int []arr = {12,21,32,85,1,2};
int max = 1;
for(int i=0; i<arr.length;i++)
{
if(max<arr[i])
{
	max = arr[i];
	
}
}
System.out.println("The_MAX__"+max);

}
}
