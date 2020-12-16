#include<iostream>
using namespace std;


int binaryAdd(int n1, int n2){

    int carry = 0 , pow = 1 , res = 0;
    while(n1 !=0 || n2 !=0 || carry!= 0 ){

        int r1 = n1 % 10;
        int r2 = n2 % 10;

        n1 /= 10;
        n2 /= 10;

        int sum = r1 + r2 + carry;

        int r = sum % 2;
        carry = sum / 2;

        res += r * pow;
        pow *= 10;
        
    }
    return res;

}
int main(){

    int n1,n2;
    cin>>n1>>n2;

    cout<<binaryAdd(n1,n2);
    return 0;
}