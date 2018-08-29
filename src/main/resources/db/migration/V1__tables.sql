create table Todo(
 id int primary key auto_increment,
 `text` varchar(255),
 visible boolean,
 editable boolean,
 timestamp datetime
 );