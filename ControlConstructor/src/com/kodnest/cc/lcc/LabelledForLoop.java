package com.kodnest.cc.lcc;

public class LabelledForLoop {

	public static void main(String[] args) {
		int i=1;
		rajini:while(i<=5)
		{
			int j=1;
			tamanna:while(j<=5)
			{
				System.out.println("* ");
				j++;
				break rajini;
			}
			System.out.println();
			i++;
		}
	}

}
