#include<iostream>
using namespace std;


void pattern12_(int n){
     int a=0 , b=1;

        for (int i = 1; i <= n; i++) {
            for (int j= 1; j <=i; j++) {
                cout<<a<<"\t";
                int c = a + b;
                a = b;
                b = c;
            }
            cout<<endl;
        }
}

int main(){

    int n;
    cin>>n;
    pattern12_(n);

    return 0;
}                                     
