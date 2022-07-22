--CREATE TABLE ACTIVE_CHAT (id serial primary key not null, chat_id integer not null);
--create table incomes (id serial primary key not null, chat_id integer not null, income numeric);
--create table spend (id serial primary key not null, chat_id integer not null, spend numeric);
INSERT INTO active_chat (id, chat_id) VALUES (1, '1001L');
INSERT INTO incomes (id, chat_id, incomes) VALUES (1, '1001L', 203);
INSERT INTO spends (id, chat_id, spend) VALUES (1, '1001L', 25);
SELECT * FROM ACTIVE_CHAT;
SELECT * FROM incomes;
SELECT * FROM spend;