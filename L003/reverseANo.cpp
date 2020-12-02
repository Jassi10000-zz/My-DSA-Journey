1. This is the first presentation of a reverse no.
    I/P : 8366435     O/P : 5346638
        

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


2. This is the code for line-wise presentation of the digits of the reverse number

I/P: 234727
O/P: 7
     2
     7
     4
     3
     2

#include<iostream>
using namespace std;

void reverseANo(int n){

    long long rev_n = 0;
    while( n > 0){
        int r = n%10;
        cout<<r<<endl;
        n = n/10;
    }
    
}


int main(){

    int n;
    cin>>n;

    reverseANo(n);
    
}
