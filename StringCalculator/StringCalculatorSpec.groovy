@Grab(group='org.spockframework', module='spock-core', version='0.7-groovy-2.0')
import spock.lang.*

class StringCalculatorSpec extends Specification {

	def stringCalculator = new StringCalculator()
	
	void "All tests of the String Calculator"(){
		given:"A string numbers"
			String numbers = row
		when:"All of the cases happen"
			def result = stringCalculator.add(numbers)
		then:"The result of the numbers"
			result == expect
		where:
		row					||	expect
		""					||	0
		"0"					||	0
		"1"					||	1
		"1,2"				        ||	3
		"4,5"				       	|| 	9
		"10,21"				       	||	31
		"1,2,3,4,5"			       	||	15
		"10,20,30,40,50"	        	||	150
		"1,1,2,3,5,8,13,21"		        ||	54
		"1,2\n3,4\n5"              		||	15
		"10\n20\n30\n40\n50"	                ||	150
		"1,1\n2,3,5,8,13\n21"                  	||	54
		"//;\n1;2;3;4;5"		        ||	15
		"//#\n10#20#30#40#50"	                ||	150
		"//-\n1-1-2-3-5-8-13-21"                ||	54
		"//&\n10&20&30&40&50"	                ||	150
		"2,1001"			        ||	2
		"1,2,3,4,1000"			        ||	10
		"1\n2,3,4,4000"			        ||	10
		"//[***]\n1***2***3"                   	||	6
		"//[!!]\n1!!2!!3"		        ||	6
	}
}
