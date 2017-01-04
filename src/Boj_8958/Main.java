package Boj_8958;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in)); // 문자열으로 밖에 못읽어옴
		
		int count = Integer.parseInt(br.readLine());
		
		for(int i=0; i<count; i++){
			String OX = br.readLine();
			char[] OX1 = OX.toCharArray();
			
			int Next = 0;
			int score = 0;
			
			for(int j = 0; j<OX1.length;j++){
				if(OX1[j]=='O'){
					Next++;
					score += Next;
				}else{
					Next = 0;
				}
			}
			System.out.println(score);
		}
	}

}
