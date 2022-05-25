package controlstructure

//def vowelOrConsonant(x)
Scanner sc=new Scanner(System.in)
println "Please enter alphabet: "
x=sc.next()
if (x == 'a' || x == 'e' ||
x == 'i' || x == 'o' || x == 'u')
print("Vowel")
else
print("Consonant")


vowelOrConsonant('c')
vowelOrConsonant('e')