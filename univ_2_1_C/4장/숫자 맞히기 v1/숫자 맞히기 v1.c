#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main()
{
	/*
		���� ����
		���� ���� �˸���
		����� �Է� �ڱ�
		�Ǵ� : �´� Ʋ���� ũ�� �۴�
		�Է� - �Ǵ�
		������ ���ϸ޼���
		5�� ������ �� ������, ���� �޼���
	*/

	srand(time(NULL));
	int randNum = rand() % 100 + 1;
	int num1;
	int chance = 1;

	printf("���� ������ ����\n\n");
	printf("1 ~ 100 ������ ���ڸ� ���� ������!\n");

	while (1)
	{	
		printf("%d ��° �õ�", chance);

		printf("���ڸ� �Է����ּ��� : ");
		int input_check = scanf_s("%d", &num1);
		if (input_check == 0)
		{
			printf("���ڸ� �Է��ϼ���.\n");
			char str[256];
			scanf_s("%s", str, (unsigned)sizeof(str));
			continue;
		}

		if (num1 < 1 || num1 < 101)
		{
			printf("������ ������ϴ�.\n");
			continue;
		}

		if (randNum == num1)
		{
			printf("�����Դϴ�!\n\n");
			printf("%d���� �õ� ���� ����Ͽ����ϴ�!\n\n", chance);
			break;
		}
		else if (randNum > num1)
		{
			printf("���� ���ڰ� �� Ů�ϴ�!\n\n");
		}
		else
		{
			printf("���� ���ڰ� �� �۽��ϴ�!\n\n");
		}

		if (chance > 4)
		{
			printf("�����Դϴ�!\n");
			printf("���� ���� %d�Դϴ�.\n", randNum);
			break;
		}
		else
		{
			chance++;
		}
	}

	return 0;
}