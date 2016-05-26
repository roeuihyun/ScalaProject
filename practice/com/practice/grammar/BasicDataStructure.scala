package com.practice.grammar

/**
	*
	*/
object BasicDataStructure{

	var listStructure = List(2, 3, 4, 5)
	var setStructure = Set(7, 4, 1, 1, 2)
	var tupleStructure = ("localhost", "8080")
  var mapStructure =  Map(("one","1"),("two","2"),("three","3"))

	def main(args: Array[String]) {

		println("List------------------------------------------------------------------------------------")
		println("listStructure : " + listStructure)
		println("listStructure Find Index Value1 : " + listStructure.seq(1))
		println("listStructure Find Index Value2 : " + listStructure.apply(1))
    println("listStructure length : " + listStructure.length)
		listStructure = listStructure :+ 6
		println("listStructure Add Value : " + listStructure)
		listStructure = listStructure.updated(4,7)
		println("listStructure Update Value : " + listStructure)
		listStructure = listStructure.patch(4, Nil, 1)
		println("listStructure Remove Value : " + listStructure)
		println("List------------------------------------------------------------------------------------")

		println("Set------------------------------------------------------------------------------------")
		println("setStructure : " + setStructure)
		println("setStructure Find Value 2 include : " + setStructure.seq(2))
		println("setStructure Find Value 3 include : " + setStructure.apply(3))
		println("setStructure Find Value 7 include : " + setStructure.contains(7))
    println("setStructure Size : " + setStructure.size)
		setStructure = setStructure + 3
    setStructure += 11
		println("setStructure Add Value: " + setStructure)
		setStructure = setStructure - 2
		println("setStructure Remove Value: " + setStructure)
    println("setStructure Sum Value: " + setStructure.sum)
    println("setStructure Convert To List Value: " + setStructure.toList)
		println("Set------------------------------------------------------------------------------------")

		println("Tuple------------------------------------------------------------------------------------")
		println("tupleStructure : " + tupleStructure)
		println("tupleStructure._1 : " + tupleStructure._1)
    println("tupleStructure.productElement(1) : " + tupleStructure.productElement(1))
    println("tupleStructure Total Count of Tuple : " + tupleStructure.productArity)
    println("Tuple------------------------------------------------------------------------------------")

    println("Map------------------------------------------------------------------------------------")
    println("mapStructure : " + mapStructure);
    println("mapStructure.get('one') : " + mapStructure.get("one"));
    println("mapStructure.size : " + mapStructure.size)
    mapStructure = mapStructure ++ Map(("four","4"))
    mapStructure += ("five" -> "5")
    println("mapStructure Add four, five : " + mapStructure);
    mapStructure += ("one" -> "11")
    println("mapStructure Update one : " + mapStructure);
    mapStructure -= ("one")
    println("mapStructure Delete one: " + mapStructure);
    println("mapStructure keys : " + mapStructure.keys);
    println("Map------------------------------------------------------------------------------------")

	}

}