#include<stdio.h>
void Area(int r,float *a,float *p){
    *a=3.14*r*r;
    *p=2*3.14*r;
}
int main(){
    int radius ;
    float area , perameter;
    printf("Enter the radius of the circle\n");
    scanf("%d",&radius);
    Area(radius,&area,&perameter);
    printf("The area of the circle is %f\n",area);  
    printf("The perimeter of the circle is %f\n",perameter);
    return 0;
}