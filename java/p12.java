class p12 {
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
	public static long numoftimes(long a,long b){
		long res =0;
		while(a%b==0&&a>0){
			a=a/b;
			res++;
		}
		return res;
	}
	public static void main(String [] asd){
	boolean val = true;
	long t1 = 1;
	long t=1;
	long e=-1;
	double d = 0.0;
	int cnt = 1;
	long temp =-1;
	while(val){
	cnt = 1;
	t = t1*(t1+1)/2;
	d = Math.sqrt(t);
	e = (long)(d+.5);
	for(long i = 2 ; i <=e ;i++ ){
		if(isprime(i))
		{
			if(t%i==0)
			{
			temp = numoftimes(t,i);
			cnt*=(temp+1);
			}


		}
		if(cnt>500){
		val = false;
		break;
		}

	}
	t1++;
	}
	System.out.println("Final"+t+" "+cnt+" "+t1);
	}
}
