#include <stdio.h>

int main(void)
{
	char name[20], crime[30];
	int age;
	float kg, cm;

	printf("�̸��� ������? ");
	scanf_s("%s", name, sizeof(name));
	printf("�� ���̿���? ");
	scanf_s("%d", &age);
	printf("�����Դ� �� kg�̿���? ");
	scanf_s("%f", &kg);
	printf("Ű�� �� cm����? ");
	scanf_s("%f", &cm);
	printf("� ���˸� ���������? ");
	scanf_s("%s", crime, sizeof(crime));

	printf("\n\n--- ������ ���� ---\n\n");
	printf("�̸�\t: %s\n", name);
	printf("����\t: %d\n", age);
	printf("������\t: %.1f\n", kg);
	printf("Ű\t: %.1f\n", cm);
	printf("���˸�\t: %s\n", crime);

	return 0;
}