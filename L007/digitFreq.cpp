#include<iostream>
using namespace std;


int digitFreq_(long n , int a){


    int count = 0;

    while(n != 0){

        int r = n % 10;

        if( r == a){

            count++;
        }
        n = n/10;

    }

    return count;

}
int main(){
    long n;
    cin>>n;

    int a;
    cin>>a;

    cout<<digitFreq_(n,a);
    return 0;
}