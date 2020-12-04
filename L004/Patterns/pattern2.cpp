#include<iostream>
using namespace std;


void pattern2_(int row){
    int nst=row;
    for(int r=1;r<=row;r++){
        for(int cst=1;cst<=nst;cst++){
            cout<<"*\t";
        }
        nst--;
        cout<<endl;
    }
}

int main(){

    int n;
    cin>>n;

    pattern2_(n);
    return 0;
}