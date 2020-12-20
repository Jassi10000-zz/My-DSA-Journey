#include<iostream>
#include<vector>
using namespace std;


void waveTrav2_(vector<vector<int>>arr) {

        for (int i = 0; i < arr.size(); i++) {

            if (i % 2 == 0) {

                for (int j = 0; j < arr[0].size(); j++) {
                    cout<<arr[i][j]<<endl;
                }
            } else {

                for (int j = arr.size() - 1; j >= 0; j--) {
                    cout<<arr[i][j]<<endl;
                }

            }
        }

    }

int main(){
    
        int n,m;
        cin>>n>>m;

        vector<vector<int>>arr(n,vector<int>(m,0));

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr[0].size(); j++) {
                cin>>arr[i][j];
            }
        }

        waveTrav2_(arr);

    return 0;
}