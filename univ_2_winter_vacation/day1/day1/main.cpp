#include <iostream>
#include <string>

using namespace std;

/* day 1-1
int main() {
	cout << "�� ���α׷��� ���α׷��� ������ �˾ƺ��� ���� ";
	cout << "������ c++ ���α׷��Դϴ�." << endl;
	cout << "�̹� ���������� ���� c++ ���α׷��� ���� ";
	cout << "���õ� �پ��� ���� ���캸�ڽ��ϴ�." << endl;

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
	cout << "�� ������ �Է��ϼ��� >> ";
	cin >> a >> b;
	sum = a + b;

	cout << "���� " << sum << "\n";
	cout << "���� " << add(a, b) << "\n";
	cout << "���� ���� g ���� " << g;

	return 0;
}*/

/*���� 1
int main() {
	int a = 100, b = 98, c = 79;
	int sum = a + b + c;
	double aver = (double)sum / 3;

	cout << "���� : " << sum << endl;
	cout << "��� : " << aver << endl;

	return 0;
}*/

/*day 1 - 7
int main() {
	int age = 25;
	bool isadult = age > 19;

	if (isadult) {
		cout << "�����Դϴ�." << endl;
	}
	else {
		cout << "�̼������Դϴ�." << endl;
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

	cout << "���� ������ �Է�: ";
	cin >> a;
	cout << "������: " << a << endl;
	cout << "�ѷ�: " << a * 2 * PI << endl;
	cout << "����: " << a * a * PI << endl;

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

	cout << "�̸�(first name) �Է��ϱ�: ";
	cin >> first;
	cout << "�̴ϼ�(initial) �Է��ϱ�: ";
	cin >> initial;
	cout << "��(last name) �Է��ϱ�: ";
	cin >> last;

	fullName = first + initial + dot + space + last;
	cout << "��ü �̸�(full name): " << fullName;
	
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
	cout << "������ �Է����ּ��� : ";
	cin >> a;
	cout << "��� : " << abs(a) << endl;
	cout << "���� : " << square(a) << endl;
}*/

/*day 1 - 
int main() {
	int x = 1237;

	cout << "x�� 10���� ��: " << x << endl;
	cout << "x�� 8���� ��: " << oct << x << endl;
	cout << "x�� 16���� ��: " << hex << x << endl << endl;

	cout << "x�� 10���� ��: " << showbase << dec << x << endl;
	cout << "x�� 8���� ��: " << showbase << oct << x << endl;
	cout << "x�� 16���� ��: " << showbase << hex << x << endl << endl;
}
*/

/* ����
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
	cout << "square(int) ȣ��" << endl;
	return i * i;
}

int square(int i, int j) {
	cout << "square(int i, int j) ȣ��" << endl;
	return i * j;
}

double square(double i) {
	cout << "square(double) ȣ��" << endl;
	return i * i;
}

void square() {
	cout << "square() ȣ��" << endl;
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
	cout << "�ƹ��� �μ��� ���޵��� �ʴ� ��� : \n";
	display();

	cout << "ù ��° �μ��� ���޵Ǵ� ��� : \n";
	display('#');

	cout << "��� �μ��� ���޵Ǵ� ��� : \n";
	display('#', 5);

	return 0;
}