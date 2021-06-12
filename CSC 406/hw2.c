#include <stdio.h>
#include <limits.h>

int innerProduct(int x[], int y[], int n) {
  int total;
  int i;

  for (i = 0;i < n;i++){
    total += x[i] * y[i];
  }
    
  return total;
}

void bin2dec(const char *bin_num) {
  int pwr = 0;
  int temppwr = pwr;
  int pwrTotal = 0;
  int base = 2;
  int total = 0;
  int num = 0;
  int i = 0;
  int j;
  int length = 0;
  
  
  // Determines length of binary string
  while(i < 32) {
    if (bin_num[i] - '0' == 1 || bin_num[i] - '0' == 0) {
      length++;
      i++;
    }
    else {
      break;
    }
  }
  // Loops through right to left and adds powered total
  for (j = length - 1; j >= 0; j--) {
    pwr = temppwr;
    if (bin_num[j] - '0' ==1) {
      pwrTotal = 1;
      while (pwr > 0) {
	pwrTotal = pwrTotal*base;
	pwr--;
      }
      total += pwrTotal;
    }
  temppwr++;
  }
  printf("%d\n", total);
}

void dec2bin(int num) {
  int bin[32];
  int i = 0;
  int placement = 0;
  // Loops through num finding  mod 2 per iteration
  while (num >= 0) {
    bin[placement] = num % 2;
    placement++;
    num /=2;
    if (num == 0) break;
  }
  // Loops from right to left and prints correct int order
  for(i = placement - 1; i >= 0; i--) {
    printf("%d",bin[i]);
  }
  printf("\n");
}

void hex2dec(const char *hex_num) {

  int i = 0;
  int length = 0;
  int ans = 0;
  int j;
  int pwr = 0;
  int temppwr = 0;
  int pwrTotal = 0;
  
  // Determines length of hex string
  while(hex_num[i] > 0) {
    length++;
    i++;
  }

  // Loops through from right to left and checks each digit
  for (j = length - 1; j >= 0; j--) {
    pwr = temppwr;
    if (hex_num[j] == 'A') {
      pwrTotal = 1;
      while(pwr > 0) {
	pwrTotal = pwrTotal * 16;
	pwr--;
      }
      ans += 10 * pwrTotal;
    }
    else if (hex_num[j] == 'B') {
      pwrTotal = 1;
      while (pwr > 0) {
	pwrTotal = pwrTotal * 16;
	pwr--;
      }
      ans += 11 * pwrTotal;
    }
    else if (hex_num[j] == 'C') {
      pwrTotal = 1;
      while(pwr > 0) {
	pwrTotal = pwrTotal * 16;
	pwr--;
      }
      ans += 12 * pwrTotal;
    }
    else if (hex_num[j] == 'D') {
      pwrTotal = 1;
      while(pwr > 0) {
	pwrTotal = pwrTotal * 16;
	pwr--;
      }
      ans += 13 * pwrTotal;
    }
    else if (hex_num[j] == 'E') {
      pwrTotal = 1;
      while(pwr > 0) {
	pwrTotal = pwrTotal * 16;
	pwr--;
      }
      ans += 14 * pwrTotal;
    }
    else if (hex_num[j] == 'F') {
      pwrTotal = 1;
      while(pwr > 0) {
	pwrTotal = pwrTotal * 16;
	pwr--;
      }
      ans += 15 * pwrTotal;
    }
    else if (hex_num[j] == '0') {
      pwrTotal = 1;
      while(pwr > 0) {
	pwrTotal = pwrTotal * 16;
	pwr--;
      }
      ans += 0 * pwrTotal;
    }
    else if (hex_num[j] == '1') {
      pwrTotal = 1;
      while (pwr > 0) {
	pwrTotal = pwrTotal * 16;
	pwr--;
      }
      ans += 1 * pwrTotal;
    }
    else if (hex_num[j] == '2') {
      pwrTotal = 1;
      while (pwr > 0) {
	pwrTotal = pwrTotal * 16;
	pwr--;
      }
      ans += 2 * pwrTotal;
    }
    else if (hex_num[j] == '3') {
      pwrTotal = 1;
      while (pwr > 0) {
	pwrTotal = pwrTotal * 16;
	pwr--;
      }
      ans += 3 * pwrTotal;
    }
    else if (hex_num[j] == '4') {
      pwrTotal = 1;
      while (pwr > 0) {
	pwrTotal = pwrTotal * 16;
	pwr--;
      }
      ans += 4 * pwrTotal;
    }
    else if (hex_num[j] == '5') {
      pwrTotal = 1;
      while (pwr > 0) {
	pwrTotal = pwrTotal * 16;
	pwr--;
      }
      ans += 5 * pwrTotal;
    }
    else if (hex_num[j] == '6') {
      pwrTotal = 1;
      while (pwr > 0) {
	pwrTotal = pwrTotal * 16;
	pwr--;
      }
      ans += 6 * pwrTotal;
    }
    else if (hex_num[j] == '7') {
      pwrTotal = 1;
      while (pwr > 0) {
	pwrTotal = pwrTotal * 16;
	pwr--;
      }
      ans += 7 * pwrTotal;
    }
    else if (hex_num[j] == '8') {
      pwrTotal = 1;
      while (pwr > 0) {
	pwrTotal = pwrTotal * 16;
	pwr--;
      }
      ans += 8 * pwrTotal;
    }
    else if (hex_num[j] == '9') {
      pwrTotal = 1;
      while (pwr > 0) {
	pwrTotal = pwrTotal * 16;
	pwr--;
      }
      ans += 9 * pwrTotal;
    }
    temppwr++;
  }
  printf("%d\n", ans);
}

