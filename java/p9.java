class p9{
	public static void main(String [] ards){
	int m =2;
	boolean val = true;
	int a = 1,b = 1,c =1;
	while(val){
	for(int n = 1 ; n < m; n++)
	{
		a = m*m - n*n;
		b = 2*m*n;
		c = m*m + n*n;
		if((a + b + c)==1000){
		val =false;
		break;
		} 
	}
	m++;
	}
	System.out.println(a*b*c);
	}
}
