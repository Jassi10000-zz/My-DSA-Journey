#include<iostream>
using namespace std;

int reverseANo(long long n){

    int a = 0;
    while( n > 0){
        int r = n%10;

        int a = a * 10 + r;

        n = n/10;
    }
    return a;
}


int main(){

    long long n;
    cin>>n;

    int x = reverseANo(n);
    cout<<x<<endl;

    return 0;
}
