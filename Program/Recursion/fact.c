#include<stdio.h>

int fact(int x){
    int f;
    if(x==1){
        return(1);
    }
    else{
        f = x * fact(x-1);
    }
    return(f);

}

int main(){
    int a;
    printf("Enert number : \n");
    scanf("%d",&a);
    int factorial = fact(a);
    printf("Factoiral is : %d\n",factorial);
}