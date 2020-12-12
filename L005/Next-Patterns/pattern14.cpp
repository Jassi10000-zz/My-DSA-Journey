#include<iostream>
using namespace std;


void pattern14_(int x){
    
    for(int i=1;i<=10;i++){
        cout<<x<<"*"<<i<<"="<<x*i<<endl;
    }
    
}

int main(){

    int n;
    cin>>n;

    pattern14_(n);
    return 0;
}
