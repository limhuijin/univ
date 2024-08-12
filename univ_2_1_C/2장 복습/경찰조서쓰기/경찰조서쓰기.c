#include <stdio.h>

int main(void)
{
	char name[20], crime[30];
	int age;
	float kg, cm;

	printf("이름이 뭐예요? ");
	scanf_s("%s", name, sizeof(name));
	printf("몇 살이에요? ");
	scanf_s("%d", &age);
	printf("몸무게는 몇 kg이에요? ");
	scanf_s("%f", &kg);
	printf("키는 몇 cm예요? ");
	scanf_s("%f", &cm);
	printf("어떤 범죄를 저질렀어요? ");
	scanf_s("%s", crime, sizeof(crime));

	printf("\n\n--- 범죄자 정보 ---\n\n");
	printf("이름\t: %s\n", name);
	printf("나이\t: %d\n", age);
	printf("몸무게\t: %.1f\n", kg);
	printf("키\t: %.1f\n", cm);
	printf("범죄명\t: %s\n", crime);

	return 0;
}