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

class Member {
	int age;
	int idx;
	String name;
	
	public Member(int age, int idx, String name) {
		this.age = age;
		this.idx = idx;
		this.name = name;
	}
}
public class Main {
	private static int N;
	private static Member[] members;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(br.readLine());
		members = new Member[N];
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			members[i] = new Member(age, i, name);
		}
		
		Arrays.sort(members, (a, b) -> {
		    if (a.age == b.age) {
		        return a.idx - b.idx;
		    }
		    return a.age - b.age;
		});
		
		for(int i=0;i<N;i++) {
			System.out.println(members[i].age + " " + members[i].name);
		}
	}
}
