#include <stdio.h>
#include <stdlib.h>
#include <limits.h>


void ranges() {
// implement this function
  printf("signed char\n");
  printf("minimum value: %d\n",SCHAR_MIN);
  printf("maximum value: %d\n\n",SCHAR_MAX);

  printf("unsigned char\n");
  printf("minimum value: %d\n",0);
  printf("maximum value: %d\n\n",UCHAR_MAX);

  printf("signed short\n");
  printf("minimum value: %hi\n",SHRT_MIN);
  printf("maximum value: %hi\n\n",SHRT_MAX);

  printf("unsigned short\n");
  printf("minimum value: %d\n",0);
  printf("maximum value: %hu\n\n",USHRT_MAX);
  
  printf("signed integer\n");
  printf("minimum value: %d\n",INT_MIN);
  printf("maximum value: %d\n\n",INT_MAX);

  printf("unsigned integer\n");
  printf("minimum value: %d\n",0);
  printf("maximum value: %u\n\n",UINT_MAX);

  printf("signed long\n");
  printf("minimum value: %li\n",LONG_MIN);
  printf("maximum value: %li\n\n",LONG_MAX);

  printf("unsigned long\n");
  printf("minimum value: %d\n",0);
  printf("maximum value: %lu\n\n",ULONG_MAX);

  printf("signed long long\n");
  printf("minimum value: %lli\n",LLONG_MIN);
  printf("maximum value: %lli\n\n",LLONG_MAX);

  printf("unsigned long long\n");
  printf("minimum value: %d\n",0);
  printf("maximum value: %llu\n\n",ULLONG_MAX);

}

void product() {
// implement this function
  char number1[10], number2[10];
  int num1, num2, product;

  printf("Enter the first number: ");
  fgets(number1,sizeof(number1),stdin);
  num1 = atoi(number1);

  printf("Enter the second number: ");
  fgets(number2,sizeof(number2),stdin);
  num2 = atoi(number2);

  product = (num1 * num2);

  printf("The product the two numbers is %d.\n\n",product);

}

float getNumber(const char *prompt) {
// implement this function

  float value;
  char number[20];

  printf("%s",prompt);
  fgets(number,sizeof(number),stdin);
  value = atof(number);

  return value;
}

void computeFinalGrade() {
// implement this function

  double HWgrade, midExam, finalExam, final;
  
  HWgrade = getNumber("What is the average grade of homework assignments? ");
  midExam = getNumber("What is the grade of midterm exam? ");
  finalExam = getNumber("What is the grade of final exam? ");
  
  final = (0.3*HWgrade) + (0.35*midExam) + (0.35*finalExam);
  
  printf("The final grade is %.1f.\n",final);

}

int main(int argc, char *argv[]) {
   ranges();
   product();
   computeFinalGrade();
   return 0;
}
