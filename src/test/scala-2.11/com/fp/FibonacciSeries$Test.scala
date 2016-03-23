package com.fp

import org.scalatest.FunSuite

/**
 * Created by ranjithrajd on 15/2/16.
 */
class FibonacciSeries$Test extends FunSuite {
  test("success"){
    assert(FibonacciSeries.fibonacci(3)==1)
  }
}
