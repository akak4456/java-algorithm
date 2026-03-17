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
	private static int N, M;
	private static int[] arr;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int minDist = 987654321;
		int minSum = -1;
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(i == j) continue;
				for(int k = 0; k < N; k++) {
					if(i == k || j == k) continue;
					int sum = arr[i] + arr[j] + arr[k];
					if(sum <= M && M - sum < minDist) {
						minDist =Math.abs(sum - M);
						minSum = sum;
					}
				}
			}
		}
		System.out.println(minSum);
	}
}
