package Boj_4153;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine().trim(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int z = Integer.parseInt(st.nextToken());
			
			if(x==0&&y==0&&z==0){
				break;
			}
			
		
			int x2 = x * x;
			int y2 = y * y;
			int z2 = z * z;

			if (x2 + y2 == z2 || x2 + z2 == y2 || y2 + z2 == x2) {
				System.out.println("right");
			}else{
				System.out.println("wrong");
			}

		}
	}

}