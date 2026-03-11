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
//		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(br.readLine());
		if(90 <= N && N <= 100) {
			System.out.println("A");
		} else if(80 <= N && N <= 89) {
			System.out.println("B");
		} else if(70 <= N && N <= 79) {
			System.out.println("C");
		} else if(60 <= N && N <= 69) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}
}
