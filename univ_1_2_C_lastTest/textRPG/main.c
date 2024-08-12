#define _CRT_SECURE_NO_WARNINGS    
#include <stdio.h>
#include <string.h>    // strcpy ÇÔ¼ö (¾çÂÊÀÇ ¹®ÀÚ¿­À» °°¾ÆÁö°Ô ÇÏ´Â ÇÔ¼ö)
#include <stdlib.h>    // rand ÇÔ¼ö (·£´ı ¼ö »ı¼º ÇÔ¼ö)
#include <time.h>      // time ÇÔ¼ö (½Ã°£À» »ç¿ë)
#include <Windows.h>   // Sleep, system ÇÔ¼ö (ÆíÀÇ¼ºÀ» À§ÇØ »ç¿ë)

int stagelevel = 0;     //½ºÅ×ÀÌÁö ·¹º§
int motion = 0;         //ÇÃ·¹ÀÌ¾î Çàµ¿
int monsterrand = 0;    //¸ó½ºÅÍ Çàµ¿ ·£´ı°ª
int talkrand = 0;       //´ëÈ­ ·£´ı°ª
int chat_Monster = 0;   //¸ó½ºÅÍ ´ë»ç ·£´ı°ª
int chat_Player = 0;    //¸ó½ºÅÍ ´ë»ç ·£´ı°ª

int gameStart = 1;      //°ÔÀÓ ½ÃÀÛ°ª


void f_PrintPlayer(struct Player* player);                                      //ÇÃ·¹ÀÌ¾î Á¤º¸ Ãâ·Â
void f_PrintMonster(struct Monster* monster);                                   //¸ó½ºÅÍ Á¤º¸ Ãâ·Â
void f_PlayerInput(struct Player* player, struct Monster* monster);             //ÇÃ·¹ÀÌ¾î ¸ğ¼Ç
void f_MonsterInput(struct Player* player, struct Monster* monster);            //¸ó½ºÅÍ ¸ğ¼Ç
void f_present(struct Player* player);                      //½ºÅ×ÀÌÁö Å¬¸®¾î ½Ã º¸»ó
void f_GameStart();                                         //°ÔÀÓ ½ÃÀÛ
void f_GameOver();                                          //°ÔÀÓ ¿À¹ö
void f_GameClear();                                         //°ÔÀÓ Å¬¸®¾î
void f_StageStart(struct Player* player, struct Monster* monster);      //½ºÅ×ÀÌÁö ½ÃÀÛ
void f_GameInform();                                        //°ÔÀÓ Á¤º¸ Ãâ·Â
void f_GameInformp();                                       //°ÔÀÓ Á¦ÀÛÇÑ »ç¶÷ Á¤º¸ Ãâ·Â


struct Player           //ÇÃ·¹ÀÌ¾î ±¸Á¶Ã¼ ¼±¾ğ
{

    char name[21];              //ÀÌ¸§
    int health;                 //Ã¼·Â
    int hit;                    //°ø°İ·Â
    int playercritical;         //°­È­°ø°İ
    int playerheal;             //ÇÃ·¹ÀÌ¾î Èú·®
    char print_Player[3][157];   //ÇÃ·¹ÀÌ¾î ´ë»ç

};

struct Monster          //Àû ±¸Á¶Ã¼ ¼±¾ğ
{

    char name[31];                  //Àû ÀÌ¸§
    int health;                     //Àû Ã¼·Â
    int hit;                        //Àû °ø°İ·Â
    char print_Monster_info[100];    //Àû Á¤º¸
    char print_Monster[3][123];      //Àû ´ë»ç

};

