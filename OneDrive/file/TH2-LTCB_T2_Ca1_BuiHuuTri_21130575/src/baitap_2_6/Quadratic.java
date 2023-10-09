package baitap_2_6;

class Quadratic {
double a;

double b;

double c;
/**
 * this is constructor 
 * example
 * Quadratic q1= new Quadratic(0.0, 1.0, 2.0);
 * Quadratic q2= new Quadratic(2.0, 1.0, 2.0);
 * Quadratic q3= new Quadratic(1.0, 2.0, 1.0);
 * Quadratic q4= new Quadratic(2.0, 3.0, 1.0);

 * @param a
 * @param b
 * @param c
 */

Quadratic(double a, double b, double c) {

this.a = a;

this.b = b;

this.c =c;

}
/**
 * this method to compute delta 
 * @return
 */
double computeDelta() {

return this.b * this.b - 4 * this.a * this.c;

}
/**
 * phuong thuc phan loai ket qua nghiem dua vao delta
 * example
 * * Quadratic q1= new Quadratic(0.0, 1.0, 2.0);
 * Quadratic q2= new Quadratic(2.0, 1.0, 2.0);
 * Quadratic q3= new Quadratic(1.0, 2.0, 1.0);
 * Quadratic q4= new Quadratic(2.0, 3.0, 1.0);
 * q1.whatKind()=>degenerate
 * q2.whatKind()=> none
 * q3.whatKind()=> one solution
 * q4.whatKind()=>two solution
 * @return
 */
String whatKind() {

double delta = this.computeDelta();

if (this.a == 0) return "degenerate";

if (delta < 0) return "none";

if (delta == 0) return "one solution";

return "two solution";

}

}
