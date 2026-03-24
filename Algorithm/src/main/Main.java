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
import java.util.StringTokenizer;

public class Main {
	private static int N;
	private static Deque<Integer> dq;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(br.readLine());
		dq = new LinkedList<>();
		for(int i=1;i<=N;i++) {
			dq.add(i);
		}
		while(dq.size() > 1) {
			dq.removeFirst();
			int a = dq.removeFirst();
			dq.addLast(a);
		}
		System.out.println(dq.removeFirst());
	}
}
