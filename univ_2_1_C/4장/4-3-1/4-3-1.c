#include <stdio.h>

int main()
{
	for (int i = 1; i <= 30; i++)
	{
		if (i >= 6 && i < 10)
		{
			if (i == 7)
			{
				printf("%d�� �Ἦ�Դϴ�.\n", i);
			}

			printf("������ �л��� ���� ������. \n");
			break;

			printf("%d�� �л��� ���� ��ǥ�� �غ��ϼ���.\n", i);
		}
	}

	return 0;
} 