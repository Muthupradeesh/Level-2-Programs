package rajeesan;

import java.util.Scanner;

public class Encoding {
	public static void main(String[] args) {
		Encoding obj = new Encoding();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String result = "";
		String str = scanner.next();
		for (int i = 0; i < str.length(); i++) {
			char character = str.charAt(i);
			String hex = obj.toHex(character);
			result += hex;
		}
		System.out.println(result);
	}
	public String toHex(char c) {
		int temp = (int) c;
		String hex = "";
		while (temp > 0) {
			int remainder = temp % 16;
			char hexDigit;
			if(remainder<10)
			hexDigit=(char)('0'+remainder);
			else
				hexDigit=(char)('A'+remainder-10);
			hex = hexDigit + hex;
			temp /= 16;
		}
		return hex;
	}

}
