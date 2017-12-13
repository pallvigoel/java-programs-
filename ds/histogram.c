Histogram solution:

#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

typedef struct stack
{
int data;
struct stack* next;

}st;

void push(st** top, int data)
{
    st* new = (st*)malloc(sizeof(st));

    new->data = data;
    new->next = *top;
    *top = new;

}

int peek(st* top)
{
    return top->data;
}

int empty(st* top)
{
    if(top==NULL)
    {
        return 1;
    }
    return 0;
}
void pop(st** top)
{

        st* temp=*top;
        *top= temp->next;
        free(temp);
        temp=NULL;


}

int getMaxArea(int* hist, int n)
{
    st *s = NULL;

    int max_area = 0;
    int tp;
    int area_with_top;


    int i = 0;
    while (i < n)
    {

        if (empty(s) ||  hist[peek(s)] <= hist[i])
            push(&s, i++);


        else
        {
            tp = peek(s);
            printf("arr= %d\n", hist[tp]);
            pop(&s);


            area_with_top = hist[tp] * (empty(s) ? i : i - peek(s) - 1);

printf("%d\n", area_with_top);

            if (max_area < area_with_top)
                max_area = area_with_top;
        }
    }


    while (!empty(s))
    {
        tp = peek(s);
        pop(&s);
        area_with_top = hist[tp] * (empty(s) ? i : i - peek(s) - 1);

        if (max_area < area_with_top)
            max_area = area_with_top;
    }

    return max_area;
}


int main() {

    int n;
    scanf("%d", &n);
    int arr[n];
    int i;
    for(i=0;i<n;i++)
    {
        scanf("%d", &arr[i]);

    }

    int r = getMaxArea(arr, n);
    printf("%d", r);
    return 0;
}



Balanced braces:

char** braces(int values_size, char** values, int* result_size) {



    char** res = (char**)malloc(sizeof(char*)*values_size )



    for(int i=0;i<values_size; i++)

    {

         struct stack obj;

    obj.top = NULL;

        res[i] = (char*)malloc(sizeof(char)*5);

    while(*s != '\0')

    {

        if(*s =='{' ||*s =='(' || *s =='[')

        {

            push(*s, &obj);

        }

        else

        {

            char ch = pop(&obj);

            if(ch == '\0')

            {strcpy(res[i], "No");

             break;

            }







        switch(ch){

            case '{':

                if(*s == '}')

                    break;

                else

                   {strcpy(res[i], "No");

             break;

            }

            case '(':

                if(*s == ')')

                    break;

                else

                   {strcpy(res[i], "No");

             break;

            }

            case '[':

                if(*s == ']')

                    break;

                else

                   {strcpy(res[i], "No");

             break;

            }







        }







    }

        s++;

}

    if(obj.top==NULL)

    return "YES";



   return "NO";





    }







    *result_size = value_size;

}
