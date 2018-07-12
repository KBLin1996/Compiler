//  include' \t\t '<stdio.h>
#include         <stdio.h>

void Apple()
{
    printf("I like to be a part of APPLE\n");
}

int main()
{
    long a=76543210;
    double b=12389.35;
    short c=0;
    int d=50;

    //  while(c' ' < ' \t'12), still works
    while(c >    10)
    {
        if(a>b)
        {
            c--;
        }
        else if(a==b)
        {
            a-=b;
            printf("That's a miracle\n");
            break;
        }
        else
        {
            a = a * c;
            c++;
            continue;
        }
    }

    if(a != b)
    {
        Apple();
        printf("%d\t%d\n",d >> 2,d<<1);
    }

    return 0;
}
