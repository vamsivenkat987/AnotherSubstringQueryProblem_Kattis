# AnotherSubstringQueryProblem_Kattis

## General info
Problem solved from Kattis assignment
## Assignment
You are given a string s and several queries.

Each query consists of a string t and an integer k. For each query, determine the kth position in s where a substring matching t starts. If t occurs fewer than k times in s, print −1.

## Input
The first line of input contains a single string s (1≤|s|≤2⋅105), which is the queriable string. It will consist only of lower-case letters.

The next line of input contains a single integer q (1≤q≤2⋅105), which is the number of queries that follow.

Each of the next q lines contains a string t (1≤|t|) and an integer k (1≤k≤|s|). This represents a query for the kth occurrence of t in s. The string t will consist only of lower-case letters. The sum of all |t|’s will be ≤2⋅105

## Output
Output a single integer, which is the position of the start of the kth occurrence of t in s, or −1 if t occurs fewer than k times in s. The first character in s is at position 1.
|Sample Input 1 | Sample Output 1 |
| ------------- |:---------------:|
| abacabadabacaba| 13 |
| 4 | -1 |
| a 7 | 10 |
| e 3 | 5 |
| bac 2 | |
| abada 1 | |

## How to run this project
```
$ git clone https://github.com/vamsivenkat987/AnotherSubstringQueryProblem_Kattis.git
$ cd src/com/company
$ java QueryProblem.java < 1.in
```


