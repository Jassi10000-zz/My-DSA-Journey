#include<iostream>
using namespace std;


int getSum(int b, int n1, int n2){
       // write ur code here
       int ans=0,carry=0,p=1;
       while(n1!=0||n2!=0||carry!=0){
           int r1=n1%10;
           int r2=n2%10;
           
           n1/=10;
           n2/=10;
           
           int t=r1+r2+carry;
           carry=t/b;
           t=t%b;
           
           ans=ans+t*p;
           p=p*10;
           
       }
       return ans;
   }

 int main() {
     
      int b , n1 , n2;
      cin>>b>>n1>>n2; 
  
      int d = getSum(b, n1, n2);
      cout<<d;
      return 0;
   }
  
   
