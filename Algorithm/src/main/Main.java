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
	private static String S;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());
		T = Integer.parseInt(br.readLine());
		for(int testCase = 0; testCase < T; testCase++) {
			S = br.readLine();
			int sum = 0;
			int curScore = 0;
			for(int i=0;i<S.length();i++) {
				if(S.charAt(i) == 'O') {
					curScore++;
					sum += curScore;
				} else {
					curScore = 0;
				}
			}
			System.out.println(sum);
		}
	}
}
