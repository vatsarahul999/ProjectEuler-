import java.math.BigInteger;
class p15{
	public static  BigInteger factorial(int x){
		BigInteger b1 = new BigInteger("1");
	for(int i = 2 ; i <= x ;i++)
	{
		BigInteger b2 = new BigInteger(Integer.toString(i));
		b1 = b1.multiply(b2);
	
	}
	return b1; 
	}
	public static void main(String [] p){
	BigInteger a = factorial(40);
	BigInteger b = factorial(20);
	a = a.divide(b);
	a = a.divide(b);
	System.out.println(a.toString());
	}
}
