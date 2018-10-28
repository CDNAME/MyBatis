/*
 Navicat Premium Data Transfer

 Source Server         : shopping
 Source Server Type    : MySQL
 Source Server Version : 50625
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 50625
 File Encoding         : 65001

 Date: 02/06/2018 15:44:08
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for newslable
-- ----------------------------
DROP TABLE IF EXISTS `newslable`;
CREATE TABLE `newslable`  (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `pid` int(5) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of newslable
-- ----------------------------
INSERT INTO `newslable` VALUES (1, '娱乐新闻', 0);
INSERT INTO `newslable` VALUES (2, '体育新闻', 0);
INSERT INTO `newslable` VALUES (3, 'NBA', 2);
INSERT INTO `newslable` VALUES (4, 'CBA', 2);
INSERT INTO `newslable` VALUES (5, '火箭', 3);
INSERT INTO `newslable` VALUES (6, '湖人', 3);
INSERT INTO `newslable` VALUES (7, '北京金隅', 4);
INSERT INTO `newslable` VALUES (8, '浙江广厦', 4);
INSERT INTO `newslable` VALUES (9, '青岛双星', 4);
INSERT INTO `newslable` VALUES (10, '港台明星', 1);
INSERT INTO `newslable` VALUES (11, '内地影视', 1);

SET FOREIGN_KEY_CHECKS = 1;
