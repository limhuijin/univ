#include <stdio.h>

int main()
{
	int age;
	
	printf("���� �Է� : ");
	scanf_s("%d", &age);

	if (age >= 8 && age <= 13)
	{
		printf("�ʵ��л��Դϴ�.\n\n");
	}
	else if(age >= 14 && age <= 16)
	{
		printf("���л��Դϴ�.\n\n");
	}
	else if (age >= 17 && age <= 19)
	{
		printf("����л��Դϴ�.");
	}
	else
	{
		printf("û�ҳ��� �ƴմϴ�.");
	}

	return 0;
}