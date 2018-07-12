#include <stdio.h>

int a;
int b;

void main ()
{
	a = 1;	
	b   =5; // Initailize integer a
    printf ("Hello Compiler !\n");
    printf ("I can do any calculation and some if-else statements and also any kind of printf.\n\n");
    
    printf ("Here's a calculation of increment.\n");
    printf ("Initialize : a = %d, b = %d\n",a,b);
	a= b+   8; // Calculate a with identifier a and constant 8
	printf ("a = b + 8\n");
	printf ("a = %d\n\n",a);

	printf ("Here are some if-else statements\n");

	if (a>b)
	{
			printf ("a is bigger than b (a = %d, b = %d)\n",a,b);
	}

	if (b>a)
	{
			printf ("b is bigger than a (b = %d, a = %d)\n",b,a);
	}
}
