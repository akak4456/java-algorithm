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
	private static int N;
	private static Stack<Integer> st;
	private static StringBuilder sb;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(br.readLine());
		st = new Stack<>();
		sb = new StringBuilder();
		int n = 1;
		for(int i=0;i<N;i++) {
			int a = Integer.parseInt(br.readLine());
			while(n <= a) {
				st.add(n);
				sb.append("+\n");
				n++;
			}
			if(st.peek() == a) {
				st.pop();
				sb.append("-\n");
			}
		}
		if(st.isEmpty()) {
			System.out.println(sb);
		} else {
			System.out.println("NO");
		}
	}
}
