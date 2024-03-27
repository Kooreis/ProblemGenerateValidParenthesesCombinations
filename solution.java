Here is a Java console application that generates all valid combinations of n pairs of parentheses:

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of pairs of parentheses:");
        int n = scanner.nextInt();
        List<String> combinations = generateParenthesis(n);
        System.out.println("All valid combinations of " + n + " pairs of parentheses are:");
        for (String combination : combinations) {
            System.out.println(combination);
        }
    }

    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        backtrack(list, "", 0, 0, n);
        return list;
    }

    public static void backtrack(List<String> list, String str, int open, int close, int max) {
        if (str.length() == max * 2) {
            list.add(str);
            return;
        }

        if (open < max)
            backtrack(list, str + "(", open + 1, close, max);
        if (close < open)
            backtrack(list, str + ")", open, close + 1, max);
    }
}
```

This program prompts the user to enter the number of pairs of parentheses, generates all valid combinations of that number of pairs of parentheses, and then prints out all the combinations. The `generateParenthesis` method uses a recursive backtracking algorithm to generate the combinations.