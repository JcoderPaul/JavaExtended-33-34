- [Class Matcher](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Matcher.html)
- [Class Pattern](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html)

---
**Задача:** 
Представить номер банковской карты с датой и cvv в удобном (красивом) виде, например:
- было -> 12341223123412340411543
- стало -> 04/11 1234 1223 1234 1234 (543)

Примеры работы методов класса Matcher:
- [*.replaceAll()](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Matcher.html#replaceAll-java.lang.String-);
- [*.reset()](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Matcher.html#reset--);
- [*.group(number group)](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Matcher.html#group--);

**См. пример:**
- [Less_33_RegExGroupNumber_Step1](./Less_33_RegExGroupNumber_Step1.java)
