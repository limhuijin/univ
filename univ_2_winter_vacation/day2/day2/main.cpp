#include <iostream>
#include <string>
#include <ctime>
using namespace std;

char grade(int score);
int max(int a, int b, int c);

int main() {
	/*2�� ���
	int num;
	cout << "���� 1�� �Է� : ";
	cin >> num;

	if (num % 2 == 0) {
		cout << "2�� ����Դϴ�.";
	}
	else {
		cout << "2�� ����� �ƴմϴ�.";
	}*/

	/* 3�� ���
	int num;
	cout << "���� 1�� �Է� : ";
	cin >> num;

	if (num % 3 == 0) {
		cout << num << "�� 3�� ����Դϴ�." << endl;
	}
	else {
		cout << num << "�� 3�� ����� �ƴմϴ�." << endl;
	}

	cout << "���α׷��� �����մϴ�.";
	*/

	/* ���� ����
	int num;
	cout << "���� 1�� �Է� : ";
	cin >> num;

	if (num > 0) {
		cout << num << "�� ���� �����Դϴ�." << endl;
	}
	else if (num == 0){
		cout << num << "�� 0�Դϴ�." << endl;
	}
	else {
		cout << num << "�� ���� �����Դϴ�." << endl;
	}

	cout << "���α׷��� �����մϴ�.";
	*/

	/* ��� ���
	int score;
	cout << "���� 1�� �Է� : ";
	cin >> score;

	cout << "������ " << grade(score) << "�Դϴ�." << endl;

	return 0;*/

	/*
	int x, y;
	cout << "x���� �Է��Ͻÿ�: ";
	cin >> x;
	cout << "y���� �Է��Ͻÿ�: ";
	cin >> y;

	if (x > y) {
		cout << x << "��/��" << y << "���� Ů�ϴ�." << endl;
	}
	else if (x == y) {
		cout << x << "��/��" << y << "�� �����մϴ�." << endl;
	}
	else {
		cout << x << "��/��" << y << "���� �۽��ϴ�." << endl;
	}

	cout << "���α׷��� �����մϴ�.";
	*/

	/* ���� ū ����
	int a, b, c;

	cout << "3���� ������ �Է��Ͻÿ�: ";
	cin >> a >> b >> c;

	cout << "���� ū ������" << max(a, b, c) << endl;
	*/

	/*��� �ڵ� ���߱�
	char secret_code = 'h';
	char code;

	cout << "����ڵ带 ���纸����: ";
	cin >> code;

	if (code > secret_code) {
		cout << code << "�ڿ� ����" << endl;
	}
	else if (code == secret_code) {
		cout << "���߾����ϴ�." << endl;
	}
	else {
		cout << code << "�տ� ����" << endl;
	}
	*/

	/*���� ������
	int day;

	cout << "0~6 ������ ������ �Է��ϼ���: ";
	cin >> day;

	switch (day) {
	case 0: cout << "�Ͽ���" << endl;
		break;
	case 1: cout << "������" << endl;
		break;
	case 2: cout << "ȭ����" << endl;
		break;
	case 3: cout << "������" << endl;
		break;
	case 4: cout << "�����" << endl;
		break;
	case 5: cout << "�ݿ���" << endl;
		break;
	case 6: cout << "�����" << endl;
		break;
	}*/
	
	/* ����
	int month;

	cout << "1~12 ������ ������ �Է��� �ּ���: ";
	cin >> month;

	switch (month) {
	case 12: case 1: case 2: cout << "�ܿ�" << endl;
		break;
	case 3: case 4: case 5: cout << "��" << endl;
		break;
	case 6: case 7: case 8: cout << "����" << endl;
		break;
	case 9: case 10: case 11: cout << "����" << endl;
		break;
	}
	*/

	/*
	int num1 = 0, num2 = 0, num3 = -1;
	int sum1 = 0, sum2 = 0;

	while (num1 < 10) {
		num1++;

		cout << num1 << " ";
	}

	cout << endl;

	while (num2 < 10) {
		num2 += 2;
		sum1 += num2;
		cout << num2 << " ";
	}

	cout << endl;

	while (num3 < 9) {
		num3 += 2;
		sum2 += num3;
		cout << num3 << " ";
	}

	cout << endl << sum1 << " " << sum2;
	*/

	/*
	int n = 10;
	while (n > 0) {
		cout << n << endl;
		n--;
	}
	cout << "�߻�! \n";
	*/

	/*������ ���ϴ� ��
	int num;
	int n = 1;

	cout << "���ϴ� ����? : ";
	cin >> num;
	
	while (n < 10) {
		cout << num << " x " << n << " = " << n * num << endl;
		n++;
	}*/

	/*
	int num = 2;
	int n = 1;

	while (num < 10) {
		while (n < 10) {
			cout << num << " x " << n << " = " << n * num << endl;
			n++;
		}
		num++;
		n = 1;
		cout << endl;
	}*/
	
	/*
	string str;

	do {
		cout << "���ڿ��� �Է��Ͻÿ�: ";
		getline(cin, str);
		cout << "������� �Է�: " << str << '\n';
	} while (str != "��");
	*/

	/* ������ ���ϱ�
	srand(time(NULL));

	int random = rand() % 100 + 1;
	int num, count = 0;

	while (random == num) {
		cout << "������ �����Ͽ� ���ÿ�: ";
		cin >> num;

		count++;

		if (num > random) {
			cout << "������ ������ �����ϴ�.\n";
		}
		else if (num < random){
			cout << "������ ������ �����ϴ�.\n";
		}
	}

	cout << "�����մϴ�. �õ� Ƚ��= " << count;
	*/
	
	/* ���丮��
	long fact = 1;
	int n;

	cout << "������ �Է��Ͻÿ� : ";
	cin >> n;

	for (int i = 1; i <= n; i++) {
		fact *= i;
	}

	cout << n << "!�� " << fact << "�Դϴ�.\n";
	*/

	/*
	int arr1[5] = { 10, 20, 30, 40, 50 };

	for (int x : arr1) {
		cout << x << ", ";
	}*/

	/*	���ѷ���
	int num;
	int sum = 0;

	while (true) {
		cin >> num;
		sum += num;
		if (num == 0) {
			break;
		}
	}

	cout << "���� : " << sum << "�Դϴ�" << endl;
	*/

	/*
	for (int i = 1; i <= 10; i++) {
		if (i % 3 == 0) {
			continue;
		}
		else {
			cout << i << " ";
		}
	}
	*/

	/*
	for (int i = 1; i < 10; i++)
	{
		for (int j = 2; j < 10; j++) {
			cout << j << " x " << i << " = " << j * i << "\t";
		}

		cout << endl;
	}*/

	for (int i = 0; i < 5; i++) {
		for (int j = 0; j < i + 1; j++) {
			cout << "*";
		}

		cout << endl;
	}

	cout << endl;

	for (int i = 0; i < 5; i++) {
		for (int j = 0; j < 5-i; j++) {
			cout << "*";
		}

		cout << endl;
	}

	cout << endl;

	for (int i = 0; i < 5; i++) {
		for (int j = 5; j > i + 1; j--) {
			cout << " ";
		}
		for (int k = 0; k < i * 2 + 1; k++) {
			cout << "*";
		}
		cout << endl;
	}

	cout << endl;

	for (int i = 0; i < 5; i++) {
		for (int j = 0; j < i; j++) {
			cout << " ";
		}
		for (int k = 10; k > i * 2 + 1; k--) {
			cout << "*";
		}
		cout << endl;
	}

	return 0;
}

char grade(int score) {

	if (score >= 90) {
		return 'A';
	}
	else if (score >= 80) {
		return 'B';
	}
	else if (score >= 70) {
		return 'C';
	}
	else if (score >= 60) {
		return 'D';
	}
	else {
		return 'F';
	}

	switch (score / 10)
	{
	case 9: return 'A';
		break;
	case 8: return 'B';
		break;
	case 7: return 'C';
		break;
	case 6: return 'D';
		break;
	default: return 'F';
		break;
	}
}

int max(int a, int b, int c) {
	if (a > b && a > c) {
		return a;
	}
	else if (b > a && b > c) {
		return b;
	}
	else {
		return c;
	}
}