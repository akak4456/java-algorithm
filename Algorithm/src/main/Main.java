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
	private static String S;
	private static int[] arr;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());
		S = br.readLine();
		arr = new int[26];
		for(int i=0;i<26;i++) {
			arr[i] = -1;
		}
		for(int i=0;i<S.length();i++) {
			if(arr[S.charAt(i) - 'a'] == -1) {
				arr[S.charAt(i) - 'a'] = i;
			}
		}
		for(int i=0;i<26;i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
