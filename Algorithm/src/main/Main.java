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
	private static Set<String> s1;
	private static Set<String> s2;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		s1 = new HashSet<>();
		s2 = new HashSet<>();
		for(int i=0;i<N;i++) {
			String str = br.readLine();
			s1.add(str);
		}
		for(int i=0;i<M;i++) {
			String str = br.readLine();
			s2.add(str);
		}
		s1.retainAll(s2);
		System.out.println(s1.size());
		s1.stream().sorted().forEach((str) -> System.out.println(str));
	}
}
