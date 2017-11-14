package com.nitrograph.acompiler.syntax.ast.equation.term.factor

import com.nitrograph.acompiler.syntax.shared._

object Factor {
  type Multiplication = "*"

  type Division = "/"

  type Operation = Multiplication | Division
}

case class Number(digits: PureList.NonEmpty[Digit])

