class p17{
	public static void main(String [] ards){
		String [] y = {"","one","two","three","four","five","six","seven","eight","nine","","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","","ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty"," ","hundred","thousand"};
		int ans=0;
		String t;
		String p;
		for(int j=0;j<=9;j++){
	
		if(j!=0){
			p=y[j]+y[31];
		}
		else
		p="";
		for(int i = 1 ;i<=100;i++){
	
			int y1 = i%100;
			if(j!=0)
				t="and";
			else
				t="";

	
			if(y1/10==0)	
				t += y[ y1%10 ];
			else if(y1/10==1){
					if(y1%10!=0)
						t += y[(y1%10)+10];
					else
						t+=y[21];
				}

			else if(y1/100==0)
				t += y[y1/10+20]+y[y1%10];
			else 
				t +=  y[j]+y[31] +y[((y1%100)/10)+20]+y[y1%10];
	

	
			t=p+t;
			if((j*100+i)==1000)
				t="one thousand";
			else if(((j*100)+i)%100==0){
				t=y[((j*100)+i)/100]+y[31];
			}
			String [] h=t.split(" ");
			for(String f:h)
				if(f.length()!=1)
					ans+=f.length();
	

		}
	}
	System.out.println(ans);
}
}
