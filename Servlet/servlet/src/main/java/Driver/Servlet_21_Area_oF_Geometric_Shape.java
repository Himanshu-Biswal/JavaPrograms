package Driver;

public class Servlet_21_Area_oF_Geometric_Shape {

public double circle(double r) {
	double res = 3.142*r*r;
	return res;
}

public double elipse(double a,double b) {
	double res=3.142*a*b;
	return res;
}

public double trapezoid(double a,double b,double h) {
	double res=((a+b)*h)/2;
	return res;
}

public double rhombus(double a,double b) {
	double res=(a*b)/2;
	return res;
}

public double triangle(double a,double b) {
	double res=(a*b)/2;
	return res;
}

public double pyramid(double a, double l) {
	// base area + 2al; 2al=lateral area;
	double res = a + 2*a*l;
	return res;
}

public double cylinder(double r, double h) {
//	2πr2 +2πrh
	double res = (2*3.142*(r*r))+2*3.142*r*h;
	return res;
}
}
