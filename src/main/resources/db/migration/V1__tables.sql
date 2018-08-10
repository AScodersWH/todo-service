create table todo_list(
 id int primary key auto_increment,
 `text` varchar(255),
 visible boolean,
 editable boolean,
 timestamp datetime,
 deleted boolean default false
 );