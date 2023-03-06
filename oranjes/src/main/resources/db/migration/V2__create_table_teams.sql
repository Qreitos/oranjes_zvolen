create table team
(
    id        bigint not null auto_increment,
    name      varchar(50),
    player_id bigint,
    primary key (id)
) engine = MyISAM