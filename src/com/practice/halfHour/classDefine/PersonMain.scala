package com.practice.halfHour.classDefine

/**
  * Created by roeuihyun on 2016. 6. 14..
  * 스칼라에서는 명시적으로 정의되지 않으면 모두 public으로 간주한다.
  * private한 변수의 이름과 getter, setter가 모두 같은 이름을 가지는 경우를 직접 코드로 구현할 수는 없다.
  * getter와 setter를 사용하기 위해서는 private한 변수의 이름은 다르게 지정해야 하는데, 메소드명과 구분하기 위해 _를 변수명 앞에 붙이기도 한다.
  */
object PersonMain {

  def main(args: Array[String]): Unit = {
    // ① 단순한 클래스
    val p1 = new Person1("중기", "송")
    //p1.fname과 p1.lname의 값을 외부에서 가져올 수 없습니다.

    // ② 메소드를 가지는 클래스
    val p2 = new Person2("혜교", "송")
    // 이 경우에도 p2.fname과 p2.lname의 값을 외부에서 가져올 수는 없습니다.
    // 정의된 greet 메소드를 출력합니다.
    println(s"② ${p2.greet}")

    // ③ public한 read only(val) fullname을 가지는 클래스
    val p3 = new Person3("구", "진")
    println(s"③ ${p3.fullName}님께 인사합니다. ${p3.greet}")

    // ④ val fname과 var lname을 가지는 클래스
    val p4 = new Person4("지원", "Kim") {
      override def toString = s"$lname$fname"
    }
    // val로 선언된 p4.fname과 var로 선언된 p4.lname을 외부에서 읽을 수 있음
    println(s"④ ${p4.lname}${p4.fname}")

    // ⑤ Person4클래스를 이용해서 객체를 생성하지만, 해당 객체의 toString메소드만 오버라이드
    val p5 = new Person4("시진", "유") {
      override def toString = s"$lname$fname"
    }
    println(s"⑤ $p5") // 오버라이드된 toString형태로 출력
    p5.lname = "김"
    println(s"can change ${p5.lname}${p5.fname}")

  }

}
