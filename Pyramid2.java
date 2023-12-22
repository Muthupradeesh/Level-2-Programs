package practice;

import java.util.Scanner;

public class Pyramid2 {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the String");
			String str=scanner.nextLine();
			String left="",right="";
			boolean flag=true;
			for (int i = 0; i < str.length(); i++) {
				if(i>0&&Character.isUpperCase(str.charAt(i))){
					flag=false;
				}
				if(flag) {
					left+=str.charAt(i);
				}else {
					right+=str.charAt(i);
				}
			}
			int count=Math.max(left.length(), right.length());
			for(int i=0;i<count;i++) {
			String word1="",word2="";
			if(i<left.length()) {
				word1+=left.substring(0,i+1);
			}else {
				word1=left;
			}
			if(i<right.length()) {
				word2+=right.substring(0,i+1);
			}else {
				word2=right;
			}
			word1=word1.toUpperCase();
			word2=word2.toUpperCase();
			System.out.println( word1+word2);
	}
	}
}