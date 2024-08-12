#include <stdio.h>
#include <stdlib.h>

//전역 주조체 정의
typedef struct GameInfo
{
	char* name;
	int year;
	int price;
	char* company;
	struct GameInfo* friendGame;
} GInfo ;

void printGameInfo(GInfo* pG);

int main() {
	GInfo BestGame[3] = { {"스타크래프트", 1998, 50000, "블리자드" },
	{"리그 오브 레전드", 2008, 0, "라이엇게임즈"},
	{"슈퍼 마리오 브라더스", 1970, 20000, "닌텐도"}
	};

	BestGame[0].friendGame = &BestGame[1];
	BestGame[1].friendGame = &BestGame[2];
	BestGame[2].friendGame = &BestGame[0];

	system("cls");
	for (int i = 0; i < 3; i++)
	{
		printGameInfo(&BestGame[i]);
	}

	return 0;
}

void printGameInfo(GInfo* ptrG)
{
	int l = 34;
	char* title = "< Game Info >";
	int w = strlen(title);
	char* spacer = "========";

	printf("|%-*s%*s%*s|\n\n", (l - w) / 2, spacer, (l - w) / 2, title, (l - w) / 2, spacer);
	printf("%8s : %22s\n", "게임이름", ptrG->name);
	printf("%8s : %22d\n", "발매연도", ptrG->year);
	printf("%8s : %22d\n", "판매가격", ptrG->price);
	printf("%8s : %22s\n", "제작사", ptrG->company);
	printf("%8s : %22s\n", "관련게임", ptrG->friendGame->name);

	printf("\n");
}