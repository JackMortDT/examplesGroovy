class CalculatePrimeNumbers{
  String calculate(Integer numberReceived){
    if(numberReceived == 1) "1 is not prime"
    else if(numberReceived == 2) "2"
    else calculateNumber(numberReceived)
  }

  String calculateNumber(Integer numberReceived){
    List<Integer> listOfNumbers = []
      iteratingNumber(numberReceived, listOfNumbers)
  }

  String iteratingNumber(Integer numberReceived, List<Integer> listOfNumbers){
    (2..numberReceived).each{ iteratedNumber ->
        dividingNumber(iteratedNumber, listOfNumbers)
      }
      listOfNumbers.join(", ")
  }

  def dividingNumber(Integer iteratedNumber, List<Integer> listOfNumbers){
    Integer counter = 0
    Integer currentNumber = 0
    (1..iteratedNumber).each{ divider -> 
      currentNumber = divider
      ( iteratedNumber%divider == 0)? counter++:null
      assignNumberToList(counter, currentNumber, iteratedNumber, listOfNumbers)
    }
  }

  List<Integer> assignNumberToList(Integer counter, Integer currentNumber, Integer iteratedNumber, List<Integer> listOfNumbers){
    if (counter == 2) {
      (currentNumber == iteratedNumber) ? listOfNumbers << iteratedNumber:null
    }
  }
}