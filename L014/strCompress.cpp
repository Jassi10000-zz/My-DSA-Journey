#include<iostream>
using namespace std;

void compression1(string str) {
	int i;
	for(i=0; i<str.length()-1; i++) {
		if(str[i] != str[i+1])
		cout<<str[i];
	}
	cout<<str[str.length()-1];
}
void compression2(string str) {
	int i, count = 1;
	for(i=0; i<str.length()-1; i++) {
		if(str[i] == str[i+1])
		count++;
		else if(count>1) {
			cout<<str[i]<<count;
			count = 1;
		} 
		else 
		cout<<str[i];
	}
	cout<<str[str.length()-1];
	if(count > 1)
	cout<<count;
}
int main() {
	string str;
	cin>>str;
	compression1(str);
	cout<<"\n";
	compression2(str);
	return 0;
}
