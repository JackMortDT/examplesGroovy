class Day3{
  Integer routeForDeliverPresents(String route){
    List allVisitHouses = getTheDir(route)
    allVisitHouses.unique().size()
  }

  List getTheDir(String route){
    Map dir = [xaxis:0, yaxis:0]
    List housesVisited = [[0,0]]
    route.each{
      if(it == ">")
        dir.xaxis = dir.xaxis + 1
      else if(it == "^")
        dir.yaxis = dir.yaxis + 1
      else if(it == "<")
        dir.xaxis = dir.xaxis - 1
      else if(it == "v")
        dir.yaxis = dir.yaxis - 1
        housesVisited << [dir.xaxis, dir.yaxis]
    }
    housesVisited
  }
}
