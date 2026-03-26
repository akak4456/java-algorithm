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

public class Main {
	private static int N, M;
	private static char[][] board;
	private static int getCnt(int startRow, int startCol) {
		int result = 987654321;
		int cnt = 0;
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				if(i%2 == 0) {
					if(j % 2 == 0) {
						if(board[startRow + i][startCol + j] != 'W') {
							cnt++;
						}
					} else {
						if(board[startRow + i][startCol + j] != 'B') {
							cnt++;
						}
					}
				} else {
					if(j % 2 != 0) {
						if(board[startRow + i][startCol + j] != 'W') {
							cnt++;
						}
					} else {
						if(board[startRow + i][startCol + j] != 'B') {
							cnt++;
						}
					}
				}
			}
		}
		result = Math.min(result, cnt);
		cnt = 0;
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				if(i%2 == 0) {
					if(j % 2 != 0) {
						if(board[startRow + i][startCol + j] != 'W') {
							cnt++;
						}
					} else {
						if(board[startRow + i][startCol + j] != 'B') {
							cnt++;
						}
					}
				} else {
					if(j % 2 == 0) {
						if(board[startRow + i][startCol + j] != 'W') {
							cnt++;
						}
					} else {
						if(board[startRow + i][startCol + j] != 'B') {
							cnt++;
						}
					}
				}
			}
		}
		result = Math.min(result, cnt);
		return result;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		board = new char[N][M];
		for(int i=0;i<N;i++) {
			String line = br.readLine();
			for(int j=0;j<M;j++) {
				board[i][j] = line.charAt(j);
			}
		}
		int result = 987654321;
		for(int row=0;row+8<=N;row++) {
			for(int col=0;col+8<=M;col++) {
				int cnt = getCnt(row, col);
				if(cnt < result) {
					result = cnt;
				}
			}
		}
		System.out.println(result);
	}
}
