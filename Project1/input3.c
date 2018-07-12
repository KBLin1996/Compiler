//#include "myfile.h"
#include <stdio.h>
#define MAX 12
#define MIN 3

void main(int argc, char **argv)
{
    int a=4, b=6, c=0;
    char *A = {"Hey Soul Sister"};

    c = (a==b) ? 1:0;

    if(c == 1)
    {
        printf("MAX: %d\n",MAX);
    }

    else
    {
        printf("MIN: %d\n",MIN);
    }

    printf("%s\n",A);
}
