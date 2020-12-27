#include<iostream>
#include<vector>
using namespace std;

void sumOfTwoArr(vector<int>& arr1 , vector<int>& arr2){

    int a = arr1.size();
    int b = arr2.size();

    int c = max(a,b) + 1;

    vector<int> ans(c,0);
    int i = a - 1 ;
    int j = b - 1;
    int r = c - 1;

int carry = 0;
    
    while( r >= 0){
        
        int sum = carry;

        if(i >= 0) sum += arr1[i--];
        if(j >= 0) sum += arr2[j--];

        ans[r--] += sum%10;
        carry = sum/10;
    }

    for(int l=0;l<ans.size();l++){

        if( l==0 && ans[l]== 0) continue;
        cout<<ans[l]<<endl; 
    }

}


int main(){

    int n;
    cin>>n;
    vector<int> arr1(n,0);
    for(int i=0;i<n;i++){
        cin>>arr1[i];
    }

    int m;
    cin>>m;
    vector<int> arr2(m,0);
    for(int i=0;i<m;i++){
        cin>>arr2[i];
    }


    sumOfTwoArr(arr1,arr2);

    return 0;
}