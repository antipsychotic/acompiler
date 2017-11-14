package com.nitrograph.acompiler.syntax.shared

sealed trait PureList[Element]

object PureList {
  class Empty[Element]
    extends PureList[Element]

  case class NonEmpty[Element](
    head: Element,
    tail: PureList[Element]
  ) extends PureList[Element]
}
