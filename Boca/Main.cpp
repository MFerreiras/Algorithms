#include <iostream>
using namespace std;

int main() {
   
   int a = 0, b = 0, c = 0;  
   cin >> a;
   cin >> b;
   cin >> c;

   if(a == b || a == c || b == c || a+b == c || a+c == b || b+c == a){
		cout << "S" << endl;
   }
   else{
		cout << "N" << endl;
   }

   return 0;
}