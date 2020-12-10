#include<iostream>
using namespace std;


void pattern18(int n){

    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){

            if(i == j || (i+j == n+1 && i!=j )){
                cout<<"*\t";
            }
            else if(i == 1){
                cout<<"*\t";
            }
            else if(i > n/2 + 1 && j > 1 && j < n){
                if(i > j && i+j > n+1){
                    cout<<"*\t";
                }
                else{
                    cout<<"\t";
                }
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

    pattern18(n);

    return 0;
}