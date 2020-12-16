@Grab(group='org.spockframework', module='spock-core', version='0.7-groovy-2.0')
import spock.lang.*

class TrianguloSpec extends Specification {

  def triangulo = new Triangulo()

  void "Test triangle"() {
    given: "3 sides"
      Integer a = _a
      Integer b = _b
      Integer c = _c
    when: "el metodo es llamado"
      Boolean result = triangulo.calculate(a, b, c)
    then:
      assert result == _result
    where:
      _a || _b || _c || _result
      1  || 1  || 1  || true
      -1 || 1  || 3  || false
      1  || 1  || 3  || false
      7  || 9  || 13 || true
      4  || 8  || 15 || false
      40 || 80 || 150 || false
  }

}