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
	private static int[] arr;
	private static int[] remains;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new int[10];
		remains = new int[42];
		for(int i=0;i<10;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		for(int i=0;i<10;i++) {
			remains[arr[i] % 42]++;
		}
		int cnt = 0;
		for(int i=0;i<42;i++) {
			if(remains[i] > 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
