#include <stdio.h>

int main(void)
{
	/*for (int i = 2; i < 10; i++)
	{
		printf("*---- %d단 ----*\n\n", i);

		for (int j = 1; j < 10; j++)
		{
			printf("%d * %d = %2d\n", i, j, i * j);
		}
		printf("\n");
	}*/

	int num;
	
	while (1)
	{
		printf("몇 단을 출력할까요?[2~9] 종료[10] : ");
		scanf_s("%d", &num);

		if (num == 10)
		{
			printf("종료합니다.\n\n");
			break;
		}
		else if (num > 1 && num < 10)
		{
			for (int j = 1; j < 10; j++)
			{
				printf("%d * %d = %2d\n", num, j, num * j);
			}
			printf("\n");
		}
		else 
		{
			printf("잘못된 입력입니다.\n\n");
		}
	}

	return 0;
}