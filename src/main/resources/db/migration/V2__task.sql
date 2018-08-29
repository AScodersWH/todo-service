 create table Task(
  id int primary key auto_increment,
  content  text,
  todo_id int,
  foreign key(todo_id) references todo(id)
 );