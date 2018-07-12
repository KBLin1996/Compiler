#include <stdio.h>
#include "myC.h"
int	 		 main()
{
    long a=43210;
    double b=12389.35;
    short c=0;
    int c = 56;    
    int d=50;
    int e = 30;
    float f = 2.56;
    float d=40.6; 
    // Type Error: Redecleared Variable c, d

    //  while(c' ' < ' \t'10), still works
    while(c<10)
    {
        if(a>b)
        {
            e=e/2; // int = int / (int)constant (Correct)
        }

        f = f-1.2; // float = float - (float) constant (Correct)
        f = f+(-3); // float = float + (- (int) constant) (Wrong)
                    // Type Error: Missmatch type calculation (+) && Missmatch type assignment

        f = c - f; // Type Error: Missmatch type calculation (-) && Missmatch type assignment
    }

    c = a / b; // Type Error: Missmatch type calculation (/) && Missmatch type assignment

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
