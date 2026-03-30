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
	private static int N, M;
	private static Map<String, Integer> stoi;
	private static Map<Integer, String> itos;
	private static int getNumber(String str) {
		try {
			int a = Integer.parseInt(str);
			return a;
		} catch (NumberFormatException e) {
			return -1;
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		stoi = new HashMap<>();
		itos = new HashMap<>();
		for(int i=1;i<=N;i++) {
			String str = br.readLine();
			stoi.put(str, i);
			itos.put(i, str);
		}
		for(int i=0;i<M;i++) {
			String str = br.readLine();
			int a = getNumber(str);
			if(a == -1) {
				System.out.println(stoi.get(str));
			} else {
				System.out.println(itos.get(a));
			}
		}
	}
}
