class RandomInteger {
private:
	int low;
	int high;
	int value;
public:
	RandomInteger(int low, int high);
	~RandomInteger();
	RandomInteger(const RandomInteger& random) = delete;
	void print() const;
};