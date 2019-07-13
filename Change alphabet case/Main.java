#include <stdio.h>
int main() {
	char letter;
  scanf("%c",&letter);
  if(letter>=97)
    printf("%c",letter-32);
  else
    printf("%c",letter+32);
  
	return 0;
}