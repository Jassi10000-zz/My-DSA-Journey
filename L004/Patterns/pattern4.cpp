#include<iostream>
using namespace std;


void pattern4_(int row){
    int nsp=0;
    int nst=row;
    for(int r=1;r<=row;r++){
        for(int csp=1;csp<=nsp;csp++){
            cout<<"\t";
        }

        for(int cst=1;cst<=nst;cst++){
            cout<<"*\t";
        }
        nsp++;
        nst--;
        cout<<endl;
    }
}

int main(){

    int n;
    cin>>n;

    pattern4_(n);
    return 0;
}