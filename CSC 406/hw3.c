#include <stdio.h>
#include <limits.h>

int set_bits(int value, int pos, int n, int b) {
  // implement this
  int i;
  for (i = pos; i <= pos+n-1; i++) {
    if (b == 0) { // sets bits to 0
      int mask = 1 << i;
      mask = ~mask;
      value = value & mask;
    }else if (b == 1) { // set bits to 1
      int mask = 1 << i;
      value = value | 1 << i;
    } 
  }
  return value;
}

int set_bits_val(int value, int pos, int n, int v) {
  // implement this
  int i;
  int curr = 0;

  for(i = 0; i <= n-1; i++){
    int mask = 1 << i;
    curr = v & mask;
    if (curr > 0) {
      value = set_bits(value,pos,1,1);
      pos++;
    }
    else {
      value = set_bits(value,pos,1,0);
      pos++;
    }
  }
  return value;
}

int extract_bits(int value, int pos, int n) {
  // implement this
  int p = 0;
  int num = 0;
  int pow = 1;
  int mod;

  while (p != pos) {
    value = value >> 1;
    p++;
  }
  while (n!=0) {
    mod = value % 2;
    num += mod*pow;
    n--;
    pow *= 2;
    value = value >> 1;
  }
  return num;
}

int swap_bits(int value) {
  // implement this
  int div = (16*16*16*16);

  int bit1 = value/div;
  int bit2 = value%div;
 
  int res = bit2*div + bit1;

  return res;
}

/* test code; do not modify */
int main() {
  int i;
  int values[] = {0x12AB34CD, 0xBEEF, 0xFEEDDEED};

  for (i = 0; i < sizeof(values)/sizeof(values[0]); i++) {
	printf("set_bits %x %d %d 0 = %x\n", values[i], i * 4, 4, set_bits(values[i], i * 4, 4, 0));
	printf("set_bits %x %d %d 1 = %x\n", values[i], i * 4, 4, set_bits(values[i], i * 4, 4, 1));
  }
  for (i = 1; i < sizeof(values)/sizeof(values[0]); i++) {
	printf("set_bits_val %x %d %d %x = %x\n", values[0], i * 4, 4, values[i], set_bits_val(values[0], i * 4, 4, values[i]));
  }
  for (i = 0; i < 8; i++) {
	printf("extract_bits %x %d %d = %x\n", values[0], i * 4, 4, extract_bits(values[0], i * 4, 4));
  }
  for (i = 0; i < sizeof(values)/sizeof(values[0]); i++) {
	printf("swap_bits %x = %x\n", values[i], swap_bits(values[i]));
  }
  return 0;
}
