#include <iostream>
using namespace std;

class Circle {
	int radius;
public:
	Circle() { radius = 1; }
	Circle(int r) { radius = r; }
	void setRadius(int r) { radius = r; }
	double getArea();
};

double Circle::getArea() {
	return 3.14 * radius * radius;
}

class SoSimple {
private:
	int num;
public:
	SoSimple(int n) : num(n) {
		cout << "num = " << num << ", ";
		cout << "object address = " << this << endl;
	}

	void ShowSimpleData() {
		cout << num << endl;
	}

	SoSimple* GetThisPointer() {
		return this;
	}
};

int main() {
	/*
	Circle circleArray[2][3] = {{ Circle(1), Circle(2), Circle(3) },
								{ Circle(4), Circle(5), Circle(6) }};

	for (int j = 0; j < 2; j++) {
		for (int i = 0; i < 3; i++) {
			cout << "Circle " << i << "의 면적은 " << circleArray[j][i].getArea() << endl;
		}
	}*/


	/*
	cout << "입력할 정수의 개수는?";
	int n;
	cin >> n;
	int* p = new int[n];
	if (!p) {
		cout << "메모리를 할당할 수 없습니다.";
		return 0;
	}

	if (n <= 0) {
		return 0;
	}

	for (int i = 0; i < n; i++) {
		cout << i + 1 << "번째 정수 : ";
		cin >> p[i];
	}

	int sum = 0;
	for (int i = 0; i < n; i++) {
		sum += p[i];
	}

	cout << "평균 : " << sum / n << endl;
	
	delete[] p;*/

	/*
	cout << "생성하고자 하는 원의 개수 : ";
	int n, radius;
	cin >> n;

	Circle* pArray = new Circle[n];
	for (int i = 0; i < n; i++) {
		cout << "원" << i + 1 << ": ";
		cin >> radius;
		pArray[i].setRadius(radius);
	}

	int count = 0;
	Circle* p = pArray;
	for (int i = 0; i < n; i++) {
		cout << p->getArea() << ' ';
		if (p->getArea() >= 100 && p->getArea() <= 200) {
			count++;
		}
		p++;
	}

	cout << endl << "면적이 100에서 200 사이인 원의 개수는 " << count << endl;

	delete[] pArray;
	*/

	/*
	SoSimple sim1(100);
	SoSimple* ptr1 = sim1.GetThisPointer();
	cout << ptr1 << ", ";
	ptr1->ShowSimpleData();

	SoSimple sim2(200);
	SoSimple* ptr2 = sim2.GetThisPointer();
	cout << ptr2 << ", ";
	ptr2->ShowSimpleData();*/

	int a = 10;

	int* p;
	p = &a;

	cout << "a: " << a << ", *p : " << *p << ", p : " << p << "\n";

	int& r = a;
	r = 20;

	cout << "a: " << a << ", &r : " << &r << ", r : " << r << "\n";
}