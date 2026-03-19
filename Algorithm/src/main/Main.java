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
	private static String str1, str2, str3;
	private static void printFizzBuzz(int n) {
		if(n % 3 == 0 && n % 5 == 0) {
			System.out.println("FizzBuzz");
		} else if(n % 3 == 0) {
			System.out.println("Fizz");
		} else if(n % 5 == 0) {
			System.out.println("Buzz");
		} else {
			System.out.println(n);
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());
		str1 = br.readLine();
		str2 = br.readLine();
		str3 = br.readLine();
		if(!str1.equals("Fizz") && !str1.equals("Buzz") && !str1.equals("FizzBuzz") ) {
			printFizzBuzz(Integer.parseInt(str1) + 3);
		}
		else if(!str2.equals("Fizz") && !str2.equals("Buzz") && !str2.equals("FizzBuzz") ) {
			printFizzBuzz(Integer.parseInt(str2) + 2);
		}
		else if(!str3.equals("Fizz") && !str3.equals("Buzz") && !str3.equals("FizzBuzz") ) {
			printFizzBuzz(Integer.parseInt(str3) + 1);
		}
	}
}
