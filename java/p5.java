class p5{
	public static boolean isprime(int x){
	double e = Math.sqrt(x);
	int end = (int)(e+.5);
	for (int i = 2 ;i <= end ;i++)
	{
		if(x%i==0)
			return false;
	}
	return true;
	}
	public static void main(String [] arfd){
	int ans = 1 ;
	int pt = -1;
	for(int i = 2 ;i < 20;i++){
	if(isprime(i)){
	pt = (int)(Math.log(20)/Math.log(i));
	ans*=(int)Math.pow(i,pt);
	}
	}
	System.out.println(ans);
	}
}
