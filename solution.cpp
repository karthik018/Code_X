#include<iostream>  /* including required header files */
using namespace std;
int main(){             /*defining main method*/
  int choice = 0, radius = 0, length = 0, width = 0, base = 0, height = 0; /*declaring required variable*/
  do {                /*do-while loop to get choices*/
    cout << "Geometry Calculator" << endl << endl;
    cout << "1. Calculate the area of a Circle" << endl;
    cout << "2. Calculate the area of a Rectangle" << endl;
    cout << "3. Calculate the area of a Triangle" << endl;
    cout << "4. Quit" << endl << endl;
    cout << "Enter your Choice (1 - 4): ";
    cin >> choice;
    cout << endl;
    if(choice < 1 || choice > 4){    /*checking whether the entered choice is between the range 1 to 4*/
      cout << "Error: Choice should be in the range 1 through 4 only!" << endl << endl; /*if choice is invalid show the error message*/
      continue;                      /*If the choice is invalid continue to next Iteration*/
    }
    switch(choice) {
      case 1: cout << "Enter radius of Circle: " << endl;
              cin >> radius;
              if(radius < 0){ /*condition to check whether the radius is negative or not*/
                cout << "Error: Radius should be greater than zero" << endl << endl; /*If radius is negative show the Error message and break switch continue to next iteration*/
                break;
              }
              cout << "Area of Circle: " << 3.14159 * radius * radius << endl << endl; /*radius of circle*/
              break;
      case 2: cout << "Enter Length and Width of Rectangle: " << endl;
              cin >> length;
              cin >> width;
              if(length < 0 || width < 0){ /*condition for negativity of length and width*/
                cout << "Error: Length or Width should be greater than zero" << endl << endl; /*error message if the length and width are negative*/
                break;
              }
              cout << "Area of Rectangle: " << length * width << endl << endl; /*area of Rectangle*/
              break;
      case 3: cout << "Enter the base and Height of the Triangle: " << endl;
              cin >> base;
              cin >> height;
              if(base < 0 || height < 0){ /*condition for negativity of base and height*/
                cout << "Error: Base or height should be greater than zero" << endl << endl; /*error message if base and height are negative*/
                break;
              }
              cout << "Area of Triangle: " << 0.5 * base * height << endl << endl; /*area of Triangle*/
              break;
      default: cout << "Exiting..." << endl;
               exit(0); /*if the choice is 4 exiting and terminating the execution of program*/
               break;
    }
  }while(1);
  return 0;
}
