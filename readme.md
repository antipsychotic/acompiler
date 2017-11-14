# ACompiler

## ALanguage

```
equation := expression
expression := term + expression | term - expression
term := factor * expression | factor / expression
factor := query | number | (expression)

query := id
number := digit | digit number
digit = 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9
```

Or, simplified:

```
equation := term [termOperation term]*
termOperation := '+' | '-'
term := factor [factorOperation factor]*
factorOperation := '*' | '/'

factor := number | id | '(' equation ')'
number := digit+
```