int main()
{
    struct Player player_s;
    struct Player* player = &player_s;          // Æ÷ÀÎÅÍ·Î ÇÒ´ç

    struct Monster monster_s[10];
    struct Monster* monster[10];                // Æ÷ÀÎÅÍ·Î ÇÒ´ç

    int size_Monster = sizeof(monster) / sizeof(monster[0]);

    for (int i = 0; i < size_Monster; i++)         //»çÀÌÁî ¿ÀÇÁ·Î Å©±â ±¸ÇÏ±â
    {
        monster[i] = &monster_s[i];
    }

    /* Á¤º¸ ÃÊ±âÈ­ */
    strcpy(player->name, "ÇÃ·¹ÀÌ¾î");
    player->health = 30;
    player->hit = 7;
    player->playercritical = 3;
    player->playerheal = 3;
    strcpy(player->print_Player[0], "°¢¿ÀÇØ¶ó!");
    strcpy(player->print_Player[1], "³» °¥±æÀ» ¸·Áö¸¶¶ó!");
    strcpy(player->print_Player[2], "Á×¿©ÁÖ¸¶!");

    strcpy(monster[0]->name, "½½¶óÀÓ");
    monster[0]->health = 10;
    monster[0]->hit = 3;
    strcpy(monster[0]->print_Monster_info, "½½¶óÀÓÀÌ ÅëÅë°Å¸®¸ç ³ªÅ¸³µ´Ù!\n...¹º°¡ ¸ÀÀÖ¾î º¸ÀÎ´Ù.");
    strcpy(monster[0]->print_Monster_info, "½½¶óÀÓÀÌ ÅëÅë°Å¸®¸ç ³ªÅ¸³µ´Ù!\n...¹º°¡ ¸ÀÀÖ¾î º¸ÀÎ´Ù.");
    strcpy(monster[0]->print_Monster[0], "...(¹¹¶ó´ÂÁö ¸ğ¸£°Ú´Ù.)");
    strcpy(monster[0]->print_Monster[1], "...(ÀÔÀÌ ¾ø¾î ¸»À» ¸øÇÏ´Âµí ÇÏ´Ù.)");
    strcpy(monster[0]->print_Monster[2], "...(ÇÏ°í½ÍÀº ¸»ÀÌ ÀÖ´Â °Í °°´Ù.)");

    strcpy(monster[1]->name, "½ÀÁö °íºí¸°");
    monster[1]->health = 14;
    monster[1]->hit = 7;
    strcpy(monster[1]->print_Monster_info, "³ª¹« µÚ¿¡¼­ ½ÀÁö °íºí¸°ÀÌ ³ªÅ¸³µ´Ù!\n±âºĞ³ª»Ú°Ô ¿ô°íÀÖ´Ù.");
    strcpy(monster[1]->print_Monster[0], "Å°Å°µf!(¿ª½Ã³ª ±âºĞ³ª»Ú°Ô ¿ô´Â´Ù.)");
    strcpy(monster[1]->print_Monster[1], "Ä¼¾ÆÚ!(À§ÇùÇÏ°í ÀÖ´Â°Í °°´Ù.)");
    strcpy(monster[1]->print_Monster[2], "È÷È÷ÆR!(Âì... ´õ·´´Ù.)");

    strcpy(monster[2]->name, "Å·½½¶óÀÓ");
    monster[2]->health = 20;
    monster[2]->hit = 7;
    strcpy(monster[2]->print_Monster_info, "Å·½½¶óÀÓÀÌ ½º¸Ö½º¸Ö ³ªÅ¸³µ´Ù!\n¿Õ°üÀº ¾îµğ¼­ ³­°ÅÁö?");
    strcpy(monster[2]->print_Monster[0], "...(¿ª½Ã³ª ¸»À» ¸øÇÑ´Ù.)");
    strcpy(monster[2]->print_Monster[1], "...(¸öÀ»... ºÎÇ®¸°´Ù?)");
    strcpy(monster[2]->print_Monster[2], "..(ºü¸£°Ô Ã³Ä¡ÇÏÀÚ.)");

    strcpy(monster[3]->name, "¸®Àúµå¸Ç");
    monster[3]->health = 23;
    monster[3]->hit = 10;
    strcpy(monster[3]->print_Monster_info, "´ËÁö¿¡¼­ ¸®Àúµå¸ÇÀÌ ³ªÅ¸³µ´Ù!\n¾ó±¼ÀÌ µµ¸¶¹ìÀÎ°Ô ±²ÀåÈ÷ ¸ø»ı°å´Ù.");
    strcpy(monster[3]->print_Monster[0], "¿©±â¼­...³ª°¡¶ó..!(¾Æ¹«·¡µµ ¿µ¿ªÀ» Ä§¹üÇÑµí ÇÏ´Ù.)");
    strcpy(monster[3]->print_Monster[1], "Å°¾Æ¾Æ¾Æ¾Æ!(À§ÇùÇÏ°í ÀÖ´Ù.)");
    strcpy(monster[3]->print_Monster[2], "...(Á¶¿ëÈ÷ Ã¢À» µé°í ÀÚ¼¼¸¦ Àâ°íÀÖ´Ù.)");

    strcpy(monster[4]->name, "Å©·ÎÄ¿´ÙÀÏ");
    monster[4]->health = 28;
    monster[4]->hit = 12;
    strcpy(monster[4]->print_Monster_info, "¾ÕÀÇ È£¼ö¿¡¼­ Å©·ÎÄ¿´ÙÀÏÀÌ ³ªÅ¸³µ´Ù!\nÀú °¡Á×... ºñ½Ò°Í °°´Ù.");
    strcpy(monster[4]->print_Monster[0], "Å©¸£¸£¸£...(ÀÔÀ» ¹ú¸®°í ½Î¿ïÁØºñ¸¦ ÇÏ°íÀÖ´Ù.)");
    strcpy(monster[4]->print_Monster[1], "Å©¾Æ¾Æ¾Æ¾Æ!(¼Ò¸®¸¦ Áö¸£¸ç À§ÇùÇÏ°í ÀÖ´Ù.)");
    strcpy(monster[4]->print_Monster[2], "Å©¸£¸£¸£...(Á¶½ÉÇØ¾ß°Ú´Ù...)");

    strcpy(monster[5]->name, "¹°ÀÇ Á¤·É");
    monster[5]->health = 31;
    monster[5]->hit = 15;
    strcpy(monster[5]->print_Monster_info, "¹İÂ¦ÀÌ´Â ¿øÇüÀÇ ¹°ÀÇ Á¤·ÉÀÌ ³ªÅ¸³µ´Ù!\n»ç½Ç Á¤·ÉÀÎÁö´Â ¸ğ¸£°Ú´Ù.");
    strcpy(monster[5]->print_Monster[0], "...(¾î... ¸»À» ¸øÇÏ´Â°Ç°¡?)");
    strcpy(monster[5]->print_Monster[1], "...(¹İÂ¦°Å¸®°í ÀÖ´Ù.¾Æ¹«·¡µµ ³ª°¡¶ó´Â µí.)");
    strcpy(monster[5]->print_Monster[2], "...(ÁÖÀ§¿¡ ¸¶¹ıÁøÀÌ »ı±â°í ÀÖ´Ù.)");

    strcpy(monster[6]->name, "µå·¹ÀÌÅ©");
    monster[6]->health = 39;
    monster[6]->hit = 17;
    strcpy(monster[6]->print_Monster_info, "¸ÛÃ»ÇØ º¸ÀÌ´Â µå·¹ÀÌÅ©°¡ ³ªÅ¸³µ´Ù!\nÀú·¡ºÄµµ ¿ëÁ·ÀÌ´Ï ¹æ½ÉÇÏÁö ¸»ÀÚ.");
    strcpy(monster[6]->print_Monster[0], "Å©¸£¸£¸ª!(µÚ¿¡ ½ÄÅ¹ÀÌ ÀÖ´Ù. ½Ä»ç½Ã°£À» ¹æÇØÇÑ°Í °°´Ù.)");
    strcpy(monster[6]->print_Monster[1], "Å©¸£¸£¸£...(¾È¸Âµµ·Ï Á¶½ÉÇÏÀÚ.)");
    strcpy(monster[6]->print_Monster[2], "Å©¸£¸£¸£...(ÀÔ¿¡ ÇÇ°¡ ÀÖ´Ù. ½Ä»ç½Ã°£À» ¹æÇØÇÑ°Í °°´Ù.)");

    strcpy(monster[7]->name, "Ä±ÆÄ");
    monster[7]->health = 50;
    monster[7]->hit = 18;
    strcpy(monster[7]->print_Monster_info, "¿ÀÀÌ¸¦ µé°íÀÖ´Â Ä±ÆÄ°¡ ³ªÅ¸³µ´Ù.!\n...Àú°É·Î ÈÄ·ÁÄ¡Áø ¾Ê°ÚÁö?");
    strcpy(monster[7]->print_Monster[0], "¹¹¾ß ³Ê´Â!(³ª¸¦ º¸°í ³î¶õµí ÇÏ´Ù.)");
    strcpy(monster[7]->print_Monster[1], "...¹(±²ÀåÈ÷ È­°¡ ³­°Í °°´Ù.)");
    strcpy(monster[7]->print_Monster[2], "Àú¸® ²¨Á®!(¿ÀÀÌ¸¦ µé°í À§ÇùÇÏ°íÀÖ´Ù. ...ÁøÂ¥ Àú°Ô ¹«±âÀÎ°¡?)");

    strcpy(monster[8]->name, "ÀÌ³¢ °ñ·½");
    monster[8]->health = 300;
    monster[8]->hit = 10;
    strcpy(monster[8]->print_Monster_info, "ÄôÄô°Å¸®´Â ¼Ò¸®¿Í ÇÔ²² ¶¥ÀÌ ¿ï¸°´Ù...\nÀÌ³¢ °ñ·½ÀÌ ³ªÅ¸³µ´Ù!");
    strcpy(monster[8]->print_Monster[0], "...Äô(¿òÁ÷ÀÏ¶§¸¶´Ù ¶¥ÀÌ ¿ï¸®°í ÀÖ´Ù.)");
    strcpy(monster[8]->print_Monster[1], "..Äô..Äô(Á¡Á¡ ´Ù°¡¿À°í ÀÖ´Ù.)");
    strcpy(monster[8]->print_Monster[2], "..Äô..Äô..Äô(Áß½ÉÀ» Àâ±â Èûµé´Ù.)");

    strcpy(monster[9]->name, "¼­ÆæÆ®");
    monster[9]->health = 75;
    monster[9]->hit = 25;
    strcpy(monster[9]->print_Monster_info, "¾öÃ»³­ Å©±âÀÇ ¼ö·æÀÌ ³ªÅ¸³µ´Ù!\n´øÀüÀÇ ³¡ÀÌ º¸ÀÌ´Âµí ÇÏ´Ù.");
    strcpy(monster[9]->print_Monster[0], "°¨È÷ ÀÎ°£ÀÌ ¹ßÀ» µéÀÏ °÷ÀÌ ¾Æ´Ï´Ù!(Àú ³ğ¸¸ ÀâÀ¸¸é ³¡³­´Ù.)");
    strcpy(monster[9]->print_Monster[1], "½â ²¨Á®¶ó!(¹İµå½Ã Á×ÀÌ°Ú´Ù.)");
    strcpy(monster[9]->print_Monster[2], "Å©¾Æ¾Æ¾Æ¾Æ!!(¿ïÀ½¼Ò¸®¸¸ µé¾îµµ ¸öÀÌ ¶³¸®°í ÀÖ´Ù. ±äÀåÇÏµµ·Ï ÇÏÀÚ.)");
    /* Á¤º¸ ÃÊ±âÈ­ */

    do
    {
        f_GameStart();

    } while (gameStart);

    for (stagelevel = 0; stagelevel < size_Monster; stagelevel)
    {
        f_StageStart(player, monster[stagelevel]);       //ÇÃ·¹ÀÌ¾î¿Í ¸ó½ºÅÍÀÇ Á¤º¸·Î °ÔÀÓ ½ÃÀÛ
    }

    f_GameClear();

    return 0;
}

