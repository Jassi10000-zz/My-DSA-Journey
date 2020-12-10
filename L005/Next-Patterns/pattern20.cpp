#include<iostream>
using namespace std;

void pattern20_(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (j == 0 || j == n - 1) {
                    cout<<"*\t";
                }else if(i>=n/2 && ( i == j || i+j == n-1)){
                    cout<<"*\t";
                }   
                else {
                    cout<<"\t";
                }
            }
            cout<<endl;
        }

}       
    int main(){

        int n;
        cin>>n;

        pattern20_(n);

        return 0;
    }
