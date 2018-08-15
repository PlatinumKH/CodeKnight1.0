import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();

        for (int i = 0; i < cases; i++){
        	int bases = in.nextInt();
        	int[] area = new int[bases];
        	for (int j = 0; j < bases; j++){
        		area[j] = in.nextInt();
        	}

        	Arrays.sort(area);

        	int numBases = 0;
        	int tallestBase = 0;

        	for (int j = 0; j < bases;){
        		int a = 0;

        		while((j + 1 < bases) && (area[j] == area[j + 1])){
        			a++;
        			j++;
        		}
        		a++;
        		j++;

        		if (a > tallestBase){
        			tallestBase = a;
        		}
        		numBases++;
        	}

        	System.out.print(numBases);
        	System.out.print(' ');
        	System.out.println(tallestBase);
        }

    }

}