package main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	private static int N,M;
	private static Set<Integer> s;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		s = new HashSet<Integer>();
		for(int i=0;i<N;i++) {
			int a = Integer.parseInt(st.nextToken());
			s.add(a);
		}
		M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<M;i++) {
			int a = Integer.parseInt(st.nextToken());
			if(s.contains(a)) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}
	}
}
