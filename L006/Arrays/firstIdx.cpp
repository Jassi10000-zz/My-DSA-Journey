#include<iostream>
#include<vector>
using namespace std;

int firstIdx( vector<int>arr, int target){
        
        int idx = -1;


        for(int i=0; i<arr.size();i++){
            if ( arr[i] == target) {
                idx= i;
                break;
            }
        }


        return idx;
    }   

int main(){

    int n,d;
    cin>>n;

    vector<int>arr(n,0);
    for(int i=0;i<arr.size();i++){
        cin>>arr[i];
    }

    cin>>d;
    cout<<"First index of "<<d<<" is "<<firstIdx(arr,d);
    return 0;
}
