#include <iostream>
using namespace std;

void pattern8_(int row){
        int nsp = row-1;
        
        for(int r=1;r<=row;r++){
            for(int csp=1;csp<=nsp;csp++){
                cout<<"\t";
            }
            cout<<"*\t";
            nsp--;
            cout<<endl;
        }
        
    }
int main()
{
    int n;
    cin >> n;


    pattern8_(n);
    //write your code here
    
    return 0;
    
}