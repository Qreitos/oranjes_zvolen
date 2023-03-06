create table player
(
    id              bigint not null auto_increment,
    first_name      varchar(50),
    last_name       varchar(50),
    birth_date      varchar(50),
    personal_number varchar(50),
    nationality     varchar(50),
    email           varchar(50),
    number          varchar(50),
    parents_id      bigint,
    team_id         bigint,
    primary key (id)
) engine = MyISAM