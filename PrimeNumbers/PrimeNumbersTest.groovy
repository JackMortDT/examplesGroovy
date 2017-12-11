class PrimeNumbersTests extends GroovyTestCase {

    PrimeNumbers primeNumbers = new PrimeNumbers()
    
    void testCalculateTwoOfPrimeFactors(){
        int result = primeNumbers.calculate(2)
        assert result == 2
    }
    
    void testCalculateOtherSingleNumberOfPrimeFactors(){
        int result = primeNumbers.calculate(3)
        assert result == 3
        result = primeNumbers.calculate(7)
        result == 7
        result = primeNumbers.calculate(23)
        result == 23
    }
}