class p4{
  public static void main(String [] args){
    long max =-1;
    for(int i = 100 ;i < 1000 ;i ++) {
      for(int j = 100; j < 1000 ; j++){
        String org = Integer.toString(i*j);
        StringBuffer sb = new StringBuffer(org);
        sb = sb.reverse();
        String rev = sb.toString();
        if(rev.equals(org))
        {
          if(Integer.parseInt(org)>max)
          max = Integer.parseInt(org);

        }
      }
    }
    System.out.println(max);
  }
}
