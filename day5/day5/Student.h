#pragma once

class Student {
public:
	Student();
	Student(const int s1, const int s2, const int s3);
	void setScore(const int s1, const int s2, const int s3);
	void showScore();
	void sumAverage();

private:
	int score[3], sum;
	double average;
};