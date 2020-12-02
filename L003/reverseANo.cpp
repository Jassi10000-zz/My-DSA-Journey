#include<iostream>
using namespace std;

int reverseANo(int n){

    int rev_n = 0;
    while( n > 0){
        rev_n = rev_n * 10 + n%10;

        n = n/10;
    }
    return rev_n;
}


int main(){

    int n;
    cin>>n;

    int x = reverseANo(n);
    cout<<x<<endl;

    return 0;
}
