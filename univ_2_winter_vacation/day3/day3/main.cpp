#include <iostream>
#include <ctime>
#include <vector>
using namespace std;

#define ARR_SIZE 5
#define SIZE 5

int main() {
	/* day 3 - 1
	int arr[5] = { 1, 2, 3, 4, 5 };

	for (int i = 0; i < 5; i++) {
		cout << "arr[" << i << "]=" << arr[i] << ", " << &arr[i] << endl;
	}*/

	/* day 3 - 3
	int num[10], sum = 0;

	for (int i = 0; i < 10; i++) {
		cout << "학생들의 성적을 입력하시오: ";
		cin >> num[i];
		sum += num[i];
	}

	cout << "성적 평균 = " << sum / 10 << endl;
	*/


	/*
	int size = 1, arr[10];

	cout << "크기를 입력하시오(1~10) : ";
	cin >> size;

	cout << "10개의 숫자를 입력하세요: ";

	for (int i = 0; i < size; i++) {
		cin >> arr[i];
	}

	cout << "입력한 숫자들을 거꾸로 출력: ";

	for (int i = size - 1; i >= 0; i--) {
		cout << arr[i] << " ";
	}*/

	/*day 3 - 5
	int list[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	
	for (int i : list) {
		cout << i << " ";
	}

	cout << endl;

	for (int i : list) {
		cout << i * i << " ";
	}

	cout << endl;

	for (int &i : list) {
		cout << i << " ";
	}*/

	/* 3 - 6
	int arr[10];
	int max = 0;

	srand(time(NULL));

	for (int& i : arr) {
		i = rand() % 100 + 1;
		cout << i << " ";

		if (max < i) {
			max = i;
		}
	}

	cout << endl << "최대값 : " << max << endl;
	*/


	/*3 - 9
	int x, y;
	bool count = true;

	char arr[3][3];

	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			arr[i][j] = ' ';
		}
	}

	while(1) {
		cout << "(x, y) 좌표: ";
		cin >> x >> y;

		arr[x][y] = (count == true) ? 'O' : 'X';
		count = !count;

		for (int i = 0; i < 3; i++) {
			cout << "---|---|---" << endl;
			cout << arr[i][0] << "  | " << arr[i][1] << " |  " << arr[i][2] << endl;
		}
		cout << "---|---|---" << endl;
	}
	*/

	/*3 - 10
	int data[] = { 12, 34, 51, 22, 91, 12, 15 };
	int size = sizeof(data) / sizeof(*data);
	int key;

	for (int i = 0; i < size; i++) {
		cout << data[i] << ' ';
	}

	cout << "\n\n찾을 값(키) : ";
	cin >> key;

	for (int i = 0; i < size; i++) {
		if (data[i] == key) {
			cout << "찾는 원소의 인덱스 값은 : " << i << endl;
		}
	}
	*/

	/*3 - 11
	int data[SIZE] = { 52, 31, 28, 17, 46 };
	int temp;
	int index_min;

	cout << "data = ";
	for (int i = 0; i < SIZE; i++) {
		cout << data[i] << ' ';
	}

	cout << endl;

	for (int i = 0; i < SIZE; i++) {
		index_min = i;

		for (int j = i + 1; j < SIZE; j++) {
			if (data[index_min] > data[j]) {
				index_min = j;
			}
		}

		if (i != index_min) {
			temp = data[i];
			data[i] = data[index_min];
			data[index_min] = temp;
		}

		cout << "i = " << i << "일 때 정렬 결과 : ";
		for (int j = 0; j < 5; j++) {
			cout << data[j] << ' ';
		}
		cout << endl;
	}

	cout << "Sort data = ";
	for (int i = 0; i < 5; i++) {
		cout << data[i] << ' ';
	}
	cout << endl;
	*/

	/*벡터 기본 문법
	vector<int> arr = { 1, 2, 3, 4, 5 };

	for (auto& i : arr) {
		cout << i << " ";
	}
	cout << endl;

	arr.push_back(1);
	arr.insert(arr.begin(), 7);
	arr.insert(arr.begin() + 2, 10);

	for (auto& i : arr) {
		cout << i << " ";
	}
	cout << endl;

	arr.pop_back();
	arr.erase(arr.begin() + 3);
	arr.clear();

	for (auto& i : arr) {
		cout << i << " ";
	}
	cout << endl;
	*/

	/*3 - 13
	string s;
	cout << "주민등록번호를 입력하시오: ";
	cin >> s;

	cout << "-가 제거된 주민등록번호: ";
	for (auto& c : s) {
		if (c == '-') {
			continue;
		}
		cout << c;
	}*/

	/*3 - 15
	string str1 = "Hello", str2 = "World";

	if (str1 == str2) {
		cout << "동일한 문자열입니다." << endl;
	}
	else {
		cout << "동일한 문자열이 아닙니다." << endl;
	}

	if (str1 < str2) {
		cout << "str1이 앞에 있습니다." << endl;
	}
	else {
		cout << "str2이 앞에 있습니다." << endl;
	}

	*/

	/*3 - 20
	string str1, str2;
	int count = 0;

	cout << "DNA1:";
	cin >> str1;
	cout << "DNA2:";
	cin >> str2;

	for (int i = 0; i < str1.size(); i++) {
		if (str1[i] != str2[i]) {
			count++;
		}
	}

	cout << "해밍거리는 " << count;
	*/

char ch;
	string sol;
	string list[] = { "the", "c++", "programming", "langeuage" };
	srand(time(NULL));

	int n = rand() % 4;
	sol = list[n];

	string g(sol.length(), '_');

	while (true) {
		cout << g << endl;
		cout << "글자를 입력하시오: ";
		cin >> ch;

		for (int i = 0; i < sol.length(); i++) {
			if (ch == sol[i]) {
				g[i] = ch;
			}
		} 

		if (sol == g) {
			cout << sol << endl;
			cout << "성공하였습니다!";
			break;
		}
	}

	return 0;
}