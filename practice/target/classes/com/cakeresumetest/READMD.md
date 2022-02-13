You are given a string initialWord and an array of strings dictionary. You can transform the initialWord by:

1. choosing one of its letters and replacing all of its occurrences by another letter
2. [optionally] rearranging the letters from the above step
For example:

```
abcabc -> dbcdbc // replacing all occurences of letter 'a' with letter 'd' and rearranging the letters
abcabc -> aaaacc // replacing all occurences of letter 'b' with letter 'a' and rearranging the letters
abcabc -> aabbzz // replacing all occurences of letter 'c' with letter 'z' and rearranging the letters
```
How many words from the dictionary can be the result of applying such transformation to the initialWord?

Note: You can not replace the letter by itself, it should be a different letter.

## Example

- For initialWord = "abba" and dictionary = ["aadd", "abbb", "dnnd", "lbbl"], the output should be
`solution(initialWord, dictionary) = 2.`

Explanation: "abba" can be transformed to "aadd" (by replacing letter 'b' with letter 'd' and rearranging the letters) or "lbbl" (by replacing letter 'a' with letter 'l')

- For initialWord = "abcab" and dictionary = ["abcab", "abca", "abcabx", "ddaca", "kdckd", "abxab"], the output should be
`solution(initialWord, dictionary) = 2.`

Explanation: "abcab" can be transformed to "ddaca" (by replacing letter 'b' with letter 'd' and rearranging the letters) or "abxab" (by replacing letter 'c' with letter 'x')

## Input/Output

- [execution time limit] 3 seconds (java)
- [input] string initialWord
    - A string consisting of lowercase English letters.
    - Guaranteed constraints:`1 ≤ initialWord.length ≤ 100.`

- [input] array.string dictionary

  - An array of strings consisting of lowercase English letters.
  - Guaranteed constraints:
`0 ≤ dictionary.length ≤ 50,`
`1 ≤ dictionary[i].length ≤ 100.`

- [output] integer

- The number of words from the dictionary which can be the result of applying the transformation described above to the initialWord.

[Java] Syntax Tips

``` java
// Prints help message to the console
// Returns a string
// 
// Globals declared here will cause a compilation error,
// declare variables inside the function instead!
String helloWorld(String name) {
    System.out.println("This prints to the console when you Run Tests");
    return "Hello, " + name;
}
```