#include <iostream>
#include <vector>
using namespace std;

void merge(vector<int>& arr, int left, int mid, int right);
void mergeSort(vector<int>& arr, int left, int right);

int main() {
	
	/* 버블 정렬
	vector<int> arr = { 5, 3, 1, 4, 2 };
	int n = arr.size();
	int temp;

	for (int i = 0; i < n - 1; i++) {
		cout << i << "회 실행 : ";

		for (int j = 0; j < n - i - 1; j++) {
			if (arr[j] > arr[j + 1]) {
				temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
		}

		for (int k = 0; k < n; k++) {
			cout << arr[k] << " ";
		}

		cout << endl;
	}

	cout << "결과 : ";

	for (int i = 0; i < n; i++) {
		cout << arr[i] << " ";
	}*/

	vector<int> arr = { 12, 11, 13, 5, 6, 7 };

	cout << "원래 배열: ";
	for (int num : arr) {
		cout << num << " ";
	}
	cout << endl;

	mergeSort(arr, 0, 5);

	cout << "병합 정렬 후 배열: ";
	for (int num : arr) {
		cout << num << " ";
	}
	cout << endl;

	return 0;
}

void merge(vector<int>& arr, int left, int mid, int right) {
	int n1 = mid - left + 1;
	int n2 = right - mid;

	vector<int> L(n1), R(n2);

	for (int i = 0; i < n1; i++)
	{
		L[i] = arr[left + i];
	}

	for (int j = 0; j < n2; j++)
	{
		R[j] = arr[mid + 1 + j];
	}

	int i = 0, j = 0, k = left;

	while (i < n1 && j < n2) {
		if (L[i] <= R[j]) {
			arr[k] = L[i];
			i++;
		}
		else {
			arr[k] = R[j];
			j++;
		}
		k++;
	}

	while (i < n1) {
		arr[k] = L[i];
		i++;
		k++;
	}
	while (j < n2) {
		arr[k] = R[j];
		j++;
		k++;
	}
}

void mergeSort(vector<int>& arr, int left, int right) {
	if (left < right) {
		int mid = left + (right - left) / 2;

		mergeSort(arr, left, mid);
		mergeSort(arr, mid + 1, right);
		merge(arr, left, mid, right);
	}
}