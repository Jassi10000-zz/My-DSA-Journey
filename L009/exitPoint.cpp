#include<iostream>
#include<vector>
using namespace std;

void exitPoint(vector<vector<int>>&arr){

        int d = 0;
        int i=0,j=0;

        while(true){
            d = (d + arr[i][j]) % 4;
            if(d == 0){
                j++;
            }else if(d == 1){
                i++;
            }else if(d == 2){
                j--;
            }else if(d == 3){
                i--;
            }
            
            
            
            if(i < 0){
                i++;
                break;
            }else if(j < 0){
                j++;
                break;
            }else if(i == arr.size()){
                i--;
                break;
            }else if(j == arr[0].size()){
                j--;
                break;
            }
        }


       cout<<i<<endl;
       cout<<j<<endl;

    }

int main(){

    int n,m;
    cin>>n>>m;

    vector<vector<int>> arr(n,vector<int>(m,0));
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            cin>>arr[i][j];
        }
    }

    exitPoint(arr);

    return 0;
}