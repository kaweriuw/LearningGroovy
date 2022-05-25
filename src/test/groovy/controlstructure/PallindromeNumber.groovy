package controlstructure


original=""
reverse = ""
Scanner sc = new Scanner(System.in)
println "Enter a string/number to check if it is a palindrome"
original = sc.nextLine()
int length = original.length()
for ( int i = length - 1; i >= 0; i-- )
    reverse = reverse + original.charAt(i)
if (original.equals(reverse))
  println "Entered string/number is a palindrome."
else
    println "Entered string/number isn't a palindrome."