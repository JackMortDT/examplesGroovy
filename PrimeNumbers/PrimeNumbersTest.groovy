class PrimeNumbersTests extends GroovyTestCase {

    PrimeNumbers primeNumbers = new PrimeNumbers()
    
    void testCalculateTwoOfPrimeFactors(){
        def result = primeNumbers.calculate(2)
        assert result == "2"
    }
    
    void testCalculateOtherSingleNumberOfPrimeFactors(){
        def result = primeNumbers.calculate(3)
        assert result == "3"
        result = primeNumbers.calculate(7)
        assert result == "7"
        result = primeNumbers.calculate(23)
        assert result == "23"
    }

    void testCalculateTwoNumbersOfPrimeFactors(){
        def result = primeNumbers.calculate(4)
        assert result == "2, 2"
        result = primeNumbers.calculate(15)
        assert result == "3, 5"
        result = primeNumbers.calculate(141)
        assert result == "3, 47"
    }

    void testCalculateThreeNumbersOfPrimeFactors(){
        def result = primeNumbers.calculate(18)
        assert result == "2, 3, 3"
        result = primeNumbers.calculate(27)
        assert result == "3, 3, 3"
        result = primeNumbers.calculate(171)
        assert result == "3, 3, 19"
    }

    void testCalculateSomeNumbersOfPrimeFactors(){
    	def result = primeNumbers.calculate(140)
    	assert result == "2, 2, 5, 7"
    	result = primeNumbers.calculate(180)
    	assert result == "2, 2, 3, 3, 5"
    	result = primeNumbers.calculate(200)
    	assert result == "2, 2, 2, 5, 5"
    }
}