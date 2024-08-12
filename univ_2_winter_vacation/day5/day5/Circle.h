class Circle {
private:
	double radius;

public:
	Circle(double rds);
	Circle();
	~Circle();
	Circle(const Circle& circle);
	double getRadius();
	double getArea();
	double getPerimeter();
	void setRadius(double value);
};
