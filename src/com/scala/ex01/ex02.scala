package com.scala.ex01

object ex02 {
    def main(args: Array[String]) {
      var gugu = 1;
      var dan = 1;
      
      println("while 사용하여 구구단 시작");
      while(gugu < 10){
        dan = 1;
        print(gugu + "단:");
        while(dan < 10){
          print(gugu * dan + "|");
          dan = dan + 1;
        }
        gugu = gugu + 1;
        println("");
      }
      
      println("while 사용하여 구구단 끝");
      
      println("for <- n to m 사용하여 구구단 시작(마지막 범위 포함)");
      
      for(gugu <- 1 to 9){
        print(gugu + "단:");
        for(dan <- 1 to 9){
          print(gugu * dan + "|");
        }
        println("");
      }
      
      println("for <- n to m 사용하여 구구단 끝(마지막 범위 포함)");
      
      println("for <- n until m 사용하여 구구단 시작(마지막 범위 미포함)");
      
      for(gugu <- 1 until 10){
        print(gugu + "단:");
        for(dan <- 1 until 10){
          print(gugu * dan + "|");
        }
        println("");
      }
      
      println("for <- n until m 사용하여 구구단 끝(마지막 범위 미포함)");
      
      
    }
}