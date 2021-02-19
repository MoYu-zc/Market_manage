/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50527
 Source Host           : localhost:3306
 Source Schema         : shopping

 Target Server Type    : MySQL
 Target Server Version : 50527
 File Encoding         : 65001

 Date: 18/02/2021 18:14:21
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for mon
-- ----------------------------
DROP TABLE IF EXISTS `mon`;
CREATE TABLE `mon`  (
  `da` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `mon` double NOT NULL,
  `mon1` double NOT NULL,
  `mon2` double NOT NULL,
  PRIMARY KEY (`da`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of mon
-- ----------------------------
INSERT INTO `mon` VALUES ('到目前为止', 5000, 3500, 1500);

-- ----------------------------
-- Table structure for open
-- ----------------------------
DROP TABLE IF EXISTS `open`;
CREATE TABLE `open`  (
  `user` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `paaword` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`user`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of open
-- ----------------------------
INSERT INTO `open` VALUES ('123456', '123456');

-- ----------------------------
-- Table structure for peo
-- ----------------------------
DROP TABLE IF EXISTS `peo`;
CREATE TABLE `peo`  (
  `num` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `sex` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `age` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `dep` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `post` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ph` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `mon` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `wh` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `stat` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `tim` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`num`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of peo
-- ----------------------------

-- ----------------------------
-- Table structure for shop1
-- ----------------------------
DROP TABLE IF EXISTS `shop1`;
CREATE TABLE `shop1`  (
  `num` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `wh` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `qua` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `money1` double NOT NULL,
  `number` int(20) NOT NULL,
  `money2` double NOT NULL,
  `tim` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`num`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of shop1
-- ----------------------------
INSERT INTO `shop1` VALUES ('1', '1', '1', '1', 1, 4, 1, '1');
INSERT INTO `shop1` VALUES ('2', '2', '2', '2', 2, 2, 2, '2');
INSERT INTO `shop1` VALUES ('3', '3', '3', '3', 3, 3, 3, '3');
INSERT INTO `shop1` VALUES ('4', 'zc', 'aa', '1', 1, 11, 11, '111');
INSERT INTO `shop1` VALUES ('5', '5', '1', '1', 1, 1, 1, '1');

-- ----------------------------
-- Table structure for vip
-- ----------------------------
DROP TABLE IF EXISTS `vip`;
CREATE TABLE `vip`  (
  `user` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `pass` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `sex` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `wh` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ph` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `dis` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `tim` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`user`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of vip
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;
