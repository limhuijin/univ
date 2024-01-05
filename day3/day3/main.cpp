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
		cout << "�л����� ������ �Է��Ͻÿ�: ";
		cin >> num[i];
		sum += num[i];
	}

	cout << "���� ��� = " << sum / 10 << endl;
	*/


	/*
	int size = 1, arr[10];

	cout << "ũ�⸦ �Է��Ͻÿ�(1~10) : ";
	cin >> size;

	cout << "10���� ���ڸ� �Է��ϼ���: ";

	for (int i = 0; i < size; i++) {
		cin >> arr[i];
	}

	cout << "�Է��� ���ڵ��� �Ųٷ� ���: ";

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

	cout << endl << "�ִ밪 : " << max << endl;
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
		cout << "(x, y) ��ǥ: ";
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

	cout << "\n\nã�� ��(Ű) : ";
	cin >> key;

	for (int i = 0; i < size; i++) {
		if (data[i] == key) {
			cout << "ã�� ������ �ε��� ���� : " << i << endl;
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

		cout << "i = " << i << "�� �� ���� ��� : ";
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

	/*���� �⺻ ����
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
	cout << "�ֹε�Ϲ�ȣ�� �Է��Ͻÿ�: ";
	cin >> s;

	cout << "-�� ���ŵ� �ֹε�Ϲ�ȣ: ";
	for (auto& c : s) {
		if (c == '-') {
			continue;
		}
		cout << c;
	}*/

	/*3 - 15
	string str1 = "Hello", str2 = "World";

	if (str1 == str2) {
		cout << "������ ���ڿ��Դϴ�." << endl;
	}
	else {
		cout << "������ ���ڿ��� �ƴմϴ�." << endl;
	}

	if (str1 < str2) {
		cout << "str1�� �տ� �ֽ��ϴ�." << endl;
	}
	else {
		cout << "str2�� �տ� �ֽ��ϴ�." << endl;
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

	cout << "�عְŸ��� " << count;
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
		cout << "���ڸ� �Է��Ͻÿ�: ";
		cin >> ch;

		for (int i = 0; i < sol.length(); i++) {
			if (ch == sol[i]) {
				g[i] = ch;
			}
		} 

		if (sol == g) {
			cout << sol << endl;
			cout << "�����Ͽ����ϴ�!";
			break;
		}
	}

	return 0;
}