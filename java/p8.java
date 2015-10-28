import java.io.*;
import java.util.*;
class p8{
	public static void main(String[] args)throws Exception{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String line = br.readLine();
	long []a = new long[(1000 - 12)];
	for (int i = 0; i <=(1000-13);i++){
		String temp = line.substring(i,i+13);
		String h="";
		long ge=1;
		for(int j= 0 ;j<13;j++){
			char ch = temp.charAt(j);
			h+=ch;
			ge*=Long.parseLong(h);
			h="";
		}
		a[i]=ge;
		}
		Arrays.sort(a);
		System.out.println(a[a.length - 1]);
	}
}
