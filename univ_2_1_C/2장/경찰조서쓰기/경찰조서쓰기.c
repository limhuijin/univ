#include <stdio.h>

int main(void)
{
	/*char name[256], what[256];
	int age;
	float weight, height;

	printf("�̸��� ������? ");
	scanf_s("%s", name, sizeof(name));
	printf("�� ���̿���? ");
	scanf_s("%d", &age);
	printf("�����Դ� �� kg�̿���? ");
	scanf_s("%f", &weight);
	printf("Ű�� �� cm����? ");
	scanf_s("%f", &height);
	printf("� ���˸� ���������? ");
	scanf_s("%s", what, sizeof(what));

	printf("\n\n --- ������ ���� ---\n\n");
	printf("�̸�   : %s\n", name);
	printf("����   : %d\n", age);
	printf("������ : %.1f\n", weight);
	printf("Ű     : %.1f\n", height);
	printf("���˸� : %s\n", what);*/

	//���θ� ȸ������
	char name[256], id[256];
	int age, birth, size;

	printf("�̸� :  ");
	scanf_s("%s", name, sizeof(name));
	printf("���̵� : ");
	scanf_s("%s", id, sizeof(id));
	printf("���� : ");
	scanf_s("%d", &age);
	printf("���� : ");
	scanf_s("%d", &birth);
	printf("�Ź� ũ�� : ");
	scanf_s("%d", &size);

	printf("\n\n --- ȸ�� ���� ---\n\n");
	printf("�̸�      : %s\n", name);
	printf("���̵�    : %s\n", id);
	printf("����      : %d\n", age);
	printf("����      : %d\n", birth);
	printf("�Ź� ũ�� : %d\n", size);


	return 0;
}