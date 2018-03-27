@Grab(group='org.spockframework', module='spock-core', version='1.1-groovy-2.4')
import spock.lang.Specification

class Day1Spec extends Specification {

	def day1 = new Day1()

	void "Calculate the total floors in where Santa has been"(){
		given:"A string of parenthesis"
			String floors = listOfFloors
		when:"The method of calculate the floor is execute"
			Integer result = day1.floorWhereIsSanta(floors)
		then:"The expected result"
			result == expected
		where:
			listOfFloors									||	expected
			"(())"												||	0
			"))((((("											||	3
			new File('Day1.txt').text			||	232
	}

	void "Calculate the first basement in where Santa has been"(){
		given:"A string of parenthesis"
			String floors = listOfFloors
		when:"The method of calculate the first floor where Santa has been is execute"
			Integer result = day1.firsBasementFloorInTheSantasTrip(floors)
		then:"The expected result"
			result == expected
		where:
			listOfFloors									||	expected
			")"														||	1
			"()())"												||	5
			new File('Day1.txt').text			||	1783
	}

}