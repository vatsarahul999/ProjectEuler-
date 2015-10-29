class p3{
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

	public static void main(String []asd){
		long test = 600851475143L;
		long ans =-1;
		double e = Math.sqrt(test);
		long end = (long)(e+1);
		for(long i = 2 ; i <= end ;i++)
		{
		
			if(test%i==0){
				boolean val = isprime(i);
				if(val){
				ans = i;
				}
			}
		}
		System.out.println(ans);
	}
}
