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
		printf("����\n");
		break;
	case 1:
		printf("����\n");
		break;
	case 2:
		prntf("��\n");
		break;
	default:
		printf("�����\n");
		break;
	}
}