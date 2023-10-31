package levvel2;

import java.util.Scanner;

public class matrixmul {
	public static int[][] matrix()
	{
		int row,col; 
		System.out.print("Enter the no of Row");
		Scanner in=new Scanner(System.in);
		row=in.nextInt();
		System.out.print("Enter the no of Column");
		col=in.nextInt();
		int[][] arr=new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j]=in.nextInt();
			}
		}
		return arr;	
	}
	public static  int[][] multiply(int[][] arr1,int[][] arr2)
	{
		int[][] res=new int[arr1.length][arr2[0].length];
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				for(int k=0;k<arr2.length;k++)
				{
				res[i][j]+=arr1[i][k]*arr2[k][j];
				}
			}
		}
		return res;
	}
	public static void display(int[][] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		int[][] matrix1=matrix();
		int[][] matrix2=matrix();
		if(matrix1[0].length==matrix2.length)
		{
			display(multiply(matrix1,matrix2));
		}
		else
			System.out.println("Invalid input");
	}
	

}
