package com.nitrograph.acompiler.syntax.equation

import com.nitrograph.acompiler.syntax.shared._
import com.nitrograph.acompiler.syntax.equation.term._

case class Equation(
  terms: InfixList[Term, Term.Operation]
)
