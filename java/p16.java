import java.math.BigInteger;
class p16{
	public static void main(String []ars){
	BigInteger b2  = new BigInteger("2");
	b2 = b2.pow(1000);
	String y = b2.toString();
	int ans = 0;
	for(int i=0 ;i < y.length();i++)
	{
		
		ans+=Integer.parseInt(y.substring(i,i+1));
	}
	System.out.println(ans);

	}
}
