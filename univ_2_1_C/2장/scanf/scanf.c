#include <stdio.h>

int main(void)
{
	/*int one, two, three;

	printf("���� 3���� �Է��ϼ��� : ");
	scanf_s("%d %d %d", &one, &two, &three);
	printf("ù ��° �� : %d\n", one);
	printf("ù ��° �� : %d\n", two);
	printf("ù ��° �� : %d\n", three);*/


	char hometown[256];
	int birthYear ;

	printf("�¾ ���� : ");
	scanf_s("%s", hometown, sizeof(hometown));
	printf("�¾ ���� : ");
	scanf_s("%d", &birthYear);
	printf("�¾ ���� : %s\n", hometown);
	printf("�¾ ���� : %d\n", birthYear);

	return 0;
}