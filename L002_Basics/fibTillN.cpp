#include <iostream>
using namespace std;

void fibTillN(int n){
    int a = 0 , b = 1;
    if (n < 1 )
        return;
    cout<<a<<endl;
    
    for(int i=1;i<n;i++){
        cout<<b<<endl;
        int c = a+b;
        a = b;
        b = c;
    }
}

int main()
{
    int n;
    cin >> n;
    
    fibTillN(n);
    
}