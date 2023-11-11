#include <stdio.h>

int main(void) {

	printf("*--- 회원 가입 페이지 ---*\n");

	char memberName[256];
	printf("이름을 입력하세요 : ");
	scanf_s("%s", memberName, (unsigned)sizeof(memberName));

	char memberID[256];
	printf("원하는 아이디(ID)를 입력하세요 : ");
	scanf_s("%s", memberID, (unsigned)sizeof(memberID));

	int memberAge;
	printf("나이를 입력하세요 : ");
	scanf_s("%d", &memberAge);

	char memberBirthDate[256];
	printf("생일을 입력하세요(0000.00.00) : ");
	scanf_s("%s", memberBirthDate, (unsigned)sizeof(memberBirthDate));

	int memberShoeSize;
	printf("신발 크기를 입력하세요(mm) : ");
	scanf_s("%d", &memberShoeSize);

	printf("\n\n");
	printf("*-------- 회원 정보 --------*\n");
	printf("이름\t\t: %s\n", memberName);
	printf("아이디\t\t: %s\n", memberID);
	printf("나이\t\t: %d세\n", memberAge);
	printf("생일\t\t: %s\n", memberBirthDate);
	printf("신발 크기\t: %dmm\n", memberShoeSize);

	return 0;
}