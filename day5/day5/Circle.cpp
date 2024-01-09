#include <iostream>
#include "Circle.h"
using namespace std;

#define PI 3.141592

Circle::Circle(double rds)
	: radius(rds)
{
	cout << "�Ű������� �ִ� �����ڰ� ȣ��Ǿ����ϴ�." << endl;
}
Circle::Circle() 
	: radius(0.0) 
{
	cout << "�⺻ �����ڰ� ȣ��Ǿ����ϴ�." << endl;
}
Circle::~Circle() {
	cout << "�Ҹ��ڰ� ȣ��Ǿ����ϴ�." << endl;
}
Circle::Circle(const Circle& circle) {
	cout << "���� �����ڰ� ȣ��Ǿ����ϴ�." << endl;
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