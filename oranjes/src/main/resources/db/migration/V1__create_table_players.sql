create table players
(
    id          bigint not null auto_increment,
    name        varchar(50),
    birth_date  varchar(50),
    address     varchar(50),
    email       varchar(50),
    number      varchar(50),
    position    varchar(50),
    img         varchar(255),
    primary key (id)
) engine = MyISAM