package com.practice.halfHour.classDefine

/**
  * Created by roeuihyun on 2016. 6. 14..
  */
// 자바 스타일 클래스
class JPerson() {
  var _name: String = null
  def this(_name:String) = {
    this()
    this._name = _name
  }

  // 스칼라 스타일의 getter, setter
  def name_=(_name:String) = this._name = _name
  def name = this._name

  // 자바 스타일의 getter, setter
  def getName() = name
  def setName(name:String) = this.name = name
}