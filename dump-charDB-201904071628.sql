-- MySQL dump 10.17  Distrib 10.3.14-MariaDB, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: charDB
-- ------------------------------------------------------
-- Server version	10.3.14-MariaDB-1:10.3.14+maria~bionic

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `DevSalary`
--

DROP TABLE IF EXISTS `DevSalary`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `DevSalary` (
  `devID` int(11) DEFAULT NULL,
  `Salary` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `DevSalary`
--

LOCK TABLES `DevSalary` WRITE;
/*!40000 ALTER TABLE `DevSalary` DISABLE KEYS */;
INSERT INTO `DevSalary` VALUES (1,15000),(2,20000),(3,10000),(1,15000),(2,20000),(3,10000);
/*!40000 ALTER TABLE `DevSalary` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Developers`
--

DROP TABLE IF EXISTS `Developers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Developers` (
  `devID` int(11) DEFAULT NULL,
  `FirstName` varchar(50) DEFAULT NULL,
  `LastName` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Developers`
--

LOCK TABLES `Developers` WRITE;
/*!40000 ALTER TABLE `Developers` DISABLE KEYS */;
INSERT INTO `Developers` VALUES (1,'Igor','Pystovit'),(2,'Mike','Rot'),(3,'George','Novel');
/*!40000 ALTER TABLE `Developers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `PlaylistTrack`
--

DROP TABLE IF EXISTS `PlaylistTrack`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `PlaylistTrack` (
  `PlaylistId` int(11) NOT NULL,
  `TrackId` int(11) NOT NULL,
  PRIMARY KEY (`PlaylistId`,`TrackId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PlaylistTrack`
--

LOCK TABLES `PlaylistTrack` WRITE;
/*!40000 ALTER TABLE `PlaylistTrack` DISABLE KEYS */;
/*!40000 ALTER TABLE `PlaylistTrack` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `myfirsttable`
--

DROP TABLE IF EXISTS `myfirsttable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `myfirsttable` (
  `rollNumber` int(11) DEFAULT NULL,
  `charName` varchar(50) DEFAULT NULL,
  `charRoleDes` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `myfirsttable`
--

LOCK TABLES `myfirsttable` WRITE;
/*!40000 ALTER TABLE `myfirsttable` DISABLE KEYS */;
INSERT INTO `myfirsttable` VALUES (1,'Destructor','Turn everything to dust');
/*!40000 ALTER TABLE `myfirsttable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `myfirsttable3`
--

DROP TABLE IF EXISTS `myfirsttable3`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `myfirsttable3` (
  `rollNumber` int(11) DEFAULT NULL,
  `charName` varchar(50) DEFAULT NULL,
  `charRoleDes` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `myfirsttable3`
--

LOCK TABLES `myfirsttable3` WRITE;
/*!40000 ALTER TABLE `myfirsttable3` DISABLE KEYS */;
INSERT INTO `myfirsttable3` VALUES (1,'Destructor','Turn everything to dust');
/*!40000 ALTER TABLE `myfirsttable3` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'charDB'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-04-07 16:28:23
