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
	private static int[] arr;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());
//		str = br.readLine();
//		System.out.println((int)str.charAt(0));
		arr = new int[9 + 1];
		for(int i=1;i<=9;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int maxIdx = -1;
		int maxVal = -1;
		for(int i=1;i<=9;i++) {
			if(arr[i] > maxVal) {
				maxVal = arr[i];
				maxIdx = i;
			}
		}
		System.out.println(maxVal);
		System.out.println(maxIdx);
	}
}
