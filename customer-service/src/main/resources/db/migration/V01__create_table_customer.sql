create table customer(
	id int auto_increment primary key,
    first_name varchar(255) not null,
    last_name varchar(255) not null,
    status varchar(255) not null,
    cpf varchar(50) not null,
    age int not null,
    email varchar(255) not null unique
);