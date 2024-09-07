#include<stdio.h>
void swap(int x,int y){
    int temp;
    temp = x;
    x = y;
    y = temp;
    printf("Value of A after swap: %d\n",x);
    printf("Value of B after swap: %d\n",y);
}
int main(){
    int a = 10;
    int b = 20;
    printf("Value of A before swap: %d\n",a);
    printf("Value of B before swap: %d\n",b);
    swap(a,b);
    return 0 ;
}
