package com.Array.slide1;
//Q1. Write a Java program to test if an array contains a specific value.
public class Q1 {
	public static void main(String[] args) {
		
    char [] ch = {'A','C','@','V'};
    for (int i = 0; i < ch.length; i++) {
        if(ch[i]=='@')
        {
        	System.out.println("found "+ch[i]+"At position "+i);
        	break;
        }
	}
		
	}

}
