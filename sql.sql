# create database `wt-micro-project`;
use `wt-micro-project`;
-- auto-generated definition
create table wt_storage
(
    id          int auto_increment
        primary key,
    `key`       varchar(63)      not null comment '文件的唯一索引',
    name        varchar(255)     not null comment '文件名',
    type        varchar(256)     not null comment '文件类型',
    size        int              not null comment '文件大小',
    url         varchar(255)     null comment '文件访问链接',
    add_time    datetime         null comment '创建时间',
    update_time datetime         null comment '更新时间',
    deleted     bit default b'0' not null
)
    comment '文件存储表' charset = utf8mb4;

