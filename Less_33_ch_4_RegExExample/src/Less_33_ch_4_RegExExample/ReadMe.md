### Практические примеры использования RexEx

**[Less_33_Example_CorrectIP](./Less_33_Example_CorrectIP.java)** 

Определить попадает ли введенный IP в требуемый диапазон 0-255.0-255.0-255.0-255

---
**[Less_33_Example_EmailSet](./Less_33_Example_EmailSet.java)**

Вводим с клавиатуры сочетание "команда + электронный адрес" через пробел, либо просто команда:
- DELL - удалить элемент коллекции;
- ADD - добавить оригинальный элемент в коллекцию;
- LIST - вывести список электронных адресов на экран;
- EXIT - выйти из программы.

Адрес электронной почты должен проверяться на оригинальность и сохранятся в некой коллекции. 
Три команды DELL, ADD, LIST - должны имитировать минимальное управление элементами коллекции.

---
**[Less_33_Example_GetMoneyAndSum](./Less_33_Example_GetMoneyAndSum.java)**

Из простой строки содержащей текст и цифры, извлечь цифровые значения и найти их сумму.

Пример использования методов класса Matcher:
- `*.start()`;
- `*.end()`;
- `*.find()`.

---
**[Less_33_Example_NotSplitDivide](./Less_33_Example_NotSplitDivide.java)**

Не используя метод `*.split()` разделить строку на слова и цифры, данные вывести на экран. 
Воспользоваться методом `*.end()`.

---
**[Less_33_Example_ParsingMainApp](./Less_33_Example_ParsingMainApp.java)**

Программа предназначена для парсинга информации из файла формата `*.csv`, она не универсальна, 
в данном случае нужно выделить доходы и расходы из банковской выписки `movementList.csv` и 
распределить расходы по компаниям оказывающим услуги.

---
**[Less_33_Example_StrRegExReplacement](./Less_33_Example_StrRegExReplacement.java)**

Пример замены элементов строки элементами коллекции Map. 

Пример работы методов:
- `*.group()`;
- `*.appendReplacement()`;
- `*.appendTail()`;

---
**[Less_33_Example_StrRegExRepShort](./Less_33_Example_StrRegExRepShort.java)**

Пример работы методов:
- `*.group()`;
- `*.appendReplacement()`;
- `*.appendTail()`;

Очень похож на Less_33_Example_StrRegExReplacement, но короче.

---
**[Less_33_Example_TotalCosts](./Less_33_Example_TotalCosts.java)**

Имитация парсинга списка покупок. Имеется входящая строка из списка покупок, с разделителем между 
покупками знаком точка с запятой. (количество товара, название товара, цена;) Найти итоговые затраты 
на покупки.

Пример работы с методами `*.split()` и `*.parseDouble()`.

---
**Доп. материал:**
- [Java Matcher pattern() Method **(from geeksforgeeks.org)**](https://www.geeksforgeeks.org/java/matcher-pattern-method-in-java-with-examples/)
- [Matcher group() method in Java with Examples **(from geeksforgeeks.org)**](https://www.geeksforgeeks.org/java/matcher-group-method-in-java-with-examples/)
- [Matcher find() method in Java with Examples **(from geeksforgeeks.org)**](https://www.geeksforgeeks.org/java/matcher-find-method-in-java-with-examples/)
- [String matches() Method in Java with Examples **(from geeksforgeeks.org)**](https://www.geeksforgeeks.org/java/string-matches-method-in-java-with-examples/)
- [Pattern compile(String) method in Java with Examples **(from geeksforgeeks.org)**](https://www.geeksforgeeks.org/java/pattern-compilestring-method-in-java-with-examples/)
- [Java Pattern.matches Method **(from zetcode.com)**](https://zetcode.com/java/regex-pattern-matches-method/)
- [Java Pattern.compile Method **(from zetcode.com)**](https://zetcode.com/java/regex-pattern-compile-method/)
- [Java Pattern.matcher Method **(from zetcode.com)**](https://zetcode.com/java/regex-pattern-matcher-method/)
- [Java Matcher.find Method **(from zetcode.com)**](https://zetcode.com/java/regex-matcher-find-method/)
- [Using Pattern Matching](https://dev.java/learn/language/fp/pattern-matching/)
- [Pre-compile Regex Patterns Into Pattern Objects](https://www.baeldung.com/java-regex-pre-compile)
- [What does Matcher.find() really do?](https://stackoverflow.com/questions/76608562/what-does-matcher-find-really-do)
- [Pattern.matcher() vs pattern.matches()](https://stackoverflow.com/questions/3862917/pattern-matcher-vs-pattern-matches)
- [Matching patterns with Java](https://www.javacodegeeks.com/2019/12/matching-patterns-with-java.html)
- [java.util.regex.Matcher.find() Method](https://www.tutorialspoint.com/javaregex/javaregex_matcher_find1.htm)

---
[Еще больше статей от **Sera Ng.** (from Medium.com)](https://medium.com/@seranguyen):
- [Java RegEx: Part 1 — Introduction](https://medium.com/stackera/java-regex-part-1-introduction-34d6a12ede8d)
- [Java RegEx: Part 2 — Matching text for validation (Cont.)](https://medium.com/stackera/java-regex-part-2-matching-text-for-validation-cont-751bec6bd5ee)
- [Java RegEx: Part 3 — Matching text for validation (Cont.)](https://medium.com/stackera/java-regex-part-3-matching-text-for-validation-cont-cfd917e5411e)
- [Java RegEx: Part 4 — Replacing and Extracting Text](https://medium.com/stackera/java-regex-part-4-replacing-and-extracting-text-6eecdbf7f5e8)
- [Java RegEx: Part 5 — matches(), lookingAt(), find()](https://medium.com/stackera/java-regex-part-5-matches-lookingat-find-8033fa9cdebc)
- [Java RegEx: Part 6 — Group and Subgroup](https://medium.com/stackera/java-regex-part-6-group-and-subgroup-2985dc2d42d4)
- [Java RegEx: Part 7 — Boundary Matcher](https://medium.com/stackera/java-regex-part-7-boundary-matcher-966de0450748)
- [Java RegEx: Part 8 — Backreferences](https://medium.com/stackera/java-regex-part-8-backreferences-b82d7d6c9d37)
- [Java RegEx: Part 9 — Look-Ahead](https://medium.com/stackera/java-regex-part-9-look-ahead-f999f6d0d7b1)
- [Java RegEx: Part 10 — Look-Behind](https://medium.com/stackera/java-regex-part-10-look-behind-ff94525a84e)
- [Java RegEx: Part 11 — Reluctant (Non-greedy) Quantifiers](https://medium.com/stackera/java-regex-part-11-reluctant-non-greedy-quantifiers-8075168a77c2)
- [Java RegEx: Part 12 — Possessive Quantifiers](https://medium.com/stackera/java-regex-part-12-possessive-quantifiers-31b6135a8f28)
