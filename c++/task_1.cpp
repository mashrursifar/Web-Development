#include<iostream>
using namespace std;

int main()
{
    double sales = 95000;
    double sTax = .04;
    double cTax = .02;

    cout << "Sales = $" << sales <<endl
         << "State Tax = " << sales*sTax<<endl 
         << "County Tax = " << cTax*sales<<endl;





    return 0;
}