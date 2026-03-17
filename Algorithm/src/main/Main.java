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
	private static int A, B, C;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			C = Integer.parseInt(st.nextToken());
			if(A == 0 && B == 0 && C == 0) {
				break;
			}
			if(A > C) {
				int tmp = A;
				A = C;
				C = tmp;
			}
			if(B > C) {
				int tmp = B;
				B = C;
				C = tmp;
			}
			if(A * A + B * B == C * C) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		}
	}
}
