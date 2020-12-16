#include<iostream>
#include<vector>
using namespace std;

int lastIdx( vector<int>arr, int target){
        
        int idx = -1;
        for(int i=arr.size()-1; i>=0;i--){
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
    cout<<"Last index of "<<d<<" is "<<lastIdx(arr,d);
    return 0;
}
