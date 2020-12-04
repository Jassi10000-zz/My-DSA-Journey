#include<iostream>
#include<math.h>
using namespace std;

      
int countOfDigits(int num) {

        int count = 0;
        while(num != 0){
            num  = num/10;
            count++;
        }
        return count;
    }

void digitsOfANo_(int no) {

        int nod = countOfDigits(no);

        int div = pow(10 , nod-1);

        while(div != 0 ){
            int quot = no / div;
            cout<<quot<<endl;
            no %= div;
            div /= 10;
        }

    }
     int main() {

        int n;
        cin>>n;

        int no = n;

        digitsOfANo_(no);

        return 0;
    }