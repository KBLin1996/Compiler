#include <stdio.h>
#include "myC.h"
int	 		 main()
{
    long a=43210;
    double b=12389.35;
    short c=0;
    int d=50;

    //  while(c' ' < ' \t'10), still works
    while(c<10)
    {
        if(a>b)
        {
            a=a/2;
        }
        c=c+1;
    }

	// Writing more than one else if
    if(a 	> d)
    {
        printf("a=%d\tb=%.2f\td=%d\n",a,b,d);
    }

	else if( b == c)
	{
			printf("It's impossible !");
	}

	else if(a==b 	)
	{
			printf("Interesting");
	}

	else
	{
			printf("WOW !");
	}

    return 1;
}
