#include <stdio.h>

//전역 주조체 정의
struct GameInfo
{
	char* name;
	int year;
	int price;
	char* company;
};

void printGameInfo(struct GameInfo* pG);

int main() {
	struct GameInfo myGame1, myGame2;

	myGame1.name = "슈퍼마리오";
	myGame1.year = 1970;
	myGame1.price = 20000;
	myGame1.company = "닌텐도";

	myGame2 = myGame1;
	myGame2.name = "Super Mario Brothers";
	myGame2.company = "Nintendo";

	printGameInfo(&myGame1);

	printGameInfo(&myGame2);

	return 0;
}

void printGameInfo(struct GameInfo* ptrG)
{
	printf("[%s] - %d년 - %d원 (%s)\n", ptrG->name, ptrG->year, ptrG->price, ptrG->company);
}