void f_PrintPlayer(struct Player* player)               //ÇÃ·¹ÀÌ¾î Á¤º¸ Ãâ·Â
{
    printf("=========================================\n");
    printf("==                                     ==\n");
    printf("        ÀÌ¸§ : %s, Ã¼·Â: %d\n", player->name, player->health);
    printf("==                                     ==\n");
    printf("=========================================\n\n");
}

void f_PrintMonster(struct Monster* monster)            //¸ó½ºÅÍ Á¤º¸ Ãâ·Â
{
    printf("=========================================\n");
    printf("==                                     ==\n");
    printf("  ÀÌ¸§ : %s, Ã¼·Â : %d, °ø°İ·Â : %d\n", monster->name, monster->health, monster->hit);
    printf("==                                     ==\n");
    printf("=========================================\n\n");
}

void f_PlayerInput(struct Player* player, struct Monster* monster)      //ÇÃ·¹ÀÌ¾î ¸ğ¼Ç
{
    printf("\n¾î¶² Çàµ¿À» ÇÒ±î?\n\n1[±âº»°ø°İ] 2[°­È­°ø°İ] 3[Èú] 4[´ëÈ­¸¦ ½ÃµµÇÑ´Ù] : ");
    scanf("%d", &motion);

    if (motion != 1 && motion != 2 && motion != 3 && motion != 4)
    {
        printf("\n±×·± Çàµ¿Àº ¾ø´Ù!\n\n");
        f_PlayerInput(player, monster);
    }
    else
    {
        switch (motion)
        {
        case 1:

            printf("\n=========================================\n");
            printf("==                                     ==\n");
            printf("     ±âº» °ø°İÀ» »ç¿ëÇÏ¿´´Ù!\n");
            printf("==                                     ==\n");
            printf("=========================================\n");
            Sleep(1000);

            printf("==                                     ==\n");
            printf("     %dÀÇ µ¥¹ÌÁö¸¦ ÁÖ¾ú´Ù!\n", player->hit);
            printf("==                                     ==\n");
            printf("=========================================\n\n");
            Sleep(1500);

            monster->health -= player->hit;

            break;

        case 2:

            printf("\n=========================================\n");
            printf("==                                     ==\n");
            printf("    °­È­ °ø°İÀ» »ç¿ëÇÏ¿´´Ù!\n");
            printf("==                                     ==\n");
            printf("=========================================\n");
            Sleep(1000);

            printf("==                                     ==\n");
            printf("    %dÀÇ µ¥¹ÌÁö¸¦ ÁÖ¾ú´Ù\n", player->playercritical);
            printf("==                                     ==\n");
            printf("=========================================\n");
            Sleep(1500);


            monster->health -= player->playercritical;
            player->playercritical++;
            printf("==                                     ==\n");
            printf("  °­È­°ø°İÀÇ °ø°İ·ÂÀÌ 1 »ó½ÂÇß´Ù. ÇöÀç %d\n", player->playercritical);
            printf("==                                     ==\n");
            printf("=========================================\n\n");
            Sleep(1500);

            break;

        case 3:

            printf("\n===================================\n");
            printf("==                               ==\n");
            printf("    Ã¼·ÂÀ» È¸º¹ÇÑ´Ù.\n");
            printf("==                               ==\n");
            printf("===================================\n");
            Sleep(1000);

            printf("==                               ==\n");
            printf("    %dÀÇ Ã¼·ÂÀ» È¸º¹Çß´Ù.\n", player->playerheal);
            printf("==                               ==\n");
            printf("===================================\n\n");
            Sleep(1500);

            player->health += player->playerheal;

            break;

        case 4:

            printf("==============================\n");
            printf("==                          ==\n");
            printf("   ´ç½ÅÀº ´ëÈ­¸¦ ½ÃµµÇÑ´Ù.\n");
            printf("   ½ÇÆĞÇß´Ù.\n");
            printf("==                          ==\n");
            printf("==============================\n\n");

            break;
        }
    }
}

