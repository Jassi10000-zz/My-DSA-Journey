#include<iostream>
using namespace std;


void pattern17(int n){

    int nsp = n/2;
    int nst = 1;
    
    for(int i=1;i<=n;i++){

        for(int j=1;j<=nsp;j++){

            if(i == n/2 + 1){
                cout<<"*\t";
            }
            else{
                cout<<"\t";
            }
            
        }

        for(int j=1;j<=nst;j++){
            cout<<"*\t";
        }

        if(i <= n/2){
            nst++;
        }
        else{
            nst--;
        }
        
        cout<<endl;
    }

}
int main(){

    int n;
    cin>>n;

    pattern17(n);
    return 0;
}