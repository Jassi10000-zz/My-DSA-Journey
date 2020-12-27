#include<iostream>
#include<vector>
using namespace std;

void diffOfTwoArr(vector<int>&arr1 , vector<int>&arr2){

    int a = arr1.size();
    int b = arr2.size();

    int c = max(a,b);

    vector<int>resarr(c,0);
    int i = a - 1;
    int j = b - 1;

    int k = c - 1;

    int carry = 0;
    while(k >= 0){

        int diff = 0;
        int a1val = i>=0? arr1[i] : 0; //especially for cases like 1000 - 1

        if(arr2[j] + carry >= a1val){
            diff = arr2[j] + carry - a1val;
            carry = 0;
        }
        else{
            diff = arr2[j] + carry - a1val + 10;
            carry = -1;
        }

        resarr[k] = diff;

        i--;
        j--;
        k--;
    }

    // now is the case of printing ---> instead of printing  0999  , we have to print 999
    int index = 0;

        while(index < resarr.size()){
            if(resarr[index] == 0){
                index++;
            }else{
                break;
            }
        }

        while(index < resarr.size()){
            cout<<resarr[index];
            index++;
        }

}


int main(){

    int n;
    cin>>n;

    vector<int>arr1(n,0);
    for(int i=0;i<arr1.size();i++){
        cin>>arr1[i];
    }

    int m;
    cin>>m;
    vector<int>arr2(m,0);
    for(int i=0;i<arr2.size();i++){
        cin>>arr2[i];
    }

    diffOfTwoArr(arr1,arr2);

    return 0;

}