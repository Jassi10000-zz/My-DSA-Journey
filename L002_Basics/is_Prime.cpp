#include <iostream>
using namespace std;

bool isPrime_(int n){
    bool prime = true;
    for(int i=2;i*i<=n;i++){
        if(n%i==0){
            prime = false;
            break;
        }   
    }
    return prime;
}

void isPrime(int n){
  
    if(n == 0 || n == 1) {
        cout<<"not prime"<<endl;
        return;
    }
    
    bool ans = isPrime_(n);
    if(ans) cout<<"prime"<<endl;
    else cout<<"not prime"<<endl;
}

int main(){
    int t;
    cin >> t;

    while ( t-- > 0){
        int n;
        cin>>n;
        isPrime(n);
    }
   
    
    return 0;
}