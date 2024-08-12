#pragma once

class Course {
public:
	void setCourseName(const char c[]);
	void setName(const char n[]);
	int getCourseName(char c[]);
	int getName(char n[][30]);
	int getCount();

private:
	char courseName[30];
	char name[10][30];
	int count;
};