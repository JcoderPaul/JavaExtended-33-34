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
### Примеры использования RegEx:

**[Less_33_RegExMultiSymbol_Step1](./Less_33_RegExMultiSymbol_Step1.java)**

**[Less_33_RegExMultiSymbol_Step2](./Less_33_RegExMultiSymbol_Step2.java)**
                                 
**Например применения квантификатора: `+` - некий символ один или несколько раз.:**
- `a+` - может означать любое количество букв `a` подряд `a, aa, aaa, aaaa` и т.д.
- `[0-9]+` - означает любое количество цифровых символов подряд `1, 12, 435, 646645` и т.д.
- `[A-Z]+` - означает любое количество больших букв подряд `B, BB, FDRJ, VDAEHG` и т.д.

---
**[Less_33_RegExMultiSymbol_Step3](./Less_33_RegExMultiSymbol_Step3.java)**
                                 
**Например применения квантификатора: `{n}` - n- символов подряд.:**
- `a{3}` - может означать 3-х кратное повторение буквы `a`, т.е. `aaa`
- `[0-9]{4}` - означает 4-х кратное повторение цифровых символов подряд `2341, 6412, 4375` и т.д.
- `[A-Z]{6}` - означает 6-и кратное повторение больших букв подряд `BDRFRT, BSSSSB, FDHHRJ` и т.д.

---
**[Less_33_RegExMultiSymbol_Step4](./Less_33_RegExMultiSymbol_Step4.java)**

**Например:**
- Найдем все буквенно-цифровые последоваетльности игнорируя знаки препинания;
- Найдем номера домов и квартир;

---
**[Less_33_RegExMultiSymbol_Step5](./Less_33_RegExMultiSymbol_Step5.java)**

**Например:**
- Найдем только телефоны, это + и девять цифр, т.е. `+[0-9]{9}`;
- Найти все емайлы, а это последовательность `\w+@\w+.(ru|com)` для примера ограничимся только зонами `RU` и `COM`;

---
**[Less_33_RegExMultiSymbol_Step6](./Less_33_RegExMultiSymbol_Step6.java)**

**Примеры работы с:**
- Пример 1 -> `\s` - пробельный символ или табуляция, перевод строки, конец страницы `[ \t\n\x0B\f\r]`;
- Пример 2 -> `X{n,m} - X`, не менее `n`, но не более `m` раз;
- Пример 3 и 4 -> `X{n,} - X`, не менее `n` раз;
- Пример 4 и 5 -> `(XYZ) - XYZ`, как захватывающая группа;

---
**[Less_33_RegExMultiSymbol_Step7](./Less_33_RegExMultiSymbol_Step7.java)**

**Примеры работы с:**
- Пример 1 -> `\X? - Х`, один раз или ни разу;
- Пример 2 -> `\X* - X`, ноль или более раз;
- Пример 3 -> `\A` - определенное начало последовательности (входящих данных);
- Пример 4 -> `\Z` - определенный конец вводящей последовательности, если он есть;

---
**Доп. материалы:**
- [Regular expression in java (java String) **(from stackoverflow.com)**](https://stackoverflow.com/questions/64593822/regular-expression-in-java-java-string)
- [Regular Expressions **(from kompf.de dlog)**](https://www.kompf.de/java/regex.html)
- [Regex for a Java Software Engineer](https://dev.to/joaomarques/regex-for-a-java-software-engineer-3np4)
- [Java Regex - Java Regular Expressions **(from jenkov.com)**](https://jenkov.com/tutorials/java-regex/index.html)
- [Java Regular Expression Examples](https://mkyong.com/java/java-regular-expression-examples/)
- [Regular Expressions in Java (Regex)](https://www.examclouds.com/java/java-core/java-regex)
- [JAVA - REGULAR EXPRESSIONS **(*.PDF)**](https://people.computing.clemson.edu/~yfeaste/cpsc215/cpsc2150F15/cpsc215Fall215/Notes/Tutorialspoint_webpages/16java_regular_expressions.pdf)
- [Regular Expressions in Java (Java Regex)](https://intellipaat.com/blog/regular-expressions-in-java-java-regex/)
- [Using Regular Expressions in Java **(from regexone.com)**](https://regexone.com/references/java)
- [Java Regular Expressions Tutorial with Examples](https://o7planning.org/10175/java-regular-expression)
- [Java Regex](https://regexregex.com/en/java-regex/)
- [Java Regular Expression (RegEx) Explained](https://www.golinuxcloud.com/java-regex-examples/)
- [Java Regex Tutorial With Regular Expression Examples](https://www.softwaretestinghelp.com/java-regex-tutorial/)
- [7 Easy Ways to Use Regular Expressions in Java ](https://www.wikitechy.com/regular-expressions-in-java/)
