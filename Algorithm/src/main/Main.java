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
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	private static int N;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(br.readLine());
		int twoCnt = 0;
		int fiveCnt = 0;
		for(int i=1;i<=N;i++) {
			int t = i;
			while(t % 2 == 0) {
				t /= 2;
				twoCnt++;
			}
			while(t % 5 == 0) {
				t /= 5;
				fiveCnt++;
			}
		}
		System.out.println(Math.min(twoCnt, fiveCnt));
	}
}
