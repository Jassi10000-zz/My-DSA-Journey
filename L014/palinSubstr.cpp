#include<iostream>
using namespace std;

bool isPalindrome(string str){

    int i=0;
    int j=str.length()-1;

    while(i<j){

        if(str[i++] != str[j--]) return false;

    }
    return true;
}
void palinSubstr(string str){

    for(int i=0;i<str.length();i++){
            for(int len=1;i+len<=str.length();len++){
                
                string s = str.substr(i,len);
                if(isPalindrome(s)){
                    cout<<s<<endl;
                }
            }
        }
}



int main(){

    string str;
    cin>>str;

    palinSubstr(str);
    return 0;
}
