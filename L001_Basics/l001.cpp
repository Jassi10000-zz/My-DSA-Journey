#include<iostream>
using namespace std;


void printHello(){
    cout<<"Hello there" <<endl;
}
void valueOfA() {
    int a = 10;
    cout<<"Value of A is : " + to_string(a)<<endl;
}

int main(){
    printHello();
    valueOfA();

    return 0;
}