#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main()
{
	/*
		변수 선언
		게임 시작 알리기
		사용자 입력 박기
		판단 : 맞다 틀리다 크다 작다
		입력 - 판단
		맞으면 축하메세지
		5번 지나도 못 맞히면, 실패 메세지
	*/

	srand(time(NULL));
	int randNum = rand() % 100 + 1;
	int num1;
	int chance = 1;

	printf("숫자 맞히기 게임\n\n");
	printf("1 ~ 100 사이의 숫자를 맞춰 보세요!\n");

	while (1)
	{	
		printf("%d 번째 시도", chance);

		printf("숫자를 입력해주세요 : ");
		int input_check = scanf_s("%d", &num1);
		if (input_check == 0)
		{
			printf("숫자만 입력하세요.\n");
			char str[256];
			scanf_s("%s", str, (unsigned)sizeof(str));
			continue;
		}

		if (num1 < 1 || num1 < 101)
		{
			printf("범위를 벗어났습니다.\n");
			continue;
		}

		if (randNum == num1)
		{
			printf("정답입니다!\n\n");
			printf("%d번의 시도 만에 통과하였습니다!\n\n", chance);
			break;
		}
		else if (randNum > num1)
		{
			printf("랜덤 숫자가 더 큽니다!\n\n");
		}
		else
		{
			printf("랜덤 숫자가 더 작습니다!\n\n");
		}

		if (chance > 4)
		{
			printf("실패입니다!\n");
			printf("랜덤 값은 %d입니다.\n", randNum);
			break;
		}
		else
		{
			chance++;
		}
	}

	return 0;
}