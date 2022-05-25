package controlstructure

println "Enter number of terms : "

int i, n, sum=0
Scanner sc= new Scanner(System.in)
n=sc.nextInt()

println "The Odd numbers are: "
for( i=1; i<=n; i++)
{
    println (2*i-1)
    sum+=2*i-1
}
println "The Sum of odd Natural Number upto "+ n +"terms is: "+sum
