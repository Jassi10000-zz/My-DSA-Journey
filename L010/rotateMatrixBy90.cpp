#include<iostream>
#include<vector>
using namespace std;

void rotate(vector<vector<int>>&arr){

   for(int i=0;i<arr.size();i++){
       for(int j=i;j<arr[0].size();j++){
           int temp = arr[i][j];
           arr[i][j] =  arr[j][i];
           arr[j][i] = temp;
        }
   }

   for(int i=0;i<arr.size();i++){
        int li = 0;
        int ri = arr[i].size() -1;

        while(li < ri){

            int temp = arr[i][li];
            arr[i][li] = arr[i][ri];
            arr[i][ri] = temp;

            li++;
            ri--;

        }
    }

    for(int i=0;i<arr.size();i++){
        for(int j=0;j<arr[0].size();j++){
            cout<<arr[i][j]<<" ";
        }
        cout<<endl;
    }

}



int main(){

    int n;
    cin>>n;

    vector<vector<int>>arr(n,vector<int>(n,0));
    for(int i=0;i<arr.size();i++){
        for(int j=0;j<arr[0].size();j++){
            cin>>arr[i][j];
        }
    }

    rotate(arr);
    return 0;
}
