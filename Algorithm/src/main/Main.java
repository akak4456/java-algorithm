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
class Print {
	int idx;
	int priority;
	public Print(int idx, int priority) {
		this.idx = idx;
		this.priority = priority;
	}
}
public class Main {
	private static int T;
	private static int N, M;
	private static LinkedList<Print> prints;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		for(int testCase = 0; testCase < T;testCase++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			prints = new LinkedList<>();
			st = new StringTokenizer(br.readLine());
			for(int i=0;i<N;i++) {
				int a = Integer.parseInt(st.nextToken()); 
				prints.add(new Print(i, a));
			}
			int cnt = 0;
			while(true) {
				Print print = prints.remove(0);
				boolean isPrintable = true;
				
				for(int i=0;i<prints.size();i++) {
					if(prints.get(i).priority > print.priority) {
						isPrintable = false;
						break;
					}
				}
				if(isPrintable) {
					cnt++;
					if(print.idx == M) {
						System.out.println(cnt);
						break;
					}
				} else {
					prints.addLast(print);
				}
			}
		}
		
		
	}
}
