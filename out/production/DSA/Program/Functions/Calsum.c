#include<stdio.h>
int calsum(int x,int y);
int main(){
    int a,b;
    printf("write the value of a and b \n");
    scanf("%d%d",&a,&b);
    int sum = calsum(a,b);
    printf("sum of two numbers is: %d",sum );
    return 0;
    
}

int calsum(int x,int y){
    int z=x+y;
    return z;
}
