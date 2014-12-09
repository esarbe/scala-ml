package com.example

object HMM extends App {
  trait State
  
  case object Rainy extends State
  case object Sunny extends State
  
  trait Observation
  case object Walk extends Observation
  case object Shop extends Observation
  case object Clean extends Observation
  
  
  val states = Set(Rainy, Sunny)
  
  val observations = Set(Walk, Shop, Clean)
  
  val startProbabilities = Set(Rainy -> 0.6, Sunny -> 0.4)
  
  val transitionProbabilities = Map(
    Rainy -> Map (Rainy -> 0.7, Sunny -> 0.3),
    Sunny -> Map (Rainy -> 0.4, Sunny -> 0.6)
  )
  
  val emissionProbabilities = Map(
    Rainy -> Map(Walk -> 0.1, Shop -> 0.4, Clean -> 0.5)
    Sunny -> Map(Walk -> 0.6, Shop -> 0.3, Clean -> 0.1)
  )
  
  val steps = 200
  
  def nextState(current: State): State = {
    
  }
  
  def nextEmission(state: State): 
  
  for { 
    step <- (0 upto steps)
  } yield {
    
  } 
  
}
