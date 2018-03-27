@Grab(group='org.spockframework', module='spock-core', version='1.1-groovy-2.4')
import spock.lang.Specification

class Day2Spec extends Specification {

	def day2 = new Day2()

	void "Calculate the total wrapper"(){
		given:"A string of numbers"
			String dimension = dimensions
		when:"The method of calculate wrapper is execute"
			Integer result = day2.calculateWrapper(dimension)
		then:"The expected result"
			result == expected
		where:
			dimensions							||	expected
			"2x3x4"								||	58
			"1x1x10"							||	43
			new File('Day2.txt').text			||	1586300
	}

	void "Calculate the total of ribbon"(){
		given:"A string of numbers"
			String dimension = dimensions
		when:"The method of calculate ribbon is execute"
			Integer result = day2.calculateRibbon(dimension)
		then:"The expected result"
			result == expected
		where:
			dimensions							||	expected
			"2x3x4"								||	34
			"1x1x10"							||	14
			new File('Day2.txt').text			||	3737498
	}
}