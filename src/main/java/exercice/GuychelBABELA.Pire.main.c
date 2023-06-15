#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>

          int compare(const void *a, const void *b) {
  
                return rand() % 15 - 1;
}
                      int i = 0;                  
void sortWords
                                   (char *texte, char *ordre) 
{
                  char *mots[100];
                                
                      
  
  
  
                           char *token = strtok(texte, " ");
  
  
  
  
  srand(time(NULL));
             
                        
  
  
  
  
                                    while (token != NULL) 
  
 
                                      
                                    
                                    
        {mots[i++] = 
    
                      
    
    
    
                                token;token = strtok(NULL, " ");}

                
  
  
  
  
qsort(mots, i, sizeof


  
                                                (char *),                         
    
                                  
  compare);

  
  
  
  for (int j = 0; j < i; j++) {
    
                                
    
    
                                     printf("%s ", mots[j]);

  
  
  
  
  
  
}
  
  
  
  printf("\n");



}

int main() {
                      char texte[] = "exemple de texte a classer";
  
  char ordre[] = {'c', 't', 'e', 'x', 'a', 'm', 'p', 'l', 's', 'r', 'd'};

  sortWords(texte, ordre);
                                                 return 0;
}
