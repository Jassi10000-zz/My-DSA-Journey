#include<iostream>
using namespace std;

int factorial(int n){
    // write your code here
    
    return (n==0) ? 1 : n * factorial(n-1);
    
}


int main(){
    int n; cin>>n;
    cout<<factorial(n);
}
