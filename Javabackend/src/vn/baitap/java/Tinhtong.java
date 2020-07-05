package vn.baitap.java;

import java.util.Scanner;

public class Tinhtong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
	    do { 
	     //nhap gia tri number tu ban phim
	     System.out.println("nhap so:");
	     number = sc.nextInt();
	      if(number <= 0) {
	         System.out.println("So nhap vao phai lon hon 0. Moi ban nhap lai: ");
	         number = sc.nextInt(); }
	         sum += number; 
	       if(number > 100)
	    	   break;
	    }while(number < 100);
	     //in ra ket qua
	     System.out.println("tong:" + sum );
		 }

	  }
		
		

		