#include<stdio.h>
#include <stdlib.h>

int main()
{
    int a,b,i,s;
    scanf("%d%d",&a,&b);
    for(i=1;i<a;i++)
    {
        if((a%i==0)&&(b%i==0))
        s=i;
    }
printf("%d",s);

}
