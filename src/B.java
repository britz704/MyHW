/*#Include<stdio.h>
int main()
{
printf("homework\n");
getchar();
getchar();
retuen 0;
}*/
#include "stdafx.h"
#include "stdio.h"
#include "stdlib.h"
#include "math.h"

int _tmain(int argc, _TCHAR* argv[])
{
	int a,b,c;
	printf("ù��° ���� �Է��ϼ���:\n");
	scanf("%d",&a);
	printf("�ι�° ���� �Է��ϼ���:\n");
	scanf("%d",&b);
	c=a+b;
	printf("%d+%d=%d",c);
	c=a-b;
	printf("%d",c);
	c=a*b;
	printf("%d",c);
	c=a/b;
	printf("%d",c);
	getchar();
	getchar();
	
	return 0;
}
