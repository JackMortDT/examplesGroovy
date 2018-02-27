class CalculatePrimeNumbers{
  String calculate(int numberReceived){
    if(numberReceived == 1)
      "1 no es primo"

    else if(numberReceived == 2) 
      "2"

    else{
      List<Integer> listOfNumbers = []
      (2..numberReceived).each{ iteratedNumber ->
        Integer counter = 0
        Integer currentNumber = 0
        (1..iteratedNumber).each{ divider -> 
          currentNumber = divider
          ( iteratedNumber%divider == 0)? counter++:null
          if (counter == 2) {
            (currentNumber == iteratedNumber) ? listOfNumbers << iteratedNumber:null
          }
        }
      }
      listOfNumbers.join(", ")
    }     
  }  
}