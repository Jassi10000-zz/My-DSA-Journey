#include<iostream>
using namespace std;


string withoutX2_(string str){

        string st;

        int i = 0;
        while (i < str.length()) {

            if (str[i] != 'x') {
                st.push_back(str[i]);

            }
            i++;
        }

        return st;
    }

    int main(){

        string str;
        cin>>str;

        cout<<withoutX2_(str)<<endl;
        
    }