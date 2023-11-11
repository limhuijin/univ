#include <stdio.h>

int main(void)
{
	/*char name[256], what[256];
	int age;
	float weight, height;

	printf("이름이 뭐예요? ");
	scanf_s("%s", name, sizeof(name));
	printf("몇 살이에요? ");
	scanf_s("%d", &age);
	printf("몸무게는 몇 kg이에요? ");
	scanf_s("%f", &weight);
	printf("키는 몇 cm예요? ");
	scanf_s("%f", &height);
	printf("어떤 범죄를 저질럿어요? ");
	scanf_s("%s", what, sizeof(what));

	printf("\n\n --- 범죄자 정보 ---\n\n");
	printf("이름   : %s\n", name);
	printf("나이   : %d\n", age);
	printf("몸무게 : %.1f\n", weight);
	printf("키     : %.1f\n", height);
	printf("범죄명 : %s\n", what);*/

	//쇼핑몰 회원가입
	char name[256], id[256];
	int age, birth, size;

	printf("이름 :  ");
	scanf_s("%s", name, sizeof(name));
	printf("아이디 : ");
	scanf_s("%s", id, sizeof(id));
	printf("나이 : ");
	scanf_s("%d", &age);
	printf("생일 : ");
	scanf_s("%d", &birth);
	printf("신발 크기 : ");
	scanf_s("%d", &size);

	printf("\n\n --- 회원 정보 ---\n\n");
	printf("이름      : %s\n", name);
	printf("아이디    : %s\n", id);
	printf("나이      : %d\n", age);
	printf("생일      : %d\n", birth);
	printf("신발 크기 : %d\n", size);


	return 0;
}