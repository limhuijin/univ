#include <stdio.h>

int main()
{
	int age;

	printf("���� �Է� : ");
	scanf_s("%d", &age);

	switch (age)
	{
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
		case 13:
			printf("�ʵ��л��Դϴ�.");
			break;
		case 14:
		case 15:
		case 16:
			prtinf("���л��Դϴ�.");
			break;
		case 17:
		case 18:
		case 19:
			prtinf("����л��Դϴ�.");
			break;
		default:
			printf("û�ҳ��� �ƴմϴ�.");
			break;
	}
	return 0;
}