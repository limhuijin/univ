#include <stdio.h>

int main(void) {

	printf("*--- ȸ�� ���� ������ ---*\n");

	char memberName[256];
	printf("�̸��� �Է��ϼ��� : ");
	scanf_s("%s", memberName, (unsigned)sizeof(memberName));

	char memberID[256];
	printf("���ϴ� ���̵�(ID)�� �Է��ϼ��� : ");
	scanf_s("%s", memberID, (unsigned)sizeof(memberID));

	int memberAge;
	printf("���̸� �Է��ϼ��� : ");
	scanf_s("%d", &memberAge);

	char memberBirthDate[256];
	printf("������ �Է��ϼ���(0000.00.00) : ");
	scanf_s("%s", memberBirthDate, (unsigned)sizeof(memberBirthDate));

	int memberShoeSize;
	printf("�Ź� ũ�⸦ �Է��ϼ���(mm) : ");
	scanf_s("%d", &memberShoeSize);

	printf("\n\n");
	printf("*-------- ȸ�� ���� --------*\n");
	printf("�̸�\t\t: %s\n", memberName);
	printf("���̵�\t\t: %s\n", memberID);
	printf("����\t\t: %d��\n", memberAge);
	printf("����\t\t: %s\n", memberBirthDate);
	printf("�Ź� ũ��\t: %dmm\n", memberShoeSize);

	return 0;
}