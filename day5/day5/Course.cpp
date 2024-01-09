#include <iostream>
#include "Course.h"
using namespace std;

void Course::setCourseName(const char c[]) {
	strcpy_s(courseName, 30, c);
	count = 0;
}

void Course::setName(const char n[]) {
	strcpy_s(name[count], 30, n);
	count++;
}

int Course::getCourseName(char c[]) {
	if (count == 0) {
		return 0;
	}

	strcpy_s(c, 30, courseName);
	return 1;
}

int Course::getName(char n[][30]) {
	if (count == 0) {
		return 0;
	}

	for (int i = 0; i < count; i++) {
		strcpy_s(n[i], 30, name[i]);
	}

	return 1;
}

int Course::getCount() {
	return count;
}