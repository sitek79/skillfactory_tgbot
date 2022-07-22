Модуль 36. Hibernate  
ПРАКТИЧЕСКОЕ ЗАДАНИЕ (HW-03)  
В рамках Телеграм-бота, который мы начали разрабатывать в 34 модуле, необходимо реализовать следующее:

- Добавить в тестовые ресурсы, то есть в src/test/resources, два файла: application.properties и data.sql.
- Добавить в файл application.properties свойства, которые сообщают Spring Boot о том, что необходимо выполнить SQL-скрипты из data.sql.
- Добавить в файл data.sql данные для проведения тестов.
- Убедиться в том, что все тесты проходят корректно.4

-- https://github.com/SkillfactoryCoding/JAVA-Spring-skillfactory_bot  
1. https://start.spring.io/
![img.png](img.png)  
2. Обращаемся к сайту ЦБР  
-- обращаемся сюда
http://www.cbr.ru/DailyInfoWebServ/DailyInfo.asmx?op=GetCursOnDate

http://www.cbr.ru/DailyInfoWebServ/DailyInfo.asmx
http://www.cbr.ru/DailyInfoWebServ/DailyInfo.asmx?WSDL
-- как проверить это Curl ?

3. Bot @Sitek79TGBot_bot
Зарегистрировать нашего бота у BotFather Телеграме и получить у него токен, который мы будем использовать.  
Bot  
-- Добавим в наш бот также новые команды
currentrates - текущие курсы валют
addincome - добавить доход
addspend - добавить расход
validate - Валидировать код
execute - Выполнить код
debug - Запустить дебаг режим
addincome - добавить доход
addspend - добавить расход

-- добавляем зависимость
```
<dependency>
<groupId>com.github.xabgesagtx</groupId>
<artifactId>telegram-spring-boot-starter</artifactId>
<version>0.26</version>
</dependency>
```
-- pom.xml должен выглядеть так:
https://github.com/SkillfactoryCoding/JAVA-Spring-skillfactory_bot/blob/master/pom.xml  

4. Создадим схему в БД tgbot
-- создадим таблицу ACTIVE_CHAT
```
CREATE TABLE ACTIVE_CHAT (id serial primary key not null, chat_id integer not null)
SELECT * FROM ACTIVE_CHAT;
```
-- Теперь создадим таблицы income и spendings, в которых будем хранить доходы и расходы пользователей:

````
--create table incomes (id serial primary key not null, chat_id integer not null, income numeric);
--create table spend (id serial primary key not null, chat_id integer not null, spend numeric);
--SELECT * FROM incomes;
--SELECT * FROM spend;
````