package middle.lesson12;

import java.util.Arrays;

public class MultiArray {

	public static void main(String[] args) {
		int level = 10;
		int[][] pascal = pascalTriangle(level);
		
		System.out.println(Arrays.deepToString(pascal));
	}

	private static int[][] pascalTriangle(int level) {
		int [][] pascal = new int [level][];
		for (int i = 0; i < pascal.length; i++) {
			pascal[i] = new int[i+1];
			pascal[i][0] = 1;
			pascal[i][i]= 1;
			for (int j = 1; j < i; j++) {
				pascal[i][j] = pascal[i - 1][j - 1] + pascal[i-1][j];
			}
		}
		return pascal;
	}

}
