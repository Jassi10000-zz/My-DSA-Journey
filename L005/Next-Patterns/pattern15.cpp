#include<iostream>
using namespace std;


void pattern15_(int row){
    
    int sp = row/2;
    int st = 1;

    int val = 1;
    for(int i=1;i<=row;i++){

        for(int j = 1 ; j<=sp;j++){
            cout<<"\t";
        }
        int cval = val;
        for(int j = 1 ; j<=st;j++){
            cout<<cval<<"\t";
            

            if(j <= st/2){
                cval++;
            }
            else{
                cval--;
            }
        }


        if(i <= row/2){


            sp--;
            st += 2;
            val++;
        }
        else{
            sp++;
            st -= 2;
            val--;
        }
       cout<<endl;
    }
}

int main(){

    int n;
    cin>>n;

    pattern15_(n);
    return 0;
}
