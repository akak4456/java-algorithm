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
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	private static int K;
	private static Stack<Integer> st;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());
		K = Integer.parseInt(br.readLine());
		st = new Stack<>();
		for(int i=0;i<K;i++) {
			int a = Integer.parseInt(br.readLine());
			if(a == 0) {
				st.pop();
			} else {
				st.add(a);
			}
		}
		int sum = 0;
		while(!st.isEmpty()) {
			sum += st.pop();
		}
		System.out.println(sum);
	}
}
