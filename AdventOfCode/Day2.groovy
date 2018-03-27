File paragraph = new File('/home/luis/Repos/Groovy/examplesGroovy/AdventOfCode/Day2.txt')

List listOfArrays = []
paragraph.eachLine{ operation ->
     listOfArrays << operation.split('x').collect{ it as Integer }
}

List totalListOfWrapper = []
List totalListOfRibbon = []
Integer l, w, h, side1, side2, side3, smallSideOfWrapper, total, minPerimeter
listOfArrays.each{ addition ->
   l = addition[0]; w = addition[1]; h = addition[2]
   side1 = l*w; side2 = w*h; side3 = h*l
   smallSideOfWrapper = [l * w, w * h, h * l].min()
   minPerimeter = [2*l + 2*w, 2*w + 2*h, 2*h + 2*l].min()
   totalListOfRibbon << (l * w * h + minPerimeter)
   totalListOfWrapper << (2*side1 + 2*side2 + 2*side3 + smallSideOfWrapper) 
}
println "Total of wrapper: ${totalListOfWrapper.sum()}"
println "Total of ribbon: ${totalListOfRibbon.sum()}"