```C#
using System;
using System.Collections.Generic;

class Program
{
    static void Main(string[] args)
    {
        int n = Convert.ToInt32(Console.ReadLine());
        List<string> result = GenerateParenthesis(n);
        foreach (string s in result)
        {
            Console.WriteLine(s);
        }
    }

    public static List<string> GenerateParenthesis(int n)
    {
        List<string> result = new List<string>();
        Backtrack(result, "", 0, 0, n);
        return result;
    }

    public static void Backtrack(List<string> result, string current, int open, int close, int max)
    {
        if (current.Length == max * 2)
        {
            result.Add(current);
            return;
        }

        if (open < max)
            Backtrack(result, current + "(", open + 1, close, max);
        if (close < open)
            Backtrack(result, current + ")", open, close + 1, max);
    }
}
```