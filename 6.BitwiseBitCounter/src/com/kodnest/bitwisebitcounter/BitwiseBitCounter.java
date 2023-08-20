package com.kodnest.bitwisebitcounter;

import java.util.Scanner;

public class BitwiseBitCounter {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter an integer:");
		int num=scan.nextInt();
		int count=countSetBits(num);
		System.out.println("Number of set bits:" +count);
		scan.close();
	}
	
	public static int countSetBits(int n)
	{
		int count = 0;
        while (n > 0) {
            count += n & 1;
            n>>=1;
        }
        return count;
	}
        

}