class p14{
	public static long  f(long x){
		long res = 0;
		while (x!=1){
			res++;
			if(x%2==1)
				x = (3*x + 1);
			else
				x = x /2 ;

		}
		return res +1;					
	}
	public static void main(String [] asd){
		int y = 1000000;
		int t = 1;
		long max = 0;
		long tmax = 0 ;
		int a = 1;
		for(int i = 1; i <= y; i++){
			tmax = f(i);
			
			if( tmax > max ){
				max = tmax;
				a = i;
				System.out.println(i + " " + max);

			}
		       //System.out.println(max.toString());	
		}
		System.out.println(f(13));
		System.out.println(a);
	}
}
