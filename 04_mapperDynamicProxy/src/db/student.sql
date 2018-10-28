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

 Date: 02/06/2018 15:44:47
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `age` int(3) NOT NULL,
  `score` double NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 30 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (1, '张三', 23, 93.5);
INSERT INTO `student` VALUES (2, '李四', 24, 94.5);
INSERT INTO `student` VALUES (3, '王五', 25, 95.5);
INSERT INTO `student` VALUES (25, '李四', 23, 90.5);
INSERT INTO `student` VALUES (26, '王二', 23, 90.5);
INSERT INTO `student` VALUES (27, '王二', 23, 90.5);
INSERT INTO `student` VALUES (28, '王二', 23, 90.5);
INSERT INTO `student` VALUES (29, '王二', 23, 90.5);

SET FOREIGN_KEY_CHECKS = 1;
