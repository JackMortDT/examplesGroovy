List listOfNumbers = [] 
(1..1000-1).collect{ naturalNumber ->
	if(naturalNumber%3 == 0 || naturalNumber%5 == 0 ) 
		listOfNumbers << naturalNumber	
}
println listOfNumbers.sum()