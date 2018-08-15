import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws java.io.IOException {

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String line;

        line = br.readLine();
        int cases = Integer.parseInt(line);

        for (int i = 0; i < cases; i++){

        	line = br.readLine();

        	int bases = Integer.parseInt(line);

        	int[] area = new int[bases];

        	String[] stringedInts = br.readLine().split(" ");

        	for (int j = 0; j < bases; j++){
        		area[j] = Integer.parseInt(stringedInts[j]);
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