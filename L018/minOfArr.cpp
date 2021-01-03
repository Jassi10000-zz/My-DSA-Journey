#include<iostream>
#include<vector>
using namespace std;

int minArr(vector<int>& arr, int idx){

    if(idx == arr.size()) return (int)1e9;

    int minEle = minArr(arr,idx+1);
    return min(minEle,arr[idx]);
}

int main(){

    int n;
    cin>>n;

    vector<int>arr(n,0);
    for(int i=0;i<arr.size();i++){
        cin>>arr[i];
    }

    cout<<minArr(arr,0);
    return 0;
}