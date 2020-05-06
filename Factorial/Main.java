#include <iostream>
int factorial(int);
int main ()
{
  int number;
  std::cin>>number;
  std::cout<<"The factorial of "<<number<<" is "<<factorial(number);
  return 0;
}
int factorial (int a)
{
  int fact=1;
  for(int i=1;i<=a;i++)
        fact=fact*i;
  return fact;
}