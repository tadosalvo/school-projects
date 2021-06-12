#include <stdio.h>
#include <stdlib.h>

// Problem 1
long decode (long x, long y, long z) {
  long t = x;
  t = t * y;
  y = y + z;
  t = t - y;
  t = t >> 3;
   return t;
}

// Problem 2
int loop(long x, int n) {  
  long z = 0;
  int y;

  for(y = 0; y < n; y = y + 1) {
    z = x|z;
    x = x + x;
    
  }
 
  return z;

  

}
