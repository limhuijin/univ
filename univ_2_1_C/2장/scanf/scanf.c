#include <stdio.h>

int main(void)
{
	/*int one, two, three;

	printf("정수 3개를 입력하세요 : ");
	scanf_s("%d %d %d", &one, &two, &three);
	printf("첫 번째 값 : %d\n", one);
	printf("첫 번째 값 : %d\n", two);
	printf("첫 번째 값 : %d\n", three);*/


	char hometown[256];
	int birthYear ;

	printf("태어난 도시 : ");
	scanf_s("%s", hometown, sizeof(hometown));
	printf("태어난 연도 : ");
	scanf_s("%d", &birthYear);
	printf("태어난 도시 : %s\n", hometown);
	printf("태어난 연도 : %d\n", birthYear);

	return 0;
}