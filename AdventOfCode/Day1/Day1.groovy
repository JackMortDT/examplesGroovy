String floors = new File('Day1.txt').text

Integer counter = 0
List level = []

Integer aux = 0
floors.each{ floor ->
    if(floor == "(") counter++
    else{
        counter--
        if(counter == -1) level << aux+1
    }
    aux++
}

println counter
println level?level[0]:"Santa never went to the basement D:"