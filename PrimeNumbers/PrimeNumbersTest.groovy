class PrimeNumbersTests extends GroovyTestCase {

	PrimeNumbers primeNumbers = new PrimeNumbers()
	
	void calculatePrimeNumbers(){
		int result = primeNumbers.calculate(2)
		assert result == 0
	}
}
