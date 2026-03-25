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
	private static int N, K;
	private static Deque<Integer> q;
	private static ArrayList<Integer> list;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		q = new LinkedList<>();
		list = new ArrayList<>();
		for(int i=1;i<=N;i++) {
			q.add(i);
		}
		while(!q.isEmpty()) {
			for(int i=0;i<K-1;i++) {
				q.addLast(q.removeFirst());
			}
			list.add(q.removeFirst());
		}
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		for(int i=0;i<list.size() -1;i++) {
			sb.append(list.get(i)).append(", ");
		}
		sb.append(list.get(list.size()-1)).append(">");
		System.out.println(sb);
	}
}
