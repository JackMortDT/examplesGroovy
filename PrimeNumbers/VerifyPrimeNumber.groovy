Integer number = Integer.parseInt(System.console().readLine("Please enter your name: "))
if(number == 1) println("${number} No es primo")
else if(number == 2) println("${number} Es primo")
else{
	counter = 0
	(1..number).collect{ divisor ->
		if(number%divisor == 0) counter ++
			if(counter > 2) true
	}.contains(true)?println("${number} No es primo"):println("${number} Es primo")
}