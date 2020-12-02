#include<iostream>
using namespace std;


bool checkPythTrip(int a,int b, int c){
    if(a > b && a > c){
        if(a * a == b*b + c*c){
            return true;
        }
    }
    else if(b > a &&  b > c){
        if(b * b == a*a + c*c){
            return true;
        }
    }
    else{
        if(c * c == b*b + a*a){
            return true;
        }
    }
    return false;
}

int main(){

    int a , b , c;
    cin>>a>>b>>c;

    bool ans = checkPythTrip(a,b,c);
    if(ans) cout<<"true"<<endl;
    else cout<<"false"<<endl;
}