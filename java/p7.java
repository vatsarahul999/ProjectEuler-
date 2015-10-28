class p7{
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
	public static void main(String [] ards){
	int cnt = 0;
	long i = 2;
	while(true){
	if(isprime(i)){
	cnt++;	
	if(cnt==10001)
	break;
	}
	i++;
	} 
	System.out.println(i);
	}


}
