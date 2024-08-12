#include <iostream>
#include "Student.h"
using namespace std;

Student::Student() {
	score[0] = 0;
	score[1] = 0;
	score[2] = 0;

	sum = 0;
	average = 0;
}

Student::Student(const int s1, const int s2, const int s3) {
	score[0] = s1;
	score[1] = s2;
	score[2] = s3;

	sum = 0;
	average = 0;
}

void Student::setScore(const int s1, const int s2, const int s3) {
	score[0] = s1;
	score[1] = s2;
	score[2] = s3;
}
void Student::showScore() {
	for (int i = 0; i < 3; i++) {
		cout << "Á¡  ¼ö " << i + 1 << " : " << score[i] << endl;
		cout << "ÃÎ  Á¡ :  " << sum << endl;
		cout << "Æò  ±Õ :  " << average << endl;
	}
}
void Student::sumAverage() {
	for (int i = 0; i < 3; i++) {
		sum += score[i];
		average = sum / 3.;
	}
}