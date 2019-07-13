#include<stdio.h>
int main()
{
  char l;
  scanf("%c",&l);
  if(l=='a'|l=='e'|l=='o'|l=='i'|l=='u'|l=='A'|l=='E'|l=='O'|l=='I'|l=='U')
    printf("Vowel");
  else
    printf("Consonant");
  return 0;
}