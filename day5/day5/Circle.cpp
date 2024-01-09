#include <iostream>
#include "Circle.h"
using namespace std;

#define PI 3.141592

Circle::Circle(double rds)
	: radius(rds)
{
	cout << "매개변수가 있는 생성자가 호출되었습니다." << endl;
}
Circle::Circle() 
	: radius(0.0) 
{
	cout << "기본 생성자가 호출되었습니다." << endl;
}
Circle::~Circle() {
	cout << "소멸자가 호출되었습니다." << endl;
}
Circle::Circle(const Circle& circle) {
	cout << "복사 생성자가 호출되었습니다." << endl;
}

double Circle::getRadius() {
	return radius;
}

double Circle::getArea() {
	return radius * radius * PI;
}

double Circle::getPerimeter() {
	return radius * 2 * PI;
}

void Circle::setRadius(double value) {
	radius = value;
}