package com.atguigu.saprkmall.mock.util

import java.util.Date

import scala.util.Random

/**
  * @aythor HeartisTiger
  *         2019-02-16 14:28
  */
object RandomDate {

  def apply(startDate:Date,endDate:Date,step:Int): RandomDate ={
    val randomDate = new RandomDate()
    val avgStepTime = (endDate.getTime- startDate.getTime)/step
    randomDate.maxTimeStep=avgStepTime*2
    randomDate.lastDateTime=startDate.getTime
    randomDate
  }


  class RandomDate{
    var lastDateTime =0L
    var maxTimeStep=0L

    def  getRandomDate()={
      val timeStep = new Random().nextInt(maxTimeStep.toInt)
      lastDateTime = lastDateTime+timeStep

      new Date( lastDateTime)
    }
  }
}
