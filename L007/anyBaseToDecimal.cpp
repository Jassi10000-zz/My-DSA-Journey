#include<iostream>
#include<Math.h>
using namespace std;


int abtd(int n, int conB){

    int sum=0;
    int p=1;
    while(n != 0){
        int r = n % 10;
        n = n / 10;
        sum += r * p;
        p *= conB;
    }

    return sum;
}

int main(){

    int n,conB;
    cin>>n;

    cin>>conB;
    cout<<abtd(n, conB);
    return 0;
}