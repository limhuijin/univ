#include <stdio.h>

int main(void)
{
	printf("������ ��¥�� �Է�(0000.00.00) : ");
	
	char today[256];
	scanf_s("%s", today, sizeof(today));

	printf("������ %s �Դϴ�.\n\n", today);

	return 0;
}