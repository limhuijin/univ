#include <iostream>
#include "Weight.h"
using namespace std;

double Weight::getheight() {
	return height;
}

double Weight::getweight() {
	return weight;
}

int Weight::StdWeight() {
	if (height <= 0) {
		isState = 2;
		return 0;
	}

	double sw = (height / 100) * (height / 100) * 21;
	double pibw = (weight / sw) * 100;

	if (pibw >= 110) {
		isState = 1;
	}
	else if (pibw < 90) {
		isState = -1;
	}
	else {
		isState = 0;
	}

	return isState;
}

int Weight::getIsState() {
	StdWeight();
	return isState;
}

void Weight::setheight(double value) {
	height = value;
}

void Weight::setweight(double value) {
	weight = value;
}