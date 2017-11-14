package com.nitrograph.acompiler.syntax.equation.term

import com.nitrograph.acompiler.syntax.shared._
import com.nitrograph.acompiler.syntax.equation.term.factor._

case class Term(
  factors: InfixList[Factor, Factor.Operation]
)

object Term {
  type Plus = "+"

  type Minus = "-"

  type Operation = Plus | Minus
}