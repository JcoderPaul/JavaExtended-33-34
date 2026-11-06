### Регулярные выражения - **REG**ular **EX**pressions

[Пакет java.util.regex](https://docs.oracle.com/javase/8/docs/api/java/util/regex/package-summary.html) предоставляет классы и методы, которые сопоставляют регулярные
выражения с шаблоном. Регулярные выражения представляют собой особую последовательность символов, позволяющую нам сопоставить или выявить другие строки либо их набор, 
опираясь на специализированный синтаксис в качестве шаблона.

Регулярные выражения могут быть использованы для поиска, редактирования либо манипулирования текстом и данными, например, при помощи регулярных выражений можно задать 
шаблоны, позволяющие:
- найти все последовательности символов «мыш» в любом контексте, как то: «мыш», «мышеловка», «мышление»;
- найти отдельно стоящее слово «лот» и заменить его на «кашалот»;
- найти слово «ковер», которому предшествует слово «персидский» или «индийский»;
- убрать из текста все предложения, в которых упоминается некое слово, например «война».

Регулярные выражения позволяют задавать и гораздо более сложные шаблоны поиска или замены.

**Результатом работы с регулярным выражением может быть:**
- проверка наличия искомого образца в заданном тексте;
- определение подстроки текста, которая сопоставляется образцу;
- определение групп символов, соответствующих отдельным частям образца.

Если регулярное выражение используется для замены текста, то результатом работы может быть новая текстовая строка, представляющая собой исходный текст, из которого удалены 
найденные подстроки (сопоставленные образцу, регулярному выражению), а вместо них подставлены строки замены (возможно, модифицированные запомненными при разборе группами 
символов из исходного текста). Частным случаем модификации текста является удаление всех вхождений найденного образца — для чего строка замены указывается пустой.

**Если просто, то регулярное выражение (RegEx) – это шаблон для поиска строки в тексте.** В Java исходным представлением этого шаблона всегда является строка, то есть объект 
класса String. Однако не любая строка может быть скомпилирована в регулярное выражение, а только та, которая соответствует правилам написания регулярного выражения – синтаксису, 
определенному в спецификации языка.

Для написания регулярного выражения используются буквенные и цифровые символы, а также метасимволы – символы, имеющие специальное значение в синтаксисе регулярных выражений.

[Пакет java.util.regex](https://docs.oracle.com/javase/8/docs/api/java/util/regex/package-summary.html) исходно состоит из следующих трех классов:
- [Pattern Class](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html) – объект класса Pattern представляет скомпилированное представление регулярного
выражения. В классе Pattern публичный конструктор не предусмотрен. Для создания шаблона, нам необходимо вызвать один из представленных публичных статичных методов compile(),
который далее произведет возврат объекта класса Pattern. Регулярное выражение в данных методах принимается как первый аргумент.

- [Matcher Class](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Matcher.html) – объект класса Matcher представляет механизм, который интерпретирует шаблон, а
также производит операции сопоставления с вводимой строкой. Аналогично классу Pattern, Matcher не содержит публичных конструкторов. Объект класса Matcher может быть получен
путем вызова метода matcher() на объекте класса Pattern.

- [PatternSyntaxException](https://docs.oracle.com/javase/8/docs/api/java/util/regex/PatternSyntaxException.html) – объект класса PatternSyntaxException представляет непроверяемое
исключение, которое обозначает синтаксическую ошибку в шаблоне регулярного выражения.

---
**Примеры использования RegEx:**
- [Less_33_RegEx_Step1](./Less_33_RegEx_Step1.java) - Простая жестко фиксированная последовательность символов.
- [Less_33_RegEx_Step2](./Less_33_RegEx_Step2.java) - Пример на: `[C-F]` - любой символ из диапазона между С и F.
- [Less_33_RegEx_Step3](./Less_33_RegEx_Step3.java) - Пример на: `[^C-F]` - любой символ НО НЕ ИЗ диапазона от C до F (т.е. один любой символ, но **ТОЛЬКО НЕ** `C` **НЕ** `D` **НЕ** `F`)
- [Less_33_RegEx_Step4](./Less_33_RegEx_Step4.java) - Пример на: `[e-j3-6]` - любой символ из диапазона от e до j или от 3 до 6 (т.е. один символ или e или f или g или h или i или j или 3 или 4 или 5 или 6)
- [Less_33_RegEx_Step5](./Less_33_RegEx_Step5.java) - Пример на: `^` - начало строки.
- [Less_33_RegEx_Step6](./Less_33_RegEx_Step6.java) - Пример на: `$` - конец строки.
- [Less_33_RegEx_Step7](./Less_33_RegEx_Step7.java) - Пример на: `[0-9]` равносильно `\d` - любой цифровой символ.
- [Less_33_RegEx_Step8](./Less_33_RegEx_Step8.java) - Пример на: `.` - любой символ или буква или цифра.
- [Less_33_RegEx_Step9](./Less_33_RegEx_Step9.java) - Пример на: `\D` - любой **НЕ** цифровой символ, равносилен `[^0-9]`. При это **ЛЮБОЙ** символ означает, и знак препинания и другой символ.
- [Less_33_RegEx_Step10](./Less_33_RegEx_Step10.java) - Пример метасимвола: `\w` - цифровой символ, буквенный и `_`, равносилен набору `[a-zA-Z_0-9]` Пробел, знаки препинания и другие символы сюда не входят.
- [Less_33_RegEx_Step11](./Less_33_RegEx_Step11.java) - Пример метасимвола: `\W` - **НЕ** цифровой символ, **НЕ** буквенный и **НЕ** `_`, равносилен набору `[^a-zA-Z_0-9]` или `[^\w]` , т.е. выбираем пробел, знаки препинания и другие символы.
- [Less_33_RegEx_Step12](./Less_33_RegEx_Step12.java) - Пример на: `[ABC]` - или A или B или C (простой класс), выбор любого символа из набора.

---
**Доп. материалы:**
- [Class Matcher](./MatcherClass.md)
- [Class Pattern](./PatternClass.md)
- [Конструкции RegEx](./RegExСonstructs.md)

---
- [The Java™ Tutorials - Regular Expressions **(by ORACLE)**](https://docs.oracle.com/javase/tutorial/essential/regex/)
- [Java Language and Virtual Machine Specifications **(by ORACLE)**](https://docs.oracle.com/javase/specs/)
- [About the Unicode® Standard **(from unicode.org)**](https://www.unicode.org/standard/standard.html)
- [Unicode® Technical Standard #18 - Unicode Regular Expressions **(from unicode.org)**](https://www.unicode.org/reports/tr18/)

---
- [Java Regular Expression Tutorial with Examples](https://www.javacodegeeks.com/2012/11/java-regular-expression-tutorial-with-examples.html)
- [Guide to Regular Expressions in Java](https://stackabuse.com/guide-to-regular-expressions-in-java/)
- [Mastering Regex in Java: A Developer's Essential Guide](https://dev.to/gadekar_sachin/-mastering-regex-in-java-a-developers-essential-guide-994)
- [Регулярные выражения в Java (RegEx)](https://javarush.com/groups/posts/regulyarnye-vyrazheniya-v-java)
- [Regular Expression in Java: Regex Examples & Tutorial](https://www.digitalocean.com/community/tutorials/regular-expression-in-java-regex-example)
- [Java Programming Tutorial - Regular Expression (Regex) in Java](https://www3.ntu.edu.sg/home/ehchua/programming/java/Java_Regexe.html)
- [Java Regular Expression Tutorial](https://mkyong.com/tutorials/java-regular-expression-tutorials/)
- [Java - Regular Expressions](https://www.tutorialspoint.com/java/java_regular_expressions.htm)
- [Java Regex Tutorial: Pattern, Matcher and All Examples](https://howtodoinjava.com/java-regular-expression-tutorials/)
- [Java Regular Expressions (java regex) Tutorial with examples](https://beginnersbook.com/2014/08/java-regex-tutorial/)
