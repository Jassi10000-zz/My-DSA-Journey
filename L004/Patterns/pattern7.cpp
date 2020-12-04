#include<iostream>
using namespace std;

void pattern7_(int row){

    int nsp = 0;
        

        for (int r = 1; r <= row; r++) {
            for (int csp = 1; csp <= nsp; csp++) {
                cout<<"\t";
            }
            cout<<"*";
            nsp++;
            cout<<endl;
        }
}

int main(){

    int n;
    cin>>n;

    pattern7_(n);

    return 0;
}