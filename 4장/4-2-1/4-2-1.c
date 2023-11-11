#include <stdio.h>

int main()
{
	int age;
	
	printf("나이 입력 : ");
	scanf_s("%d", &age);

	if (age >= 8 && age <= 13)
	{
		printf("초등학생입니다.\n\n");
	}
	else if(age >= 14 && age <= 16)
	{
		printf("중학생입니다.\n\n");
	}
	else if (age >= 17 && age <= 19)
	{
		printf("고등학생입니다.");
	}
	else
	{
		printf("청소년이 아닙니다.");
	}

	return 0;
}