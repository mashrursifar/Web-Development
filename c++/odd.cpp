#include<iostream>

using namespace std;

int main()
{
    int i = 10;
    cout <<"Enter a number: ";
    cin >>i;

    cout <<"Odd numbers: ";
    for(int x=0;x<i;x++)
    {
        
        if(x%2==1){
            cout <<x<< "\t";
        }
    }
    return 0;
}