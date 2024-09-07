#include<stdio.h>

void message(); //function declaration
void india();
int main(){
    message();
    printf("Here is main function  and calling message function");
    return 0;
}

void message(){
    printf("Here is message function!\n");
    india();
    printf("Here is message function! again\n");
}

void india(){
    printf("Here is india function!\n");
}
