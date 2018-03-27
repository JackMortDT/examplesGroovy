class Day1Test extends GroovyTestCase {
	
	def day1 = new Day1()

	void testOftheFirstFloorsOfSanta(){
		String floors = "(())"
		Integer result = day1.floorWhereIsSanta(floors)
		assert result == 0
	}

	void testOftheSecondCaseOfFloorsOfSanta(){
		String floors = "(())"
		Integer result = day1.floorWhereIsSanta(floors)
		assert result == 0
	}

	void testOftheRealCaseOfFloorsOfSanta(){
		String floors = new File('Day1.txt').text
		Integer result = day1.floorWhereIsSanta(floors)
		assert result == 232
	}

	void testOfTheFirstBasementForSanta(){
		String floors = ")"
		Integer result = day1.firsBasementFloorInTheSantasTrip(floors)
		assert result == 1
	}

	void testOfTheSecondCaseOfBasementForSanta(){
		String floors = "()())"
		Integer result = day1.firsBasementFloorInTheSantasTrip(floors)
		assert result == 5
	}

	void testOftheRealCaseOfTheFirstBasementForOfSanta(){
		String floors = new File('Day1.txt').text
		Integer result = day1.firsBasementFloorInTheSantasTrip(floors)
		assert result == 1783
	}
}