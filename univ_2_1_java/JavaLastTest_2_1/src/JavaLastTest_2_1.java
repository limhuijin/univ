import java.util.Scanner;
import java.util.Random;

class Player { // 플레이어 객체
	String playerName; // 이름
	int playerHealth; // 체력
	int playerHit; // 공격력
	int playerCritical; // 강화공격
	int playerHeal; // 플레이어 힐량

	Player(String na, int he, int hi, int pc, int ph) {
		playerName = na;
		playerHealth = he;
		playerHit = hi;
		playerCritical = pc;
		playerHeal = ph;
	}
}

class Monster { // 적 객체
	String monsterName; // 적 이름
	int monsterHealth; // 적 체력
	int monsterHit; // 적 공격력

	Monster(String na, int he, int hi) {
		monsterName = na;
		monsterHealth = he;
		monsterHit = hi;
	}
}

public class JavaLastTest_2_1 {

	static int stageLevel = 0; // 스테이지 레벨
	static int motion = 0; // 플레이어 행동
	static int monsterRand = 0; // 몬스터 행동 랜덤값

	static int gameStart = 1; // 게임 시작값

	public static void f_GameStart() { // 게임 시작
		Scanner scanner = new Scanner(System.in);
		int select = 0;

		System.out.print("        ========================================================\n");
		System.out.print("        ===                                                  ===\n");
		System.out.print("        ===                                                  ===\n");
		System.out.print("        ===             로그라이크 텍스트 rpg                     ===\n");
		System.out.print("        ===                                                  ===\n");
		System.out.print("        ===                                                  ===\n");
		System.out.print("        ========================================================\n\n");

		System.out.print("선택지 1.게임 시작\n");
		System.out.print("     2.게임 정보\n ");
		System.out.print("    3.만든 사람들\n");

		select = scanner.nextInt();

		switch (select) {
		case 1:

			System.out.print("        ==========================\n");
			System.out.print("        ==                      ==\n");
			System.out.print("        ==  게임을 시작합니다!       ==\n");
			System.out.print("        ==                      ==\n");
			System.out.print("        ==========================\n");

			gameStart = 0;
			break;

		case 2:
			f_GameInform(); // 게임 정보 출력
			break;

		case 3:
			f_GameInformp(); // 게임 제작한 사람 정보 출력
			break;

		default:
			System.out.print("다시 입력해주세요.\n\n");
			break;
		}
	}

	public static void f_GameOver() { // 게임 오버
		System.out.print("\n===================================================\n");
		System.out.print("==                                               ==\n");
		System.out.print("       플레이어의 체력이 0이 되어버렸습니다.\n");
		System.out.print("     당신은 던전의 끝에 도달하지 못하였습니다...\n");
		System.out.print("==                                               ==\n");
		System.out.print("===================================================\n");
	}

	public static void f_GameClear() { // 게임 클리어
		System.out.print("\n===============================================\n");
		System.out.print("==                                           ==\n");
		System.out.print("              축하드립니다!\n");
		System.out.print("   소원을 이룰 수 있다는 소문은 진짜일까요?\n");
		System.out.print("==                                           ==\n");
		System.out.print("===============================================\n");
	}

	public static void f_StageStart(Player player, Monster monster) { // 스테이지 시작
		System.out.print("\n제" + (stageLevel + 1) + " 구역에 도착하였다.\n\n");

		while (monster.monsterHealth > 0) {
			f_PrintPlayer(player); // 플레이어 정보 출력
			f_PrintMonster(monster); // 몬스터 정보 출력

			f_PlayerInput(player, monster); // 플레이어 행동

			if (monster.monsterHealth > 0) {
				f_MonsterInput(player, monster);
			}

			if (player.playerHealth <= 0) {
				f_GameOver();
			}
		}

		System.out.print("\n적을 쓰러뜨렸습니다.\n\n");

		System.out.print("보상 지급\n");

		System.out.print("\n======================================\n");
		System.out.print("==                                  ==\n");
		System.out.print("        체력이 3 올랐습니다.\n");
		System.out.print("==                                  ==\n");
		System.out.print("======================================\n\n");
		player.playerHealth += 3;

		f_present(player);

		System.out.print("==                                  ==\n");
		System.out.print("   다음 스테이지로 이동합니다.\n");
		System.out.print("==                                  ==\n");
		System.out.print("======================================\n");

		stageLevel++;
	}

