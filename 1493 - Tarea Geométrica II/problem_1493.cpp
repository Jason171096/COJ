#include <bits/stdc++.h>

using namespace std;


int main(){
	string s;
	double A,B,R,area=0.0;
	double PI = 3.14;
	cin>>s;
	if(s=="circle"){
		cin>>R;
		area=PI*R*R;
	}
	else{
		cin>>A>>B;
		area=(B*A)/2.0;
	}
	printf("%.2lf\n",area);
	return 0;
}
