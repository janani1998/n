class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
        int n=123,i=0;
       int a[]=new int[3];
       for(i=3-1;i>=0;i--)
       {
       	a[i]=n%10;
       	n=n/10;
       }
       for(i=0;i<3;i++)
       {
       	System.out.print(a[i]+" ");
       }
	}
}
