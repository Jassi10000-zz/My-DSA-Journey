#include<iostream>
using namespace std;


void pattern3_(int row){
    int nsp=row-1;
    int nst=1;
    for(int r=1;r<=row;r++){
        for(int csp=1;csp<=nsp;csp++){
            cout<<"\t";
        }

        for(int cst=1;cst<=nst;cst++){
            cout<<"*\t";
        }
        nsp--;
        nst++;
        cout<<endl;
    }
}

int main(){

    int n;
    cin>>n;

    pattern3_(n);
    return 0;
}