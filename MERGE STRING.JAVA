import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		
		Scanner sc=new Scanner(System.in);
		String s1,s2;
		int l1,l2,tot,i,k,count=0;
		s1=sc.nextLine();
		s2=sc.nextLine();
		l1=s1.length();
		l2=s2.length();
		tot=l1+l2;
		for(i=l1-1;i>=0;i--)
		{
		    k=1;
		    if((s2.contains(s1.substring(i,l1)))&&(s1.contains(s2.substring(o,k))))
		    {
		        count++;
		        k++;
		        
		    }
		    else
		    {
		        break;
		    }
		}
		tot=tot-count;
		System.out.println(tot);
		

	}
}
