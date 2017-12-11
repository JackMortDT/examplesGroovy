class PrimeNumbersTests extends GroovyTestCase {

    PrimeNumbers primeNumbers = new PrimeNumbers()
    
    void testCalculateTwoOfPrimeFactors(){
        int result = primeNumbers.calculate(2)
        assert result == 2
    }
}