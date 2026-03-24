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
	private static int T;
	private static Stack<Character> st;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());
		T = Integer.parseInt(br.readLine());
		for(int testCase = 0; testCase < T; testCase++) {
			String str = br.readLine();
			st = new Stack<>();
			boolean isPossible = true;
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i) == '(') {
					st.add(str.charAt(i));
				}
				if(str.charAt(i) == ')') {
					if(st.isEmpty()) {
						isPossible = false;
						break;
					}
					st.pop();
				}
			}
			if(!st.isEmpty()) {
				isPossible = false;
			}
			if(isPossible) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