void f_MonsterInput(struct Player* player, struct Monster* monster)      //¸ó½ºÅÍ ¸ğ¼Ç
{
    printf("\n¸ó½ºÅÍ µ¿ÀÛ\n\n");

    srand((unsigned int)time(NULL));
    monsterrand = rand() % 10;

    if (monsterrand >= 3)
    {

        printf("===========================================\n");
        printf("==                                       ==\n");
        printf("   %sÀÇ °ø°İ!\n", monster->name);
        printf("==                                       ==\n");
        printf("===========================================\n");
        Sleep(1000);
        printf("==                                       ==\n");
        printf("   %s¿¡ ÀÇÇØ %dÀÇ µ¥¹ÌÁö¸¦ ÀÔ¾ú´Ù\n", monster->name, monster->hit);
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
        printf("  %sÀº(´Â) ¾Æ¹«°Íµµ ÇÏÁö ¾Ê¾Ò´Ù.\n", monster->name);
        printf("==                                   ==\n");
        printf("=======================================\n\n");
        Sleep(2000);

        system("cls");
    }
}

void f_present(struct Player* player)       //½ºÅ×ÀÌÁö Å¬¸®¾î ½Ã º¸»ó
{
    int upStat = 0;

    Sleep(1000);

    printf("¼±ÅÃº¸»ó\n");
    Sleep(1000);

    printf("\nÁõ°¡½ÃÅ³ ´É·ÂÄ¡¸¦ ¼±ÅÃÇÏ¼¼¿ä.\n");
    printf("ÀÌ¿ÜÀÇ ¼±ÅÃ ½Ã ¾Æ¹«·± ´É·ÂÄ¡µµ ¿À¸£Áö ¾Ê½À´Ï´Ù.\n\n");
    printf("[1]±âº»°ø°İ[2]Ã¼·Â[3]È¸º¹·® : ");
    scanf("%d", &upStat);

    switch (upStat)
    {
    case 1:

        printf("\n======================================\n");
        printf("==                                  ==\n");
        printf("      °ø°İ·ÂÀÌ 3 ¿Ã¶ú½À´Ï´Ù.\n");
        printf("==                                  ==\n");
        printf("======================================\n");

        player->hit += 3;

        break;

    case 2:

        printf("\n======================================\n");
        printf("==                                  ==\n");
        printf("      Ã¼·ÂÀÌ 7 ¿Ã¶ú½À´Ï´Ù.\n");
        printf("==                                  ==\n");
        printf("======================================\n");

        player->health += 7;

        break;

    case 3:

        printf("\n======================================\n");
        printf("==                                  ==\n");
        printf("     Ã¼·Â È¸º¹·®ÀÌ 3 ¿Ã¶ú½À´Ï´Ù.\n");
        printf("==                                  ==\n");
        printf("======================================\n");

        player->playerheal += 3;

        break;

    default:

        printf("\n======================================\n");
        printf("==                                  ==\n");
        printf("   ¾Æ¹« º¯È­µµ ¾ø½À´Ï´Ù.\n");
        printf("==                                  ==\n");
        printf("======================================\n");

        break;
    }
}

