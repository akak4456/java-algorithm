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
	private static Deque<Integer> q;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(br.readLine());
		q = new LinkedList<>();
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			if(str.equals("push")) {
				int a = Integer.parseInt(st.nextToken());
				q.add(a);
			}
			if(str.equals("pop")) {
				if(q.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(q.removeFirst());
				}
			}
			if(str.equals("size")) {
				System.out.println(q.size());
			}
			if(str.equals("empty")) {
				System.out.println(q.isEmpty() ? 1 : 0);
			}
			if(str.equals("front")) {
				if(q.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(q.getFirst());
				}
			}
			if(str.equals("back")) {
				if(q.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(q.getLast());
				}
			}
		}
	}
}
