#define _CRT_SECURE_NO_WARNINGS    
#include <stdio.h>
#include <string.h>    // strcpy �Լ� (������ ���ڿ��� �������� �ϴ� �Լ�)
#include <stdlib.h>    // rand �Լ� (���� �� ���� �Լ�)
#include <time.h>      // time �Լ� (�ð��� ���)
#include <Windows.h>   // Sleep, system �Լ� (���Ǽ��� ���� ���)

int stagelevel = 0;     //�������� ����
int motion = 0;         //�÷��̾� �ൿ
int monsterrand = 0;    //���� �ൿ ������
int talkrand = 0;       //��ȭ ������
int chat_Monster = 0;   //���� ��� ������
int chat_Player = 0;    //���� ��� ������

int gameStart = 1;      //���� ���۰�


void f_PrintPlayer(struct Player* player);                                      //�÷��̾� ���� ���
void f_PrintMonster(struct Monster* monster);                                   //���� ���� ���
void f_PlayerInput(struct Player* player, struct Monster* monster);             //�÷��̾� ���
void f_MonsterInput(struct Player* player, struct Monster* monster);            //���� ���
void f_present(struct Player* player);                      //�������� Ŭ���� �� ����
void f_GameStart();                                         //���� ����
void f_GameOver();                                          //���� ����
void f_GameClear();                                         //���� Ŭ����
void f_StageStart(struct Player* player, struct Monster* monster);      //�������� ����
void f_GameInform();                                        //���� ���� ���
void f_GameInformp();                                       //���� ������ ��� ���� ���


struct Player           //�÷��̾� ����ü ����
{

    char name[21];              //�̸�
    int health;                 //ü��
    int hit;                    //���ݷ�
    int playercritical;         //��ȭ����
    int playerheal;             //�÷��̾� ����
    char print_Player[3][157];   //�÷��̾� ���

};

struct Monster          //�� ����ü ����
{

    char name[31];                  //�� �̸�
    int health;                     //�� ü��
    int hit;                        //�� ���ݷ�
    char print_Monster_info[100];    //�� ����
    char print_Monster[3][123];      //�� ���

};

