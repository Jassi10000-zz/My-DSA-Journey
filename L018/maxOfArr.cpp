#include<iostream>
#include<vector>
using namespace std;

int maxArr(vector<int>& arr, int idx){

    if(idx == arr.size()) return -1;

    int maxEle = maxArr(arr,idx+1);
    return max(maxEle,arr[idx]);
}

int main(){

    int n;
    cin>>n;

    vector<int>arr(n,0);
    for(int i=0;i<arr.size();i++){
        cin>>arr[i];
    }

    cout<<maxArr(arr,0);
    return 0;
}