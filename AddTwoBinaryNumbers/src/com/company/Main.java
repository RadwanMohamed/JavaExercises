package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Long bin1,bin2;
	int i =0, reminder =0;
	int []sum = new int [20];
	Scanner in = new Scanner(System.in);
	System.out.println("pleas enter your first number");
	bin1 = in.nextLong();
	System.out.println("pleas enter your second number");
	bin2 = in.nextLong();
	while(bin1 !=0 && bin2 !=0){
	    sum[i++] = (int)((bin1%10 +bin2%10+reminder)%2);
	    reminder = (int)((bin1%10+bin2%10+reminder)/2);
	    bin1 /=10;
	    bin2 /=10;
    }
    if (reminder !=0){
	    sum[i++]=reminder;
    }
    i--;
    System.out.println("sum of two binary : ");
	while (i >=0){
	    System.out.print(sum[i--]);
    }

    }
}
