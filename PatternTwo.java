package com.tutorial.five;

public class PatternTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalHeight = 4;
		for(int i=0; i<totalHeight; i++)
		{
			
			for(int j=0; j<totalHeight; j++)
			{
					if(j < i)
					{
						System.out.print(" ");
					}
					else
					{
						System.out.print("*");
					}
			}
			System.out.println();
		}
	}

}
