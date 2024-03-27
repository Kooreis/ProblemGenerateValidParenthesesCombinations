Sure, here is a Python solution using recursion:

```python
def generate_parentheses(n):
    def generate(p, left, right, parens=[]):
        if left:         generate(p + '(', left-1, right)
        if right > left: generate(p + ')', left, right-1)
        if not right:    parens.append(p)
        return parens
    return generate('', n, n)

def main():
    n = int(input("Enter the number of pairs of parentheses: "))
    print(generate_parentheses(n))

if __name__ == "__main__":
    main()
```

You can run this console application, it will ask for the number of pairs of parentheses and then it will print all valid combinations of n pairs of parentheses.