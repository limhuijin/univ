#include <stdio.h>
#include <stdlib.h>
#include <string.h> 

#define PRICE_COFFEE 4500
#define PRICE_SANDWICH 6000
#define PRICE_COFFEE_DC 3500

int main()
{
	int numCoffee = 0, numSandwich = 0, sum = 0, temp = 0, addsum[100] = {0, };

	printf("카페에 오신 것을 환영합니다!\n\n");

	printf("커피 가격 : 4,500원\n");
	printf("샌드위치 가격 : 6,000원\n");
	printf("샌드위치와 커피를 같이 구매하시면 커피의 가격이 3,500원이 됩니다.\n");

	while (1)
	{
		printf("커피 구매 수량을 알려주세요 : ");
		int input_check1 = scanf_s("%d", &numCoffee);
		if (input_check1 == 0)
		{
			printf("숫자만 입력하세요.\n");
			char str[256];
			scanf_s("%s", str, (unsigned)sizeof(str));
			continue;
		}

		printf("샌드위치 구매 수량을 알려주세요 : ");
		int input_check2 = scanf_s("%d", &numSandwich);
		if (input_check2 == 0)
		{
			printf("숫자만 입력하세요.\n");
			char str[256];
			scanf_s("%s", str, (unsigned)sizeof(str));
			continue;
		}

		if (numCoffee < 0 || numSandwich < 0)
		{
			printf("갯수를 잘못 입력하셨습니다.\n다시입력해주세요.");
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

		printf("주문하신 메뉴의 총 금액은");

	
		for (int i = 0; i < strlen(str); i++)
		{
			if ((strlen(str) - i) % 3 == 0 && i != 0)
			{
				printf(",");
			}

			printf("%c", str[i]);
		}

		printf("입니다.\n");

		break;
	}

	return 0;
}