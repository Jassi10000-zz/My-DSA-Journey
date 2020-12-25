#include<iostream>
using namespace std;

    string strCompress2_(string str) {

            if (str.length() <= 1) {
                return str;
            }

        string sb = "";
        sb+=str[0];

        int i = 1;
        while (i <= str.length()) {

            int count = 1;

            while (i < str.length() && str[i] == str[i-1]) {

                count++;
                i++;

            }
            if (count != 1) {
                sb+=to_string(count);
            }
            if (i < str.length())
                sb+=str[i];
            i++;
        }

        return sb;
    }

    string strCompress1_(string str) {

            if (str.length() <= 1) {
                return str;
            }

        string sb = "";
        sb+=str[0];

        int i = 1;
        while (i <= str.length()) {
            while (i < str.length() && str[i] == str[i-1]) {
                i++;

            }
            
            if (i < str.length())
                sb+=str[i];
            i++;
        }

        return sb;
    }

    

    int main() {

        string str;
        cin>>str;

        
        cout<<strCompress1_(str)<<endl;
        cout<<strCompress2_(str)<<endl;


        return 0;
    }
