package controlstructure

def year
Scanner sc=new Scanner(System.in)
println "Please enter Year: "
year=sc.nextInt()

if((year%4==0) || (year%400==0))
print year + " is a leap year"
else
    print year+ " is not a leap year"