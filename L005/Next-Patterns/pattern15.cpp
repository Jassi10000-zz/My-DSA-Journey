#include<iostream>
using namespace std;


void pattern6_(int row){
    int nsp=1;
    int nst=row/2+1;
    for(int r=1;r<=row;r++){
            for(int csp=1;csp<=nsp;csp++){
                    cout<<"\t";
                }

            for(int cst=1;cst<=nst;cst++){
                    cout<<count + "\t";
                }  

        if(r <= row/2){
            nst--;
            nsp+=2;
        }
        else{
            nst++;
            nsp-=2;
        }
        cout<<endl;
    }
}

int main(){

    int n;
    cin>>n;

    pattern6_(n);
    return 0;
}