
/*Create Database*/

DROP DATABASE IF EXISTS jdbcLearning;

CREATE DATABASE jdbcLearning;

USE jdbcLearning;

/*Create Table*/

DROP TABLE IF EXISTS `emp`;

CREATE TABLE `emp` (
  `id` int(11) NOT NULL,
  `name` varchar(200) DEFAULT NULL,
  `city` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


/*Insert Records into table*/

INSERT INTO `emp` VALUES (10,'Bunny',NULL),(190,'abhi','ABC'),(191,'umesh','PQR');

/* Select All Records*/

SELECT * FROM emp;

/* Create Procedure */

DELIMITER $$

DROP PROCEDURE IF EXISTS insertR$$

CREATE PROCEDURE insertR(IN id int,IN name varchar(200))
BEGIN
INSERT INTO emp(id,name) VALUES(id,name);
END$$  

DELIMITER ;


