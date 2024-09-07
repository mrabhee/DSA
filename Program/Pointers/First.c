#include<stdio.h>
int main(){
    int i = 3;
    int *j;
    j = &i;
    printf("Value at i %d \n",i);
    
    printf("Value at i %d \n",*j);
    printf("Address of i %u \n",&i);
    printf("Value at Address of i %u \n",*(&i));
    
    printf("Value of j / Address of i %u \n",j);
    printf("Address of j %u \n",&j);
    return 0;
}