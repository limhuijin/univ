/*
	�����ڵ� c��� 2�忡  ������ �ι�° ����
	å 44��, 45��, 46�� ���ݾ� ����Ǿ� ����
*/

#include <stdio.h>

int main(void)
{
	int myAge, friendAge; //�ΰ��� ���� ����

	printf("����� ���̸� �Է��ϼ��� : ");
	scanf_s("%d", &myAge);

	printf("���� ģ�� ģ���� ���̸� �Է��ϼ��� : ");
	scanf_s("%d", &friendAge);

	printf("����� ���̴� %d�Դϴ�.\n", myAge);
	printf("ģ�� ģ���� ���̴� %d�Դϴ�.\n", friendAge);

	return 0;
}