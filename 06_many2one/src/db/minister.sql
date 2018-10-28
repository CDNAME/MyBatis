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

 Date: 02/06/2018 15:48:26
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for minister
-- ----------------------------
DROP TABLE IF EXISTS `minister`;
CREATE TABLE `minister`  (
  `mid` int(5) NOT NULL AUTO_INCREMENT,
  `mname` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `countryId` int(5) NOT NULL,
  PRIMARY KEY (`mid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of minister
-- ----------------------------
INSERT INTO `minister` VALUES (1, 'aaa', 1);
INSERT INTO `minister` VALUES (2, 'bbb', 1);
INSERT INTO `minister` VALUES (3, 'ccc', 1);
INSERT INTO `minister` VALUES (4, 'ddd', 2);
INSERT INTO `minister` VALUES (5, 'eee', 2);

SET FOREIGN_KEY_CHECKS = 1;
