@Grab(group='org.spockframework', module='spock-core', version='0.7-groovy-2.0')
import spock.lang.*

class PrimeNumbersSpec extends Specification {

    def primeNumbers = new PrimeNumbers()
    
    void "Calculate the prime factors of a number"(){
        given:"A number"
            Integer number = row
        when:
            String result = primeNumbers.calculate(number)
        then:
            result == expect
        where:
            row     || expect
            2       || "2"
            3       || "3"
            7       || "7"
            23      || "23"
            4       || "2, 2"
            15      || "3, 5"
            141     || "3, 47"
            18      || "2, 3, 3"
            27      || "3, 3, 3"
            171     || "3, 3, 19"
            140     || "2, 2, 5, 7"
            180     || "2, 2, 3, 3, 5"
            200     || "2, 2, 2, 5, 5"
            1000000 || "2, 2, 2, 2, 2, 2, 5, 5, 5, 5, 5"
    }
}