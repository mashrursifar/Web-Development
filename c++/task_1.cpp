#include<iostream>
using namespace std;

int main()
{
    double sales = 95000;
    const double sTax = .04;
    const double cTax = .02;

    cout << "Sales = $" << sales <<endl
         << "State Tax = " << sales*sTax<<endl 
         << "County Tax = " << cTax*sales<<endl;

    double totalTax = sTax + cTax;

    cout << "Total Tax ="<<totalTax*100<<"%";




    return 0;
}