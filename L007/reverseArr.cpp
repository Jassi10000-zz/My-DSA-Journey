#include<iostream>
#include<vector>
using namespace std;

void reverseArr(vector<int>&arr){

     int i=0;
        int j=arr.size() - 1;

        while(i < j){

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        for(int ele:arr){
            cout<<ele;
        }

}

int main(){
    int n;
    cin>>n;

    vector<int>arr(n,0);
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }

    reverseArr(arr);
    return 0;
}