package controlstructure

println "Enter number of integer or number of terms"
Scanner sc=new Scanner(System.in)
  n=sc.nextInt()
for(i=1;i<=n;i++)
{
  println("Number is : " +i+" and cube of " +i+" is : "+(i**3))
}