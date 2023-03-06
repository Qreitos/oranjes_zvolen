create table parents
(
    id             bigint not null auto_increment,
    mother_name    varchar(50),
    mother_address varchar(50),
    mother_email   varchar(50),
    mother_mobile  varchar(50),
    father_name    varchar(50),
    father_address varchar(50),
    father_email   varchar(50),
    father_mobile  varchar(50),
    player_id      bigint,
    primary key (id)
) engine = MyISAM