void f_GameStart()      //°ÔÀÓ ½ÃÀÛ
{
    int select = 0;

    printf("        ========================================================\n");
    printf("        ===                                                  ===\n");
    printf("        ===                                                  ===\n");
    printf("        ===             ·Î±×¶óÀÌÅ© ÅØ½ºÆ® rpg                ===\n");
    printf("        ===                                                  ===\n");
    printf("        ===                                                  ===\n");
    printf("        ========================================================\n\n");


    printf("¼±ÅÃÁö 1.°ÔÀÓ ½ÃÀÛ\n");
    printf("       2.°ÔÀÓ Á¤º¸\n ");
    printf("      3.¸¸µç »ç¶÷µé\n");
    scanf("%d", &select);

    switch (select)
    {
    case 1:

        printf("        ==========================\n");
        printf("        ==                      ==\n");
        printf("        ==  °ÔÀÓÀ» ½ÃÀÛÇÕ´Ï´Ù!  ==\n");
        printf("        ==                      ==\n");
        printf("        ==========================\n");
        Sleep(1000);

        gameStart = 0;

        system("cls");

        break;

    case 2:
        f_GameInform();            //°ÔÀÓ Á¤º¸ Ãâ·Â

        break;

    case 3:
        f_GameInformp();           //°ÔÀÓ Á¦ÀÛÇÑ »ç¶÷ Á¤º¸ Ãâ·Â

        break;

    default:
        printf("´Ù½Ã ÀÔ·ÂÇØÁÖ¼¼¿ä.\n\n");

        break;
    }
}


