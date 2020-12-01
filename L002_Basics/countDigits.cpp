#include<iostream>
using namespace std;

void countDigits_(long long n){

    int count = 0;
    while(n != 0){
        
        n = n / 10;
        count++;

    }
    cout<<count<<endl;
}

int main(){
    long long n;
    cin>>n;

    countDigits_(n);

    return 0;
}