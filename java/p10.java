import java.math.BigInteger;
class p10{
	public static boolean isprime(long y){
                double sq = Math.sqrt(y);
                long endl =(long) (sq+.5);
                for(long j = 2;j <=endl ;j++)
                {
                        if(y%j==0){
                        return false;
                        }
                }
                return true;
        }
	public static void main(String [] asd){
	BigInteger b1 = new BigInteger("0");
	for(long i = 2; i <= 2000000 ; i++){
	if(isprime(i)){
	BigInteger b2 = new BigInteger(Long.toString(i));
	b1 = b1.add(b2);
	}
	}
	System.out.println(b1.toString());
	}
}
