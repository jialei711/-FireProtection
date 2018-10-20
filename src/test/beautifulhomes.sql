CREATE TABLE `bh_user` (
  `id` varchar(255) NOT NULL,
  `nick_name` varchar(255) DEFAULT NULL,
  `passwd` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `token` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `bh_user`;

CREATE TABLE `bh_user` (
  `id` varchar(255) NOT NULL,
  `nick_name` varchar(255) DEFAULT NULL,
  `passwd` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `token` varchar(255) DEFAULT NULL,
  `last_login` datetime DEFAULT NULL,
  `ts` datetime DEFAULT NULL,
  `reg_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;




CREATE TABLE `business` (
  `id` varchar(32) NOT NULL,
  `address` varchar(100) DEFAULT NULL,
  `birthday` datetime DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `del` int(3) NOT NULL,
  `is_support_intergral` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `nickname` varchar(45) DEFAULT NULL,
  `passwd` varchar(100) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `photoaddress` longtext,
  `pubkey` varchar(40) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `sex` int(3) NOT NULL,
  `shop_address` varchar(100) DEFAULT NULL,
  `shop_name` varchar(45) DEFAULT NULL,
  `ts` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `customer`;

CREATE TABLE `customer` (
  `id` varchar(32) NOT NULL,
  `address` varchar(100) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `del` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `nickname` varchar(45) DEFAULT NULL,
  `passwd` varchar(100) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `photoaddress` longtext,
  `pubkey` varchar(40) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `sex` int(11) NOT NULL,
  `ts` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;