#include <stdio.h>

int main()
{
	int age;

	printf("나이 입력 : ");
	scanf_s("%d", &age);

	switch (age)
	{
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
		case 13:
			printf("초등학생입니다.");
			break;
		case 14:
		case 15:
		case 16:
			prtinf("중학생입니다.");
			break;
		case 17:
		case 18:
		case 19:
			prtinf("고등학생입니다.");
			break;
		default:
			printf("청소년이 아닙니다.");
			break;
	}
	return 0;
}