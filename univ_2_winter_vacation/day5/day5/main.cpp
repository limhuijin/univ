#include <iostream>
#include <string>
#include "Circle.h"
#include "Weight.h"
#include "Course.h"
#include "Student.h"
#include "RandomInteger.h"
using namespace std;

int main() {
	
	/*
	Circle c1(5.2);

	c1.setRadius(10.0);
	cout << "������ : " << c1.getRadius() << endl;
	cout << "���� : " << c1.getArea() << endl;
	cout << "�ѷ� : " << c1.getPerimeter() << endl;


	Circle c2(c1);

	c2.setRadius(10.0);
	cout << "������ : " << c2.getRadius() << endl;
	cout << "���� : " << c2.getArea() << endl;
	cout << "�ѷ� : " << c2.getPerimeter() << endl;


	Circle c3;

	c3.setRadius(10.0);
	cout << "������ : " << c3.getRadius() << endl;
	cout << "���� : " << c3.getArea() << endl;
	cout << "�ѷ� : " << c3.getPerimeter() << endl;
	*/

	/*
	double h, w;
	Weight w1;

	cout << "����� Ű : ";
	cin >> h;
	cout << "����� ������ : ";
	cin >> w;

	w1.setheight(h);
	w1.setweight(w);

	cout << "Ű : " << w1.getheight() << ", ������ : " << w1.getweight() << endl;
	
	switch (w1.getIsState())
	{
	case 1:
		cout << "��ü��"; 
		break;
	case 0:
		cout << "����ü��";
		break;
	case -1:
		cout << "��ü��";
		break;
	default:
		cout << "�� �� ���� ����";
		break;
	}*/

	/*
	Course c1;

	char CourseN[30];
	char ch = 'y', n[30], name[10][30];

	cout << "������ �Է� : ";
	cin.getline(CourseN, 100);

	c1.setCourseName(CourseN);

	while (ch == 'y' || ch == 'Y') {
		cout << "\n������	�� �̸� �Է� : ";
		cin >> n;

		c1.setName(n);

		cout << "����Ͻðڽ��ϱ�? (y/n) ";
		cin >> ch;
	}

	c1.getCourseName(CourseN);
	cout << "\n������ : " << CourseN << endl;
	cout << "�����л� ��� : ";
	c1.getName(name);

	for (int i = 0; i < c1.getCount(); i++) {
		cout << name[i] << ' ';
	}

	cout << endl;
	cout << "�� �����л� �� : " << c1.getCount() << "��" << endl;*/

	/*
	Student p1;

	p1.setScore(99, 98, 85);
	p1.sumAverage();
	p1.showScore();

	cout << "---------------------------" << endl;

	Student p2(80, 56, 100);
	p2.sumAverage();
	p2.showScore();
	*/

	RandomInteger r1(100, 200);

	cout << "100~200 ������ ������ ���� : ";

	r1.print();

	RandomInteger r2(400, 600);

	cout << "400~600 ������ ������ ���� : ";

	r2.print();

	RandomInteger r3(1500, 2000);

	cout << "1500~2000 ������ ������ ���� : ";

	r3.print();

	return 0;
}