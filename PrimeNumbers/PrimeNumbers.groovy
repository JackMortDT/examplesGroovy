class PrimeNumbers{
    def calculate(int number){
        int i = 0
        int divisor = 2
        def cadena = []
        for(i = 0; i <= number; i++){
            if(number % divisor == 0){
                cadena.add(divisor)
                number = number/divisor    
            }
            else divisor++
        }
        cadena.join(", ")
    }
}