	public static void f_PrintPlayer(Player player) { // 플레이어 정보 출력
		System.out.print("=========================================\n");
		System.out.print("==                                     ==\n");
		System.out.print("        이름 : " + player.playerName + " 체력 : " + player.playerHealth + "\n");
		System.out.print("==                                     ==\n");
		System.out.print("=========================================\n\n");
	}

	public static void f_PrintMonster(Monster monster) { // 몬스터 정보 출력
		System.out.print("=========================================\n");
		System.out.print("==                                     ==\n");
		System.out.print("        이름 : " + monster.monsterName + " 체력 : " + monster.monsterHealth + "\n");
		System.out.print("==                                     ==\n");
		System.out.print("=========================================\n\n");
	}

	public static void f_PlayerInput(Player player, Monster monster) { // 플레이어 모션
		Scanner scanner = new Scanner(System.in);

		System.out.print("\n어떤 행동을 할까?\n\n1[기본공격] 2[강화공격] 3[힐] 4[대화를 시도한다] : ");
		motion = scanner.nextInt();

		if (motion != 1 && motion != 2 && motion != 3 && motion != 4) {
			System.out.print("\n그런 행동은 없다!\n\n");
			f_PlayerInput(player, monster);
		} else {
			switch (motion) {
			case 1:
				System.out.print("\n=========================================\n");
				System.out.print("==                                     ==\n");
				System.out.print("     기본 공격을 사용하였다!\n");
				System.out.print("==                                     ==\n");
				System.out.print("=========================================\n");

				System.out.print("==                                     ==\n");
				System.out.print("     " + player.playerHit + "의 데미지를 주었다!\n");
				System.out.print("==                                     ==\n");
				System.out.print("=========================================\n\n");

				monster.monsterHealth -= player.playerHit;

				break;

			case 2:
				System.out.print("\n=========================================\n");
				System.out.print("==                                     ==\n");
				System.out.print("    강화 공격을 사용하였다!\n");
				System.out.print("==                                     ==\n");
				System.out.print("=========================================\n");

				System.out.print("==                                     ==\n");
				System.out.print("    " + player.playerCritical + "의 데미지를 주었다\n");
				System.out.print("==                                     ==\n");
				System.out.print("=========================================\n");

				monster.monsterHealth -= player.playerCritical;
				player.playerCritical++;
				System.out.print("==                                     ==\n");
				System.out.print("  강화공격의 공격력이 1 상승했다. 현재 " + player.playerCritical + "\n");
				System.out.print("==                                     ==\n");
				System.out.print("=========================================\n\n");

				break;

			case 3:
				System.out.print("\n===================================\n");
				System.out.print("==                               ==\n");
				System.out.print("    체력을 회복한다.\n");
				System.out.print("==                               ==\n");
				System.out.print("===================================\n");

				System.out.print("==                               ==\n");
				System.out.print("    " + player.playerHeal + "의 체력을 회복했다.\n");
				System.out.print("==                               ==\n");
				System.out.print("===================================\n\n");

				player.playerHealth += player.playerHeal;

				break;

			case 4:
				System.out.print("==============================\n");
				System.out.print("==                          ==\n");
				System.out.print("   당신은 대화를 시도한다.\n");
				System.out.print("   실패했다.\n");
				System.out.print("==                          ==\n");
				System.out.print("==============================\n\n");

				break;
			}
		}
	}