int main()
{
    struct Player player_s;
    struct Player* player = &player_s;          // �����ͷ� �Ҵ�

    struct Monster monster_s[10];
    struct Monster* monster[10];                // �����ͷ� �Ҵ�

    int size_Monster = sizeof(monster) / sizeof(monster[0]);

    for (int i = 0; i < size_Monster; i++)         //������ ������ ũ�� ���ϱ�
    {
        monster[i] = &monster_s[i];
    }

    /* ���� �ʱ�ȭ */
    strcpy(player->name, "�÷��̾�");
    player->health = 30;
    player->hit = 7;
    player->playercritical = 3;
    player->playerheal = 3;
    strcpy(player->print_Player[0], "�����ض�!");
    strcpy(player->print_Player[1], "�� ������ ��������!");
    strcpy(player->print_Player[2], "�׿��ָ�!");

    strcpy(monster[0]->name, "������");
    monster[0]->health = 10;
    monster[0]->hit = 3;
    strcpy(monster[0]->print_Monster_info, "�������� ����Ÿ��� ��Ÿ����!\n...���� ���־� ���δ�.");
    strcpy(monster[0]->print_Monster_info, "�������� ����Ÿ��� ��Ÿ����!\n...���� ���־� ���δ�.");
    strcpy(monster[0]->print_Monster[0], "...(������� �𸣰ڴ�.)");
    strcpy(monster[0]->print_Monster[1], "...(���� ���� ���� ���ϴµ� �ϴ�.)");
    strcpy(monster[0]->print_Monster[2], "...(�ϰ���� ���� �ִ� �� ����.)");

    strcpy(monster[1]->name, "���� ���");
    monster[1]->health = 14;
    monster[1]->hit = 7;
    strcpy(monster[1]->print_Monster_info, "���� �ڿ��� ���� ����� ��Ÿ����!\n��г��ڰ� �����ִ�.");
    strcpy(monster[1]->print_Monster[0], "ŰŰ�f!(���ó� ��г��ڰ� ���´�.)");
    strcpy(monster[1]->print_Monster[1], "ļ�Ɲ�!(�����ϰ� �ִ°� ����.)");
    strcpy(monster[1]->print_Monster[2], "�����R!(��... ������.)");

    strcpy(monster[2]->name, "ŷ������");
    monster[2]->health = 20;
    monster[2]->hit = 7;
    strcpy(monster[2]->print_Monster_info, "ŷ�������� ���ֽ��� ��Ÿ����!\n�հ��� ��� ������?");
    strcpy(monster[2]->print_Monster[0], "...(���ó� ���� ���Ѵ�.)");
    strcpy(monster[2]->print_Monster[1], "...(����... ��Ǯ����?)");
    strcpy(monster[2]->print_Monster[2], "..(������ óġ����.)");

    strcpy(monster[3]->name, "�������");
    monster[3]->health = 23;
    monster[3]->hit = 10;
    strcpy(monster[3]->print_Monster_info, "�������� ��������� ��Ÿ����!\n���� �������ΰ� ������ �������.");
    strcpy(monster[3]->print_Monster[0], "���⼭...������..!(�ƹ����� ������ ħ���ѵ� �ϴ�.)");
    strcpy(monster[3]->print_Monster[1], "Ű�ƾƾƾ�!(�����ϰ� �ִ�.)");
    strcpy(monster[3]->print_Monster[2], "...(������ â�� ��� �ڼ��� ����ִ�.)");

    strcpy(monster[4]->name, "ũ��Ŀ����");
    monster[4]->health = 28;
    monster[4]->hit = 12;
    strcpy(monster[4]->print_Monster_info, "���� ȣ������ ũ��Ŀ������ ��Ÿ����!\n�� ����... ��Ұ� ����.");
    strcpy(monster[4]->print_Monster[0], "ũ������...(���� ������ �ο��غ� �ϰ��ִ�.)");
    strcpy(monster[4]->print_Monster[1], "ũ�ƾƾƾ�!(�Ҹ��� ������ �����ϰ� �ִ�.)");
    strcpy(monster[4]->print_Monster[2], "ũ������...(�����ؾ߰ڴ�...)");

    strcpy(monster[5]->name, "���� ����");
    monster[5]->health = 31;
    monster[5]->hit = 15;
    strcpy(monster[5]->print_Monster_info, "��¦�̴� ������ ���� ������ ��Ÿ����!\n��� ���������� �𸣰ڴ�.");
    strcpy(monster[5]->print_Monster[0], "...(��... ���� ���ϴ°ǰ�?)");
    strcpy(monster[5]->print_Monster[1], "...(��¦�Ÿ��� �ִ�.�ƹ����� ������� ��.)");
    strcpy(monster[5]->print_Monster[2], "...(������ �������� ����� �ִ�.)");

    strcpy(monster[6]->name, "�巹��ũ");
    monster[6]->health = 39;
    monster[6]->hit = 17;
    strcpy(monster[6]->print_Monster_info, "��û�� ���̴� �巹��ũ�� ��Ÿ����!\n�����ĵ� �����̴� ������� ����.");
    strcpy(monster[6]->print_Monster[0], "ũ������!(�ڿ� ��Ź�� �ִ�. �Ļ�ð��� �����Ѱ� ����.)");
    strcpy(monster[6]->print_Monster[1], "ũ������...(�ȸµ��� ��������.)");
    strcpy(monster[6]->print_Monster[2], "ũ������...(�Կ� �ǰ� �ִ�. �Ļ�ð��� �����Ѱ� ����.)");

    strcpy(monster[7]->name, "ı��");
    monster[7]->health = 50;
    monster[7]->hit = 18;
    strcpy(monster[7]->print_Monster_info, "���̸� ����ִ� ı�İ� ��Ÿ����.!\n...���ɷ� �ķ�ġ�� �ʰ���?");
    strcpy(monster[7]->print_Monster[0], "���� �ʴ�!(���� ���� ����� �ϴ�.)");
    strcpy(monster[7]->print_Monster[1], "...��(������ ȭ�� ���� ����.)");
    strcpy(monster[7]->print_Monster[2], "���� ����!(���̸� ��� �����ϰ��ִ�. ...��¥ ���� �����ΰ�?)");

    strcpy(monster[8]->name, "�̳� ��");
    monster[8]->health = 300;
    monster[8]->hit = 10;
    strcpy(monster[8]->print_Monster_info, "�����Ÿ��� �Ҹ��� �Բ� ���� �︰��...\n�̳� ���� ��Ÿ����!");
    strcpy(monster[8]->print_Monster[0], "...��(�����϶����� ���� �︮�� �ִ�.)");
    strcpy(monster[8]->print_Monster[1], "..��..��(���� �ٰ����� �ִ�.)");
    strcpy(monster[8]->print_Monster[2], "..��..��..��(�߽��� ��� �����.)");

    strcpy(monster[9]->name, "����Ʈ");
    monster[9]->health = 75;
    monster[9]->hit = 25;
    strcpy(monster[9]->print_Monster_info, "��û�� ũ���� ������ ��Ÿ����!\n������ ���� ���̴µ� �ϴ�.");
    strcpy(monster[9]->print_Monster[0], "���� �ΰ��� ���� ���� ���� �ƴϴ�!(�� �� ������ ������.)");
    strcpy(monster[9]->print_Monster[1], "�� ������!(�ݵ�� ���̰ڴ�.)");
    strcpy(monster[9]->print_Monster[2], "ũ�ƾƾƾ�!!(�����Ҹ��� �� ���� ������ �ִ�. �����ϵ��� ����.)");
    /* ���� �ʱ�ȭ */

    do
    {
        f_GameStart();

    } while (gameStart);

    for (stagelevel = 0; stagelevel < size_Monster; stagelevel)
    {
        f_StageStart(player, monster[stagelevel]);       //�÷��̾�� ������ ������ ���� ����
    }

    f_GameClear();

    return 0;
}

