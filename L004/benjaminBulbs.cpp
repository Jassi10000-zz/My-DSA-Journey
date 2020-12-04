#include<iostream>
using namespace std;


void benjaminBulbs(int n){
    for(int i=1;i * i < n ;i++){
        cout<<i*i<<endl;
    }
}


int main(){

   int noOfFluctuations;
   cin>>noOfFluctuations; 

   benjaminBulbs(noOfFluctuations);
    
    return 0;
}