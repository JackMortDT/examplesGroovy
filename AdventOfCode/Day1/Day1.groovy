class Day1 {
  Integer floorWhereIsSanta(String floors){
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
    counter
  }

  Integer firsBasementFloorInTheSantasTrip(String floors){
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
    level?level[0]:"Santa never went to the basement D:"
  }
}