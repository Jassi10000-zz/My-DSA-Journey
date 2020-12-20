#include<iostream>
#include<vector>
using namespace std;

int main(){
    int n,m;
    cin>>n>>m;
    
    vector<vector<int>>arr(n,vector<int>(m,0));
    for(int i=0;i<arr.size();i++){
        for(int j=0;j<arr[0].size();j++){
            cin>>arr[i][j];
        }
    }
    
    
    for(int i=0;i<arr.size();i++){
        for(int j=0;j<arr[0].size();j++){
            cout<<arr[i][j]<<" ";
        }
        cout<<endl;
    }
    
    return 0;
}