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
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
//		StringTokenizer st = new StringTokenizer(br.readLine());
		boolean isPossible = false;
		for(int i = 1; i<=N;i++) {
			int sum = i;
			String str = String.valueOf(i);
			for(int j=0;j<str.length();j++) {
				sum += str.charAt(j) - '0';
			}
			if(sum == N) {
				isPossible = true;
				System.out.println(i);
				break;
			}
		}
		if(!isPossible) {
			System.out.println(0);
		}
	}
}
