--数据库初始化脚本


--创建数据库
CREATE DATABASE seckill;

--使用数据库
use seckill;
--创建数据库表
CREATE TABLE seckill(
seckill_id bigint NOT NULL AUTO_INCREMENT COMMENT '商品库存id',
commodityname varchar(120) NOT NULL COMMENT '商品名称',
number int NOT NULL COMMENT '库存数量',
start_time TIMESTAMP NOT NULL COMMENT '秒杀开始时间',
end_time timestamp NOT NULL COMMENT '秒杀结束时间',
create_time TIMESTAMP NOT NULL COMMENT '创建时间',
primary key(seckill_id),
key idx_start_time(start_time),
key idx_end_time(end_time),
key idx_create_time(create_time)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT '秒杀库存表';

--初始化数据
insert into seckill(commodityname,number,start_time,end_time)
values('1000元秒杀iPhone6s',100,'2016-11-11 00:00:00','2016-11-12 00:00:00');
insert into seckill(commodityname,number,start_time,end_time)
values('500元秒杀iPad2',200,'2016-11-11 00:00:00','2016-11-12 00:00:00');
insert into seckill(commodityname,number,start_time,end_time)
values('300元秒杀小米4',300,'2016-11-11 00:00:00','2016-11-12 00:00:00');
insert into seckill(commodityname,number,start_time,end_time)
values('200元秒杀红米note',400,'2016-11-11 00:00:00','2016-11-12 00:00:00');

--秒杀成功明细表
--用户登录认证相关的信息
create table success_killed(
seckill_id bigint NOT NULL COMMENT '秒杀商品id',
user_phone bigint NOT NULL COMMENT '用户手机号',
state tinyint NOT NULL DEFAULT -1 COMMENT '状态表示:-1:无效 0:成功 1：已付款',
create_time TIMESTAMP NOT NULL COMMENT '创建时间',
primary key(seckill_id,user_phone),
key idx_create_time(create_time)
)ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT '秒杀成功明细表';