#include<iostream>
using namespace std;


int binSub(int n1, int n2){
       // write ur code here
       int res=0,borrow=0,p=1;
       while(n1!=0||n2!=0){
           int r1=n1%10;
           int r2=n2%10;
           
           n1/=10;
           n2/=10;
           
           int ans = r2-r1 + borrow;
           if(ans < 0){
               ans += 2;
               borrow = -1;
           }
           else{
               borrow = 0;
           }
           
           res += ans*p;
           p*=10;
           
       }
       return res;
   }

 int main() {
     
      int n1 , n2;
      cin>>n1>>n2; 
  
      int d = binSub(n1, n2);
      cout<<d;
      return 0;
   }
  
   