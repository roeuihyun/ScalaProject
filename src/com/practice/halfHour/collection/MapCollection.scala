package com.practice.halfHour.collection

/**
  * Created by roeuihyun on 2016. 6. 14..
  * Map은 Map(key1 -> value1, key2 -> value2, ...)와 같이 생성한다.
  * 스칼라에서 기본 Map은 Predef.Map(scala.collection.immutable.Map)이다.
  * Map도 Set과 마찬가지로 구성요소가 4개일 때까지는 Map1, Map2, Map3, Map4라는 별도 클래스로 구현되지만 더 많아지면 HashMap으로 구현된다
  * 키는 중복할 수 없으며 Set와 마찬가지로 순서가 보장되지 않는다.
  */
object MapCollection {

  def main(args: Array[String]): Unit = {
    // ① Map[String, Int] 타입의 맵
    val map1 = Map("one" -> 1, "two" -> 2, "three" -> 3)
    // Map[Any, Any] 타입의 맵
    val map2 = Map(1 -> "one", "2" -> 2.0, "three" -> false)
    println(s"① $map1")

    // ② 중복된 키가 있으면 마지막 값을 사용
    println(s"② ${Map('a' -> 1, 'a' -> 2)}")

    // ③ key를 가지고 값을 읽어오기
    val one = map1("one")
    println(s"③ ${one}")

    /* ④ 키가 없으면 NoSuchElementException이 발생
     * 예를들어 이런 경우> val fourExists = map1("four")
     * get메소드를 이용해서 얻어오는 객체의 isDefine값으로 Key가 있는지 확인 가능*/
    val fourExistsOption = map1.get("four")
    println(s"④ ${fourExistsOption.isDefined}")

    // ⑤ ++연산자로 두개의 Map을 더할 수 있으며, 중복된 키("three")의 값은 마지막 값으로 결정
    val concatenated = map1 ++ map2
    println(s"⑤ ${concatenated}")

    // ⑥ find (List, Set과 같은 형태)
    val personMap = Map(("솔라",1), ("문별",2), ("휘인",3))
    def findByName(name:String) = personMap.getOrElse(name, 4)
    val findSolar = findByName("솔라")  // 값 1을 찾아서 넘겨줌
    val findSun = findByName("태양")  // 값이 없으므로 4를 넘겨줌
    println(s"⑥ ${findSolar}, ${findSun}")
  }

}
