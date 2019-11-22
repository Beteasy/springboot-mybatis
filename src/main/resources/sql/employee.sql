 CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dId` int(11) NOT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `gender` char(1) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB CHARSET=utf8 ;

 insert into employee(dId,last_name,gender,email) values ("1","lucy","1","66@ali.com");
 insert into employee(dId,last_name,gender,email) values ("2","lily","1","77@ali.com");
 insert into employee(dId,last_name,gender,email) values ("3","lilei","0","88@ali.com");