void f_PrintPlayer(struct Player* player)               //�÷��̾� ���� ���
{
    printf("=========================================\n");
    printf("==                                     ==\n");
    printf("        �̸� : %s, ü��: %d\n", player->name, player->health);
    printf("==                                     ==\n");
    printf("=========================================\n\n");
}

void f_PrintMonster(struct Monster* monster)            //���� ���� ���
{
    printf("=========================================\n");
    printf("==                                     ==\n");
    printf("  �̸� : %s, ü�� : %d, ���ݷ� : %d\n", monster->name, monster->health, monster->hit);
    printf("==                                     ==\n");
    printf("=========================================\n\n");
}

void f_PlayerInput(struct Player* player, struct Monster* monster)      //�÷��̾� ���
{
    printf("\n� �ൿ�� �ұ�?\n\n1[�⺻����] 2[��ȭ����] 3[��] 4[��ȭ�� �õ��Ѵ�] : ");
    scanf("%d", &motion);

    if (motion != 1 && motion != 2 && motion != 3 && motion != 4)
    {
        printf("\n�׷� �ൿ�� ����!\n\n");
        f_PlayerInput(player, monster);
    }
    else
    {
        switch (motion)
        {
        case 1:

            printf("\n=========================================\n");
            printf("==                                     ==\n");
            printf("     �⺻ ������ ����Ͽ���!\n");
            printf("==                                     ==\n");
            printf("=========================================\n");
            Sleep(1000);

            printf("==                                     ==\n");
            printf("     %d�� �������� �־���!\n", player->hit);
            printf("==                                     ==\n");
            printf("=========================================\n\n");
            Sleep(1500);

            monster->health -= player->hit;

            break;

        case 2:

            printf("\n=========================================\n");
            printf("==                                     ==\n");
            printf("    ��ȭ ������ ����Ͽ���!\n");
            printf("==                                     ==\n");
            printf("=========================================\n");
            Sleep(1000);

            printf("==                                     ==\n");
            printf("    %d�� �������� �־���\n", player->playercritical);
            printf("==                                     ==\n");
            printf("=========================================\n");
            Sleep(1500);


            monster->health -= player->playercritical;
            player->playercritical++;
            printf("==                                     ==\n");
            printf("  ��ȭ������ ���ݷ��� 1 ����ߴ�. ���� %d\n", player->playercritical);
            printf("==                                     ==\n");
            printf("=========================================\n\n");
            Sleep(1500);

            break;

        case 3:

            printf("\n===================================\n");
            printf("==                               ==\n");
            printf("    ü���� ȸ���Ѵ�.\n");
            printf("==                               ==\n");
            printf("===================================\n");
            Sleep(1000);

            printf("==                               ==\n");
            printf("    %d�� ü���� ȸ���ߴ�.\n", player->playerheal);
            printf("==                               ==\n");
            printf("===================================\n\n");
            Sleep(1500);

            player->health += player->playerheal;

            break;

        case 4:

            printf("==============================\n");
            printf("==                          ==\n");
            printf("   ����� ��ȭ�� �õ��Ѵ�.\n");
            printf("   �����ߴ�.\n");
            printf("==                          ==\n");
            printf("==============================\n\n");

            break;
        }
    }
}

