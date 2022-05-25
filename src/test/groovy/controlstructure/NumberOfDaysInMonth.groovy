package controlstructure
int month
int year
Scanner sc=new Scanner(System.in)
println "Please enter year: "
year=sc.nextInt()
println "Please enter month number from 1 to 12"
month=sc.nextInt()
switch (month) {
// Cases for 31 Days
    case 1:
    case 3:
    case 5:
    case 7:
    case 8:
    case 10:
    case 12:
        println "Number of days is 31"
        break;

        // Cases for 30 Days
    case 4:
    case 6:
    case 9:
    case 11:
        println "Number of days is 30"
        break;

        // Case for 28/29 Days
    case 2:
        if((year%400==0) || ((year%100!=0)&&(year%4==0)))
            println "Number of days is 29"
        else
            println "Number of days is 28"
        break

    default:
        println "Invalid Month."
        break
    }
