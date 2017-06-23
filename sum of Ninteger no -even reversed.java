import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[100000];
		int sum=0,input=0;
    String z;
		for(int i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		    
		    if(a[i]>0)
		    {
		        if(a[i]%2!=0)
		        {
		            sum=sum+a[i];
		        }
		    
		    else
		    {
		        String a2=String.valueOf(a[i]);
		        StringBuilder in=new StringBuilder();
		        in.append(a2);
		        in=in.reverse();
		        z=in.toString();
		        input=Integer.parseInt(z);
		        sum=sum+input;
		    }
		}
		System.out.println(sum);

	}
}
}
