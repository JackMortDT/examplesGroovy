class Arreglo {

  List entregaNumerosMayores(ArrayList array) {
    Integer number1 = calculaNumeroMayor(array)
    array.removeAll([number1])
    Integer number2 = calculaNumeroMayor(array)
    [number2, number1]
  }

  Integer calculaNumeroMayor(ArrayList array) {
    Integer number = 0;
    for(int i = 0; i < array.size(); i++) {
      if(number <  array[i])
        number = array[i]
    }
    number
  }

}