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
	private static double[] arr2;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new int[N];
		arr2 = new double[N];
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int maxVal = -1;
		for(int i=0;i<N;i++) {
			if(arr[i] > maxVal) {
				maxVal = arr[i];
			}
		}
		for(int i=0;i<N;i++) {
			arr2[i] = ((double) arr[i] / maxVal * 100);
		}
		double sum = 0;
		for(int i=0;i<N;i++) {
			sum += arr2[i];
		}
		System.out.println(sum / N);
	}
}
