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
	private static int N;
	private static int[] arr;
	private static int T, P;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[6];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<6;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		T = Integer.parseInt(st.nextToken());
		P = Integer.parseInt(st.nextToken());
		int sum = 0;
		for(int i=0;i<6;i++) {
			if(arr[i] % T == 0) {
				sum += arr[i] / T;
			} else {
				sum += arr[i] / T + 1;
			}
		}
		System.out.println(sum);
		System.out.println(N / P + " " + N % P);
	}
}
