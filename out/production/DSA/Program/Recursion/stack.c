#include<stdio.h>
int add(int,int);
int main(){ 
    int a = 5; // pushed into stack
    int b = 2; //pushed into stack
    int c; 
    c = add(a,b); // function call
    printf("The sum of a and b is %d",c); //pushed into stack before calling function
    return 0; // pop all items from stack
}

int add(int i,int j){
    int sum; 
    sum = i+j; // pushed into stack
    return sum; //pop sum from stack
}