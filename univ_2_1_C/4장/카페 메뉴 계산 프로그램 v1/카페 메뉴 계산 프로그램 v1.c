#include <stdio.h>
#include <stdlib.h>
#include <string.h> 

#define PRICE_COFFEE 4500
#define PRICE_SANDWICH 6000
#define PRICE_COFFEE_DC 3500

int main()
{
	int numCoffee = 0, numSandwich = 0, sum = 0, temp = 0, addsum[100] = {0, };

	printf("ī�信 ���� ���� ȯ���մϴ�!\n\n");

	printf("Ŀ�� ���� : 4,500��\n");
	printf("������ġ ���� : 6,000��\n");
	printf("������ġ�� Ŀ�Ǹ� ���� �����Ͻø� Ŀ���� ������ 3,500���� �˴ϴ�.\n");

	while (1)
	{
		printf("Ŀ�� ���� ������ �˷��ּ��� : ");
		int input_check1 = scanf_s("%d", &numCoffee);
		if (input_check1 == 0)
		{
			printf("���ڸ� �Է��ϼ���.\n");
			char str[256];
			scanf_s("%s", str, (unsigned)sizeof(str));
			continue;
		}

		printf("������ġ ���� ������ �˷��ּ��� : ");
		int input_check2 = scanf_s("%d", &numSandwich);
		if (input_check2 == 0)
		{
			printf("���ڸ� �Է��ϼ���.\n");
			char str[256];
			scanf_s("%s", str, (unsigned)sizeof(str));
			continue;
		}

		if (numCoffee < 0 || numSandwich < 0)
		{
			printf("������ �߸� �Է��ϼ̽��ϴ�.\n�ٽ��Է����ּ���.");
			continue;
		}

		if (numCoffee > 0 && numSandwich > 0)
		{
			sum = (PRICE_COFFEE_DC * numCoffee) + (PRICE_SANDWICH * numSandwich);
		}
		else
		{
			sum = (PRICE_COFFEE * numCoffee) + (PRICE_SANDWICH * numSandwich);
		}

		
		char str[256] = {0, };

		//itoa(sum, str, strlen(str));
		sprintf_s(str, sizeof(str), "%d", sum);

		printf("�ֹ��Ͻ� �޴��� �� �ݾ���");

	
		for (int i = 0; i < strlen(str); i++)
		{
			if ((strlen(str) - i) % 3 == 0 && i != 0)
			{
				printf(",");
			}

			printf("%c", str[i]);
		}

		printf("�Դϴ�.\n");

		break;
	}

	return 0;
}