void f_MonsterInput(struct Player* player, struct Monster* monster)      //���� ���
{
    printf("\n���� ����\n\n");

    srand((unsigned int)time(NULL));
    monsterrand = rand() % 10;

    if (monsterrand >= 3)
    {

        printf("===========================================\n");
        printf("==                                       ==\n");
        printf("   %s�� ����!\n", monster->name);
        printf("==                                       ==\n");
        printf("===========================================\n");
        Sleep(1000);
        printf("==                                       ==\n");
        printf("   %s�� ���� %d�� �������� �Ծ���\n", monster->name, monster->hit);
        printf("==                                       ==\n");
        printf("===========================================\n\n");
        Sleep(2000);

        system("cls");

        player->health -= monster->hit;
    }
    else if (monsterrand >= 0)
    {

        printf("=======================================\n");
        printf("==                                   ==\n");
        printf("  %s��(��) �ƹ��͵� ���� �ʾҴ�.\n", monster->name);
        printf("==                                   ==\n");
        printf("=======================================\n\n");
        Sleep(2000);

        system("cls");
    }
}

void f_present(struct Player* player)       //�������� Ŭ���� �� ����
{
    int upStat = 0;

    Sleep(1000);

    printf("���ú���\n");
    Sleep(1000);

    printf("\n������ų �ɷ�ġ�� �����ϼ���.\n");
    printf("�̿��� ���� �� �ƹ��� �ɷ�ġ�� ������ �ʽ��ϴ�.\n\n");
    printf("[1]�⺻����[2]ü��[3]ȸ���� : ");
    scanf("%d", &upStat);

    switch (upStat)
    {
    case 1:

        printf("\n======================================\n");
        printf("==                                  ==\n");
        printf("      ���ݷ��� 3 �ö����ϴ�.\n");
        printf("==                                  ==\n");
        printf("======================================\n");

        player->hit += 3;

        break;

    case 2:

        printf("\n======================================\n");
        printf("==                                  ==\n");
        printf("      ü���� 7 �ö����ϴ�.\n");
        printf("==                                  ==\n");
        printf("======================================\n");

        player->health += 7;

        break;

    case 3:

        printf("\n======================================\n");
        printf("==                                  ==\n");
        printf("     ü�� ȸ������ 3 �ö����ϴ�.\n");
        printf("==                                  ==\n");
        printf("======================================\n");

        player->playerheal += 3;

        break;

    default:

        printf("\n======================================\n");
        printf("==                                  ==\n");
        printf("   �ƹ� ��ȭ�� �����ϴ�.\n");
        printf("==                                  ==\n");
        printf("======================================\n");

        break;
    }
}

