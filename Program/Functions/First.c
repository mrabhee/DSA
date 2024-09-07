#include <stdio.h>

void message(); // function declaration

int main()
{
    message();
    printf("Here is main function and calling message function");
    return 0;
}

void message()
{
    printf("Here is message function");
}
