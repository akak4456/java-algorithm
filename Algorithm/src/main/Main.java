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
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new int[8];
		for(int i=0;i<8;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		boolean isAscending = true;
		for(int i=0;i<8;i++) {
			if(arr[i] != i + 1) {
				isAscending = false;
				break;
			}
		}
		boolean isDescending = true;
		for(int i=0;i<8;i++) {
			if(arr[i] != 8 - i) {
				isDescending = false;
				break;
			}
		}
		if(isAscending) {
			System.out.println("ascending");
		} else if(isDescending) {
			System.out.println("descending");
		} else {
			System.out.println("mixed");
		}
	}
}
