/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50721
 Source Host           : localhost:3306
 Source Schema         : cloud_tutorial

 Target Server Type    : MySQL
 Target Server Version : 50721
 File Encoding         : 65001

 Date: 06/04/2018 21:51:58
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for smsdomain
-- ----------------------------
DROP TABLE IF EXISTS `smsdomain`;
CREATE TABLE `smsdomain`  (
  `sms_id` int(11) NOT NULL AUTO_INCREMENT,
  `phone` int(20) NULL DEFAULT NULL,
  `content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`sms_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of smsdomain
-- ----------------------------
INSERT INTO `smsdomain` VALUES (1, 123, '123');
INSERT INTO `smsdomain` VALUES (2, 123, '123123123');

SET FOREIGN_KEY_CHECKS = 1;
