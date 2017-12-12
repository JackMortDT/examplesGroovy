class PrimeNumbers{
    def calculate(int number){
        addPrimeFactorToCadena(number)
    }

    private def addPrimeFactorToCadena(int number){
        int divisor = 2
        def cadena = []
        for(def i = -2; i <= number; i++){
            if(number % divisor == 0){
                cadena.add(divisor)
                number = number/divisor
            }
            else divisor++
        }
        cadena.join(", ")
    }
}