#include <iostream>
#include <string>

using namespace std;

/* day 1-1
int main() {
	cout << "이 프로그램은 프로그램의 구조를 알아보기 위한 ";
	cout << "간단한 c++ 프로그램입니다." << endl;
	cout << "이번 수업내용을 통해 c++ 프로그래밍 언어와 ";
	cout << "관련된 다양한 것을 살펴보겠습니다." << endl;

	return 0;
}
*/

/* day 1-2
int g = 20;

int add(int x, int y) {
	return x + y;
}

int main() {
	int a, b, sum;
	cout << "두 정수를 입력하세요 >> ";
	cin >> a >> b;
	sum = a + b;

	cout << "합은 " << sum << "\n";
	cout << "합은 " << add(a, b) << "\n";
	cout << "전역 변수 g 값은 " << g;

	return 0;
}*/

/*예제 1
int main() {
	int a = 100, b = 98, c = 79;
	int sum = a + b + c;
	double aver = (double)sum / 3;

	cout << "총점 : " << sum << endl;
	cout << "평균 : " << aver << endl;

	return 0;
}*/

/*day 1 - 7
int main() {
	int age = 25;
	bool isadult = age > 19;

	if (isadult) {
		cout << "성인입니다." << endl;
	}
	else {
		cout << "미성년자입니다." << endl;
	}

	return 0;
}*/

/*day 1 - 8
int main() {
	int a = 23, r = 0;
	r = a + 1;

	cout << a << " + 1 = " << r << endl;

	a = 2147483647;
	r = a + 1;
	cout << a << " + 1 = " << r << endl;

	return 0;
}*/

/* day 1 - 9
int main() {
	cout << "char \t\t : " << sizeof(char) << " bytes" << endl;
	cout << "unsigned char \t : " << sizeof(unsigned char) << " bytes" << endl;
	cout << "bool \t\t : " << sizeof(bool) << " bytes" << endl;
	cout << "short \t\t : " << sizeof(short) << " bytes" << endl;
	cout << "unsigned short \t : " << sizeof(unsigned short) << " bytes" << endl;
	cout << "int \t\t : " << sizeof(int) << " bytes" << endl;
	cout << "unsigned int \t : " << sizeof(unsigned int) << " bytes" << endl;
	cout << "long \t\t : " << sizeof(long) << " bytes" << endl;
	cout << "unsigned long \t : " << sizeof(unsigned long) << " bytes" << endl;
	cout << "float \t\t : " << sizeof(float) << " bytes" << endl;
	cout << "double \t\t : " << sizeof(double) << " bytes" << endl;

	return 0;
}*/

/* day 1 - 10
int main() {
	double a;
	const double PI = 3.14159;

	cout << "원의 반지름 입력: ";
	cin >> a;
	cout << "반지름: " << a << endl;
	cout << "둘레: " << a * 2 * PI << endl;
	cout << "면적: " << a * a * PI << endl;

	return 0;
}*/

/* day 1 - 10
int main() {
	const double dnum = 1234.56789;

	cout << dnum << endl;
	
	cout.precision(5);
	cout << dnum << endl;

	cout << fixed;
	cout.precision(6);
	cout << dnum << endl;

	cout.unsetf(ios::fixed);
	cout << dnum << endl;

	cout.setf(ios::fixed);
	cout.precision(5);
	cout << dnum << endl;
}*/

/*day 1 - 14
int main() {
	string first, initial, last;
	string space = " ";
	string dot = ".";
	string fullName;

	cout << "이름(first name) 입력하기: ";
	cin >> first;
	cout << "이니셜(initial) 입력하기: ";
	cin >> initial;
	cout << "성(last name) 입력하기: ";
	cin >> last;

	fullName = first + initial + dot + space + last;
	cout << "전체 이름(full name): " << fullName;
	
	return 0;
}*/

/*
int max(int a, int b) {
	if (a > b) {
		return a;
	}
	else {
		return b;
	}

	//result = a > b ? a : b;
}

int add(int a, int b) {
	return a + b;
}

int sub(int a, int b) {
	return a - b;
}

int mux(int a, int b) {
	return a * b;
}

double divide(int a, int b) {
	return (double)a / b;
}
*/
/*
int abs(int a) {
	if (a > 0) {
		return a;
	}
	else {
		return -a;
	}
}

int square(int a) {
	return a * a;
}

int main() {
	int a;
	cout << "음수를 입력해주세요 : ";
	cin >> a;
	cout << "양수 : " << abs(a) << endl;
	cout << "제곱 : " << square(a) << endl;
}*/

/*day 1 - 
int main() {
	int x = 1237;

	cout << "x의 10진수 값: " << x << endl;
	cout << "x의 8진수 값: " << oct << x << endl;
	cout << "x의 16진수 값: " << hex << x << endl << endl;

	cout << "x의 10진수 값: " << showbase << dec << x << endl;
	cout << "x의 8진수 값: " << showbase << oct << x << endl;
	cout << "x의 16진수 값: " << showbase << hex << x << endl << endl;
}
*/

/* 스왑
void swap(int x, int y) {
	int temp;
	temp = x;
	x = y;
	y = temp;
}

int main() {
	int a = 100, b = 200;
	cout << "a : " << a << ", b : " << b << endl;
	swap(a, b);
	cout << "a : " << a << ", b : " << b;

	return 0;
}*/

/*
int square(int i) {
	cout << "square(int) 호출" << endl;
	return i * i;
}

int square(int i, int j) {
	cout << "square(int i, int j) 호출" << endl;
	return i * j;
}

double square(double i) {
	cout << "square(double) 호출" << endl;
	return i * i;
}

void square() {
	cout << "square() 호출" << endl;
}

int main() {
	cout << square(10) << endl;
	cout << square(10, 20) << endl;
	cout << square(2.0) << endl;
	square();

	return 0;
}*/

void display(char c = '*', int n = 10) {
	for (int i = 0; i < n; i++) {
		cout << c;
	}
	cout << endl;
}

int main() {
	cout << "아무런 인수가 전달되지 않는 경우 : \n";
	display();

	cout << "첫 번째 인수만 전달되는 경우 : \n";
	display('#');

	cout << "모든 인수가 전달되는 경우 : \n";
	display('#', 5);

	return 0;
}