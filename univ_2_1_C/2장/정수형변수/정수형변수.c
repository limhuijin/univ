/*
	나도코딩 c언어 2장에  나오는 두번째 예제
	책 44쪽, 45쪽, 46쪽 조금씩 변경되어 있음
*/

#include <stdio.h>

int main(void)
{
	int myAge, friendAge; //두개의 변수 선언

	printf("당신의 나이를 입력하세요 : ");
	scanf_s("%d", &myAge);

	printf("가장 친한 친구의 나이를 입력하세요 : ");
	scanf_s("%d", &friendAge);

	printf("당신의 나이는 %d입니다.\n", myAge);
	printf("친한 친구의 나이는 %d입니다.\n", friendAge);

	return 0;
}