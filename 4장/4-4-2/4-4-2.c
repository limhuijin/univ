#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main()
{
	srand(time(NULL));
	int i = rand() % 3;

	switch (i)
	{
	case 0: 
		printf("가위\n");
		break;
	case 1:
		printf("바위\n");
		break;
	case 2:
		prntf("보\n");
		break;
	default:
		printf("몰라요\n");
		break;
	}
}