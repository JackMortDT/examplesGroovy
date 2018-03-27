class Day2 {
	Integer calculateWrapper(String dimension){
		List listOfOperation = getTheListOfOperations(dimension)
		List totalListOfWrapper = []
		listOfOperation.each{ addition ->
   		totalListOfWrapper << totalOfRibbon(addition)
		}
		totalListOfWrapper.sum()
	}

	Integer calculateRibbon(String dimension){
		List listOfOperation = getTheListOfOperations(dimension)
		List totalListOfRibbon = []
		listOfOperation.each{ addition ->
   		totalListOfRibbon << sideOfWrapper(addition)
		}
		totalListOfRibbon.sum()
	}

	List getTheListOfOperations(String dimension){
		List listOfArrays = []
		dimension.eachLine{ operation ->
     	listOfArrays << operation.split('x').collect{ it as Integer }
		}
	}

	Integer sideOfWrapper(List addition){
		Integer l, w, h, minPerimeter
		l = addition[0]; w = addition[1]; h = addition[2]
   	minPerimeter = [2*l + 2*w, 2*w + 2*h, 2*h + 2*l].min()
		(l * w * h + minPerimeter)
	}

	Integer totalOfRibbon(List addition){
		Integer l, w, h, side1, side2, side3, smallSideOfWrapper
		l = addition[0]; w = addition[1]; h = addition[2]
   	side1 = l*w; side2 = w*h; side3 = h*l
   	smallSideOfWrapper = [l * w, w * h, h * l].min()
   	(2*side1 + 2*side2 + 2*side3 + smallSideOfWrapper) 
	}
}