void f_GameStart()      //���� ����
{
    int select = 0;

    printf("        ========================================================\n");
    printf("        ===                                                  ===\n");
    printf("        ===                                                  ===\n");
    printf("        ===             �α׶���ũ �ؽ�Ʈ rpg                ===\n");
    printf("        ===                                                  ===\n");
    printf("        ===                                                  ===\n");
    printf("        ========================================================\n\n");


    printf("������ 1.���� ����\n");
    printf("       2.���� ����\n ");
    printf("      3.���� �����\n");
    scanf("%d", &select);

    switch (select)
    {
    case 1:

        printf("        ==========================\n");
        printf("        ==                      ==\n");
        printf("        ==  ������ �����մϴ�!  ==\n");
        printf("        ==                      ==\n");
        printf("        ==========================\n");
        Sleep(1000);

        gameStart = 0;

        system("cls");

        break;

    case 2:
        f_GameInform();            //���� ���� ���

        break;

    case 3:
        f_GameInformp();           //���� ������ ��� ���� ���

        break;

    default:
        printf("�ٽ� �Է����ּ���.\n\n");

        break;
    }
}


void f_GameOver()       //���� ����
{
    system("cls");
    printf("\n===================================================\n");
    printf("==                                               ==\n");
    printf("       �÷��̾��� ü���� 0�� �Ǿ���Ƚ��ϴ�.\n");
    printf("     ����� ������ ���� �������� ���Ͽ����ϴ�...\n");
    printf("==                                               ==\n");
    printf("===================================================\n");


    exit(0);
}

void f_GameClear()      //���� Ŭ����
{
    system("cls");
    printf("\n===============================================\n");
    printf("==                                           ==\n");
    printf("              ���ϵ帳�ϴ�!\n");
    printf("   �ҿ��� �̷� �� �ִٴ� �ҹ��� ��¥�ϱ��?\n");
    printf("==                                           ==\n");
    printf("===============================================\n");

    exit(0);
}

void f_StageStart(struct Player* player, struct Monster* monster)       //�������� ����
{
    printf("\n��%d ������ �����Ͽ���.\n\n", stagelevel + 1);
    Sleep(1000);

    printf("\n%s\n", monster->print_Monster_info);
    Sleep(2000);

    while (monster->health > 0)
    {
        srand((unsigned int)time(NULL));                  // ���� �Լ� �ʱ�ȭ

        chat_Player = rand() % 3;           //0���� 2������ �� �� �������� �� ���ڸ� ������ ����
        chat_Monster = rand() % 3;

        printf("\n�÷��̾� : ");
        printf("%s\n\n", player->print_Player[chat_Player]);

        f_PrintPlayer(player);              //�÷��̾� ���� ���

        printf("%s : ", monster->name);
        printf("%s\n\n", monster->print_Monster[chat_Monster]);
        f_PrintMonster(monster);            //���� ���� ���

        f_PlayerInput(player, monster);     //�÷��̾� �ൿ

        if (monster->health > 0)
        {
            f_MonsterInput(player, monster);
        }

        if (player->health <= 0)
        {
            f_GameOver();
        }
    }

    printf("\n���� �����߷Ƚ��ϴ�.\n\n");
    Sleep(1000);

    printf("���� ����\n");
    Sleep(1000);

    printf("\n======================================\n");
    printf("==                                  ==\n");
    printf("        ü���� 3 �ö����ϴ�.\n");
    printf("==                                  ==\n");
    printf("======================================\n\n");
    player->health += 3;

    f_present(player);
    Sleep(1000);

    printf("==                                  ==\n");
    printf("   ���� ���������� �̵��մϴ�.\n");
    printf("==                                  ==\n");
    printf("======================================\n");
    Sleep(1500);

    system("cls");

    stagelevel++;
}

void f_GameInform()     //���� ���� ���
{
    system("cls");
    printf("        =====================================================================\n");
    printf("        ===                                                               ===\n");
    printf("        ===               �� ���� �ȿ��� ���Ͱ� �����ϴ�.               ===\n");
    printf("        ===  ������ ���� �����ϸ� �ҿ��� �̷� �� �ִٴ� �ҹ��� �ֽ��ϴ�.  ===\n");
    printf("        ===             ���� ����� ������ ������ �� �������?            ===\n");
    printf("        ===                                                               ===\n");
    printf("        =====================================================================\n");

}

void f_GameInformp()    //���� ������ ��� ���� ���
{
    system("cls");
    //��������
}