/*
 Navicat Premium Data Transfer

 Source Server         : 本地mysql
 Source Server Type    : MySQL
 Source Server Version : 50728
 Source Host           : localhost:3306
 Source Schema         : java_chatbot

 Target Server Type    : MySQL
 Target Server Version : 50728
 File Encoding         : 65001

 Date: 14/05/2020 21:08:25
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for chatbot
-- ----------------------------
DROP TABLE IF EXISTS `chatbot`;
CREATE TABLE `chatbot`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `gmt_create` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gmt_modified` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
  `status_id` tinyint(3) UNSIGNED NOT NULL DEFAULT 1 COMMENT '状态(1:正常，0:禁用)',
  `question` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '问题',
  `answer` varchar(2555) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '答案',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of chatbot
-- ----------------------------
INSERT INTO `chatbot` VALUES (1, '2020-05-11 13:46:21', '2020-05-11 13:46:21', 1, 'java是什么', 'Java是一门面向对象编程语言，不仅吸收了C++语言的各种优点，还摒弃了C++里难以理解的多继承、指针等概念，因此Java语言具有功能强大和简单易用两个特征。');
INSERT INTO `chatbot` VALUES (2, '2020-05-11 13:46:21', '2020-05-11 13:46:21', 1, '你是谁', '我是在线教学平台的对话机器人');
INSERT INTO `chatbot` VALUES (3, '2020-05-12 21:04:02', '2020-05-12 21:04:02', 1, '你爸爸是谁', '我爸爸是最帅气最牛逼的人');
INSERT INTO `chatbot` VALUES (4, '2020-05-12 21:35:34', '2020-05-12 21:35:34', 1, '我爱你', '我也爱你宝贝');
INSERT INTO `chatbot` VALUES (5, '2020-05-12 21:36:16', '2020-05-12 21:36:16', 1, '我想你了', '宝贝乖，我马上回家！');
INSERT INTO `chatbot` VALUES (6, '2020-05-12 21:37:13', '2020-05-12 21:37:13', 1, '你在干嘛', '我在学习呢');
INSERT INTO `chatbot` VALUES (7, '2020-05-12 21:38:46', '2020-05-12 21:38:46', 1, 'spring cloud是什么', 'Spring Cloud是一个微服务框架,相比Dubbo等RPC框架, Spring Cloud提供的全套的分布式系统解决方案。');
INSERT INTO `chatbot` VALUES (8, '2020-05-12 21:40:40', '2020-05-12 21:40:40', 1, 'spring cloud有什么优势', 'Spring Cloud 来源于 Spring，质量、稳定性、持续性都可以得到保证。\r\nSpirng Cloud 天然支持 Spring Boot，更加便于业务落地。\r\nSpring Cloud 发展非常的快，从 2016 年开始接触的时候相关组件版本为 1.x，到现在将要发布 2.x 系列。\r\nSpring Cloud 是 Java 领域最适合做微服务的框架。\r\n相比于其它框架，Spring Cloud 对微服务周边环境的支持力度最大。\r\n对于中小企业来讲，使用门槛较低。\r\nSpring Cloud 是微服务架构的最佳落地方案。');
INSERT INTO `chatbot` VALUES (9, '2020-05-12 22:06:27', '2020-05-12 22:06:27', 1, '你多大了', '宝宝现在才刚出生');
INSERT INTO `chatbot` VALUES (10, '2020-05-12 22:07:53', '2020-05-12 22:07:53', 1, '你妈妈是谁', '宝宝现在暂时还没有妈妈，如果你有意向做我妈妈，请联系qq:xxxxxxxxxx');
INSERT INTO `chatbot` VALUES (11, '2020-05-13 09:49:22', '2020-05-13 09:49:22', 1, 'hi', 'hello');
INSERT INTO `chatbot` VALUES (12, '2020-05-13 09:51:43', '2020-05-13 09:51:43', 1, 'spring boot是什么', 'Spring Boot提供了一种新的编程范式，能在最小的阻力下开发Spring应用程序。有了它， 你可以更加敏捷地开发Spring应用程序，专注于应用程序的功能，不用在Spring的配置上多花功 夫，甚至完全不用配置。实际上，Spring Boot的一项重要工作就是让Spring配置不再成为你成功路上的绊脚石。');

SET FOREIGN_KEY_CHECKS = 1;
