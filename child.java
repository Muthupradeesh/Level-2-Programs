package levvel2;

import java.util.Scanner;

public class child { 
	public static String[][] familyarr()
	{
		System.out.print("enter the no of row in array");
		Scanner in=new Scanner(System.in);	
		int n=in.nextInt(); 
		String[][] arr=new String[n][2];
		for(int i=0;i<n;i++)
		{
		System.out.print("Enter the child name");
		arr[i][0]=in.nextLine();
		in.nextLine();
		System.out.print("Enter the father name");
		arr[i][1]=in.nextLine();
		}
		return arr;
	}
	public static String fathername()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("--------Enter father name -------- ");
		String name;
		name=sc.nextLine();
		return name;
		
	}
	public static int countchild(String[][] arr1,String fname )
	{
		int count=0;
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i][1].equals(fname))
			{
				for(int j=0;j<arr1.length;j++)
				{
					if(arr1[j][1].equals(arr1[i][0]))
					{
						count++;
					}
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args)
	{
	String[][] family=familyarr();
	String father=fathername();
	System.out.print(father+"has"+countchild(family,father)+"grand childrens");
	}
	

}
