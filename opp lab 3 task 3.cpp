#include<iostream>
#include<string.h>
using namespace std;
struct Employee{
	string name;
	int id;
	float salary;
};
void InputEmployeeData(Employee employees[],int count)
{
for (int i = 0; i < count; i++)
 {
 cout << "\nEnter details for Employee " << i + 1 << ":\n";
 cout << "Name: ";
 cin >> employees[i].name;
 cout << "Id: ";
 cin >> employees[i].id;
 cout << "Salary ";
 cin >> employees[i].salary;
}
}
void DisplayEmployeeData(Employee employees[],int count)
{
	cout<<"Employee Records"<<endl;
	for(int i=0;i<count;i++)
	{
		cout << "Name :" << employees[i].name <<endl;
 cout << "Id :" << employees[i].id <<endl;;
 cout << "Salary: " << employees[i].salary <<endl;
	}
}
	void Findhighestsalary(Employee employees[], int count)
	 {
 int highestindex = 0;
 for (int i = 1; i < count; i++)
  {
 if (employees[i].salary > employees[highestindex].salary) 
 {
 highestindex = i;
 }
 }
 cout << "Higest Salary"<<endl;
 cout << "Name: " << employees[highestindex].name << "\n";
 cout << "Id: " <<employees[highestindex] .id << "\n";
 cout << "Salary: " <<employees[highestindex] .salary << "\n";
}
int main() 
{
 int numEmployees;
 cout << "Enter the number of employees: ";
 cin >> numEmployees;
 Employee employees[numEmployees]; 
 InputEmployeeData(employees, numEmployees);
 DisplayEmployeeData(employees, numEmployees);
 Findhighestsalary(employees, numEmployees);
return 0;
}