#include <stdio.h>

int main(void)
{
	/*for (int i = 0; i < 5; i++)
	{
		for (int j = 0; j <= i; j++)
		{
			printf("*");
		}
		printf("\n");
	}*/


	int num = 0;

	while (1)
	{
		
		printf("쌓을 층을 입력해 주세요(1 ~ 60) : ");
		scanf_s("%d", &num);

		if (num > 0 && num < 61)
		{
			break;
		}
		else
		{
			printf("잘못입력하셨습니다.\n");
		}
	}

	for (int i = 0; i < num; i++)
	{
		for (int j = i; j < num - 1; j++)
		{
			printf(" ");
		}
		
		for (int k = 0; k <= i; k++)
		{
			printf("*");
		}

		printf("\n");
	}

	return 0;
}