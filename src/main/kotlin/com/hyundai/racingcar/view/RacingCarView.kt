package com.hyundai.racingcar.view

class RacingCarView {
    fun enterNames():String {
        println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)")
        return readln()
    }
}