// wakanda-1 official

#include<iostream>
#include<vector>
using namespace std;

void waveTrav2_(vector<vector<int>>arr) {

        for (int j = 0; j < arr[0].size(); j++) {

            if (i % 2 == 0) {

                for (int i = 0; i < arr.size(); i++) {
                    cout<<arr[i][j]<<endl;
                }
            } else {

                for (int i = arr.size() - 1; i >= 0; i--) {
                    cout<<arr[i][j]<<endl;
                }

            }
        }
    }

int main(){

    int n,m;
    cin>>n>>m;

    vector<vector<int>>arr(n,vector<int>(m,0));
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            cin>>arr[i][j];
        }
    }

    waveTrav2_(arr);
    return 0;
}