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
class Pair implements Comparable<Pair>{
	int first;
	int last;
	public Pair(int first, int last) {
		this.first = first;
		this.last = last;
	}
	@Override
	public int compareTo(Pair o) {
		if(o.last == this.last) {
			return this.first - o.first;
		}
		return o.last - this.last;
	}
}
public class Main {
	private static int N;
	private static int[] arr;
	private static ArrayList<Pair> most;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		double sum = 0;
		for(int i=0;i<N;i++) {
			sum += arr[i];
		}
		System.out.println((int)Math.round(sum / N));
		System.out.println(arr[N/2]);
		int cnt = 1;
		int val = arr[0];
		most = new ArrayList<>();
		for(int i=1;i<N;i++) {
			if(val != arr[i]) {
				most.add(new Pair(val, cnt));
				cnt = 1;
				val = arr[i];
			} else {
				cnt++;
			}
		}
		most.add(new Pair(val, cnt));
		Collections.sort(most);
//		for(int i=0;i<most.size();i++) {
//			System.out.println(most.get(i).first + " " + most.get(i).last);
//		}
		if(most.size() >= 2 && most.get(0).last == most.get(1).last) {
			System.out.println(most.get(1).first);
		} else {
			System.out.println(most.get(0).first);
		}
		System.out.println(arr[N-1] - arr[0]);
	}
}
