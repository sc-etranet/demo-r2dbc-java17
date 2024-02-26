create table settings (
    id serial primary key,
    name varchar(255) not null
);

insert into settings values(1, 'foo');
insert into settings values(2, 'bar');