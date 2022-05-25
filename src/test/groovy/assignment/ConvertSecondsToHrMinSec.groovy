package assignment

import java.time.format.DateTimeFormatter
import java.util.concurrent.TimeUnit

def secondsToCovert

Scanner sc= new Scanner(System.in)
println "Enter Seconds To convert: "
secondsToCovert=sc.nextInt()

int hours = secondsToCovert / 3600
int minutes = (secondsToCovert % 3600) / 60
seconds = secondsToCovert % 60
println (hours + " : " + minutes + " : " + seconds)


