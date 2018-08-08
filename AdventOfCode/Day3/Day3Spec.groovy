@Grab(group='org.spockframework', module='spock-core', version='1.1-groovy-2.4')
import spock.lang.Specification

class Day3Spec extends Specification{

  def day3 = new Day3()

  void "First Santa travel"(){
    given:"The route"
      String route = routes
    when:"Santa's presents"
      Integer totalTraveled = day3.routeForDeliverPresents(routes)
    then:
      assert totalTraveled == results
    where:
      routes                    || results
      ">"                       || 2
      "^>v<"                    || 4
      "^v^v^v^v^v"              || 2
      new File('Day3.txt').text || 2592
  }
}
