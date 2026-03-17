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
	private static String S;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
		while(true) {
			S = br.readLine();
			if(S.equals("0")) {
				break;
			}
			boolean isPalindrome = true;
			for(int i=0;i<S.length() / 2;i++) {
				if(S.charAt(i) != S.charAt(S.length() - i - 1)) {
					isPalindrome = false;
					break;
				}
			}
			if(isPalindrome) {
				System.out.println("yes");
			} else  {
				System.out.println("no");
			}
		}
	}
}
