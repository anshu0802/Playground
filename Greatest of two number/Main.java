#include<stdio.h>
int main()
{
   int a, b;  
    scanf("%d %d", &a, &b);  
    
    if(a > b) 
    {
        printf("num1 is the greatest\n", a);          
    } 
    else if (b > a)
    { 
        printf("num2 is the greatest\n", b);  
    } 
    else 
    {
	printf("Both are Equal\n");
    }
}