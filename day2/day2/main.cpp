#include <iostream>
#include <string>
#include <ctime>
using namespace std;

char grade(int score);
int max(int a, int b, int c);

int main() {
	/*2의 배수
	int num;
	cout << "정수 1개 입력 : ";
	cin >> num;

	if (num % 2 == 0) {
		cout << "2의 배수입니다.";
	}
	else {
		cout << "2의 배수가 아닙니다.";
	}*/

	/* 3의 배수
	int num;
	cout << "정수 1개 입력 : ";
	cin >> num;

	if (num % 3 == 0) {
		cout << num << "은 3의 배수입니다." << endl;
	}
	else {
		cout << num << "은 3의 배수가 아닙니다." << endl;
	}

	cout << "프로그램을 종료합니다.";
	*/

	/* 정수 종류
	int num;
	cout << "정수 1개 입력 : ";
	cin >> num;

	if (num > 0) {
		cout << num << "은 양의 정수입니다." << endl;
	}
	else if (num == 0){
		cout << num << "은 0입니다." << endl;
	}
	else {
		cout << num << "은 음의 정수입니다." << endl;
	}

	cout << "프로그램을 종료합니다.";
	*/

	/* 등급 계산
	int score;
	cout << "정수 1개 입력 : ";
	cin >> score;

	cout << "학점은 " << grade(score) << "입니다." << endl;

	return 0;*/

	/*
	int x, y;
	cout << "x값을 입력하시오: ";
	cin >> x;
	cout << "y값을 입력하시오: ";
	cin >> y;

	if (x > y) {
		cout << x << "은/는" << y << "보다 큽니다." << endl;
	}
	else if (x == y) {
		cout << x << "은/는" << y << "와 동일합니다." << endl;
	}
	else {
		cout << x << "은/는" << y << "보다 작습니다." << endl;
	}

	cout << "프로그램을 종료합니다.";
	*/

	/* 가장 큰 정수
	int a, b, c;

	cout << "3개의 정수를 입력하시오: ";
	cin >> a >> b >> c;

	cout << "가장 큰 정수는" << max(a, b, c) << endl;
	*/

	/*비밀 코드 맞추기
	char secret_code = 'h';
	char code;

	cout << "비밀코드를 맞춰보세요: ";
	cin >> code;

	if (code > secret_code) {
		cout << code << "뒤에 있음" << endl;
	}
	else if (code == secret_code) {
		cout << "맞추었습니다." << endl;
	}
	else {
		cout << code << "앞에 있음" << endl;
	}
	*/

	/*요일 나오기
	int day;

	cout << "0~6 범위의 정수를 입력하세요: ";
	cin >> day;

	switch (day) {
	case 0: cout << "일요일" << endl;
		break;
	case 1: cout << "월요일" << endl;
		break;
	case 2: cout << "화요일" << endl;
		break;
	case 3: cout << "수요일" << endl;
		break;
	case 4: cout << "목요일" << endl;
		break;
	case 5: cout << "금요일" << endl;
		break;
	case 6: cout << "토요일" << endl;
		break;
	}*/
	
	/* 계절
	int month;

	cout << "1~12 범위의 정수를 입력해 주세요: ";
	cin >> month;

	switch (month) {
	case 12: case 1: case 2: cout << "겨울" << endl;
		break;
	case 3: case 4: case 5: cout << "봄" << endl;
		break;
	case 6: case 7: case 8: cout << "여름" << endl;
		break;
	case 9: case 10: case 11: cout << "가을" << endl;
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
	cout << "발사! \n";
	*/

	/*구구단 원하는 단
	int num;
	int n = 1;

	cout << "원하는 단은? : ";
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
		cout << "문자열을 입력하시오: ";
		getline(cin, str);
		cout << "사용자의 입력: " << str << '\n';
	} while (str != "끝");
	*/

	/* 랜덤수 구하기
	srand(time(NULL));

	int random = rand() % 100 + 1;
	int num, count = 0;

	while (random == num) {
		cout << "정답을 추측하여 보시오: ";
		cin >> num;

		count++;

		if (num > random) {
			cout << "제시한 정수가 높습니다.\n";
		}
		else if (num < random){
			cout << "제시한 정수가 낮습니다.\n";
		}
	}

	cout << "축하합니다. 시도 횟수= " << count;
	*/
	
	/* 팩토리얼
	long fact = 1;
	int n;

	cout << "정수를 입력하시오 : ";
	cin >> n;

	for (int i = 1; i <= n; i++) {
		fact *= i;
	}

	cout << n << "!은 " << fact << "입니다.\n";
	*/

	/*
	int arr1[5] = { 10, 20, 30, 40, 50 };

	for (int x : arr1) {
		cout << x << ", ";
	}*/

	/*	무한루프
	int num;
	int sum = 0;

	while (true) {
		cin >> num;
		sum += num;
		if (num == 0) {
			break;
		}
	}

	cout << "총합 : " << sum << "입니다" << endl;
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