class Day3Test extends GroovyTestCase {

  def day3 = new Day3()

  void testForFirstSantaTravel(){
    String route = ">"
    Integer totalTraveled = day3.routeForDeliverPresents(route)
    assert totalTraveled == 2
  }

  void testForMoreLargeRoute(){
    String route = "^>v<"
    Integer totalTraveled = day3.routeForDeliverPresents(route)
    assert totalTraveled == 4
  }

  void testForMoreMoreHouses(){
    String route = "^v^v^v^v^v"
    Integer totalTraveled = day3.routeForDeliverPresents(route)
    assert totalTraveled == 2
  }

  void testForAllCalls(){
    String route = new File('Day3.txt').text
    Integer totalTraveled = day3.routeForDeliverPresents(route)
    assert totalTraveled == 2592
  }
}
