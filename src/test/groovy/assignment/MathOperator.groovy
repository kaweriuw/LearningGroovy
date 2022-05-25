package assignment

a=5
b=7
println "Addition is: "+ (a+b)
println "Substraction is: "+ (a-b)
println "Multiplication is: "+(a*b)
println "Division is: "+ (b/a)
println "Remainder is: "+(b%a)

def add={x,y->return x+y}
assert add(4,7)==11

def sub={x,y->return x-y}
assert sub(100-32)==68

def multi={x,y-> return x*y}
assert multi(9,6)==54

def div={x,y-> return x/y}
assert div(412,4)==103

def rem={x,y-> return x%y}
assert rem(9,2)==1