@Grab(group='org.spockframework', module='spock-core', version='0.7-groovy-2.0')
import spock.lang.*

class ArregloSpec extends Specification {

  def arreglo = new Arreglo()

  void "arreglo"() {
    given: "an array"
      ArrayList array = _array
    when: "the method is called"
      List result = arreglo.entregaNumerosMayores(array)
    then:
      assert result == _result
    where:
      _array                || _result
      [1,5,9,2,15,9,10,12]  || [12,15]
      [1,2,4] || [2, 4]
      [4,6] || [4,6]
      [3,2,46] || [3,46]
  }

}