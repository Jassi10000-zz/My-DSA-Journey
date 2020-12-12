#include<iostream>
using namespace std;

void pattern11(int n){
     int nsp=1;
        int value = 0;
        for(int r=1;r<=n;r++){
            for(int csp=1;csp<=nsp;csp++){
                value++;
                cout<<value<<"\t";
                
            }
            nsp++;
            
            cout<<endl;
        }
}

int main(){

    int n;
    cin>>n;

    pattern11(n);
    
    return 0;
}
