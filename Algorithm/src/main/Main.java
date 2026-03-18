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
	private static String str;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());
		str = br.readLine();
		int remain = 0;
		boolean isEven = true;
		for(int i=0;i<12;i++) {
			if(str.charAt(i) == '*') {
				if(i%2 == 0) {
					isEven = true;
				} else {
					isEven = false;
				}
				continue;
			}
			if(i%2 == 0) {
				remain += str.charAt(i) - '0';
			} else {
				remain += (str.charAt(i) - '0') * 3;
			}
		}
		for(int i=0;i<10;i++) {
			int m = ((remain / 10 + 2) * 10 - (remain + (isEven ? i : i * 3))) % 10;
			if(m == str.charAt(str.length() - 1) - '0') {
				System.out.println(i);
				break;
			}
		}
	}
}
