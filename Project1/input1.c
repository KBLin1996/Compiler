#include <stdio.h>

int main()
{
    int a=0;
    float b=0.567;
    float c=.12;
    
    //  Print a, b
    printf("%d %f\n",a,b);

    //  a<' \t\t'2, still works 
    //  Doesn't affect by the include files. Ex:<stdio.h>, "myfile.h"   
    for(a=0;a<       2;a++)
    {
        b *= c;
    }

    /*  
        Print the result
        The answer stores in b
    */

    printf("%.4f\n",b);

    return 0;
}
