import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int c,d;
		int sum=0;
		int count=0;
		
		for(int i=0;i<n;i++)
		{
		   a[i]= sc.nextInt();
		   sum=sum+a[i];
		   c=sum/3;
		}
		for(int i=0;i<n;i++)
		{
		    b[i]=sc.nextInt();
		    count=count+b[i];
		    d=count/3;
		}
		System.out.println(sum);
		System.out.println(count);

	}
}
