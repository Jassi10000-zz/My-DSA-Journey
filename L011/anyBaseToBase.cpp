#include<iostream>
using namespace std;
  
int abtd(int n, int a) {

        int sum = 0;
        int p = 1;
        while (n != 0) {
            int r = n % 10;
            n = n / 10;

            sum += r * p;
            p *= a;
        }

        return sum;
    }
    
    
    int dtab(int n, int a) {

        int sum = 0;
        int p = 1;
        while (n != 0) {
            int r = n % a;
            n = n / a;

            sum += r * p;
            p *= 10;
        }

        return sum;
    }
  int  main() {
      
      int n;
      cin>>n;
      int sourceBase;
      cin>>sourceBase;
     int  destBase;
     cin>>destBase;
     
     int ans = abtd(n,sourceBase);
     cout<<dtab(ans,destBase);

     return 0;
     
   }   