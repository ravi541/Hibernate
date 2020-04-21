-- MySQL dump 10.10
--
-- Host: localhost    Database: college_project
-- ------------------------------------------------------
-- Server version	5.0.22-community-nt

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `college`
--

DROP TABLE IF EXISTS `college`;
CREATE TABLE `college` (
  `id` int(1) NOT NULL auto_increment,
  `name` varchar(50) NOT NULL,
  `address` varchar(200) default NULL,
  `state` varchar(45) default NULL,
  `city` varchar(45) default NULL,
  `phone` varchar(45) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `college`
--


/*!40000 ALTER TABLE `college` DISABLE KEYS */;
LOCK TABLES `college` WRITE;
INSERT INTO `college` VALUES (1,'University of Manchester',' Oxford Rd, Manchester M13 9PL, UK','Manchester','Manchester','+44 161 306 6000'),(2,'University of Nottingham','Nottingham NG7 2RD, UK','Nottingham','Nottingham','+44 115 951 5151'),(4,'Birmingham City University','The Parkside Building, 5 Cardigan St, Birmingham B4 7BD, UK','Birmingham','Birmingham','+44 121 331 50000'),(6,'University of Cambridge','The Old Schools, Trinity Ln, Cambridge CB2 1TN, UK','Cambridge','Cambridge','+44 1223 337733'),(7,'University of Edinburgh','Old College, South Bridge, Edinburgh EH8 9YL, UK','Edinburgh, Scotland','Edinburgh','+44 131 650 1000'),(8,'Durham University','Durham, UK','Durham','Durham','+44 191 334 2000'),(9,'University of Glasgow','University Avenue, Glasgow G12 8QQ, UK','Glasgow, Scotland','Glasgow','+44 141 330 2000'),(10,'University of Sussex','Falmer, Brighton BN1 9RH, UK','Brighton, England','Brighton','+44 1273 606755'),(11,'Warrington','Hendricks','Claifornia','Los Angeles','1234567890');
UNLOCK TABLES;
/*!40000 ALTER TABLE `college` ENABLE KEYS */;

--
-- Table structure for table `marksheet`
--

DROP TABLE IF EXISTS `marksheet`;
CREATE TABLE `marksheet` (
  `id` int(1) NOT NULL auto_increment,
  `rollno` varchar(30) NOT NULL,
  `studentId` int(11) NOT NULL,
  `name` varchar(60) default NULL,
  `physics` int(11) default NULL,
  `chemistry` int(11) default NULL,
  `maths` int(11) default NULL,
  PRIMARY KEY  (`id`),
  KEY `studentId_fk_idx` (`studentId`),
  CONSTRAINT `studentId_fk` FOREIGN KEY (`studentId`) REFERENCES `student` (`studentId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `marksheet`
--


/*!40000 ALTER TABLE `marksheet` DISABLE KEYS */;
LOCK TABLES `marksheet` WRITE;
INSERT INTO `marksheet` VALUES (1,'1000A1',4,'Donald',77,81,93),(2,'1000A2',5,'Melenia',56,58,53),(3,'1000B1',13,'Barak',88,94,96);
UNLOCK TABLES;
/*!40000 ALTER TABLE `marksheet` ENABLE KEYS */;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` int(11) NOT NULL default '1',
  `description` varchar(45) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `role`
--


/*!40000 ALTER TABLE `role` DISABLE KEYS */;
LOCK TABLES `role` WRITE;
INSERT INTO `role` VALUES (1,'ROLE_ADMIN'),(3,'ROLE_STUDENT'),(5,'ROLE_COLLEGE');
UNLOCK TABLES;
/*!40000 ALTER TABLE `role` ENABLE KEYS */;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `studentId` int(1) NOT NULL auto_increment,
  `firstName` varchar(45) NOT NULL,
  `lastName` varchar(45) NOT NULL,
  `dob` datetime default NULL,
  `mobile` varchar(45) default NULL,
  `email` varchar(45) default NULL,
  `collegeId` int(11) NOT NULL,
  `collegeName` varchar(45) NOT NULL default 'Identified By College Id',
  PRIMARY KEY  (`studentId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--


/*!40000 ALTER TABLE `student` DISABLE KEYS */;
LOCK TABLES `student` WRITE;
INSERT INTO `student` VALUES (4,'Donald','Trump','2020-01-17 00:00:00','65677','donald@trumptowers.com',4,'Identified By College Id'),(5,'Melenia','Trump','2020-01-17 00:00:00','76575','melenia@trumptowers.com',2,'Identified By College Id'),(13,'Barak','Obama','2020-01-17 00:00:00','6575757','barak@whitehouse.com',7,'Identified By College Id'),(14,'Zack','Effron','2020-01-17 00:00:00','57657','zack@effron.com',2,'Identified By College Id'),(15,'Anne Marie','Morris','2020-01-17 00:00:00','+44 7911 123451','anne@morris.com',2,'Identified By College Id'),(16,'Kelvin','Hopkins','2020-01-17 00:00:00','+44 7900 123426','kevin@hopkins.com',2,'Identified By College Id'),(17,'Ivan','Lewis','2020-01-17 00:00:00','+44 7911 123433','ivan@lewis.com',2,'Identified By College Id'),(18,'Jeremy','Corbyn','2020-01-17 00:00:00','+44 7911 103686','jeremy@corbyn.com',4,'Identified By College Id'),(19,'Theresa','May','2020-01-17 00:00:00','+44 7911 126390','theresa@may.com',4,'Identified By College Id'),(20,'Boris','Johnson','2020-01-17 00:00:00','+44 7911 124328','boris@johnson.com',4,'Identified By College Id'),(21,'David','Cameron','2020-01-17 00:00:00','+44 7911 120968','david@cameron.com',4,'Identified By College Id');
UNLOCK TABLES;
/*!40000 ALTER TABLE `student` ENABLE KEYS */;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userId` int(11) NOT NULL auto_increment,
  `firstName` varchar(45) default NULL,
  `lastName` varchar(45) default NULL,
  `login` varchar(45) default NULL,
  `password` varchar(45) default NULL,
  `confirmPassword` varchar(45) default NULL,
  `dob` date default NULL,
  `mobile` varchar(45) default NULL,
  `roleId` int(1) NOT NULL default '2',
  `gender` varchar(45) default NULL,
  `lock` int(1) default '1',
  PRIMARY KEY  (`userId`),
  UNIQUE KEY `userId_UNIQUE` (`userId`),
  UNIQUE KEY `login_UNIQUE` (`login`),
  KEY `fk_roleid_idx` (`roleId`),
  CONSTRAINT `fk_roleId` FOREIGN KEY (`roleId`) REFERENCES `role` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--


/*!40000 ALTER TABLE `user` DISABLE KEYS */;
LOCK TABLES `user` WRITE;
INSERT INTO `user` VALUES (2,'Gaurav','Pathak','gaurav','gaurav','gaurav','2020-01-17','123',1,'M',1),(3,'Bill','Gates','bill','bill','bill','2020-01-17','2345',3,'M',1),(7,'Elon','Musk','elon','elon','elon','2020-01-17','65666',3,'M',1),(8,'Donald','Trump','donald','donald','donald','2020-01-17','76575',3,'M',1),(10,'University of Nottingham','N/A','nottingham','nottingham','nottingham','2020-01-17','+44 121 331 50000',5,'N/A',1),(12,'Birmingham City University','N/A','birmingham','birmingham','birmingham','2020-01-17','55555',5,'N/A',1),(17,'University of Edinburgh','N/A','edinburgh','edinburgh','edinburgh','2020-01-17','+44 131 650 1000',5,'N/A',1);
UNLOCK TABLES;
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

