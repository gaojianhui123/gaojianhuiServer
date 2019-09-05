/*
 Navicat Premium Data Transfer

 Source Server         : 留置系统
 Source Server Type    : MySQL
 Source Server Version : 50718
 Source Host           : 47.93.29.226:3306
 Source Schema         : liuzhixitong

 Target Server Type    : MySQL
 Target Server Version : 50718
 File Encoding         : 65001

 Date: 21/06/2019 15:01:07
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_baozhangshenqing
-- ----------------------------
DROP TABLE IF EXISTS `t_baozhangshenqing`;
CREATE TABLE `t_baozhangshenqing`  (
  `id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `createrid` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `createtime` varchar(19) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `deleted` bit(1) DEFAULT NULL,
  `title` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `apply` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `applyStatus` varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `bumen` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `chengbanbumen` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `remark` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `lpId` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tianBaoTime` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `matter` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `bumens` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_baozhangshenqing
-- ----------------------------
INSERT INTO `t_baozhangshenqing` VALUES ('2c9acde9697f19ff0169854a71430004', NULL, '2019-03-16 14:57:22', b'0', NULL, '1QQQQQ', '2', NULL, 'AAAA', 'QQQQQQQQQQ', '4028928769473ec20169474c408d0001', '2019-03-16', 'QQQ', '4028928b6781689b016782290b030001');
INSERT INTO `t_baozhangshenqing` VALUES ('2c9acde969996257016999662f960004', NULL, '2019-03-20 12:40:04', b'0', NULL, 'ssss', '2', NULL, 'ssss', 'ssssssss', '4028928769473ec20169474c408d0001', '2019-03-20', 'ssss', NULL);
INSERT INTO `t_baozhangshenqing` VALUES ('2c9acde969e676180169e73710430003', NULL, '2019-04-04 15:18:59', b'0', NULL, 'XXXX', '1', '40289287684eed6201684f3c74780017', 'XXXXX', 'XXXX', '4028928f690d793901690e5180a10005', '2019-04-04', 'XXXX', NULL);
INSERT INTO `t_baozhangshenqing` VALUES ('2c9acde969fab7c90169fad567e10000', NULL, '2019-04-08 10:44:43', b'1', NULL, '111111', '1', '40289287684eed6201684f3c74780017', '111111', '111111', '4028928f690d793901690e5180a10005', '2019-04-08', '111111', NULL);
INSERT INTO `t_baozhangshenqing` VALUES ('4028818669c9f0c50169ca445a140002', NULL, '2019-03-30 00:24:30', b'0', NULL, '111', '3', '40289287684eed6201684f3c74780017', '11', '111', '4028928f690d793901690e5180a10005', '2019-03-01', '11', NULL);
INSERT INTO `t_baozhangshenqing` VALUES ('40289283687ec07001687ee96e9e0001', NULL, '2019-01-24 16:10:53', b'0', NULL, '111', '2', '40289287684eed6201684f3c74780017', '检察院', '1112', '40289283687e8f6501687e9b4b0b0000', '2019-01-24', '111', '4028928b6781689b016782290b030001');
INSERT INTO `t_baozhangshenqing` VALUES ('402892846918ef420169191c52d30000', NULL, '2019-02-23 14:48:00', b'0', NULL, '11', '2', NULL, '11', '111', '4028928f690d793901690e52e4a70008', '2019-02-02', '11', '4028928b6781689b016782290b030001');
INSERT INTO `t_baozhangshenqing` VALUES ('402892846918ef420169195a60440001', NULL, '2019-02-23 15:55:47', b'0', NULL, '12', '2', NULL, '12', '12', '4028928f690d793901690e52e4a70008', '2019-02-23', '12', '4028928b6781689b016782290b030001');
INSERT INTO `t_baozhangshenqing` VALUES ('40289284691988960169198b17e40000', NULL, '2019-02-23 16:48:59', b'0', NULL, '12', '2', '40289287684eed6201684f3d556f001a', '12', '12', '4028928f690d793901690e52e4a70008', '2019-02-16', '12', '4028928b6781689b016782290b030001');
INSERT INTO `t_baozhangshenqing` VALUES ('402892876827c45c016827ce5ea80000', NULL, '2019-01-07 18:14:22', b'0', NULL, '111111111111111', '2', '4028928b6781689b016782298bcc0002', '检察院', '111111111111111111', '4028928768279470016827ae734b0000', '2019-01-07', '111111111', NULL);
INSERT INTO `t_baozhangshenqing` VALUES ('40289287684f430c0168505789dc0009', NULL, '2019-01-15 15:09:00', b'0', NULL, '1111', '2', NULL, '检察院', '1111', '4028928768279470016827ae734b0000', '2019-01-15', '1111', '4028928b6781689b016782290b030001');
INSERT INTO `t_baozhangshenqing` VALUES ('40289287684f430c016850a397f6000a', NULL, '2019-01-15 16:32:05', b'0', NULL, '22222222', '2', '4028928b6781689b016782298bcc0002', '检察院', '2222222', '4028928768279470016827ae734b0000', '2019-01-15', '22222', '4028928b6781689b016782290b030001');
INSERT INTO `t_baozhangshenqing` VALUES ('402892876850ae90016850b3eddd0001', NULL, '2019-01-15 16:49:55', b'0', NULL, '33333', '2', '4028928b6781689b016782298bcc0002', '检察院', '33333', '4028928667bcf7dd0167bd8929850001', '2019-01-15', '33333', '4028928b6781689b016782290b030001');
INSERT INTO `t_baozhangshenqing` VALUES ('4028928769473ec201694bd7fdc00003', NULL, '2019-03-05 11:14:00', b'0', NULL, '1', '2', NULL, 'sadasd', NULL, '4028928f690d793901690e5180a10005', '2019-03-05', '1', '4028928b6781689b016782290b030001');
INSERT INTO `t_baozhangshenqing` VALUES ('4028928769473ec201695bd388a30007', NULL, '2019-03-08 13:43:03', b'0', NULL, 'AS ', '3', NULL, '岁的法国', ' 阿三', '4028928f690d793901690e52e4a70008', '2019-03-08', '的撒', '4028928b6781689b016782290b030001');

-- ----------------------------
-- Table structure for t_bed
-- ----------------------------
DROP TABLE IF EXISTS `t_bed`;
CREATE TABLE `t_bed`  (
  `id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `createrid` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `createtime` varchar(19) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `deleted` bit(1) DEFAULT NULL,
  `title` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `roomId` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `nearWind` bit(1) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_bed
-- ----------------------------
INSERT INTO `t_bed` VALUES ('033ad2ef0e27477d9e4ede755f62a8e2', '1', '2019-06-03', b'0', 'L39B', '8a9621861f224780a2baf964dae4681d', b'0');
INSERT INTO `t_bed` VALUES ('04f0844e4d3c439ca22cd5932561d288', '1', '2019-06-03', b'0', 'L14B', 'dc60304491234b9285a8731057d29a4e', b'0');
INSERT INTO `t_bed` VALUES ('05722da41d404a5f81828d17eab29135', '1', '2019-06-03', b'0', 'L48A', '8b08421287d5494db0d0787255634786', b'1');
INSERT INTO `t_bed` VALUES ('058a821ca6d94430b69b988b7b93324c', '1', '2019-06-03', b'0', 'L39A', '8a9621861f224780a2baf964dae4681d', b'1');
INSERT INTO `t_bed` VALUES ('0732d3102d094161a6d1df5f7afe5ca7', '1', '2019-06-14', b'0', '1306A', '8abb078b65d645c59b1f25eaf29a1b61', b'1');
INSERT INTO `t_bed` VALUES ('08446c8a14d645c7bf15ded766f3fda2', '1', '2019-06-14', b'0', '1211B', '0b081fd8a0364a82ba9921a224f5b236', b'0');
INSERT INTO `t_bed` VALUES ('0bc5939dfa0a4dc495cbe2d902170d61', '1', '2019-06-03', b'0', 'L33A', '893880a0706049ed9af3085a6ccccbc5', b'1');
INSERT INTO `t_bed` VALUES ('0d7c27c2989740818a084cef6a42c7dd', '1', '2019-06-03', b'0', 'L51A', '6a70894ad730450b9c8434561e0a2556', b'1');
INSERT INTO `t_bed` VALUES ('0dc5781ef67a4bb3b0b601c9f3054643', '1', '2019-06-03', b'0', 'L10A', 'dd95fdf3a1f44220b2f528a1207ac9e1', b'1');
INSERT INTO `t_bed` VALUES ('0e98a876a23548a8a0ce799b365f3d06', '1', '2019-06-03', b'0', 'L40B', '22a3c6c7d5b04106a92efc0f77142bb4', b'0');
INSERT INTO `t_bed` VALUES ('13f86d4f4a9b4b7c93d25af89e81cb1b', '1', '2019-06-14', b'0', '1214B', '9bee8fcef8c84e67aa658987a9fcd4fd', b'0');
INSERT INTO `t_bed` VALUES ('1669ff4e5e724001bced1753bcfd8038', '1', '2019-06-03', b'0', 'L37B', 'd36cf538259c4967af1e786b0239e997', b'0');
INSERT INTO `t_bed` VALUES ('16d7d81f65ef4f848abcab1c9ab73d32', '1', '2019-06-03', b'0', 'L35A', '8bf2cf201fb842a080a434eb427c45bb', b'1');
INSERT INTO `t_bed` VALUES ('197bbf8b983b44208093cd37ee4e8856', '1', '2019-06-14', b'0', '1309A', '1ac9386496e042069a503c33684f5a25', b'1');
INSERT INTO `t_bed` VALUES ('1ad50754c9b54a35a8fd00c04fe676ef', '1', '2019-06-14', b'0', '1206B', '40d89d56ff4e440f83e1daa8959fef0d', b'0');
INSERT INTO `t_bed` VALUES ('1c009e3bed1f4af18d114510aabb1bf1', '1', '2019-06-14', b'0', '1205B', '2c988145ac2c4e769bee0ac5bbb3d2d5', b'0');
INSERT INTO `t_bed` VALUES ('1e55deec28d641faaa4fb7fc76e71181', '1', '2019-06-03', b'0', 'L08B', '9b27bb2974cb4942906fac08d6077c86', b'0');
INSERT INTO `t_bed` VALUES ('1e6331e3112945aabe214d37e9fc1d8a', '1', '2019-06-03', b'0', 'L19B', 'df06097721074262ad4c772c61b95d4c', b'0');
INSERT INTO `t_bed` VALUES ('1fff25c43fd74a2e9af3dbd68faba0ea', '1', '2019-06-03', b'0', 'L23B', 'a03abdfcf2784eb88830b19cba8e74b0', b'0');
INSERT INTO `t_bed` VALUES ('2168fd58a63e44e58afc6a33b8cc0371', '1', '2019-06-03', b'0', 'L05A', '083698eb94c042a8b3a8370938c3e7b7', b'1');
INSERT INTO `t_bed` VALUES ('21e2a44f348c43438fa5112f88be9a8d', '1', '2019-05-30', b'0', 'L01A', '4015937ba58544c7b353d101f15d2f5a', b'1');
INSERT INTO `t_bed` VALUES ('22277720579c4ebf8ab9f24742360891', '1', '2019-06-14', b'0', '1203B', 'cf397cba37ee40118dae451e5a7de8b1', b'0');
INSERT INTO `t_bed` VALUES ('224496368eb84dde9f71673e06ea2e44', '1', '2019-06-14', b'0', '1107A', '4e0751b96cf5499e9f7ca4e14d912f36', b'1');
INSERT INTO `t_bed` VALUES ('22f2e99be267427999cd2b0078e30d2c', '1', '2019-06-14', b'0', '1310B', '8a58f59c1b0c43d4b4614dd60833c24e', b'0');
INSERT INTO `t_bed` VALUES ('241e7fe0be434b759def23718dbdd43b', '1', '2019-06-03', b'0', 'L36B', '152052b187374c9e867ab5cf18f48800', b'0');
INSERT INTO `t_bed` VALUES ('245b8f8e1c6f4466943c365bd50cb21d', '1', '2019-06-14', b'0', '1209A', '77fe3c769f644f65a00de1f5b3f0052d', b'1');
INSERT INTO `t_bed` VALUES ('24f628a33d4a48d1884f1037310b1b88', '1', '2019-06-14', b'0', '1301B', '0db6d9f30c14468da891755900362fbe', b'0');
INSERT INTO `t_bed` VALUES ('25893dd976674ffd9a62c44262b5f1e6', '1', '2019-06-14', b'0', '1212B', 'd8e137f6549c4fe1905dd62fa21a674e', b'0');
INSERT INTO `t_bed` VALUES ('26b10a8755e3493fbd8de949c4aa14e6', '1', '2019-06-14', b'0', '1105B', '4777102439f14f62917d8438df4ddd51', b'0');
INSERT INTO `t_bed` VALUES ('28483133871540328871e7f9b2ef3c06', '1', '2019-06-03', b'0', 'L27A', 'f3bff2aa4b794e629b9b598cd4a36034', b'1');
INSERT INTO `t_bed` VALUES ('2ab129c659e84941b60690a0374242af', '1', '2019-06-03', b'0', 'L20B', '7eb9092c8aa742eca0d7d7a1c90ff270', b'0');
INSERT INTO `t_bed` VALUES ('2cef090c88984c56b3e108de65485a32', '1', '2019-06-14', b'0', '1103B', '9f304d224b15477bb3e8f21f9feb6c87', b'0');
INSERT INTO `t_bed` VALUES ('2d66acd78f0640d5a3473783e7ebf3dc', '1', '2019-06-03', b'0', 'L53A', 'd834c92044584c4e98fdcadf30a673c7', b'1');
INSERT INTO `t_bed` VALUES ('2d79a1ef4df64044b05e09709a1fcafc', '1', '2019-06-03', b'0', 'L42B', '64c889eec6b141b68b800b1274b859aa', b'0');
INSERT INTO `t_bed` VALUES ('2ff1a5c0c6d040e9b0c9b81b295e5168', '1', '2019-06-03', b'0', 'L38B', 'db2858bc2ba545f890b63343a822e7b8', b'0');
INSERT INTO `t_bed` VALUES ('3082f3e29724486981c7c328a1a0f884', '1', '2019-06-03', b'0', 'L52A', '434eb442b906406599521ea3a31c2072', b'1');
INSERT INTO `t_bed` VALUES ('32f554b0531b498eba39045e29179cbe', '1', '2019-06-03', b'0', 'L35B', '8bf2cf201fb842a080a434eb427c45bb', b'0');
INSERT INTO `t_bed` VALUES ('33f6d1e38ac7477a97bccc3e48471263', '1', '2019-06-14', b'0', '1215B', '364ae213954c4f0490a19f74c4ae3e01', b'0');
INSERT INTO `t_bed` VALUES ('34903d2beb3c4adf942f0b178c851636', '1', '2019-06-14', b'0', '1310A', '8a58f59c1b0c43d4b4614dd60833c24e', b'1');
INSERT INTO `t_bed` VALUES ('35a6a3640d33465bb01e2c6d78121471', '1', '2019-06-14', b'0', '1309B', '1ac9386496e042069a503c33684f5a25', b'0');
INSERT INTO `t_bed` VALUES ('3bf5ce7333ac47bb8ae5b3223adefe8d', '1', '2019-06-03', b'0', 'L49B', '6252295b1d6e4cfbac5b9c36d30d5f40', b'0');
INSERT INTO `t_bed` VALUES ('3d4f2f43a394480486800c6e67228e19', '1', '2019-06-14', b'0', '1303A', '1abb68a7dea5436f9899384bae2632bb', b'1');
INSERT INTO `t_bed` VALUES ('40c4d4ae1e714c21bce8d43f78b7ad36', '1', '2019-06-03', b'0', 'L04A', '9f013cd342cc4607bfe5ac0e1eaca3f3', b'1');
INSERT INTO `t_bed` VALUES ('428d3ce100a74cbcaeb56d65816d075d', '1', '2019-06-14', b'0', '1109B', 'b715da42fe654428a5cc347d616d494e', b'0');
INSERT INTO `t_bed` VALUES ('4320731633b143ec98cbff21342eeb82', '1', '2019-06-14', b'0', '1307A', '2dac001f19b4404d97ca5f830b318b40', b'1');
INSERT INTO `t_bed` VALUES ('4485552c28204da699e310825034105c', '1', '2019-06-03', b'0', 'L43A', '4ea3bf6737614fa88f9b6b8cd091d568', b'1');
INSERT INTO `t_bed` VALUES ('44be39537fc04e16bdff4cbe97f7707b', '1', '2019-06-03', b'0', 'L47A', '050abe343a264383a2f0cba3b9055d8e', b'1');
INSERT INTO `t_bed` VALUES ('45b81cf92fcd4516af53c55e871e1cd9', '1', '2019-06-14', b'0', '1215A', '364ae213954c4f0490a19f74c4ae3e01', b'1');
INSERT INTO `t_bed` VALUES ('471d7040ae03483f8fb0428ea3b64655', '1', '2019-06-03', b'0', 'L13A', '038fd14c39e34a86901aeba4e59a8bb8', b'1');
INSERT INTO `t_bed` VALUES ('47996df4e5894706b936440c5e656909', '1', '2019-06-03', b'0', 'L11A', 'caa87f25dc66471e8ae776ad8e19ec23', b'1');
INSERT INTO `t_bed` VALUES ('48aad9a0e7204aff80f5ad3063608df3', '1', '2019-06-03', b'0', 'L06B', 'd63865386dd94b11bdc1ecdfad211847', b'0');
INSERT INTO `t_bed` VALUES ('4a8db55560f041f49d5a88925345d918', '1', '2019-06-14', b'0', '1102B', 'fae03d1824e54d6394182e61a7daa0c8', b'0');
INSERT INTO `t_bed` VALUES ('4b7eda941d244fddbca2a068c12710c0', '1', '2019-06-03', b'0', 'L09A', '92dacb5b70ff4ba5aef0e3bd7ac1046e', b'1');
INSERT INTO `t_bed` VALUES ('4c385b3228f14d8a9f88fd51eb51fff1', '1', '2019-06-14', b'0', '1213B', '83c7282453b1403a8838f11c834d6879', b'0');
INSERT INTO `t_bed` VALUES ('4e6d6c19f23947edb1b2dacf5bae6a7a', '1', '2019-06-03', b'0', 'L55B', '43bd9d4582404324a63add76afc6c301', b'0');
INSERT INTO `t_bed` VALUES ('50ee19a54c7a401d94e38750059d768e', '1', '2019-06-03', b'0', 'L31A', '5246a0f979c94ab9aa6554b7bc6bae68', b'1');
INSERT INTO `t_bed` VALUES ('516553bca448413d9689b56f15b063ce', '1', '2019-06-03', b'0', 'L12A', '848dd58fc4794eb59834d3cfba4c8958', b'1');
INSERT INTO `t_bed` VALUES ('5368ee05212f4936bb5f237b6903d656', '1', '2019-06-03', b'0', 'L51B', '6a70894ad730450b9c8434561e0a2556', b'0');
INSERT INTO `t_bed` VALUES ('54b4fa7121c143be90a53cae2f43b06e', '1', '2019-06-03', b'0', 'L34B', '62c5b39e0ae246b28e122167db2c943f', b'0');
INSERT INTO `t_bed` VALUES ('563ba97c37be4b5688754c352c62d859', '1', '2019-06-14', b'0', '1201A', 'cf1cd29edc514a3d830cdb29e8b5905c', b'1');
INSERT INTO `t_bed` VALUES ('56649ea190f84f8b8e063495a01faf25', '1', '2019-06-14', b'0', '1210A', '25cea3d42065439e9d9f210dacd39ec0', b'1');
INSERT INTO `t_bed` VALUES ('569d8aface9745ca9e1d8fc8ab9af2ea', '1', '2019-06-14', b'0', '1217B', '0cf9b71acac44a22acd6846bf2f2fe24', b'0');
INSERT INTO `t_bed` VALUES ('57b0ce4ed84641ba91c411c1c3fadcc3', '1', '2019-06-03', b'0', 'L38A', 'db2858bc2ba545f890b63343a822e7b8', b'1');
INSERT INTO `t_bed` VALUES ('57c990e36401484bb573881b076d3071', '1', '2019-06-14', b'0', '1202A', '633aa509314c4e229a62e0ffed234fec', b'1');
INSERT INTO `t_bed` VALUES ('5bbdc786b9534a4cacbe88dc5a530aa5', '1', '2019-06-14', b'0', '1306B', '8abb078b65d645c59b1f25eaf29a1b61', b'0');
INSERT INTO `t_bed` VALUES ('5bea01958c4746929a6e34605a8fe809', '1', '2019-06-03', b'0', 'L05B', '083698eb94c042a8b3a8370938c3e7b7', b'0');
INSERT INTO `t_bed` VALUES ('5f751d4b258f43d998da3a46629b7468', '1', '2019-06-14', b'0', '1209B', '77fe3c769f644f65a00de1f5b3f0052d', b'0');
INSERT INTO `t_bed` VALUES ('6322f9b1d96c4c3a91dfd179ef38ab3f', '1', '2019-06-03', b'0', 'L32B', '1943203f6f684000a511185dd29c24cc', b'0');
INSERT INTO `t_bed` VALUES ('639da6b1e0e24a5daf53b8e7ac8ff8fc', '1', '2019-06-03', b'0', 'L09B', '92dacb5b70ff4ba5aef0e3bd7ac1046e', b'0');
INSERT INTO `t_bed` VALUES ('643b361196344a389aa6e6cb25f4c7a3', '1', '2019-06-03', b'0', 'L22A', 'a1cbb216a05a461784addb4277b407c1', b'1');
INSERT INTO `t_bed` VALUES ('649bce4f967a406ea9657edd6ce119f9', '1', '2019-06-03', b'0', 'L11B', 'caa87f25dc66471e8ae776ad8e19ec23', b'0');
INSERT INTO `t_bed` VALUES ('65071261e0fe4037bbee06d3d156955c', '1', '2019-06-03', b'0', 'L53B', 'd834c92044584c4e98fdcadf30a673c7', b'0');
INSERT INTO `t_bed` VALUES ('6599fa4652604b178e38b0bc10db594c', '1', '2019-06-14', b'0', '1301A', '0db6d9f30c14468da891755900362fbe', b'1');
INSERT INTO `t_bed` VALUES ('67b437a3c1bb4b09a7c8acd0d424e47c', '1', '2019-06-14', b'0', '1103A', '9f304d224b15477bb3e8f21f9feb6c87', b'1');
INSERT INTO `t_bed` VALUES ('69e1eb0241fc4b06b4626efa7097d1c3', '1', '2019-06-14', b'0', '1106A', 'e378b94bb0b841ddae6a80e35b533fce', b'1');
INSERT INTO `t_bed` VALUES ('6ca6dda632ce4b02a5f0b047bbc6d4e9', '1', '2019-06-14', b'0', '1202B', '633aa509314c4e229a62e0ffed234fec', b'0');
INSERT INTO `t_bed` VALUES ('6e1e99a31ea34545a9a0a65dd2954591', '1', '2019-06-03', b'0', 'L24B', '4a5c9681bea3413d9cb41fdba5128115', b'0');
INSERT INTO `t_bed` VALUES ('704744d7e68545d8911496ba45d9ac97', '1', '2019-05-20', b'0', 'L01B', '4015937ba58544c7b353d101f15d2f5a', b'0');
INSERT INTO `t_bed` VALUES ('71b2af57617848ccb648752340bedb04', '1', '2019-06-03', b'0', 'L07A', '47074516f4e7446aa40895c2554042a0', b'1');
INSERT INTO `t_bed` VALUES ('7201e7bb540d4941b25782e034c05769', '1', '2019-06-14', b'0', '1307B', '2dac001f19b4404d97ca5f830b318b40', b'0');
INSERT INTO `t_bed` VALUES ('738e9996dd134f30a51c1a95c226bdea', '1', '2019-06-03', b'0', 'L25A', 'd015d12d9db746a8a74ea7f47f4e8ee3', b'1');
INSERT INTO `t_bed` VALUES ('74d77167e76d42708cfeae47fef480ca', '1', '2019-06-03', b'0', 'L07B', '47074516f4e7446aa40895c2554042a0', b'0');
INSERT INTO `t_bed` VALUES ('750871ce7d364cfeabef5269797a1daf', '1', '2019-06-03', b'0', 'L10B', 'dd95fdf3a1f44220b2f528a1207ac9e1', b'0');
INSERT INTO `t_bed` VALUES ('7549d66fbb1a478297d29a0a62b9b244', '1', '2019-06-03', b'0', 'L52B', '434eb442b906406599521ea3a31c2072', b'0');
INSERT INTO `t_bed` VALUES ('75e864bb73404e3294baa391f99f1e98', '1', '2019-06-14', b'0', '1216A', '929ed95c66e24f3da11abd4eca5e7d9f', b'1');
INSERT INTO `t_bed` VALUES ('75fae69a759b47b994b9f326a8d6c224', '1', '2019-06-03', b'0', 'L33B', '893880a0706049ed9af3085a6ccccbc5', b'0');
INSERT INTO `t_bed` VALUES ('76105f706781401da27dd0a46d004783', '1', '2019-06-03', b'0', 'L34A', '62c5b39e0ae246b28e122167db2c943f', b'1');
INSERT INTO `t_bed` VALUES ('76180b961e4c41a6b6a549bd64ed458c', '1', '2019-06-03', b'0', 'L49A', '6252295b1d6e4cfbac5b9c36d30d5f40', b'1');
INSERT INTO `t_bed` VALUES ('78f85462a3b74c4ba350ff59381c5edc', '1', '2019-06-03', b'0', 'L26A', '5d66eb8cd5bb40108e3b21ffc2d20899', b'1');
INSERT INTO `t_bed` VALUES ('7ae5d43ac81c447a95c3f349793e0efa', '1', '2019-06-03', b'0', 'L37A', 'd36cf538259c4967af1e786b0239e997', b'1');
INSERT INTO `t_bed` VALUES ('7f92adce13014f4787187a5670877f61', '1', '2019-06-03', b'0', 'L31B', '5246a0f979c94ab9aa6554b7bc6bae68', b'0');
INSERT INTO `t_bed` VALUES ('8022a7a884ca40f6985a1517ffaa3407', '1', '2019-06-14', b'0', '1104A', 'a2c2747497ea4bffaa489e8be15e4293', b'1');
INSERT INTO `t_bed` VALUES ('81427a789a54455b8e45976db290a27c', '1', '2019-06-03', b'0', 'L41A', '000d928d28e84a1986beffa39fb8525b', b'1');
INSERT INTO `t_bed` VALUES ('81532e2fc3834c97a8b432e5e3674127', '1', '2019-06-14', b'0', '1218A', 'f7e40bbeae724cee94f02c021f8ad99b', b'1');
INSERT INTO `t_bed` VALUES ('82f556c4908e45139cea067ce2326b5f', '1', '2019-06-03', b'0', 'L40A', '22a3c6c7d5b04106a92efc0f77142bb4', b'1');
INSERT INTO `t_bed` VALUES ('8354f159719d4b4d9943a3c57c8da919', '1', '2019-06-14', b'0', '1303B', '1abb68a7dea5436f9899384bae2632bb', b'0');
INSERT INTO `t_bed` VALUES ('83912a8583004618a0db66cb2cfd804a', '1', '2019-06-14', b'0', '1304A', 'f76e8704d6304e58a44144eaed64680a', b'1');
INSERT INTO `t_bed` VALUES ('84994b8632d848fc93997e128c19ac78', '1', '2019-06-03', b'0', 'L18A', '180e596fb9424f4dbac35b7ea1a9b420', b'1');
INSERT INTO `t_bed` VALUES ('860f24da73774d18a12aba46d6e56865', '1', '2019-06-14', b'0', '1109A', 'b715da42fe654428a5cc347d616d494e', b'1');
INSERT INTO `t_bed` VALUES ('87981492ca9444cbb251774dea869cf2', '1', '2019-06-03', b'0', 'L02A', '21506af915d9463cbf8a4be8b4f2dd2a', b'1');
INSERT INTO `t_bed` VALUES ('8864dfc3fcf544748656896c9ec98ff1', '1', '2019-06-14', b'0', '1201B', 'cf1cd29edc514a3d830cdb29e8b5905c', b'0');
INSERT INTO `t_bed` VALUES ('8fbdf09772994b719a6608024f1794e1', '1', '2019-06-03', b'0', 'L36A', '152052b187374c9e867ab5cf18f48800', b'1');
INSERT INTO `t_bed` VALUES ('90df3cc261494b0baea2197720180232', '1', '2019-06-03', b'0', 'L46B', 'cf6fe055ffff4bc096a10f44d5ff11dc', b'0');
INSERT INTO `t_bed` VALUES ('91568952df16493d9f35a7e97e152144', '1', '2019-06-03', b'0', 'L02B', '21506af915d9463cbf8a4be8b4f2dd2a', b'0');
INSERT INTO `t_bed` VALUES ('93bfcdc1437847ff90ae47e74251bd74', '1', '2019-06-14', b'0', '1104B', 'a2c2747497ea4bffaa489e8be15e4293', b'0');
INSERT INTO `t_bed` VALUES ('9496232a1b5c4325bacb9be7d9f2d800', '1', '2019-06-03', b'0', 'L17B', '12889847ddc440f096e51ca335e6e4b3', b'0');
INSERT INTO `t_bed` VALUES ('95c3473d7c694414b20ae2adf8a23c17', '1', '2019-06-03', b'0', 'L16B', '6d02df76b2164cc2917d03687656636f', b'0');
INSERT INTO `t_bed` VALUES ('981885d8b9c94cb29cedb04407ff4c86', '1', '2019-06-03', b'0', 'L45A', '864a0e2f553447a9bfcade10e08a956b', b'1');
INSERT INTO `t_bed` VALUES ('981dd360efee494386a54aee40e9bfda', '1', '2019-06-14', b'0', '1216B', '929ed95c66e24f3da11abd4eca5e7d9f', b'0');
INSERT INTO `t_bed` VALUES ('984da3af39ce4fa3b36c5459f269e245', '1', '2019-06-14', b'0', '1305A', '62481fd36fad41a7bc477996ba1b0721', b'1');
INSERT INTO `t_bed` VALUES ('98b895ddb7f04ec9b61a46d7e9e535b1', '1', '2019-06-03', b'0', 'L50B', 'e00fda8a26a1469699e9d79aa8223b00', b'0');
INSERT INTO `t_bed` VALUES ('99698eee5e9f4ddf880eccb10669cc78', '1', '2019-06-14', b'0', '1214A', '9bee8fcef8c84e67aa658987a9fcd4fd', b'1');
INSERT INTO `t_bed` VALUES ('9c73799ed20848709f06e96ddf634342', '1', '2019-06-14', b'0', '1207B', '711bdfa6b2a846209bc156aa628bbc04', b'0');
INSERT INTO `t_bed` VALUES ('9eb6c00320a941738cba5641cd00e52a', '1', '2019-06-14', b'0', '1208A', '7f973f02b16c42d0bdb516a75cf89f55', b'1');
INSERT INTO `t_bed` VALUES ('a14671ef7bdc45268220985f699a5e80', '1', '2019-06-14', b'0', '1205A', '2c988145ac2c4e769bee0ac5bbb3d2d5', b'1');
INSERT INTO `t_bed` VALUES ('a149c163320f413ca9a7ee49c81bfb02', '1', '2019-06-14', b'0', '1217A', '0cf9b71acac44a22acd6846bf2f2fe24', b'1');
INSERT INTO `t_bed` VALUES ('a14ae30285fb490f8dfb9babbfcdf1c5', '1', '2019-06-03', b'0', 'L46A', 'cf6fe055ffff4bc096a10f44d5ff11dc', b'1');
INSERT INTO `t_bed` VALUES ('a21918c163ef49d7b3f08890732bdbfc', '1', '2019-06-03', b'0', 'L08A', '9b27bb2974cb4942906fac08d6077c86', b'1');
INSERT INTO `t_bed` VALUES ('a29946bcd244427f819f1374c387b860', '1', '2019-06-03', b'0', 'L54B', 'ba35f2b8cd224428ba579840365708fa', b'0');
INSERT INTO `t_bed` VALUES ('a4a894075ba241cf97ec1ebe233afb69', '1', '2019-06-14', b'0', '1101A', 'e8cc88addc4e4c34aa92bf41ebcf59af', b'0');
INSERT INTO `t_bed` VALUES ('a4b95425d85d4461a812f22b714f7b44', '1', '2019-06-03', b'0', 'L27B', 'f3bff2aa4b794e629b9b598cd4a36034', b'0');
INSERT INTO `t_bed` VALUES ('a6a160bda5144239bdbca83ff894b0cd', '1', '2019-06-14', b'0', '1210B', '25cea3d42065439e9d9f210dacd39ec0', b'0');
INSERT INTO `t_bed` VALUES ('a90e2f886f0f43fbac08cd24bd627a45', '1', '2019-06-03', b'0', 'L44B', '3dd204c9e3164220add1a426ae8bcd57', b'0');
INSERT INTO `t_bed` VALUES ('a97f4dd99c684282a5c01a3a85138903', '1', '2019-06-03', b'0', 'L43B', '4ea3bf6737614fa88f9b6b8cd091d568', b'0');
INSERT INTO `t_bed` VALUES ('ae08dcb128414017b853c47b830b0366', '1', '2019-06-14', b'0', '1106B', 'e378b94bb0b841ddae6a80e35b533fce', b'0');
INSERT INTO `t_bed` VALUES ('af585a6277504275a6e204df0339375d', '1', '2019-06-03', b'0', 'L23A', 'a03abdfcf2784eb88830b19cba8e74b0', b'1');
INSERT INTO `t_bed` VALUES ('b9d5b97eead0494490ebd5dcaa63a9ad', '1', '2019-06-03', b'0', 'L20A', '7eb9092c8aa742eca0d7d7a1c90ff270', b'1');
INSERT INTO `t_bed` VALUES ('b9fa41e04cdb49d8a993b125f5ad00e7', '1', '2019-06-03', b'0', 'L14A', 'dc60304491234b9285a8731057d29a4e', b'1');
INSERT INTO `t_bed` VALUES ('ba05ab68e9c24ed281bbe030742711e8', '1', '2019-06-03', b'0', 'L12B', '848dd58fc4794eb59834d3cfba4c8958', b'0');
INSERT INTO `t_bed` VALUES ('ba16e4d33acc4d51842285e245be6693', '1', '2019-06-03', b'0', 'L16A', '6d02df76b2164cc2917d03687656636f', b'1');
INSERT INTO `t_bed` VALUES ('baf7cde204474beba3b7f61abf5f7050', '1', '2019-06-03', b'0', 'L03A', '1e9fc82f6105413eadcffce212e1f591', b'1');
INSERT INTO `t_bed` VALUES ('bb2a4befc745477bb47f41f6e0f4956c', '1', '2019-06-03', b'0', 'L25B', 'd015d12d9db746a8a74ea7f47f4e8ee3', b'0');
INSERT INTO `t_bed` VALUES ('bb38b0c6923242b2af02cb19f5a97fd1', '1', '2019-06-03', b'0', 'L24A', '4a5c9681bea3413d9cb41fdba5128115', b'1');
INSERT INTO `t_bed` VALUES ('be172092eb434b228a4df93407eb9344', '1', '2019-06-14', b'0', '1203A', 'cf397cba37ee40118dae451e5a7de8b1', b'1');
INSERT INTO `t_bed` VALUES ('bf9cd15aef3f4fe0b169e709b80bcf4a', '1', '2019-06-14', b'0', '1304B', 'f76e8704d6304e58a44144eaed64680a', b'0');
INSERT INTO `t_bed` VALUES ('c0824cfa209b429d8cbb6285901059bb', '1', '2019-06-03', b'0', 'L21B', 'ef85653f4d3845d3a08fc84949a6addc', b'0');
INSERT INTO `t_bed` VALUES ('c407884bc84c4802a8ab121905e0510d', '1', '2019-06-03', b'0', 'L06A', 'd63865386dd94b11bdc1ecdfad211847', b'1');
INSERT INTO `t_bed` VALUES ('c50c1a0824724f5d9d65c022b73bbd52', '1', '2019-06-03', b'0', 'L48B', '8b08421287d5494db0d0787255634786', b'0');
INSERT INTO `t_bed` VALUES ('c61acbe9f62c4da984fad3685c063160', '1', '2019-06-14', b'0', '1308A', '31bec2c94fca4e09b4f1768de50a898b', b'1');
INSERT INTO `t_bed` VALUES ('c66b7d58d13241a69050767bc6f88244', '1', '2019-06-14', b'0', '1204B', 'b6cb4fabb3bf4513b254b2cf80efac84', b'0');
INSERT INTO `t_bed` VALUES ('c9e8b7cc30154ff5b15c0ee4d7fca658', '1', '2019-06-03', b'0', 'L55A', '43bd9d4582404324a63add76afc6c301', b'1');
INSERT INTO `t_bed` VALUES ('ccde203115a64414b804d73bd3ab99fc', '1', '2019-06-03', b'0', 'L15A', 'dd13b8c07a394cc4b3d2a3bbf710cd34', b'1');
INSERT INTO `t_bed` VALUES ('cd1980b8837f4cf69bd6eafea1f771aa', '1', '2019-06-14', b'0', '1211A', '0b081fd8a0364a82ba9921a224f5b236', b'1');
INSERT INTO `t_bed` VALUES ('d03beb3ace7d42f3aa038d8aa7fb48bf', '1', '2019-06-14', b'0', '1218B', 'f7e40bbeae724cee94f02c021f8ad99b', b'0');
INSERT INTO `t_bed` VALUES ('d04781bf8c744b40b4e2740761c30205', '1', '2019-06-03', b'0', 'L19A', 'df06097721074262ad4c772c61b95d4c', b'1');
INSERT INTO `t_bed` VALUES ('d072509767f94e1d8f2ba2dc509120a1', '1', '2019-06-03', b'0', 'L18B', '180e596fb9424f4dbac35b7ea1a9b420', b'0');
INSERT INTO `t_bed` VALUES ('d18cafc2921f43c8af836a4acb63224f', '1', '2019-06-03', b'0', 'L30A', '9d16194b87b543bf8b690bd4712bb461', b'1');
INSERT INTO `t_bed` VALUES ('d26c1ad4243946ce98f055f8dc41bb2e', '1', '2019-06-14', b'0', '1204A', 'b6cb4fabb3bf4513b254b2cf80efac84', b'1');
INSERT INTO `t_bed` VALUES ('d53f73e8c3374fe8902d0440c74afda1', '1', '2019-06-03', b'0', 'L41B', '000d928d28e84a1986beffa39fb8525b', b'0');
INSERT INTO `t_bed` VALUES ('d5cd63d24b9041e99b0f909b560a265c', '1', '2019-06-03', b'0', 'L42A', '64c889eec6b141b68b800b1274b859aa', b'1');
INSERT INTO `t_bed` VALUES ('d5d2a941a94f4c4e887a5b4a15999ec8', '1', '2019-06-03', b'0', 'L17A', '12889847ddc440f096e51ca335e6e4b3', b'1');
INSERT INTO `t_bed` VALUES ('d7b23599826c44c5994bb256b70a3111', '1', '2019-06-03', b'0', 'L32A', '1943203f6f684000a511185dd29c24cc', b'1');
INSERT INTO `t_bed` VALUES ('d7ee308fdda64d028251e53470d047ed', '1', '2019-06-03', b'0', 'L47B', '050abe343a264383a2f0cba3b9055d8e', b'0');
INSERT INTO `t_bed` VALUES ('da905522743a402f8e8163f5fdf18335', '1', '2019-06-03', b'0', 'L50A', 'e00fda8a26a1469699e9d79aa8223b00', b'1');
INSERT INTO `t_bed` VALUES ('db774815d6b84736891b287f655553b7', '1', '2019-06-03', b'0', 'L22B', 'a1cbb216a05a461784addb4277b407c1', b'0');
INSERT INTO `t_bed` VALUES ('dd6543c2599443028ea4c23ec1b80f82', '1', '2019-06-14', b'0', '1213A', '83c7282453b1403a8838f11c834d6879', b'1');
INSERT INTO `t_bed` VALUES ('df3cf81f2225438d9798acc138b50b56', '1', '2019-06-03', b'0', 'L30B', '9d16194b87b543bf8b690bd4712bb461', b'0');
INSERT INTO `t_bed` VALUES ('dffc0b7cb49d452985aeb81235e8db7e', '1', '2019-06-14', b'0', '1110A', 'd714c8cc90844b729b8cd2f185f2feb8', b'1');
INSERT INTO `t_bed` VALUES ('e144cf5574894a2a8ec18d4d7570f972', '1', '2019-06-03', b'0', 'L29A', '49c5fd54333a477fb5db91f52f72d053', b'1');
INSERT INTO `t_bed` VALUES ('e1b67d707a5b4ee1930d50d7f3308654', '1', '2019-06-03', b'0', 'L45B', '864a0e2f553447a9bfcade10e08a956b', b'0');
INSERT INTO `t_bed` VALUES ('e28573d32490438496f41c87fb297ee6', '1', '2019-06-14', b'0', '1206A', '40d89d56ff4e440f83e1daa8959fef0d', b'1');
INSERT INTO `t_bed` VALUES ('e40af1d1ba3e46a39ce584bf2e784f36', '1', '2019-06-14', b'0', '1107B', '4e0751b96cf5499e9f7ca4e14d912f36', b'0');
INSERT INTO `t_bed` VALUES ('e62562012b04432e8b928ff3f2d9faff', '1', '2019-06-03', b'0', 'L29B', '49c5fd54333a477fb5db91f52f72d053', b'0');
INSERT INTO `t_bed` VALUES ('ea13c3c12f8747cda697c2d7550f2ada', '1', '2019-06-03', b'0', 'L13B', '038fd14c39e34a86901aeba4e59a8bb8', b'0');
INSERT INTO `t_bed` VALUES ('ea25c66492904b858d2140e0d35f0ccc', '1', '2019-06-14', b'0', '1105A', '4777102439f14f62917d8438df4ddd51', b'1');
INSERT INTO `t_bed` VALUES ('eade170e304c4ab0991a4ba378da0d08', '1', '2019-06-03', b'0', 'L04B', '9f013cd342cc4607bfe5ac0e1eaca3f3', b'0');
INSERT INTO `t_bed` VALUES ('ebb0ab313f12418bbae8f0219a3781b5', '1', '2019-06-03', b'0', 'L28B', 'c08d28e09f9e4ba388dc685fa200e38f', b'0');
INSERT INTO `t_bed` VALUES ('ed3666d11823462682cd1e5614941733', '1', '2019-06-14', b'0', '1101B', 'e8cc88addc4e4c34aa92bf41ebcf59af', b'1');
INSERT INTO `t_bed` VALUES ('ed6a7322217a40d6b8725314bc543d23', '1', '2019-06-14', b'0', '1212A', 'd8e137f6549c4fe1905dd62fa21a674e', b'1');
INSERT INTO `t_bed` VALUES ('f12cbfa0f9e44d94857c78f7ecc6c24d', '1', '2019-06-03', b'0', 'L15B', 'dd13b8c07a394cc4b3d2a3bbf710cd34', b'0');
INSERT INTO `t_bed` VALUES ('f22e663ac58f4770ac25d3e3a744c1cc', '1', '2019-06-14', b'0', '1207A', '711bdfa6b2a846209bc156aa628bbc04', b'1');
INSERT INTO `t_bed` VALUES ('f25cafc7dbac42d2b004634fba6a7834', '1', '2019-06-14', b'0', '1305B', '62481fd36fad41a7bc477996ba1b0721', b'0');
INSERT INTO `t_bed` VALUES ('f2becd0cda5b47ac960d7dd815c3a565', '1', '2019-06-14', b'0', '1108B', 'b27caa31824d4f59961e33483e1171fc', b'0');
INSERT INTO `t_bed` VALUES ('f449cf7087d34de5a247801c28410efa', '1', '2019-06-03', b'0', 'L44A', '3dd204c9e3164220add1a426ae8bcd57', b'1');
INSERT INTO `t_bed` VALUES ('f4926e264c1f4540af636b6fe44df75a', '1', '2019-06-03', b'0', 'L54A', 'ba35f2b8cd224428ba579840365708fa', b'1');
INSERT INTO `t_bed` VALUES ('f49dea3d5fc84281bc21ac0420bb8efe', '1', '2019-06-14', b'0', '1208B', '7f973f02b16c42d0bdb516a75cf89f55', b'0');
INSERT INTO `t_bed` VALUES ('f56c339010df4d518622b065c906d78e', '1', '2019-06-14', b'0', '1308B', '31bec2c94fca4e09b4f1768de50a898b', b'0');
INSERT INTO `t_bed` VALUES ('f589810319bc466ab61ebd89d60dd78e', '1', '2019-06-14', b'0', '1102A', 'fae03d1824e54d6394182e61a7daa0c8', b'1');
INSERT INTO `t_bed` VALUES ('f5dd31edadd74ac68d4c67338193ae51', '1', '2019-06-03', b'0', 'L26B', '5d66eb8cd5bb40108e3b21ffc2d20899', b'0');
INSERT INTO `t_bed` VALUES ('f6d5be92bfa444e381a1eded5c929c11', '1', '2019-06-14', b'0', '1302B', '26b280bdd5914716b525befff4a5de68', b'0');
INSERT INTO `t_bed` VALUES ('f77af5ac43564e468055ff854c7f17dd', '1', '2019-06-03', b'0', 'L03B', '1e9fc82f6105413eadcffce212e1f591', b'0');
INSERT INTO `t_bed` VALUES ('f8069db6096f497090507704ef5f28f3', '1', '2019-06-14', b'0', '1110B', 'd714c8cc90844b729b8cd2f185f2feb8', b'0');
INSERT INTO `t_bed` VALUES ('f9df61f06e884ed4a48b290a2b2256c6', '1', '2019-06-14', b'0', '1108A', 'b27caa31824d4f59961e33483e1171fc', b'1');
INSERT INTO `t_bed` VALUES ('fc4d4146606d4a0181480a975f629024', '1', '2019-06-03', b'0', 'L21A', 'ef85653f4d3845d3a08fc84949a6addc', b'1');
INSERT INTO `t_bed` VALUES ('fc7857c141904573a180cb6932a2a21a', '1', '2019-06-03', b'0', 'L28A', 'c08d28e09f9e4ba388dc685fa200e38f', b'1');
INSERT INTO `t_bed` VALUES ('fe2649bdefaa4e4c9c8398fda976f932', '1', '2019-06-14', b'0', '1302A', '26b280bdd5914716b525befff4a5de68', b'1');

-- ----------------------------
-- Table structure for t_catering
-- ----------------------------
DROP TABLE IF EXISTS `t_catering`;
CREATE TABLE `t_catering`  (
  `id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `createrid` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `createtime` varchar(19) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `deleted` bit(1) DEFAULT NULL,
  `title` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `breakfast` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci,
  `cateringMenu` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `cookingMan` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `deliveryMan` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `dinner` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci,
  `lunch` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci,
  `packingMan` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `remarks` varchar(250) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `specificbreakfast` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci,
  `specificdinner` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci,
  `specificlunch` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci,
  `receiveMan` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `riqi` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `lienPersonnelid` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `cookingManThree` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `cookingManTwo` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `deliveryManThree` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `deliveryManTwo` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `packingManThree` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `packingManTwo` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `receiveManThree` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `receiveManTwo` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_catering
-- ----------------------------
INSERT INTO `t_catering` VALUES ('4028408167e7f4540167e8719cff0000', NULL, '2018-12-26 10:56:59', b'0', NULL, NULL, '1', '11', '22', NULL, NULL, '33', '挺好', '1', '1', '15', '44', '2018-12-26', '4028928b676274040167632ab5170002', 'BB', 'AA', 'FF', 'EE', 'DD', 'CC', 'HH', 'GG');
INSERT INTO `t_catering` VALUES ('4028928667cf53740167cfaea8640000', NULL, '2018-12-21 15:33:09', b'0', NULL, '馒头  包子  饺子  面条  嘎巴菜  豆腐脑儿  果子  豆浆  豆汁 鸡蛋   茶叶蛋  咸菜  粥', '0', '赵', '郑', '玉米粥  燕麦粥  大米粥  南瓜粥  皮蛋粥  绿豆粥  咸菜 鸡蛋  咸鸭蛋', '蒸羊羔  蒸熊掌  烧花鸭  烧花鸡  酱鸡腊肉   米饭', '李', NULL, NULL, NULL, NULL, '陈', '2018-12-21', NULL, '孙', '钱', '冯', '王', '吴', '周', '卫', '楮');
INSERT INTO `t_catering` VALUES ('4028928768279470016827b224300002', NULL, '2019-01-07 17:43:32', b'0', NULL, '1111', '0', '1', '7', '333', '222', '4', '事实上', NULL, NULL, NULL, '10', '2019-01-07', NULL, '3', '2', '9', '8', '6', '5', '12', '11');
INSERT INTO `t_catering` VALUES ('402892876827c45c016827d1bdde0001', NULL, '2019-01-07 18:18:03', b'0', NULL, NULL, '1', '1', '1', NULL, NULL, '1', '事实上', '111', '111', '111', '1', '2019-01-07', '4028928768279470016827ae734b0000', '1', '1', '1', '1', '1', '1', '1', '1');
INSERT INTO `t_catering` VALUES ('402892876827c45c016827d28e620002', NULL, '2019-01-07 18:18:56', b'0', NULL, NULL, '1', '2', '2', NULL, NULL, '2', '事实上', '1111', '1111', '11111', '2', '2019-01-07', '402881e567817206016781880e440000', '2', '2', '2', '2', '2', '2', '2', '2');
INSERT INTO `t_catering` VALUES ('4028928769473ec2016956f6d6c40004', NULL, '2019-03-07 15:03:31', b'0', NULL, '发顺丰水电费谁说的方式是否是上公司打个个十多个第三个是归属感三个三个是公司 公司', '1', 'XXX', 'XXX', ' 三国杀 公司 个三个三个三个三个是该公司给搜狗搜素 v都是大单双丰收高是个时光隧道公司的个公司公司个是', '公司 公司的根深蒂固十大歌手故事的故事个公司的故事的故事的多少个说的 三国杀个是公司公司公司 ', 'XXX', '反倒是水电费', '阿萨德', '啊啊大', '大大', 'XXX', '2019-03-07', '4028928f690d793901690e5180a10005', 'XXX', 'XXX', 'XXX', 'XXX', 'XXX', 'XXX', '找找找', 'F fwe');
INSERT INTO `t_catering` VALUES ('4028928f690d793901690de30b4f0000', NULL, '2019-02-21 10:29:37', b'0', NULL, NULL, '1', NULL, NULL, NULL, NULL, NULL, NULL, '221', '211', '233', NULL, '2019-02-21', '4028928667bcf7dd0167bd8929850001', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for t_dictionary
-- ----------------------------
DROP TABLE IF EXISTS `t_dictionary`;
CREATE TABLE `t_dictionary`  (
  `id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `createrid` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `createtime` varchar(19) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `deleted` bit(1) DEFAULT NULL,
  `title` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `dicIndex` int(11) DEFAULT NULL,
  `dicMemo` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `dicName` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `dicPyCode` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `dsId` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `isOwner` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_dictionary
-- ----------------------------
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000001', NULL, NULL, b'0', NULL, NULL, NULL, '25味珊瑚丸', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000002', NULL, NULL, b'0', NULL, NULL, NULL, '50%葡萄糖', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000003', NULL, NULL, b'0', NULL, NULL, NULL, 'PE薄膜手套', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000004', NULL, NULL, b'0', NULL, NULL, NULL, 'VitB1', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000005', NULL, NULL, b'0', NULL, NULL, NULL, '阿奇霉素', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000006', NULL, NULL, b'0', NULL, NULL, NULL, '阿司匹林肠溶片', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000007', NULL, NULL, b'0', NULL, NULL, NULL, '阿斯美', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000008', NULL, NULL, b'0', NULL, NULL, NULL, '艾可拓', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000009', NULL, NULL, b'0', NULL, NULL, NULL, '艾司唑仑（舒乐安定）', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000010', NULL, NULL, b'0', NULL, NULL, NULL, '爱赛平喷液', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000011', NULL, NULL, b'0', NULL, NULL, NULL, '安博诺', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000012', NULL, NULL, b'0', NULL, NULL, NULL, '安博维', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000013', NULL, NULL, b'0', NULL, NULL, NULL, '百多邦', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000014', NULL, NULL, b'0', NULL, NULL, NULL, '拜复乐', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000015', NULL, NULL, b'0', NULL, NULL, NULL, '拜糖平', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000016', NULL, NULL, b'0', NULL, NULL, NULL, '拜新同', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000017', NULL, NULL, b'0', NULL, NULL, NULL, '保列治', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000018', NULL, NULL, b'0', NULL, NULL, NULL, '倍他乐克', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000019', NULL, NULL, b'0', NULL, NULL, NULL, '倍他司汀', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000020', NULL, NULL, b'0', NULL, NULL, NULL, '波立维', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000021', NULL, NULL, b'0', NULL, NULL, NULL, '波依定', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000022', NULL, NULL, b'0', NULL, NULL, NULL, '博苏（比索洛尔）', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000023', NULL, NULL, b'0', NULL, NULL, NULL, '布洛芬（芬必得）', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000024', NULL, NULL, b'0', NULL, NULL, NULL, '川贝枇杷滴丸', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000025', NULL, NULL, b'0', NULL, NULL, NULL, '创可贴', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000026', NULL, NULL, b'0', NULL, NULL, NULL, '达克宁', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000027', NULL, NULL, b'0', NULL, NULL, NULL, '达喜', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000028', NULL, NULL, b'0', NULL, NULL, NULL, '大山楂丸', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000029', NULL, NULL, b'0', NULL, NULL, NULL, '代文', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000030', NULL, NULL, b'0', NULL, NULL, NULL, '黛力新', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000031', NULL, NULL, b'0', NULL, NULL, NULL, '丹参滴丸', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000032', NULL, NULL, b'0', NULL, NULL, NULL, '地奥司明', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000033', NULL, NULL, b'0', NULL, NULL, NULL, '颠茄', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000034', NULL, NULL, b'0', NULL, NULL, NULL, '芬必得', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000035', NULL, NULL, b'0', NULL, NULL, NULL, '扶他林软膏', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000036', NULL, NULL, b'0', NULL, NULL, NULL, '氟桂利嗪', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000037', NULL, NULL, b'0', NULL, NULL, NULL, '复方丹参滴丸', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000038', NULL, NULL, b'0', NULL, NULL, NULL, '干棉签', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000039', NULL, NULL, b'0', NULL, NULL, NULL, '格华止', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000040', NULL, NULL, b'0', NULL, NULL, NULL, '狗皮膏', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000041', NULL, NULL, b'0', NULL, NULL, NULL, '哈乐', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000042', NULL, NULL, b'0', NULL, NULL, NULL, '合贝爽', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000043', NULL, NULL, b'0', NULL, NULL, NULL, '红霉素眼药膏', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000044', NULL, NULL, b'0', NULL, NULL, NULL, '黄葵胶囊', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000045', NULL, NULL, b'0', NULL, NULL, NULL, '黄连上清', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000046', NULL, NULL, b'0', NULL, NULL, NULL, '活血止痛膏', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000047', NULL, NULL, b'0', NULL, NULL, NULL, '藿香正气胶囊', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000048', NULL, NULL, b'0', NULL, NULL, NULL, '吉法酯', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000049', NULL, NULL, b'0', NULL, NULL, NULL, '甲硝唑', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000050', NULL, NULL, b'0', NULL, NULL, NULL, '洁维乐', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000051', NULL, NULL, b'0', NULL, NULL, NULL, '精制银翘解毒片', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000052', NULL, NULL, b'0', NULL, NULL, NULL, '酒精棉签', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000053', NULL, NULL, b'0', NULL, NULL, NULL, '卡博平', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000054', NULL, NULL, b'0', NULL, NULL, NULL, '卡司平', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000055', NULL, NULL, b'0', NULL, NULL, NULL, '开博通（卡托普利）', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000056', NULL, NULL, b'0', NULL, NULL, NULL, '开瑞坦', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000057', NULL, NULL, b'0', NULL, NULL, NULL, '开塞露', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000058', NULL, NULL, b'0', NULL, NULL, NULL, '康忻', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000059', NULL, NULL, b'0', NULL, NULL, NULL, '科素亚', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000060', NULL, NULL, b'0', NULL, NULL, NULL, '可定', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000061', NULL, NULL, b'0', NULL, NULL, NULL, '可乐必妥滴眼液', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000062', NULL, NULL, b'0', NULL, NULL, NULL, '可乐必妥片', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000063', NULL, NULL, b'0', NULL, NULL, NULL, '克拉霉素', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000064', NULL, NULL, b'0', NULL, NULL, NULL, '口罩', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000065', NULL, NULL, b'0', NULL, NULL, NULL, '来得时', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000066', NULL, NULL, b'0', NULL, NULL, NULL, '蓝芩口服液', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000067', NULL, NULL, b'0', NULL, NULL, NULL, '乐松', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000068', NULL, NULL, b'0', NULL, NULL, NULL, '雷诺考特（布地奈德喷鼻）', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000069', NULL, NULL, b'0', NULL, NULL, NULL, '立普妥', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000070', NULL, NULL, b'0', NULL, NULL, NULL, '莲花清瘟胶囊', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000071', NULL, NULL, b'0', NULL, NULL, NULL, '洛赛克', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000072', NULL, NULL, b'0', NULL, NULL, NULL, '络活喜', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000073', NULL, NULL, b'0', NULL, NULL, NULL, '麻仁软胶囊', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000074', NULL, NULL, b'0', NULL, NULL, NULL, '吗丁啉', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000075', NULL, NULL, b'0', NULL, NULL, NULL, '美卡素', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000076', NULL, NULL, b'0', NULL, NULL, NULL, '蒙诺', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000077', NULL, NULL, b'0', NULL, NULL, NULL, '弥可保', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000078', NULL, NULL, b'0', NULL, NULL, NULL, '泌特', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000079', NULL, NULL, b'0', NULL, NULL, NULL, '敏施朗', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000080', NULL, NULL, b'0', NULL, NULL, NULL, '膜固思达', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000081', NULL, NULL, b'0', NULL, NULL, NULL, '莫家清宁丸', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000082', NULL, NULL, b'0', NULL, NULL, NULL, '沐舒坦', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000083', NULL, NULL, b'0', NULL, NULL, NULL, '耐信', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000084', NULL, NULL, b'0', NULL, NULL, NULL, '脑心通', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000085', NULL, NULL, b'0', NULL, NULL, NULL, '尿毒清', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000086', NULL, NULL, b'0', NULL, NULL, NULL, '牛黄解毒片', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000087', NULL, NULL, b'0', NULL, NULL, NULL, '诺氟沙星', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000088', NULL, NULL, b'0', NULL, NULL, NULL, '诺和龙', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000089', NULL, NULL, b'0', NULL, NULL, NULL, '派瑞松', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000090', NULL, NULL, b'0', NULL, NULL, NULL, '蒲参胶囊', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000091', NULL, NULL, b'0', NULL, NULL, NULL, '蒲地兰口服液', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000092', NULL, NULL, b'0', NULL, NULL, NULL, '普拉洛芬点眼液（普南扑灵）', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000093', NULL, NULL, b'0', NULL, NULL, NULL, '普托平', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000094', NULL, NULL, b'0', NULL, NULL, NULL, '清创包', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000095', NULL, NULL, b'0', NULL, NULL, NULL, '清肺消炎丸', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000096', NULL, NULL, b'0', NULL, NULL, NULL, '清肺抑火片', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000097', NULL, NULL, b'0', NULL, NULL, NULL, '清胃黄连片', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000098', NULL, NULL, b'0', NULL, NULL, NULL, '清咽滴丸', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000099', NULL, NULL, b'0', NULL, NULL, NULL, '曲美不汀', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000100', NULL, NULL, b'0', NULL, NULL, NULL, '瑞舒伐他汀', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000101', NULL, NULL, b'0', NULL, NULL, NULL, '赛治', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000102', NULL, NULL, b'0', NULL, NULL, NULL, '散利痛', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000103', NULL, NULL, b'0', NULL, NULL, NULL, '麝香壮骨膏', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000104', NULL, NULL, b'0', NULL, NULL, NULL, '肾炎舒片', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000105', NULL, NULL, b'0', NULL, NULL, NULL, '舒筋节利胶囊', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000106', NULL, NULL, b'0', NULL, NULL, NULL, '舒丽启能', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000107', NULL, NULL, b'0', NULL, NULL, NULL, '舒利迭', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000108', NULL, NULL, b'0', NULL, NULL, NULL, '舒泰清', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000109', NULL, NULL, b'0', NULL, NULL, NULL, '思密达', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000110', NULL, NULL, b'0', NULL, NULL, NULL, '思诺思', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000111', NULL, NULL, b'0', NULL, NULL, NULL, '斯达舒', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000112', NULL, NULL, b'0', NULL, NULL, NULL, '速效救心丸', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000113', NULL, NULL, b'0', NULL, NULL, NULL, '头孢克洛', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000114', NULL, NULL, b'0', NULL, NULL, NULL, '万爽力', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000115', NULL, NULL, b'0', NULL, NULL, NULL, '维生素C', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000116', NULL, NULL, b'0', NULL, NULL, NULL, '胃肠安', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000117', NULL, NULL, b'0', NULL, NULL, NULL, '稳心颗粒', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000118', NULL, NULL, b'0', NULL, NULL, NULL, '无菌橡胶手套', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000119', NULL, NULL, b'0', NULL, NULL, NULL, '西吡氯嗪', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000120', NULL, NULL, b'0', NULL, NULL, NULL, '西力欣', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000121', NULL, NULL, b'0', NULL, NULL, NULL, '希舒美', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000122', NULL, NULL, b'0', NULL, NULL, NULL, '喜疗妥', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000123', NULL, NULL, b'0', NULL, NULL, NULL, '消痛贴膏', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000124', NULL, NULL, b'0', NULL, NULL, NULL, '硝酸甘油', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000125', NULL, NULL, b'0', NULL, NULL, NULL, '心律平', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000126', NULL, NULL, b'0', NULL, NULL, NULL, '欣康', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000127', NULL, NULL, b'0', NULL, NULL, NULL, '新康泰克', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000128', NULL, NULL, b'0', NULL, NULL, NULL, '新泪然滴眼液', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000129', NULL, NULL, b'0', NULL, NULL, NULL, '盐酸美西律片', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000130', NULL, NULL, b'0', NULL, NULL, NULL, '依姆多', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000131', NULL, NULL, b'0', NULL, NULL, NULL, '依托考昔片', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000132', NULL, NULL, b'0', NULL, NULL, NULL, '易善复', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000133', NULL, NULL, b'0', NULL, NULL, NULL, '银翘解毒片', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000134', NULL, NULL, b'0', NULL, NULL, NULL, '银杏叶片', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000135', NULL, NULL, b'0', NULL, NULL, NULL, '尤卓尔', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000136', NULL, NULL, b'0', NULL, NULL, NULL, '云南白药胶囊', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000137', NULL, NULL, b'0', NULL, NULL, NULL, '云南白药气雾剂', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000138', NULL, NULL, b'0', NULL, NULL, NULL, '痔疮栓', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000139', NULL, NULL, b'0', NULL, NULL, NULL, '肿痛安', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('0000000000000000000000000000140', NULL, NULL, b'0', NULL, NULL, NULL, '左克（左氧氟沙星）', NULL, '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('4028098169747302016975fa62e10003', NULL, '2019-03-13 15:35:37', b'0', NULL, 1, NULL, '口服', 'koufu', '4028098169747302016975fa09fe0002', 0);
INSERT INTO `t_dictionary` VALUES ('4028098169747302016975fabbc80004', NULL, '2019-03-13 15:36:00', b'0', NULL, 2, NULL, '含服', 'jingmaizhushe', '4028098169747302016975fa09fe0002', 0);
INSERT INTO `t_dictionary` VALUES ('4028818669ce92a90169cea9f0cb0000', NULL, '2019-03-30 20:53:57', b'0', NULL, 2, NULL, '2/日', NULL, '402881e5697a0f5001697a2d0f770002', 0);
INSERT INTO `t_dictionary` VALUES ('4028818669ce92a90169ceaa16740001', NULL, '2019-03-30 20:54:07', b'0', NULL, 3, NULL, '3/日', NULL, '402881e5697a0f5001697a2d0f770002', 0);
INSERT INTO `t_dictionary` VALUES ('4028818669ce92a90169ceaa492f0002', NULL, '2019-03-30 20:54:20', b'0', NULL, 4, NULL, '1/晚', NULL, '402881e5697a0f5001697a2d0f770002', 0);
INSERT INTO `t_dictionary` VALUES ('4028818669ce92a90169ceaa6f550003', NULL, '2019-03-30 20:54:29', b'0', NULL, 5, NULL, '必要时', NULL, '402881e5697a0f5001697a2d0f770002', 0);
INSERT INTO `t_dictionary` VALUES ('4028818669ce92a90169ceaaf4af0004', NULL, '2019-03-30 20:55:04', b'0', NULL, 7, NULL, '毫升', NULL, '402881e5697a0f5001697a2c4c2c0000', 0);
INSERT INTO `t_dictionary` VALUES ('4028818669ce92a90169ceab6a3f0005', NULL, '2019-03-30 20:55:34', b'0', NULL, 5, NULL, '肌注', NULL, '4028098169747302016975fa09fe0002', 0);
INSERT INTO `t_dictionary` VALUES ('4028818669ce92a90169ceab969d0006', NULL, '2019-03-30 20:55:45', b'0', NULL, 6, NULL, '静点', NULL, '4028098169747302016975fa09fe0002', 0);
INSERT INTO `t_dictionary` VALUES ('4028818669ce92a90169ceabb8310007', NULL, '2019-03-30 20:55:54', b'0', NULL, 3, NULL, '外用', NULL, '4028098169747302016975fa09fe0002', 0);
INSERT INTO `t_dictionary` VALUES ('4028818669ce92a90169ceabfcef0008', NULL, '2019-03-30 20:56:11', b'0', NULL, 4, NULL, '皮下注射', NULL, '4028098169747302016975fa09fe0002', 0);
INSERT INTO `t_dictionary` VALUES ('402881e46854ed1c01685547a94e0002', NULL, '2019-01-16 14:09:46', b'0', NULL, 38, NULL, '布朗族', 'bulangzu', '40289289676d0e6301676da3418a0004', 0);
INSERT INTO `t_dictionary` VALUES ('402881e46854ed1c0168554801a30003', NULL, '2019-01-16 14:10:08', b'0', NULL, 39, NULL, '塔吉克族', 'tajikezu', '40289289676d0e6301676da3418a0004', 0);
INSERT INTO `t_dictionary` VALUES ('402881e46854ed1c0168554851880004', NULL, '2019-01-16 14:10:29', b'0', NULL, 40, NULL, '阿昌族', 'achangzu', '40289289676d0e6301676da3418a0004', 0);
INSERT INTO `t_dictionary` VALUES ('402881e46854ed1c01685548a0db0005', NULL, '2019-01-16 14:10:49', b'0', NULL, 41, NULL, '普米族', 'pumizu', '40289289676d0e6301676da3418a0004', 0);
INSERT INTO `t_dictionary` VALUES ('402881e46854ed1c01685548ed550006', NULL, '2019-01-16 14:11:09', b'0', NULL, 42, NULL, '鄂温克族', 'ewenkezu', '40289289676d0e6301676da3418a0004', 0);
INSERT INTO `t_dictionary` VALUES ('402881e46854ed1c0168554942940007', NULL, '2019-01-16 14:11:31', b'0', NULL, 43, NULL, '怒族', 'nuzu', '40289289676d0e6301676da3418a0004', 0);
INSERT INTO `t_dictionary` VALUES ('402881e46854ed1c0168554982a80008', NULL, '2019-01-16 14:11:47', b'0', NULL, 44, NULL, '京族', 'jingzu', '40289289676d0e6301676da3418a0004', 0);
INSERT INTO `t_dictionary` VALUES ('402881e46854ed1c01685549dbfd0009', NULL, '2019-01-16 14:12:10', b'0', NULL, 45, NULL, '基诺族', 'jinuozu', '40289289676d0e6301676da3418a0004', 0);
INSERT INTO `t_dictionary` VALUES ('402881e46854ed1c0168554a2a22000a', NULL, '2019-01-16 14:12:30', b'0', NULL, 46, NULL, '德昂族', 'deangzu', '40289289676d0e6301676da3418a0004', 0);
INSERT INTO `t_dictionary` VALUES ('402881e46854ed1c0168554a74f6000b', NULL, '2019-01-16 14:12:49', b'0', NULL, 47, NULL, '保安族', 'baoanzu', '40289289676d0e6301676da3418a0004', 0);
INSERT INTO `t_dictionary` VALUES ('402881e46854ed1c0168554ac0c5000c', NULL, '2019-01-16 14:13:08', b'0', NULL, 48, NULL, '俄罗斯族', 'eluosizu', '40289289676d0e6301676da3418a0004', 0);
INSERT INTO `t_dictionary` VALUES ('402881e46854ed1c0168554b0aa2000d', NULL, '2019-01-16 14:13:27', b'0', NULL, 49, NULL, '裕固族', 'yuguzu', '40289289676d0e6301676da3418a0004', 0);
INSERT INTO `t_dictionary` VALUES ('402881e46854ed1c0168554b6298000e', NULL, '2019-01-16 14:13:50', b'0', NULL, 50, NULL, '乌孜别克族', 'wuzibiekezu', '40289289676d0e6301676da3418a0004', 0);
INSERT INTO `t_dictionary` VALUES ('402881e46854ed1c0168554bb337000f', NULL, '2019-01-16 14:14:10', b'0', NULL, 51, NULL, '门巴族', 'menbazu', '40289289676d0e6301676da3418a0004', 0);
INSERT INTO `t_dictionary` VALUES ('402881e46854ed1c0168554c13a00010', NULL, '2019-01-16 14:14:35', b'0', NULL, 52, NULL, '鄂伦春族', 'elunchunzu', '40289289676d0e6301676da3418a0004', 0);
INSERT INTO `t_dictionary` VALUES ('402881e46854ed1c0168554c745c0011', NULL, '2019-01-16 14:15:00', b'0', NULL, 53, NULL, '独龙族', 'dulongzu', '40289289676d0e6301676da3418a0004', 0);
INSERT INTO `t_dictionary` VALUES ('402881e46854ed1c0168554cd40b0012', NULL, '2019-01-16 14:15:24', b'0', NULL, 54, NULL, '塔塔尔族', 'tataerzu', '40289289676d0e6301676da3418a0004', 0);
INSERT INTO `t_dictionary` VALUES ('402881e46854ed1c0168554d3dec0013', NULL, '2019-01-16 14:15:52', b'0', NULL, 55, NULL, '赫哲族', 'hezhezu', '40289289676d0e6301676da3418a0004', 0);
INSERT INTO `t_dictionary` VALUES ('402881e46854ed1c0168554d8cf80014', NULL, '2019-01-16 14:16:12', b'0', NULL, 1, NULL, '珞巴族', 'luobazu', '40289289676d0e6301676da3418a0004', 0);
INSERT INTO `t_dictionary` VALUES ('402881e5697a0f5001697a2cd7e20001', NULL, '2019-03-14 11:09:13', b'0', NULL, 1, '111', '片', 'pian', '402881e5697a0f5001697a2c4c2c0000', 0);
INSERT INTO `t_dictionary` VALUES ('402881e5697a0f5001697a2d899a0003', NULL, '2019-03-14 11:09:58', b'0', NULL, 1, '1', '1/日', '1/ri', '402881e5697a0f5001697a2d0f770002', 0);
INSERT INTO `t_dictionary` VALUES ('402881e769d1a4720169d1a85ffe0000', NULL, '2019-03-31 10:51:06', b'0', NULL, 2, NULL, '粒', NULL, '402881e5697a0f5001697a2c4c2c0000', 0);
INSERT INTO `t_dictionary` VALUES ('402881e769d1a4720169d1a8a16d0001', NULL, '2019-03-31 10:51:23', b'0', NULL, 3, NULL, '支', NULL, '402881e5697a0f5001697a2c4c2c0000', 0);
INSERT INTO `t_dictionary` VALUES ('402881e769d1a4720169d1a8d5450002', NULL, '2019-03-31 10:51:36', b'0', NULL, 4, NULL, '袋', NULL, '402881e5697a0f5001697a2c4c2c0000', 0);
INSERT INTO `t_dictionary` VALUES ('402881e769d1a4720169d1a946120003', NULL, '2019-03-31 10:52:05', b'0', NULL, 5, NULL, '单位', NULL, '402881e5697a0f5001697a2c4c2c0000', 0);
INSERT INTO `t_dictionary` VALUES ('402881e769d1a4720169d1a978eb0004', NULL, '2019-03-31 10:52:18', b'0', NULL, 6, NULL, '瓶', NULL, '402881e5697a0f5001697a2c4c2c0000', 0);
INSERT INTO `t_dictionary` VALUES ('402881e769d1a4720169d1a9feac0005', NULL, '2019-03-31 10:52:52', b'0', NULL, 8, NULL, '毫克', NULL, '402881e5697a0f5001697a2c4c2c0000', 0);
INSERT INTO `t_dictionary` VALUES ('402881e769d1a4720169d1aa8ce00006', NULL, '2019-03-31 10:53:29', b'0', NULL, 9, NULL, '克', NULL, '402881e5697a0f5001697a2c4c2c0000', 0);
INSERT INTO `t_dictionary` VALUES ('402892846781b2ff01678262716e0000', NULL, '2018-12-06 15:19:08', b'0', NULL, 2, 'www', '第二执纪监督室', 'dierzhijijiandushi', '4028928b6781689b016782290b030001', 0);
INSERT INTO `t_dictionary` VALUES ('40289284692c651f01692d8d1c260001', NULL, '2019-02-27 14:03:36', b'0', NULL, 3, NULL, '医护1', 'yishengyi', '40289284692c651f01692d8c944e0000', 0);
INSERT INTO `t_dictionary` VALUES ('40289284692c651f01692d9da0860002', NULL, '2019-02-27 14:21:38', b'0', NULL, 2, NULL, '医护2', 'yishenger', '40289284692c651f01692d8c944e0000', 0);
INSERT INTO `t_dictionary` VALUES ('40289287684eed6201684f34209c0000', NULL, '2019-01-15 09:50:42', b'0', NULL, 3, NULL, '第三执纪监督室 ', 'disanzhijijiandushi', '4028928b6781689b016782290b030001', 0);
INSERT INTO `t_dictionary` VALUES ('40289287684eed6201684f3467830001', NULL, '2019-01-15 09:51:00', b'0', NULL, 4, NULL, '第四执纪监督室', 'disizhijijiandushi', '4028928b6781689b016782290b030001', 0);
INSERT INTO `t_dictionary` VALUES ('40289287684eed6201684f360b960002', NULL, '2019-01-15 09:52:48', b'0', NULL, 5, NULL, '第五执纪监督室', 'diwuzhijijiandushi', '4028928b6781689b016782290b030001', 0);
INSERT INTO `t_dictionary` VALUES ('40289287684eed6201684f3652a40003', NULL, '2019-01-15 09:53:06', b'0', NULL, 6, NULL, '第六执纪监督室', 'diliuzhijijiandushi', '4028928b6781689b016782290b030001', 0);
INSERT INTO `t_dictionary` VALUES ('40289287684eed6201684f36a2860004', NULL, '2019-01-15 09:53:27', b'0', NULL, 7, NULL, '第七执纪监督室', 'diqizhijijiandushi', '4028928b6781689b016782290b030001', 0);
INSERT INTO `t_dictionary` VALUES ('40289287684eed6201684f36ee080005', NULL, '2019-01-15 09:53:46', b'0', NULL, 8, NULL, '第八执纪监督室', 'dibazhijijiandushi', '4028928b6781689b016782290b030001', 0);
INSERT INTO `t_dictionary` VALUES ('40289287684eed6201684f37750a0006', NULL, '2019-01-15 09:54:21', b'0', NULL, 1, NULL, '第一审查调查室', 'diyishenchadiaochashi', '4028928b6781689b016782290b030001', 0);
INSERT INTO `t_dictionary` VALUES ('40289287684eed6201684f37f40c0007', NULL, '2019-01-15 09:54:53', b'0', NULL, 2, NULL, '第二审查调查室', 'diershenchadiaochashi', '4028928b6781689b016782290b030001', 0);
INSERT INTO `t_dictionary` VALUES ('40289287684eed6201684f3845400008', NULL, '2019-01-15 09:55:14', b'0', NULL, 3, NULL, '第三审查调查室', 'disanshenchadiaochashi', '4028928b6781689b016782290b030001', 0);
INSERT INTO `t_dictionary` VALUES ('40289287684eed6201684f3883850009', NULL, '2019-01-15 09:55:30', b'0', NULL, 4, NULL, '第四审查调查室', 'disishenchadiaochashi', '4028928b6781689b016782290b030001', 0);
INSERT INTO `t_dictionary` VALUES ('40289287684eed6201684f38c3c7000a', NULL, '2019-01-15 09:55:46', b'0', NULL, 5, NULL, '第五审查调查室', 'diwushenchadiaochashi', '4028928b6781689b016782290b030001', 0);
INSERT INTO `t_dictionary` VALUES ('40289287684eed6201684f391482000b', NULL, '2019-01-15 09:56:07', b'0', NULL, 6, NULL, '第六审查调查室', 'diliushenchadiaochashi', '4028928b6781689b016782290b030001', 0);
INSERT INTO `t_dictionary` VALUES ('40289287684eed6201684f395d60000c', NULL, '2019-01-15 09:56:26', b'0', NULL, 1, NULL, '干部监督室', 'ganbujiandushi', '4028928b6781689b016782290b030001', 0);
INSERT INTO `t_dictionary` VALUES ('40289287684eed6201684f39c5bb000d', NULL, '2019-01-15 09:56:52', b'0', NULL, 1, NULL, '滨海新区纪委监委', 'binhaixinqujiweijianwei', '4028928b6781689b016782290b030001', 0);
INSERT INTO `t_dictionary` VALUES ('40289287684eed6201684f3a147a000e', NULL, '2019-01-15 09:57:12', b'0', NULL, 2, NULL, '和平区纪委监委', 'hepingqujiweijianwei', '4028928b6781689b016782290b030001', 0);
INSERT INTO `t_dictionary` VALUES ('40289287684eed6201684f3a4afe000f', NULL, '2019-01-15 09:57:26', b'0', NULL, 3, NULL, '河东区纪委监委', 'hedongqujiweijianwei', '4028928b6781689b016782290b030001', 0);
INSERT INTO `t_dictionary` VALUES ('40289287684eed6201684f3a93750010', NULL, '2019-01-15 09:57:45', b'0', NULL, 4, NULL, '河西区纪委监委', 'hexiqujiweijianwei', '4028928b6781689b016782290b030001', 0);
INSERT INTO `t_dictionary` VALUES ('40289287684eed6201684f3adc7e0011', NULL, '2019-01-15 09:58:04', b'0', NULL, 5, NULL, '南开区纪委监委', 'nankaiqujiweijianwei', '4028928b6781689b016782290b030001', 0);
INSERT INTO `t_dictionary` VALUES ('40289287684eed6201684f3b25ff0012', NULL, '2019-01-15 09:58:22', b'0', NULL, 6, NULL, '河北区纪委监委', 'hebeiqujiweijianwei', '4028928b6781689b016782290b030001', 0);
INSERT INTO `t_dictionary` VALUES ('40289287684eed6201684f3b5e350013', NULL, '2019-01-15 09:58:37', b'0', NULL, 7, NULL, '红桥区纪委监委', 'hongqiaoqujiweijianwei', '4028928b6781689b016782290b030001', 0);
INSERT INTO `t_dictionary` VALUES ('40289287684eed6201684f3b97c30014', NULL, '2019-01-15 09:58:52', b'0', NULL, 8, NULL, '东丽区纪委监委', 'dongiqujiweijianwei', '4028928b6781689b016782290b030001', 0);
INSERT INTO `t_dictionary` VALUES ('40289287684eed6201684f3bd42b0015', NULL, '2019-01-15 09:59:07', b'0', NULL, 9, NULL, '西青区纪委监委', 'xiqingqujiweijianwei', '4028928b6781689b016782290b030001', 0);
INSERT INTO `t_dictionary` VALUES ('40289287684eed6201684f3c320d0016', NULL, '2019-01-15 09:59:31', b'0', NULL, 10, NULL, '津南区纪委监委', 'jinnanqujiweijianwei', '4028928b6781689b016782290b030001', 0);
INSERT INTO `t_dictionary` VALUES ('40289287684eed6201684f3c74780017', NULL, '2019-01-15 09:59:48', b'0', NULL, 11, NULL, '北辰区纪委监委', 'beichenqujiweijianwei', '4028928b6781689b016782290b030001', 0);
INSERT INTO `t_dictionary` VALUES ('40289287684eed6201684f3cc5780018', NULL, '2019-01-15 10:00:09', b'0', NULL, 12, NULL, '武清区纪委监委', 'wuqingqujiweijianwei', '4028928b6781689b016782290b030001', 0);
INSERT INTO `t_dictionary` VALUES ('40289287684eed6201684f3d16470019', NULL, '2019-01-15 10:00:30', b'0', NULL, 13, NULL, '宝坻区纪委监委', 'baodiqujiweijianwei', '4028928b6781689b016782290b030001', 0);
INSERT INTO `t_dictionary` VALUES ('40289287684eed6201684f3d556f001a', NULL, '2019-01-15 10:00:46', b'0', NULL, 14, NULL, '宁河区纪委监委', 'ninghequjiweijianwei', '4028928b6781689b016782290b030001', 0);
INSERT INTO `t_dictionary` VALUES ('40289287684eed6201684f3d8ca7001b', NULL, '2019-01-15 10:01:00', b'0', NULL, 15, NULL, '静海区纪委监委', 'jinghaiqujiweijianwei', '4028928b6781689b016782290b030001', 0);
INSERT INTO `t_dictionary` VALUES ('40289287684eed6201684f3dcd2e001c', NULL, '2019-01-15 10:01:16', b'0', NULL, 16, NULL, '蓟州区纪委监委', 'jizhouqujiweijianwei', '4028928b6781689b016782290b030001', 0);
INSERT INTO `t_dictionary` VALUES ('40289287684f430c01684f755acb0004', NULL, '2019-01-15 11:01:57', b'0', NULL, 1, NULL, '男公安', 'nangongan', '40289287684f430c01684f74cfd00003', 0);
INSERT INTO `t_dictionary` VALUES ('40289287684f430c01684f7602c70005', NULL, '2019-01-15 11:02:40', b'0', NULL, 2, NULL, '女公安', 'nvgongan', '40289287684f430c01684f74cfd00003', 0);
INSERT INTO `t_dictionary` VALUES ('40289287684f430c01684f7653b50006', NULL, '2019-01-15 11:03:01', b'0', NULL, 3, NULL, '武警', 'wujing', '40289287684f430c01684f74cfd00003', 0);
INSERT INTO `t_dictionary` VALUES ('40289289676d0e6301676d78c3590002', NULL, '2018-12-02 13:51:30', b'0', NULL, 2, NULL, '先锋', 'xianfeng', '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('40289289676d0e6301676d7a05620003', NULL, '2018-12-02 13:52:52', b'0', NULL, 3, NULL, '感冒灵颗粒', '感冒灵颗粒', '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('40289289676d0e6301676da437bf0006', NULL, '2018-12-02 14:38:57', b'0', NULL, 2, NULL, '壮族', 'zhuangzu', '40289289676d0e6301676da3418a0004', 0);
INSERT INTO `t_dictionary` VALUES ('40289289676d0e6301676da4911f0007', NULL, '2018-12-02 14:39:20', b'0', NULL, 3, NULL, '满族', 'manzu', '40289289676d0e6301676da3418a0004', 0);
INSERT INTO `t_dictionary` VALUES ('40289289676d0e6301676da4dcb80008', NULL, '2018-12-02 14:39:40', b'0', NULL, 4, NULL, '回族', 'huizu', '40289289676d0e6301676da3418a0004', 0);
INSERT INTO `t_dictionary` VALUES ('40289289676d0e6301676da5c3500009', NULL, '2018-12-02 14:40:39', b'0', NULL, 5, NULL, '苗族', 'miaozu', '40289289676d0e6301676da3418a0004', 0);
INSERT INTO `t_dictionary` VALUES ('40289289676d0e6301676da634a8000a', NULL, '2018-12-02 14:41:08', b'0', NULL, 6, NULL, '维吾尔族', 'weiwuerzu', '40289289676d0e6301676da3418a0004', 0);
INSERT INTO `t_dictionary` VALUES ('40289289676d0e6301676da69040000b', NULL, '2018-12-02 14:41:31', b'0', NULL, 7, NULL, '土家族', 'tujiazu', '40289289676d0e6301676da3418a0004', 0);
INSERT INTO `t_dictionary` VALUES ('40289289676d0e6301676da7c541000c', NULL, '2018-12-02 14:42:50', b'0', NULL, 8, NULL, '彝族', 'yizu', '40289289676d0e6301676da3418a0004', 0);
INSERT INTO `t_dictionary` VALUES ('40289289676d0e6301676da84d34000d', NULL, '2018-12-02 14:43:25', b'0', NULL, 9, NULL, '蒙古族', 'mengguzu', '40289289676d0e6301676da3418a0004', 0);
INSERT INTO `t_dictionary` VALUES ('40289289676d0e6301676da901f2000e', NULL, '2018-12-02 14:44:11', b'0', NULL, 10, NULL, '藏族', 'zangzu', '40289289676d0e6301676da3418a0004', 0);
INSERT INTO `t_dictionary` VALUES ('40289289676d0e6301676da9befd000f', NULL, '2018-12-02 14:45:00', b'0', NULL, 11, NULL, '布依族', 'buyizu', '40289289676d0e6301676da3418a0004', 0);
INSERT INTO `t_dictionary` VALUES ('40289289676d0e6301676daa401e0010', NULL, '2018-12-02 14:45:33', b'0', NULL, 12, NULL, '侗族', 'dongzu', '40289289676d0e6301676da3418a0004', 0);
INSERT INTO `t_dictionary` VALUES ('40289289676d0e6301676daa927c0011', NULL, '2018-12-02 14:45:54', b'0', NULL, 13, NULL, '瑶族', 'yaozu', '40289289676d0e6301676da3418a0004', 0);
INSERT INTO `t_dictionary` VALUES ('40289289676d0e6301676daaf5d00012', NULL, '2018-12-02 14:46:19', b'0', NULL, 14, NULL, '朝鲜族', 'chaoxianzu', '40289289676d0e6301676da3418a0004', 0);
INSERT INTO `t_dictionary` VALUES ('40289289676d0e6301676dab45bd0013', NULL, '2018-12-02 14:46:40', b'0', NULL, 15, NULL, '白族', 'baizu', '40289289676d0e6301676da3418a0004', 0);
INSERT INTO `t_dictionary` VALUES ('40289289676d0e6301676dabce790014', NULL, '2018-12-02 14:47:15', b'0', NULL, 16, NULL, '哈尼族', 'hanizu', '40289289676d0e6301676da3418a0004', 0);
INSERT INTO `t_dictionary` VALUES ('40289289676d0e6301676dac81bd0015', NULL, '2018-12-02 14:48:01', b'0', NULL, 17, NULL, '哈萨克族', 'hasakezu', '40289289676d0e6301676da3418a0004', 0);
INSERT INTO `t_dictionary` VALUES ('40289289676d0e6301676dacdf7b0016', NULL, '2018-12-02 14:48:25', b'0', NULL, 18, NULL, '黎族', 'lizu', '40289289676d0e6301676da3418a0004', 0);
INSERT INTO `t_dictionary` VALUES ('40289289676d0e6301676dad56b10017', NULL, '2018-12-02 14:48:55', b'0', NULL, 19, NULL, '傣族', 'daizu', '40289289676d0e6301676da3418a0004', 0);
INSERT INTO `t_dictionary` VALUES ('40289289676d0e6301676dae4d040018', NULL, '2018-12-02 14:49:58', b'0', NULL, 20, NULL, '畲族', 'shezu', '40289289676d0e6301676da3418a0004', 0);
INSERT INTO `t_dictionary` VALUES ('40289289676d0e6301676dc467740019', NULL, '2018-12-02 15:14:07', b'0', NULL, 21, NULL, '傈僳族', 'lisuzu', '40289289676d0e6301676da3418a0004', 0);
INSERT INTO `t_dictionary` VALUES ('40289289676d0e6301676dc4f12b001a', NULL, '2018-12-02 15:14:42', b'0', NULL, 22, NULL, '仡佬族', 'gelaozu', '40289289676d0e6301676da3418a0004', 0);
INSERT INTO `t_dictionary` VALUES ('40289289676d0e6301676dc56abb001b', NULL, '2018-12-02 15:15:13', b'0', NULL, 23, NULL, '东乡族', 'dongxiangzu', '40289289676d0e6301676da3418a0004', 0);
INSERT INTO `t_dictionary` VALUES ('40289289676d0e6301676dc5bf55001c', NULL, '2018-12-02 15:15:35', b'0', NULL, 24, NULL, '高山族', 'gaoshanzu', '40289289676d0e6301676da3418a0004', 0);
INSERT INTO `t_dictionary` VALUES ('40289289676d0e6301676dc62971001d', NULL, '2018-12-02 15:16:02', b'0', NULL, 25, NULL, '拉祜族', 'lahuzu', '40289289676d0e6301676da3418a0004', 0);
INSERT INTO `t_dictionary` VALUES ('40289289676d0e6301676dc680e1001e', NULL, '2018-12-02 15:16:24', b'0', NULL, 26, NULL, '水族', 'shuizu', '40289289676d0e6301676da3418a0004', 0);
INSERT INTO `t_dictionary` VALUES ('40289289676d0e6301676dc6cb35001f', NULL, '2018-12-02 15:16:43', b'0', NULL, 27, NULL, '佤族', 'wazu', '40289289676d0e6301676da3418a0004', 0);
INSERT INTO `t_dictionary` VALUES ('40289289676d0e6301676dc7202e0020', NULL, '2018-12-02 15:17:05', b'0', NULL, 28, NULL, '纳西族', 'naxizu', '40289289676d0e6301676da3418a0004', 0);
INSERT INTO `t_dictionary` VALUES ('40289289676d0e6301676dc776980021', NULL, '2018-12-02 15:17:27', b'0', NULL, 29, NULL, '羌族', 'qiangzu', '40289289676d0e6301676da3418a0004', 0);
INSERT INTO `t_dictionary` VALUES ('40289289676d0e6301676dc7c1860022', NULL, '2018-12-02 15:17:47', b'0', NULL, 30, NULL, '土族', 'tuzu', '40289289676d0e6301676da3418a0004', 0);
INSERT INTO `t_dictionary` VALUES ('40289289676d0e6301676dc86de40023', NULL, '2018-12-02 15:18:31', b'0', NULL, 31, NULL, '仫佬族', 'mulaozu', '40289289676d0e6301676da3418a0004', 0);
INSERT INTO `t_dictionary` VALUES ('40289289676d0e6301676dc8fff20024', NULL, '2018-12-02 15:19:08', b'0', NULL, 32, NULL, '锡伯族', 'xibozu', '40289289676d0e6301676da3418a0004', 0);
INSERT INTO `t_dictionary` VALUES ('40289289676d0e6301676dc9b5610025', NULL, '2018-12-02 15:19:54', b'0', NULL, 33, NULL, '柯尔克孜族', 'keerkezizu', '40289289676d0e6301676da3418a0004', 0);
INSERT INTO `t_dictionary` VALUES ('40289289676d0e6301676dcb68480026', NULL, '2018-12-02 15:21:46', b'0', NULL, 34, NULL, '达斡尔族', 'dawoerzu', '40289289676d0e6301676da3418a0004', 0);
INSERT INTO `t_dictionary` VALUES ('40289289676d0e6301676dcbfd560027', NULL, '2018-12-02 15:22:24', b'0', NULL, 35, NULL, '景颇族', 'jingpozu', '40289289676d0e6301676da3418a0004', 0);
INSERT INTO `t_dictionary` VALUES ('40289289676d0e6301676dd070ac0028', NULL, '2018-12-02 15:27:16', b'0', NULL, 36, NULL, '毛南族', 'maonanzu', '40289289676d0e6301676da3418a0004', 0);
INSERT INTO `t_dictionary` VALUES ('40289289676d0e6301676dd1371d0029', NULL, '2018-12-02 15:28:06', b'0', NULL, 37, NULL, '撒拉族', 'salazu', '40289289676d0e6301676da3418a0004', 0);
INSERT INTO `t_dictionary` VALUES ('4028928a67623c07016762bffd890004', NULL, '2018-11-30 11:53:28', b'0', NULL, 1, '斯达舒', '斯达舒', 'sidashu', '4028928a6763235301676329ed7b0000', 0);
INSERT INTO `t_dictionary` VALUES ('4028928b6781689b016782298bcc0002', NULL, '2018-12-06 14:17:00', b'0', NULL, 1, '1', ' 第一执纪监督室', 'diyizhijijiandushi', '4028928b6781689b016782290b030001', 0);
INSERT INTO `t_dictionary` VALUES ('4028928f690d793901690e49f24b0003', NULL, '2019-02-21 12:22:01', b'0', NULL, 56, NULL, '汉族', 'hanzu', '40289289676d0e6301676da3418a0004', 0);

-- ----------------------------
-- Table structure for t_dictsort
-- ----------------------------
DROP TABLE IF EXISTS `t_dictsort`;
CREATE TABLE `t_dictsort`  (
  `id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `createrid` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `createtime` varchar(19) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `deleted` bit(1) DEFAULT NULL,
  `title` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `dictsortName` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `isOwner` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_dictsort
-- ----------------------------
INSERT INTO `t_dictsort` VALUES ('4028098169747302016975fa09fe0002', NULL, '2019-03-13 15:35:14', b'0', NULL, '药品用法', 0);
INSERT INTO `t_dictsort` VALUES ('402881e5697a0f5001697a2c4c2c0000', NULL, '2019-03-14 11:08:37', b'0', NULL, '药品规格', 0);
INSERT INTO `t_dictsort` VALUES ('402881e5697a0f5001697a2d0f770002', NULL, '2019-03-14 11:09:27', b'0', NULL, '药品频次', 0);
INSERT INTO `t_dictsort` VALUES ('40289284692c651f01692d8c944e0000', NULL, '2019-02-27 14:03:01', b'0', NULL, '医护人员', 0);
INSERT INTO `t_dictsort` VALUES ('40289287684f430c01684f74cfd00003', NULL, '2019-01-15 11:01:21', b'0', NULL, '看护力量', 0);
INSERT INTO `t_dictsort` VALUES ('40289289676d0e6301676da3418a0004', NULL, '2018-12-02 14:37:54', b'0', NULL, '民族', 0);
INSERT INTO `t_dictsort` VALUES ('4028928a6763235301676329ed7b0000', NULL, '2018-11-30 13:49:11', b'0', NULL, '药品', 0);
INSERT INTO `t_dictsort` VALUES ('4028928b6781689b016782290b030001', NULL, '2018-12-06 14:16:27', b'0', NULL, '部门', 0);

-- ----------------------------
-- Table structure for t_drug
-- ----------------------------
DROP TABLE IF EXISTS `t_drug`;
CREATE TABLE `t_drug`  (
  `id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `createrid` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `createtime` varchar(19) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `deleted` bit(1) DEFAULT NULL,
  `title` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `doctor` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `drugName` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `drugTotalCount` int(11) DEFAULT NULL,
  `price` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `remark` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `unit` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `rukuTime` date DEFAULT NULL,
  `lpId` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `guige` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_drug
-- ----------------------------
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000001', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000001', NULL, '24.78', '2.06', '盒', NULL, NULL, '12丸');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000002', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000002', NULL, '1.47', NULL, '支', NULL, NULL, '20ml');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000003', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000003', NULL, '10', NULL, '包', NULL, NULL, NULL);
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000004', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000004', NULL, '7.2', '0.07', '瓶', NULL, NULL, '100片');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000005', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000005', NULL, '59.71', '9.95', '盒', NULL, NULL, '250mg*6');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000006', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000006', NULL, '15.4', '0.51', '盒', NULL, NULL, '100mg*30');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000007', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000007', NULL, '38.64', '0.65', '盒', NULL, NULL, '46.5mg*60');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000008', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000008', NULL, '59', '8.5', '盒', NULL, NULL, '15mg*7');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000009', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000009', NULL, '5.8', '0.29', '盒', NULL, NULL, '1mg*20');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000010', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000010', NULL, '45.58', NULL, '支', NULL, NULL, '10mg');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000011', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000011', NULL, '29.24', '4.18', '盒', NULL, NULL, '162.5mg*7');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000012', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000012', NULL, '28.59', '4.08', '盒', NULL, NULL, '150mg*7');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000013', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000013', NULL, '20.18', NULL, '支', NULL, NULL, '0.2g');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000014', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000014', NULL, '69.83', '23.28', '盒', NULL, NULL, '400mg*3');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000015', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000015', NULL, '61.92', '2.1', '盒', NULL, NULL, '50mg*30');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000016', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000016', NULL, '27', '3.86', '盒', NULL, NULL, '30mg*7');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000017', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000017', NULL, '55.76', '5.58', '盒', NULL, NULL, '5mg*10');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000018', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000018', NULL, '14.82', '2.2', '盒', NULL, NULL, '47.5mg*7');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000019', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000019', NULL, '12', '0.12', '盒', NULL, NULL, '4mg*100');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000020', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000020', NULL, '118', '16.85', '盒', NULL, NULL, '75mg*7');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000021', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000021', NULL, '29.14', '2.92', '盒', NULL, NULL, '5mg*10');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000022', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000022', NULL, '15.96', '1.6', '盒', NULL, NULL, '5mg*10');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000023', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000023', NULL, '12.97', '0.65', '盒', NULL, NULL, '300mg*20');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000024', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000024', NULL, '15.2', '0.13', '盒', NULL, NULL, '30mg*120');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000025', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000025', NULL, '5', '1', '包', NULL, NULL, '5贴');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000026', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000026', NULL, '12.7', NULL, '支', NULL, NULL, '0.4g');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000027', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000027', NULL, '18.52', '1', '盒', NULL, NULL, '500mg*20');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000028', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000028', NULL, '11.5', '1.15', '盒', NULL, NULL, '9g*10');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000029', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000029', NULL, '34.27', '4.9', '盒', NULL, NULL, '80mg*7');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000030', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000030', NULL, '51.89', '2.59', '盒', NULL, NULL, '10.5mg*20');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000031', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000031', NULL, '26.08', '0.14', '盒', NULL, NULL, '27mg*180丸');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000032', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000032', NULL, '27.61', '1.15', '盒', NULL, NULL, '0.45g*24');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000033', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000033', NULL, '8.5', '0.35', '盒', NULL, NULL, '24片');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000034', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000034', NULL, '18.9', '1.89', '盒', NULL, NULL, '0.2g*10');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000035', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000035', NULL, '17.21', NULL, '支', NULL, NULL, '0.2g');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000036', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000036', NULL, '26', '1.3', '盒', NULL, NULL, '5mg*20');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000037', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000037', NULL, '26.08', '0.15', '盒', NULL, NULL, '27mg*180');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000038', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000038', NULL, '1', NULL, '包', NULL, NULL, NULL);
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000039', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000039', NULL, '23.13', '1.2', '盒', NULL, NULL, '500mg*20');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000040', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000040', NULL, '24', '4.8', '盒', NULL, NULL, '5贴');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000041', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000041', NULL, '52.88', '5.29', '盒', NULL, NULL, '0.2*10');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000042', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000042', NULL, '20', '2', '盒', NULL, NULL, '90mg*10');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000043', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000043', NULL, '6', NULL, '支', NULL, NULL, '2.5g');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000044', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000044', NULL, '34', '1.13', '盒', NULL, NULL, NULL);
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000045', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000045', NULL, '5', '0.1', '盒', NULL, NULL, '0.33g*48');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000046', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000046', NULL, '21.56', '3.59', '盒', NULL, NULL, '1贴*6');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000047', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000047', NULL, '15.45', '0.52', '盒', NULL, NULL, '0.45g*30');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000048', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000048', NULL, '35.28', '0.88', '盒', NULL, NULL, '50mg*40');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000049', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000049', NULL, '15', '0.63', '盒', NULL, NULL, '24');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000050', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000050', NULL, '18.62', '4.66', '盒', NULL, NULL, '20g*4');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000051', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000051', NULL, '7.48', '0.16', '盒', NULL, NULL, '0.25g*48');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000052', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000052', NULL, '2.5', NULL, '瓶', NULL, NULL, NULL);
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000053', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000053', NULL, '42.5', '1.42', '盒', NULL, NULL, '50mg*30');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000054', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000054', NULL, '25', '3.57', '盒', NULL, NULL, '15mg*7');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000055', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000055', NULL, '19.03', '0.95', '盒', NULL, NULL, '12.5mg*20');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000056', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000056', NULL, '17.53', '2.92', '盒', NULL, NULL, '10mg*6');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000057', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000057', NULL, '0.7', NULL, '支', NULL, NULL, '20ml');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000058', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000058', NULL, '28.5', '2.85', '盒', NULL, NULL, '5mg*10');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000059', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000059', NULL, '48.75', '6.97', '盒', NULL, NULL, '0.1g*7');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000060', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000060', NULL, '49.25', '7.04', '盒', NULL, NULL, '10mg*7');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000061', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000061', NULL, '29.39', NULL, '支', NULL, NULL, '5ml');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000062', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000062', NULL, '45.72', '11.43', '盒', NULL, NULL, '0.5g*4');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000063', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000063', NULL, '13', '4.33', '盒', NULL, NULL, '500mg*3');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000064', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000064', NULL, '10', '1', '包', NULL, NULL, '10个');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000065', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000065', NULL, '184.62', NULL, '支', NULL, NULL, '3ml');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000066', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000066', NULL, '31.46', '2.62', '盒', NULL, NULL, '10ml*12');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000067', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000067', NULL, '22.92', '1.14', '盒', NULL, NULL, '60mg*20');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000068', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000068', NULL, '54.06', '0.45', '盒', NULL, NULL, '60mg*120');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000069', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000069', NULL, '55.5', '2.77', '盒', NULL, NULL, '20mg*7');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000070', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000070', NULL, '11.09', '0.46', '盒', NULL, NULL, '0.35g*24');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000071', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000071', NULL, '74.8', '10.69', '盒', NULL, NULL, '20mg*7');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000072', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000072', NULL, '29.88', '4.3', '盒', NULL, NULL, '5mg*7');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000073', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000073', NULL, '13.21', '0.67', '盒', NULL, NULL, '0.6mg*20');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000074', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000074', NULL, '19.04', '0.45', '盒', NULL, NULL, '10mg*42');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000075', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000075', NULL, '34.3', '4.9', '盒', NULL, NULL, '80mg*7');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000076', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000076', NULL, '38.26', '2.73', '盒', NULL, NULL, '10ml*14');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000077', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000077', NULL, '28.21', '1.41', '盒', NULL, NULL, '0.5mg*20');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000078', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000078', NULL, '30.21', '1.5', '盒', NULL, NULL, '1#*20');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000079', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000079', NULL, '11.37', '0.38', '盒', NULL, NULL, '6mg*30');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000080', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000080', NULL, '16.23', '1.35', '盒', NULL, NULL, '0.1g*12');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000081', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000081', NULL, '14.7', '4.9', '盒', NULL, NULL, '6g*3');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000082', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000082', NULL, '20.6', '1.03', '盒', NULL, NULL, '32mg*20');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000083', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000083', NULL, '105', '15', '盒', NULL, NULL, '40mg*7');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000084', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000084', NULL, '33.46', '0.7', '盒', NULL, NULL, '0.4mg*48');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000085', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000085', NULL, '64.24', '3.57', '盒', NULL, NULL, '5g*18');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000086', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000086', NULL, '6.95', '0.07', '盒', NULL, NULL, '0.25g*100');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000087', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000087', NULL, '1.75', '0.04', '盒', NULL, NULL, '0.1g*50粒');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000088', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000088', NULL, '57.38', '1.91', '盒', NULL, NULL, '1mg*30');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000089', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000089', NULL, '14.79', NULL, '支', NULL, NULL, '15g');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000090', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000090', NULL, '31.8', '0.66', '盒', NULL, NULL, NULL);
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000091', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000091', NULL, '44.42', '3.7', '盒', NULL, NULL, '10ml*12');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000092', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000092', NULL, '35.66', NULL, '支', NULL, NULL, '5ml');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000093', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000093', NULL, '106.88', '10.69', '盒', NULL, NULL, '30mg*10');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000094', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000094', NULL, '2', NULL, '盒', NULL, NULL, NULL);
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000095', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000095', NULL, '50.73', '8.46', '盒', NULL, NULL, '5g*6');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000096', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000096', NULL, '9.2', '0.38', '盒', NULL, NULL, '0.6g*24');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000097', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000097', NULL, '9.2', '0.19', '盒', NULL, NULL, '0.33g*48');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000098', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000098', NULL, '28.91', '0.29', '盒', NULL, NULL, '1#*100');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000099', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000099', NULL, '16.8', '0.7', '盒', NULL, NULL, '0.1g*24');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000100', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000100', NULL, '50', '7.14', '盒', NULL, NULL, '10mg*7');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000101', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000101', NULL, '26.6', '0.53', '盒', NULL, NULL, '10mg*50');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000102', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000102', NULL, '11.28', '0.56', '盒', NULL, NULL, '1#*20');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000103', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000103', NULL, '13.5', '1.35', '盒', NULL, NULL, '10贴');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000104', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000104', NULL, '15.2', '0.42', '盒', NULL, NULL, NULL);
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000105', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000105', NULL, '26.67', '0.67', '盒', NULL, NULL, '0.3g*40');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000106', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000106', NULL, '16.92', '0.85', '盒', NULL, NULL, '100mg*20');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000107', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000107', NULL, '132.26', '2.21', '盒', NULL, NULL, '150mg*60');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000108', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000108', NULL, '39', '6.5', '盒', NULL, NULL, '6袋');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000109', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000109', NULL, '17.8', '1.78', '盒', NULL, NULL, '3g*10');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000110', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000110', NULL, '56.89', '2.85', '盒', NULL, NULL, '10mg*20');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000111', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000111', NULL, '27.5', '1.72', '盒', NULL, NULL, '16片');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000112', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000112', NULL, '33.1', '0.22', '盒', NULL, NULL, '40mg*150');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000113', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000113', NULL, '29.41', '7.35', '盒', NULL, NULL, '37.5mg*4');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000114', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000114', NULL, '53', '1.77', '盒', NULL, NULL, '20mg*30');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000115', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000115', NULL, '4.5', '0.05', '盒', NULL, NULL, '0.1g*100');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000116', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000116', NULL, '32.49', '0.45', '盒', NULL, NULL, '1#*72');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000117', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000117', NULL, '26.6', '2.96', '盒', NULL, NULL, '5g*9');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000118', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000118', NULL, '2.6', NULL, '副', NULL, NULL, NULL);
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000119', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000119', NULL, '11.76', NULL, '瓶', NULL, NULL, NULL);
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000120', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000120', NULL, '32.93', '2.74', '盒', NULL, NULL, '0.25g*6片*2板');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000121', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000121', NULL, '59.71', '9.95', '盒', NULL, NULL, '250mg*6');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000122', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000122', NULL, '27.93', NULL, '支', NULL, NULL, NULL);
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000123', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000123', NULL, '87.5', '12.5', '盒', NULL, NULL, '7贴');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000124', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000124', NULL, '7', '0.14', '瓶', NULL, NULL, '0.5mg*50');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000125', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000125', NULL, '19.8', '0.2', '盒', NULL, NULL, '5mg*100');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000126', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000126', NULL, '39.36', '0.82', '盒', NULL, NULL, '20mg*48');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000127', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000127', NULL, '14.8', '1.48', '盒', NULL, NULL, '10片');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000128', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000128', NULL, '22.4', NULL, '支', NULL, NULL, '5ml');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000129', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000129', NULL, '19.8', '0.2', '瓶', NULL, NULL, '50mg*100');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000130', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000130', NULL, '20.93', '2.99', '盒', NULL, NULL, '60mg*7');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000131', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000131', NULL, '41.73', '8.35', '盒', NULL, NULL, '60mg*5');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000132', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000132', NULL, '37.95', '1.58', '盒', NULL, NULL, '228mg*24');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000133', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000133', NULL, '12.8', '0.53', '盒', NULL, NULL, '24片');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000134', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000134', NULL, '20.01', '0.56', '盒', NULL, NULL, '36');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000135', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000135', NULL, '12.7', NULL, '支', NULL, NULL, '10mg');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000136', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000136', NULL, '22', '1.38', '盒', NULL, NULL, '0.25g*16');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000137', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000137', NULL, '29.47', NULL, '盒', NULL, NULL, NULL);
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000138', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000138', NULL, '5.37', '2', '盒', NULL, NULL, '12枚');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000139', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000139', NULL, '29.97', '0.83', '盒', NULL, NULL, '0.28g*36');
INSERT INTO `t_drug` VALUES ('0000000000000000000000000000140', NULL, NULL, b'0', NULL, NULL, '0000000000000000000000000000140', NULL, '10', '0.83', '盒', NULL, NULL, '0.1g*12');
INSERT INTO `t_drug` VALUES ('40289283675f303e01675f61be6b0001', NULL, '2018-11-29 20:11:40', b'0', NULL, '王医生1', '4028928a67623c07016762bffd890004', 4, '20', '大神大神多', '盒', '2018-11-06', NULL, NULL);
INSERT INTO `t_drug` VALUES ('40289289676c996d01676cb515d00003', NULL, '2018-12-02 10:17:46', b'0', NULL, '1', '40289289676d0e6301676d78c3590002', 1, '1', '1', '1', '2018-12-02', NULL, NULL);
INSERT INTO `t_drug` VALUES ('40289290676d4ee301676da8808f0000', NULL, '2018-12-02 14:43:38', b'0', NULL, '1', '40289289676d0e6301676d7a05620003', 100, '1', NULL, '瓶', '2018-12-02', NULL, '哈哈');

-- ----------------------------
-- Table structure for t_feedback
-- ----------------------------
DROP TABLE IF EXISTS `t_feedback`;
CREATE TABLE `t_feedback`  (
  `id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `createrid` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `createtime` varchar(19) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `deleted` bit(1) DEFAULT NULL,
  `title` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `department` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `fkTime` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `lienPersonnelid` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `problem` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci,
  `signTime` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `suggest` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci,
  `shenpi` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `fzPerson` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `gjResult` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci,
  `gjTime` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `phone` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `bumenid` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_feedback
-- ----------------------------
INSERT INTO `t_feedback` VALUES ('2', NULL, '2018-12-3', b'0', '李四1', '纪检部', '2018-11-12', '402892906762e1a1016762f7575e0001', '个别人员不遵守纪律', '2018-12-02', '说服教育', NULL, '张警官', '22222222', '2018-12-20', '13504528965', NULL);
INSERT INTO `t_feedback` VALUES ('2c9acde9697f19ff0169853bdf960003', NULL, '2019-03-16 14:41:27', b'0', 'AAA', 'xxx', '2019-03-16', '4028928769473ec20169474c408d0001', 'ABC', '2019-03-16', 'BCA', NULL, 'CCC', 'OVER BACK', '2019-03-17', '1234567890', NULL);
INSERT INTO `t_feedback` VALUES ('402881e867720c45016772affe7a0005', NULL, '2018-12-03 14:09:55', b'0', '小行星', '考核部', '2018-12-02', '402881e867720c450167724d46c80000', '考核成绩不理想', '2018-12-02', '加班！加班！加班！', NULL, '张警官', '6666666666', '2018-12-20', '13256788765', NULL);
INSERT INTO `t_feedback` VALUES ('402881e8677324390167745468de0003', NULL, '2018-12-03 21:49:08', b'0', '111111111111111111', '检查一室', '2018-12-03', '402881e867732439016773313a870001', '昨晚1号没回寝室', '2018-12-03', '加强制度管理，加强检查强度', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_feedback` VALUES ('402892846773705f016773729f690000', NULL, '2018-12-03 17:42:31', b'0', '1111', '考核部', '2018-12-03', '402881e867732439016773313a870001', '期中考试语文古诗词默写全年级最差', '2018-12-03', '每天抄写古诗一边，加强记忆', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_feedback` VALUES ('402892846776b9c4016776c9f5ba0000', NULL, '2018-12-04 09:16:46', b'0', '张三', '考核部', '2018-12-04', '402881e867732439016773313a870001', '全年级数学成绩最差', '2018-12-04', '抽出一节课时间，加课，答疑问题', NULL, NULL, NULL, NULL, '13256788765', NULL);
INSERT INTO `t_feedback` VALUES ('402892846919adbe016919b0959f0000', NULL, '2019-02-23 17:29:56', b'0', '1212', '12', '2019-02-05', '4028928f690d793901690e5180a10005', '12', '2019-02-21', '12', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_feedback` VALUES ('402892846919adbe016919b142f80001', NULL, '2019-02-23 17:30:41', b'0', '12121', '12', '2019-02-05', '4028928f690d793901690e5180a10005', '1212', '2019-02-14', '1212', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_feedback` VALUES ('402892846919adbe016919b260170002', NULL, '2019-02-23 17:31:54', b'0', '是多少', '12', '2019-02-12', '4028928f690d793901690e5180a10005', '是多少', '2019-02-21', '稍等是', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_feedback` VALUES ('402892846919b442016919b52dd30000', NULL, '2019-02-23 17:34:57', b'0', 'dfsdfsdfdswerwerew', '12', '2019-02-14', '4028928f690d793901690e5180a10005', '12', '2019-02-07', '12', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_feedback` VALUES ('402892846919b442016919b7dd660001', NULL, '2019-02-23 17:37:54', b'0', 'wew', '12', '2019-02-13', '4028928f690d793901690e5180a10005', '121221', '2019-02-08', '1212', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_feedback` VALUES ('402892846919b442016919b875170002', NULL, '2019-02-23 17:38:32', b'0', '测试成果', '12', '2019-02-13', '4028928f690d793901690e5180a10005', '1212', '2019-02-23', '1212', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_feedback` VALUES ('402892846919b442016919ba1d340003', NULL, '2019-02-23 17:40:21', b'0', 'wew', '12', '2019-02-05', '4028928f690d793901690e5180a10005', '12', '2019-02-22', '12', NULL, 'Z', '15', '2019-02-23', '17695402724', '40289287684eed6201684f3c74780017');
INSERT INTO `t_feedback` VALUES ('402892846919b442016919ba5fd20004', NULL, '2019-02-23 17:40:38', b'0', '3434', '34', '2019-02-13', '4028928f690d793901690e5180a10005', '34', '2019-02-15', '34', NULL, 'Z', '123', '2019-02-23', '17695402724', NULL);
INSERT INTO `t_feedback` VALUES ('4028928667c4475c0167c50ae64a0003', NULL, '2018-12-19 13:58:05', b'0', '李四', '餐饮部', '2018-12-19', '4028928667bcf7dd0167bd8929850001', '吃不饱饭', '2018-12-20', '增加饭量', NULL, '李四', '6666', '2018-12-20', '13256788765', '4028928b6781689b016782298bcc0002');
INSERT INTO `t_feedback` VALUES ('4028928768279470016827b7ea190009', NULL, '2019-01-07 17:49:50', b'0', '张三', '考核部', '2019-01-07', '4028928768279470016827ae734b0000', '11111', '2019-01-07', '111111', NULL, '张', '22222', '2019-01-07', '13504528965', NULL);

-- ----------------------------
-- Table structure for t_handling_person
-- ----------------------------
DROP TABLE IF EXISTS `t_handling_person`;
CREATE TABLE `t_handling_person`  (
  `id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `createrid` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `createtime` varchar(19) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `deleted` bit(1) DEFAULT NULL,
  `title` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `applyTime` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `controlNo` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `image` json,
  `memberSex` int(11) DEFAULT NULL,
  `img` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_handling_person
-- ----------------------------
INSERT INTO `t_handling_person` VALUES ('1', NULL, '2018-11-29', b'0', '张飞', 35, '2018-11-29 ', '1001', NULL, 0, NULL);
INSERT INTO `t_handling_person` VALUES ('402880e7675fe72801676017a8070000', NULL, '2018-11-29 23:30:22', b'0', '貂蝉', 26, '2018-11-29 ', '002', NULL, 1, 'imgs/66d41ffc-7dc6-4d69-9e5d-7dde00e20541/d7ad4e9e3fde40809f2ae2c842a69865.jpg');
INSERT INTO `t_handling_person` VALUES ('4028928267ed1ca80167ee4baee10000', NULL, '2018-12-27 14:13:16', b'0', '吕布', NULL, '2018-12-27T06:13:04.014Z', '55555555', NULL, 0, 'imgs/5df00afc-0c62-4c20-a1c6-92176d22de47/25732f5a7b3c406295e2591fa071ac05.jpg');
INSERT INTO `t_handling_person` VALUES ('4028928467627054016762892b030000', NULL, '2018-11-30 10:53:35', b'0', '诸葛亮', 46, '2018-11-30 ', '004', NULL, 0, 'imgs/afb6926a-b268-498c-a0e5-74e85bb71bc1/099baca30c8a4a47bcfd07a544e2c7ea.jpg');
INSERT INTO `t_handling_person` VALUES ('40289287675e3d7e01675e68eaae0000', NULL, '2018-11-29 15:39:53', b'0', '刘备', 35, '2018-11-30 ', '1002', NULL, 0, 'imgs/7ada34dd-0071-49ee-acf1-47f9b448cbc4/418876e5a1e84283842c2268ab08c906.jpg');
INSERT INTO `t_handling_person` VALUES ('40289287675e3d7e01675f0a30170003', NULL, '2018-11-29 18:36:02', b'0', '董卓', 45, '2018-11-29 ', '001', NULL, 0, 'imgs/e27a3f6b-ddb7-406d-9f9b-d5f157c96a97/893d97dd801644759594fe62695cac69.jpg');
INSERT INTO `t_handling_person` VALUES ('40289288676207620167622de9e80001', NULL, '2018-11-30 09:13:55', b'0', '吕布', 30, '2018-11-30 ', '003', NULL, 0, 'imgs/bdbd005a-2e35-4e90-93ef-9ddb1accf776/939bd04e862f4be2963949793210fdd3.jpg');
INSERT INTO `t_handling_person` VALUES ('402892906762e1a1016762f8ca6b0002', NULL, '2018-11-30 12:55:31', b'0', '1', 1, '2018-11-30 ', '1', NULL, 0, NULL);
INSERT INTO `t_handling_person` VALUES ('402892906762e1a1016762f8efb10003', NULL, '2018-11-30 12:55:40', b'0', '2', 2, '2018-11-30 ', '2', NULL, 0, NULL);
INSERT INTO `t_handling_person` VALUES ('402892906762e1a1016762f9163f0004', NULL, '2018-11-30 12:55:50', b'0', '3', 3, '2018-11-30 ', '3', NULL, 0, NULL);
INSERT INTO `t_handling_person` VALUES ('402892906762e1a1016762f93dfd0005', NULL, '2018-11-30 12:56:00', b'0', '4', 4, '2018-11-30 ', '4', NULL, 0, 'imgs/ca153806-3955-4230-991d-3514ff8af5d2/80e7d357cef44110932e17ef413994ce.png');

-- ----------------------------
-- Table structure for t_health
-- ----------------------------
DROP TABLE IF EXISTS `t_health`;
CREATE TABLE `t_health`  (
  `id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `createtime` varchar(19) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `deleted` bit(1) DEFAULT NULL,
  `createrid` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `title` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `checkHealth` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `doctor` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `doctorYiJian` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `fuZeRen` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `fuZeRenTel` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `historyMedical` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `huXi` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `medicalRecords` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `shiDuan` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `specialCase` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tiJianTime` datetime(0) DEFAULT NULL,
  `tiwen` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `xinDianTu` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `xinLv` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `xueTang` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `xueYa` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `lpId` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `status` varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `weight` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `gaoXueYa` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_health
-- ----------------------------
INSERT INTO `t_health` VALUES ('2c9acde969c370b40169c8863b070000', '2019-03-29 16:17:13', b'0', NULL, NULL, NULL, '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '1', '2019-03-29 16:17:09', '1', NULL, '1', '1', '1', '4028928769473ec20169474c408d0001', '2', '1', NULL);
INSERT INTO `t_health` VALUES ('2c9acde969cebb030169d2c4594e0001', '2019-03-31 16:01:17', b'0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '玩味萨芬是防守打法士大夫撒飞洒放散阀按时发顺丰撒发送到v发布发布更方便翻滚吧翻滚吧发不发放大部分工本费部分DVD在是按时大VAV多福多寿 方式啊啊撒不到v不到打算打算是大V是大VDVD是大V不到不到不到v', NULL, NULL, NULL, NULL, NULL, NULL, '4028928769473ec20169474c408d0001', '2', NULL, NULL);
INSERT INTO `t_health` VALUES ('2c9acde969d6c34f0169d6cef8550000', '2019-04-01 10:51:22', b'0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'adasdsadsadasdasdsadsadsddasd', '2019-04-01 10:50:54', '36.5', NULL, '77', '6.5', '120 80', '40289283687e8f6501687e9b4b0b0000', '2', '60', NULL);
INSERT INTO `t_health` VALUES ('2c9acde969dd037a0169dd151f720001', '2019-04-02 16:05:42', b'0', NULL, NULL, NULL, '张小小', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '放松放松放松放松发萨芬是地方发顺丰萨芬撒发放时发十方三世 ', '2019-04-14 16:05:11', '36', NULL, '75', '6', '80', '4028928f690d793901690e5180a10005', '2', '58', '120');
INSERT INTO `t_health` VALUES ('2c9acde969dd037a0169dd5561370008', '2019-04-02 17:15:54', b'0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '4028928f690d793901690e3feb1f0002', '1', NULL, NULL);
INSERT INTO `t_health` VALUES ('2c9acde969e676180169e70a3f6d0000', '2019-04-04 14:30:02', b'0', NULL, NULL, NULL, '小小', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2019-04-05 14:29:43', '35.8', NULL, '76', '5.8', '76', '4028928f690d793901690e5180a10005', '2', '58', '117');
INSERT INTO `t_health` VALUES ('2c9acde969e676180169e70afddb0001', '2019-04-04 14:30:51', b'0', NULL, NULL, NULL, '小小', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2019-04-10 14:30:25', '36.2', NULL, '76', '5.9', '88', '4028928f690d793901690e5180a10005', '2', '58', '120');
INSERT INTO `t_health` VALUES ('2c9acde969e676180169e70cda5b0002', '2019-04-04 14:32:53', b'0', NULL, NULL, NULL, '小小', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2019-04-18 14:32:34', '36', NULL, '76', '5.9', '78', '4028928f690d793901690e5180a10005', '2', '58', '116');
INSERT INTO `t_health` VALUES ('2c9acde969f7da550169f7e905040006', '2019-04-07 21:07:17', b'0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2019-04-28 21:07:11', '33', NULL, '3', '3', '81', '4028928f690d793901690e5180a10005', '2', NULL, '111');
INSERT INTO `t_health` VALUES ('2c9acde969f7da550169f7e924b10007', '2019-04-07 21:07:25', b'0', NULL, NULL, NULL, '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2019-04-07 21:07:25', '1', NULL, '1', '1', '1', '4028928f690d793901690e5180a10005', '2', '1', '1');
INSERT INTO `t_health` VALUES ('2c9acde969f7da550169f7e94c1f0008', '2019-04-07 21:07:35', b'0', NULL, NULL, NULL, '777777', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2019-04-02 21:07:36', '1', NULL, '1', '1', '1', '4028928f690d793901690e5180a10005', '2', '', '1');
INSERT INTO `t_health` VALUES ('2c9acde969f7da550169f7e97a050009', '2019-04-07 21:07:47', b'0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2019-04-25 21:07:47', '1', NULL, '1', '1', '1', '4028928f690d793901690e5180a10005', '2', '11', '1');
INSERT INTO `t_health` VALUES ('2c9acde969fa8ea10169fa90ec530000', '2019-04-08 09:29:55', b'0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2019-04-18 09:29:49', '1', NULL, '1', '1', '1', '4028928f690d793901690e5180a10005', '2', '11', '1');
INSERT INTO `t_health` VALUES ('2c9acde969fa8ea10169fa9113b10001', '2019-04-08 09:30:05', b'0', NULL, NULL, NULL, '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2019-04-30 09:30:00', '1', NULL, '1', '1', '1', '4028928f690d793901690e5180a10005', '2', '1', '1');
INSERT INTO `t_health` VALUES ('2c9acde969fa8ea10169fa947e240008', '2019-04-08 09:33:49', b'0', NULL, NULL, NULL, '1111', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2019-04-17 09:33:41', '1', NULL, '1', '1', '1', '4028928f690d793901690e5180a10005', '2', '1', '1');
INSERT INTO `t_health` VALUES ('2c9acde96a42b9ed016a42f55ae00000', '2019-04-22 10:52:16', b'0', NULL, NULL, NULL, '小李，小南', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2019-04-22 10:52:04', '12', NULL, '12', '12', '12', '4028928f690d793901690e5180a10005', '2', NULL, '12');
INSERT INTO `t_health` VALUES ('40284081679abcb901679b836c1e0000', '2018-12-11 12:25:40', b'0', NULL, NULL, NULL, 'JIM', NULL, NULL, NULL, NULL, NULL, NULL, '2', '111', '2018-12-09 13:00:00', '36.7', NULL, '100', '6', '90', '402881e567817206016781880e440000', '2', '60', '114');
INSERT INTO `t_health` VALUES ('40284081679abcb901679d6c14890002', '2018-12-11 21:19:25', b'0', NULL, NULL, NULL, 'tom', NULL, NULL, NULL, NULL, NULL, NULL, '3', '22', '2018-12-09 18:00:00', '36.2', NULL, '100', '6', '75', '402881e567817206016781880e440000', '2', '60', '136');
INSERT INTO `t_health` VALUES ('40284081679abcb901679e35d8b90004', '2018-12-12 00:59:48', b'0', NULL, NULL, NULL, 'aa/152', NULL, NULL, NULL, NULL, NULL, NULL, '1', '11', '2018-12-10 08:00:00', '36.8', NULL, '100', '6', '80', '402881e567817206016781880e440000', '2', '60', '150');
INSERT INTO `t_health` VALUES ('4028818467911f760167911fe8fa0000', '2018-12-09 12:00:46', b'0', NULL, NULL, NULL, '12', NULL, NULL, NULL, NULL, NULL, NULL, '1', '121', '2018-12-09 09:00:00', '37.0', NULL, '88', '6', '76', '402881e567817206016781880e440000', '2', '60', '151');
INSERT INTO `t_health` VALUES ('4028818669c9f0c50169c9f317e70000', '2019-03-29 22:55:45', b'0', NULL, NULL, '我', '李医生', '去玩', '12', '12564897562', '是多少', NULL, NULL, NULL, NULL, '2019-03-12 22:55:41', '36.3', NULL, '84', NULL, '90', '40289283687e8f6501687e9b4b0b0000', '1', NULL, '140');
INSERT INTO `t_health` VALUES ('4028818669ca60260169ca6781d40000', '2019-03-30 01:02:54', b'0', NULL, NULL, NULL, '高建辉，高建辉', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '1111', '2019-03-06 01:02:42', '11', NULL, '11', '11', '11', '4028928769473ec20169474c408d0001', '2', '11', NULL);
INSERT INTO `t_health` VALUES ('402881e5678172060167818d58d30002', '2018-12-06 11:26:23', b'0', NULL, NULL, '正常', '张三', '正常', '李四', '13111111111', '无', '35', NULL, NULL, NULL, '2018-12-06 00:00:00', '39', '35', '91', '35', '89', '402881e567817206016781880e440000', '1', '60', '129');
INSERT INTO `t_health` VALUES ('402881e569c831a90169c89951170005', '2019-03-29 16:38:04', b'0', NULL, NULL, NULL, '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '这是备注', '2019-03-06 16:37:57', '', NULL, '1', '1', '1', '4028928769473ec20169474c408d0001', '2', '1', NULL);
INSERT INTO `t_health` VALUES ('4028928267f77a1e0167f780e5bc0000', '2018-12-29 09:07:58', b'0', NULL, NULL, NULL, '李医生/585', NULL, NULL, NULL, NULL, NULL, NULL, '4', '注意药物过敏，有病史', '2018-12-29 09:06:28', '35.9', NULL, '100', '6', '90', '4028928667bcf7dd0167bd8929850001', '2', '60', '135');
INSERT INTO `t_health` VALUES ('40289282684be90701684bea3e290000', '2019-01-14 18:31:09', b'0', NULL, NULL, NULL, '张三', NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'w发发发发发发付付付付付', '2019-01-01 18:30:40', '36.5', NULL, '80', '5.6', '98', '4028928768279470016827ae734b0000', '2', '100', '180');
INSERT INTO `t_health` VALUES ('40289282684be90701684beab4140001', '2019-01-14 18:31:39', b'0', NULL, NULL, NULL, '赵四', NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'e', '2019-01-02 18:31:16', '39', NULL, '33', '3.5', '79', '4028928768279470016827ae734b0000', '2', '111', '160');
INSERT INTO `t_health` VALUES ('40289282684be90701684beb83f80002', '2019-01-14 18:32:32', b'0', NULL, NULL, NULL, '王二', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '午', '2019-01-03 18:31:58', '38', NULL, '99', '35', '80', '4028928768279470016827ae734b0000', '2', '120', '150');
INSERT INTO `t_health` VALUES ('40289282684be90701684bed8f2c0003', '2019-01-14 18:34:46', b'0', NULL, NULL, NULL, '王五', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '无', '2019-01-04 18:34:11', '11', NULL, '90', '22', '86', '4028928768279470016827ae734b0000', '2', '140', '176');
INSERT INTO `t_health` VALUES ('40289282684be90701684bee445c0004', '2019-01-14 18:35:32', b'0', NULL, NULL, NULL, '张三', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '无', '2019-01-05 18:34:54', '36.6', NULL, '86', '3.5', '95', '4028928768279470016827ae734b0000', '2', '155', '181');
INSERT INTO `t_health` VALUES ('40289282684c02e001684c0c4ead0000', '2019-01-14 19:08:21', b'0', NULL, NULL, NULL, '张三', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '1', '2019-01-06 19:07:53', '36.5', NULL, '80', '5.6', '92', '4028928768279470016827ae734b0000', '2', '111', '180');
INSERT INTO `t_health` VALUES ('40289282684c02e001684c0cf9530001', '2019-01-14 19:09:05', b'0', NULL, NULL, NULL, '张三', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2', '2019-01-07 19:08:31', '36.5', NULL, '80', '5.6', '90', '4028928768279470016827ae734b0000', '2', '111', '179');
INSERT INTO `t_health` VALUES ('40289282684c02e001684c0d45060002', '2019-01-14 19:09:24', b'0', NULL, NULL, NULL, '张三/关闭', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '3', '2019-01-15 19:09:13', '36.5', NULL, '80', '5.6', '89', '4028928768279470016827ae734b0000', '2', '111', '152');
INSERT INTO `t_health` VALUES ('4028928368783165016879f9effb0002', '2019-01-23 17:10:49', b'0', NULL, NULL, NULL, '张三', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '222', '2019-01-23 17:10:19', '36', NULL, '100', '6', '90', '402881e46854ed1c01685522c6d00001', '2', '60', '140');
INSERT INTO `t_health` VALUES ('402892836878316501687a2fa3470004', '2019-01-23 18:09:28', b'0', NULL, NULL, NULL, '李医生', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '1111', '2019-01-23 18:09:02', '36', NULL, '80', '5.6', '90', '402881e46854ed1c01685522c6d00001', '2', '60', '140');
INSERT INTO `t_health` VALUES ('40289284692c651f01692dde9b580003', '2019-02-27 15:32:37', b'0', NULL, NULL, '12', '12', '121', '12', '12564897562', '去', '112', NULL, NULL, NULL, '2019-02-20 15:32:34', '12', '121', '1212', '555', '12', '4028928f690d793901690e5180a10005', '1', '50', '12');
INSERT INTO `t_health` VALUES ('4028928667c05c5c0167c06cb2a70000', '2018-12-18 16:26:48', b'0', NULL, NULL, ' 让人', '  呃呃我', '我认为', ' 额', ' 二分w', '3人', ' 人', NULL, NULL, NULL, '2018-12-18 16:25:43', '36.8', '33', '88', '4.9', '85', '4028928667bcf7dd0167bd8929850001', '1', '60', '117');
INSERT INTO `t_health` VALUES ('40289287680c9fbe01680ccf78640000', '2019-01-02 12:25:49', b'0', NULL, NULL, NULL, '李医生', NULL, NULL, NULL, NULL, NULL, NULL, '4', '111111111', '2018-12-09 20:00:00', '36', NULL, '100', '6', '86', '402881e567817206016781880e440000', '2', '60', '125');
INSERT INTO `t_health` VALUES ('4028928768279470016827b153ab0001', '2019-01-07 17:42:39', b'0', NULL, NULL, '健康', 'tom', '没意见', '刘能', '1305206523', '心脏病', '30', NULL, NULL, NULL, '2019-01-07 17:42:24', '36', '33', '99', '5.5', '70', '4028928768279470016827ae734b0000', '1', '60', '126');
INSERT INTO `t_health` VALUES ('402892876849de7c01684a3ea3d90000', '2019-01-14 10:44:05', b'0', NULL, NULL, NULL, '李医生', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '3323', '2019-01-08 10:40:53', '36.7', NULL, '95', '5.2', '75', '4028928768279470016827ae734b0000', '2', '60', '121');
INSERT INTO `t_health` VALUES ('402892876849de7c01684a7d4eed0003', '2019-01-14 11:52:32', b'0', NULL, NULL, NULL, '李医生', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '无', '2019-01-09 11:51:23', '36.8', NULL, '92', '5.1/5', '76', '4028928768279470016827ae734b0000', '2', '61', '140');
INSERT INTO `t_health` VALUES ('402892876849de7c01684a7e5c8c0005', '2019-01-14 11:53:41', b'0', NULL, NULL, NULL, '李医生', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '无', '2019-01-10 11:52:49', '36.4', NULL, '94', '5.2', '80', '4028928768279470016827ae734b0000', '2', '61.6', '132');
INSERT INTO `t_health` VALUES ('402892876849de7c01684a7fb9040006', '2019-01-14 11:55:10', b'0', NULL, NULL, NULL, '李医生', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '1111', '2019-01-11 11:54:33', '36.8', NULL, '86', '5.8', '71', '4028928768279470016827ae734b0000', '2', '61.8', '138');
INSERT INTO `t_health` VALUES ('402892876849de7c01684a8076e70007', '2019-01-14 11:55:59', b'0', NULL, NULL, NULL, '李医生', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '无', '2019-01-12 11:55:24', '36.9', NULL, '89', '5.7', '76', '4028928768279470016827ae734b0000', '2', '59.9', '129');
INSERT INTO `t_health` VALUES ('402892876849de7c01684a81769c0008', '2019-01-14 11:57:05', b'0', NULL, NULL, NULL, '李医生', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '无', '2019-01-13 11:56:28', '37.1', NULL, '88', '5.9', '82', '4028928768279470016827ae734b0000', '2', '60.5', '124');
INSERT INTO `t_health` VALUES ('402892876ae906b6016ae90f115f0000', '2019-05-24 16:57:19', b'0', NULL, NULL, NULL, '2', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '发斯蒂芬斯蒂芬', '2019-05-17 16:57:09', '22', NULL, '2', '2', '2', '4028928f690d793901690e5180a10005', '2', '2', '2');
INSERT INTO `t_health` VALUES ('402892876ae9722a016ae974dee70000', '2019-05-24 18:48:31', b'0', NULL, NULL, NULL, '444', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2019-05-17 18:48:23', '444444', NULL, '444', '444', '444', '4028928768279470016827ae734b0000', '2', '4444', '444');
INSERT INTO `t_health` VALUES ('4028928c69db91a70169dbde02ac000a', '2019-04-02 10:25:53', b'0', NULL, NULL, NULL, '张潇潇', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '333333', '2019-04-02 10:25:29', '37', NULL, '80', '6', '88', '4028928f690d793901690e5180a10005', '2', '60', '124');
INSERT INTO `t_health` VALUES ('4028928c69dc0cc30169dc17d0ec0001', '2019-04-02 11:29:02', b'0', NULL, NULL, NULL, '张小小', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '打算打算大所大所多', '2019-04-17 11:28:50', '36.5', NULL, '74', '6', '82', '4028928f690d793901690e5180a10005', '2', '58', '115');
INSERT INTO `t_health` VALUES ('4028928c69e5d2140169e5d371040000', '2019-04-04 08:50:33', b'0', NULL, NULL, NULL, 's', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2019-04-04 08:50:26', 's', NULL, 's', 's', 's', '4028928f690d793901690e3feb1f0002', '2', 's', 's');
INSERT INTO `t_health` VALUES ('4028928c69e5d2140169e5d3f09a0001', '2019-04-04 08:51:05', b'0', NULL, NULL, NULL, '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2019-04-04 08:51:01', '1', NULL, '1', '1', '1', '4028928f690d793901690e521c720007', '2', '1', '1');
INSERT INTO `t_health` VALUES ('4028928c69e5d2140169e5d408740002', '2019-04-04 08:51:12', b'0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '4028928f690d793901690e521c720007', '1', NULL, NULL);
INSERT INTO `t_health` VALUES ('4028928c69e667db0169e66a986e0000', '2019-04-04 11:35:39', b'0', NULL, NULL, NULL, '小小', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2019-02-20 11:35:29', '36.7', NULL, '77', '6', '80', '4028928f690d793901690e5180a10005', '2', '', '120');
INSERT INTO `t_health` VALUES ('402892926af821db016af8e3d9e6000a', '2019-05-27 18:44:03', b'0', NULL, NULL, NULL, '333', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '发的啥地方', '2019-05-27 18:43:54', '333', NULL, '333', '333', '333', '4028928f690d793901690e5180a10005', '2', '333', '333');

-- ----------------------------
-- Table structure for t_health_drugs
-- ----------------------------
DROP TABLE IF EXISTS `t_health_drugs`;
CREATE TABLE `t_health_drugs`  (
  `id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `createrid` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `createtime` varchar(19) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `deleted` bit(1) DEFAULT NULL,
  `title` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `dId` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `healthId` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `yongliang` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `remark` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `danwei` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `keyId` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `pinci` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `yongyaoType` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `jieshuTime` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `kaishiTime` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `lpId` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `kaiYaoDoctor` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tingYaoDoctor` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_health_drugs
-- ----------------------------
INSERT INTO `t_health_drugs` VALUES ('2c9acde9697f19ff0169853550530000', NULL, '2019-03-16 14:34:17', b'0', NULL, '40289289676d0e6301676d78c3590002', NULL, '1', '4028098169747302016975fa62e10003', '402881e5697a0f5001697a2cd7e20001', NULL, '402881e5697a0f5001697a2d899a0003', '0', '2019-03-17T06:34:15.132Z', '2019-03-16T06:34:05.263Z', '402881e46854ed1c01685522c6d00001', NULL, NULL);
INSERT INTO `t_health_drugs` VALUES ('2c9acde969ccb6b50169cdbbc2250000', NULL, '2019-03-30 16:33:48', b'0', NULL, '40289289676d0e6301676d7a05620003', NULL, '1', '4028098169747302016975fa62e10003', '402881e5697a0f5001697a2cd7e20001', NULL, '402881e5697a0f5001697a2d899a0003', '0', '2019-03-30T08:33:46.524Z', '2019-03-30T08:33:38.293Z', '4028928769473ec20169474c408d0001', '啊啊', 'AA');
INSERT INTO `t_health_drugs` VALUES ('2c9acde969dcdc980169dce85b7d0000', NULL, '2019-04-02 15:16:49', b'0', NULL, '0000000000000000000000000000092', NULL, '1', '4028818669ce92a90169ceabfcef0008', '402881e5697a0f5001697a2cd7e20001', NULL, '402881e5697a0f5001697a2d899a0003', '0', '2019-04-02T07:16:44.996Z', '2019-04-02T07:16:34.486Z', '4028928f690d793901690e5180a10005', 'XXX', 'XXXX');
INSERT INTO `t_health_drugs` VALUES ('2c9acde969dd037a0169dd0d09af0000', NULL, '2019-04-02 15:56:53', b'0', NULL, '0000000000000000000000000000113', NULL, '1', '4028818669ce92a90169ceabb8310007', '402881e5697a0f5001697a2cd7e20001', NULL, '402881e5697a0f5001697a2d899a0003', '0', '2019-04-24T07:56:47.421Z', '2019-04-24T07:56:29.932Z', '4028928f690d793901690e5180a10005', 'AAA', 'aaa');
INSERT INTO `t_health_drugs` VALUES ('2c9acde969dd037a0169dd1bc3180002', NULL, '2019-04-02 16:12:58', b'0', NULL, '0000000000000000000000000000002', NULL, '1', '4028818669ce92a90169ceabfcef0008', '4028818669ce92a90169ceaaf4af0004', NULL, NULL, '1', NULL, '2019-04-25T08:12:46.727Z', '4028928f690d793901690e5180a10005', '33333', NULL);
INSERT INTO `t_health_drugs` VALUES ('2c9acde969ed6eeb0169f594c195000c', NULL, '2019-04-07 10:16:00', b'0', NULL, '0000000000000000000000000000004', NULL, '0.5', '4028098169747302016975fa62e10003', '402881e769d1a4720169d1a85ffe0000', NULL, '402881e5697a0f5001697a2d899a0003', '0', '2019-04-07T02:16:01.246Z', '2019-04-07T02:15:53.058Z', '4028928f690d793901690e5180a10005', '1', '1');
INSERT INTO `t_health_drugs` VALUES ('2c9acde969ed6eeb0169f594ec6e000e', NULL, '2019-04-07 10:16:11', b'0', NULL, '0000000000000000000000000000002', NULL, '0.5', NULL, NULL, NULL, NULL, '0', NULL, '2019-04-16T06:36:20.788Z', '4028928f690d793901690e5180a10005', NULL, NULL);
INSERT INTO `t_health_drugs` VALUES ('2c9acde969ed6eeb0169f594fb33000f', NULL, '2019-04-07 10:16:15', b'0', NULL, '0000000000000000000000000000002', NULL, NULL, NULL, NULL, NULL, NULL, '0', NULL, NULL, '4028928f690d793901690e5180a10005', NULL, NULL);
INSERT INTO `t_health_drugs` VALUES ('2c9acde969ed6eeb0169f5950bae0010', NULL, '2019-04-07 10:16:19', b'0', NULL, '0000000000000000000000000000001', NULL, NULL, NULL, NULL, NULL, NULL, '0', NULL, NULL, '4028928f690d793901690e5180a10005', NULL, NULL);
INSERT INTO `t_health_drugs` VALUES ('2c9acde969ed6eeb0169f59524e30011', NULL, '2019-04-07 10:16:26', b'0', NULL, '0000000000000000000000000000003', NULL, NULL, NULL, NULL, NULL, NULL, '0', NULL, NULL, '4028928f690d793901690e5180a10005', NULL, NULL);
INSERT INTO `t_health_drugs` VALUES ('2c9acde969ed6eeb0169f5954aab0012', NULL, '2019-04-07 10:16:35', b'0', NULL, '0000000000000000000000000000003', NULL, NULL, NULL, NULL, NULL, NULL, '0', NULL, NULL, '4028928f690d793901690e5180a10005', NULL, NULL);
INSERT INTO `t_health_drugs` VALUES ('2c9acde969ed6eeb0169f597a0ff0013', NULL, '2019-04-07 10:19:08', b'0', NULL, '0000000000000000000000000000004', NULL, NULL, NULL, NULL, NULL, NULL, '0', NULL, NULL, '4028928f690d793901690e5180a10005', NULL, NULL);
INSERT INTO `t_health_drugs` VALUES ('2c9acde969ed6eeb0169f597ebc30014', NULL, '2019-04-07 10:19:28', b'0', NULL, '0000000000000000000000000000003', NULL, '0.6', NULL, NULL, NULL, NULL, '1', NULL, NULL, '4028928f690d793901690e5180a10005', NULL, NULL);
INSERT INTO `t_health_drugs` VALUES ('2c9acde969ed6eeb0169f59803b00015', NULL, '2019-04-07 10:19:34', b'0', NULL, '0000000000000000000000000000002', NULL, '0.66', NULL, NULL, NULL, NULL, '1', NULL, NULL, '4028928f690d793901690e5180a10005', NULL, NULL);
INSERT INTO `t_health_drugs` VALUES ('2c9acde969ed6eeb0169f5981a550016', NULL, '2019-04-07 10:19:39', b'0', NULL, '0000000000000000000000000000005', NULL, NULL, NULL, NULL, NULL, NULL, '1', NULL, NULL, '4028928f690d793901690e5180a10005', NULL, NULL);
INSERT INTO `t_health_drugs` VALUES ('2c9acde969ed6eeb0169f59831c50017', NULL, '2019-04-07 10:19:45', b'0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '1', NULL, '2019-04-07T02:19:47.056Z', '4028928f690d793901690e5180a10005', NULL, NULL);
INSERT INTO `t_health_drugs` VALUES ('2c9acde969ed6eeb0169f59843590018', NULL, '2019-04-07 10:19:50', b'0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '1', NULL, '2019-04-20T02:19:52.202Z', '4028928f690d793901690e5180a10005', NULL, NULL);
INSERT INTO `t_health_drugs` VALUES ('2c9acde969ed6eeb0169f59854120019', NULL, '2019-04-07 10:19:54', b'0', NULL, NULL, NULL, '1', NULL, NULL, NULL, NULL, '1', NULL, '2019-04-04T02:19:56.165Z', '4028928f690d793901690e5180a10005', NULL, NULL);
INSERT INTO `t_health_drugs` VALUES ('2c9acde969ed6eeb0169f5987045001a', NULL, '2019-04-07 10:20:01', b'0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '1', NULL, '2019-04-18T02:20:03.380Z', '4028928f690d793901690e5180a10005', NULL, NULL);
INSERT INTO `t_health_drugs` VALUES ('2c9acde969ed6eeb0169f598814d001b', NULL, '2019-04-07 10:20:06', b'0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '1', NULL, '2019-04-23T02:20:07.691Z', '4028928f690d793901690e5180a10005', NULL, NULL);
INSERT INTO `t_health_drugs` VALUES ('2c9acde969ed6eeb0169f598a520001c', NULL, '2019-04-07 10:20:15', b'0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '1', NULL, '2019-04-30T02:20:16.207Z', '4028928f690d793901690e5180a10005', NULL, NULL);
INSERT INTO `t_health_drugs` VALUES ('2c9acde969f7da550169f7e1cf9e0000', NULL, '2019-04-07 20:59:24', b'0', NULL, '0000000000000000000000000000006', NULL, NULL, NULL, NULL, NULL, NULL, '0', NULL, '2019-04-07T12:59:22.187Z', '4028928f690d793901690e5180a10005', '1', NULL);
INSERT INTO `t_health_drugs` VALUES ('2c9acde969f7da550169f7e280700001', NULL, '2019-04-07 21:00:10', b'0', NULL, '0000000000000000000000000000007', NULL, '1', '4028098169747302016975fabbc80004', '402881e769d1a4720169d1a8a16d0001', NULL, '4028818669ce92a90169cea9f0cb0000', '0', NULL, '2019-04-26T12:59:59.132Z', '4028928f690d793901690e5180a10005', 'XX', NULL);
INSERT INTO `t_health_drugs` VALUES ('2c9acde969fa8ea10169fa91baed0003', NULL, '2019-04-08 09:30:48', b'0', NULL, '0000000000000000000000000000002', NULL, '1', '4028098169747302016975fabbc80004', '402881e769d1a4720169d1a8a16d0001', NULL, '4028818669ce92a90169cea9f0cb0000', '0', '2019-04-09T01:30:45.077Z', '2019-04-29T01:30:37.880Z', '4028928f690d793901690e5180a10005', '1', '111');
INSERT INTO `t_health_drugs` VALUES ('2c9acde969fa8ea10169fa921bf90004', NULL, '2019-04-08 09:31:13', b'0', NULL, '0000000000000000000000000000004', NULL, '1', '4028818669ce92a90169ceabb8310007', '402881e769d1a4720169d1a8a16d0001', NULL, '4028818669ce92a90169cea9f0cb0000', '0', '2019-04-02T01:31:09.594Z', '2019-04-08T01:31:00.119Z', '4028928f690d793901690e5180a10005', '1', '222');
INSERT INTO `t_health_drugs` VALUES ('2c9acde969fa8ea10169fa933c6d0005', NULL, '2019-04-08 09:32:27', b'0', NULL, '0000000000000000000000000000006', NULL, '1', '4028098169747302016975fabbc80004', '402881e769d1a4720169d1a8a16d0001', NULL, NULL, '1', NULL, '2019-04-23T01:32:18.590Z', '4028928f690d793901690e5180a10005', '11111', NULL);
INSERT INTO `t_health_drugs` VALUES ('2c9acde969fb16ea0169fb42829a0000', NULL, '2019-04-08 12:43:53', b'0', NULL, NULL, NULL, '1', NULL, NULL, NULL, NULL, '0', NULL, NULL, '4028928f690d793901690e5180a10005', NULL, NULL);
INSERT INTO `t_health_drugs` VALUES ('2c9acde969fb16ea0169fb46b6d60001', NULL, '2019-04-08 12:48:29', b'0', NULL, NULL, NULL, '1000', NULL, NULL, NULL, NULL, '0', NULL, NULL, '4028928f690d793901690e5180a10005', NULL, NULL);
INSERT INTO `t_health_drugs` VALUES ('2c9acde969fb16ea0169fb4712630002', NULL, '2019-04-08 12:48:52', b'0', NULL, NULL, NULL, '111', NULL, NULL, NULL, NULL, '0', NULL, NULL, '4028928f690d793901690e5180a10005', NULL, NULL);
INSERT INTO `t_health_drugs` VALUES ('2c9acde969fb96a80169fba8adff0000', NULL, '2019-04-08 14:35:29', b'0', NULL, NULL, NULL, '0.5', NULL, NULL, NULL, NULL, '0', NULL, NULL, '4028928f690d793901690e5180a10005', NULL, NULL);
INSERT INTO `t_health_drugs` VALUES ('2c9acde969fb96a80169fba914f70001', NULL, '2019-04-08 14:35:56', b'0', NULL, '0000000000000000000000000000003', NULL, '0.75', NULL, NULL, NULL, NULL, '0', NULL, '2019-04-30T06:36:10.298Z', '4028928f690d793901690e5180a10005', NULL, NULL);
INSERT INTO `t_health_drugs` VALUES ('2c9acde969fb96a80169fbaf8f1b0002', NULL, '2019-04-08 14:43:00', b'0', NULL, NULL, NULL, '0.75', NULL, NULL, NULL, NULL, '1', NULL, NULL, '4028928f690d793901690e5180a10005', NULL, NULL);
INSERT INTO `t_health_drugs` VALUES ('2c9acde969fb96a80169fbe4a4c40003', NULL, '2019-04-08 15:40:59', b'0', NULL, NULL, NULL, '111', NULL, NULL, NULL, NULL, '0', NULL, NULL, '4028928f690d793901690e5180a10005', NULL, NULL);
INSERT INTO `t_health_drugs` VALUES ('2c9acde969fb96a80169fbe4dba30004', NULL, '2019-04-08 15:41:13', b'1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '4028928f690d793901690e5180a10005', NULL, NULL);
INSERT INTO `t_health_drugs` VALUES ('2c9acde969fb96a80169fbe50b7d0005', NULL, '2019-04-08 15:41:25', b'0', NULL, NULL, NULL, '100', NULL, NULL, NULL, NULL, '0', NULL, NULL, '4028928f690d793901690e5180a10005', NULL, NULL);
INSERT INTO `t_health_drugs` VALUES ('2c9acde969fb96a80169fbe570230006', NULL, '2019-04-08 15:41:51', b'0', NULL, NULL, NULL, '0.5', NULL, NULL, NULL, NULL, '0', NULL, NULL, '4028928f690d793901690e5180a10005', NULL, NULL);
INSERT INTO `t_health_drugs` VALUES ('2c9acde969fb96a80169fbe629be0007', NULL, '2019-04-08 15:42:39', b'0', NULL, NULL, NULL, '8', NULL, NULL, NULL, NULL, '0', NULL, NULL, '4028928f690d793901690e5180a10005', NULL, NULL);
INSERT INTO `t_health_drugs` VALUES ('40280981697473020169760bac1b0005', NULL, '2019-03-13 15:54:30', b'0', NULL, '40289289676d0e6301676d78c3590002', NULL, '1', '4028098169747302016975fabbc80004', '402881e5697a0f5001697a2cd7e20001', NULL, '402881e5697a0f5001697a2d899a0003', '0', '2019-03-14T07:54:17.231Z', '2019-03-13T07:54:14.464Z', '4028928769473ec20169474c408d0001', '是是', '是');
INSERT INTO `t_health_drugs` VALUES ('40280981697473020169761e8e2f0007', NULL, '2019-03-13 16:15:07', b'0', NULL, '4028928a67623c07016762bffd890004', NULL, '25252525', '4028098169747302016975fabbc80004', '52525252', NULL, NULL, '1', NULL, '2019-03-13T08:14:55.719Z', '4028928769473ec20169474c408d0001', NULL, NULL);
INSERT INTO `t_health_drugs` VALUES ('40280981697645de016976c6782c0018', NULL, '2019-03-13 19:18:32', b'0', NULL, '40289289676d0e6301676d78c3590002', NULL, '3', '4028098169747302016975fabbc80004', '402881e5697a0f5001697a2cd7e20001', NULL, NULL, '1', NULL, '2019-03-13T11:18:25.348Z', '4028928769473ec20169474c408d0001', NULL, NULL);
INSERT INTO `t_health_drugs` VALUES ('402880e7680e76e701680e970abf0000', NULL, '2019-01-02 20:43:26', b'0', NULL, '40289289676d0e6301676d7a05620003', '40284081679abcb901679e35d8b90004', '1', '4028098169747302016975fa62e10003', 'mg', NULL, '3/日', '0', NULL, '2019-01-11', NULL, NULL, NULL);
INSERT INTO `t_health_drugs` VALUES ('402880e7680e76e701680e97f91a0001', NULL, '2019-01-02 20:44:27', b'0', NULL, '40289289676d0e6301676d78c3590002', '4028928267f77a1e0167f780e5bc0000', '1', '4028098169747302016975fabbc80004', 'mg', NULL, NULL, '1', NULL, '2019-01-11', NULL, NULL, NULL);
INSERT INTO `t_health_drugs` VALUES ('402881e569c831a90169c870d01d0000', NULL, '2019-03-29 15:53:50', b'0', NULL, '0000000000000000000000000000007', NULL, '2', '4028098169747302016975fabbc80004', '402881e5697a0f5001697a2cd7e20001', NULL, NULL, '1', NULL, '2019-03-01T07:53:35.415Z', '4028928769473ec20169474c408d0001', '', NULL);
INSERT INTO `t_health_drugs` VALUES ('402881e769d1a4720169d1b41e100007', NULL, '2019-03-31 11:03:56', b'0', NULL, '0000000000000000000000000000006', NULL, '1', '4028098169747302016975fa62e10003', '4028818669ce92a90169ceaaf4af0004', NULL, NULL, '1', NULL, '2019-03-21T03:03:46.992Z', '4028928f690d793901690e52e4a70008', '1', NULL);
INSERT INTO `t_health_drugs` VALUES ('4028928368783165016879f198870001', NULL, '2019-01-23 17:01:42', b'0', NULL, '40289289676d0e6301676d78c3590002', '4028928368783165016879f196be0000', '1', '4028098169747302016975fa62e10003', 'mg', NULL, '3/日', '0', NULL, '2019-01-23', NULL, NULL, NULL);
INSERT INTO `t_health_drugs` VALUES ('4028928368783165016879f9f0500003', NULL, '2019-01-23 17:10:49', b'0', NULL, '40289289676d0e6301676d7a05620003', '402892836878316501687a2fa3470004', '1', '4028098169747302016975fa62e10003', 'mg', NULL, '4/日', '0', NULL, '2019-01-23', '402881e46854ed1c01685522c6d00001', NULL, NULL);
INSERT INTO `t_health_drugs` VALUES ('40289283687d4a9a01687d58a1780000', NULL, '2019-01-24 08:53:07', b'0', NULL, '40289289676d0e6301676d7a05620003', '402892836878316501687a2fa3470004', '2', '4028098169747302016975fa62e10003', 'mg', NULL, '2/日', '0', '2019-03-16T07:47:17.671Z', '2019-01-24', '402881e46854ed1c01685522c6d00001', NULL, NULL);
INSERT INTO `t_health_drugs` VALUES ('40289283687d4a9a01687d58a1ed0001', NULL, '2019-01-24 08:53:07', b'0', NULL, '40289289676d0e6301676d78c3590002', '402892836878316501687a2fa3470004', '3', '4028098169747302016975fa62e10003', 'mg', NULL, '3/日', '0', NULL, '2019-01-22', '402881e46854ed1c01685522c6d00001', NULL, NULL);
INSERT INTO `t_health_drugs` VALUES ('40289283687d4a9a01687d58a22c0002', NULL, '2019-01-24 08:53:07', b'0', NULL, '4028928a67623c07016762bffd890004', '402892836878316501687a2fa3470004', '4', '4028098169747302016975fa62e10003', 'mg', NULL, '1/日', '0', '2019-01-24', '2019-01-23', '402881e46854ed1c01685522c6d00001', NULL, NULL);
INSERT INTO `t_health_drugs` VALUES ('40289283687d4a9a01687d5a544d0003', NULL, '2019-01-24 08:54:58', b'0', NULL, '40289289676d0e6301676d78c3590002', '402892836878316501687a2fa3470004', '2', '4028098169747302016975fa62e10003', 'mg', NULL, NULL, '1', NULL, '2019-01-24', '402881e46854ed1c01685522c6d00001', NULL, NULL);
INSERT INTO `t_health_drugs` VALUES ('40289287680d889801680da628750001', NULL, '2019-01-02 16:20:19', b'0', NULL, '40289289676d0e6301676d7a05620003', '40289287680c9fbe01680ccf78640000', '1', '4028098169747302016975fa62e10003', '盒', NULL, '1/日', '0', NULL, '2019-01-11', NULL, NULL, NULL);
INSERT INTO `t_health_drugs` VALUES ('40289287681118bb01681121c0ae0003', NULL, '2019-01-03 08:34:11', b'0', NULL, '40289289676d0e6301676d7a05620003', '40284081679abcb901679b836c1e0000', '2', '4028098169747302016975fa62e10003', 'mg', NULL, NULL, '1', NULL, '2019-01-11', NULL, NULL, NULL);
INSERT INTO `t_health_drugs` VALUES ('40289287681118bb016811225a490005', NULL, '2019-01-03 08:34:50', b'0', NULL, '40289289676d0e6301676d78c3590002', '4028818467911f760167911fe8fa0000', '2', '4028098169747302016975fabbc80004', 'mg', NULL, '3/日', '0', NULL, '2019-01-11', NULL, NULL, NULL);
INSERT INTO `t_health_drugs` VALUES ('40289287681118bb01681125cf290006', NULL, '2019-01-03 08:38:37', b'0', NULL, '40289289676d0e6301676d7a05620003', '40284081679abcb901679d6c14890002', '2', '4028098169747302016975fa62e10003', 'mg', NULL, NULL, '1', NULL, '2019-01-11', NULL, NULL, NULL);
INSERT INTO `t_health_drugs` VALUES ('40289287681118bb0168112c1ea20007', NULL, '2019-01-03 08:45:30', b'0', NULL, '40289289676d0e6301676d78c3590002', '40284081679abcb901679e35d8b90004', '1', '4028098169747302016975fabbc80004', 'ng', NULL, '2/日', '0', '2019-01-15', '2019-01-11', NULL, NULL, NULL);
INSERT INTO `t_health_drugs` VALUES ('40289287681118bb0168112c8d2e0008', NULL, '2019-01-03 08:45:58', b'0', NULL, '4028928a67623c07016762bffd890004', '40289287680c9fbe01680ccf78640000', '1', '4028098169747302016975fabbc80004', 'mg', NULL, NULL, '1', NULL, '2019-01-11', NULL, NULL, NULL);
INSERT INTO `t_health_drugs` VALUES ('40289287681118bb0168112ce552000a', NULL, '2019-01-03 08:46:21', b'0', NULL, '40289289676d0e6301676d7a05620003', '4028928267f77a1e0167f780e5bc0000', '1', '4028098169747302016975fa62e10003', 'mg', NULL, '2/日', '0', NULL, '2019-01-11', NULL, NULL, NULL);
INSERT INTO `t_health_drugs` VALUES ('40289287681118bb0168112d1c1f000b', NULL, '2019-01-03 08:46:35', b'0', NULL, '4028928a67623c07016762bffd890004', '4028928267f77a1e0167f780e5bc0000', '1', '4028098169747302016975fa62e10003', 'mg', NULL, NULL, '1', NULL, '2019-01-11', NULL, NULL, NULL);
INSERT INTO `t_health_drugs` VALUES ('40289287681118bb0168112d9d49000c', NULL, '2019-01-03 08:47:08', b'0', NULL, '40289289676d0e6301676d7a05620003', '4028818467911f760167911fe8fa0000', '2', '4028098169747302016975fa62e10003', 'mg', NULL, '1/日', '0', NULL, '2019-01-11', NULL, NULL, NULL);
INSERT INTO `t_health_drugs` VALUES ('4028928768279470016827b4d9cf0005', NULL, '2019-01-07 17:46:30', b'0', NULL, '40289289676d0e6301676d7a05620003', '4028928768279470016827b4d9950004', '2', '4028098169747302016975fabbc80004', 'mg', NULL, NULL, '1', NULL, '2019-01-11', NULL, NULL, NULL);
INSERT INTO `t_health_drugs` VALUES ('4028928768279470016827b4da060006', NULL, '2019-01-07 17:46:30', b'0', NULL, '40289289676d0e6301676d78c3590002', '4028928768279470016827b4d9950004', '1', '4028098169747302016975fa62e10003', 'mg', NULL, '2/日', '0', NULL, '2019-01-10', NULL, NULL, NULL);
INSERT INTO `t_health_drugs` VALUES ('40289287683536b80168354b1adf0000', NULL, '2019-01-10 09:05:41', b'0', NULL, '40289289676d0e6301676d78c3590002', '4028928768279470016827b4d9950004', '1', '4028098169747302016975fa62e10003', 'mg', NULL, '2/日', '0', NULL, '2019-01-10', NULL, NULL, NULL);
INSERT INTO `t_health_drugs` VALUES ('4028928768371314016837265eb40000', NULL, '2019-01-10 17:44:48', b'0', NULL, '40289289676d0e6301676d78c3590002', '4028928768279470016827b4d9950004', '1', '4028098169747302016975fa62e10003', 'mg', NULL, '2/日', '0', NULL, '2019-01-10', NULL, NULL, NULL);
INSERT INTO `t_health_drugs` VALUES ('40289287683a589101683b1b872f000c', NULL, '2019-01-11 12:11:26', b'0', NULL, '40289289676d0e6301676d7a05620003', '4028928768279470016827b4d9950004', '1', '4028098169747302016975fabbc80004', 'mg', NULL, NULL, '1', NULL, '2019-01-11', NULL, NULL, NULL);
INSERT INTO `t_health_drugs` VALUES ('402892876849de7c01684a3ea4580001', NULL, '2019-01-14 10:44:05', b'0', NULL, '40289289676d0e6301676d7a05620003', '402892876849de7c01684a3ea3d90000', '1', '4028098169747302016975fa62e10003', 'mg', NULL, NULL, '1', NULL, '2019-01-23T00:00:00.000Z', '4028928769473ec20169474c408d0001', NULL, NULL);
INSERT INTO `t_health_drugs` VALUES ('402892876849de7c01684a3f60320002', NULL, '2019-01-14 10:44:53', b'0', NULL, '40289289676d0e6301676d7a05620003', '402892876849de7c01684a3ea3d90000', '1', '4028098169747302016975fa62e10003', 'mg', NULL, '2/日', '0', NULL, '2019-01-08', NULL, NULL, NULL);
INSERT INTO `t_health_drugs` VALUES ('402892876849de7c01684a7d4f470004', NULL, '2019-01-14 11:52:32', b'0', NULL, '40289289676d0e6301676d7a05620003', '402892876849de7c01684a7d4eed0003', '3', '4028098169747302016975fa62e10003', 'mg', NULL, '3/日', '0', NULL, '2019-01-09', NULL, NULL, NULL);
INSERT INTO `t_health_drugs` VALUES ('4028928c69dc0cc30169dc124b210000', NULL, '2019-04-02 11:23:00', b'0', NULL, '0000000000000000000000000000001', NULL, '1', '4028098169747302016975fa62e10003', '402881e769d1a4720169d1a85ffe0000', NULL, '402881e5697a0f5001697a2d899a0003', '0', '2019-04-23T03:22:57.698Z', '2019-04-17T03:22:47.693Z', '4028928f690d793901690e5180a10005', '111', '111');
INSERT INTO `t_health_drugs` VALUES ('4028928c69dcef120169dcefdcdc0000', NULL, '2019-04-02 15:25:00', b'0', NULL, '0000000000000000000000000000092', NULL, '1', '4028098169747302016975fa62e10003', '4028818669ce92a90169ceaaf4af0004', NULL, NULL, '1', NULL, '2019-04-24T07:24:53.761Z', '4028928f690d793901690e5180a10005', '2222', NULL);

-- ----------------------------
-- Table structure for t_lien_personnel
-- ----------------------------
DROP TABLE IF EXISTS `t_lien_personnel`;
CREATE TABLE `t_lien_personnel`  (
  `id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `createrid` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `createtime` varchar(19) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `deleted` bit(1) DEFAULT NULL,
  `title` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `cbDepartment` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `cuoShiType` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `daiHao` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `enterTime` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `linkman` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `lzAge` int(11) DEFAULT NULL,
  `lzMinZu` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `lzName` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `lzQiXian` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `lzSex` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `lzZhiJi` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `outTime` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `outStatus` varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `roomNum` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `sPStatus` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `telNum` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `wenjian` json,
  `zhuanAnName` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `birthDay` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `kanhuLiLiang` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `yihurenyuan` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `lzDanWei` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `lzZhiWu` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `bedNum` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_lien_personnel
-- ----------------------------
INSERT INTO `t_lien_personnel` VALUES ('2c9acde969dd037a0169dd2100c50003', NULL, '2019-04-02 16:18:41', b'0', NULL, '40289287684eed6201684f3c74780017', '0', '111', '2019-04-02', '111', 12, '4028928f690d793901690e49f24b0003', '潇潇', '1', '1', '1', NULL, '0', '510', NULL, '11111111', '[{\"uid\": \"3955a0b2-ea64-4fa7-be6f-d41b6f2bf1a5\", \"url\": \"imgs/3955a0b2-ea64-4fa7-be6f-d41b6f2bf1a5/11a41de021094854ad9911c12544a18c.jpg\", \"name\": \"test.jpg\", \"suffix\": \"JPG\"}]', '啊啊', '2019-04-02', '40289287684f430c01684f7653b50006', '40289284692c651f01692d9da0860002', '11111', '敷敷', NULL);
INSERT INTO `t_lien_personnel` VALUES ('402881e468541dce0168545a3ffc0001', NULL, '2019-01-16 09:50:27', b'0', NULL, '40289287684eed6201684f37750a0006', '0', '006', '2019-01-16', '李四', 45, '40289289676d0e6301676da634a8000a', '张明', '2', '1', '1', NULL, '0', '206', NULL, '13945454545', '[]', '专案一', '2019-01-16', '40289287684f430c01684f7653b50006', NULL, NULL, NULL, NULL);
INSERT INTO `t_lien_personnel` VALUES ('402881e46854ed1c01685522c6d00001', NULL, '2019-01-16 13:29:29', b'0', NULL, '40289287684eed6201684f37750a0006', '0', '123123', '2010-04-08', '王XX1', 54, '40289289676d0e6301676dc86de40023', '张XX', '2', '1', '1', '2018-12-06', '1', '测试门区', NULL, '13945454545', '[]', '专案一', '2019-01-16', '40289287684f430c01684f755acb0004', NULL, NULL, NULL, NULL);
INSERT INTO `t_lien_personnel` VALUES ('402881e567817206016781880e440000', NULL, '2018-12-06 11:20:36', b'0', NULL, '402892846781b2ff01678262716e0000', '0', '2018001', '2018-12-06', '李四', 45, '40289289676d0e6301676da387230005', '张三', '1', '1', '1', '2018-12-06', '1', '测试门区', NULL, '13945454545', '[{\"uid\": \"d8650b13-afa2-487b-a9f7-163a836ba1dd\", \"url\": \"imgs/d8650b13-afa2-487b-a9f7-163a836ba1dd/86d352e87f064cc99a01c7db7d70da51.sql\", \"name\": \"shujuku.sql\", \"suffix\": \"SQL\"}]', '专案一', '1958-11-11', '40289287684f430c01684f755acb0004', NULL, NULL, NULL, NULL);
INSERT INTO `t_lien_personnel` VALUES ('402881e867732439016773313a870001', NULL, '2018-12-03 16:31:05', b'0', NULL, '402892846781b2ff01678262716e0000', '0', '2', '2018-12-07', '1', 1, '40289289676d0e6301676da437bf0006', '1', '2', '1', '1', '2018-12-13', '1', '1', NULL, '11', '[{\"uid\": \"f780fea9-4c6e-467c-bd71-1e5faad007d5\", \"url\": \"imgs/f780fea9-4c6e-467c-bd71-1e5faad007d5/8cfde64ad7eb42669cfd2c9d1b492cb4.jpg\", \"name\": \"微信图片编辑_20181115152953.jpg\", \"suffix\": \"JPG\"}, {\"uid\": \"08eac991-9c19-4f94-a176-8ed44e9d50a6\", \"url\": \"imgs/08eac991-9c19-4f94-a176-8ed44e9d50a6/77b83184ebf9462cbac7289a0b0094fd.txt\", \"name\": \"tixing.txt\", \"suffix\": \"TXT\"}]', 'q', '1948-09-03', '40289287684f430c01684f755acb0004', NULL, NULL, NULL, NULL);
INSERT INTO `t_lien_personnel` VALUES ('40289283687e8f6501687e9b4b0b0000', NULL, '2019-01-24 14:45:33', b'0', NULL, '40289287684eed6201684f3c74780017', '0', '585858', '2019-01-24', '李四', 45, '402881e46854ed1c0168554b6298000e', '张三', '2', '1', '2', NULL, '0', '测试门区', NULL, '13333333333', '[]', '专案一', '2019-01-24', '40289287684f430c01684f7653b50006', '40289284692c651f01692d8d1c260001', NULL, '垃圾', NULL);
INSERT INTO `t_lien_personnel` VALUES ('4028928667bcf7dd0167bd8929850001', NULL, '2018-12-18 02:59:02', b'0', NULL, '40289287684eed6201684f3c74780017', '1', '55555', '2018-12-18', '李四', 45, '40289289676d0e6301676dc7c1860022', '张三', '1', '1', '1', '2018-12-20', '1', '测试门区', NULL, '13945454545', '[{\"uid\": \"f3e9abc4-6edd-40c9-af4c-d28c9403b7cd\", \"url\": \"imgs/f3e9abc4-6edd-40c9-af4c-d28c9403b7cd/babfc67a08024cdcbe046e0cdb37fde3.txt\", \"name\": \"tixing.txt\", \"suffix\": \"TXT\"}, {\"uid\": \"3aaa3c38-5640-49d1-b95c-4c3f4dc6cf30\", \"url\": \"imgs/3aaa3c38-5640-49d1-b95c-4c3f4dc6cf30/b96501a03af04b33a0050840fe7fed9e.png\", \"name\": \"car_hd.png\", \"suffix\": \"PNG\"}, {\"uid\": \"a28df24e-fad8-4caa-82f0-6c58c2cf0fc3\", \"url\": \"imgs/a28df24e-fad8-4caa-82f0-6c58c2cf0fc3/1b149d3f140747c0b18ccee853073dc8.png\", \"name\": \"car_hd.png\", \"suffix\": \"PNG\"}, {\"uid\": \"aef684dd-a568-4df4-87fc-4ca03d1c4ba9\", \"url\": \"imgs/aef684dd-a568-4df4-87fc-4ca03d1c4ba9/b7659c790e6d488a9ac20bacdee8585e.png\", \"name\": \"bmw.png\", \"suffix\": \"PNG\"}, {\"uid\": \"6fb35380-3229-4ecc-b138-54b39797476c\", \"url\": \"imgs/6fb35380-3229-4ecc-b138-54b39797476c/419b1ad5729f49b397f8eb6601a13eba.png\", \"name\": \"background.png\", \"suffix\": \"PNG\"}, {\"uid\": \"d5997371-92e4-4d61-b3ae-0cfd004845b8\", \"url\": \"imgs/d5997371-92e4-4d61-b3ae-0cfd004845b8/802a01e815f0412390453d5d48d08f83.png\", \"name\": \"car_hd.png\", \"suffix\": \"PNG\"}, {\"uid\": \"9afc69b9-43df-4b94-b23c-6289250bd0f0\", \"url\": \"imgs/9afc69b9-43df-4b94-b23c-6289250bd0f0/35f868a539e7445bbe61555a7bc4f577.jpg\", \"name\": \"1545039545(1).jpg\", \"suffix\": \"JPG\"}, {\"uid\": \"c7be83af-8a83-4a1a-8e90-5509e2f65560\", \"url\": \"imgs/c7be83af-8a83-4a1a-8e90-5509e2f65560/9386d1840411441e908865fe5f538f8c.png\", \"name\": \"fa016e7aea285f537180c43d928bc8b3.png\", \"suffix\": \"PNG\"}]', '问问嗡嗡嗡', '2018-12-18', '40289287684f430c01684f7602c70005', NULL, NULL, NULL, NULL);
INSERT INTO `t_lien_personnel` VALUES ('4028928768279470016827ae734b0000', NULL, '2019-01-07 17:39:30', b'0', NULL, '4028928b6781689b016782298bcc0002', '0', '001', '2019-01-01', '李四', 25, '40289289676d0e6301676da5c3500009', 'Lisa', '1', '2', '1', NULL, '0', '测试门区', NULL, '13945454545', '[]', '111111', '1987-01-01', '40289287684f430c01684f755acb0004', '40289284692c651f01692d8d1c260001', '是是是', '啊啊', NULL);
INSERT INTO `t_lien_personnel` VALUES ('4028928769473ec20169474c408d0001', NULL, '2019-03-04 14:02:53', b'0', NULL, '40289287684eed6201684f3d8ca7001b', '1', '110', '2018-03-01', '111', 32, '4028928f690d793901690e49f24b0003', '李涛', '1', '1', '1', '2019-04-02', '1', '110', NULL, '1111', '[{\"uid\": \"c8287e88-f5bd-48b1-ad55-19be1c683883\", \"url\": \"imgs/c8287e88-f5bd-48b1-ad55-19be1c683883/db0a2fd797c5418cbfc4940784f0bab7.exe\", \"name\": \"360chrome.exe\", \"suffix\": \"EXE\"}, {\"uid\": \"347ddca0-05f7-4f5f-86ea-84d21201399f\", \"url\": \"imgs/347ddca0-05f7-4f5f-86ea-84d21201399f/09b5f16bc44e47dd97e0a4e32aa475a9.docx\", \"name\": \"新建 DOCX 文档.docx\", \"suffix\": \"DOCX\"}, {\"uid\": \"3732cfba-3543-4751-b04c-449c47a4caee\", \"url\": \"imgs/3732cfba-3543-4751-b04c-449c47a4caee/55f8d45840d34123a36ab2d428945788.jpg\", \"name\": \"745375113771887292.jpg\", \"suffix\": \"JPG\"}, {\"uid\": \"247bef8e-18fc-4a6d-9f2a-800c4816197b\", \"url\": \"imgs/247bef8e-18fc-4a6d-9f2a-800c4816197b/bca734b80364467a89c8ede19a4b5b3d.jpg\", \"name\": \"5b2c265fgy1fpb0hwalt1j20j60j6jtt.jpg\", \"suffix\": \"JPG\"}, {\"uid\": \"660827fe-4254-4705-9a3e-73b3a82c01a7\", \"url\": \"imgs/660827fe-4254-4705-9a3e-73b3a82c01a7/76ee87c32fed4b11804f959c372ff588.jpg\", \"name\": \"35.jpg\", \"suffix\": \"JPG\"}]', '啊啊啊', '2019-04-01', '40289287684f430c01684f7602c70005', '40289284692c651f01692d8d1c260001', '坎坎坷坷扩', '啊啊啊啊啊', NULL);
INSERT INTO `t_lien_personnel` VALUES ('402892876b0b5544016b0b8526a30000', NULL, '2019-05-31 09:33:23', b'0', NULL, '40289287684eed6201684f3dcd2e001c', '0', 'ceshi001', '2019-05-18', '冯宝宝', 25, '4028928f690d793901690e49f24b0003', '张楚岚', '4', '1', '1', NULL, '0', '4015937ba58544c7b353d101f15d2f5a', NULL, '13945454545', '[]', 'A市', '2004-02-05', '40289287684f430c01684f7653b50006', '40289284692c651f01692d9da0860002', '哪都通快递公司', '快递员', '21e2a44f348c43438fa5112f88be9a8d');
INSERT INTO `t_lien_personnel` VALUES ('402892876b0b5544016b0b875e040001', NULL, '2019-05-31 09:35:49', b'0', NULL, '40289287684eed6201684f3c74780017', '1', '王也', '2019-05-31', NULL, 26, '4028928f690d793901690e49f24b0003', '张灵玉', '1', '1', '1', NULL, '0', '1', NULL, NULL, '[]', NULL, '1995-05-19', '40289287684f430c01684f755acb0004', '40289284692c651f01692d8d1c260001', '武当', '道士', '704744d7e68545d8911496ba45d9ac97');
INSERT INTO `t_lien_personnel` VALUES ('4028928b676274040167627586330000', NULL, '2018-11-30 10:32:08', b'0', NULL, '1', '0', '002', '2018-12-04', '111', 25, '4028928f690d793901690e49f24b0003', '关晓彤', '2', '2', '3', NULL, '0', '测试门区', NULL, '13822079865', '[{\"uid\": \"2c06f838-1ea0-4426-b677-dcaac99374bd\", \"url\": \"imgs/2c06f838-1ea0-4426-b677-dcaac99374bd/ab997ae0b7144e358db0cb0b2d68ccc7.txt\", \"name\": \"tixing.txt\", \"suffix\": \"TXT\"}, {\"uid\": \"d3042e68-280c-4b26-937a-ac31f09e4a2b\", \"url\": \"imgs/d3042e68-280c-4b26-937a-ac31f09e4a2b/8ffb09042844468ea28d2b55fce2c9df.sql\", \"name\": \"shujuku.sql\", \"suffix\": \"SQL\"}, {\"uid\": \"ba6af567-819c-43e6-a7ed-489be81276fc\", \"url\": \"imgs/ba6af567-819c-43e6-a7ed-489be81276fc/601d0eb6df5d40eda8e3832d1406435f.png\", \"name\": \"男女占比情况 (1).png\", \"suffix\": \"PNG\"}, {\"uid\": \"319cd9ea-fbbf-499f-a5e7-6f96dc892fe1\", \"url\": \"imgs/319cd9ea-fbbf-499f-a5e7-6f96dc892fe1/97f466b3be3f46cb9337eaf77294dc7a.docx\", \"name\": \"bug.docx\", \"suffix\": \"DOCX\"}]', 'AA', '1936-05-23', '40289287684f430c01684f7653b50006', '40289284692c651f01692d8d1c260001', '多大', '啊啊', NULL);
INSERT INTO `t_lien_personnel` VALUES ('4028928f690d793901690e3feb1f0002', NULL, '2019-02-21 12:11:03', b'0', NULL, '40289287684eed6201684f3c320d0016', '0', '666', '2019-02-21', '李四', 48, '4028928f690d793901690e49f24b0003', '张XX', '4', '2', '1', NULL, '0', '606', NULL, '111111', '[]', 'buzhidao', NULL, '40289287684f430c01684f7602c70005', '40289284692c651f01692d9da0860002', NULL, NULL, NULL);
INSERT INTO `t_lien_personnel` VALUES ('4028928f690d793901690e5180a10005', NULL, '2019-02-21 12:30:15', b'0', NULL, '40289287684eed6201684f3c74780017', '0', '120120', '2019-02-22', '133', 46, '4028928f690d793901690e49f24b0003', '王二', '1', '1', NULL, NULL, '0', '210210', NULL, '139', '[]', '违违纪纪组织记录', '2019-02-21', '40289287684f430c01684f755acb0004', '40289284692c651f01692d8d1c260001', NULL, NULL, NULL);
INSERT INTO `t_lien_personnel` VALUES ('4028928f690d793901690e521c720007', NULL, '2019-02-21 12:30:56', b'0', NULL, NULL, '0', '1201201', '2019-02-21', NULL, NULL, NULL, NULL, '1', NULL, NULL, NULL, '0', '210210', NULL, NULL, '[]', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_lien_personnel` VALUES ('402892906762e1a1016762f7575e0001', NULL, '2018-11-30 12:53:56', b'0', NULL, '1', '0', '4', '2018-12-30', '1', 1, '40289289676d0e6301676da387230005', '1', '1', '1', '1', NULL, '0', '测试门区', NULL, '1', '[{\"uid\": \"d922872e-e306-4861-a943-287b0de9d1f0\", \"url\": \"imgs/d922872e-e306-4861-a943-287b0de9d1f0/9217fc3bfaf141de88ab9408f6e12d90.docx\", \"name\": \"bug.docx\", \"suffix\": \"DOCX\"}]', '111', '1975-09-04', '40289287684f430c01684f7653b50006', NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for t_lien_tanhua
-- ----------------------------
DROP TABLE IF EXISTS `t_lien_tanhua`;
CREATE TABLE `t_lien_tanhua`  (
  `id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `createrid` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `createtime` varchar(19) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `deleted` bit(1) DEFAULT NULL,
  `title` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `nurseId` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `remark` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `talkStartTime` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `talkEndTime` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tanHuaRen` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `ciShu` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tanHuaRenNo` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `lpId` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_lien_tanhua
-- ----------------------------
INSERT INTO `t_lien_tanhua` VALUES ('2c9acde96ae9829b016af747fad70002', NULL, '2019-05-27 11:14:10', b'0', NULL, NULL, NULL, NULL, NULL, NULL, '9a61fe20-79ce-a551-3e73-ba122d61b12a', NULL, NULL);
INSERT INTO `t_lien_tanhua` VALUES ('2c9acde96ae9829b016af747fb640003', NULL, '2019-05-27 11:14:10', b'1', NULL, '2c9acde96ae9829b016af74548980001', NULL, '2019-05-27 11:04:11', '2019-05-27 11:14:08', 'XXX', '9a61fe20-79ce-a551-3e73-ba122d61b12a', NULL, NULL);
INSERT INTO `t_lien_tanhua` VALUES ('2c9acde96ae9829b016af74922ad0005', NULL, '2019-05-27 11:15:26', b'0', NULL, NULL, NULL, NULL, NULL, NULL, '5911e3ee-9f23-b0fc-67c6-2c1db817ea64', NULL, NULL);
INSERT INTO `t_lien_tanhua` VALUES ('2c9acde96ae9829b016af749233a0006', NULL, '2019-05-27 11:15:26', b'0', NULL, '2c9acde96ae9829b016af748ebaf0004', NULL, '2019-05-27 02:02:02', '2019-05-27 02:02:11', 'aaa', '5911e3ee-9f23-b0fc-67c6-2c1db817ea64', NULL, NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892866ae23ae0016ae24284b90001', NULL, '2019-05-23 09:16:11', b'0', NULL, '402892866ae23ae0016ae24243c00000', NULL, '2019-05-23 09:16:11', '2019-05-23 11:02:39', '001', 'd5c0828f-2ac7-d997-6f9b-f27259d9984b', '0001', NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892866ae23ae0016ae2a4975f0002', NULL, '2019-05-23 11:03:18', b'0', NULL, '402892866ae23ae0016ae24243c00000', NULL, '2019-05-23 11:03:18', '2019-05-23 11:06:20', '001', '3580216a-dae0-d1e6-ff33-993ba3266940', '0001', NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892866ae23ae0016ae2a6f33b0003', NULL, '2019-05-23 11:05:53', b'0', NULL, '402892866ae23ae0016ae24243c00000', NULL, '2019-05-23 01:01:01', '2019-05-23 02:03:04', '002', '3580216a-dae0-d1e6-ff33-993ba3266940', NULL, NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892866ae23ae0016ae2a773b70004', NULL, '2019-05-23 11:06:26', b'0', NULL, '402892866ae23ae0016ae24243c00000', NULL, '2019-05-23 11:06:25', '2019-05-23 11:06:29', '001', 'be41076a-d31a-302c-dc15-d1aae467aab6', '0001', NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892886b250fa2016b251e932f0001', NULL, '2019-06-05 08:51:29', b'1', NULL, '402892886b250fa2016b251e78450000', NULL, '2019-06-05 08:51:28', '2019-06-05 08:53:15', '001', 'e185eed9-45c8-aaea-08e2-0e00b6800cf8', '0001', NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892886b250fa2016b25200d050002', NULL, '2019-06-05 08:53:05', b'1', NULL, '402892886b250fa2016b251e78450000', NULL, '2019-06-05 08:53:05', '2019-06-05 08:53:08', '002', 'e185eed9-45c8-aaea-08e2-0e00b6800cf8', '0002', NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892886b250fa2016b25203d290003', NULL, '2019-06-05 08:53:18', b'1', NULL, '402892886b250fa2016b251e78450000', NULL, '2019-06-05 08:53:18', NULL, '001', '80a8a222-4ba3-500b-bb5e-9b1d86c418ee', '0001', NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892886b250fa2016b25205a7d0004', NULL, '2019-06-05 08:53:25', b'1', NULL, '402892886b250fa2016b251e78450000', NULL, '2019-06-05 08:53:25', NULL, '002', '80a8a222-4ba3-500b-bb5e-9b1d86c418ee', '0002', NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892886b250fa2016b25245ad10005', NULL, '2019-06-05 08:57:47', b'1', NULL, '402892886b250fa2016b251e78450000', '', '2019-06-05 08:57:47', '2019-06-05 08:58:17', '001', '778f24ad-f8ab-c352-e444-5d12cd359258', '0001', NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892886b250fa2016b252491dd0006', NULL, '2019-06-05 08:58:02', b'1', NULL, '402892886b250fa2016b251e78450000', '', '2019-06-05 08:58:01', '2019-06-05 08:58:04', '002', '778f24ad-f8ab-c352-e444-5d12cd359258', '0002', NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892886b250fa2016b2524d7cb0007', NULL, '2019-06-05 08:58:19', b'1', NULL, '402892886b250fa2016b251e78450000', NULL, '2019-06-05 08:58:19', '2019-06-05 09:08:08', '001', '24028191-7c43-1a88-7586-c247d1357a0b', '0001', NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892886b250fa2016b252523260008', NULL, '2019-06-05 08:58:39', b'1', NULL, '402892886b250fa2016b251e78450000', NULL, '2019-06-05 08:58:38', NULL, '002', '24028191-7c43-1a88-7586-c247d1357a0b', '0002', NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892886b250fa2016b2575545b0009', NULL, '2019-06-05 10:26:14', b'1', NULL, '402892886b250fa2016b251e78450000', '第三方的所发生的', '2019-06-05 01:01:01', '2019-06-05 02:02:02', '006', '7bc955cd-6347-266d-6e17-f15299e9de7a', NULL, NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892886b250fa2016b25a644e8000a', NULL, '2019-06-05 11:19:42', b'1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892886b250fa2016b25a65ec7000b', NULL, '2019-06-05 11:19:48', b'1', NULL, '402892886b250fa2016b251e78450000', '', '2019-06-05 01:01:01', NULL, '006', '778f24ad-f8ab-c352-e444-5d12cd359258', NULL, NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892886b250fa2016b25bf4131000c', NULL, '2019-06-05 11:46:59', b'0', NULL, '402892886b250fa2016b251e78450000', NULL, '2019-06-05 11:46:59', '2019-06-05 11:47:17', '001', '669e5bca-4dff-5e23-7878-d040b92d42ee', '0001', NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892886b250fa2016b25bf65b2000d', NULL, '2019-06-05 11:47:08', b'0', NULL, '402892886b250fa2016b251e78450000', NULL, '2019-06-05 11:47:08', '2019-06-05 11:47:10', '002', '669e5bca-4dff-5e23-7878-d040b92d42ee', '0002', NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892886b250fa2016b25bfa05d000e', NULL, '2019-06-05 11:47:23', b'0', NULL, '402892886b250fa2016b251e78450000', NULL, '2019-06-05 11:47:23', '2019-06-05 13:05:39', '001', '66bc1af1-b8fd-7854-244b-791b3cdb20e6', '0001', NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892886b250fa2016b25c02c9b000f', NULL, '2019-06-05 11:47:59', b'0', NULL, '402892886b250fa2016b251e78450000', NULL, '2019-06-05 11:47:58', '2019-06-05 13:05:46', '002', '66bc1af1-b8fd-7854-244b-791b3cdb20e6', '0002', NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892886b250fa2016b260802740010', NULL, '2019-06-05 13:06:27', b'0', NULL, '402892886b250fa2016b251e78450000', NULL, '2019-06-05 13:05:57', '2019-06-05 13:06:02', '001', '0b299b15-55c6-7416-019e-b8d384f64a27', '0001', NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892886b250fa2016b260802760011', NULL, '2019-06-05 13:06:27', b'0', NULL, '402892886b250fa2016b251e78450000', NULL, '2019-06-05 13:05:48', '2019-06-05 13:53:19', '002', '0b299b15-55c6-7416-019e-b8d384f64a27', '0002', NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892886b250fa2016b260802b60012', NULL, '2019-06-05 13:06:27', b'1', NULL, '402892886b250fa2016b251e78450000', NULL, '2019-06-05 01:01:01', '2019-06-05 04:05:05', '006', '0b299b15-55c6-7416-019e-b8d384f64a27', NULL, NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892886b250fa2016b26334d160013', NULL, '2019-06-05 13:53:44', b'0', NULL, '402892886b250fa2016b251e78450000', NULL, '2019-06-05 13:53:44', '2019-06-05 13:55:20', '003', '0b299b15-55c6-7416-019e-b8d384f64a27', '0003', NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892886b250fa2016b263ba3080016', NULL, '2019-06-05 14:02:51', b'0', NULL, '402892886b250fa2016b263b58060015', NULL, '2019-06-05 14:02:50', NULL, '001', '54bcf008-8825-4a36-d727-e19cbe6fd554', '0001', NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892896ab06e8a016ab09834c30018', NULL, '2019-05-13 17:48:46', b'0', NULL, '402892896ab05165016ab0524fa60000', NULL, '2019-05-13 17:48:46', '2019-05-13 17:48:48', '001', 'a7558d02-cb20-5995-afa2-e663a2643e70', NULL, NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892896ab06e8a016ab09842c80019', NULL, '2019-05-13 17:48:49', b'0', NULL, '402892896ab05165016ab0524fa60000', NULL, '2019-05-13 17:48:49', '2019-05-13 17:48:50', '001', '81946c95-13e1-faff-c23b-fae210e57a15', NULL, NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892896ab06e8a016ab0984c1c001a', NULL, '2019-05-13 17:48:52', b'0', NULL, '402892896ab05165016ab0524fa60000', NULL, '2019-05-13 17:48:52', '2019-05-13 17:48:53', '001', '0ec968fe-455c-ef37-b231-4d0e33cf377b', NULL, NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892896ab06e8a016ab09852ba001b', NULL, '2019-05-13 17:48:53', b'0', NULL, '402892896ab05165016ab0524fa60000', NULL, '2019-05-13 17:48:53', '2019-05-13 17:48:54', '001', '112d7510-bde1-52de-d47a-9839f476172d', NULL, NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892896ab06e8a016ab0987bec001c', NULL, '2019-05-13 17:49:04', b'0', NULL, '402892896ab05165016ab0524fa60000', NULL, '2019-05-13 17:49:04', '2019-05-13 17:49:05', '002', 'e504856f-4ddf-2281-b026-da110e343f5b', NULL, NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892896ab06e8a016ab09897a2001d', NULL, '2019-05-13 17:49:11', b'0', NULL, '402892896ab05165016ab0524fa60000', NULL, '2019-05-13 17:48:46', '2019-05-13 17:48:48', '001', 'a7558d02-cb20-5995-afa2-e663a2643e70', '0001', NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892896ab06e8a016ab0989832001e', NULL, '2019-05-13 17:49:11', b'0', NULL, '402892896ab05165016ab0524fa60000', NULL, '2019-05-13 17:48:49', '2019-05-13 17:48:50', '001', '81946c95-13e1-faff-c23b-fae210e57a15', '0001', NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892896ab06e8a016ab09898c3001f', NULL, '2019-05-13 17:49:11', b'0', NULL, '402892896ab05165016ab0524fa60000', NULL, '2019-05-13 17:48:52', '2019-05-13 17:48:53', '001', '0ec968fe-455c-ef37-b231-4d0e33cf377b', '0001', NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892896ab06e8a016ab098997b0020', NULL, '2019-05-13 17:49:11', b'0', NULL, '402892896ab05165016ab0524fa60000', NULL, '2019-05-13 17:48:53', '2019-05-13 17:48:54', '001', '112d7510-bde1-52de-d47a-9839f476172d', '0001', NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892896ab06e8a016ab0989a0a0021', NULL, '2019-05-13 17:49:12', b'0', NULL, '402892896ab05165016ab0524fa60000', NULL, '2019-05-13 17:49:04', '2019-05-13 17:49:05', '002', 'e504856f-4ddf-2281-b026-da110e343f5b', '0002', NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892896ab06e8a016ab098f84d0022', NULL, '2019-05-13 17:49:36', b'0', NULL, '402892896ab05165016ab0524fa60000', NULL, '2019-05-13 17:49:36', NULL, '001', 'de1d731b-5249-780f-dc73-5656c16beaba', NULL, NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892896ab06e8a016ab09903cc0023', NULL, '2019-05-13 17:49:39', b'0', NULL, '402892896ab05165016ab0524fa60000', NULL, '2019-05-13 17:49:36', NULL, '001', 'de1d731b-5249-780f-dc73-5656c16beaba', '0001', NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892896ab465cf016ab476cf180000', NULL, '2019-05-14 11:50:46', b'0', NULL, '402892896ab465cf016ab4777f530003', '111155', '2019-05-14 11:50:46', '2019-05-14 11:50:56', '001', 'da586648-4883-d031-113e-2fd1804fe637', NULL, NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892896ab465cf016ab47706d80001', NULL, '2019-05-14 11:51:00', b'0', NULL, '402892896ab465cf016ab4777f530003', '二维无', '2019-05-14 11:51:00', '2019-05-14 11:51:01', '001', 'f0d01a1c-415c-24c9-6287-11989629ef71', NULL, NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892896ab465cf016ab4776b140002', NULL, '2019-05-14 11:51:26', b'0', NULL, '402892896ab465cf016ab4777f530003', NULL, '2019-05-14 02:51:05', '2019-05-14 11:51:22', '222', '9af9a794-ede8-cf8a-3e54-0931fa9691a6', NULL, NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892896ab465cf016ab47780480004', NULL, '2019-05-14 11:51:31', b'0', NULL, '402892896ab465cf016ab4777f530003', NULL, '2019-05-14 11:50:46', '2019-05-14 11:50:56', '001', 'da586648-4883-d031-113e-2fd1804fe637', '0001', NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892896ab465cf016ab47780df0005', NULL, '2019-05-14 11:51:31', b'0', NULL, '402892896ab465cf016ab4777f530003', NULL, '2019-05-14 11:51:00', '2019-05-14 11:51:01', '001', 'f0d01a1c-415c-24c9-6287-11989629ef71', '0001', NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892896ab465cf016ab477816d0006', NULL, '2019-05-14 11:51:31', b'0', NULL, '402892896ab465cf016ab4777f530003', NULL, '2019-05-14 02:51:05', '2019-05-14 11:51:22', '222', '9af9a794-ede8-cf8a-3e54-0931fa9691a6', NULL, NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892896abec917016ac0100a64004f', NULL, '2019-05-16 17:53:57', b'0', NULL, '402892896abec917016abfe04428001e', '撒旦撒旦', '2019-05-16 17:53:41', '2019-05-16 17:54:08', '001', '0aefde9c-e6a7-e93b-2ce7-0fdf19482937', '0001', NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892896abec917016ac01087ba0050', NULL, '2019-05-16 17:54:29', b'1', NULL, '402892896abec917016abfe04428001e', NULL, '2019-05-16 17:54:24', '2019-05-16 17:54:46', '001', 'a1e72b4a-d7f0-06e5-63b5-4df682f2eac4', '0001', NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892896abec917016ac01162680051', NULL, '2019-05-16 17:55:25', b'0', NULL, NULL, NULL, NULL, NULL, NULL, '47f750a3-dc29-af1a-ec20-9b44624623c5', NULL, NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892896abec917016ac01163400052', NULL, '2019-05-16 17:55:26', b'0', NULL, '402892896abec917016abfe04428001e', NULL, '2019-05-16 02:03:04', '2019-05-16 17:55:05', '003', '47f750a3-dc29-af1a-ec20-9b44624623c5', NULL, NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892896ac357a7016ac3850fa60008', NULL, '2019-05-17 10:00:37', b'0', NULL, '402892896ac357a7016ac37e144d0000', 'hahah 11ddddddddddddddddddddddddddddddddddddd', '2019-05-17 10:00:35', '2019-05-17 10:01:38', '001', '4a568a9e-d054-783b-ba75-985f1b4edcbe', '0001', NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892896ac357a7016ac386891d0009', NULL, '2019-05-17 10:02:15', b'0', NULL, NULL, NULL, NULL, NULL, NULL, '8f50fad5-8869-7cb1-1806-a8aefc5e1250', NULL, NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892896ac357a7016ac3868a86000a', NULL, '2019-05-17 10:02:15', b'0', NULL, '402892896ac357a7016ac37e144d0000', 'eee', '2019-05-17 00:00:00', '2019-05-17 03:04:04', '002', '8f50fad5-8869-7cb1-1806-a8aefc5e1250', NULL, NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892896ac357a7016ac386bf95000b', NULL, '2019-05-17 10:02:29', b'0', NULL, '402892896ac357a7016ac37e144d0000', 'eee', '2019-05-17 03:03:03', '2019-05-17 04:04:49', '004', '8f50fad5-8869-7cb1-1806-a8aefc5e1250', NULL, NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892896ac391e0016ac3a508490000', NULL, '2019-05-17 10:35:33', b'0', NULL, '402892896ac357a7016ac37e144d0000', 'dfdfd', '2019-05-17 10:35:33', NULL, '001', '0b1f1514-e2ad-7212-eefd-e57ddaeed7e0', '0001', NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892896ac52221016ac52efcc10000', NULL, '2019-05-17 17:45:52', b'0', NULL, '402892896ac357a7016ac37eb24b0004', NULL, '2019-05-17 17:45:51', '2019-05-17 17:45:54', '001', 'cb28b5ce-b6ec-a479-de3f-53398325f608', '0001', NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892896ad9708f016ad9a091640001', NULL, '2019-05-21 17:02:19', b'0', NULL, '402892896ad8ff22016ad954c6610000', 'dsfhds u', '2019-05-21 17:02:19', '2019-05-21 17:03:06', '001', 'd079869f-3821-8a4f-d298-5f1fcd685de4', '0001', NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892896ad9708f016ad9b993400002', NULL, '2019-05-21 17:29:38', b'0', NULL, '402892896ad8ff22016ad954c6610000', NULL, '2019-05-21 17:29:38', NULL, '001', '89f23359-0548-aad0-5e8d-8b6f2319d06f', '0001', NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892896ad9708f016ad9bce7970003', NULL, '2019-05-21 17:33:17', b'0', NULL, '402892896ad8ff22016ad954c6610000', NULL, '2019-05-21 02:02:02', '2019-05-21 03:03:03', '002', '89f23359-0548-aad0-5e8d-8b6f2319d06f', NULL, NULL);
INSERT INTO `t_lien_tanhua` VALUES ('4028928e6b404707016b4056db860000', NULL, '2019-06-10 15:42:42', b'0', NULL, '402892896ac357a7016ac37e144d0000', NULL, '2019-05-17 00:01:01', '2019-05-17 02:02:02', 'asd', 'd216d5a3-15a9-8789-65c5-ccce58b63fb1', NULL, NULL);
INSERT INTO `t_lien_tanhua` VALUES ('4028928e6b404707016b40584ad80001', NULL, '2019-06-10 15:44:16', b'0', NULL, '402892896ac357a7016ac37eb24b0004', '', '2019-05-17 02:03:03', '2019-05-17 03:03:03', '外网', 'cb28b5ce-b6ec-a479-de3f-53398325f608', NULL, NULL);
INSERT INTO `t_lien_tanhua` VALUES ('4028928e6b404707016b405e985d0003', NULL, '2019-06-10 15:51:09', b'0', NULL, '4028928e6b404707016b405e98250002', NULL, '2019-05-17 01:02:03', '2019-05-17 02:02:02', '张真人', '1b2a7ef9-200c-0591-62c0-95138a3ddfca', NULL, NULL);
INSERT INTO `t_lien_tanhua` VALUES ('4028928e6b404707016b405e98970004', NULL, '2019-06-10 15:51:09', b'0', NULL, '4028928e6b404707016b405e98250002', NULL, '2019-05-17 02:03:03', '2019-05-17 04:05:05', '张川', '81a13c4d-dff8-9dcb-91da-e44cdf80aa80', NULL, NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892926af821db016af831aa5b0000', NULL, '2019-05-27 15:29:25', b'0', NULL, NULL, NULL, NULL, NULL, NULL, 'a8d2e912-2783-5fd9-10a4-a41741038165', NULL, NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892926af821db016af831ab4c0001', NULL, '2019-05-27 15:29:25', b'0', NULL, '2c9acde96ae9829b016af748ebaf0004', NULL, '2019-05-27 01:01:01', '2019-05-27 02:02:02', 'bb', 'a8d2e912-2783-5fd9-10a4-a41741038165', NULL, NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892926af821db016af831f3b90002', NULL, '2019-05-27 15:29:44', b'0', NULL, NULL, NULL, NULL, NULL, NULL, 'af6fd749-2066-7fb1-1bc5-26302c42751a', NULL, NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892926af821db016af831f49a0003', NULL, '2019-05-27 15:29:44', b'0', NULL, '2c9acde96ae9829b016af748ebaf0004', NULL, '2019-05-27 03:03:03', '2019-05-27 04:04:04', 'cc', 'af6fd749-2066-7fb1-1bc5-26302c42751a', NULL, NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892926af821db016af8321d4a0004', NULL, '2019-05-27 15:29:55', b'0', NULL, '2c9acde96ae9829b016af748ebaf0004', NULL, '2019-05-27 05:05:06', '2019-05-27 06:06:06', 'vv', 'af6fd749-2066-7fb1-1bc5-26302c42751a', NULL, NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892926af821db016af833e3a30005', NULL, '2019-05-27 15:31:51', b'0', NULL, NULL, NULL, NULL, NULL, NULL, '755988cd-cc1e-b57a-eb66-4e669db70e87', NULL, NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892926af821db016af833e5530006', NULL, '2019-05-27 15:31:51', b'0', NULL, '2c9acde96ae9829b016af748ebaf0004', NULL, '2019-05-27 04:06:08', '2019-05-27 04:07:07', 'qq', '755988cd-cc1e-b57a-eb66-4e669db70e87', NULL, NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892926af821db016af833fb1d0007', NULL, '2019-05-27 15:31:57', b'0', NULL, '2c9acde96ae9829b016af748ebaf0004', NULL, '2019-05-27 07:07:07', '2019-05-27 07:08:07', 'ww', '755988cd-cc1e-b57a-eb66-4e669db70e87', NULL, NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892926af821db016af8342aaa0008', NULL, '2019-05-27 15:32:09', b'0', NULL, '2c9acde96ae9829b016af748ebaf0004', NULL, '2019-05-27 09:12:05', '2019-05-27 09:13:07', 'ee', '755988cd-cc1e-b57a-eb66-4e669db70e87', NULL, NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892926af821db016af83461720009', NULL, '2019-05-27 15:32:23', b'0', NULL, '2c9acde96ae9829b016af748ebaf0004', NULL, '2019-05-27 07:07:08', '2019-05-27 07:14:08', 'rr', '755988cd-cc1e-b57a-eb66-4e669db70e87', NULL, NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892926b024a9b016b028496ed0000', NULL, '2019-05-29 15:36:12', b'0', NULL, '402892926b010a2e016b01711e490000', '对方答复的\n二恶烷惹我VB\n额外热无若\n二二\n认为惹我r\n', '2019-05-29 15:36:12', '2019-05-29 15:56:41', '001', '883e24f2-c0c7-2c96-3f7f-ca1828a6b384', '0001', NULL);
INSERT INTO `t_lien_tanhua` VALUES ('402892926b024a9b016b0297a9580001', NULL, '2019-05-29 15:57:02', b'0', NULL, '402892926b010a2e016b01711e490000', '东方大道多多', '2019-05-29 15:57:01', '2019-05-29 15:57:08', '001', '8df7e7b4-ab69-0dc3-1823-cea3da77ef05', '0001', NULL);
INSERT INTO `t_lien_tanhua` VALUES ('4028abe36b26ada3016b26c7d8fd0000', NULL, '2019-06-05 16:35:59', b'0', NULL, NULL, NULL, NULL, NULL, NULL, 'ec1fad13-5b52-02ab-54cc-f5cf362bee1a', NULL, NULL);
INSERT INTO `t_lien_tanhua` VALUES ('4028abe36b26ada3016b26c7e7ca0001', NULL, '2019-06-05 16:36:03', b'0', NULL, '402892886b250fa2016b251e78450000', NULL, '2019-06-05 03:35:03', '2019-06-05 16:38:39', '011', 'ec1fad13-5b52-02ab-54cc-f5cf362bee1a', NULL, NULL);

-- ----------------------------
-- Table structure for t_nurse
-- ----------------------------
DROP TABLE IF EXISTS `t_nurse`;
CREATE TABLE `t_nurse`  (
  `id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `createrid` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `createtime` varchar(19) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `deleted` bit(1) DEFAULT NULL,
  `title` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `cateringRemarks` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci,
  `conditionRemarks` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci,
  `restsRemarks` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci,
  `submitId` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `lienPersonnelid` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `noinquiry` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `nursePower` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `submitTime` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tanHuaShenQingId` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `remarks` varchar(250) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `talkId` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `talkIdTwo` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `talkTimeClose` datetime(6) DEFAULT NULL,
  `talkTimeOpen` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_nurse
-- ----------------------------
INSERT INTO `t_nurse` VALUES ('2c9acde96998f088016998f385b40000', NULL, '2019-03-20 10:34:50', b'0', NULL, 'AAAA', 'SSSSS', 'CCCCC', 'AAAA', '402892906762e1a1016762f7575e0001', NULL, '40289287684f430c01684f7653b50006', '2019-03-20', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_nurse` VALUES ('2c9acde96998f088016998f468920002', NULL, '2019-03-20 10:35:48', b'0', NULL, 'AAAA', 'AAAA', 'AAAA', 'xxx', '4028928b676274040167627586330000', NULL, '40289287684f430c01684f7653b50006', '2019-03-20', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_nurse` VALUES ('2c9acde96998f088016998f98b830004', NULL, '2019-03-20 10:41:24', b'0', NULL, NULL, NULL, NULL, '啊啊啊', '402892906762e1a1016762f7575e0001', NULL, '40289287684f430c01684f7653b50006', '2019-03-21', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_nurse` VALUES ('2c9acde96999625701699964c2f60000', NULL, '2019-03-20 12:38:31', b'0', NULL, 'DDDDD', 'DDDDD', 'DDDDDD', 'AAAAAA', '40289283687e8f6501687e9b4b0b0000', NULL, '40289287684f430c01684f7653b50006', '2019-03-12', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_nurse` VALUES ('2c9acde969996257016999653e8f0002', NULL, '2019-03-20 12:39:03', b'0', NULL, 'DASDSADASD', 'SADASDASDASDA', 'SADADSADASD', 'DDDD', '4028928b676274040167627586330000', 'hhhhhhhahahjahja啊哈哈', '40289287684f430c01684f7653b50006', '2019-03-19', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_nurse` VALUES ('2c9acde969dd037a0169dd3806c00005', NULL, '2019-04-02 16:43:50', b'0', NULL, 'vvvv', 'vvvv', 'vvv', 'ad', '4028928768279470016827ae734b0000', 'vvvv', '40289287684f430c01684f755acb0004', '2019-04-06', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_nurse` VALUES ('2c9acde969dd037a0169dd58ca820009', NULL, '2019-04-02 17:19:37', b'0', NULL, NULL, NULL, NULL, 'XXX', '402892906762e1a1016762f7575e0001', NULL, '40289287684f430c01684f7653b50006', '2019-04-02', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_nurse` VALUES ('2c9acde969fb96a8016a29c4e3db0008', NULL, '2019-04-17 13:28:50', b'0', NULL, NULL, NULL, NULL, 'AAA', '40289283687e8f6501687e9b4b0b0000', NULL, '40289287684f430c01684f7653b50006', '2019-04-17', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_nurse` VALUES ('2c9acde96a53983e016a539d849c0000', NULL, '2019-04-25 16:29:53', b'0', NULL, NULL, NULL, NULL, 'AAAA', '40289283687e8f6501687e9b4b0b0000', NULL, '40289287684f430c01684f7653b50006', '2019-04-25', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_nurse` VALUES ('2c9acde96a53983e016a53a6033b0002', NULL, '2019-04-25 16:39:09', b'0', NULL, NULL, NULL, NULL, 'AAAA', '40289283687e8f6501687e9b4b0b0000', NULL, '40289287684f430c01684f7653b50006', '2019-04-23', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_nurse` VALUES ('2c9acde96a53983e016a53a792760005', NULL, '2019-04-25 16:40:52', b'0', NULL, NULL, NULL, NULL, '啊啊啊', '40289283687e8f6501687e9b4b0b0000', NULL, '40289287684f430c01684f7653b50006', '2019-04-24', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_nurse` VALUES ('2c9acde96a53983e016a53a7d76e0009', NULL, '2019-04-25 16:41:09', b'0', NULL, NULL, NULL, NULL, '啊啊', '40289283687e8f6501687e9b4b0b0000', NULL, '40289287684f430c01684f7653b50006', '2019-04-22', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_nurse` VALUES ('2c9acde96a94fad2016a9bec07680000', NULL, '2019-05-09 17:28:17', b'0', NULL, NULL, NULL, NULL, NULL, '4028928667bcf7dd0167bd8929850001', NULL, '40289287684f430c01684f755acb0004', '2019-05-09', '402892876850ae90016850cc94c90004', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_nurse` VALUES ('2c9acde96ad8e7e2016ae8d64e1b0000', NULL, '2019-05-24 15:55:19', b'0', NULL, NULL, NULL, NULL, NULL, '4028928f690d793901690e5180a10005', NULL, '40289287684f430c01684f755acb0004', '2019-05-24', '402892896a94e9fa016a9518c8e70000', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_nurse` VALUES ('2c9acde96ae9829b016af6e18ed10000', NULL, '2019-05-27 09:22:18', b'0', NULL, NULL, NULL, NULL, NULL, '40289283687e8f6501687e9b4b0b0000', NULL, '40289287684f430c01684f755acb0004', '2019-05-27', '40289283687e8f6501687eab06760002', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_nurse` VALUES ('2c9acde96ae9829b016af748ebaf0004', NULL, '2019-05-27 11:15:12', b'0', NULL, NULL, NULL, NULL, NULL, '4028928f690d793901690e5180a10005', NULL, '40289287684f430c01684f755acb0004', '2019-05-27', '402892896a94e9fa016a9518c8e70000', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_nurse` VALUES ('2c9acde96ae9829b016af75ee8b60007', NULL, '2019-05-27 11:39:13', b'0', NULL, NULL, NULL, NULL, NULL, '4028928667bcf7dd0167bd8929850001', NULL, '40289287684f430c01684f755acb0004', '2019-05-27', '402892876850ae90016850cc94c90004', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_nurse` VALUES ('2c9acde96ae9829b016af76885390008', NULL, '2019-05-27 11:49:43', b'0', NULL, NULL, NULL, NULL, NULL, '402881e867732439016773313a870001', NULL, '40289287684f430c01684f755acb0004', '2019-05-27', '402881e6677beda901677d46b0f90001', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_nurse` VALUES ('2c9acde96b203bbf016b21e6a32a0000', NULL, '2019-06-04 17:51:31', b'0', NULL, NULL, NULL, NULL, NULL, '40289283687e8f6501687e9b4b0b0000', NULL, '40289287684f430c01684f755acb0004', '2019-06-04', '40289283687e8f6501687eab06760002', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_nurse` VALUES ('402881e96b31d246016b31d633af0000', NULL, '2019-06-07 20:07:29', b'0', NULL, '1', '1', '1', NULL, '4028928f690d793901690e5180a10005', NULL, '40289287684f430c01684f755acb0004', '2019-06-07', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_nurse` VALUES ('402892866ae23ae0016ae24243c00000', NULL, '2019-05-23 09:15:54', b'0', NULL, NULL, NULL, NULL, NULL, '4028928f690d793901690e5180a10005', NULL, '40289287684f430c01684f755acb0004', '2019-05-23', '402892896a94e9fa016a9518c8e70000', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_nurse` VALUES ('40289287685458b80168547ebe6b0000', NULL, '2019-01-16 10:30:18', b'0', NULL, '11111', '1111', '111', '张看护', '4028928f690d793901690e5180a10005', '111', '40289287684f430c01684f755acb0004', '2019-03-19', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_nurse` VALUES ('40289287685458b8016854808fee0001', NULL, '2019-01-16 10:32:18', b'0', NULL, '222', '222', '222', '刘看护', '4028928f690d793901690e5180a10005', '222', '40289287684f430c01684f755acb0004', '2019-03-18', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_nurse` VALUES ('402892886b250fa2016b251e78450000', NULL, '2019-06-05 08:51:22', b'0', NULL, NULL, NULL, NULL, NULL, '4028928f690d793901690e5180a10005', NULL, '40289287684f430c01684f755acb0004', '2019-06-05', '402892896a94e9fa016a9518c8e70000', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_nurse` VALUES ('402892886b250fa2016b263b1c480014', NULL, '2019-06-05 14:02:16', b'0', NULL, NULL, NULL, NULL, NULL, '40289283687e8f6501687e9b4b0b0000', NULL, '40289287684f430c01684f755acb0004', '2019-06-05', '40289283687e8f6501687eab06760002', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_nurse` VALUES ('402892886b250fa2016b263b58060015', NULL, '2019-06-05 14:02:31', b'0', NULL, NULL, NULL, NULL, NULL, '4028928768279470016827ae734b0000', NULL, '40289287684f430c01684f755acb0004', '2019-06-05', '4028928768279470016827b66da60008', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_nurse` VALUES ('402892896998c66a016998e537050004', NULL, '2019-03-20 10:19:12', b'0', NULL, '飒飒防辐射发顺丰萨芬撒法法师方式 发顺丰三发顺丰撒发顺丰暗室逢灯三编边她额不同 投标人别让他别让他把人不同不让别人不让别人不不让别人不日报人别人帮别人不变人不认同吧人头比人', '不让别人吧人比人吧比人别人吧你吗有没有木木嘛 哪天你你  过过更烦距离时间佛佛佛奇偶佛皮肤默默迫而你豹女吧口腔放假哦什么的薮猫是我陪热播能吃吗而我摸排欧品 发噢诶贸片区发', '放蜂蜜搜女莫佛牌三颇丰按时佛奥生怕么破门欧咪咪欧美哦魔噩陪我们佛门佛什么is没是哦女  ', '啊啊啊', '40289283687e8f6501687e9b4b0b0000', '上撒飞洒安防啊飒飒发 过过个二哥个个 地方 煽动颠覆睡觉奥if就哦啊上年年报少见佛奥生怕个你那', '40289287684f430c01684f7653b50006', '2019-03-20', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_nurse` VALUES ('402892896998f2b1016998f9156f0000', NULL, '2019-03-20 10:40:54', b'0', NULL, NULL, NULL, NULL, '啊啊啊', '402892906762e1a1016762f7575e0001', '啊哈哈环境', '40289287684f430c01684f7653b50006', '2019-03-19', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_nurse` VALUES ('402892896a8fb670016a9083ecc20000', NULL, '2019-05-07 12:18:46', b'0', NULL, NULL, NULL, NULL, NULL, '4028928f690d793901690e5180a10005', NULL, NULL, '2019-05-07', '402892896a8bf9c0016a8c03b5fe0000', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_nurse` VALUES ('402892896a954a32016a9557ab9d0000', NULL, '2019-05-08 10:48:31', b'0', NULL, '无', '无', '无', '111111111111111', '4028928f690d793901690e5180a10005', '无', '40289287684f430c01684f755acb0004', '2019-05-08', '402892896a94e9fa016a9518c8e70000', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_nurse` VALUES ('402892896a9a681a016a9a80e1aa0009', NULL, '2019-05-09 10:51:38', b'0', NULL, NULL, NULL, NULL, NULL, '4028928f690d793901690e5180a10005', NULL, '40289287684f430c01684f755acb0004', '2019-05-09', '402892896a94e9fa016a9518c8e70000', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_nurse` VALUES ('402892896aa041b5016aa05db4890000', NULL, '2019-05-10 14:10:56', b'0', NULL, NULL, NULL, NULL, NULL, '4028928f690d793901690e5180a10005', NULL, '40289287684f430c01684f755acb0004', '2019-05-10', '402892896a94e9fa016a9518c8e70000', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_nurse` VALUES ('402892896ab05165016ab0524fa60000', NULL, '2019-05-13 16:32:25', b'0', NULL, NULL, NULL, NULL, NULL, '4028928f690d793901690e5180a10005', NULL, '40289287684f430c01684f755acb0004', '2019-05-13', '402892896a8bf9c0016a8c03b5fe0000', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_nurse` VALUES ('402892896ab465cf016ab4777f530003', NULL, '2019-05-14 11:51:31', b'0', NULL, NULL, NULL, NULL, NULL, '4028928f690d793901690e5180a10005', NULL, '40289287684f430c01684f755acb0004', '2019-05-14', '402892896a8bf9c0016a8c03b5fe0000', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_nurse` VALUES ('402892896ab94ec7016ab957dd040001', NULL, '2019-05-15 10:35:04', b'0', NULL, NULL, NULL, NULL, NULL, '4028928f690d793901690e5180a10005', NULL, '40289287684f430c01684f755acb0004', '2019-05-15', '402892896a8bf9c0016a8c03b5fe0000', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_nurse` VALUES ('402892896ab94ec7016ab9b14b25000e', NULL, '2019-05-15 12:12:45', b'0', NULL, NULL, NULL, NULL, NULL, '4028928f690d793901690e5180a10005', NULL, '40289287684f430c01684f755acb0004', '2019-05-15', '402892896a94e9fa016a9518c8e70000', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_nurse` VALUES ('402892896abec917016abfe04428001e', NULL, '2019-05-16 17:01:46', b'0', NULL, '撒旦撒旦', '大声道', '稍等是ds', '大声道', '4028928f690d793901690e5180a10005', '撒大声的', '40289287684f430c01684f755acb0004', '2019-05-16', '402892896a94e9fa016a9518c8e70000', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_nurse` VALUES ('402892896ac357a7016ac37e144d0000', NULL, '2019-05-17 09:53:00', b'0', NULL, NULL, NULL, '大萨达撒', NULL, '4028928f690d793901690e5180a10005', '萨达撒的    的', '40289287684f430c01684f755acb0004', '2019-05-17', '402892896a94e9fa016a9518c8e70000', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_nurse` VALUES ('402892896ac357a7016ac37eb24b0004', NULL, '2019-05-17 09:53:41', b'0', NULL, NULL, NULL, NULL, NULL, '4028928768279470016827ae734b0000', NULL, '40289287684f430c01684f755acb0004', '2019-05-17', '4028928768279470016827b66da60008', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_nurse` VALUES ('402892896ad8ff22016ad954c6610000', NULL, '2019-05-21 15:39:32', b'0', NULL, NULL, NULL, NULL, NULL, '4028928f690d793901690e5180a10005', NULL, '40289287684f430c01684f755acb0004', '2019-05-21', '402892896a94e9fa016a9518c8e70000', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_nurse` VALUES ('402892896ad8ff22016ad95506890001', NULL, '2019-05-21 15:39:49', b'0', NULL, NULL, NULL, NULL, NULL, '402881e867732439016773313a870001', NULL, '40289287684f430c01684f755acb0004', '2019-05-21', '402881e6677beda901677d46b0f90001', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_nurse` VALUES ('402892896ad9708f016ad9a02b190000', NULL, '2019-05-21 17:01:53', b'0', NULL, NULL, NULL, NULL, NULL, '4028928f690d793901690e5180a10005', NULL, '40289287684f430c01684f755acb0004', '2019-05-21', '4028928469235f65016923606a7d0000', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_nurse` VALUES ('4028928e6b404707016b405e98250002', NULL, '2019-06-10 15:51:09', b'0', NULL, NULL, NULL, NULL, NULL, '402892876b0b5544016b0b875e040001', NULL, NULL, '2019-05-17', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_nurse` VALUES ('402892926afc4928016afc8884cf0000', NULL, '2019-05-28 11:42:46', b'0', NULL, NULL, NULL, NULL, NULL, '40289283687e8f6501687e9b4b0b0000', NULL, '40289287684f430c01684f755acb0004', '2019-05-28', '40289283687e8f6501687eab06760002', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_nurse` VALUES ('402892926afc4928016afce7d07c0001', NULL, '2019-05-28 13:26:51', b'0', NULL, NULL, NULL, NULL, NULL, '4028928f690d793901690e5180a10005', NULL, '40289287684f430c01684f755acb0004', '2019-05-28', '402892896a94e9fa016a9518c8e70000', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_nurse` VALUES ('402892926afc4928016afd02acd50002', NULL, '2019-05-28 13:56:12', b'0', NULL, NULL, NULL, NULL, NULL, '4028928667bcf7dd0167bd8929850001', NULL, '40289287684f430c01684f755acb0004', '2019-05-28', '402892876850ae90016850cc94c90004', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_nurse` VALUES ('402892926afc4928016afd03ae310003', NULL, '2019-05-28 13:57:17', b'0', NULL, NULL, NULL, NULL, NULL, '4028928768279470016827ae734b0000', NULL, '40289287684f430c01684f755acb0004', '2019-05-28', '4028928768279470016827b66da60008', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_nurse` VALUES ('402892926b010a2e016b01711e490000', NULL, '2019-05-29 10:35:18', b'0', NULL, NULL, NULL, NULL, NULL, '4028928f690d793901690e5180a10005', NULL, '40289287684f430c01684f755acb0004', '2019-05-29', '402892896a94e9fa016a9518c8e70000', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_nurse` VALUES ('40289fc26ad2f676016ad2faa75e0000', NULL, '2019-05-20 10:03:23', b'0', NULL, NULL, NULL, NULL, NULL, '4028928f690d793901690e5180a10005', NULL, '40289287684f430c01684f755acb0004', '2019-05-20', '402892896a94e9fa016a9518c8e70000', NULL, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for t_protected_resource
-- ----------------------------
DROP TABLE IF EXISTS `t_protected_resource`;
CREATE TABLE `t_protected_resource`  (
  `id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `createrid` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `createtime` varchar(19) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `deleted` bit(1) DEFAULT NULL,
  `title` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `pid` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `sortindex` int(11) DEFAULT NULL,
  `description` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `icon` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `iconcolor` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tyle` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `url` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `iconclass` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_protected_resource
-- ----------------------------
INSERT INTO `t_protected_resource` VALUES ('1', NULL, NULL, b'0', '系统管理', NULL, 9, NULL, 'anticon-android', NULL, 'menu', NULL, NULL);
INSERT INTO `t_protected_resource` VALUES ('2', NULL, NULL, b'0', '用户管理', '1', 1, NULL, 'anticon-apple', NULL, 'menu', '/usermanage', NULL);
INSERT INTO `t_protected_resource` VALUES ('3', NULL, NULL, b'0', '角色管理', '1', 2, NULL, NULL, NULL, 'menu', '/role', NULL);
INSERT INTO `t_protected_resource` VALUES ('4', NULL, NULL, b'0', '受限资源管理', '1', 3, NULL, NULL, NULL, 'menu', '/protectedResource', NULL);
INSERT INTO `t_protected_resource` VALUES ('4028098169713af70169717f4fac0000', NULL, '2019-03-12 18:42:42', b'0', '常规体检', '40289283675da0c501675dfd06d00000', 2, NULL, '', NULL, 'menu', '/health', NULL);
INSERT INTO `t_protected_resource` VALUES ('4028098169713af70169717fccf10001', NULL, '2019-03-12 18:43:14', b'0', '用药记录', '40289283675da0c501675dfd06d00000', 3, '5', '', NULL, 'menu', '/medicalrecords', NULL);
INSERT INTO `t_protected_resource` VALUES ('402880e7676879640167697673740000', NULL, '2018-12-01 19:10:29', b'0', '编辑按钮', '4028928467627054016762b16c2b0001', 1, NULL, 'anticon-android', NULL, 'button', '/feedbacksave', NULL);
INSERT INTO `t_protected_resource` VALUES ('402892836754594a016755047b2c0000', NULL, '2018-11-27 19:53:36', b'0', '看护管理', NULL, 4, NULL, 'fa-wpexplorer', '', 'menu', '', NULL);
INSERT INTO `t_protected_resource` VALUES ('40289283675da0c501675dfd06d00000', NULL, '2018-11-29 13:42:02', b'0', '医疗管理', NULL, 5, NULL, 'fa-imdb', NULL, 'menu', NULL, NULL);
INSERT INTO `t_protected_resource` VALUES ('40289283675da0c501675dfdabab0001', NULL, '2018-11-29 13:42:44', b'0', '药品库', '40289283675da0c501675dfd06d00000', 4, NULL, '', NULL, 'menu', '/drug', NULL);
INSERT INTO `t_protected_resource` VALUES ('40289283675da0c501675e50fa990002', NULL, '2018-11-29 15:13:44', b'0', '进驻体检', '40289283675da0c501675dfd06d00000', 1, NULL, '', NULL, 'menu', '/jinzhutijian', NULL);
INSERT INTO `t_protected_resource` VALUES ('40289283675da0c501675e518f6e0003', NULL, '2018-11-29 15:14:22', b'0', '体检', '40289283675da0c501675dfd06d00000', 9, NULL, '', NULL, 'menu', '/changguitijian', NULL);
INSERT INTO `t_protected_resource` VALUES ('40289283675da0c501675e52e9cf0004', NULL, '2018-11-29 15:15:51', b'0', '办案管理', NULL, 3, NULL, 'anticon-chrome', NULL, 'menu', NULL, NULL);
INSERT INTO `t_protected_resource` VALUES ('40289283675da0c501675e53b2940005', NULL, '2018-11-29 15:16:42', b'0', '留置人员信息查询', '40289283675da0c501675e52e9cf0004', 3, NULL, '', NULL, 'menu', '/bananinfo', NULL);
INSERT INTO `t_protected_resource` VALUES ('40289283675da0c501675e5419e40006', NULL, '2018-11-29 15:17:09', b'0', '保障申请', '40289283675da0c501675e52e9cf0004', 1, NULL, '', NULL, 'menu', '/baozhangshenqinginfo', NULL);
INSERT INTO `t_protected_resource` VALUES ('40289283675da0c501675e5466870007', NULL, '2018-11-29 15:17:28', b'0', '谈话权限申请', '40289283675da0c501675e52e9cf0004', 2, NULL, '', NULL, 'menu', '/tanhuashenqinginfo', NULL);
INSERT INTO `t_protected_resource` VALUES ('4028928467627054016762b16c2b0001', NULL, '2018-11-30 11:37:33', b'0', '问题反馈', '40289287676024810167606fd1740003', 1, NULL, 'fa-file-text', NULL, 'menu', '/feedback', NULL);
INSERT INTO `t_protected_resource` VALUES ('40289286675d9b2b01675e13989d0000', NULL, '2018-11-29 14:06:41', b'0', '进驻管理', NULL, 1, NULL, 'fa-address-card-o', NULL, 'menu', NULL, 'anticon-home');
INSERT INTO `t_protected_resource` VALUES ('40289286675d9b2b01675e155e960001', NULL, '2018-11-29 14:08:38', b'0', '进驻登记', '40289286675d9b2b01675e13989d0000', 1, NULL, 'fa-user', NULL, 'menu', '/lienpersonnel', NULL);
INSERT INTO `t_protected_resource` VALUES ('4028928667c56f010167c5dc2d910000', NULL, '2018-12-19 17:46:40', b'0', '查看工作改进建议单', '40289283675da0c501675e52e9cf0004', 4, NULL, '', NULL, 'menu', '/jianyidan', NULL);
INSERT INTO `t_protected_resource` VALUES ('40289287675db9a401675e030a970000', NULL, '2018-11-29 13:48:36', b'0', '办案人员权限管理', NULL, 7, NULL, 'fa-user', NULL, 'menu', '/handlingperson', NULL);
INSERT INTO `t_protected_resource` VALUES ('40289287676024810167606fd1740003', NULL, '2018-11-30 01:06:40', b'0', '案管管理', NULL, 2, NULL, 'fa-balance-scale', NULL, 'menu', NULL, 'fa-ticket');
INSERT INTO `t_protected_resource` VALUES ('40289287676024810167607aab930004', NULL, '2018-11-30 01:18:31', b'0', '留置人员信息查询', '40289287676024810167606fd1740003', 2, NULL, 'fa-user', NULL, 'menu', '/anguan', NULL);
INSERT INTO `t_protected_resource` VALUES ('402892876772b86e016772bc3d410000', NULL, '2018-12-03 14:23:18', b'0', '保障审批', '40289286675d9b2b01675e13989d0000', 3, NULL, 'fa-balance-scale', NULL, 'menu', '/bzsp', NULL);
INSERT INTO `t_protected_resource` VALUES ('4028928767846ecd0167861f402c0000', NULL, '2018-12-07 08:44:14', b'0', '导出留置安全管理系统', '40289287676024810167607aab930004', 1, NULL, NULL, NULL, 'api', 'lienPersonnel/exportDaoChu', NULL);
INSERT INTO `t_protected_resource` VALUES ('40289287683a589101683bfb6c24000f', NULL, '2019-01-11 16:15:59', b'0', '统计图', NULL, 8, NULL, 'fa-file-image-o', NULL, 'menu', '', NULL);
INSERT INTO `t_protected_resource` VALUES ('4028928769bcca960169bceea1aa0000', NULL, '2019-03-27 10:15:49', b'0', ' 谈话权限申请', '40289286675d9b2b01675e13989d0000', 4, NULL, 'fa-file-image-o', NULL, 'menu', '/lienTanhuashenqinginfo', NULL);
INSERT INTO `t_protected_resource` VALUES ('4028928769bcca960169bcf334030001', NULL, '2019-03-27 10:20:49', b'0', '身体情况统计', '40289287683a589101683bfb6c24000f', 1, NULL, 'fa-grav', NULL, 'menu', '/statistic', NULL);
INSERT INTO `t_protected_resource` VALUES ('4028928769bcca960169be17e0e00003', NULL, '2019-03-27 15:40:29', b'0', '谈话统计', '40289287676024810167606fd1740003', 3, NULL, 'fa-diamond ', NULL, 'menu', '/statistictanhua', NULL);
INSERT INTO `t_protected_resource` VALUES ('40289288676207620167622878fe0000', NULL, '2018-11-30 09:07:58', b'0', '办案人员编辑按钮', '40289287675db9a401675e030a970000', 1, NULL, '', NULL, 'button', '/handlingpersonsave', NULL);
INSERT INTO `t_protected_resource` VALUES ('402892896a8567cd016a8588f63b0000', NULL, '2019-05-05 09:08:26', b'0', '楼层', '1', 6, NULL, '', NULL, 'menu', '/floor', NULL);
INSERT INTO `t_protected_resource` VALUES ('4028928a675da89601675daf9bbf0000', NULL, '2018-11-29 12:17:29', b'0', '每日情况录入', '402892836754594a016755047b2c0000', 1, NULL, NULL, '', 'menu', '/nurse', NULL);
INSERT INTO `t_protected_resource` VALUES ('4028928a675da89601675db04b2e0001', NULL, '2018-11-29 12:18:13', b'0', '谈话名单查询', '402892836754594a016755047b2c0000', 2, NULL, 'fa-diamond ', '', 'menu', '/talklist', NULL);
INSERT INTO `t_protected_resource` VALUES ('4028928a675da89601675db57d210002', NULL, '2018-11-29 12:23:54', b'0', '餐饮管理', NULL, 6, NULL, 'anticon-apple', '', 'menu', NULL, NULL);
INSERT INTO `t_protected_resource` VALUES ('4028928a675da89601675db8b2e00003', NULL, '2018-11-29 12:27:24', b'0', '送餐登记', '4028928a675da89601675db57d210002', 1, NULL, 'anticon-apple', '', 'menu', '/catering', NULL);
INSERT INTO `t_protected_resource` VALUES ('4028928a675da89601675db9c20c0004', NULL, '2018-11-29 12:28:34', b'0', '查看保障申请', '4028928a675da89601675db57d210002', 2, NULL, NULL, '#f2f2f2', 'menu', '/safeguardlist', NULL);
INSERT INTO `t_protected_resource` VALUES ('4028928a67623c07016762439fb60000', NULL, '2018-11-30 09:37:38', b'0', '字典分类', '1', 4, NULL, '', NULL, 'menu', '/dictsort', NULL);
INSERT INTO `t_protected_resource` VALUES ('4028928a67623c0701676247201f0002', NULL, '2018-11-30 09:41:27', b'0', '字典管理', '1', 5, NULL, '', NULL, 'menu', '/dictionary', NULL);
INSERT INTO `t_protected_resource` VALUES ('4028928b67627404016762a5725e0001', NULL, '2018-11-30 11:24:29', b'0', '谈话审批', '40289286675d9b2b01675e13989d0000', 2, NULL, 'anticon-apple', NULL, 'menu', '/daiban', NULL);
INSERT INTO `t_protected_resource` VALUES ('4028928f6a61ba32016a626cc75b0000', NULL, '2019-04-28 13:30:57', b'0', '楼层平面图', '40289286675d9b2b01675e13989d0000', 5, NULL, '', NULL, 'menu', '/floorplan', NULL);

-- ----------------------------
-- Table structure for t_role
-- ----------------------------
DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role`  (
  `id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `createrid` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `createtime` varchar(19) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `deleted` bit(1) DEFAULT NULL,
  `title` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `rolename` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `roletype` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_role
-- ----------------------------
INSERT INTO `t_role` VALUES ('1', NULL, NULL, b'0', '管理员', '管理员', '0');
INSERT INTO `t_role` VALUES ('402881e46854ed1c0168555399460015', NULL, '2019-01-16 14:22:48', b'0', '医疗角色', NULL, '0');
INSERT INTO `t_role` VALUES ('402881e56781720601678193c3a20004', NULL, '2018-12-06 11:33:23', b'0', '案管角色', NULL, '0');
INSERT INTO `t_role` VALUES ('402892836754594a01675548d5610001', NULL, '2018-11-27 21:08:15', b'0', '基地角色', NULL, '0');
INSERT INTO `t_role` VALUES ('4028928667865b0d0167868b8ff20001', NULL, '2018-12-07 10:42:32', b'0', '餐饮角色', NULL, '0');
INSERT INTO `t_role` VALUES ('40289287684f430c01684f69c7340002', NULL, '2019-01-15 10:49:18', b'0', '办案角色', NULL, '0');
INSERT INTO `t_role` VALUES ('40289287684f430c01684faa1fca0008', NULL, '2019-01-15 11:59:35', b'0', '看护角色', NULL, '0');
INSERT INTO `t_role` VALUES ('4028928769c1fc2e0169c1ff976f0000', NULL, '2019-03-28 09:52:26', b'0', '系统管理员', NULL, '0');
INSERT INTO `t_role` VALUES ('4028928769c1fc2e0169c1ffd9e40001', NULL, '2019-03-28 09:52:43', b'0', '安全保密管理员', NULL, '0');
INSERT INTO `t_role` VALUES ('4028928769c1fc2e0169c200073f0002', NULL, '2019-03-28 09:52:55', b'0', '安全审计员', NULL, '0');

-- ----------------------------
-- Table structure for t_role_protected_resources
-- ----------------------------
DROP TABLE IF EXISTS `t_role_protected_resources`;
CREATE TABLE `t_role_protected_resources`  (
  `role_id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `protected_resources_id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`role_id`, `protected_resources_id`) USING BTREE,
  INDEX `FKfq1l9yuekldauguxtuo52lafh`(`protected_resources_id`) USING BTREE,
  CONSTRAINT `FKf3s8y840e6ggnalq50icyv2ai` FOREIGN KEY (`role_id`) REFERENCES `t_role` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FKfq1l9yuekldauguxtuo52lafh` FOREIGN KEY (`protected_resources_id`) REFERENCES `t_protected_resource` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_role_protected_resources
-- ----------------------------
INSERT INTO `t_role_protected_resources` VALUES ('1', '1');
INSERT INTO `t_role_protected_resources` VALUES ('402892836754594a01675548d5610001', '1');
INSERT INTO `t_role_protected_resources` VALUES ('1', '2');
INSERT INTO `t_role_protected_resources` VALUES ('1', '3');
INSERT INTO `t_role_protected_resources` VALUES ('1', '4');
INSERT INTO `t_role_protected_resources` VALUES ('1', '4028098169713af70169717f4fac0000');
INSERT INTO `t_role_protected_resources` VALUES ('402881e46854ed1c0168555399460015', '4028098169713af70169717f4fac0000');
INSERT INTO `t_role_protected_resources` VALUES ('402892836754594a01675548d5610001', '4028098169713af70169717f4fac0000');
INSERT INTO `t_role_protected_resources` VALUES ('1', '4028098169713af70169717fccf10001');
INSERT INTO `t_role_protected_resources` VALUES ('402881e46854ed1c0168555399460015', '4028098169713af70169717fccf10001');
INSERT INTO `t_role_protected_resources` VALUES ('402892836754594a01675548d5610001', '4028098169713af70169717fccf10001');
INSERT INTO `t_role_protected_resources` VALUES ('1', '402880e7676879640167697673740000');
INSERT INTO `t_role_protected_resources` VALUES ('402892836754594a01675548d5610001', '402880e7676879640167697673740000');
INSERT INTO `t_role_protected_resources` VALUES ('1', '402892836754594a016755047b2c0000');
INSERT INTO `t_role_protected_resources` VALUES ('402892836754594a01675548d5610001', '402892836754594a016755047b2c0000');
INSERT INTO `t_role_protected_resources` VALUES ('40289287684f430c01684faa1fca0008', '402892836754594a016755047b2c0000');
INSERT INTO `t_role_protected_resources` VALUES ('1', '40289283675da0c501675dfd06d00000');
INSERT INTO `t_role_protected_resources` VALUES ('402881e46854ed1c0168555399460015', '40289283675da0c501675dfd06d00000');
INSERT INTO `t_role_protected_resources` VALUES ('402892836754594a01675548d5610001', '40289283675da0c501675dfd06d00000');
INSERT INTO `t_role_protected_resources` VALUES ('1', '40289283675da0c501675dfdabab0001');
INSERT INTO `t_role_protected_resources` VALUES ('402881e46854ed1c0168555399460015', '40289283675da0c501675dfdabab0001');
INSERT INTO `t_role_protected_resources` VALUES ('402892836754594a01675548d5610001', '40289283675da0c501675dfdabab0001');
INSERT INTO `t_role_protected_resources` VALUES ('4028928667865b0d0167868b8ff20001', '40289283675da0c501675dfdabab0001');
INSERT INTO `t_role_protected_resources` VALUES ('1', '40289283675da0c501675e50fa990002');
INSERT INTO `t_role_protected_resources` VALUES ('402881e46854ed1c0168555399460015', '40289283675da0c501675e50fa990002');
INSERT INTO `t_role_protected_resources` VALUES ('402892836754594a01675548d5610001', '40289283675da0c501675e50fa990002');
INSERT INTO `t_role_protected_resources` VALUES ('4028928667865b0d0167868b8ff20001', '40289283675da0c501675e50fa990002');
INSERT INTO `t_role_protected_resources` VALUES ('4028928667865b0d0167868b8ff20001', '40289283675da0c501675e518f6e0003');
INSERT INTO `t_role_protected_resources` VALUES ('1', '40289283675da0c501675e52e9cf0004');
INSERT INTO `t_role_protected_resources` VALUES ('402892836754594a01675548d5610001', '40289283675da0c501675e52e9cf0004');
INSERT INTO `t_role_protected_resources` VALUES ('40289287684f430c01684f69c7340002', '40289283675da0c501675e52e9cf0004');
INSERT INTO `t_role_protected_resources` VALUES ('4028928769c1fc2e0169c1ff976f0000', '40289283675da0c501675e52e9cf0004');
INSERT INTO `t_role_protected_resources` VALUES ('1', '40289283675da0c501675e53b2940005');
INSERT INTO `t_role_protected_resources` VALUES ('402892836754594a01675548d5610001', '40289283675da0c501675e53b2940005');
INSERT INTO `t_role_protected_resources` VALUES ('4028928667865b0d0167868b8ff20001', '40289283675da0c501675e53b2940005');
INSERT INTO `t_role_protected_resources` VALUES ('40289287684f430c01684f69c7340002', '40289283675da0c501675e53b2940005');
INSERT INTO `t_role_protected_resources` VALUES ('1', '40289283675da0c501675e5419e40006');
INSERT INTO `t_role_protected_resources` VALUES ('402892836754594a01675548d5610001', '40289283675da0c501675e5419e40006');
INSERT INTO `t_role_protected_resources` VALUES ('4028928667865b0d0167868b8ff20001', '40289283675da0c501675e5419e40006');
INSERT INTO `t_role_protected_resources` VALUES ('40289287684f430c01684f69c7340002', '40289283675da0c501675e5419e40006');
INSERT INTO `t_role_protected_resources` VALUES ('1', '40289283675da0c501675e5466870007');
INSERT INTO `t_role_protected_resources` VALUES ('402892836754594a01675548d5610001', '40289283675da0c501675e5466870007');
INSERT INTO `t_role_protected_resources` VALUES ('4028928667865b0d0167868b8ff20001', '40289283675da0c501675e5466870007');
INSERT INTO `t_role_protected_resources` VALUES ('40289287684f430c01684f69c7340002', '40289283675da0c501675e5466870007');
INSERT INTO `t_role_protected_resources` VALUES ('1', '4028928467627054016762b16c2b0001');
INSERT INTO `t_role_protected_resources` VALUES ('402881e56781720601678193c3a20004', '4028928467627054016762b16c2b0001');
INSERT INTO `t_role_protected_resources` VALUES ('402892836754594a01675548d5610001', '4028928467627054016762b16c2b0001');
INSERT INTO `t_role_protected_resources` VALUES ('1', '40289286675d9b2b01675e13989d0000');
INSERT INTO `t_role_protected_resources` VALUES ('402892836754594a01675548d5610001', '40289286675d9b2b01675e13989d0000');
INSERT INTO `t_role_protected_resources` VALUES ('1', '40289286675d9b2b01675e155e960001');
INSERT INTO `t_role_protected_resources` VALUES ('402892836754594a01675548d5610001', '40289286675d9b2b01675e155e960001');
INSERT INTO `t_role_protected_resources` VALUES ('1', '4028928667c56f010167c5dc2d910000');
INSERT INTO `t_role_protected_resources` VALUES ('402892836754594a01675548d5610001', '4028928667c56f010167c5dc2d910000');
INSERT INTO `t_role_protected_resources` VALUES ('40289287684f430c01684f69c7340002', '4028928667c56f010167c5dc2d910000');
INSERT INTO `t_role_protected_resources` VALUES ('1', '40289287676024810167606fd1740003');
INSERT INTO `t_role_protected_resources` VALUES ('402881e56781720601678193c3a20004', '40289287676024810167606fd1740003');
INSERT INTO `t_role_protected_resources` VALUES ('402892836754594a01675548d5610001', '40289287676024810167606fd1740003');
INSERT INTO `t_role_protected_resources` VALUES ('1', '40289287676024810167607aab930004');
INSERT INTO `t_role_protected_resources` VALUES ('402881e56781720601678193c3a20004', '40289287676024810167607aab930004');
INSERT INTO `t_role_protected_resources` VALUES ('402892836754594a01675548d5610001', '40289287676024810167607aab930004');
INSERT INTO `t_role_protected_resources` VALUES ('1', '402892876772b86e016772bc3d410000');
INSERT INTO `t_role_protected_resources` VALUES ('402892836754594a01675548d5610001', '402892876772b86e016772bc3d410000');
INSERT INTO `t_role_protected_resources` VALUES ('1', '4028928767846ecd0167861f402c0000');
INSERT INTO `t_role_protected_resources` VALUES ('402892836754594a01675548d5610001', '4028928767846ecd0167861f402c0000');
INSERT INTO `t_role_protected_resources` VALUES ('1', '40289287683a589101683bfb6c24000f');
INSERT INTO `t_role_protected_resources` VALUES ('402881e56781720601678193c3a20004', '40289287683a589101683bfb6c24000f');
INSERT INTO `t_role_protected_resources` VALUES ('402892836754594a01675548d5610001', '40289287683a589101683bfb6c24000f');
INSERT INTO `t_role_protected_resources` VALUES ('1', '4028928769bcca960169bceea1aa0000');
INSERT INTO `t_role_protected_resources` VALUES ('402892836754594a01675548d5610001', '4028928769bcca960169bceea1aa0000');
INSERT INTO `t_role_protected_resources` VALUES ('1', '4028928769bcca960169bcf334030001');
INSERT INTO `t_role_protected_resources` VALUES ('402881e56781720601678193c3a20004', '4028928769bcca960169bcf334030001');
INSERT INTO `t_role_protected_resources` VALUES ('402892836754594a01675548d5610001', '4028928769bcca960169bcf334030001');
INSERT INTO `t_role_protected_resources` VALUES ('1', '4028928769bcca960169be17e0e00003');
INSERT INTO `t_role_protected_resources` VALUES ('402881e56781720601678193c3a20004', '4028928769bcca960169be17e0e00003');
INSERT INTO `t_role_protected_resources` VALUES ('402892836754594a01675548d5610001', '4028928769bcca960169be17e0e00003');
INSERT INTO `t_role_protected_resources` VALUES ('1', '40289288676207620167622878fe0000');
INSERT INTO `t_role_protected_resources` VALUES ('4028928667865b0d0167868b8ff20001', '40289288676207620167622878fe0000');
INSERT INTO `t_role_protected_resources` VALUES ('1', '402892896a8567cd016a8588f63b0000');
INSERT INTO `t_role_protected_resources` VALUES ('1', '4028928a675da89601675daf9bbf0000');
INSERT INTO `t_role_protected_resources` VALUES ('402892836754594a01675548d5610001', '4028928a675da89601675daf9bbf0000');
INSERT INTO `t_role_protected_resources` VALUES ('4028928667865b0d0167868b8ff20001', '4028928a675da89601675daf9bbf0000');
INSERT INTO `t_role_protected_resources` VALUES ('40289287684f430c01684faa1fca0008', '4028928a675da89601675daf9bbf0000');
INSERT INTO `t_role_protected_resources` VALUES ('1', '4028928a675da89601675db04b2e0001');
INSERT INTO `t_role_protected_resources` VALUES ('402892836754594a01675548d5610001', '4028928a675da89601675db04b2e0001');
INSERT INTO `t_role_protected_resources` VALUES ('4028928667865b0d0167868b8ff20001', '4028928a675da89601675db04b2e0001');
INSERT INTO `t_role_protected_resources` VALUES ('40289287684f430c01684faa1fca0008', '4028928a675da89601675db04b2e0001');
INSERT INTO `t_role_protected_resources` VALUES ('1', '4028928a675da89601675db57d210002');
INSERT INTO `t_role_protected_resources` VALUES ('402892836754594a01675548d5610001', '4028928a675da89601675db57d210002');
INSERT INTO `t_role_protected_resources` VALUES ('4028928667865b0d0167868b8ff20001', '4028928a675da89601675db57d210002');
INSERT INTO `t_role_protected_resources` VALUES ('1', '4028928a675da89601675db8b2e00003');
INSERT INTO `t_role_protected_resources` VALUES ('402892836754594a01675548d5610001', '4028928a675da89601675db8b2e00003');
INSERT INTO `t_role_protected_resources` VALUES ('4028928667865b0d0167868b8ff20001', '4028928a675da89601675db8b2e00003');
INSERT INTO `t_role_protected_resources` VALUES ('1', '4028928a675da89601675db9c20c0004');
INSERT INTO `t_role_protected_resources` VALUES ('402892836754594a01675548d5610001', '4028928a675da89601675db9c20c0004');
INSERT INTO `t_role_protected_resources` VALUES ('4028928667865b0d0167868b8ff20001', '4028928a675da89601675db9c20c0004');
INSERT INTO `t_role_protected_resources` VALUES ('1', '4028928a67623c07016762439fb60000');
INSERT INTO `t_role_protected_resources` VALUES ('1', '4028928a67623c0701676247201f0002');
INSERT INTO `t_role_protected_resources` VALUES ('402892836754594a01675548d5610001', '4028928a67623c0701676247201f0002');
INSERT INTO `t_role_protected_resources` VALUES ('1', '4028928b67627404016762a5725e0001');
INSERT INTO `t_role_protected_resources` VALUES ('402892836754594a01675548d5610001', '4028928b67627404016762a5725e0001');
INSERT INTO `t_role_protected_resources` VALUES ('1', '4028928f6a61ba32016a626cc75b0000');
INSERT INTO `t_role_protected_resources` VALUES ('402892836754594a01675548d5610001', '4028928f6a61ba32016a626cc75b0000');

-- ----------------------------
-- Table structure for t_room
-- ----------------------------
DROP TABLE IF EXISTS `t_room`;
CREATE TABLE `t_room`  (
  `id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `createrid` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `createtime` varchar(19) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `deleted` bit(1) DEFAULT NULL,
  `title` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `fixationValue` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `floorTier` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_room
-- ----------------------------
INSERT INTO `t_room` VALUES ('000d928d28e84a1986beffa39fb8525b', '1', '2019-06-03', b'0', 'L41', 'L41', '2');
INSERT INTO `t_room` VALUES ('038fd14c39e34a86901aeba4e59a8bb8', '1', '2019-06-03', b'0', 'L13', 'L13', '1');
INSERT INTO `t_room` VALUES ('050abe343a264383a2f0cba3b9055d8e', '1', '2019-06-03', b'0', 'L47', 'L47', '2');
INSERT INTO `t_room` VALUES ('083698eb94c042a8b3a8370938c3e7b7', '1', '2019-06-03', b'0', 'L05', 'L05', '1');
INSERT INTO `t_room` VALUES ('0b081fd8a0364a82ba9921a224f5b236', '1', '2019-06-14', b'0', '1211', '1211', '9');
INSERT INTO `t_room` VALUES ('0cf9b71acac44a22acd6846bf2f2fe24', '1', '2019-06-14', b'0', '1217', '1217', '9');
INSERT INTO `t_room` VALUES ('0db6d9f30c14468da891755900362fbe', '1', '2019-06-14', b'0', '1301', '1301', '9');
INSERT INTO `t_room` VALUES ('12889847ddc440f096e51ca335e6e4b3', '1', '2019-06-03', b'0', 'L17', 'L17', '1');
INSERT INTO `t_room` VALUES ('152052b187374c9e867ab5cf18f48800', '1', '2019-06-03', b'0', 'L36', 'L36', '2');
INSERT INTO `t_room` VALUES ('180e596fb9424f4dbac35b7ea1a9b420', '1', '2019-06-03', b'0', 'L18', 'L18', '1');
INSERT INTO `t_room` VALUES ('1943203f6f684000a511185dd29c24cc', '1', '2019-06-03', b'0', 'L32', 'L32', '2');
INSERT INTO `t_room` VALUES ('1abb68a7dea5436f9899384bae2632bb', '1', '2019-06-14', b'0', '1303', '1303', '9');
INSERT INTO `t_room` VALUES ('1ac9386496e042069a503c33684f5a25', '1', '2019-06-14', b'0', '1309', '1309', '9');
INSERT INTO `t_room` VALUES ('1e9fc82f6105413eadcffce212e1f591', '1', '2019-05-30', b'0', 'L03', 'L03', '1');
INSERT INTO `t_room` VALUES ('21506af915d9463cbf8a4be8b4f2dd2a', '1', '2019-05-30', b'0', 'L02', 'L02', '1');
INSERT INTO `t_room` VALUES ('22a3c6c7d5b04106a92efc0f77142bb4', '1', '2019-06-03', b'0', 'L40', 'L40', '2');
INSERT INTO `t_room` VALUES ('25cea3d42065439e9d9f210dacd39ec0', '1', '2019-06-14', b'0', '1210', '1210', '9');
INSERT INTO `t_room` VALUES ('26b280bdd5914716b525befff4a5de68', '1', '2019-06-14', b'0', '1302', '1302', '9');
INSERT INTO `t_room` VALUES ('2c988145ac2c4e769bee0ac5bbb3d2d5', '1', '2019-06-14', b'0', '1205', '1205', '9');
INSERT INTO `t_room` VALUES ('2dac001f19b4404d97ca5f830b318b40', '1', '2019-06-14', b'0', '1307', '1307', '9');
INSERT INTO `t_room` VALUES ('31bec2c94fca4e09b4f1768de50a898b', '1', '2019-06-14', b'0', '1308', '1308', '9');
INSERT INTO `t_room` VALUES ('364ae213954c4f0490a19f74c4ae3e01', '1', '2019-06-14', b'0', '1215', '1215', '9');
INSERT INTO `t_room` VALUES ('3dd204c9e3164220add1a426ae8bcd57', '1', '2019-06-03', b'0', 'L44', 'L44', '2');
INSERT INTO `t_room` VALUES ('4015937ba58544c7b353d101f15d2f5a', '1', '2019-05-30', b'0', 'L01', 'L01', '1');
INSERT INTO `t_room` VALUES ('40d89d56ff4e440f83e1daa8959fef0d', '1', '2019-06-14', b'0', '1206', '1206', '9');
INSERT INTO `t_room` VALUES ('434eb442b906406599521ea3a31c2072', '1', '2019-06-03', b'0', 'L52', 'L52', '2');
INSERT INTO `t_room` VALUES ('43bd9d4582404324a63add76afc6c301', '1', '2019-06-03', b'0', 'L55', 'L55', '2');
INSERT INTO `t_room` VALUES ('47074516f4e7446aa40895c2554042a0', '1', '2019-06-03', b'0', 'L07', 'L07', '1');
INSERT INTO `t_room` VALUES ('4777102439f14f62917d8438df4ddd51', '1', '2019-06-14', b'0', '1105', '1105', '9');
INSERT INTO `t_room` VALUES ('49c5fd54333a477fb5db91f52f72d053', '1', '2019-06-03', b'0', 'L29', 'L29', '2');
INSERT INTO `t_room` VALUES ('4a5c9681bea3413d9cb41fdba5128115', '1', '2019-06-03', b'0', 'L24', 'L24', '2');
INSERT INTO `t_room` VALUES ('4e0751b96cf5499e9f7ca4e14d912f36', '1', '2019-06-14', b'0', '1107', '1107', '9');
INSERT INTO `t_room` VALUES ('4ea3bf6737614fa88f9b6b8cd091d568', '1', '2019-06-03', b'0', 'L43', 'L43', '2');
INSERT INTO `t_room` VALUES ('5246a0f979c94ab9aa6554b7bc6bae68', '1', '2019-06-03', b'0', 'L31', 'L31', '2');
INSERT INTO `t_room` VALUES ('5d66eb8cd5bb40108e3b21ffc2d20899', '1', '2019-06-03', b'0', 'L26', 'L26', '2');
INSERT INTO `t_room` VALUES ('62481fd36fad41a7bc477996ba1b0721', '1', '2019-06-14', b'0', '1305', '1305', '9');
INSERT INTO `t_room` VALUES ('6252295b1d6e4cfbac5b9c36d30d5f40', '1', '2019-06-03', b'0', 'L49', 'L49', '2');
INSERT INTO `t_room` VALUES ('62c5b39e0ae246b28e122167db2c943f', '1', '2019-06-03', b'0', 'L34', 'L34', '2');
INSERT INTO `t_room` VALUES ('633aa509314c4e229a62e0ffed234fec', '1', '2019-06-14', b'0', '1202', '1202', '9');
INSERT INTO `t_room` VALUES ('64c889eec6b141b68b800b1274b859aa', '1', '2019-06-03', b'0', 'L42', 'L42', '2');
INSERT INTO `t_room` VALUES ('6a70894ad730450b9c8434561e0a2556', '1', '2019-06-03', b'0', 'L51', 'L51', '2');
INSERT INTO `t_room` VALUES ('6d02df76b2164cc2917d03687656636f', '1', '2019-06-03', b'0', 'L16', 'L16', '1');
INSERT INTO `t_room` VALUES ('711bdfa6b2a846209bc156aa628bbc04', '1', '2019-06-14', b'0', '1207', '1207', '9');
INSERT INTO `t_room` VALUES ('77fe3c769f644f65a00de1f5b3f0052d', '1', '2019-06-14', b'0', '1209', '1209', '9');
INSERT INTO `t_room` VALUES ('7eb9092c8aa742eca0d7d7a1c90ff270', '1', '2019-06-03', b'0', 'L20', 'L20', '1');
INSERT INTO `t_room` VALUES ('7f973f02b16c42d0bdb516a75cf89f55', '1', '2019-06-14', b'0', '1208', '1208', '9');
INSERT INTO `t_room` VALUES ('83c7282453b1403a8838f11c834d6879', '1', '2019-06-14', b'0', '1213', '1213', '9');
INSERT INTO `t_room` VALUES ('848dd58fc4794eb59834d3cfba4c8958', '1', '2019-06-03', b'0', 'L12', 'L12', '1');
INSERT INTO `t_room` VALUES ('864a0e2f553447a9bfcade10e08a956b', '1', '2019-06-03', b'0', 'L45', 'L45', '2');
INSERT INTO `t_room` VALUES ('893880a0706049ed9af3085a6ccccbc5', '1', '2019-06-03', b'0', 'L33', 'L33', '2');
INSERT INTO `t_room` VALUES ('8a58f59c1b0c43d4b4614dd60833c24e', '1', '2019-06-14', b'0', '1310', '1310', '9');
INSERT INTO `t_room` VALUES ('8a9621861f224780a2baf964dae4681d', '1', '2019-06-03', b'0', 'L39', 'L39', '2');
INSERT INTO `t_room` VALUES ('8abb078b65d645c59b1f25eaf29a1b61', '1', '2019-06-14', b'0', '1306', '1306', '9');
INSERT INTO `t_room` VALUES ('8b08421287d5494db0d0787255634786', '1', '2019-06-03', b'0', 'L48', 'L48', '2');
INSERT INTO `t_room` VALUES ('8bf2cf201fb842a080a434eb427c45bb', '1', '2019-06-03', b'0', 'L35', 'L35', '2');
INSERT INTO `t_room` VALUES ('929ed95c66e24f3da11abd4eca5e7d9f', '1', '2019-06-14', b'0', '1216', '1216', '9');
INSERT INTO `t_room` VALUES ('92dacb5b70ff4ba5aef0e3bd7ac1046e', '1', '2019-06-03', b'0', 'L09', 'L09', '1');
INSERT INTO `t_room` VALUES ('9b27bb2974cb4942906fac08d6077c86', '1', '2019-06-03', b'0', 'L08', 'L08', '1');
INSERT INTO `t_room` VALUES ('9bee8fcef8c84e67aa658987a9fcd4fd', '1', '2019-06-14', b'0', '1214', '1214', '9');
INSERT INTO `t_room` VALUES ('9d16194b87b543bf8b690bd4712bb461', '1', '2019-06-03', b'0', 'L30', 'L30', '2');
INSERT INTO `t_room` VALUES ('9f013cd342cc4607bfe5ac0e1eaca3f3', '1', '2019-06-03', b'0', 'L04', 'L04', '1');
INSERT INTO `t_room` VALUES ('9f304d224b15477bb3e8f21f9feb6c87', '1', '2019-06-14', b'0', '1103', '1103', '9');
INSERT INTO `t_room` VALUES ('a03abdfcf2784eb88830b19cba8e74b0', '1', '2019-05-31', b'0', 'L23', 'L23', '2');
INSERT INTO `t_room` VALUES ('a1cbb216a05a461784addb4277b407c1', '1', '2019-06-03', b'0', 'L22', 'L22', '1');
INSERT INTO `t_room` VALUES ('a2c2747497ea4bffaa489e8be15e4293', '1', '2019-06-14', b'0', '1104', '1104', '9');
INSERT INTO `t_room` VALUES ('b27caa31824d4f59961e33483e1171fc', '1', '2019-06-14', b'0', '1108', '1108', '9');
INSERT INTO `t_room` VALUES ('b6cb4fabb3bf4513b254b2cf80efac84', '1', '2019-06-14', b'0', '1204', '1204', '9');
INSERT INTO `t_room` VALUES ('b715da42fe654428a5cc347d616d494e', '1', '2019-06-14', b'0', '1109', '1109', '9');
INSERT INTO `t_room` VALUES ('ba35f2b8cd224428ba579840365708fa', '1', '2019-06-03', b'0', 'L54', 'L54', '2');
INSERT INTO `t_room` VALUES ('c08d28e09f9e4ba388dc685fa200e38f', '1', '2019-06-03', b'0', 'L28', 'L28', '2');
INSERT INTO `t_room` VALUES ('caa87f25dc66471e8ae776ad8e19ec23', '1', '2019-06-03', b'0', 'L11', 'L11', '1');
INSERT INTO `t_room` VALUES ('cf1cd29edc514a3d830cdb29e8b5905c', '1', '2019-06-14', b'0', '1201', '1201', '9');
INSERT INTO `t_room` VALUES ('cf397cba37ee40118dae451e5a7de8b1', '1', '2019-06-14', b'0', '1203', '1203', '9');
INSERT INTO `t_room` VALUES ('cf6fe055ffff4bc096a10f44d5ff11dc', '1', '2019-06-03', b'0', 'L46', 'L46', '2');
INSERT INTO `t_room` VALUES ('d015d12d9db746a8a74ea7f47f4e8ee3', '1', '2019-06-03', b'0', 'L25', 'L25', '2');
INSERT INTO `t_room` VALUES ('d36cf538259c4967af1e786b0239e997', '1', '2019-06-03', b'0', 'L37', 'L37', '2');
INSERT INTO `t_room` VALUES ('d63865386dd94b11bdc1ecdfad211847', '1', '2019-06-03', b'0', 'L06', 'L06', '1');
INSERT INTO `t_room` VALUES ('d714c8cc90844b729b8cd2f185f2feb8', '1', '2019-06-14', b'0', '1110', '1110', '9');
INSERT INTO `t_room` VALUES ('d834c92044584c4e98fdcadf30a673c7', '1', '2019-06-03', b'0', 'L53', 'L53', '2');
INSERT INTO `t_room` VALUES ('d8e137f6549c4fe1905dd62fa21a674e', '1', '2019-06-14', b'0', '1212', '1212', '9');
INSERT INTO `t_room` VALUES ('db2858bc2ba545f890b63343a822e7b8', '1', '2019-06-03', b'0', 'L38', 'L38', '2');
INSERT INTO `t_room` VALUES ('dc60304491234b9285a8731057d29a4e', '1', '2019-06-03', b'0', 'L14', 'L14', '1');
INSERT INTO `t_room` VALUES ('dd13b8c07a394cc4b3d2a3bbf710cd34', '1', '2019-06-03', b'0', 'L15', 'L15', '1');
INSERT INTO `t_room` VALUES ('dd95fdf3a1f44220b2f528a1207ac9e1', '1', '2019-06-03', b'0', 'L10', 'L10', '1');
INSERT INTO `t_room` VALUES ('df06097721074262ad4c772c61b95d4c', '1', '2019-06-03', b'0', 'L19', 'L19', '1');
INSERT INTO `t_room` VALUES ('e00fda8a26a1469699e9d79aa8223b00', '1', '2019-06-03', b'0', 'L50', 'L50', '2');
INSERT INTO `t_room` VALUES ('e378b94bb0b841ddae6a80e35b533fce', '1', '2019-06-14', b'0', '1106', '1106', '9');
INSERT INTO `t_room` VALUES ('e8cc88addc4e4c34aa92bf41ebcf59af', '1', '2019-06-14', b'0', '1101', '1101', '9');
INSERT INTO `t_room` VALUES ('ef85653f4d3845d3a08fc84949a6addc', '1', '2019-06-03', b'0', 'L21', 'L21', '1');
INSERT INTO `t_room` VALUES ('f3bff2aa4b794e629b9b598cd4a36034', '1', '2019-06-03', b'0', 'L27', 'L27', '2');
INSERT INTO `t_room` VALUES ('f76e8704d6304e58a44144eaed64680a', '1', '2019-06-14', b'0', '1304', '1304', '9');
INSERT INTO `t_room` VALUES ('f7e40bbeae724cee94f02c021f8ad99b', '1', '2019-06-14', b'0', '1218', '1218', '9');
INSERT INTO `t_room` VALUES ('fae03d1824e54d6394182e61a7daa0c8', '1', '2019-06-14', b'0', '1102', '1102', '9');

-- ----------------------------
-- Table structure for t_tanhuashenqing
-- ----------------------------
DROP TABLE IF EXISTS `t_tanhuashenqing`;
CREATE TABLE `t_tanhuashenqing`  (
  `id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `createrid` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `createtime` varchar(19) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `deleted` bit(1) DEFAULT NULL,
  `title` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `bumen` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `renyuan` json,
  `tianbaoren` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `lpId` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tianBaoTime` date DEFAULT NULL,
  `shenpiStatus` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `shenpiYijian` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `doorId` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `lifangStaffDto` json,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_tanhuashenqing
-- ----------------------------
INSERT INTO `t_tanhuashenqing` VALUES ('402881e6677beda901677d46b0f90001', NULL, '2018-12-05 15:30:44', b'0', NULL, '4028928b6781689b016782298bcc0002', '[]', '111', '402881e867732439016773313a870001', '2018-12-05', '1', '', NULL, NULL);
INSERT INTO `t_tanhuashenqing` VALUES ('40289283687e8f6501687eab06760002', NULL, '2019-01-24 15:02:44', b'0', NULL, NULL, '[\"0001\"]', 'sd', '40289283687e8f6501687e9b4b0b0000', '2019-01-23', '1', NULL, NULL, NULL);
INSERT INTO `t_tanhuashenqing` VALUES ('40289283687ec07001687ef127670002', NULL, '2019-01-24 16:19:20', b'0', NULL, '40289287684eed6201684f3c74780017', '[\"0002\"]', 'ww', '40289283687e8f6501687e9b4b0b0000', '2019-01-24', '0', NULL, NULL, '[{\"dptId\": \"2\", \"sysno\": \"2\", \"serial\": \"0000000053116894\", \"dptName\": \"测试\", \"emplyId\": \"0002\", \"emplySex\": \"男\", \"emplyCode\": \"002\", \"emplyName\": \"002\", \"isDeleted\": \"0\", \"invalidate\": \"2049-05-06\"}]');
INSERT INTO `t_tanhuashenqing` VALUES ('402892846786219e0167869459810003', NULL, '2018-12-07 10:52:08', b'0', NULL, '4028928b6781689b016782298bcc0002', '[]', '大额发', '4028928b676274040167632ab5170002', '2018-12-07', '1', '', NULL, NULL);
INSERT INTO `t_tanhuashenqing` VALUES ('4028928469235f65016923606a7d0000', NULL, '2019-02-25 14:38:35', b'0', NULL, '40289287684eed6201684f3c74780017', '[]', '12121', '4028928f690d793901690e5180a10005', '2019-02-21', '1', NULL, NULL, NULL);
INSERT INTO `t_tanhuashenqing` VALUES ('40289286677224d801677240f9ba0000', NULL, '2018-12-03 12:08:40', b'0', NULL, '4028928b6781689b016782298bcc0002', '[]', '生活会', '4028928b676274040167632ab5170002', '2018-12-05', '1', '可以', NULL, NULL);
INSERT INTO `t_tanhuashenqing` VALUES ('4028928768279470016827b66da60008', NULL, '2019-01-07 17:48:13', b'0', NULL, '4028928b6781689b016782298bcc0002', '[\"0001\"]', '测试门禁人员数据', '4028928768279470016827ae734b0000', '2019-01-07', '1', '同意', NULL, NULL);
INSERT INTO `t_tanhuashenqing` VALUES ('402892876850ae90016850c73a030002', NULL, '2019-01-15 17:11:00', b'0', NULL, '4028928b6781689b016782298bcc0002', '[]', '111', '4028928768279470016827ae734b0000', '2019-01-15', '1', NULL, NULL, NULL);
INSERT INTO `t_tanhuashenqing` VALUES ('402892876850ae90016850cc55bb0003', NULL, '2019-01-15 17:16:35', b'0', NULL, '40289287684eed6201684f3bd42b0015', '[\"0002\", \"0001\"]', '000', '4028928768279470016827ae734b0000', '2019-01-15', '1', NULL, '1', NULL);
INSERT INTO `t_tanhuashenqing` VALUES ('402892876850ae90016850cc94c90004', NULL, '2019-01-15 17:16:51', b'0', NULL, '4028928b6781689b016782298bcc0002', '[\"0001\"]', '666', '4028928667bcf7dd0167bd8929850001', '2019-01-15', '1', NULL, '1', NULL);
INSERT INTO `t_tanhuashenqing` VALUES ('402892896a8bf9c0016a8c03b5fe0000', NULL, '2019-05-06 15:20:14', b'0', NULL, '40289287684eed6201684f3c74780017', '[\"0001\", \"0002\"]', '高渐离', '4028928f690d793901690e5180a10005', '2019-05-06', '1', '同意', NULL, '[]');
INSERT INTO `t_tanhuashenqing` VALUES ('402892896a94e9fa016a9518c8e70000', NULL, '2019-05-08 09:39:50', b'0', NULL, '40289287684eed6201684f3c74780017', '[\"0005\", \"0001\", \"0003\", \"0004\", \"0002\"]', '呵呵呵', '4028928f690d793901690e5180a10005', '2019-05-08', '1', '同意', NULL, '[]');
INSERT INTO `t_tanhuashenqing` VALUES ('4028928a676d03b301676d0abe540000', NULL, '2018-12-02 11:51:19', b'0', NULL, '4028928b6781689b016782298bcc0002', '[]', '王', '4028928b676274040167632ab5170002', '2018-12-05', '1', '审批', NULL, NULL);
INSERT INTO `t_tanhuashenqing` VALUES ('4028928e6b3f6880016b3f6bd93c0000', NULL, '2019-06-10 11:26:00', b'0', NULL, '40289287684eed6201684f3c74780017', '[\"0002\"]', '呵呵呵', '402892876b0b5544016b0b875e040001', '2019-06-10', '0', NULL, NULL, '[{\"dptId\": \"2\", \"sysno\": \"1\", \"serial\": \"0000000053977D93\", \"dptName\": \"测试\", \"emplyId\": \"ABC1\", \"emplySex\": \"男\", \"emplyCode\": \"001\", \"emplyName\": \"001\", \"isDeleted\": \"0\", \"invalidate\": \"2049-05-06\"}, {\"dptId\": \"2\", \"sysno\": \"1\", \"serial\": \"0000000053977D93\", \"dptName\": \"测试\", \"emplyId\": \"ABC1\", \"emplySex\": \"男\", \"emplyCode\": \"001\", \"emplyName\": \"001\", \"isDeleted\": \"0\", \"invalidate\": \"2049-05-06\"}, {\"dptId\": \"2\", \"sysno\": \"2\", \"serial\": \"0000000053116894\", \"dptName\": \"测试\", \"emplyId\": \"0002\", \"emplySex\": \"男\", \"emplyCode\": \"002\", \"emplyName\": \"002\", \"isDeleted\": \"0\", \"invalidate\": \"2049-05-06\"}]');
INSERT INTO `t_tanhuashenqing` VALUES ('4028928f69faf7350169fb02b4230000', NULL, '2019-04-08 11:34:12', b'0', NULL, '40289287684eed6201684f3c74780017', '[]', '凄凄切切', '2c9acde969dd037a0169dd2100c50003', '2019-04-17', '0', NULL, NULL, '[]');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `createrid` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `createtime` varchar(19) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `deleted` bit(1) DEFAULT NULL,
  `title` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `address` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `build` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `buildinadmin` bit(1) DEFAULT NULL,
  `dangzuzhipassed` bit(1) DEFAULT NULL,
  `door` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `enabled` bit(1) DEFAULT NULL,
  `img` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `isadmin` bit(1) DEFAULT NULL,
  `password` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `telphone` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `username` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `wxopenid` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `bumenId` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `kanhuId` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `yihurenyuan` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', NULL, NULL, b'0', '管理员', NULL, NULL, NULL, NULL, NULL, b'1', 'imgs/0f1b862b-5a55-499b-b54e-df8fa6636135/40d73a03608847b6acd77b9f833c2b1d.jpg', NULL, '$2a$10$O0HSkQTYab6Ni0rN5rSZJe5CI65UYdPghuJANH2WBOVgqvlIB8kHy', '13512120920', 'admin', NULL, NULL, NULL, NULL);
INSERT INTO `t_user` VALUES ('2c9acde969d6c34f0169d8029eb30001', NULL, '2019-04-01 16:27:24', b'0', 'yihu2', NULL, NULL, b'0', b'0', NULL, b'1', NULL, b'1', '$2a$10$nLAaYOwYVUDpJaa0d6acDuyU2kcTRFLZt0WqsyHKGinSLJf8guZDu', '1111', '医护2', NULL, NULL, NULL, '40289284692c651f01692d9da0860002');
INSERT INTO `t_user` VALUES ('2c9acde96a57baad016a9065a7630000', NULL, '2019-05-07 11:45:42', b'0', '看护公安', NULL, NULL, b'0', b'0', NULL, b'1', NULL, b'1', '$2a$10$JemZpLpbOPZApiT21DrtSev0mOAvRb3fKku/3osuE/6mrk6I2qCr6', NULL, '看护公安', NULL, NULL, NULL, NULL);
INSERT INTO `t_user` VALUES ('402892846919889601691991f8980001', NULL, '2019-02-23 16:56:30', b'0', '案管用户', NULL, NULL, b'0', b'0', NULL, b'1', NULL, b'1', '$2a$10$QEZ9Wh7cgA3BLhfyDIY13.8YVgfVQCMQuPZFXydkICMk9KBNumtWm', NULL, '案管用户', NULL, NULL, NULL, NULL);
INSERT INTO `t_user` VALUES ('4028928769473ec2016947436f650000', NULL, '2019-03-04 13:53:15', b'0', '医护1', NULL, NULL, b'0', b'0', NULL, b'1', NULL, b'1', '$2a$10$PpkM9KTLg041WzB/K2H86ef0ZcQ7A75TfFokUn5D.ZbW7nqUyZKOG', NULL, '医护1', NULL, NULL, NULL, '40289284692c651f01692d8d1c260001');
INSERT INTO `t_user` VALUES ('4028928d6918db860169191647ec0000', NULL, '2019-02-23 14:41:24', b'0', '基地管理员', NULL, NULL, b'0', b'0', NULL, b'1', NULL, b'1', '$2a$10$SXxCLGiXGFlQMeKiAsRuIuy6WFgaFnp6dBZgnxY4WfLVwGHL/X2K.', NULL, '基地管理员', NULL, NULL, NULL, NULL);
INSERT INTO `t_user` VALUES ('4028928f690ea83401690f0e156f0000', NULL, '2019-02-21 15:56:14', b'0', '餐饮用户', NULL, NULL, b'0', b'0', NULL, b'1', NULL, b'1', '$2a$10$u6DERAZJQAErKJXNsMkmp.yGPXVSrTGR0u4F8exQKGJVqR2j0AtES', NULL, '餐饮用户', NULL, NULL, NULL, NULL);
INSERT INTO `t_user` VALUES ('4028928f690ea83401690f0e6ae80001', NULL, '2019-02-21 15:56:36', b'0', '医疗用户', NULL, NULL, b'0', b'0', NULL, b'1', NULL, b'1', '$2a$10$sXIwIIkJZoVOI/Gm/pQ/9eMD7TeKZyu6fbsPCC3wCUqcqGIb2Fom6', NULL, '医疗用户', NULL, NULL, NULL, '40289284692c651f01692d8d1c260001');
INSERT INTO `t_user` VALUES ('4028928f690ea83401690f0f64050002', NULL, '2019-02-21 15:57:40', b'0', '看护男公安', NULL, NULL, b'0', b'0', NULL, b'1', NULL, b'1', '$2a$10$9ft98kt22uyC96Z3gVzuL.2eZyk295DMWP4jZjLGlfDvTtwgTbV42', NULL, '看护男公安', NULL, NULL, '40289287684f430c01684f755acb0004', NULL);
INSERT INTO `t_user` VALUES ('4028928f690ea83401690f0fa4630003', NULL, '2019-02-21 15:57:57', b'0', '看护女公安', NULL, NULL, b'0', b'0', NULL, b'1', NULL, b'1', '$2a$10$lkBbubatCx089OdbYtjDfeXLgp8fXL5FoRfBfVOq8m35OR.YQE4uK', NULL, '看护女公安', NULL, NULL, '40289287684f430c01684f7602c70005', NULL);
INSERT INTO `t_user` VALUES ('4028928f690ea83401690f0fe1900004', NULL, '2019-02-21 15:58:12', b'0', '看护武警', NULL, NULL, b'0', b'0', NULL, b'1', NULL, b'1', '$2a$10$A2jpZnPX7vA/Fv4IGF1S8uUtlsQmUCeBKuj3uFkcqNYHbuprXc3YC', NULL, '看护武警', NULL, NULL, '40289287684f430c01684f7653b50006', NULL);
INSERT INTO `t_user` VALUES ('4028928f690ea83401690f10908a0005', NULL, '2019-02-21 15:58:57', b'0', '办案一', NULL, NULL, b'0', b'0', NULL, b'1', NULL, b'1', '$2a$10$raS.50YbolBomwF.9p98he95VU3RBsL08QxKSvWN1kqBRTlH7R5DG', NULL, '办案一', NULL, '40289287684eed6201684f3c74780017', NULL, NULL);
INSERT INTO `t_user` VALUES ('4028928f690ea83401690f10d3f00006', NULL, '2019-02-21 15:59:14', b'0', '办案二', NULL, NULL, b'0', b'0', NULL, b'1', NULL, b'1', '$2a$10$wDprNZ730C4P0NfV8F48j.BktB17h9dolhNrAIZmwvajf6qHKo0G6', NULL, '办案二', NULL, '40289287684eed6201684f3d8ca7001b', NULL, NULL);
INSERT INTO `t_user` VALUES ('4028928f690ea83401690f110cd80007', NULL, '2019-02-21 15:59:29', b'0', '办案三', NULL, NULL, b'0', b'0', NULL, b'1', NULL, b'1', '$2a$10$8smXSwAc15STsAd4a.IgT.CI0ICBIZvPH9qhGRT7g/e2Pg/EGvttO', NULL, '办案三', NULL, '40289287684eed6201684f3c74780017', NULL, NULL);

-- ----------------------------
-- Table structure for t_user_roles
-- ----------------------------
DROP TABLE IF EXISTS `t_user_roles`;
CREATE TABLE `t_user_roles`  (
  `user_id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `roles_id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`user_id`, `roles_id`) USING BTREE,
  INDEX `FKj47yp3hhtsoajht9793tbdrp4`(`roles_id`) USING BTREE,
  CONSTRAINT `FKj47yp3hhtsoajht9793tbdrp4` FOREIGN KEY (`roles_id`) REFERENCES `t_role` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FKk5rp2dkndggke6b98sk3tmwpy` FOREIGN KEY (`user_id`) REFERENCES `t_user` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FKpqntgokae5e703qb206xvfdk3` FOREIGN KEY (`user_id`) REFERENCES `t_user` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user_roles
-- ----------------------------
INSERT INTO `t_user_roles` VALUES ('1', '1');
INSERT INTO `t_user_roles` VALUES ('2c9acde969d6c34f0169d8029eb30001', '402881e46854ed1c0168555399460015');
INSERT INTO `t_user_roles` VALUES ('4028928769473ec2016947436f650000', '402881e46854ed1c0168555399460015');
INSERT INTO `t_user_roles` VALUES ('4028928f690ea83401690f0e6ae80001', '402881e46854ed1c0168555399460015');
INSERT INTO `t_user_roles` VALUES ('402892846919889601691991f8980001', '402881e56781720601678193c3a20004');
INSERT INTO `t_user_roles` VALUES ('4028928d6918db860169191647ec0000', '402892836754594a01675548d5610001');
INSERT INTO `t_user_roles` VALUES ('4028928f690ea83401690f0e156f0000', '4028928667865b0d0167868b8ff20001');
INSERT INTO `t_user_roles` VALUES ('4028928f690ea83401690f10908a0005', '40289287684f430c01684f69c7340002');
INSERT INTO `t_user_roles` VALUES ('4028928f690ea83401690f10d3f00006', '40289287684f430c01684f69c7340002');
INSERT INTO `t_user_roles` VALUES ('4028928f690ea83401690f110cd80007', '40289287684f430c01684f69c7340002');
INSERT INTO `t_user_roles` VALUES ('2c9acde96a57baad016a9065a7630000', '40289287684f430c01684faa1fca0008');
INSERT INTO `t_user_roles` VALUES ('4028928f690ea83401690f0f64050002', '40289287684f430c01684faa1fca0008');
INSERT INTO `t_user_roles` VALUES ('4028928f690ea83401690f0fa4630003', '40289287684f430c01684faa1fca0008');
INSERT INTO `t_user_roles` VALUES ('4028928f690ea83401690f0fe1900004', '40289287684f430c01684faa1fca0008');

SET FOREIGN_KEY_CHECKS = 1;
