package main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	private static int M, N;
	private static boolean[] isPrime;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		isPrime = new boolean[1000000 + 1];
		for(int i = 1;i<=1000000;i++) {
			isPrime[i] = true;
		}
		isPrime[0] = false;
		isPrime[1] = false;
		for(int i=2;i<=1000000;i++) {
			if(isPrime[i]) {
				int n = i + i;
				while(n <= 1000000) {
					isPrime[n] = false;
					n += i;
				}
			}
		}
		for(int i=M;i<=N;i++) {
			if(isPrime[i]) {
				System.out.println(i);
			}
		}
	}
}
