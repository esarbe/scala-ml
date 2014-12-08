package com.example


object HMM extends App {
  val states = Set('rainy, 'sunny)
  
  val observations = Set('walk, 'shop, 'clean)
  
  val startProbabilities = Set('rainy -> 0.6, 'sunny -> 0.4)
  
  val transitionProbabilities = Map(
    'rainy -> Map ('rainy -> 0.7, 'sunny -> 0.3),
    'sunny -> Map ('rainy -> 0.4, 'sunny -> 0.6)
  )
  
  val emissionProbabilities = Map(
    'rainy -> Map('walk -> 0.1, 'shop -> 0.4, 'clean -> 0.5)
    'sunny -> Map('walk -> 0.6, 'shop -> 0.3, 'clean -> 0.1)
  )
}
