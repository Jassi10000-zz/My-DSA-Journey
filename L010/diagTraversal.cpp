#include<iostream>
using namespace std;


void diagTraversal(vector<vector<int>>& arr){

    for(int gap=0;gap<arr[0].size();gap++){

        for(int i=0,j=gap ; j < arr[0].length ; i++,j++){

            cout<<arr[i][j]<<endl;
        }
    }
    

}

int main(){


    int n;
    cin>>n;


    vector<vector<int>> arr(n,vector<int(n,0));

    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){

            cin>>arr[i][j];
        }
    }

    diagTraversal(arr);


    return 0;
}