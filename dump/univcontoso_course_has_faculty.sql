CREATE DATABASE  IF NOT EXISTS `univcontoso` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `univcontoso`;
-- MySQL dump 10.13  Distrib 5.6.24, for Win32 (x86)
--
-- Host: 127.0.0.1    Database: univcontoso
-- ------------------------------------------------------
-- Server version	5.6.26

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
-- Table structure for table `course_has_faculty`
--

DROP TABLE IF EXISTS `course_has_faculty`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `course_has_faculty` (
  `Course_CourseId` int(11) NOT NULL,
  `Faculty_FacultyId` int(11) NOT NULL,
  PRIMARY KEY (`Course_CourseId`,`Faculty_FacultyId`),
  KEY `fk_Course_has_Faculty_Faculty1_idx` (`Faculty_FacultyId`),
  KEY `fk_Course_has_Faculty_Course_idx` (`Course_CourseId`),
  CONSTRAINT `fk_Course_has_Faculty_Course` FOREIGN KEY (`Course_CourseId`) REFERENCES `course` (`CourseId`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_Course_has_Faculty_Faculty1` FOREIGN KEY (`Faculty_FacultyId`) REFERENCES `faculty` (`FacultyId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course_has_faculty`
--

LOCK TABLES `course_has_faculty` WRITE;
/*!40000 ALTER TABLE `course_has_faculty` DISABLE KEYS */;
INSERT INTO `course_has_faculty` VALUES (19,14),(20,14),(21,14),(22,15),(23,15),(24,15),(25,16),(26,16),(27,16),(28,17),(29,17),(30,17),(16,19),(17,19),(18,19);
/*!40000 ALTER TABLE `course_has_faculty` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-10-16 16:09:30
