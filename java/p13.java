import java.io.*;
import java.math.BigInteger;
class p13{
	public static void main(String [] ard)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp;
		BigInteger ans = new BigInteger("0");
		BigInteger b1;
		for(int i = 0; i < 100; i++){
			temp = br.readLine();
			b1 = new BigInteger(temp);
			ans = ans.add(b1);
		}
		String res=ans.toString();
		String a = res.substring(0,10);
		System.out.println(a);
	}
}
