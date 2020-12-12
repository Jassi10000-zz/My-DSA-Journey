#include<iostream>
using namespace std;


void pattern10(int n){

    int outSp = n/2;
   
    int inSp = -1;

    for(int i = 1 ; i <= n ; i++){

        for(int j=1; j <= outSp ; j++){
            cout<<"\t";
        }

        cout<<"*\t";
        
        for(int j=1; j <= inSp ; j++){
            cout<<"\t";
        }

        if(i > 1  && i < n){
            cout<<"*\t";
        }

        if(i <= n/2){

            outSp--;
            
            inSp += 2;
        }

       
        else{

            outSp++;
          
            inSp -= 2;

        }

        cout<<endl;
    }
}
int main(){

    int n;
    cin>>n;

    pattern10(n);

    return 0;
}
