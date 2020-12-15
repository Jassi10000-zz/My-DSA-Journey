#include<iostream>
#include<Math.h>
using namespace std;


int dtab(int n, int conB){

    int sum=0;
    int p=1;
    while(n != 0){
        int r = n % conB;
        n = n / conB;
        sum += r * p;
        p *= 10;
    }

    return sum;
}

int main(){

    int n,conB;
    cin>>n;

    cin>>conB;
    cout<<dtab(n, conB);
    return 0;
}