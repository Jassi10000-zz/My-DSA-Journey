#include<iostream>
using namespace std;


void pattern5_(int row){
    int nsp=row/2;
    int nst=1;
    for(int r=1;r<=row;r++){
            for(int csp=1;csp<=nsp;csp++){
                    cout<<"\t";
                }  

            for(int cst=1;cst<=nst;cst++){
                    cout<<"*\t";
                }
        if(r <= row/2){
            nsp--;
            nst+=2;
        }
        else{
            nsp++;
            nst-=2;
        }
        cout<<endl;
    }
}

int main(){

    int n;
    cin>>n;

    pattern5_(n);
    return 0;
}