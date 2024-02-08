package rajeesan;

import java.util.Arrays;
import java.util.Scanner;

public class CommonPrefix {
	public static void main(String[] args)
	{
		CommonPrefix obj=new CommonPrefix();
		System.out.println("Enter the no of words : ");
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		String[] arr=new String[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scanner.next();
		}
		System.out.println(obj.longestCommonPrefix(arr));
	}
	public String longestCommonPrefix(String[] arr) {
        Arrays.sort(arr);
        String s1 = arr[0];
        String s2 = arr[arr.length - 1];
        int i = 0;
        while (i < s1.length() && i< s2.length()) {
            if (s1.charAt(i) == s2.charAt(i)) {
                i++;
            } else {
                break;
            }
        }
        return s1.substring(0, i);
    }

}
