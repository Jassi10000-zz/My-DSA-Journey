#include<iostream>
using namespace std;

int countDigits(int n)
{
    int count = 0;
    while(n != 0 ){
        n=n/10;
        count++;
    }
    return count;
}

int rotateNO(int n, int r){
    int len = countDigits(n);
    r %= len;
    if(r<0) r = (r+len) % len;

    int mul=1,div=1;
    for(int i=1;i<=len;i++){
        if(i <= r) div *= 10;
        else mul *= 10;
    }

    int a =  n%div;
    int b = n/div;

    return a * mul + b;

}


int main(){

    int n;
    cin>>n;

    int r;
    cin>>r;

    cout<<rotateNO(n,r)<<endl;

    return 0;

}