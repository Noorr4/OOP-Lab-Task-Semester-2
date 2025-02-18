#include <iostream>
using namespace std;
float gross;
void grosssalary(float sal ,float allow)
{
	gross=sal+allow;
	cout<<"\nthe gross salary is"<<gross;
}
void netsalary(float sal1,float deduc)
{
	float net;
	net=gross-deduc;
	cout<<"\nthe net salary is :"<<net;
}
int main()
{
	float salary;
	cout<<"enter the salary:";
	cin>>salary;
	float allowance;
	allowance=salary*20/100;
	float deduction;
	deduction=salary*10/100;
	grosssalary(salary,allowance);
	netsalary(salary,deduction);
	
}