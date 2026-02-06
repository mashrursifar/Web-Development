#include<iostream>
#include<cstdlib>
#include<ctime>

using namespace std;

int main()
{
    const short minValue = 1;
    const short maxValue = 6;

    long elapsedSexonds = time(nullptr);
    
    srand(elapsedSexonds);
    
    short dice1 = (rand()%(maxValue-minValue+1))+minValue;
    short dice2 = (rand()%(maxValue-minValue+1))+minValue;

    cout << "Dice 1: "<< dice1<<endl<<"Dice 2: "<<dice2<<endl;

    return 0;
}