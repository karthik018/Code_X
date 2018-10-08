#include<iostream>  //including required header files.
using namespace std;
//main method
int main(){
  //declaring required variables for choice, Resistance R1, R2 and R3
  int choice = 0;
  float R1 = 0, R2 = 0, R3 = 0;
  //do-while loop for asking the choice of the user
  do{
    cout << "Total Resistance of: " << endl << endl;
    cout << "1. Series Circuit" << endl;
    cout << "2. Parallel Circuit" << endl;
    cout << "3. Quit" << endl << endl;
    cout << "Enter your Choice (1 - 3): ";
    cin >> choice;
    //condition to check validity of the choice and printing error message if the choice is valid and continue to next iteration.
    if(choice < 1 || choice > 3){
      cout << "error: Invalid choice re-enter your choice select valid type of circuit" << endl << endl;
      continue;
    }
    //switch statement to process the inputs and finding the total Resistance of the circuits according to the choice.
    switch(choice) {
      case 1: cout << "Enter R1, R2 and R3 for Series Circuit: " << endl;
              cin >> R1 >> R2 >> R3;
              cout << "Total Resistance for Series Circuit: ";
              //calculating total Resistance of Series Circuit.
              cout << R1 + R2 + R3 << " ohms" << endl << endl;
              break;
      case 2: cout << "Enter R1, R2 and R3 for Parallel Circuit: " << endl;
              cin >> R1 >> R2 >> R3;
              cout << "Total Resistance for Parallel Circuit: ";
              //calculating total Resistance for Parallel Circuit.
              R1 = 1/R1; R2 = 1/R2; R3 = 1/R3;
              cout << 1/(R1 + R2 + R3) << " ohms" << endl << endl;
              break;
      default: cout << "Exiting..." << endl;
               exit(0); break;
    }
  }while(1);
  return 0;
}
