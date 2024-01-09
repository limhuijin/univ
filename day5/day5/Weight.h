#pragma once

class Weight {
private:
	double height;
	double weight;
	int isState;

public:
	double getheight();
	double getweight();
	int StdWeight();
	int getIsState();
	void setheight(double value);
	void setweight(double value);
};
