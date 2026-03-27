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
	private static int M;
	private static Set<Integer> s;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(br.readLine());
		s = new HashSet<>();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<M;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String op = st.nextToken();
			if(op.equals("add")) {
				int x = Integer.parseInt(st.nextToken());
				s.add(x);
			}
			if(op.equals("remove")) {
				int x = Integer.parseInt(st.nextToken());
				s.remove(x);
			}
			if(op.equals("check")) {
				int x = Integer.parseInt(st.nextToken());
				if(s.contains(x)) {
					sb.append("1\n");
				} else {
					sb.append("0\n");
				}
			}
			if(op.equals("toggle")) {
				int x = Integer.parseInt(st.nextToken());
				if(s.contains(x)) {
					s.remove(x);
				} else {
					s.add(x);
				}
			}
			if(op.equals("all")) {
				for(int t=1;t<=20;t++) {
					s.add(t);
				}
			}
			if(op.equals("empty")) {
				s.clear();
			}
		}
		System.out.println(sb);
	}
}
