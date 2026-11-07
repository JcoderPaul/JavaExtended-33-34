- [Class Matcher](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Matcher.html)

---
### Class Matcher - Сопоставитель

**Пакет:** [java.util.regex](https://docs.oracle.com/javase/8/docs/api/java/util/regex/package-summary.html)

```
java.lang.Object
  java.util.regex.Matcher
```

**Все реализованные интерфейсы:** [MatchResult](https://docs.oracle.com/javase/8/docs/api/java/util/regex/MatchResult.html)

```java
public final class Matcher
  extends Object
    implements MatchResult
```

Механизм, который выполняет операции сопоставления [последовательности символов - CharSequence](https://docs.oracle.com/javase/8/docs/api/java/lang/CharSequence.html),
интерпретируя [шаблон - Pattern](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html). Сопоставитель - matcher создается из шаблона путем вызова
[метода сопоставления](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html#matcher-java.lang.CharSequence-) шаблона. После создания сопоставитель 
может использоваться для выполнения трех различных операций сопоставления:
- [метод *.matches()](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Matcher.html#matches--) - пытается сопоставить всю входную последовательность с шаблоном;
- [метод *.lookingAt()](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Matcher.html#lookingAt--) - пытается сопоставить входную последовательность, начиная с самого начала, с шаблоном.
- [метод *.find()](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Matcher.html#find--) - сканирует входную последовательность в поисках следующей подпоследовательности, соответствующей шаблону.

Каждый из этих методов возвращает логическое значение, указывающее на успех или неудачу.
Дополнительную информацию об успешном совпадении можно получить, запросив состояние
сопоставителя - matcher.

Сопоставитель находит совпадения в подмножестве своих входных данных, называемом region. По умолчанию region содержит все входные данные сопоставителя. Область можно изменить с
помощью [метода *.region()](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Matcher.html#region-int-int-) и запросить с помощью 
[методов *.regionStart()](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Matcher.html#regionStart--) и 
[*.regionEnd()](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Matcher.html#regionEnd--).
Способ взаимодействия границ области с некоторыми конструкциями шаблона может быть изменен. Дополнительные сведения см. методы 
[useAnchoringBounds](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Matcher.html#useAnchoringBounds-boolean-) и 
[useTransparentBounds](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Matcher.html#useTransparentBounds-boolean-).

Данный класс также определяет методы замены совпадающих подпоследовательностей новыми строками, содержимое которых при желании можно вычислить из результата сопоставления.
Методы [*.appendReplacement()](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Matcher.html#appendReplacement-java.lang.StringBuffer-java.lang.String-) и 
[*.appendTail()](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Matcher.html#appendTail-java.lang.StringBuffer-) можно использовать в тандеме, чтобы собрать
результат в существующий строковый буфер, или можно использовать более удобный метод [*.replaceAll()](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Matcher.html#replaceAll-java.lang.String-) 
для создания строки, в которой заменяется каждая совпадающая подпоследовательность во входной последовательности.

Явное состояние сопоставителя - matcher включает начальный и конечный индексы самого последнего успешного совпадения. Он также включает начальный и конечный индексы входной
подпоследовательности, захваченной [каждой группой захвата](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html#cg) в шаблоне, а также общее количество 
таких подпоследовательностей. Для удобства также предусмотрены методы для возврата этих захваченных подпоследовательностей в строковой форме.

Явное состояние сопоставителя изначально не определено; попытка запросить любую его часть до успешного совпадения вызовет исключение [IllegalStateException](https://docs.oracle.com/javase/8/docs/api/java/lang/IllegalStateException.html). Явное состояние сопоставителя вычисляется заново при каждой операции 
сопоставления.

Неявное состояние сопоставителя включает в себя последовательность входных символов, а также позицию добавления, которая изначально равна нулю и обновляется методом 
[*.appendReplacement()](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Matcher.html#appendReplacement-java.lang.StringBuffer-java.lang.String-).

Сопоставитель может быть сброшен явным образом, вызвав его [метод reset()](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Matcher.html#reset--) или, если 
требуется новая входная последовательность, его [метод reset(CharSequence)](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Matcher.html#reset-java.lang.CharSequence-). 
Сброс сопоставителя отбрасывает его явную информацию о состоянии и устанавливает позицию добавления в ноль.

Экземпляры этого класса небезопасны для использования несколькими параллельными потоками.

**Методы класса Matcher:**

- `Matcher appendReplacement(StringBuffer sb, String replacement)` - реализует неокончательный шаг добавления и замены.
- `StringBuffer appendTail(StringBuffer sb)` - реализует окончательный шаг добавления и замены.
- `int end()` - возвращает смещение после совпадения последнего символа.
- `int end(int group)` - возвращает смещение после последнего символа подпоследовательности, захваченной данной группой во время предыдущей операции сопоставления.
- `boolean find()` - пытается найти следующую подпоследовательность входной последовательности, соответствующую шаблону.
- `boolean find(int start)` - сбрасывает этот сопоставитель, а затем пытается найти следующую подпоследовательность входной последовательности, которая соответствует шаблону, начиная с указанного индекса.
- `String group()` - возвращает входную подпоследовательность, соответствующую предыдущему совпадению.
- `String group(int group)` - возвращает входную подпоследовательность, захваченную данной группой во время предыдущей операции сопоставления.
- `String group(String name)` - возвращает входную подпоследовательность, захваченную данной группой именованного захвата во время предыдущей операции сопоставления.
- `int groupCount()` - возвращает количество групп захвата в шаблоне этого сопоставления.
- `boolean hasAnchoringBounds()` - запрашивает привязку границ region для текущего сопоставителя.
- `boolean hasTransparentBounds()` - Запрашивает прозрачность границ region для текущего сопоставителя.
- `boolean hitEnd()` - возвращает true, если конец ввода был обнаружен поисковой системой в последней операции сопоставления, выполненной этим сопоставителем.
- `boolean lookingAt()` - пытается сопоставить входную последовательность, начиная с начала region, с шаблоном.
- `boolean matches()` - пытается сопоставить всю область с шаблоном.
- `Pattern pattern()` - возвращает шаблон, который интерпретируется этим сопоставителем.
- `static String	quoteReplacement(String s)` - возвращает буквальную замену String для указанной строки.
- `Matcher region(int start, int end)` - устанавливает пределы области текущего сопоставления.
- `int regionEnd()` - сообщает конечный индекс (эксклюзивный) области текущего сопоставления.
- `int regionStart()` - сообщает начальный индекс региона текущего сопоставления.
- `String replaceAll(String replacement)` - заменяет каждую подпоследовательность входной последовательности, которая соответствует шаблону, заданной строкой замены.
- `String replaceFirst(String replacement)` - Заменяет первую подпоследовательность входной последовательности, которая соответствует шаблону, заданной строкой замены.
- `boolean requireEnd()` - возвращает true, если дополнительные входные данные могут изменить положительное совпадение на отрицательное.
- `Matcher reset()` - сбрасывает текущий сопоставитель.
- `Matcher reset(CharSequence input)` - сбрасывает текущий сопоставитель с новой входной последовательностью.
- `int start()` - возвращает начальный индекс предыдущего совпадения.
- `int start(int group)` - возвращает начальный индекс подпоследовательности, захваченной данной группой во время предыдущей операции сопоставления.
- `MatchResult toMatchResult()` - возвращает состояние совпадения этого сопоставителя в виде MatchResult.
- `String toString()` - возвращает строковое представление этого сопоставления.
- `Matcher useAnchoringBounds(boolean b)` - устанавливает привязку границ региона для этого сопоставителя.
- `Matcher usePattern(Pattern newPattern)` - Изменяет Pattern, который текущий Matcher использует для поиска совпадений.
- `Matcher useTransparentBounds(boolean b)` - устанавливает прозрачность границ области для этого сопоставителя.

---
**Доп. материал:**
- [Class Matcher](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Matcher.html)
- [Interface MatchResult](https://docs.oracle.com/javase/8/docs/api/java/util/regex/MatchResult.html)
- [Class Pattern](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html)
- [Interface CharSequence](https://docs.oracle.com/javase/8/docs/api/java/lang/CharSequence.html)

---
- [Matcher Class in Java](https://www.geeksforgeeks.org/java/matcher-class-in-java/)
- [Java Matcher Class](https://zetcode.com/java/regex-matcher-class/)
- [Java Matcher Class](https://www.scaler.com/topics/java-matcher/)
- [Java Regex - Matcher](https://codegym.cc/groups/posts/java-regex-matcher)
- [The Matcher Class **(by dev.java)**](https://dev.java/learn/api/date-time-regex/regex/matchers/)
- [Difference Between Java Matcher `find()` and `matches()` **(by baeldung.com)**](https://www.baeldung.com/java-matcher-find-vs-matches)
- [The Java™ Tutorials - Methods of the Matcher Class **(by ORACLE)**](https://docs.oracle.com/javase/tutorial/essential/regex/matcher.html)
- [The Java™ Tutorials - Regular Expressions **(by ORACLE)**](https://docs.oracle.com/javase/tutorial/essential/regex/index.html)
- [Get the Indexes of Regex Pattern Matches in Java **(by baeldung.com)**](https://www.baeldung.com/java-indexes-regex-pattern-matches)
- [Regular Expressions in Java](https://medium.com/@kaustubh.saha/regular-expressions-in-java-b806152aaa93)
- [Matcher `matches()` method in Java with Examples](https://www.geeksforgeeks.org/java/matcher-matches-method-in-java-with-examples/)
- [Pattern Matching in Java: The Modern Way to Write Cleaner Code](https://dev.to/anand_jaisy_2f7644a12001b/pattern-matching-in-java-the-modern-way-to-write-cleaner-code-8gc)
- [Java Regex - Matcher **(by jenkov.com)**](https://jenkov.com/tutorials/java-regex/matcher.html)
- [Pattern Matching in Java – 5 Examples for Busy Developers](https://blog.jetbrains.com/idea/2023/02/pattern-matching-in-java-5-examples-for-busy-developers/)
- [Java Regex - Matcher Class](https://www.tutorialspoint.com/javaregex/javaregex_matcher.htm)
- [Java Regular Expressions (Regex) Cheat Sheet](https://www.jrebel.com/blog/java-regular-expressions-cheat-sheet)
- [Java Matcher](https://www.educba.com/java-matcher/)
