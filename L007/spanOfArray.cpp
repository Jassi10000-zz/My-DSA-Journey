#include<iostream>
#include<vector>

using namespace std;





int spanOfArr(vector<int>&arr){
    int maxEl = (int) -1e8;
    int minEl = (int) 1e8;
    for(int el:arr){
        if (el > maxEl) maxEl = el;
        if (el < minEl) minEl = el;
    }
  
    return maxEl - minEl;
}

int main(){

    int n;
    cin>>n;

    vector<int>arr(n,0);
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }

    cout<<spanOfArr(arr);

    return 0;
}