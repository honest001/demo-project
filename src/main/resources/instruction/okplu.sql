
create database okplus
default character set utf8
default collate utf8_general_ci;

/*
 Navicat MySQL Data Transfer

 Source Server         : 本地
 Source Server Type    : MySQL
 Source Server Version : 50725
 Source Host           : localhost
 Source Database       : okplus

 Target Server Type    : MySQL
 Target Server Version : 50725
 File Encoding         : utf-8

 Date: 01/10/2020 11:32:52 AM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(45) DEFAULT NULL COMMENT '用户名',
  `password` varchar(100) DEFAULT NULL COMMENT '密码',
  `nick_name` varchar(45) DEFAULT NULL COMMENT '昵称',
  `real_name` varchar(45) DEFAULT NULL COMMENT '真实姓名',
  `sex` tinyint(4) DEFAULT NULL COMMENT '性别\n1. 男\n2. 女',
  `avatar` varchar(200) DEFAULT NULL COMMENT '头像',
  `signature` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '当前签名',
  `phone_num` varchar(20) DEFAULT NULL COMMENT '手机号',
  `birthday` date DEFAULT NULL COMMENT '出生日期',
  `user_type` tinyint(4) DEFAULT NULL COMMENT '用户类型\n1. 上班族\n2. 在校学生\n3. 公务员',
  `constellation` tinyint(4) DEFAULT NULL COMMENT '星座枚举',
  `province` varchar(45) DEFAULT NULL COMMENT '省',
  `city` varchar(45) DEFAULT NULL COMMENT '市',
  `country` varchar(45) DEFAULT NULL COMMENT '县',
  `wechat` varchar(45) DEFAULT NULL COMMENT '微信',
  `qq` varchar(45) DEFAULT NULL COMMENT 'qq',
  `weibo` varchar(45) DEFAULT NULL COMMENT '微博',
  `source` tinyint(4) DEFAULT '1' COMMENT '用户来源 1 APP注册 2代报',
  `gmt_create` datetime DEFAULT NULL COMMENT '创建时间',
  `gmt_modified` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `status` varchar(45) DEFAULT '0' COMMENT '数据状态',
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COMMENT='用户表';

-- ----------------------------
--  Records of `user`
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES ('1', '张三', '123456', '小张', '张三丰', '0', null, null, null, null, null, null, null, null, null, null, null, null, '1', null, '2020-01-04 22:41:49', '0'), ('2', '李四', '123456', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '1', '2020-01-06 07:21:06', '2020-01-06 21:21:06', '0'), ('3', '王五11', '123456', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '1', '2020-01-06 07:24:18', '2020-01-06 21:24:19', '0'), ('4', '王五1', '123456', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '1', '2020-01-06 07:22:02', '2020-01-06 07:26:42', '1'), ('5', 'demoData', 'demoData', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '1', '2020-01-06 10:14:36', '2020-01-07 00:14:36', '0'), ('6', '五11', '123456', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '1', '2020-01-08 02:55:34', '2020-01-08 16:55:33', '0');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
