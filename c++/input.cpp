#include<iostream>
using namespace std;

int main()
{
    int value;

    cout << "Enter a values for x and y: ";

    cin >> value;
    int x = value;
    cin >> value;
    int y = value;

    cout << "X and Y are: "<< x<<", "<<y <<endl;
    return 0;
}