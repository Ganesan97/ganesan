import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();

int count=0;
for(int i=0;i<s.length();i++)
{
    for(char c='A';c<='Z';c++)
    {
        if(s.charAt(i)==c)
        {
            count++;
        }
    }
}
System.out.println(count);
	}
}
