#include<iostream>
#include<algorithm>
using namespace std;
int *initialRandomArray(int size, int *array){
  array = new int[size];
  cout << "Your new array is {";
  for (int i = 0; i < size; i++) {
    array[i] = (rand() % 100) + 1;
    cout << array[i] << " ";
  }
  cout << "}" << endl;
  return array;
}
//removing copies of elements in the generated array to get true kth largest term
//As initialRandomArray may produce a random elements of array with repeated elements.
int removeCopiesofElements(int array[], int size){
  if(size == 0 || size == 1)
    return size;
  //to store index of next unique element in the array.
  int j = 0;
  for(int i = 0; i < size - 1; i++){
    if(array[i] != array[i + 1])
      array[j++] = array[i];
  }
  array[j++] = array[size - 1];
  //returning the modified size after removing copies from original array.
  return j;
}

int select(int num, int *array, int n){
  //sorting the array in descending order.
  //the parameter in the size method is used to specify the order in which elements to be sorted.
  //greater<int>() function is used to order elements in descending order.
  sort(array, array + n, greater<int>());
  for(int i = 0; i < n; i++)
    cout << array[i] << " ";
  cout << endl;
  n = removeCopiesofElements(array, n);
  cout << n << endl;
  for(int i = 0; i < n; i++)
    cout << array[i] << " ";
  cout << endl;
  //returning the (num-1)th largest element because arrays are 0-based indexed.
  return array[num - 1];
}

int main(){
  int size, num;
  cout << "How big do you want the array?" << endl;
  cin >> size;
  int *array = initialRandomArray(size, array);
  cout << "Pickup a positive number less than or equal to " << size <<": " << endl;
  cin >> num;

  cout << "The No." << num << " largest number in the array is: ";
  //modifying the select function to add parameter size.
  cout << select(num, array, size) << "!" << endl;

  return 0;
}
