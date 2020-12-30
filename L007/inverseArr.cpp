#include<iostream>
#include<vector>
using namespace std;

void inverse(vector<int>& a){

        vector<int>inv(a.size(),0);
        for(int i=0;i<a.size();i++){
            int val = a[i];
            inv[val] = i;
        }


        for(int ele:inv) cout<<ele<<endl;
    }
    int main(){

        int n;
        cin>>n;

        vector<int>a(n,0);
        for(int i=0;i<a.size();i++){
            cin>>a[i];
        }

        inverse(a);
        
        return 0;
    }