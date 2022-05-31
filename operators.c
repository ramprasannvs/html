#include<stdio.h>
void main()
{
    int a=60,b=13;
    int c;
    c=a&b;
    printf("a&b=%d\n",c);
    c=a|b;
    printf("a|b=%d\n",c);
    c=a^b;
    printf("a^b=%d\n",c);
    c=a<<2;
    printf("a<<2=%d\n",c);
     
    c=a>>2;
    printf("a>>2=%d",c);


}