void dec2hex(int num) {
  char hex[32];
  int placement = 0;
  int i;
  char tempDigit;

  // Loops through given number and gets the mod of 16 to determine digit
  while (num >= 0) {
    if (num % 16 == 10) {
      hex[placement] = 'A';
    }
    else if (num % 16 == 11) {
      hex[placement] = 'B';
    }
    else if (num % 16 == 12) {
      hex[placement] = 'C';
    }
    else if (num % 16 == 13) {
      hex[placement] = 'D';
    }
    else if (num % 16 == 14) {
      hex[placement] = 'E';
    }
    else if (num % 16 == 15) {
      hex[placement] = 'F';
    }
    else if (num % 16 == 0) {
      hex[placement] = '0';
    }
    else if (num % 16 == 1) {
      hex[placement] = '1';
    }
    else if (num % 16 == 2) {
      hex[placement] = '2';
    }
    else if (num % 16 == 3) {
      hex[placement] = '3';
    }
    else if (num % 16 == 4) {
      hex[placement] = '4';
    }
    else if (num % 16 == 5) {
      hex[placement] = '5';
    }
    else if (num % 16 == 6) {
      hex[placement] = '6';
    }
    else if (num % 16 == 7) {
      hex[placement] = '7';
    }
    else if (num % 16 == 8) {
      hex[placement] = '8';
    }
    else if (num % 16 == 9) {
      hex[placement] = '9';
    }

    placement++;
    num /= 16;
    if (num == 0) break;
  }
  
  // prints correct char order by looping from right to left
  for (i = placement - 1; i >= 0; i--) {
    printf("%c",hex[i]);
  }

  printf("\n");
}


// test code; do not modify
int main() {
  char *bin_nums[] = {"0", "10010110", "10111011001001"};
  char *hex_nums[] = {"F", "9AC", "F35E8"};
  int dec_nums[] = {0, 1, 77, 159, 65530, 987654321};
  int i;
  int x[] = {-9, -8, -7, -6};
  int y[] = {-1, -3, -5, -7};
  int product;

  product = innerProduct(x, y, 4);
  printf("The inner product is %d\n", product);

  for (i = 0; i < sizeof(bin_nums)/sizeof(char *); i++) {
	printf("bin2dec %s\n", bin_nums[i]);
  	bin2dec(bin_nums[i]);
  }

  for (i = 0; i < sizeof(dec_nums)/sizeof(int); i++) {
	printf("dec2bin %d\n", dec_nums[i]);
  	dec2bin(dec_nums[i]);
  }

  for (i = 0; i < sizeof(hex_nums)/sizeof(char *); i++) {
	printf("bin2dec %s\n", hex_nums[i]);
  	hex2dec(hex_nums[i]);
  }

  for (i = 0; i < sizeof(dec_nums)/sizeof(int); i++) {
	printf("dec2hex %d\n", dec_nums[i]);
  	dec2hex(dec_nums[i]);
  }

  return 0;
}
