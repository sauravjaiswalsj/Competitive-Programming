/*
 * 2 exams w=50%
 * 1 sports w=20%
 * 3 activites w= 30%
 */
#include<iostream>
#include<iomanip>
#define ACTIVITES 30
#define SPORTS 20
#define EXAMS 50
#define EXAM_TOTAL 200
#define SPORTS_TOTAL 40
#define ACTIVITY_TOTAL 60
int main(){
	int exam_1, exam_2, sports_1,acti_1, acti_2, acti_3, total_exam,total_acti;
	std::cout<<"Enter the marks for two exams out of \"100\""<<std::endl;
	std::cin>>exam_1>>exam_2;
	std::cout<<"Enter the Marks for Sports out of 40\n";
	std::cin>>sports_1;
	// activites takes input
	std::cout<<"Enter the marks for three sports Activity out of 60"<<std::endl;
	std::cin>>acti_1>>acti_2>>acti_3;
	total_exam=exam_1+exam_2;
	total_acti=acti_1+acti_2+acti_3;
	int sports_total=sports_1;
	int total_Marks=total_exam+total_acti+sports_total;
	float percent_exam=((total_exam*EXAMS)/EXAM_TOTAL);
	float percent_sport=((sports_total*SPORTS) / SPORTS_TOTAL);
	float percent_activity=((total_acti*ACTIVITES)/ACTIVITY_TOTAL);
	std::cout<<"*****************RESULT******************"<<std::endl;
	std::cout<<"Exam % :"<<std::setprecision(3)<<percent_exam<<std::endl;
	std::cout<<"Sports %: "<<std::setprecision(3)<<percent_sport<<std::endl;
	std::cout<<"Activity %: "<<std::setprecision(3)<<percent_activity<<std::endl;
	std::cout<<"***********************************************"<<std::endl;
	std::cout<<"Total Percent :"<<std::setprecision(3) << percent_exam+percent_sport+percent_activity<<std::endl;
	return 0;
}
