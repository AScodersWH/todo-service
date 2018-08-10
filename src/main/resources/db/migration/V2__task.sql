 create table task(
  id int primary key auto_increment,
  content  text,
  todo_id int,
  deleted boolean default  false,
  foreign key(todo_id) references todo_list(id)
 );