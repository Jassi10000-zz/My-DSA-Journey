#include<iostream>
using namespace std;


void pattern16(int n){

    int st=1;
    int count = 0;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=st;j++){
            count++;
            cout<<count + "\t";
            
        }
        st++;
        cout<<endl;
    }

}
int main(){

    int n;
    cin>>n;

    pattern16(n);
    return 0;
}