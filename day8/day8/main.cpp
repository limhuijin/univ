#include <iostream>
using namespace std;

class A {
public:
	int ss(int i) { return (i * 2); }
	int dd(int i) { return (ss(i) * 2); }
};

class B : public A {
public:
	int ss(int i) { return (i * 3); }
};

class Base {
public:
	virtual void f() { cout << "Base::f() called" << endl; }
};

class Derived : public Base {
public:
	virtual void f() { cout << "Derived::f() called" << endl; }
};

class GrandDerived : public Derived {
public:
	virtual void f() { cout << "GrandDerived::f() called" << endl; }
};


int main() {
	B bb;

	A* pA = new A;
	A* pB = new B;

	cout << bb.dd(2) << endl;
	cout << bb.ss(3) << endl;
	cout << pA->dd(2) << endl;
	cout << pA->ss(2) << endl;
	cout << pB->dd(2) << endl;

	delete pA;
	delete pB;

	Derived d, * pDer;
	pDer = &d;
	pDer->f();

	Base* pBase;
	pBase = pDer;
	pBase->f();

	GrandDerived g;
	Base* bp;
	Derived* dp;
	GrandDerived* gp;

	bp = dp = gp = &g;

	bp->f();
	dp->f();
	gp->f();

	return 0;
}