#include<iostream>
#include<vector>
using namespace std;


 void displayArr(vector<int>& arr, int idx) {
        
        if(idx == arr.size()){
            return;
        }
        
        cout<<arr[idx]<<endl;
        
        displayArr(arr,idx+1);

    }
int main() {
        // write your code here
        
        int n;
        cin>>n;
        
        vector<int>arr(n,0);
        for(int i=0;i<arr.size();i++){
            cin>>arr[i];
        }
        
        displayArr(arr,0);

        return 0;
        
    }

   