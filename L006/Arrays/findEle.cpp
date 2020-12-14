#include<iostream>
#include<vector>
using namespace std;


int findEle(vector<int>& arr , int data{

    int idx = -1;
    for(int i=0;i<arr.size();i++){
        if(arr[i] == data){
            idx = i;
            break;
        }
    }
    return idx;

}

int main(){

    int n,d;
    cin>>n;

    vector<int>arr(n,0);
    for(int i=0i<n;i++){
        cin>>arr[i];
    }
    cin>>d;

    findEle(arr,d);
    return 0;
}

