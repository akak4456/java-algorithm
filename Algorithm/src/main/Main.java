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
	private static String A, B, C;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());
//		str = br.readLine();
//		System.out.println((int)str.charAt(0));
		A = br.readLine();
		B = br.readLine();
		C = br.readLine();
		System.out.println(Integer.parseInt(A) + Integer.parseInt(B) - Integer.parseInt(C));
		System.out.println(Integer.parseInt(A + B) - Integer.parseInt(C));
	}
}
