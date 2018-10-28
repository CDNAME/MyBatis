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

 Date: 03/06/2018 20:40:45
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for middle
-- ----------------------------
DROP TABLE IF EXISTS `middle`;
CREATE TABLE `middle`  (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `studentId` int(5) NOT NULL,
  `courseId` int(5) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of middle
-- ----------------------------
INSERT INTO `middle` VALUES (1, 1, 1);
INSERT INTO `middle` VALUES (2, 1, 2);
INSERT INTO `middle` VALUES (3, 2, 1);
INSERT INTO `middle` VALUES (4, 2, 3);

SET FOREIGN_KEY_CHECKS = 1;
