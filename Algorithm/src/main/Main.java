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
	private static int L;
	private static String S;
	private static final long M = 1234567891;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
		L = Integer.parseInt(br.readLine());
		S = br.readLine();
		long p = 1;
		long sum = 0;
		for(int i=0;i<L;i++) {
			sum += (S.charAt(i) - 'a' + 1) * p;
			sum %= M;
			p *= 31;
			p %= M;
		}
		System.out.println(sum);
	}
}
