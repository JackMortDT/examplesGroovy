@Grab(group='org.spockframework', module='spock-core', version='0.7-groovy-2.0')
import spock.lang.*

class PrimeNumbersSpec extends Specification {

    CalculatePrimeNumbers calculatePrimeNumbers = new CalculatePrimeNumbers()
    
    void "Calculate the prime numbers"(){
        given:"A number"
            Integer number = row
        when:
            String result = calculatePrimeNumbers.calculate(number)
        then:
            println result
            result == expect
        where:
            row     || expect
            1       || "1 is not prime"
            2       || "2"
            3       || "2, 3"
            10      || "2, 3, 5, 7"
            50      || "2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47"
            100     || "2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97"
    }
}