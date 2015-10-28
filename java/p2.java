class p2{
  public static void main(String [] asd){
    int a = 1;
    int b = 0;
    int c = 0;
    int sum=0;
    while(c<4000000){
      if(c%2==0)
      sum+=c;
      c = a + b;
      b = a;
      a = c;

    }
    System.out.println(sum);
  }

}
