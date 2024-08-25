
class Add {
    int add;
    int b;
    int c;
    int d;
 
    Add() {
    }
 
    void Add1(int var1) {
       this.b = var1 + var1;
       System.out.println("Addition of 1 num=" + this.b);
    }
 
    void Add1(int var1, int var2) {
       this.c = var1 + var2;
       System.out.println("Sum of 2 num=" + this.c);
    }
 
    void Add1(int var1, int var2, int var3) {
       this.d = var1 + var2 + var3;
       System.out.println("Addition of 3 num=" + this.d);
    }
 }
 