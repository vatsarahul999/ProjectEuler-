import java.io.*;
class p11{
	public static void main(String [] args) throws Exception{
	int [][] a = new int [20][20];
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String line ;
	for(int i = 0; i < 20;i++){
	line = br.readLine();
	String [] y = line.split(" ");
	int cnt = 0 ;
	for(String y1:y){
	a[i][cnt] = Integer.parseInt(y1);
	cnt++;
	}
	}
	long pdt = -1;
	long p1=1,p2=1,p3=1,p4=1,p5=1,p6=1,p7=1,p8=1;
	for(int i = 0 ; i < 20 ;i++){
	for(int j = 0 ; j < 20 ;j++){
	if(j+3<20)
	p1 = a[i][j]*a[i][j+1]*a[i][j+2]*a[i][j+3];
	else
	p1=1;
	if(i+3<20)
	p2 = a[i][j]*a[i+1][j]*a[i+2][j]*a[i+3][j];
	else
	p2=1;
	if(i+3<20 && j+3<20)
	p3 = a[i][j]*a[i+1][j+1]*a[i+2][j+2]*a[i+3][j+3];
	else
	p3=1;
	if(i-3>=0&&j-3>=0)
	p4 = a[i][j]*a[i-1][j-1]*a[i-2][j-2]*a[i-3][j-3];
	else
	p4 = 1;
	if(i-3>=0)
	p5 = a[i][j]*a[i-1][j]*a[i-2][j]*a[i-3][j];
	else
	p5 = 1;
	if(j-3>=0)
	p6 = a[i][j]*a[i][j-1]*a[i][j-2]*a[i][j-3];
	else
	p6 = 1;
	if(i-3>=20 && j+3<20)
	p7 = a[i][j]*a[i-1][j+1]*a[i-2][j+2]*a[i-3][j+3];
	else
	p7 = 1;
	if(i+3<20 && j-3>=0)
	p8 = a[i][j]*a[i+1][j-1]*a[i+2][j-2]*a[i+3][j-3];
	else
	p8 = 1;


	if(pdt < p1)
	pdt = p1;
	if(pdt < p2)
	pdt = p2;
	if(pdt < p3)
	pdt = p3;
	if(pdt < p4)
	pdt = p4;
	if(pdt < p5)
	pdt = p5;
	if(pdt < p6)
	pdt = p6;
	if(pdt<p7)
	pdt = p7;
	if(pdt < p8)
	pdt = p8;
	}
	}
	System.out.println(pdt);
	}
}
