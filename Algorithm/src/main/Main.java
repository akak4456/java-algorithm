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
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(br.readLine());
		int cnt = 0;
		while(N >= 3) {
			if(N % 5 == 0) {
				cnt += N / 5;
				N = 0;
				break;
			}
			cnt++;
			N -= 3;
		}
		if(N > 0) {
			System.out.println(-1);
		} else {
			System.out.println(cnt);
		}
	}
}
