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
	private static String s;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());
//		str = br.readLine();
//		System.out.println((int)str.charAt(0));
		N = Integer.parseInt(br.readLine());
		s = br.readLine();
		int sum = 0;
		for(int i=0;i<N;i++) {
			sum += s.charAt(i) - '0';
		}
		System.out.println(sum);
	}
}
