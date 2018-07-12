#include <stdio.h>
#include <stdlib.h>
#include <string.h>
void main(){
    int a=0;
    float b=0.567;
    float c=.12;
    
    //  Print a, b
    printf("%d %f\n",a,b);

    //  (a '\t' ; a < '  \t' 2; '\t' a++), still works 
    //  Doesn't affect by the include files. Ex:<stdio.h>   
    for(a	=0  ;a<    	2;	a++)
    {
        b = b * 2;
    }

    /*  
        Print the result
        The answer stores in b
    */

	b = b + c;

    printf("%.4f\n",b);

    return 0;
}
