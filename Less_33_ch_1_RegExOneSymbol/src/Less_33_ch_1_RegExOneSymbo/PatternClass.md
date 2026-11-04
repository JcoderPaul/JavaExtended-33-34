- [Class Pattern](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html)

### Class Pattern - Класс Паттерн

```
java.lang.Object
 java.util.regex.Pattern
```

**Пакет:** [java.util.regex](https://docs.oracle.com/javase/8/docs/api/java/util/regex/package-summary.html)

**Все реализованные интерфейсы:** [Interface Serializable](https://docs.oracle.com/javase/8/docs/api/java/io/Serializable.html)

```java
public final class Pattern
 extends Object
  implements Serializable
```

Скомпилированное представление регулярного выражения.

Регулярное выражение, указанное в виде строки, должно быть сначала скомпилировано в экземпляр [класса Pattern](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html). 
Полученный шаблон можно затем использовать для создания [объекта Matcher](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Matcher.html), который может сопоставлять произвольные 
[последовательности символов](https://docs.oracle.com/javase/8/docs/api/java/lang/CharSequence.html) с регулярным выражением. Все состояние, связанное с выполнением сопоставления,
находится в 'сопоставителе' - matcher, поэтому многие сопоставители могут использовать один и тот же шаблон.

Типичная последовательность вызова:

```java
 Pattern patternOfMine = Pattern.compile("a*b");
 Matcher myMatcherFor = patternOfMine.matcher("aaaaab");
 boolean thereIsMatch = myMatcherFor.matches();
```

У класса Pattern определен [метод *.matches()](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html#matches-java.lang.String-java.lang.CharSequence-). Он удобен тем, 
что когда регулярное выражение используется нами только один раз. Этот метод компилирует выражение и сопоставляет с ним входную последовательность за один вызов. Пример:

```java
 boolean thereIsMatch = Pattern.matches("a*b", "aaaaab");
```

Одна строка эквивалентна трем строкам кода приведенным выше, хотя для повторяющихся совпадений такой синтаксис менее эффективен, поскольку не позволяет повторно использовать
скомпилированный шаблон.

**Особенности в многопоточности:**
- экземпляры [класса Pattern](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html) неизменяемы и безопасны для использования несколькими параллельными потоками;
- экземпляры [класса Matcher](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Matcher.html) небезопасны при использовании в многопоточных структурах.

**Методы класса Pattern:**
- `static Pattern compile(String regex)` - компилирует заданное регулярное выражение в шаблон, где regex- выражение для компиляции;
- `String toString()` - возвращает строковое представление regex шаблона;
- `static Pattern compile(String regex, int flags)` - компилирует данное регулярное выражение в шаблон с заданными флагами, regex- выражение для компиляции, flags- флаги соответствия, битовая маска, которая может включать [CASE_INSENSITIVE](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html#CASE_INSENSITIVE),
[MULTILINE](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html#MULTILINE),
[DOTALL](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html#DOTALL),
[UNICODE_CASE](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html#UNICODE_CASE),
[CANON_EQ](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html#CANON_EQ),
[UNIX_LINES](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html#UNIX_LINES),
[LITERAL](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html#LITERAL),
[UNICODE_CHARACTER_CLASS](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html#UNICODE_CHARACTER_CLASS),
[COMMENTS](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html#COMMENTS);
- `int flags()` - возвращает флаги соответствия этого шаблона;
- `String pattern()` - возвращает регулярное выражение, из которого был скомпилирован текущий шаблон;
- `static String	quote(String s)` - возвращает литеральную строку шаблона для указанной строки String s. Этот метод создает строку, которую можно использовать для генерации шаблона, который в свою очередь будет соответствовать String s, как если бы это был буквальный шаблон. Метасимволы или управляющие последовательности во входной последовательности не будут иметь специального значения;
- `Matcher matcher(CharSequence input)` - создает 'сопоставитель - matcher', который будет сопоставлять заданный ввод с этим 'шаблоном - pattern', где input- последовательность символов, которая должна быть сопоставлена;

--- 
- `static boolean matches(String regex, CharSequence input)` - компилирует данное 'регулярное выражение - regex' и пытается сопоставить с ним заданный 'ввод - input'. Где regex - выражение для компиляции, input - последовательность символов, которая должна быть сопоставлена.

  **Вызов:** `Pattern.matches(regex, input);`
  
  **Работает точно так же, как выражение:** `Pattern.compile(regex).matcher(input).matches()`

--- 
- `String[] split(CharSequence input)` - разбивает заданную входную последовательность на совпадения с regex шаблоном (шаблон как разделитель), где input- последовательность символов, которая будет разделена. Возвращается массив строк, вычисленный путем разделения входных данных на совпадения с текущим шаблоном.

  Пример, на входе метода `*.split()` `input = "boo:and:foo"`:

| Regex | Result                  |
|-------|-------------------------|
| :     | { "boo", "and", "foo" } |
| o     | { "b", "", ":and:f" }   |

---  
- `String[] split(CharSequence input, int limit)` - разбивает заданную входную последовательность на совпадения с regex шаблоном (шаблон как разделитель) с использованием предела limit.

  Где параметры:
    - `input` - последовательность символов, которая будет разделена;
    - `limit` - Порог результата, как описано выше;
  
  Метод возвращает: массив строк, вычисленный путем разделения входных данных на совпадения с текущим шаблоном.

  Пример, на входе метода `*.split()` `input = "boo:and:foo"`:
  
| Regex | Limit | Result                        |
|-------|-------|-------------------------------|
| :     | 2     | { "boo", "and:foo" }          |
| :     | 5     | { "boo", "and", "foo" }       |
| :     | -2    | { "boo", "and", "foo" }       |
| o     | 5     | { "b", "", ":and:f", "", "" } |
| o     | -2    | { "b", "", ":and:f", "", "" } |
| o     | 0     | { "b", "", ":and:f" }         |

---
**Доп. материалы:**
- [Class Pattern](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html)
- [Class Matcher](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Matcher.html)
- [Interface CharSequence](https://docs.oracle.com/javase/8/docs/api/java/lang/CharSequence.html)
- [The Java™ Tutorials - Methods of the Pattern Class **(by ORACLE)**](https://docs.oracle.com/javase/tutorial/essential/regex/pattern.html)
- [The Java™ Tutorials - Regular Expressions **(by ORACLE)**](https://docs.oracle.com/javase/tutorial/essential/regex/index.html)

--- 
- [JDK 27 Documentation](https://docs.oracle.com/en/java/javase/27/index.html)
- [Java Pattern Class](https://www.geeksforgeeks.org/java/pattern-class-in-java/)
- [Java Pattern `pattern()` Method](https://www.geeksforgeeks.org/java/pattern-pattern-method-in-java-with-examples/)
- [Java Regular Expressions](https://www.w3schools.com/java/java_regex.asp)
- [Java Pattern Class](https://zetcode.com/java/regex-pattern-class/)
- [Java Regular Expression (Java Regex) with Examples](https://data-flair.training/blogs/java-regular-expression/)
- [The Pattern Class](https://dev.java/learn/api/date-time-regex/regex/patterns/)
- [Regex Character Classes in Java](https://www.geeksforgeeks.org/java/regex-character-cases-in-java/)
- [Regular expressions in Java](https://codegym.cc/groups/posts/regex-java)
