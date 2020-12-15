#include<iostream>
#include<vector>

using namespace std;


int maxEle(vector<int>arr){
    int maxEl = (int) -1e8;

    for(int el:arr){
        if (el > maxEl) maxEl = el;
    }
    return maxEl;
}
int main(){

    int n;
    cin>>n;

    vector<int>arr(n,0);
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    cout<<"Max element is " <<maxEle(arr);
    return 0;
}

