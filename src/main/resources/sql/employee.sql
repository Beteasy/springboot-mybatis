 CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dId` int(11) NOT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `gender` char(1) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB CHARSET=utf8 ;