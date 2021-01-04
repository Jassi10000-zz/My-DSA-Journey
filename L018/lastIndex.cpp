// i/p : 10
//       3
//       5 3 7 3 2 3 9 4 3 2

// o/p : 8  (i.e the last idx of 3)

#include<iostream>
#include<vector>

using namespace std;

int lastIdx_(vector<int>arr, int idx ,int data){

        if(idx < 0) return -(int)1e9;

        if(arr[idx] == data) return idx;
        else return lastIdx_(arr, idx - 1, data);

    }
int main(){

    
     int n;
     cin>>n;
        vector<int>arr(n,0);
        for(int i=0;i<arr.size();i++){
            cin>>arr[i];
        }

        int data;
        cin>>data;
        cout<<lastIdx_(arr , arr.size()-1 , data);
    return 0;
}