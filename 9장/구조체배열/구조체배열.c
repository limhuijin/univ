#include <stdio.h>
#include <stdlib.h>

//���� ����ü ����
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
	GInfo BestGame[3] = { {"��Ÿũ����Ʈ", 1998, 50000, "���ڵ�" },
	{"���� ���� ������", 2008, 0, "���̾�������"},
	{"���� ������ ������", 1970, 20000, "���ٵ�"}
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
	printf("%8s : %22s\n", "�����̸�", ptrG->name);
	printf("%8s : %22d\n", "�߸ſ���", ptrG->year);
	printf("%8s : %22d\n", "�ǸŰ���", ptrG->price);
	printf("%8s : %22s\n", "���ۻ�", ptrG->company);
	printf("%8s : %22s\n", "���ð���", ptrG->friendGame->name);

	printf("\n");
}