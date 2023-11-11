using System;
using System.Security.Cryptography;

class Program
{
    static public void start()
    {

    }

    static public void PlayerCard()
    {

    }

    static public void DealerCard()
    {
       
    }


    static void Main(string[] args)
    {
        bool isNum = true;
        int isCount;
        int index;
        int playerSum = 0;
        int dealerSum = 0;

        List<int> cardList = new List<int>();
        List<int> PlayerList = new List<int>();
        List<int> dealerList = new List<int>();
        Random rand = new Random();

        while(isNum)
        {
            Console.WriteLine("\n\n블랙잭\t");


            cardList.Clear();
            for (int j = 0; j < 4; j++)
            {
                for (int i = 1; i < 14; i++)
                {
                    cardList.Add(i);
                }
            }

            PlayerList.Clear();
            playerSum = 0;
            dealerList.Clear();
            dealerSum = 0;

            index = rand.Next(0, cardList.Count);

            if (cardList[index] == 1 && dealerSum + cardList[index] + 10 < 21)
            {
                cardList[index] = 11;
            }

            if (cardList[index] == 11 || cardList[index] == 12 || cardList[index] == 13)
            {
                cardList[index] = 10;
            }

            dealerList.Add(cardList[index]);
            dealerSum += cardList[index];
            cardList.Remove(index);

            index = rand.Next(0, cardList.Count);

            if (cardList[index] == 1 && playerSum + cardList[index] + 10 < 21)
            {
                cardList[index] = 11;
            }

            if (cardList[index] == 11 || cardList[index] == 12 || cardList[index] == 13)
            {
                cardList[index] = 10;
            }

            PlayerList.Add(cardList[index]);
            playerSum += cardList[index];
            cardList.Remove(index);

            while (true)
            {
                Console.WriteLine("\n\n딜러 카드\n");

                for (int i = 0; i < dealerList.Count(); i++)
                {
                    Console.Write($"{dealerList[i]}");
                }

                Console.WriteLine($"\t ( {dealerSum} )\t");

                index = rand.Next(0, cardList.Count);

                if(cardList[index] == 1 && playerSum + cardList[index] + 10 < 21)
                {
                    cardList[index] = 11;
                }
                
                if(cardList[index] == 11 || cardList[index] == 12 || cardList[index] == 13)
                {
                    cardList[index] = 10;
                }

                PlayerList.Add(cardList[index]);
                playerSum += cardList[index];
                cardList.Remove(index);

                Console.WriteLine("\n\n플레이어 카드\n");

                for (int i = 0; i < PlayerList.Count(); i++)
                {
                    Console.Write($"{PlayerList[i]}  ");
                }

                Console.WriteLine($"\t ( {playerSum} )\t");

                if(playerSum > 21)
                {
                    Console.WriteLine($"\n플레이어의 패배입니다.");
                    break;
                }
                else
                {
                    Console.WriteLine("\n\n더 뽑으시겠습니까? (0)그만한다 (1)더 뽑는다.\t");
                    isCount = int.Parse(Console.ReadLine());

                    if (isCount == 0)
                    {
                        break;
                    }
                }
            }

            if (playerSum <= 21)
            {
                while (true)
                {
                    index = rand.Next(0, cardList.Count);

                    if (cardList[index] == 1 && dealerSum + cardList[index] + 10 < 21)
                    {
                        cardList[index] = 11;
                    }
                    
                    if (cardList[index] == 11 || cardList[index] == 12 || cardList[index] == 13)
                    {
                        cardList[index] = 10;
                    }

                    dealerList.Add(cardList[index]);
                    dealerSum+= cardList[index];
                    cardList.Remove(index);

                    Console.WriteLine("\n\n딜러 카드\n");

                    for (int i = 0; i < dealerList.Count(); i++)
                    {
                        Console.Write($"{dealerList[i]}  ");
                    }

                    Console.WriteLine($"\t ( {dealerSum} )\t");

                    Console.WriteLine("\n\n플레이어 카드\n");

                    for (int i = 0; i < PlayerList.Count(); i++)
                    {
                        Console.Write($"{PlayerList[i]}  ");
                    }

                    Console.WriteLine($"\t ( {playerSum} )\t");

                    if (playerSum == dealerSum)
                    {
                        Console.WriteLine($"\n무승부입니다.");
                        break;
                    }
                    if (dealerSum > playerSum && dealerSum <= 21)
                    {
                        Console.WriteLine($"\n딜러의 승리입니다.");
                        break;
                    }
                    else if (dealerSum > 21)
                    {
                        Console.WriteLine($"\n딜러의 패배입니다.");
                        break;
                    }
                }
            }
        }
    }
}
