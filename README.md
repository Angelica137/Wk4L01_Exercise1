## **Activity** *Pseudocode and algorithms analysis*

The aim of this activity is to practice the concepts learned in lesson 1. This activity contains 1 problem case.

After you have completed each exercise, add your answers, along with any code you write to your ePortfolio.

### Exercise one

There are two parts to this exercise:

1. Write an algorithm which takes an array of *n* integers as input and output the maximum element of the list.
2. Analyse its time complexity and express it using asymptotic notations.

## Answer

### FindMax(A)

|       instruction        | time cost | best case | worst case |
| :----------------------: | --------- | --------- | ---------- |
|      1. max = A[1]       | c1        | 1         | 1          |
| 2. for i = 2 to A.length | c2        | n - 1     | n - 1      |
|     3. if A[i] > max     | c3        | n - 1     | n - 1      |
|      4. max = A[i]       | c4        | 0         | n - 1      |
|      5. return max       | c5        | 1         | 1          |

Best case: T(n) = c1 +(n - 1)(c2 + c3) + c5
Worst case: T(n) = c1 + (n - 1)(c2 + c3 + c4) + c5
