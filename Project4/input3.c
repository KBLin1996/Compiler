#include <stdio.h>

int x;
int y;

void main ()
{
/*
   This is a Multi-Comment Expression
*/
    x   =-2;
    y = 1;
    y= -x+  y;

    printf ("Here is an if-else statement.\n\n");
	printf ("Initialize: x = %d, y = %d\n\n",x,y);

	if (x > y)
	{
			printf ("x is bigger than y (x = %d, y = %d)\n",x,y);
	}

	if (y > x)
	{
			printf ("y is bigger than x (y = %d, x = %d)\n",y,x);
	}
}
