#include <stdio.h>

int main(void)
{
	printf("오늘의 날짜를 입력(0000.00.00) : ");
	
	char today[256];
	scanf_s("%s", today, sizeof(today));

	printf("오늘은 %s 입니다.\n\n", today);

	return 0;
}