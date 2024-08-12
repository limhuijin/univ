#include <iostream>
#include <ctime>
#include "RandomInteger.h"
using namespace std;

RandomInteger::RandomInteger(int low, int high)
	:low(low), high(high)
{
	srand(time(NULL));
	int temp = rand();
	value = temp % (high - low + 1) + low;
}

RandomInteger::~RandomInteger() {

}

void RandomInteger::print() const {
	cout << value << endl;
}