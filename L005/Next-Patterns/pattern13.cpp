#include<iostream>
using namespace std;


void pattern13(int n){

    for(int i=0;i<n;i++){

        int icj = 1;
        for(int j=0;j<=i;j++){

            cout<<icj<<"\t";

            int icjp1 = icj * (i - j ) / (j + 1);
            
            icj = icjp1;
            
        }

        cout<<endl;
    }
}

int main(){

    int n;
    cin>>n;


    pattern13(n);
    return 0;
}
