#include<iostream>
using namespace std;


void pattern9(int n){

    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){

            if((i == j) || ((i+j==n+1) && (i!=j))){
                cout<<"*\t";
            }
            else{
                cout<<"\t";
            }
        }
        cout<<endl;
    }
}

int main(){

    int n;
    cin>>n;
    pattern9(n);

    return 0;
}