void f_GameOver()       //°ÔÀÓ ¿À¹ö
{
    system("cls");
    printf("\n===================================================\n");
    printf("==                                               ==\n");
    printf("       ÇÃ·¹ÀÌ¾îÀÇ Ã¼·ÂÀÌ 0ÀÌ µÇ¾î¹ö·È½À´Ï´Ù.\n");
    printf("     ´ç½ÅÀº ´øÀüÀÇ ³¡¿¡ µµ´ŞÇÏÁö ¸øÇÏ¿´½À´Ï´Ù...\n");
    printf("==                                               ==\n");
    printf("===================================================\n");


    exit(0);
}

void f_GameClear()      //°ÔÀÓ Å¬¸®¾î
{
    system("cls");
    printf("\n===============================================\n");
    printf("==                                           ==\n");
    printf("              ÃàÇÏµå¸³´Ï´Ù!\n");
    printf("   ¼Ò¿øÀ» ÀÌ·ê ¼ö ÀÖ´Ù´Â ¼Ò¹®Àº ÁøÂ¥ÀÏ±î¿ä?\n");
    printf("==                                           ==\n");
    printf("===============================================\n");

    exit(0);
}

void f_StageStart(struct Player* player, struct Monster* monster)       //½ºÅ×ÀÌÁö ½ÃÀÛ
{
    printf("\nÁ¦%d ±¸¿ª¿¡ µµÂøÇÏ¿´´Ù.\n\n", stagelevel + 1);
    Sleep(1000);

    printf("\n%s\n", monster->print_Monster_info);
    Sleep(2000);

    while (monster->health > 0)
    {
        srand((unsigned int)time(NULL));                  // ·£´ı ÇÔ¼ö ÃÊ±âÈ­

        chat_Player = rand() % 3;           //0ºÎÅÍ 2±îÁöÀÇ °ª Áß ·£´ıÀ¸·Î ÇÑ ¼ıÀÚ¸¦ º¯¼ö¿¡ ÀúÀå
        chat_Monster = rand() % 3;

        printf("\nÇÃ·¹ÀÌ¾î : ");
        printf("%s\n\n", player->print_Player[chat_Player]);

        f_PrintPlayer(player);              //ÇÃ·¹ÀÌ¾î Á¤º¸ Ãâ·Â

        printf("%s : ", monster->name);
        printf("%s\n\n", monster->print_Monster[chat_Monster]);
        f_PrintMonster(monster);            //¸ó½ºÅÍ Á¤º¸ Ãâ·Â

        f_PlayerInput(player, monster);     //ÇÃ·¹ÀÌ¾î Çàµ¿

        if (monster->health > 0)
        {
            f_MonsterInput(player, monster);
        }

        if (player->health <= 0)
        {
            f_GameOver();
        }
    }

    printf("\nÀûÀ» ¾²·¯¶ß·È½À´Ï´Ù.\n\n");
    Sleep(1000);

    printf("º¸»ó Áö±Ş\n");
    Sleep(1000);

    printf("\n======================================\n");
    printf("==                                  ==\n");
    printf("        Ã¼·ÂÀÌ 3 ¿Ã¶ú½À´Ï´Ù.\n");
    printf("==                                  ==\n");
    printf("======================================\n\n");
    player->health += 3;

    f_present(player);
    Sleep(1000);

    printf("==                                  ==\n");
    printf("   ´ÙÀ½ ½ºÅ×ÀÌÁö·Î ÀÌµ¿ÇÕ´Ï´Ù.\n");
    printf("==                                  ==\n");
    printf("======================================\n");
    Sleep(1500);

    system("cls");

    stagelevel++;
}

void f_GameInform()     //°ÔÀÓ Á¤º¸ Ãâ·Â
{
    system("cls");
    printf("        =====================================================================\n");
    printf("        ===                                                               ===\n");
    printf("        ===               ÀÌ ´øÀü ¾È¿¡´Â ¸ó½ºÅÍ°¡ ¸¹½À´Ï´Ù.               ===\n");
    printf("        ===  ´øÀüÀÇ ³¡¿¡ µµ´ŞÇÏ¸é ¼Ò¿øÀ» ÀÌ·ê ¼ö ÀÖ´Ù´Â ¼Ò¹®ÀÌ ÀÖ½À´Ï´Ù.  ===\n");
    printf("        ===             °ú¿¬ ´ç½ÅÀº ³¡±îÁö µµ´ŞÇÒ ¼ö ÀÖÀ»±î¿ä?            ===\n");
    printf("        ===                                                               ===\n");
    printf("        =====================================================================\n");

}

void f_GameInformp()    //°ÔÀÓ Á¦ÀÛÇÑ »ç¶÷ Á¤º¸ Ãâ·Â
{
    system("cls");
    //°³ÀÎÁ¤º¸
}