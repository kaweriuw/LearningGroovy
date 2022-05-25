package controlstructure

ran=12..46
print("Even Numbers are: ")
ran.step(1).each {element->
   if(element%2==0)
        print(element+" ")
}

println()
print ("Odd Numbers are: ")
ran.step(1).each {element->
    if(element%2==1)
        print(element+" ")
}
