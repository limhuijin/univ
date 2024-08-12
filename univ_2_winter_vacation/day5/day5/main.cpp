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
	cout << "반지름 : " << c1.getRadius() << endl;
	cout << "넓이 : " << c1.getArea() << endl;
	cout << "둘레 : " << c1.getPerimeter() << endl;


	Circle c2(c1);

	c2.setRadius(10.0);
	cout << "반지름 : " << c2.getRadius() << endl;
	cout << "넓이 : " << c2.getArea() << endl;
	cout << "둘레 : " << c2.getPerimeter() << endl;


	Circle c3;

	c3.setRadius(10.0);
	cout << "반지름 : " << c3.getRadius() << endl;
	cout << "넓이 : " << c3.getArea() << endl;
	cout << "둘레 : " << c3.getPerimeter() << endl;
	*/

	/*
	double h, w;
	Weight w1;

	cout << "당신의 키 : ";
	cin >> h;
	cout << "당신의 몸무게 : ";
	cin >> w;

	w1.setheight(h);
	w1.setweight(w);

	cout << "키 : " << w1.getheight() << ", 몸무게 : " << w1.getweight() << endl;
	
	switch (w1.getIsState())
	{
	case 1:
		cout << "과체중"; 
		break;
	case 0:
		cout << "정상체중";
		break;
	case -1:
		cout << "저체중";
		break;
	default:
		cout << "알 수 없는 상태";
		break;
	}*/

	/*
	Course c1;

	char CourseN[30];
	char ch = 'y', n[30], name[10][30];

	cout << "과정명 입력 : ";
	cin.getline(CourseN, 100);

	c1.setCourseName(CourseN);

	while (ch == 'y' || ch == 'Y') {
		cout << "\n수강학	생 이름 입력 : ";
		cin >> n;

		c1.setName(n);

		cout << "계속하시겠습니까? (y/n) ";
		cin >> ch;
	}

	c1.getCourseName(CourseN);
	cout << "\n과정명 : " << CourseN << endl;
	cout << "수강학생 명단 : ";
	c1.getName(name);

	for (int i = 0; i < c1.getCount(); i++) {
		cout << name[i] << ' ';
	}

	cout << endl;
	cout << "총 수강학생 수 : " << c1.getCount() << "명" << endl;*/

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

	cout << "100~200 사이의 랜덤한 숫자 : ";

	r1.print();

	RandomInteger r2(400, 600);

	cout << "400~600 사이의 랜덤한 숫자 : ";

	r2.print();

	RandomInteger r3(1500, 2000);

	cout << "1500~2000 사이의 랜덤한 숫자 : ";

	r3.print();

	return 0;
}