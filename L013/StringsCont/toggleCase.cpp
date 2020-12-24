#include<iostream>
using namespace std;


	String toggleCase(String str){
		//write your code here
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<str.length();i++){
		    char ch = str.charAt(i);
		    
		    if(ch >= 'a' && ch <= 'z')
		        sb.append((char)(ch - 'a' + 'A'));
		    else
		        sb.append((char)(ch + 'a' - 'A'));
		}

		return sb.toString();
	}

int main(){

    String str;
    cin>>str;


    return 0;
}