static void Main(string[] args)
{
    int n = Convert.ToInt32(Console.ReadLine());
    List<string> result = GenerateParenthesis(n);
    foreach (string s in result)
    {
        Console.WriteLine(s);
    }
}