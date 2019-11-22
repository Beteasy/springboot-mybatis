 CREATE TABLE `department` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `department_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB CHARSET=utf8 ;
 insert into department(department_name) values ("开发部");
 insert into department(department_name) values ("测试部");
 insert into department(department_name) values ("运维部");