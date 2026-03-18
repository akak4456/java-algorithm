package main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	private static int T;
	private static int k,n;
	private static int[][] arr;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());
		T = Integer.parseInt(br.readLine());
		for(int testCase = 0; testCase < T; testCase++) {
			k = Integer.parseInt(br.readLine());
			n = Integer.parseInt(br.readLine());
			arr = new int[k + 1][n+1];
			for(int i=1;i<=n;i++) {
				arr[0][i] = i;
			}
			for(int i=1;i<=k;i++) {
				for(int j=1;j<=n;j++) {
					int sum = 0;
					for(int k=1;k<=j;k++) {
						sum += arr[i-1][k];
					}
					arr[i][j] = sum;
				}
			}
			System.out.println(arr[k][n]);
		}
	}
}
