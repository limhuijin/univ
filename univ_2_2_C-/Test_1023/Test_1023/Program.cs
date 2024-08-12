// See https://aka.ms/new-console-template for more information
using System;

class Student
{
    public string name;

    public Student()
    {

    }
}


class Subject : Student
{
    public int language;
    public int English;
    public int math;
    public int max;
    public double aver;
    public int rank;

    public Subject(string name, int language, int English, int math, int rank)
    {
        this.name = name;
        this.language = language;
        this.English = English;
        this.math = math;
        this.rank = rank;
        max = language + English + math;
        aver = max / 3;
    }
}


class Program
{
    static void Main(string[] args)
    {
        Subject[] subject = new Subject[5];
        string[] studentName = { "임희진", "허선진", "이찬", "박준영", "조석환" };

        for (int i = 0; i < subject.Length; i++) 
        {
            Random r = new Random();
            subject[i] = new Subject(studentName[i], r.Next(101), r.Next(101), r.Next(101), 0);
        }

        Console.WriteLine($"이름\t등수\t국어\t영어\t수학\t총점\t평균");

        /*for (int i = 0; i < subject.Length; i++)
        {
            int count = 0;

            for (int j = 0; j < subject.Length; j++)
            {
                if (subject[i].aver < subject[j].aver)
                {
                    count++;
                }
            }

            subject[i].rank = count + 1;
        }

        for (int i = 0; i < subject.Length; i++)
        {
            for (int j = 0; j < subject.Length; j++)
            {
                if (subject[j].rank - 1 == i)
                {
                    Console.WriteLine($"{subject[j].name}\t{subject[j].rank}\t{subject[j].language}\t{subject[j].English}\t" +
                        $"{subject[j].math}\t{subject[j].max}\t{subject[j].aver}\t");
                    break;
                }
            }
        }*/

        for (int i = 0; i < subject.Length - 1; i++)
        {
            for (int j = 0; j < subject.Length - i - 1; j++)
            {
                if (subject[j].max > subject[j + 1].max)
                {
                    Subject temp = subject[j];
                    subject[j] = subject[j + 1];
                    subject[j + 1] = temp;
                }
            }
        }

        for (int j = 0; j < subject.Length; j++)
        {
            Console.WriteLine($"{subject[j].name}\t{j + 1}\t{subject[j].language}\t{subject[j].English}\t" +
                $"{subject[j].math}\t{subject[j].max}\t{subject[j].aver}\t");
        }
    }
}