	public static void f_MonsterInput(Player player, Monster monster) { // 몬스터 모션
		Random random = new Random();
		random.setSeed(System.currentTimeMillis());

		System.out.print("\n몬스터 동작\n\n");

		monsterRand = random.nextInt(5);

		if (monsterRand >= 3) {

			System.out.print("===========================================\n");
			System.out.print("==                                       ==\n");
			System.out.print("   " + monster.monsterName + "의 공격!\n");
			System.out.print("==                                       ==\n");
			System.out.print("===========================================\n");
			System.out.print("==                                       ==\n");
			System.out.print("   " + monster.monsterName + "에 의해 " + monster.monsterHit + "의 데미지를 입었다\n");
			System.out.print("==                                       ==\n");
			System.out.print("===========================================\n\n");

			player.playerHealth -= monster.monsterHit;
		} else if (monsterRand >= 0) {

			System.out.print("=======================================\n");
			System.out.print("==                                   ==\n");
			System.out.print("  " + monster.monsterName + "은(는) 아무것도 하지 않았다.\n");
			System.out.print("==                                   ==\n");
			System.out.print("=======================================\n\n");
		}
	}

	public static void f_present(Player player) { // 보상
		Scanner scanner = new Scanner(System.in);

		int upStat = 0;

		System.out.print("선택보상\n");

		System.out.print("\n증가시킬 능력치를 선택하세요.\n");
		System.out.print("이외의 선택 시 아무런 능력치도 오르지 않습니다.\n\n");
		System.out.print("[1]기본공격[2]체력[3]회복량 : ");
		upStat = scanner.nextInt();

		switch (upStat) {
		case 1:

			System.out.print("\n======================================\n");
			System.out.print("==                                  ==\n");
			System.out.print("      공격력이 3 올랐습니다.\n");
			System.out.print("==                                  ==\n");
			System.out.print("======================================\n");

			player.playerHit += 3;

			break;

		case 2:

			System.out.print("\n======================================\n");
			System.out.print("==                                  ==\n");
			System.out.print("      체력이 7 올랐습니다.\n");
			System.out.print("==                                  ==\n");
			System.out.print("======================================\n");

			player.playerHealth += 7;

			break;

		case 3:

			System.out.print("\n======================================\n");
			System.out.print("==                                  ==\n");
			System.out.print("     체력 회복량이 3 올랐습니다.\n");
			System.out.print("==                                  ==\n");
			System.out.print("======================================\n");

			player.playerHeal += 3;

			break;

		default:

			System.out.print("\n======================================\n");
			System.out.print("==                                  ==\n");
			System.out.print("   아무 변화도 없습니다.\n");
			System.out.print("==                                  ==\n");
			System.out.print("======================================\n");

			break;
		}
	}

	public static void f_GameInform() { // 게임 정보 출력
		System.out.print("        =====================================================================\n");
		System.out.print("        ===                                                               ===\n");
		System.out.print("        ===                      이 던전 안에는 몬스터가 많습니다.                 ===\n");
		System.out.print("        ===            던전의 끝에 도달하면 소원을 이룰 수 있다는 소문이 있습니다.        ===\n");
		System.out.print("        ===                   과연 당신은 끝까지 도달할 수 있을까요?                ===\n");
		System.out.print("        ===                                                               ===\n");
		System.out.print("        =====================================================================\n");
	}

	public static void f_GameInformp() { // 게임 제작한 사람 정보 출력
		System.out.print("        =====================================================================\n");
		System.out.print("        ===                                                               ===\n");
		System.out.print("        ===                          2260022 임희진                         ===\n");
		System.out.print("        ===                          2012037 이 찬                          ===\n");
		System.out.print("        ===                          2051057 허선진                         ===\n");
		System.out.print("        ===                                                               ===\n");
		System.out.print("        =====================================================================\n");
	}

	public static void main(String[] args) {

		Player player = new Player("플레이어", 30, 7, 3, 3);

		Monster monster[] = new Monster[5];

		monster[0] = new Monster("슬라임", 10, 3);
		monster[1] = new Monster("고블린", 14, 7);
		monster[2] = new Monster("리저드맨", 20, 7);
		monster[3] = new Monster("크로커다일", 23, 10);
		monster[4] = new Monster("정령", 28, 12);

		do {
			f_GameStart();
		} while (gameStart == 1);

		for (stageLevel = 0; stageLevel < 5; stageLevel++) {
			f_StageStart(player, monster[stageLevel]);
		}

		f_GameClear();
	}
}
