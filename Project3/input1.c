#include <stdio.h>
#include <stdlib.h>
#include <string.h>
void main(){
    int a=0;
    float b=0.567;
    float c=.12;
    int d = 9;
    
    //  Print a, b
    printf("%d %f\n",a,b);

    //  (a '\t' ; a < '  \t' 2; '\t' a++), still works 
    //  Doesn't affect by the include files. Ex:<stdio.h>   
    for(a	=0  ;a<    	2;	a++)
    {
        d = d * 2;
    }
    
    e=0; // Type Checking: Undefined Variable && Type mismatch for the two sides of the assignment

    /*  
        Print the result
        The answer stores in b
    */

	b = b + c;

    a = a + b; // Type Checking: Type mismatch for the operator + && Type mismatch for the two sides of the assignment

    c = c - d; // Type Checking: Type mismatch for the operator - && Type mismatch for the two sides of the assignment

    printf("%.4f\n",b);

    return 0;
}
