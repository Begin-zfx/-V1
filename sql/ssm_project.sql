/*
 Navicat Premium Data Transfer

 Source Server         : Mysql_01
 Source Server Type    : MySQL
 Source Server Version : 80019
 Source Host           : localhost:3306
 Source Schema         : ssm_project

 Target Server Type    : MySQL
 Target Server Version : 80019
 File Encoding         : 65001

 Date: 29/11/2020 15:16:29
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_blacklist
-- ----------------------------
DROP TABLE IF EXISTS `tb_blacklist`;
CREATE TABLE `tb_blacklist`  (
  `blackID` int(0) NOT NULL AUTO_INCREMENT COMMENT '黑名单编号',
  `userID` int(0) NOT NULL,
  `beginTime` datetime(0) NULL DEFAULT NULL,
  `cause` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `status` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`blackID`) USING BTREE,
  INDEX `userID`(`userID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8010 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_blacklist
-- ----------------------------
INSERT INTO `tb_blacklist` VALUES (8003, 1130, '2020-03-19 21:46:07', '故意损坏公共物资', '冻结');
INSERT INTO `tb_blacklist` VALUES (8004, 1131, '2020-03-21 21:46:29', '长时间未取消预约', '冻结');
INSERT INTO `tb_blacklist` VALUES (8005, 1136, '2020-03-21 22:31:41', '长时间未取消预约', '已解除');
INSERT INTO `tb_blacklist` VALUES (8006, 1200, '2020-03-29 20:05:29', '故意损坏公共物资', '已解除');
INSERT INTO `tb_blacklist` VALUES (8007, 1180, '2020-03-30 17:05:59', '经常打扰他人学习', '冻结');
INSERT INTO `tb_blacklist` VALUES (8008, 1181, '2020-03-30 17:06:23', '长时间未取消预约', '冻结');
INSERT INTO `tb_blacklist` VALUES (8009, 1182, '2020-03-27 17:06:38', '长时间未取消预约', '已解除');
INSERT INTO `tb_blacklist` VALUES (8010, 1183, '2020-03-31 20:04:14', '长时间未取消预约', '冻结');

-- ----------------------------
-- Table structure for tb_complain
-- ----------------------------
DROP TABLE IF EXISTS `tb_complain`;
CREATE TABLE `tb_complain`  (
  `cpID` int(0) NOT NULL AUTO_INCREMENT COMMENT '投诉编号',
  `userID` int(0) NOT NULL,
  `cpDate` datetime(0) NULL DEFAULT NULL,
  `cpText` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `ps` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`cpID`) USING BTREE,
  INDEX `userID`(`userID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7009 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_complain
-- ----------------------------
INSERT INTO `tb_complain` VALUES (7001, 1001, '2020-03-19 21:07:22', '环境不好', '已处理');
INSERT INTO `tb_complain` VALUES (7002, 1002, '2020-03-25 10:57:17', '很吵', '已处理');
INSERT INTO `tb_complain` VALUES (7006, 1131, '2020-03-26 13:41:34', '空气不新鲜', '未处理');
INSERT INTO `tb_complain` VALUES (7007, 1134, '2020-03-26 14:41:49', '环境较吵', '未处理');
INSERT INTO `tb_complain` VALUES (7008, 1140, '2020-03-18 17:29:32', '环境差', '未处理');
INSERT INTO `tb_complain` VALUES (7009, 1141, '2020-03-19 17:30:02', '声音嘈杂', '未处理');

-- ----------------------------
-- Table structure for tb_feedback
-- ----------------------------
DROP TABLE IF EXISTS `tb_feedback`;
CREATE TABLE `tb_feedback`  (
  `fdID` int(0) NOT NULL AUTO_INCREMENT,
  `userID` int(0) NOT NULL,
  `cpID` int(0) NOT NULL,
  `fdTime` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0),
  `fdText` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`fdID`) USING BTREE,
  INDEX `cpID`(`cpID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11141 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_feedback
-- ----------------------------
INSERT INTO `tb_feedback` VALUES (11115, 1001, 7001, '2020-04-22 21:07:56', '尽快处理');
INSERT INTO `tb_feedback` VALUES (11126, 1001, 7001, '2020-04-22 21:09:30', '会采取相应措施');
INSERT INTO `tb_feedback` VALUES (11127, 1131, 7006, '2020-04-22 21:09:48', '已采取措施');
INSERT INTO `tb_feedback` VALUES (11128, 1131, 7006, '2020-04-22 21:09:50', '已采取措施');
INSERT INTO `tb_feedback` VALUES (11129, 1134, 7007, '2020-04-22 21:09:52', '已采取措施');
INSERT INTO `tb_feedback` VALUES (11130, 1001, 7001, '2020-04-22 21:10:07', '我们将尽快处理');
INSERT INTO `tb_feedback` VALUES (11131, 1131, 7006, '2020-04-22 21:09:57', '已采取措施');
INSERT INTO `tb_feedback` VALUES (11132, 1134, 7007, '2020-04-22 21:09:32', '会采取相应措施');
INSERT INTO `tb_feedback` VALUES (11133, 1140, 7008, '2020-04-22 21:10:08', '我们将尽快处理');
INSERT INTO `tb_feedback` VALUES (11134, 1140, 7008, '2020-04-22 21:09:54', '已采取措施');
INSERT INTO `tb_feedback` VALUES (11135, 1002, 7002, '2020-04-22 21:09:34', '会采取相应措施');
INSERT INTO `tb_feedback` VALUES (11136, 1140, 7008, '2020-04-22 21:10:10', '我们将尽快处理');
INSERT INTO `tb_feedback` VALUES (11137, 1001, 7001, '2020-04-22 21:09:36', '会采取相应措施');
INSERT INTO `tb_feedback` VALUES (11138, 1001, 7001, '2020-04-22 21:10:12', '我们将尽快处理');
INSERT INTO `tb_feedback` VALUES (11139, 1002, 7002, '2020-04-01 20:55:06', '好的，会积极采取措施处理的！');
INSERT INTO `tb_feedback` VALUES (11140, 1001, 7001, '2020-04-22 21:09:38', '会采取相应措施');
INSERT INTO `tb_feedback` VALUES (11141, 1002, 7002, '2020-05-08 22:35:02', '尽快处理！！！');

-- ----------------------------
-- Table structure for tb_manager
-- ----------------------------
DROP TABLE IF EXISTS `tb_manager`;
CREATE TABLE `tb_manager`  (
  `managerID` int(0) NOT NULL AUTO_INCREMENT,
  `managerName` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `managerTel` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `managerPwd` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`managerID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2015 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_manager
-- ----------------------------
INSERT INTO `tb_manager` VALUES (1111, 'zfx1232', '13212333311', '123123');
INSERT INTO `tb_manager` VALUES (2004, 'aewqeq', 'qweqwe12312', '1231231231');
INSERT INTO `tb_manager` VALUES (2005, '1231212321123', '12133', '123123');
INSERT INTO `tb_manager` VALUES (2007, 'zfx123', '12312312312', '123123');
INSERT INTO `tb_manager` VALUES (2008, 'zfx9999999999', '19999999999', '999999999');
INSERT INTO `tb_manager` VALUES (2009, 'zfx888', '18888888888', '888888');
INSERT INTO `tb_manager` VALUES (2010, 'zzffxx', '12312312312', 'zfx123');
INSERT INTO `tb_manager` VALUES (2011, 'zh', '18352262209', 'xxh1996');
INSERT INTO `tb_manager` VALUES (2012, '肖老师测试', '13770000000', '123456');
INSERT INTO `tb_manager` VALUES (2013, '赵福兴', '12312312312', '12341234');
INSERT INTO `tb_manager` VALUES (2014, 'zfx111', '12312312312', '123123');
INSERT INTO `tb_manager` VALUES (2015, 'zfx777', '12321312312', 'xxh1028');

-- ----------------------------
-- Table structure for tb_room
-- ----------------------------
DROP TABLE IF EXISTS `tb_room`;
CREATE TABLE `tb_room`  (
  `roomID` int(0) NOT NULL AUTO_INCREMENT COMMENT '自习室编号',
  `seatCount` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '座位总数',
  `searRate` float NULL DEFAULT NULL,
  PRIMARY KEY (`roomID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4006 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_room
-- ----------------------------
INSERT INTO `tb_room` VALUES (4001, '8', NULL);
INSERT INTO `tb_room` VALUES (4002, '8', NULL);
INSERT INTO `tb_room` VALUES (4003, '7', NULL);
INSERT INTO `tb_room` VALUES (4004, '7', NULL);
INSERT INTO `tb_room` VALUES (4005, '7', NULL);
INSERT INTO `tb_room` VALUES (4006, '7', NULL);

-- ----------------------------
-- Table structure for tb_seat
-- ----------------------------
DROP TABLE IF EXISTS `tb_seat`;
CREATE TABLE `tb_seat`  (
  `seatID` int(0) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `roomID` int(0) NULL DEFAULT NULL,
  `seatState` char(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`seatID`) USING BTREE,
  INDEX `roomID`(`roomID`) USING BTREE,
  CONSTRAINT `tb_seat_ibfk_1` FOREIGN KEY (`roomID`) REFERENCES `tb_room` (`roomID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 3042 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_seat
-- ----------------------------
INSERT INTO `tb_seat` VALUES (3001, 4001, '1');
INSERT INTO `tb_seat` VALUES (3002, 4002, '1');
INSERT INTO `tb_seat` VALUES (3003, 4001, '1');
INSERT INTO `tb_seat` VALUES (3004, 4002, '1');
INSERT INTO `tb_seat` VALUES (3005, 4001, '1');
INSERT INTO `tb_seat` VALUES (3006, 4002, '2');
INSERT INTO `tb_seat` VALUES (3007, 4003, '2');
INSERT INTO `tb_seat` VALUES (3008, 4004, '1');
INSERT INTO `tb_seat` VALUES (3009, 4005, '0');
INSERT INTO `tb_seat` VALUES (3010, 4005, '0');
INSERT INTO `tb_seat` VALUES (3011, 4001, '2');
INSERT INTO `tb_seat` VALUES (3012, 4001, '0');
INSERT INTO `tb_seat` VALUES (3013, 4002, '1');
INSERT INTO `tb_seat` VALUES (3014, 4003, '1');
INSERT INTO `tb_seat` VALUES (3015, 4003, '0');
INSERT INTO `tb_seat` VALUES (3016, 4004, '0');
INSERT INTO `tb_seat` VALUES (3017, 4004, '0');
INSERT INTO `tb_seat` VALUES (3018, 4005, '0');
INSERT INTO `tb_seat` VALUES (3019, 4006, '2');
INSERT INTO `tb_seat` VALUES (3020, 4006, '0');
INSERT INTO `tb_seat` VALUES (3021, 4006, '0');
INSERT INTO `tb_seat` VALUES (3022, 4006, '0');
INSERT INTO `tb_seat` VALUES (3023, 4001, '0');
INSERT INTO `tb_seat` VALUES (3024, 4001, '0');
INSERT INTO `tb_seat` VALUES (3025, 4001, '0');
INSERT INTO `tb_seat` VALUES (3026, 4002, '0');
INSERT INTO `tb_seat` VALUES (3027, 4002, '0');
INSERT INTO `tb_seat` VALUES (3028, 4002, '0');
INSERT INTO `tb_seat` VALUES (3029, 4002, '0');
INSERT INTO `tb_seat` VALUES (3030, 4003, '0');
INSERT INTO `tb_seat` VALUES (3031, 4003, '0');
INSERT INTO `tb_seat` VALUES (3032, 4003, '0');
INSERT INTO `tb_seat` VALUES (3033, 4003, '1');
INSERT INTO `tb_seat` VALUES (3034, 4003, '0');
INSERT INTO `tb_seat` VALUES (3036, 4004, '0');
INSERT INTO `tb_seat` VALUES (3037, 4004, '0');
INSERT INTO `tb_seat` VALUES (3038, 4004, '0');
INSERT INTO `tb_seat` VALUES (3039, 4004, '0');
INSERT INTO `tb_seat` VALUES (3040, 4005, '0');
INSERT INTO `tb_seat` VALUES (3041, 4005, '0');
INSERT INTO `tb_seat` VALUES (3042, 4005, '0');

-- ----------------------------
-- Table structure for tb_seatresver
-- ----------------------------
DROP TABLE IF EXISTS `tb_seatresver`;
CREATE TABLE `tb_seatresver`  (
  `resverID` int(0) NOT NULL AUTO_INCREMENT COMMENT '预约编号',
  `userID` int(0) NOT NULL,
  `seatID` int(0) NOT NULL,
  `bTime` datetime(0) NULL DEFAULT NULL,
  `eTime` datetime(0) NULL DEFAULT NULL,
  `state` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`resverID`) USING BTREE,
  INDEX `userID`(`userID`) USING BTREE,
  INDEX `seatID`(`seatID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5059 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_seatresver
-- ----------------------------
INSERT INTO `tb_seatresver` VALUES (5028, 1168, 3001, '2020-03-28 12:00:09', '2020-03-28 12:00:11', '1');
INSERT INTO `tb_seatresver` VALUES (5030, 1169, 3003, '2020-03-28 12:00:09', '2020-03-28 12:00:11', '1');
INSERT INTO `tb_seatresver` VALUES (5037, 1173, 3019, '2020-03-28 12:00:09', '2020-03-28 12:00:11', '2');
INSERT INTO `tb_seatresver` VALUES (5038, 1174, 3002, '2020-03-30 14:17:11', '2020-03-30 14:17:14', '1');
INSERT INTO `tb_seatresver` VALUES (5039, 1175, 3014, '2020-03-29 16:27:20', '2020-03-30 14:25:15', '1');
INSERT INTO `tb_seatresver` VALUES (5040, 1176, 3007, '2020-03-30 14:28:05', '2020-03-30 14:28:06', '2');
INSERT INTO `tb_seatresver` VALUES (5041, 1180, 3004, '2020-03-30 14:30:33', '2020-03-30 14:30:34', '1');
INSERT INTO `tb_seatresver` VALUES (5042, 1181, 3006, '2020-03-30 15:54:39', '2020-03-30 22:00:00', '2');
INSERT INTO `tb_seatresver` VALUES (5045, 1185, 3013, '2020-03-29 16:24:59', '2020-03-30 17:47:39', '1');
INSERT INTO `tb_seatresver` VALUES (5046, 1186, 3033, '2020-03-29 16:27:20', '2020-03-29 16:25:01', '1');
INSERT INTO `tb_seatresver` VALUES (5057, 1198, 3005, '2020-05-08 22:37:28', '2020-05-08 22:37:30', '1');
INSERT INTO `tb_seatresver` VALUES (5058, 1188, 3011, '2020-05-08 22:37:44', '2020-05-08 22:37:53', '2');
INSERT INTO `tb_seatresver` VALUES (5059, 1156, 3008, '2020-03-28 12:00:09', '2020-11-26 00:00:00', '1');

-- ----------------------------
-- Table structure for tb_seatuse
-- ----------------------------
DROP TABLE IF EXISTS `tb_seatuse`;
CREATE TABLE `tb_seatuse`  (
  `seatuseID` int(0) NOT NULL AUTO_INCREMENT COMMENT '座位使用编号',
  `userID` int(0) NOT NULL,
  `seatID` int(0) NOT NULL,
  `beginTime` datetime(0) NOT NULL,
  `endTime` datetime(0) NOT NULL,
  `state` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`seatuseID`) USING BTREE,
  INDEX `userID`(`userID`) USING BTREE,
  INDEX `seatID`(`seatID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6035 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_seatuse
-- ----------------------------
INSERT INTO `tb_seatuse` VALUES (6003, 1171, 3011, '2020-03-28 12:00:09', '2020-03-29 16:25:01', '1');
INSERT INTO `tb_seatuse` VALUES (6004, 1172, 3011, '2020-03-28 12:00:09', '2020-03-29 16:25:01', '1');
INSERT INTO `tb_seatuse` VALUES (6005, 1172, 3011, '2020-03-29 16:27:20', '2020-03-29 16:28:01', '2');
INSERT INTO `tb_seatuse` VALUES (6006, 1171, 3012, '2020-03-28 12:00:09', '2020-03-28 12:00:11', '2');
INSERT INTO `tb_seatuse` VALUES (6007, 1173, 3023, '2020-03-29 16:24:59', '2020-03-29 16:25:01', '1');
INSERT INTO `tb_seatuse` VALUES (6008, 1173, 3019, '2020-03-28 12:00:09', '2020-03-28 12:00:11', '2');
INSERT INTO `tb_seatuse` VALUES (6009, 1174, 3002, '2020-03-30 14:17:11', '2020-03-30 14:17:14', '1');
INSERT INTO `tb_seatuse` VALUES (6010, 1175, 3014, '2020-03-29 16:27:20', '2020-03-30 14:25:15', '1');
INSERT INTO `tb_seatuse` VALUES (6011, 1176, 3007, '2020-03-30 14:28:05', '2020-03-30 14:28:06', '2');
INSERT INTO `tb_seatuse` VALUES (6012, 1180, 3004, '2020-03-30 14:30:33', '2020-03-30 14:30:34', '1');
INSERT INTO `tb_seatuse` VALUES (6013, 1181, 3006, '2020-03-30 15:54:39', '2020-03-30 22:00:00', '2');
INSERT INTO `tb_seatuse` VALUES (6015, 1183, 3012, '2020-03-30 17:37:17', '2020-03-30 21:00:00', '1');
INSERT INTO `tb_seatuse` VALUES (6016, 1185, 3013, '2020-03-29 16:24:59', '2020-03-30 17:47:39', '1');
INSERT INTO `tb_seatuse` VALUES (6017, 1186, 3033, '2020-03-29 16:27:20', '2020-03-29 16:25:01', '1');
INSERT INTO `tb_seatuse` VALUES (6018, 1187, 3023, '2020-03-30 22:51:14', '2020-03-30 22:51:16', '1');
INSERT INTO `tb_seatuse` VALUES (6019, 1190, 3011, '2020-03-31 20:48:50', '2020-03-31 20:48:52', '2');
INSERT INTO `tb_seatuse` VALUES (6020, 1171, 3026, '2020-04-01 14:00:00', '2020-04-01 18:30:00', '1');
INSERT INTO `tb_seatuse` VALUES (6021, 1195, 3018, '2020-04-01 20:06:52', '2020-04-01 22:00:00', '2');
INSERT INTO `tb_seatuse` VALUES (6022, 1196, 3020, '2020-04-02 11:51:00', '2020-04-02 11:51:05', '2');
INSERT INTO `tb_seatuse` VALUES (6023, 1195, 3018, '2020-04-02 12:01:12', '2020-04-02 12:01:15', '1');
INSERT INTO `tb_seatuse` VALUES (6024, 1197, 3017, '2020-04-02 12:02:29', '2020-04-02 12:02:34', '1');
INSERT INTO `tb_seatuse` VALUES (6025, 1198, 3016, '2020-04-02 15:03:21', '2020-04-02 15:03:25', '2');
INSERT INTO `tb_seatuse` VALUES (6026, 1190, 3011, '2020-04-02 15:34:14', '2020-04-02 15:34:16', '2');
INSERT INTO `tb_seatuse` VALUES (6027, 1191, 3024, '2020-03-29 17:09:25', '2020-04-02 15:52:29', '1');
INSERT INTO `tb_seatuse` VALUES (6028, 1193, 3012, '2020-04-02 18:20:10', '2020-04-02 18:20:12', '2');
INSERT INTO `tb_seatuse` VALUES (6029, 1194, 3023, '2020-04-01 19:24:22', '2020-04-02 19:24:23', '2');
INSERT INTO `tb_seatuse` VALUES (6031, 1199, 3011, '2020-03-28 12:00:09', '2020-04-12 00:00:00', '2');
INSERT INTO `tb_seatuse` VALUES (6032, 1198, 3012, '2020-03-28 12:00:09', '2020-04-22 16:40:14', '1');
INSERT INTO `tb_seatuse` VALUES (6033, 1198, 3005, '2020-05-08 22:37:28', '2020-05-08 22:37:30', '1');
INSERT INTO `tb_seatuse` VALUES (6034, 1188, 3011, '2020-05-08 22:37:44', '2020-05-08 22:37:53', '2');
INSERT INTO `tb_seatuse` VALUES (6035, 1156, 3008, '2020-03-28 12:00:09', '2020-11-26 00:00:00', '1');

-- ----------------------------
-- Table structure for tb_statistic
-- ----------------------------
DROP TABLE IF EXISTS `tb_statistic`;
CREATE TABLE `tb_statistic`  (
  `staID` int(0) NOT NULL AUTO_INCREMENT,
  `stadate` date NULL DEFAULT NULL,
  `seatU` int(0) NULL DEFAULT NULL,
  `seatR` int(0) NULL DEFAULT NULL,
  `oth1` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `oth2` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`staID`) USING BTREE,
  INDEX `seatuseID`(`stadate`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9056 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_statistic
-- ----------------------------
INSERT INTO `tb_statistic` VALUES (9001, '2020-03-12', 10, 20, NULL, NULL);
INSERT INTO `tb_statistic` VALUES (9002, '2020-03-13', 27, 20, NULL, NULL);
INSERT INTO `tb_statistic` VALUES (9003, '2020-03-14', 32, 15, NULL, NULL);
INSERT INTO `tb_statistic` VALUES (9004, '2020-03-15', 22, 17, NULL, NULL);
INSERT INTO `tb_statistic` VALUES (9005, '2020-03-16', 40, 26, NULL, NULL);
INSERT INTO `tb_statistic` VALUES (9006, '2020-03-17', 23, 14, NULL, NULL);
INSERT INTO `tb_statistic` VALUES (9007, '2020-03-18', 45, 45, NULL, NULL);
INSERT INTO `tb_statistic` VALUES (9008, '2020-03-19', 34, 22, NULL, NULL);
INSERT INTO `tb_statistic` VALUES (9009, '2020-03-20', 33, 20, NULL, NULL);
INSERT INTO `tb_statistic` VALUES (9010, '2020-03-21', 20, 14, '', NULL);
INSERT INTO `tb_statistic` VALUES (9011, '2020-03-22', 45, 18, NULL, NULL);
INSERT INTO `tb_statistic` VALUES (9012, '2020-03-23', 38, 16, NULL, NULL);
INSERT INTO `tb_statistic` VALUES (9013, '2020-03-24', 39, 19, NULL, NULL);
INSERT INTO `tb_statistic` VALUES (9014, '2020-03-25', 46, 11, NULL, NULL);
INSERT INTO `tb_statistic` VALUES (9015, '2020-03-26', 56, 12, NULL, NULL);
INSERT INTO `tb_statistic` VALUES (9016, '2020-03-27', 67, 34, NULL, NULL);
INSERT INTO `tb_statistic` VALUES (9017, '2020-03-28', 55, 33, NULL, NULL);
INSERT INTO `tb_statistic` VALUES (9018, '2020-03-29', 45, 31, NULL, NULL);
INSERT INTO `tb_statistic` VALUES (9019, '2020-03-30', 28, 19, NULL, NULL);
INSERT INTO `tb_statistic` VALUES (9020, '2020-03-31', 26, 18, NULL, NULL);
INSERT INTO `tb_statistic` VALUES (9021, '2020-04-01', 34, 18, NULL, NULL);
INSERT INTO `tb_statistic` VALUES (9044, '2020-04-02', 5, 3, NULL, NULL);
INSERT INTO `tb_statistic` VALUES (9045, '2020-04-08', 0, 0, NULL, NULL);
INSERT INTO `tb_statistic` VALUES (9046, '2020-04-10', 0, 0, NULL, NULL);
INSERT INTO `tb_statistic` VALUES (9047, '2020-04-12', 1, 0, NULL, NULL);
INSERT INTO `tb_statistic` VALUES (9048, '2020-04-22', 0, 1, NULL, NULL);
INSERT INTO `tb_statistic` VALUES (9049, '2020-04-30', 0, 0, NULL, NULL);
INSERT INTO `tb_statistic` VALUES (9050, '2020-05-07', 0, 0, NULL, NULL);
INSERT INTO `tb_statistic` VALUES (9051, '2020-05-08', 1, 1, NULL, NULL);
INSERT INTO `tb_statistic` VALUES (9052, '2020-05-09', 0, 0, NULL, NULL);
INSERT INTO `tb_statistic` VALUES (9053, '2020-06-10', 0, 0, NULL, NULL);
INSERT INTO `tb_statistic` VALUES (9054, '2020-11-06', 0, 0, NULL, NULL);
INSERT INTO `tb_statistic` VALUES (9055, '2020-11-07', 0, 0, NULL, NULL);
INSERT INTO `tb_statistic` VALUES (9056, '2020-11-08', 0, 0, NULL, NULL);

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user`  (
  `userID` int(0) NOT NULL AUTO_INCREMENT COMMENT '用户编号',
  `userName` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '姓名',
  `userAge` int(0) NULL DEFAULT NULL,
  `userGender` char(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `userTel` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `userPwd` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`userID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1859 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES (1001, 'zfx661', 24, 'M', '14545454545', '123456');
INSERT INTO `tb_user` VALUES (1003, 'zfx3', 21, 'F', '111123123123', '123123');
INSERT INTO `tb_user` VALUES (1004, 'zfx', 123, 'M', '1232323231', '123123');
INSERT INTO `tb_user` VALUES (1131, 'bde907111111', 22, 'M', '15952086108', '123123');
INSERT INTO `tb_user` VALUES (1132, '2e3c24', 22, 'F', '15952086109', '123123');
INSERT INTO `tb_user` VALUES (1136, 'fd03f8', 23, 'M', '15952086103', '123123');
INSERT INTO `tb_user` VALUES (1137, '010850', 23, 'M', '15952086104', '123123');
INSERT INTO `tb_user` VALUES (1139, '9ef352', 23, 'M', '15952086106', '123123');
INSERT INTO `tb_user` VALUES (1140, '559436', 23, 'M', '15952086107', '123123');
INSERT INTO `tb_user` VALUES (1141, '89df74', 23, 'M', '15952086108', '123123');
INSERT INTO `tb_user` VALUES (1142, '109911', 23, 'M', '15952086109', '123123');
INSERT INTO `tb_user` VALUES (1143, 'b6d85e', 23, 'M', '15952086110', '123123');
INSERT INTO `tb_user` VALUES (1144, '64aa05', 23, 'M', '15952086111', '123123');
INSERT INTO `tb_user` VALUES (1145, 'fd735d', 23, 'M', '15952086112', '123123');
INSERT INTO `tb_user` VALUES (1146, 'd1ec5e', 23, 'M', '15952086113', '123123');
INSERT INTO `tb_user` VALUES (1147, 'e60c41', 23, 'M', '15952086114', '123123');
INSERT INTO `tb_user` VALUES (1148, '828186', 23, 'M', '15952086115', '123123');
INSERT INTO `tb_user` VALUES (1149, 'bfa343', 23, 'M', '15952086116', '123123');
INSERT INTO `tb_user` VALUES (1150, '80a40d', 23, 'M', '15952086117', '123123');
INSERT INTO `tb_user` VALUES (1151, '53beaa', 23, 'M', '15952086118', '123123');
INSERT INTO `tb_user` VALUES (1152, 'afd624', 23, 'M', '15952086119', '123123');
INSERT INTO `tb_user` VALUES (1154, 'acce99', 23, 'M', '15952086121', '123123');
INSERT INTO `tb_user` VALUES (1155, 'a1d528', 23, 'M', '15952086122', '123123');
INSERT INTO `tb_user` VALUES (1156, 'dfd824', 23, 'M', '15952086123', '123123');
INSERT INTO `tb_user` VALUES (1157, '31be44', 23, 'M', '15952086124', '123123');
INSERT INTO `tb_user` VALUES (1158, 'e6ccb8', 23, 'M', '15952086125', '123123');
INSERT INTO `tb_user` VALUES (1159, '4c7d76', 23, 'M', '15952086126', '123123');
INSERT INTO `tb_user` VALUES (1160, '7f1561zzffxx', 23, 'M', '15952086127', '123123');
INSERT INTO `tb_user` VALUES (1161, '4cd0e1', 23, 'M', '15952086128', '123123');
INSERT INTO `tb_user` VALUES (1162, 'ef0027', 23, 'M', '15952086129', '123123');
INSERT INTO `tb_user` VALUES (1163, '35f294', 23, 'M', '15952086130', '123123');
INSERT INTO `tb_user` VALUES (1164, 'a034ce', 23, 'M', '15952086131', '123123');
INSERT INTO `tb_user` VALUES (1165, 'fcbe67', 23, 'M', '15952086132', '123123');
INSERT INTO `tb_user` VALUES (1168, '350755', 23, 'M', '15952086135', '123123');
INSERT INTO `tb_user` VALUES (1169, '7ceb64', 23, 'M', '15952086136', '123123');
INSERT INTO `tb_user` VALUES (1170, '434e38', 23, 'M', '15952086137', '123123');
INSERT INTO `tb_user` VALUES (1171, '0c3cd6', 23, 'M', '15952086138', '123123');
INSERT INTO `tb_user` VALUES (1172, '690844', 23, 'M', '15952086139', '123123');
INSERT INTO `tb_user` VALUES (1173, '301c75', 23, 'M', '15952086140', '123123');
INSERT INTO `tb_user` VALUES (1174, 'bd38e5', 23, 'M', '15952086141', '123123');
INSERT INTO `tb_user` VALUES (1175, 'b23b96', 23, 'M', '15952086142', '123123');
INSERT INTO `tb_user` VALUES (1176, '162329', 23, 'M', '15952086143', '123123');
INSERT INTO `tb_user` VALUES (1177, 'c2740b', 23, 'M', '15952086144', '123123');
INSERT INTO `tb_user` VALUES (1178, 'd85ab2', 23, 'M', '15952086145', '123123');
INSERT INTO `tb_user` VALUES (1179, '2c9e57', 23, 'M', '15952086146', '123123');
INSERT INTO `tb_user` VALUES (1180, 'd9c21a', 23, 'M', '15952086147', '123123');
INSERT INTO `tb_user` VALUES (1181, 'dd2c98', 23, 'M', '15952086148', '123123');
INSERT INTO `tb_user` VALUES (1182, '767a3a', 23, 'M', '15952086149', '123123');
INSERT INTO `tb_user` VALUES (1183, '648f3d', 23, 'M', '15952086150', '123123');
INSERT INTO `tb_user` VALUES (1184, 'c9c229', 23, 'M', '15952086151', '123123');
INSERT INTO `tb_user` VALUES (1185, '39fdd3', 23, 'M', '15952086152', '123123');
INSERT INTO `tb_user` VALUES (1186, 'd4039a', 23, 'M', '15952086153', '123123');
INSERT INTO `tb_user` VALUES (1187, 'efe3c2', 23, 'M', '15952086154', '123123');
INSERT INTO `tb_user` VALUES (1188, 'b11b5c', 23, 'M', '15952086155', '123123');
INSERT INTO `tb_user` VALUES (1189, '66c58c', 23, 'M', '15952086156', '123123');
INSERT INTO `tb_user` VALUES (1190, 'e05b47', 23, 'M', '15952086157', '123123');
INSERT INTO `tb_user` VALUES (1191, 'ab9d6c', 23, 'M', '15952086158', '123123');
INSERT INTO `tb_user` VALUES (1192, '27c683', 23, 'M', '15952086159', '123123');
INSERT INTO `tb_user` VALUES (1193, 'ab60ed', 23, 'M', '15952086160', '123123');
INSERT INTO `tb_user` VALUES (1194, '09fb60', 23, 'M', '15952086161', '123123');
INSERT INTO `tb_user` VALUES (1195, '623421', 23, 'M', '15952086162', '123123');
INSERT INTO `tb_user` VALUES (1196, 'bbbe30', 23, 'M', '15952086163', '123123');
INSERT INTO `tb_user` VALUES (1197, '1eafdb', 23, 'M', '15952086164', '123123');
INSERT INTO `tb_user` VALUES (1198, '724fd2', 23, 'M', '15952086165', '123123');
INSERT INTO `tb_user` VALUES (1199, '26ca9e', 23, 'M', '15952086166', '123123');
INSERT INTO `tb_user` VALUES (1200, '2e7013', 23, 'M', '15952086167', '123123');
INSERT INTO `tb_user` VALUES (1201, 'b3c77f', 23, 'M', '15952086168', '123123');
INSERT INTO `tb_user` VALUES (1202, '2d5290', 23, 'M', '15952086169', '123123');
INSERT INTO `tb_user` VALUES (1203, 'e5d302', 23, 'M', '15952086170', '123123');
INSERT INTO `tb_user` VALUES (1204, '8d7e30', 23, 'M', '15952086171', '123123');
INSERT INTO `tb_user` VALUES (1205, 'b42bfb', 23, 'M', '15952086172', '123123');
INSERT INTO `tb_user` VALUES (1206, '1b001d', 23, 'M', '15952086173', '123123');
INSERT INTO `tb_user` VALUES (1207, '965ee4', 23, 'M', '15952086174', '123123');
INSERT INTO `tb_user` VALUES (1208, '0ea97e', 23, 'M', '15952086175', '123123');
INSERT INTO `tb_user` VALUES (1209, 'a4f6a4', 23, 'M', '15952086176', '123123');
INSERT INTO `tb_user` VALUES (1210, 'c6e0f1', 23, 'M', '15952086177', '123123');
INSERT INTO `tb_user` VALUES (1211, '44df8e', 23, 'M', '15952086178', '123123');
INSERT INTO `tb_user` VALUES (1212, '69f1a5', 23, 'M', '15952086179', '123123');
INSERT INTO `tb_user` VALUES (1213, '5e0a18', 23, 'M', '15952086180', '123123');
INSERT INTO `tb_user` VALUES (1214, '7be9d8', 23, 'M', '15952086181', '123123');
INSERT INTO `tb_user` VALUES (1215, '274a0e', 23, 'M', '15952086182', '123123');
INSERT INTO `tb_user` VALUES (1216, 'd16a23', 23, 'M', '15952086183', '123123');
INSERT INTO `tb_user` VALUES (1217, '118118', 23, 'M', '15952086184', '123123');
INSERT INTO `tb_user` VALUES (1218, '37ced4', 23, 'M', '15952086185', '123123');
INSERT INTO `tb_user` VALUES (1219, 'f5916b', 23, 'M', '15952086186', '123123');
INSERT INTO `tb_user` VALUES (1220, '3154c5', 23, 'M', '15952086187', '123123');
INSERT INTO `tb_user` VALUES (1221, '644cfa', 23, 'M', '15952086188', '123123');
INSERT INTO `tb_user` VALUES (1222, 'cb6f7b', 23, 'M', '15952086189', '123123');
INSERT INTO `tb_user` VALUES (1223, '29797b', 23, 'M', '15952086190', '123123');
INSERT INTO `tb_user` VALUES (1224, '9e36bb', 23, 'M', '15952086191', '123123');
INSERT INTO `tb_user` VALUES (1225, 'a9714a', 23, 'M', '15952086192', '123123');
INSERT INTO `tb_user` VALUES (1226, '0e7f93', 23, 'M', '15952086193', '123123');
INSERT INTO `tb_user` VALUES (1227, '9386b2', 23, 'M', '15952086194', '123123');
INSERT INTO `tb_user` VALUES (1228, '3c789b', 23, 'M', '15952086195', '123123');
INSERT INTO `tb_user` VALUES (1229, '436b14', 23, 'M', '15952086196', '123123');
INSERT INTO `tb_user` VALUES (1231, 'f4c5ce', 23, 'M', '15952086198', '123123');
INSERT INTO `tb_user` VALUES (1232, '14391c', 23, 'M', '15952086199', '123123');
INSERT INTO `tb_user` VALUES (1233, '56f077', 23, 'M', '15952086200', '123123');
INSERT INTO `tb_user` VALUES (1235, 'zfx123', 123, 'M', '12312312312', '123123');
INSERT INTO `tb_user` VALUES (1236, 'zfx111', 123, 'M', '11111111111', '123123');
INSERT INTO `tb_user` VALUES (1237, 'zfx222', 22, 'M', '11222222222', '222222');
INSERT INTO `tb_user` VALUES (1238, 'zfx1232', 123, 'M', '12312312312', '123123');
INSERT INTO `tb_user` VALUES (1239, 'zfx123123', 12, 'M', '12312312312', '123123');
INSERT INTO `tb_user` VALUES (1242, 'wwwwwwwwwwww', 27, 'M', '16666666666', '987654321zzzw');
INSERT INTO `tb_user` VALUES (1245, 'zfx333', 22, 'M', '12312312312', '123456');
INSERT INTO `tb_user` VALUES (1246, 'zfx555', 22, 'M', '12312312312', '888888');
INSERT INTO `tb_user` VALUES (1247, 'zfx888', 23, 'M', '12312312312', '123123');
INSERT INTO `tb_user` VALUES (1248, 'zfx999', 123, 'M', '12312312312', '123123');
INSERT INTO `tb_user` VALUES (1249, 'zfx4321', 123, 'M', '12312312312', '123123123');
INSERT INTO `tb_user` VALUES (1250, 'zfx3332', 22, 'M', '12312312312', '123123');
INSERT INTO `tb_user` VALUES (1251, 'zfx33388', 33, 'M', '12312312312', '123123');
INSERT INTO `tb_user` VALUES (1255, 'zfx333222', 123, 'M', '12312312312', '123123');
INSERT INTO `tb_user` VALUES (1256, '36fad5', 23, 'M', '15952086102', '123123');
INSERT INTO `tb_user` VALUES (1257, 'b97a12', 23, 'M', '15952086103', '123123');
INSERT INTO `tb_user` VALUES (1258, '6a37ff', 23, 'M', '15952086104', '123123');
INSERT INTO `tb_user` VALUES (1259, '396107', 23, 'M', '15952086105', '123123');
INSERT INTO `tb_user` VALUES (1260, 'fb42e1', 23, 'M', '15952086106', '123123');
INSERT INTO `tb_user` VALUES (1261, '78ed3a', 23, 'M', '15952086107', '123123');
INSERT INTO `tb_user` VALUES (1262, '7442cc', 23, 'M', '15952086108', '123123');
INSERT INTO `tb_user` VALUES (1263, '0b44eb', 23, 'M', '15952086109', '123123');
INSERT INTO `tb_user` VALUES (1264, '18be4b', 23, 'M', '15952086110', '123123');
INSERT INTO `tb_user` VALUES (1265, '51f711', 23, 'M', '15952086111', '123123');
INSERT INTO `tb_user` VALUES (1266, '675d15', 23, 'M', '15952086112', '123123');
INSERT INTO `tb_user` VALUES (1267, 'baea1e', 23, 'M', '15952086113', '123123');
INSERT INTO `tb_user` VALUES (1268, 'd2fa54', 23, 'M', '15952086114', '123123');
INSERT INTO `tb_user` VALUES (1269, '782dc6', 23, 'M', '15952086115', '123123');
INSERT INTO `tb_user` VALUES (1270, '804c07', 23, 'M', '15952086116', '123123');
INSERT INTO `tb_user` VALUES (1271, '5b2056', 23, 'M', '15952086117', '123123');
INSERT INTO `tb_user` VALUES (1272, 'e9a997', 23, 'M', '15952086118', '123123');
INSERT INTO `tb_user` VALUES (1273, 'd91bff', 23, 'M', '15952086119', '123123');
INSERT INTO `tb_user` VALUES (1274, '7962b0', 23, 'M', '15952086120', '123123');
INSERT INTO `tb_user` VALUES (1275, 'dbc79b', 23, 'M', '15952086121', '123123');
INSERT INTO `tb_user` VALUES (1276, 'b14521', 23, 'M', '15952086122', '123123');
INSERT INTO `tb_user` VALUES (1277, 'bc00c0', 23, 'M', '15952086123', '123123');
INSERT INTO `tb_user` VALUES (1278, '7d18e9', 23, 'M', '15952086124', '123123');
INSERT INTO `tb_user` VALUES (1279, 'ed3e94', 23, 'M', '15952086125', '123123');
INSERT INTO `tb_user` VALUES (1280, '4e71b1', 23, 'M', '15952086126', '123123');
INSERT INTO `tb_user` VALUES (1281, 'eafac0', 23, 'M', '15952086127', '123123');
INSERT INTO `tb_user` VALUES (1282, '83a12a', 23, 'M', '15952086128', '123123');
INSERT INTO `tb_user` VALUES (1283, '45f562', 23, 'M', '15952086129', '123123');
INSERT INTO `tb_user` VALUES (1284, 'fb81b9', 23, 'M', '15952086130', '123123');
INSERT INTO `tb_user` VALUES (1285, 'b8a906', 23, 'M', '15952086131', '123123');
INSERT INTO `tb_user` VALUES (1286, 'ccce29', 23, 'M', '15952086132', '123123');
INSERT INTO `tb_user` VALUES (1287, '612784', 23, 'M', '15952086133', '123123');
INSERT INTO `tb_user` VALUES (1288, '26f926', 23, 'M', '15952086134', '123123');
INSERT INTO `tb_user` VALUES (1289, 'c7fa24', 23, 'M', '15952086135', '123123');
INSERT INTO `tb_user` VALUES (1290, 'd76f50', 23, 'M', '15952086136', '123123');
INSERT INTO `tb_user` VALUES (1291, 'fd972f', 23, 'M', '15952086137', '123123');
INSERT INTO `tb_user` VALUES (1292, '965bb3', 23, 'M', '15952086138', '123123');
INSERT INTO `tb_user` VALUES (1293, 'f2e6a6', 23, 'M', '15952086139', '123123');
INSERT INTO `tb_user` VALUES (1294, '0959dd', 23, 'M', '15952086140', '123123');
INSERT INTO `tb_user` VALUES (1295, 'cb331b', 23, 'M', '15952086141', '123123');
INSERT INTO `tb_user` VALUES (1296, 'a17125', 23, 'M', '15952086142', '123123');
INSERT INTO `tb_user` VALUES (1297, 'dd455d', 23, 'M', '15952086143', '123123');
INSERT INTO `tb_user` VALUES (1298, 'f8b310', 23, 'M', '15952086144', '123123');
INSERT INTO `tb_user` VALUES (1299, 'ace092', 23, 'M', '15952086145', '123123');
INSERT INTO `tb_user` VALUES (1300, '7bb99c', 23, 'M', '15952086146', '123123');
INSERT INTO `tb_user` VALUES (1301, '38b904', 23, 'M', '15952086147', '123123');
INSERT INTO `tb_user` VALUES (1302, '6e9fe0', 23, 'M', '15952086148', '123123');
INSERT INTO `tb_user` VALUES (1303, '9e75ee', 23, 'M', '15952086149', '123123');
INSERT INTO `tb_user` VALUES (1304, '013ba3', 23, 'M', '15952086150', '123123');
INSERT INTO `tb_user` VALUES (1305, 'adb8c4', 23, 'M', '15952086151', '123123');
INSERT INTO `tb_user` VALUES (1306, '4aad2b', 23, 'M', '15952086152', '123123');
INSERT INTO `tb_user` VALUES (1307, '388c11', 23, 'M', '15952086153', '123123');
INSERT INTO `tb_user` VALUES (1308, '7aff25', 23, 'M', '15952086154', '123123');
INSERT INTO `tb_user` VALUES (1309, '3e7e7a', 23, 'M', '15952086155', '123123');
INSERT INTO `tb_user` VALUES (1310, '98d07a', 23, 'M', '15952086156', '123123');
INSERT INTO `tb_user` VALUES (1311, '6df47b', 23, 'M', '15952086157', '123123');
INSERT INTO `tb_user` VALUES (1312, 'bd219c', 23, 'M', '15952086158', '123123');
INSERT INTO `tb_user` VALUES (1313, '33bca9', 23, 'M', '15952086159', '123123');
INSERT INTO `tb_user` VALUES (1314, '0a8443', 23, 'M', '15952086160', '123123');
INSERT INTO `tb_user` VALUES (1315, 'ac238a', 23, 'M', '15952086161', '123123');
INSERT INTO `tb_user` VALUES (1316, '4bfa97', 23, 'M', '15952086162', '123123');
INSERT INTO `tb_user` VALUES (1317, '93f806', 23, 'M', '15952086163', '123123');
INSERT INTO `tb_user` VALUES (1318, 'd1ecba', 23, 'M', '15952086164', '123123');
INSERT INTO `tb_user` VALUES (1319, '736370', 23, 'M', '15952086165', '123123');
INSERT INTO `tb_user` VALUES (1320, '2ac9f3', 23, 'M', '15952086166', '123123');
INSERT INTO `tb_user` VALUES (1321, 'eadf66', 23, 'M', '15952086167', '123123');
INSERT INTO `tb_user` VALUES (1322, '640b5f', 23, 'M', '15952086168', '123123');
INSERT INTO `tb_user` VALUES (1323, '350983', 23, 'M', '15952086169', '123123');
INSERT INTO `tb_user` VALUES (1324, 'd89ef4', 23, 'M', '15952086170', '123123');
INSERT INTO `tb_user` VALUES (1325, '828aaf', 23, 'M', '15952086171', '123123');
INSERT INTO `tb_user` VALUES (1326, '81153f', 23, 'M', '15952086172', '123123');
INSERT INTO `tb_user` VALUES (1327, 'fbeb7f', 23, 'M', '15952086173', '123123');
INSERT INTO `tb_user` VALUES (1328, '8c89f0', 23, 'M', '15952086174', '123123');
INSERT INTO `tb_user` VALUES (1329, '1411ba', 23, 'M', '15952086175', '123123');
INSERT INTO `tb_user` VALUES (1330, 'cc7ed5', 23, 'M', '15952086176', '123123');
INSERT INTO `tb_user` VALUES (1331, 'e6865c', 23, 'M', '15952086177', '123123');
INSERT INTO `tb_user` VALUES (1332, '29fa06', 23, 'M', '15952086178', '123123');
INSERT INTO `tb_user` VALUES (1333, 'f89caa', 23, 'M', '15952086179', '123123');
INSERT INTO `tb_user` VALUES (1334, '413eaf', 23, 'M', '15952086180', '123123');
INSERT INTO `tb_user` VALUES (1335, '23f254', 23, 'M', '15952086181', '123123');
INSERT INTO `tb_user` VALUES (1336, '101bd3', 23, 'M', '15952086182', '123123');
INSERT INTO `tb_user` VALUES (1337, 'f7762d', 23, 'M', '15952086183', '123123');
INSERT INTO `tb_user` VALUES (1338, 'a4c9e1', 23, 'M', '15952086184', '123123');
INSERT INTO `tb_user` VALUES (1339, '640c50', 23, 'M', '15952086185', '123123');
INSERT INTO `tb_user` VALUES (1340, 'c7ffda', 23, 'M', '15952086186', '123123');
INSERT INTO `tb_user` VALUES (1341, 'd52b00', 23, 'M', '15952086187', '123123');
INSERT INTO `tb_user` VALUES (1342, 'c68aa9', 23, 'M', '15952086188', '123123');
INSERT INTO `tb_user` VALUES (1343, '29ce60', 23, 'M', '15952086189', '123123');
INSERT INTO `tb_user` VALUES (1344, '455333', 23, 'M', '15952086190', '123123');
INSERT INTO `tb_user` VALUES (1345, '0ec26c', 23, 'M', '15952086191', '123123');
INSERT INTO `tb_user` VALUES (1346, '5e3ded', 23, 'M', '15952086192', '123123');
INSERT INTO `tb_user` VALUES (1347, 'c5ab4a', 23, 'M', '15952086193', '123123');
INSERT INTO `tb_user` VALUES (1348, '204bee', 23, 'M', '15952086194', '123123');
INSERT INTO `tb_user` VALUES (1349, '49c99e', 23, 'M', '15952086195', '123123');
INSERT INTO `tb_user` VALUES (1350, 'eea711', 23, 'M', '15952086196', '123123');
INSERT INTO `tb_user` VALUES (1351, '636260', 23, 'M', '15952086197', '123123');
INSERT INTO `tb_user` VALUES (1352, '6fa7c1', 23, 'M', '15952086198', '123123');
INSERT INTO `tb_user` VALUES (1353, '7933d9', 23, 'M', '15952086199', '123123');
INSERT INTO `tb_user` VALUES (1354, '8df0ae', 23, 'M', '15952086200', '123123');
INSERT INTO `tb_user` VALUES (1355, 'f38dab', 23, 'M', '15952086201', '123123');
INSERT INTO `tb_user` VALUES (1356, '7efa1b', 23, 'M', '15952086102', '123123');
INSERT INTO `tb_user` VALUES (1357, '3b4213', 23, 'M', '15952086103', '123123');
INSERT INTO `tb_user` VALUES (1358, '05b558', 23, 'M', '15952086104', '123123');
INSERT INTO `tb_user` VALUES (1359, '54f28c', 23, 'M', '15952086105', '123123');
INSERT INTO `tb_user` VALUES (1360, 'd8d194', 23, 'M', '15952086106', '123123');
INSERT INTO `tb_user` VALUES (1361, '0adcc6', 23, 'M', '15952086107', '123123');
INSERT INTO `tb_user` VALUES (1362, '2847ca', 23, 'M', '15952086108', '123123');
INSERT INTO `tb_user` VALUES (1363, 'ca56f9', 23, 'M', '15952086109', '123123');
INSERT INTO `tb_user` VALUES (1364, '36ffca', 23, 'M', '15952086110', '123123');
INSERT INTO `tb_user` VALUES (1365, '14bba7', 23, 'M', '15952086111', '123123');
INSERT INTO `tb_user` VALUES (1366, '43e3ae', 23, 'M', '15952086112', '123123');
INSERT INTO `tb_user` VALUES (1367, 'd1a776', 23, 'M', '15952086113', '123123');
INSERT INTO `tb_user` VALUES (1368, '33ee50', 23, 'M', '15952086114', '123123');
INSERT INTO `tb_user` VALUES (1369, '0b6c56', 23, 'M', '15952086115', '123123');
INSERT INTO `tb_user` VALUES (1370, 'be747d', 23, 'M', '15952086116', '123123');
INSERT INTO `tb_user` VALUES (1371, '4037e4', 23, 'M', '15952086117', '123123');
INSERT INTO `tb_user` VALUES (1372, '8f0a98', 23, 'M', '15952086118', '123123');
INSERT INTO `tb_user` VALUES (1373, '6cdc19', 23, 'M', '15952086119', '123123');
INSERT INTO `tb_user` VALUES (1374, 'ae802c', 23, 'M', '15952086120', '123123');
INSERT INTO `tb_user` VALUES (1375, '1f6cca', 23, 'M', '15952086121', '123123');
INSERT INTO `tb_user` VALUES (1376, 'fa6d0d', 23, 'M', '15952086122', '123123');
INSERT INTO `tb_user` VALUES (1377, '925a9d', 23, 'M', '15952086123', '123123');
INSERT INTO `tb_user` VALUES (1378, '71cde4', 23, 'M', '15952086124', '123123');
INSERT INTO `tb_user` VALUES (1379, 'd72cda', 23, 'M', '15952086125', '123123');
INSERT INTO `tb_user` VALUES (1380, 'ae6f24', 23, 'M', '15952086126', '123123');
INSERT INTO `tb_user` VALUES (1381, '61492d', 23, 'M', '15952086127', '123123');
INSERT INTO `tb_user` VALUES (1382, '615e0b', 23, 'M', '15952086128', '123123');
INSERT INTO `tb_user` VALUES (1383, 'cd805d', 23, 'M', '15952086129', '123123');
INSERT INTO `tb_user` VALUES (1384, '532c09', 23, 'M', '15952086130', '123123');
INSERT INTO `tb_user` VALUES (1385, 'd4f9bb', 23, 'M', '15952086131', '123123');
INSERT INTO `tb_user` VALUES (1386, 'a99fd8', 23, 'M', '15952086132', '123123');
INSERT INTO `tb_user` VALUES (1387, '944289', 23, 'M', '15952086133', '123123');
INSERT INTO `tb_user` VALUES (1388, '09b5c0', 23, 'M', '15952086134', '123123');
INSERT INTO `tb_user` VALUES (1389, '3dee40', 23, 'M', '15952086135', '123123');
INSERT INTO `tb_user` VALUES (1390, '918359', 23, 'M', '15952086136', '123123');
INSERT INTO `tb_user` VALUES (1391, 'cb07c9', 23, 'M', '15952086137', '123123');
INSERT INTO `tb_user` VALUES (1392, '8bff47', 23, 'M', '15952086138', '123123');
INSERT INTO `tb_user` VALUES (1393, '915591', 23, 'M', '15952086139', '123123');
INSERT INTO `tb_user` VALUES (1394, '8d3f95', 23, 'M', '15952086140', '123123');
INSERT INTO `tb_user` VALUES (1395, '4145c3', 23, 'M', '15952086141', '123123');
INSERT INTO `tb_user` VALUES (1396, '01ad3a', 23, 'M', '15952086142', '123123');
INSERT INTO `tb_user` VALUES (1397, 'b985af', 23, 'M', '15952086143', '123123');
INSERT INTO `tb_user` VALUES (1398, 'b4075d', 23, 'M', '15952086144', '123123');
INSERT INTO `tb_user` VALUES (1399, '74d3e1', 23, 'M', '15952086145', '123123');
INSERT INTO `tb_user` VALUES (1400, 'ed6387', 23, 'M', '15952086146', '123123');
INSERT INTO `tb_user` VALUES (1401, 'ee728f', 23, 'M', '15952086147', '123123');
INSERT INTO `tb_user` VALUES (1402, '58ab3c', 23, 'M', '15952086148', '123123');
INSERT INTO `tb_user` VALUES (1403, '0edd11', 23, 'M', '15952086149', '123123');
INSERT INTO `tb_user` VALUES (1404, 'efecf4', 23, 'M', '15952086150', '123123');
INSERT INTO `tb_user` VALUES (1405, 'c67e56', 23, 'M', '15952086151', '123123');
INSERT INTO `tb_user` VALUES (1406, '8efbf0', 23, 'M', '15952086152', '123123');
INSERT INTO `tb_user` VALUES (1407, 'ae86db', 23, 'M', '15952086153', '123123');
INSERT INTO `tb_user` VALUES (1408, 'c24b6b', 23, 'M', '15952086154', '123123');
INSERT INTO `tb_user` VALUES (1409, '287480', 23, 'M', '15952086155', '123123');
INSERT INTO `tb_user` VALUES (1410, '3a4088', 23, 'M', '15952086156', '123123');
INSERT INTO `tb_user` VALUES (1411, 'fab518', 23, 'M', '15952086157', '123123');
INSERT INTO `tb_user` VALUES (1412, '3343ad', 23, 'M', '15952086158', '123123');
INSERT INTO `tb_user` VALUES (1413, 'c07bd2', 23, 'M', '15952086159', '123123');
INSERT INTO `tb_user` VALUES (1414, 'b12416', 23, 'M', '15952086160', '123123');
INSERT INTO `tb_user` VALUES (1415, '427711', 23, 'M', '15952086161', '123123');
INSERT INTO `tb_user` VALUES (1416, '50f620', 23, 'M', '15952086162', '123123');
INSERT INTO `tb_user` VALUES (1417, 'b2cf44', 23, 'M', '15952086163', '123123');
INSERT INTO `tb_user` VALUES (1418, '7f1f85', 23, 'M', '15952086164', '123123');
INSERT INTO `tb_user` VALUES (1419, '933ef2', 23, 'M', '15952086165', '123123');
INSERT INTO `tb_user` VALUES (1420, '056eb3', 23, 'M', '15952086166', '123123');
INSERT INTO `tb_user` VALUES (1421, '0c5448', 23, 'M', '15952086167', '123123');
INSERT INTO `tb_user` VALUES (1422, '4b912b', 23, 'M', '15952086168', '123123');
INSERT INTO `tb_user` VALUES (1423, 'f14b13', 23, 'M', '15952086169', '123123');
INSERT INTO `tb_user` VALUES (1424, '26a8e1', 23, 'M', '15952086170', '123123');
INSERT INTO `tb_user` VALUES (1425, '3f44f5', 23, 'M', '15952086171', '123123');
INSERT INTO `tb_user` VALUES (1426, '536ad4', 23, 'M', '15952086172', '123123');
INSERT INTO `tb_user` VALUES (1427, 'ecc0af', 23, 'M', '15952086173', '123123');
INSERT INTO `tb_user` VALUES (1428, 'bbe3e4', 23, 'M', '15952086174', '123123');
INSERT INTO `tb_user` VALUES (1429, 'ddc119', 23, 'M', '15952086175', '123123');
INSERT INTO `tb_user` VALUES (1430, '6b40e9', 23, 'M', '15952086176', '123123');
INSERT INTO `tb_user` VALUES (1431, '73ce0b', 23, 'M', '15952086177', '123123');
INSERT INTO `tb_user` VALUES (1432, '7d6a77', 23, 'M', '15952086178', '123123');
INSERT INTO `tb_user` VALUES (1433, 'c0c71d', 23, 'M', '15952086179', '123123');
INSERT INTO `tb_user` VALUES (1434, '2b6a0d', 23, 'M', '15952086180', '123123');
INSERT INTO `tb_user` VALUES (1435, '17e0d9', 23, 'M', '15952086181', '123123');
INSERT INTO `tb_user` VALUES (1436, 'ddfcc4', 23, 'M', '15952086182', '123123');
INSERT INTO `tb_user` VALUES (1437, 'a6e235', 23, 'M', '15952086183', '123123');
INSERT INTO `tb_user` VALUES (1438, '629bd8', 23, 'M', '15952086184', '123123');
INSERT INTO `tb_user` VALUES (1439, 'a98a7e', 23, 'M', '15952086185', '123123');
INSERT INTO `tb_user` VALUES (1440, 'f996ac', 23, 'M', '15952086186', '123123');
INSERT INTO `tb_user` VALUES (1441, '810709', 23, 'M', '15952086187', '123123');
INSERT INTO `tb_user` VALUES (1442, 'f3145c', 23, 'M', '15952086188', '123123');
INSERT INTO `tb_user` VALUES (1443, '9ce93d', 23, 'M', '15952086189', '123123');
INSERT INTO `tb_user` VALUES (1444, '46823e', 23, 'M', '15952086190', '123123');
INSERT INTO `tb_user` VALUES (1445, '9a05a5', 23, 'M', '15952086191', '123123');
INSERT INTO `tb_user` VALUES (1446, '9a93fe', 23, 'M', '15952086192', '123123');
INSERT INTO `tb_user` VALUES (1447, 'ba7d45', 23, 'M', '15952086193', '123123');
INSERT INTO `tb_user` VALUES (1448, 'c98f94', 23, 'M', '15952086194', '123123');
INSERT INTO `tb_user` VALUES (1449, '0dc892', 23, 'M', '15952086195', '123123');
INSERT INTO `tb_user` VALUES (1450, 'bd0f4f', 23, 'M', '15952086196', '123123');
INSERT INTO `tb_user` VALUES (1451, 'a255c1', 23, 'M', '15952086197', '123123');
INSERT INTO `tb_user` VALUES (1452, '7b8bb1', 23, 'M', '15952086198', '123123');
INSERT INTO `tb_user` VALUES (1453, '054fe2', 23, 'M', '15952086199', '123123');
INSERT INTO `tb_user` VALUES (1454, '2468f6', 23, 'M', '15952086200', '123123');
INSERT INTO `tb_user` VALUES (1455, '06a926', 23, 'M', '15952086201', '123123');
INSERT INTO `tb_user` VALUES (1456, '3d1b63', 23, 'M', '15952086102', '123123');
INSERT INTO `tb_user` VALUES (1457, '3bf9a2', 23, 'M', '15952086103', '123123');
INSERT INTO `tb_user` VALUES (1458, 'b19f83', 23, 'M', '15952086104', '123123');
INSERT INTO `tb_user` VALUES (1459, 'cfbf55', 23, 'M', '15952086105', '123123');
INSERT INTO `tb_user` VALUES (1460, 'ba731d', 23, 'M', '15952086106', '123123');
INSERT INTO `tb_user` VALUES (1461, 'f53140', 23, 'M', '15952086107', '123123');
INSERT INTO `tb_user` VALUES (1462, '75109a', 23, 'M', '15952086108', '123123');
INSERT INTO `tb_user` VALUES (1463, '218d62', 23, 'M', '15952086109', '123123');
INSERT INTO `tb_user` VALUES (1464, '4daf7d', 23, 'M', '15952086110', '123123');
INSERT INTO `tb_user` VALUES (1465, '700149', 23, 'M', '15952086111', '123123');
INSERT INTO `tb_user` VALUES (1466, '87b7fa', 23, 'M', '15952086112', '123123');
INSERT INTO `tb_user` VALUES (1467, '57678c', 23, 'M', '15952086113', '123123');
INSERT INTO `tb_user` VALUES (1468, '6cb8cb', 23, 'M', '15952086114', '123123');
INSERT INTO `tb_user` VALUES (1469, 'a5aa5b', 23, 'M', '15952086115', '123123');
INSERT INTO `tb_user` VALUES (1470, '74f14a', 23, 'M', '15952086116', '123123');
INSERT INTO `tb_user` VALUES (1471, '430c88', 23, 'M', '15952086117', '123123');
INSERT INTO `tb_user` VALUES (1472, '527831', 23, 'M', '15952086118', '123123');
INSERT INTO `tb_user` VALUES (1473, '20eb19', 23, 'M', '15952086119', '123123');
INSERT INTO `tb_user` VALUES (1474, '9242bf', 23, 'M', '15952086120', '123123');
INSERT INTO `tb_user` VALUES (1475, '73a0e0', 23, 'M', '15952086121', '123123');
INSERT INTO `tb_user` VALUES (1476, '36010a', 23, 'M', '15952086122', '123123');
INSERT INTO `tb_user` VALUES (1477, '18f700', 23, 'M', '15952086123', '123123');
INSERT INTO `tb_user` VALUES (1478, '861cdf', 23, 'M', '15952086124', '123123');
INSERT INTO `tb_user` VALUES (1479, '722387', 23, 'M', '15952086125', '123123');
INSERT INTO `tb_user` VALUES (1480, '834274', 23, 'M', '15952086126', '123123');
INSERT INTO `tb_user` VALUES (1481, '604bc4', 23, 'M', '15952086127', '123123');
INSERT INTO `tb_user` VALUES (1482, 'ba7ed3', 23, 'M', '15952086128', '123123');
INSERT INTO `tb_user` VALUES (1483, '78106d', 23, 'M', '15952086129', '123123');
INSERT INTO `tb_user` VALUES (1484, '173927', 23, 'M', '15952086130', '123123');
INSERT INTO `tb_user` VALUES (1485, '47b81a', 23, 'M', '15952086131', '123123');
INSERT INTO `tb_user` VALUES (1486, '15c4ea', 23, 'M', '15952086132', '123123');
INSERT INTO `tb_user` VALUES (1487, '09d939', 23, 'M', '15952086133', '123123');
INSERT INTO `tb_user` VALUES (1488, '03cec7', 23, 'M', '15952086134', '123123');
INSERT INTO `tb_user` VALUES (1489, 'f35bef', 23, 'M', '15952086135', '123123');
INSERT INTO `tb_user` VALUES (1490, '9bfc15', 23, 'M', '15952086136', '123123');
INSERT INTO `tb_user` VALUES (1491, 'bdf957', 23, 'M', '15952086137', '123123');
INSERT INTO `tb_user` VALUES (1492, 'a176f7', 23, 'M', '15952086138', '123123');
INSERT INTO `tb_user` VALUES (1493, '86b1d7', 23, 'M', '15952086139', '123123');
INSERT INTO `tb_user` VALUES (1494, '57004c', 23, 'M', '15952086140', '123123');
INSERT INTO `tb_user` VALUES (1495, '1623c1', 23, 'M', '15952086141', '123123');
INSERT INTO `tb_user` VALUES (1496, '3871c6', 23, 'M', '15952086142', '123123');
INSERT INTO `tb_user` VALUES (1497, '13ddb4', 23, 'M', '15952086143', '123123');
INSERT INTO `tb_user` VALUES (1498, '13a95a', 23, 'M', '15952086144', '123123');
INSERT INTO `tb_user` VALUES (1499, '570122', 23, 'M', '15952086145', '123123');
INSERT INTO `tb_user` VALUES (1500, 'febb09', 23, 'M', '15952086146', '123123');
INSERT INTO `tb_user` VALUES (1501, '1050e4', 23, 'M', '15952086147', '123123');
INSERT INTO `tb_user` VALUES (1502, '86036b', 23, 'M', '15952086148', '123123');
INSERT INTO `tb_user` VALUES (1503, '8afb64', 23, 'M', '15952086149', '123123');
INSERT INTO `tb_user` VALUES (1504, 'be9d51', 23, 'M', '15952086150', '123123');
INSERT INTO `tb_user` VALUES (1505, '2bc2b3', 23, 'M', '15952086151', '123123');
INSERT INTO `tb_user` VALUES (1506, '12eaac', 23, 'M', '15952086152', '123123');
INSERT INTO `tb_user` VALUES (1507, 'abd26c', 23, 'M', '15952086153', '123123');
INSERT INTO `tb_user` VALUES (1508, 'c68785', 23, 'M', '15952086154', '123123');
INSERT INTO `tb_user` VALUES (1509, '401c3a', 23, 'M', '15952086155', '123123');
INSERT INTO `tb_user` VALUES (1510, 'a37d11', 23, 'M', '15952086156', '123123');
INSERT INTO `tb_user` VALUES (1511, 'a934d8', 23, 'M', '15952086157', '123123');
INSERT INTO `tb_user` VALUES (1512, 'f3fb59', 23, 'M', '15952086158', '123123');
INSERT INTO `tb_user` VALUES (1513, '998c0f', 23, 'M', '15952086159', '123123');
INSERT INTO `tb_user` VALUES (1514, '58dc3c', 23, 'M', '15952086160', '123123');
INSERT INTO `tb_user` VALUES (1515, '9f0c96', 23, 'M', '15952086161', '123123');
INSERT INTO `tb_user` VALUES (1516, '541041', 23, 'M', '15952086162', '123123');
INSERT INTO `tb_user` VALUES (1517, '0e6a45', 23, 'M', '15952086163', '123123');
INSERT INTO `tb_user` VALUES (1518, 'b675e0', 23, 'M', '15952086164', '123123');
INSERT INTO `tb_user` VALUES (1519, '8aad9d', 23, 'M', '15952086165', '123123');
INSERT INTO `tb_user` VALUES (1520, '56b636', 23, 'M', '15952086166', '123123');
INSERT INTO `tb_user` VALUES (1521, '2391b2', 23, 'M', '15952086167', '123123');
INSERT INTO `tb_user` VALUES (1522, '037b1e', 23, 'M', '15952086168', '123123');
INSERT INTO `tb_user` VALUES (1523, '396136', 23, 'M', '15952086169', '123123');
INSERT INTO `tb_user` VALUES (1524, '3f8a03', 23, 'M', '15952086170', '123123');
INSERT INTO `tb_user` VALUES (1525, '37450b', 23, 'M', '15952086171', '123123');
INSERT INTO `tb_user` VALUES (1526, 'b439de', 23, 'M', '15952086172', '123123');
INSERT INTO `tb_user` VALUES (1527, '6e9e6b', 23, 'M', '15952086173', '123123');
INSERT INTO `tb_user` VALUES (1528, '596902', 23, 'M', '15952086174', '123123');
INSERT INTO `tb_user` VALUES (1529, '7acd67', 23, 'M', '15952086175', '123123');
INSERT INTO `tb_user` VALUES (1530, '9bf194', 23, 'M', '15952086176', '123123');
INSERT INTO `tb_user` VALUES (1531, 'c0faa9', 23, 'M', '15952086177', '123123');
INSERT INTO `tb_user` VALUES (1532, '67a2df', 23, 'M', '15952086178', '123123');
INSERT INTO `tb_user` VALUES (1533, 'd5397a', 23, 'M', '15952086179', '123123');
INSERT INTO `tb_user` VALUES (1534, '818bcd', 23, 'M', '15952086180', '123123');
INSERT INTO `tb_user` VALUES (1535, '6e6d32', 23, 'M', '15952086181', '123123');
INSERT INTO `tb_user` VALUES (1536, 'f56535', 23, 'M', '15952086182', '123123');
INSERT INTO `tb_user` VALUES (1537, '104a87', 23, 'M', '15952086183', '123123');
INSERT INTO `tb_user` VALUES (1538, '2dec18', 23, 'M', '15952086184', '123123');
INSERT INTO `tb_user` VALUES (1539, 'a1c558', 23, 'M', '15952086185', '123123');
INSERT INTO `tb_user` VALUES (1540, '7e80d3', 23, 'M', '15952086186', '123123');
INSERT INTO `tb_user` VALUES (1541, '99e16b', 23, 'M', '15952086187', '123123');
INSERT INTO `tb_user` VALUES (1542, 'd25c44', 23, 'M', '15952086188', '123123');
INSERT INTO `tb_user` VALUES (1543, 'ea2b1c', 23, 'M', '15952086189', '123123');
INSERT INTO `tb_user` VALUES (1544, '9e8bae', 23, 'M', '15952086190', '123123');
INSERT INTO `tb_user` VALUES (1545, 'ea4801', 23, 'M', '15952086191', '123123');
INSERT INTO `tb_user` VALUES (1546, '1f14d5', 23, 'M', '15952086192', '123123');
INSERT INTO `tb_user` VALUES (1547, '0dc5b8', 23, 'M', '15952086193', '123123');
INSERT INTO `tb_user` VALUES (1548, 'a855e2', 23, 'M', '15952086194', '123123');
INSERT INTO `tb_user` VALUES (1549, 'ac845e', 23, 'M', '15952086195', '123123');
INSERT INTO `tb_user` VALUES (1550, '2bb5ad', 23, 'M', '15952086196', '123123');
INSERT INTO `tb_user` VALUES (1551, '7c5094', 23, 'M', '15952086197', '123123');
INSERT INTO `tb_user` VALUES (1552, 'fac9fb', 23, 'M', '15952086198', '123123');
INSERT INTO `tb_user` VALUES (1553, '0e659c', 23, 'M', '15952086199', '123123');
INSERT INTO `tb_user` VALUES (1554, '84fa6e', 23, 'M', '15952086200', '123123');
INSERT INTO `tb_user` VALUES (1555, '9547cb', 23, 'M', '15952086201', '123123');
INSERT INTO `tb_user` VALUES (1556, '23a0b1', 23, 'M', '15952086102', '123123');
INSERT INTO `tb_user` VALUES (1557, '50227b', 23, 'M', '15952086103', '123123');
INSERT INTO `tb_user` VALUES (1558, '17a807', 23, 'M', '15952086104', '123123');
INSERT INTO `tb_user` VALUES (1559, '8f0d3f', 23, 'M', '15952086105', '123123');
INSERT INTO `tb_user` VALUES (1560, '2f394a', 23, 'M', '15952086106', '123123');
INSERT INTO `tb_user` VALUES (1561, 'c1de3c', 23, 'M', '15952086107', '123123');
INSERT INTO `tb_user` VALUES (1562, '3fa078', 23, 'M', '15952086108', '123123');
INSERT INTO `tb_user` VALUES (1563, 'dd88e5', 23, 'M', '15952086109', '123123');
INSERT INTO `tb_user` VALUES (1564, 'cdef8b', 23, 'M', '15952086110', '123123');
INSERT INTO `tb_user` VALUES (1565, '406b3e', 23, 'M', '15952086111', '123123');
INSERT INTO `tb_user` VALUES (1566, '3492ed', 23, 'M', '15952086112', '123123');
INSERT INTO `tb_user` VALUES (1567, '23e6be', 23, 'M', '15952086113', '123123');
INSERT INTO `tb_user` VALUES (1568, 'af4670', 23, 'M', '15952086114', '123123');
INSERT INTO `tb_user` VALUES (1569, '28583c', 23, 'M', '15952086115', '123123');
INSERT INTO `tb_user` VALUES (1570, 'aa418c', 23, 'M', '15952086116', '123123');
INSERT INTO `tb_user` VALUES (1571, '4664f4', 23, 'M', '15952086117', '123123');
INSERT INTO `tb_user` VALUES (1572, 'd53900', 23, 'M', '15952086118', '123123');
INSERT INTO `tb_user` VALUES (1573, 'f54040', 23, 'M', '15952086119', '123123');
INSERT INTO `tb_user` VALUES (1574, 'e64e68', 23, 'M', '15952086120', '123123');
INSERT INTO `tb_user` VALUES (1575, 'cc78a2', 23, 'M', '15952086121', '123123');
INSERT INTO `tb_user` VALUES (1576, 'b31556', 23, 'M', '15952086122', '123123');
INSERT INTO `tb_user` VALUES (1577, 'bffe18', 23, 'M', '15952086123', '123123');
INSERT INTO `tb_user` VALUES (1578, 'e6ceeb', 23, 'M', '15952086124', '123123');
INSERT INTO `tb_user` VALUES (1579, '0414f8', 23, 'M', '15952086125', '123123');
INSERT INTO `tb_user` VALUES (1580, 'a1cce9', 23, 'M', '15952086126', '123123');
INSERT INTO `tb_user` VALUES (1581, '2d5dca', 23, 'M', '15952086127', '123123');
INSERT INTO `tb_user` VALUES (1582, 'c40182', 23, 'M', '15952086128', '123123');
INSERT INTO `tb_user` VALUES (1583, '83c51d', 23, 'M', '15952086129', '123123');
INSERT INTO `tb_user` VALUES (1584, '2133bf', 23, 'M', '15952086130', '123123');
INSERT INTO `tb_user` VALUES (1585, '4a1c05', 23, 'M', '15952086131', '123123');
INSERT INTO `tb_user` VALUES (1586, '16eb67', 23, 'M', '15952086132', '123123');
INSERT INTO `tb_user` VALUES (1587, '089302', 23, 'M', '15952086133', '123123');
INSERT INTO `tb_user` VALUES (1588, '459f72', 23, 'M', '15952086134', '123123');
INSERT INTO `tb_user` VALUES (1589, 'b75c95', 23, 'M', '15952086135', '123123');
INSERT INTO `tb_user` VALUES (1590, '6f279b', 23, 'M', '15952086136', '123123');
INSERT INTO `tb_user` VALUES (1591, 'f71d3c', 23, 'M', '15952086137', '123123');
INSERT INTO `tb_user` VALUES (1592, 'ec644b', 23, 'M', '15952086138', '123123');
INSERT INTO `tb_user` VALUES (1593, 'ced7de', 23, 'M', '15952086139', '123123');
INSERT INTO `tb_user` VALUES (1594, '36dd9a', 23, 'M', '15952086140', '123123');
INSERT INTO `tb_user` VALUES (1595, 'd37129', 23, 'M', '15952086141', '123123');
INSERT INTO `tb_user` VALUES (1596, '3d0042', 23, 'M', '15952086142', '123123');
INSERT INTO `tb_user` VALUES (1597, 'ea8c32', 23, 'M', '15952086143', '123123');
INSERT INTO `tb_user` VALUES (1598, 'fdcb21', 23, 'M', '15952086144', '123123');
INSERT INTO `tb_user` VALUES (1599, 'bd57dd', 23, 'M', '15952086145', '123123');
INSERT INTO `tb_user` VALUES (1600, '67e71a', 23, 'M', '15952086146', '123123');
INSERT INTO `tb_user` VALUES (1601, 'afb25b', 23, 'M', '15952086147', '123123');
INSERT INTO `tb_user` VALUES (1602, '0cac76', 23, 'M', '15952086148', '123123');
INSERT INTO `tb_user` VALUES (1603, 'c5bd6a', 23, 'M', '15952086149', '123123');
INSERT INTO `tb_user` VALUES (1604, '9b642a', 23, 'M', '15952086150', '123123');
INSERT INTO `tb_user` VALUES (1605, 'a6588f', 23, 'M', '15952086151', '123123');
INSERT INTO `tb_user` VALUES (1606, '565dea', 23, 'M', '15952086152', '123123');
INSERT INTO `tb_user` VALUES (1607, 'b0b7f9', 23, 'M', '15952086153', '123123');
INSERT INTO `tb_user` VALUES (1608, '13fbf7', 23, 'M', '15952086154', '123123');
INSERT INTO `tb_user` VALUES (1609, '716fdf', 23, 'M', '15952086155', '123123');
INSERT INTO `tb_user` VALUES (1610, '6ed4e0', 23, 'M', '15952086156', '123123');
INSERT INTO `tb_user` VALUES (1611, 'c4c8da', 23, 'M', '15952086157', '123123');
INSERT INTO `tb_user` VALUES (1612, '2b10f9', 23, 'M', '15952086158', '123123');
INSERT INTO `tb_user` VALUES (1613, '16e9be', 23, 'M', '15952086159', '123123');
INSERT INTO `tb_user` VALUES (1614, '4b3760', 23, 'M', '15952086160', '123123');
INSERT INTO `tb_user` VALUES (1615, '59a116', 23, 'M', '15952086161', '123123');
INSERT INTO `tb_user` VALUES (1616, '6f40a9', 23, 'M', '15952086162', '123123');
INSERT INTO `tb_user` VALUES (1617, 'bf2439', 23, 'M', '15952086163', '123123');
INSERT INTO `tb_user` VALUES (1618, 'd12914', 23, 'M', '15952086164', '123123');
INSERT INTO `tb_user` VALUES (1619, '82334a', 23, 'M', '15952086165', '123123');
INSERT INTO `tb_user` VALUES (1620, 'cd3196', 23, 'M', '15952086166', '123123');
INSERT INTO `tb_user` VALUES (1621, '2e7c51', 23, 'M', '15952086167', '123123');
INSERT INTO `tb_user` VALUES (1622, '857beb', 23, 'M', '15952086168', '123123');
INSERT INTO `tb_user` VALUES (1623, 'cde4b2', 23, 'M', '15952086169', '123123');
INSERT INTO `tb_user` VALUES (1624, '7f79b0', 23, 'M', '15952086170', '123123');
INSERT INTO `tb_user` VALUES (1625, '201e59', 23, 'M', '15952086171', '123123');
INSERT INTO `tb_user` VALUES (1626, '2af0ba', 23, 'M', '15952086172', '123123');
INSERT INTO `tb_user` VALUES (1627, 'f6464c', 23, 'M', '15952086173', '123123');
INSERT INTO `tb_user` VALUES (1628, '19195e', 23, 'M', '15952086174', '123123');
INSERT INTO `tb_user` VALUES (1629, '67c0e9', 23, 'M', '15952086175', '123123');
INSERT INTO `tb_user` VALUES (1630, '5adfbe', 23, 'M', '15952086176', '123123');
INSERT INTO `tb_user` VALUES (1631, 'f4bc77', 23, 'M', '15952086177', '123123');
INSERT INTO `tb_user` VALUES (1632, '8c7fe1', 23, 'M', '15952086178', '123123');
INSERT INTO `tb_user` VALUES (1633, 'f685f4', 23, 'M', '15952086179', '123123');
INSERT INTO `tb_user` VALUES (1634, 'ad7aad', 23, 'M', '15952086180', '123123');
INSERT INTO `tb_user` VALUES (1635, '7315e0', 23, 'M', '15952086181', '123123');
INSERT INTO `tb_user` VALUES (1636, '996bfd', 23, 'M', '15952086182', '123123');
INSERT INTO `tb_user` VALUES (1637, '37184a', 23, 'M', '15952086183', '123123');
INSERT INTO `tb_user` VALUES (1638, 'ab79f5', 23, 'M', '15952086184', '123123');
INSERT INTO `tb_user` VALUES (1639, '8cc8a1', 23, 'M', '15952086185', '123123');
INSERT INTO `tb_user` VALUES (1640, '13bbb5', 23, 'M', '15952086186', '123123');
INSERT INTO `tb_user` VALUES (1641, 'a67359', 23, 'M', '15952086187', '123123');
INSERT INTO `tb_user` VALUES (1642, 'a4b623', 23, 'M', '15952086188', '123123');
INSERT INTO `tb_user` VALUES (1643, 'dad699', 23, 'M', '15952086189', '123123');
INSERT INTO `tb_user` VALUES (1644, 'a3f321', 23, 'M', '15952086190', '123123');
INSERT INTO `tb_user` VALUES (1645, 'e0c38e', 23, 'M', '15952086191', '123123');
INSERT INTO `tb_user` VALUES (1646, 'c6de2b', 23, 'M', '15952086192', '123123');
INSERT INTO `tb_user` VALUES (1647, '5e4bad', 23, 'M', '15952086193', '123123');
INSERT INTO `tb_user` VALUES (1648, 'e46b12', 23, 'M', '15952086194', '123123');
INSERT INTO `tb_user` VALUES (1649, 'd9257c', 23, 'M', '15952086195', '123123');
INSERT INTO `tb_user` VALUES (1650, 'e7a35a', 23, 'M', '15952086196', '123123');
INSERT INTO `tb_user` VALUES (1651, '2e0aa6', 23, 'M', '15952086197', '123123');
INSERT INTO `tb_user` VALUES (1652, 'a4bb9b', 23, 'M', '15952086198', '123123');
INSERT INTO `tb_user` VALUES (1653, 'd45bef', 23, 'M', '15952086199', '123123');
INSERT INTO `tb_user` VALUES (1654, '0b82eb', 23, 'M', '15952086200', '123123');
INSERT INTO `tb_user` VALUES (1655, '07be10', 23, 'M', '15952086201', '123123');
INSERT INTO `tb_user` VALUES (1656, '9aabe7', 23, 'M', '15952086102', '123123');
INSERT INTO `tb_user` VALUES (1657, '3a5205', 23, 'M', '15952086103', '123123');
INSERT INTO `tb_user` VALUES (1658, '741492', 23, 'M', '15952086104', '123123');
INSERT INTO `tb_user` VALUES (1659, 'd288ba', 23, 'M', '15952086105', '123123');
INSERT INTO `tb_user` VALUES (1660, '3da142', 23, 'M', '15952086106', '123123');
INSERT INTO `tb_user` VALUES (1661, '74cf59', 23, 'M', '15952086107', '123123');
INSERT INTO `tb_user` VALUES (1662, '693c76', 23, 'M', '15952086108', '123123');
INSERT INTO `tb_user` VALUES (1663, '7e6e42', 23, 'M', '15952086109', '123123');
INSERT INTO `tb_user` VALUES (1664, '619ed1', 23, 'M', '15952086110', '123123');
INSERT INTO `tb_user` VALUES (1665, '5956c5', 23, 'M', '15952086111', '123123');
INSERT INTO `tb_user` VALUES (1666, '29326d', 23, 'M', '15952086112', '123123');
INSERT INTO `tb_user` VALUES (1667, 'ae345b', 23, 'M', '15952086113', '123123');
INSERT INTO `tb_user` VALUES (1668, 'd1bf39', 23, 'M', '15952086114', '123123');
INSERT INTO `tb_user` VALUES (1669, 'ce7e96', 23, 'M', '15952086115', '123123');
INSERT INTO `tb_user` VALUES (1670, '93f224', 23, 'M', '15952086116', '123123');
INSERT INTO `tb_user` VALUES (1671, '637a6e', 23, 'M', '15952086117', '123123');
INSERT INTO `tb_user` VALUES (1672, '5ae31b', 23, 'M', '15952086118', '123123');
INSERT INTO `tb_user` VALUES (1673, '2d6374', 23, 'M', '15952086119', '123123');
INSERT INTO `tb_user` VALUES (1674, 'e0beab', 23, 'M', '15952086120', '123123');
INSERT INTO `tb_user` VALUES (1675, '584693', 23, 'M', '15952086121', '123123');
INSERT INTO `tb_user` VALUES (1676, 'c6747e', 23, 'M', '15952086122', '123123');
INSERT INTO `tb_user` VALUES (1677, '9aec60', 23, 'M', '15952086123', '123123');
INSERT INTO `tb_user` VALUES (1678, 'c25522', 23, 'M', '15952086124', '123123');
INSERT INTO `tb_user` VALUES (1679, '1f1600', 23, 'M', '15952086125', '123123');
INSERT INTO `tb_user` VALUES (1680, '5c0528', 23, 'M', '15952086126', '123123');
INSERT INTO `tb_user` VALUES (1681, '0f746b', 23, 'M', '15952086127', '123123');
INSERT INTO `tb_user` VALUES (1682, '96d83a', 23, 'M', '15952086128', '123123');
INSERT INTO `tb_user` VALUES (1683, 'd9b5c2', 23, 'M', '15952086129', '123123');
INSERT INTO `tb_user` VALUES (1684, 'e49e7c', 23, 'M', '15952086130', '123123');
INSERT INTO `tb_user` VALUES (1685, '5ac923', 23, 'M', '15952086131', '123123');
INSERT INTO `tb_user` VALUES (1686, '01081e', 23, 'M', '15952086132', '123123');
INSERT INTO `tb_user` VALUES (1687, 'd7cd46', 23, 'M', '15952086133', '123123');
INSERT INTO `tb_user` VALUES (1688, 'ba7014', 23, 'M', '15952086134', '123123');
INSERT INTO `tb_user` VALUES (1689, '978146', 23, 'M', '15952086135', '123123');
INSERT INTO `tb_user` VALUES (1690, 'ac636f', 23, 'M', '15952086136', '123123');
INSERT INTO `tb_user` VALUES (1691, '7ca4f9', 23, 'M', '15952086137', '123123');
INSERT INTO `tb_user` VALUES (1692, '68d772', 23, 'M', '15952086138', '123123');
INSERT INTO `tb_user` VALUES (1693, '331e21', 23, 'M', '15952086139', '123123');
INSERT INTO `tb_user` VALUES (1694, 'b92fbd', 23, 'M', '15952086140', '123123');
INSERT INTO `tb_user` VALUES (1695, '7c3a18', 23, 'M', '15952086141', '123123');
INSERT INTO `tb_user` VALUES (1696, '93a924', 23, 'M', '15952086142', '123123');
INSERT INTO `tb_user` VALUES (1697, '6228de', 23, 'M', '15952086143', '123123');
INSERT INTO `tb_user` VALUES (1698, '65bd5a', 23, 'M', '15952086144', '123123');
INSERT INTO `tb_user` VALUES (1699, '0c7d29', 23, 'M', '15952086145', '123123');
INSERT INTO `tb_user` VALUES (1700, '3c1396', 23, 'M', '15952086146', '123123');
INSERT INTO `tb_user` VALUES (1701, 'a88afe', 23, 'M', '15952086147', '123123');
INSERT INTO `tb_user` VALUES (1702, '9d20a5', 23, 'M', '15952086148', '123123');
INSERT INTO `tb_user` VALUES (1703, '3a5350', 23, 'M', '15952086149', '123123');
INSERT INTO `tb_user` VALUES (1704, 'e78326', 23, 'M', '15952086150', '123123');
INSERT INTO `tb_user` VALUES (1705, '3c3b2e', 23, 'M', '15952086151', '123123');
INSERT INTO `tb_user` VALUES (1706, 'e2f9c6', 23, 'M', '15952086152', '123123');
INSERT INTO `tb_user` VALUES (1707, '90b293', 23, 'M', '15952086153', '123123');
INSERT INTO `tb_user` VALUES (1708, '9d1200', 23, 'M', '15952086154', '123123');
INSERT INTO `tb_user` VALUES (1709, 'e99e77', 23, 'M', '15952086155', '123123');
INSERT INTO `tb_user` VALUES (1710, '7cd17d', 23, 'M', '15952086156', '123123');
INSERT INTO `tb_user` VALUES (1711, 'e8eb36', 23, 'M', '15952086157', '123123');
INSERT INTO `tb_user` VALUES (1712, '3193ef', 23, 'M', '15952086158', '123123');
INSERT INTO `tb_user` VALUES (1713, '98178b', 23, 'M', '15952086159', '123123');
INSERT INTO `tb_user` VALUES (1714, 'f1465c', 23, 'M', '15952086160', '123123');
INSERT INTO `tb_user` VALUES (1715, '267274', 23, 'M', '15952086161', '123123');
INSERT INTO `tb_user` VALUES (1716, 'e972aa', 23, 'M', '15952086162', '123123');
INSERT INTO `tb_user` VALUES (1717, '431656', 23, 'M', '15952086163', '123123');
INSERT INTO `tb_user` VALUES (1718, '1317c0', 23, 'M', '15952086164', '123123');
INSERT INTO `tb_user` VALUES (1719, 'e292b3', 23, 'M', '15952086165', '123123');
INSERT INTO `tb_user` VALUES (1720, '1e6593', 23, 'M', '15952086166', '123123');
INSERT INTO `tb_user` VALUES (1721, '93f14a', 23, 'M', '15952086167', '123123');
INSERT INTO `tb_user` VALUES (1722, 'f02a71', 23, 'M', '15952086168', '123123');
INSERT INTO `tb_user` VALUES (1723, '60ce13', 23, 'M', '15952086169', '123123');
INSERT INTO `tb_user` VALUES (1724, 'c120c4', 23, 'M', '15952086170', '123123');
INSERT INTO `tb_user` VALUES (1725, '6ce91b', 23, 'M', '15952086171', '123123');
INSERT INTO `tb_user` VALUES (1726, '6e74ac', 23, 'M', '15952086172', '123123');
INSERT INTO `tb_user` VALUES (1727, '3fac67', 23, 'M', '15952086173', '123123');
INSERT INTO `tb_user` VALUES (1728, 'b8a8b0', 23, 'M', '15952086174', '123123');
INSERT INTO `tb_user` VALUES (1729, 'dd0b44', 23, 'M', '15952086175', '123123');
INSERT INTO `tb_user` VALUES (1730, 'ae6222', 23, 'M', '15952086176', '123123');
INSERT INTO `tb_user` VALUES (1731, '42c329', 23, 'M', '15952086177', '123123');
INSERT INTO `tb_user` VALUES (1732, 'bb60ee', 23, 'M', '15952086178', '123123');
INSERT INTO `tb_user` VALUES (1733, '985c41', 23, 'M', '15952086179', '123123');
INSERT INTO `tb_user` VALUES (1734, 'b4b180', 23, 'M', '15952086180', '123123');
INSERT INTO `tb_user` VALUES (1735, '8ce2fd', 23, 'M', '15952086181', '123123');
INSERT INTO `tb_user` VALUES (1736, '492180', 23, 'M', '15952086182', '123123');
INSERT INTO `tb_user` VALUES (1737, '2c1bb0', 23, 'M', '15952086183', '123123');
INSERT INTO `tb_user` VALUES (1738, 'd58154', 23, 'M', '15952086184', '123123');
INSERT INTO `tb_user` VALUES (1739, '1baddf', 23, 'M', '15952086185', '123123');
INSERT INTO `tb_user` VALUES (1740, 'cecaef', 23, 'M', '15952086186', '123123');
INSERT INTO `tb_user` VALUES (1741, '2d243a', 23, 'M', '15952086187', '123123');
INSERT INTO `tb_user` VALUES (1742, '053b75', 23, 'M', '15952086188', '123123');
INSERT INTO `tb_user` VALUES (1743, '1d61a4', 23, 'M', '15952086189', '123123');
INSERT INTO `tb_user` VALUES (1744, 'aa19ae', 23, 'M', '15952086190', '123123');
INSERT INTO `tb_user` VALUES (1745, '66569a', 23, 'M', '15952086191', '123123');
INSERT INTO `tb_user` VALUES (1746, 'daee82', 23, 'M', '15952086192', '123123');
INSERT INTO `tb_user` VALUES (1747, '93f23c', 23, 'M', '15952086193', '123123');
INSERT INTO `tb_user` VALUES (1748, '06cd2e', 23, 'M', '15952086194', '123123');
INSERT INTO `tb_user` VALUES (1749, 'ec8921', 23, 'M', '15952086195', '123123');
INSERT INTO `tb_user` VALUES (1750, 'c31963', 23, 'M', '15952086196', '123123');
INSERT INTO `tb_user` VALUES (1751, '929b26', 23, 'M', '15952086197', '123123');
INSERT INTO `tb_user` VALUES (1752, '393258', 23, 'M', '15952086198', '123123');
INSERT INTO `tb_user` VALUES (1753, '132015', 23, 'M', '15952086199', '123123');
INSERT INTO `tb_user` VALUES (1754, 'f19b34', 23, 'M', '15952086200', '123123');
INSERT INTO `tb_user` VALUES (1755, 'e01cab', 23, 'M', '15952086201', '123123');
INSERT INTO `tb_user` VALUES (1756, 'd192ed', 23, 'M', '15952086102', '123123');
INSERT INTO `tb_user` VALUES (1757, 'a4fd2d', 23, 'M', '15952086103', '123123');
INSERT INTO `tb_user` VALUES (1758, '2e3407', 23, 'M', '15952086104', '123123');
INSERT INTO `tb_user` VALUES (1759, '214041', 23, 'M', '15952086105', '123123');
INSERT INTO `tb_user` VALUES (1760, '3e5c35', 23, 'M', '15952086106', '123123');
INSERT INTO `tb_user` VALUES (1761, '310641', 23, 'M', '15952086107', '123123');
INSERT INTO `tb_user` VALUES (1762, '06faa5', 23, 'M', '15952086108', '123123');
INSERT INTO `tb_user` VALUES (1763, '92c964', 23, 'M', '15952086109', '123123');
INSERT INTO `tb_user` VALUES (1764, '6008eb', 23, 'M', '15952086110', '123123');
INSERT INTO `tb_user` VALUES (1765, 'b699f8', 23, 'M', '15952086111', '123123');
INSERT INTO `tb_user` VALUES (1766, '210691', 23, 'M', '15952086112', '123123');
INSERT INTO `tb_user` VALUES (1767, '830e0f', 23, 'M', '15952086113', '123123');
INSERT INTO `tb_user` VALUES (1768, '3d36ac', 23, 'M', '15952086114', '123123');
INSERT INTO `tb_user` VALUES (1769, '518797', 23, 'M', '15952086115', '123123');
INSERT INTO `tb_user` VALUES (1770, 'ccf78a', 23, 'M', '15952086116', '123123');
INSERT INTO `tb_user` VALUES (1771, 'aee2bf', 23, 'M', '15952086117', '123123');
INSERT INTO `tb_user` VALUES (1772, 'e4a560', 23, 'M', '15952086118', '123123');
INSERT INTO `tb_user` VALUES (1773, '6fa977', 23, 'M', '15952086119', '123123');
INSERT INTO `tb_user` VALUES (1774, '9b9c87', 23, 'M', '15952086120', '123123');
INSERT INTO `tb_user` VALUES (1775, '5ff7e5', 23, 'M', '15952086121', '123123');
INSERT INTO `tb_user` VALUES (1776, '099600', 23, 'M', '15952086122', '123123');
INSERT INTO `tb_user` VALUES (1777, 'c20eeb', 23, 'M', '15952086123', '123123');
INSERT INTO `tb_user` VALUES (1778, 'a2eb9e', 23, 'M', '15952086124', '123123');
INSERT INTO `tb_user` VALUES (1779, 'fe408a', 23, 'M', '15952086125', '123123');
INSERT INTO `tb_user` VALUES (1780, 'f6df39', 23, 'M', '15952086126', '123123');
INSERT INTO `tb_user` VALUES (1781, 'f82a1e', 23, 'M', '15952086127', '123123');
INSERT INTO `tb_user` VALUES (1782, '9408e2', 23, 'M', '15952086128', '123123');
INSERT INTO `tb_user` VALUES (1783, '7a79b7', 23, 'M', '15952086129', '123123');
INSERT INTO `tb_user` VALUES (1784, '93c829', 23, 'M', '15952086130', '123123');
INSERT INTO `tb_user` VALUES (1785, '777470', 23, 'M', '15952086131', '123123');
INSERT INTO `tb_user` VALUES (1786, '544b38', 23, 'M', '15952086132', '123123');
INSERT INTO `tb_user` VALUES (1787, 'def7aa', 23, 'M', '15952086133', '123123');
INSERT INTO `tb_user` VALUES (1788, 'c62b26', 23, 'M', '15952086134', '123123');
INSERT INTO `tb_user` VALUES (1789, 'f0764f', 23, 'M', '15952086135', '123123');
INSERT INTO `tb_user` VALUES (1790, 'e033c1', 23, 'M', '15952086136', '123123');
INSERT INTO `tb_user` VALUES (1791, 'a139a8', 23, 'M', '15952086137', '123123');
INSERT INTO `tb_user` VALUES (1792, 'ce498a', 23, 'M', '15952086138', '123123');
INSERT INTO `tb_user` VALUES (1793, '8c734b', 23, 'M', '15952086139', '123123');
INSERT INTO `tb_user` VALUES (1794, '46c671', 23, 'M', '15952086140', '123123');
INSERT INTO `tb_user` VALUES (1795, '869cc1', 23, 'M', '15952086141', '123123');
INSERT INTO `tb_user` VALUES (1796, 'fb6707', 23, 'M', '15952086142', '123123');
INSERT INTO `tb_user` VALUES (1797, '43d33f', 23, 'M', '15952086143', '123123');
INSERT INTO `tb_user` VALUES (1798, '33b09a', 23, 'M', '15952086144', '123123');
INSERT INTO `tb_user` VALUES (1799, '70faf2', 23, 'M', '15952086145', '123123');
INSERT INTO `tb_user` VALUES (1800, '1359a4', 23, 'M', '15952086146', '123123');
INSERT INTO `tb_user` VALUES (1801, '86036e', 23, 'M', '15952086147', '123123');
INSERT INTO `tb_user` VALUES (1802, 'dc5109', 23, 'M', '15952086148', '123123');
INSERT INTO `tb_user` VALUES (1803, '882fd3', 23, 'M', '15952086149', '123123');
INSERT INTO `tb_user` VALUES (1804, '243216', 23, 'M', '15952086150', '123123');
INSERT INTO `tb_user` VALUES (1805, '9b08ca', 23, 'M', '15952086151', '123123');
INSERT INTO `tb_user` VALUES (1806, 'b1475f', 23, 'M', '15952086152', '123123');
INSERT INTO `tb_user` VALUES (1807, '60a8af', 23, 'M', '15952086153', '123123');
INSERT INTO `tb_user` VALUES (1808, '0d8a68', 23, 'M', '15952086154', '123123');
INSERT INTO `tb_user` VALUES (1809, '681bf6', 23, 'M', '15952086155', '123123');
INSERT INTO `tb_user` VALUES (1810, 'a6afda', 23, 'M', '15952086156', '123123');
INSERT INTO `tb_user` VALUES (1811, '966663', 23, 'M', '15952086157', '123123');
INSERT INTO `tb_user` VALUES (1812, '4cca82', 23, 'M', '15952086158', '123123');
INSERT INTO `tb_user` VALUES (1813, '739b41', 23, 'M', '15952086159', '123123');
INSERT INTO `tb_user` VALUES (1814, 'af3ff2', 23, 'M', '15952086160', '123123');
INSERT INTO `tb_user` VALUES (1815, '7d1735', 23, 'M', '15952086161', '123123');
INSERT INTO `tb_user` VALUES (1816, 'dbf751', 23, 'M', '15952086162', '123123');
INSERT INTO `tb_user` VALUES (1817, '3597e5', 23, 'M', '15952086163', '123123');
INSERT INTO `tb_user` VALUES (1818, '34bc21', 23, 'M', '15952086164', '123123');
INSERT INTO `tb_user` VALUES (1819, '814434', 23, 'M', '15952086165', '123123');
INSERT INTO `tb_user` VALUES (1820, '11d0f1', 23, 'M', '15952086166', '123123');
INSERT INTO `tb_user` VALUES (1821, '602ea6', 23, 'M', '15952086167', '123123');
INSERT INTO `tb_user` VALUES (1822, '12745f', 23, 'M', '15952086168', '123123');
INSERT INTO `tb_user` VALUES (1823, '1eeca0', 23, 'M', '15952086169', '123123');
INSERT INTO `tb_user` VALUES (1824, '32f4f1', 23, 'M', '15952086170', '123123');
INSERT INTO `tb_user` VALUES (1825, '5bc065', 23, 'M', '15952086171', '123123');
INSERT INTO `tb_user` VALUES (1826, '9edd53', 23, 'M', '15952086172', '123123');
INSERT INTO `tb_user` VALUES (1827, '758bfa', 23, 'M', '15952086173', '123123');
INSERT INTO `tb_user` VALUES (1828, 'b88275', 23, 'M', '15952086174', '123123');
INSERT INTO `tb_user` VALUES (1829, '443447', 23, 'M', '15952086175', '123123');
INSERT INTO `tb_user` VALUES (1830, '9e4ac6', 23, 'M', '15952086176', '123123');
INSERT INTO `tb_user` VALUES (1831, '5e3b89', 23, 'M', '15952086177', '123123');
INSERT INTO `tb_user` VALUES (1832, '0e4d2b', 23, 'M', '15952086178', '123123');
INSERT INTO `tb_user` VALUES (1833, '845514', 23, 'M', '15952086179', '123123');
INSERT INTO `tb_user` VALUES (1834, 'bc1dd7', 23, 'M', '15952086180', '123123');
INSERT INTO `tb_user` VALUES (1835, 'c92441', 23, 'M', '15952086181', '123123');
INSERT INTO `tb_user` VALUES (1836, '5c9753', 23, 'M', '15952086182', '123123');
INSERT INTO `tb_user` VALUES (1837, '075086', 23, 'M', '15952086183', '123123');
INSERT INTO `tb_user` VALUES (1838, '17b4bb', 23, 'M', '15952086184', '123123');
INSERT INTO `tb_user` VALUES (1839, '3c10a3', 23, 'M', '15952086185', '123123');
INSERT INTO `tb_user` VALUES (1840, '0b8f7e', 23, 'M', '15952086186', '123123');
INSERT INTO `tb_user` VALUES (1841, '6c5de7', 23, 'M', '15952086187', '123123');
INSERT INTO `tb_user` VALUES (1842, '0112b5', 23, 'M', '15952086188', '123123');
INSERT INTO `tb_user` VALUES (1843, 'ebfd0e', 23, 'M', '15952086189', '123123');
INSERT INTO `tb_user` VALUES (1844, '77c05d', 23, 'M', '15952086190', '123123');
INSERT INTO `tb_user` VALUES (1845, '71ee0e', 23, 'M', '15952086191', '123123');
INSERT INTO `tb_user` VALUES (1846, 'd577e3', 23, 'M', '15952086192', '123123');
INSERT INTO `tb_user` VALUES (1847, 'e54632', 23, 'M', '15952086193', '123123');
INSERT INTO `tb_user` VALUES (1848, '0ab1e0', 23, 'M', '15952086194', '123123');
INSERT INTO `tb_user` VALUES (1849, '6c9d54', 23, 'M', '15952086195', '123123');
INSERT INTO `tb_user` VALUES (1850, 'cf14f9', 23, 'M', '15952086196', '123123');
INSERT INTO `tb_user` VALUES (1851, 'c18be9', 23, 'M', '15952086197', '123123');
INSERT INTO `tb_user` VALUES (1852, '146505', 23, 'M', '15952086198', '123123');
INSERT INTO `tb_user` VALUES (1859, 'zfx4567', 33, 'M', '12321335555', '123123');

SET FOREIGN_KEY_CHECKS = 1;
