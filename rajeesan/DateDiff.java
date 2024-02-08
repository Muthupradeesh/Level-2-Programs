package rajeesan;

import java.util.ArrayList;
import java.util.Scanner;

public class DateDiff {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter date(in dd-mm-yyyy format) : ");
		String d1 = scanner.next();
		String d2 = scanner.next();
		DateDiff obj = new DateDiff();
		int date1 = 0, date2 = 0;
		date1 = obj.findDays(d1);
		date2 = obj.findDays(d2);
		System.out.println("Result : " + (date2 - date1));

	}

	public int findDays(String str) {
		int[] month = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		ArrayList<Integer> arr = new ArrayList<Integer>();
		String temp = "";
		int res = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '-') {
				arr.add(Integer.parseInt(temp));
				temp = "";
			} else {
				temp += "" + str.charAt(i);
			}
		}
		arr.add(Integer.parseInt(temp));
		res = arr.get(2) * 365 + arr.get(0) + (arr.get(2) / 4);
		for (int i = 0; i < arr.get(1); i++) {
			if (i == 1 && (arr.get(2) % 4 == 0 && arr.get(2) % 100 != 0) || (arr.get(2) % 400 == 0)) {
				res += month[i] + 1;
			} else
				res += month[i];
		}
		return res;
	}

}
