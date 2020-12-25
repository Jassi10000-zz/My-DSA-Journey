#include<iostream>
using namespace std;


string withoutX2_(string str){

        string st;

        for(int i=0;i<str.length();i++){
            if(i<2 && str[i] != 'x') st.push_back(str[i]);
            if(i>=2) st.push_back(str[i]);
        }

        return st;
    }

    int main(){

        string str;
        cin>>str;

        cout<<withoutX2_(str)<<endl;
        
    }
