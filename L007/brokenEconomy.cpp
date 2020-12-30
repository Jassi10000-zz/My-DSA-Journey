#include<iostream>
#include<vector>

using namespace std;

void money(vector<int>& arr,int d){
        
        int li = 0;
        
        int ri = arr.size()-1;
        
        int ceil = 0 ;
        int floor = 0;
        while(li <= ri){
            
            int mid = (li + ri)/2;
            
            if( d < arr[mid]){ ri = mid - 1; ceil = arr[mid]; }
            else if( d > arr[mid]){ li = mid + 1; floor = arr[mid];}
            else{ ceil = arr[mid]; floor = arr[mid];}
            
        }
        cout<<ceil<<endl;
        cout<<floor<<endl;
    }
    int main(){
        // write your code here
        int n;
        cin>>n;
        
        vector<int>arr(n,0);
        for(int i=0;i<arr.size();i++){
            cin>>arr[i];
        }
        int d;
        cin>>d;
        
        money(arr,d);

        return 0;
    }
