#include<iostream>
#include<vector>

using namespace std;


int minEle(vector<int>arr){
    int minEl = (int) 1e8;

    for(int el:arr){
        if (el < maxEl) minEl = el;
    }
    return minEl;
}
int main(){

    int n;
    cin>>n;

    vector<int>arr(n,0);
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    cout<<"Min element is " <<minEle(arr);
    return 0;
}

