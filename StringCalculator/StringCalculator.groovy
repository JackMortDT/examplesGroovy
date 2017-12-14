import java.util.regex.Matcher

class StringCalculator{

	int add(String numbers){
        if(!numbers) return 0
        def separator = calculateTheSeparatorForAStringOf(numbers)
        if(theStringIsValidWithTheCurrentSeparator(numbers, separator))
			doTheSumOfNumbersWithTheSepartor(numbers, separator)            
        else
        	throwAnErrorWithNegativeNumbers(numbers)
    }

    private def doTheSumOfNumbersWithTheSepartor(numbers, separator){
    	def theList = makeAListOfNumbersWithASeparator(numbers, separator)
        def listOfNumbers = filterEmptyValuesOf(theList)
        makeTheSumOfTheNumbers(listOfNumbers)
    }

    private def calculateTheSeparatorForAStringOf(String numbers){
    	numbers.startsWith("//") ? numbers.startsWith("//[") ? numbers[3] : numbers[2] : " "
    }
    private def theStringIsValidWithTheCurrentSeparator(String numbers, String separator){
    	!(numbers =~ /[,\n$separator]-\d/)
    }
    private def throwAnErrorWithNegativeNumbers(String numbers){
    	def colector = (numbers =~ /-\d/)*.toInteger()
        def error = "negatives not allowed " + colector.join(" ")
        throw new RuntimeException("${error}")
    }
    private def transformNumberGreaterThan1000ToZero(n){
    	isTheNumberGreaterThan1000(n) ? 0 : n.toInteger()
    }
    private def isTheNumberGreaterThan1000(number){
    	number.toInteger() > 999
    }
    private def makeAListOfNumbersWithASeparator(String numbers, String separator){
    	numbers.split(",|\n|\\${separator}|//|\\[|]")
    }
    private def filterEmptyValuesOf(numbers){
    	numbers.findAll { it }
    }
    private def makeTheSumOfTheNumbers(listOfNumbers){
    	listOfNumbers.collect{ transformNumberGreaterThan1000ToZero(it) }.sum()
    }
}