#include <iostream>
#include<cmath>

using namespace std;

int main()
{
    double res = floor(1.2);

    cout << res<<endl;

    double radius;
    const double pi = 3.14;
    cout<<"Enter the radius: ";
    cin >> radius;
    double area = pi* pow(radius,2);
    cout << area;



    return 0;
}