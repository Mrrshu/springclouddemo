#创建label表
DROP TABLE IF EXISTS `tb_label`;
CREATE TABLE `tb_label` (
  `fans` int(11) DEFAULT NULL,
  `count` int(11) DEFAULT NULL,
  `recommend` varchar(255) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `labelname` varchar(255) DEFAULT NULL,
  `id` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
