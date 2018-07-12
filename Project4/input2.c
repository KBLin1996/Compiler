#include <stdio.h>

int a;
int b;
int c;
int d;
int e;
int f;

void main ()
{
/*
  multiple 
  line 
  comments.
*/
    a = 235;
	b = 5;
	d   =  a / b;
    c=-6;
    f = a - b;
    printf ("This is a calculation with multiply and divided and substraction\n\n");
    printf ("Initial: a = %d, b = %d, c = %d\n\n",a,b,c);
    printf ("Calculate: d = a / b, e = b * c, f = a - b\n\n");
    e = b*c;
	printf ("Result: d = %d, e = %d, f = %d\n",d,e,f);

}
