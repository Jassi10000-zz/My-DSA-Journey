#include<iostream>
using namespace std;


int getDiff(int b, int n1, int n2){
       // write ur code here
       int res=0,borrow=0,p=1;
       while(n1!=0||n2!=0){
           int r1=n1%10;
           int r2=n2%10;
           
           n1/=10;
           n2/=10;
           
           int ans = r2-r1 + borrow;
           if(ans < 0){
               ans += b;
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
     
      int b , n1 , n2;
      cin>>b>>n1>>n2; 
  
      int d = getDiff(b, n1, n2);
      cout<<d;
      return 0;
   }
  
   