package com.nitrograph.acompiler.syntax.shared

case class InfixList[
  Operand,
  InfixOperation
](
  head: Operand,
  tail: List[InfixList.OperandPair[Operand, InfixOperation]]
)

/*
  class TypeClass[+TypeParameter}
  class AbstractNumber
  class RealNumber extends AbstractNumber
  TypeClass[RealNumber] <: TypeClass[AbstractNumber]
  class ContrVariantTypeClass[-TypeParameter]
  TypeClass[RealNumber] >: TypeClass[AbstractNumber]

  case class HigherKindedCollection(
    aParameter: TypeClass[AbstractNumber]
  )
*/

object InfixList {
  case class OperandPair[
    Operand,
    InfixOperation
  ](
    operand: Operand,
    operation: InfixOperation
  )
}