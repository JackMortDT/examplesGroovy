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
}