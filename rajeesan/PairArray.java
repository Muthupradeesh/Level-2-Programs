package rajeesan;

import java.util.Scanner;

public class PairArray {
	public static void main(String[] args) {
		System.out.println("Enter the no of pairs : ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count = 1;
		System.out.println("Enter pairs : ");
		int[][] arr = new int[n][2];
		for (int i = 0; i < n; i++) {
			arr[i][0] = scanner.nextInt();
			arr[i][1] = scanner.nextInt();
		}
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j][1] > arr[j + 1][1]) {
					int[] temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		int currentEnd = arr[0][1];
		for (int i = 1; i < n; i++) {
			if (arr[i][0] > currentEnd) {
				count++;
				currentEnd = arr[i][1];
			}
		}
		System.out.println("Result " + count);
	}

}
