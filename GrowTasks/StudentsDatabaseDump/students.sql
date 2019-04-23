-- MySQL dump 10.16  Distrib 10.1.38-MariaDB, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: Students
-- ------------------------------------------------------
-- Server version	10.1.38-MariaDB-0ubuntu0.18.04.1

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
-- Table structure for table `address`
--

DROP TABLE IF EXISTS `address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `address` (
  `ID` int(11) DEFAULT NULL,
  `Address` varchar(20) DEFAULT NULL,
  `Country` varchar(50) DEFAULT NULL,
  `City` varchar(50) DEFAULT NULL,
  `Street` varchar(50) DEFAULT NULL,
  `№` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address`
--

LOCK TABLES `address` WRITE;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
INSERT INTO `address` VALUES (1,'Home','USA','Washington','Linkoln St.',4),(1,'University','USA','Washington','Linkoln St.',10),(2,'Home','Ukraine','Lviv','Hetmana Mazepy St.',7),(2,'University','Ukraine','Lviv','Stepana Bandery St.',16),(4,'Home','Great Britain','London','Green St.',15),(4,'University','Great Britain','London','Tavistock St.',20),(5,'Home','Ukraine','Kyiv','Random St.',55),(3,'Home','Ukraine','Lviv','Hetmana Mazepy St.',12),(3,'University','Ukraine','Lviv','Stepana Bandery St.',16),(5,'University','Ukraine','Lviv','Stepana Bandery St.',16),(6,'Home','USA','New York','Varick St.',73),(6,'University','USA','New York','Chambers St.',199);
/*!40000 ALTER TABLE `address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `students`
--

DROP TABLE IF EXISTS `students`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `students` (
  `ID` int(11) NOT NULL,
  `FirstName` varchar(50) DEFAULT NULL,
  `LastName` varchar(50) DEFAULT NULL,
  `Address` varchar(20) DEFAULT NULL,
  `Country` varchar(50) DEFAULT NULL,
  `City` varchar(50) DEFAULT NULL,
  `Street` varchar(50) DEFAULT NULL,
  `HomeNumber` int(11)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `students`
--

LOCK TABLES `students` WRITE;
/*!40000 ALTER TABLE `students` DISABLE KEYS */;
INSERT INTO `students` VALUES (1,'Igor','Pystovit','Home','USA','Washington','Linkoln St.',4),(1,'Igor','Pystovit','University','USA','Washington','Linkoln St.',10),(2,'Elliot','Smith','Home','Ukraine','Lviv','Hetmana Mazepy St.',7),(2,'Elliot','Smith','University','Ukraine','Lviv','Stepana Bandery St.',16),(4,'David','Letty','Home','Great Britain','London','Green St.',15),(4,'David','Letty','University','Great Britain','London','Tavistock St.',20),(5,'Peter','Lee','Home','Ukraine','Kyiv','Random St.',55),(3,'Mark','Travolta','Home','Ukraine','Lviv','Hetmana Mazepy St.',12),(3,'Mark','Travolta','University','Ukraine','Lviv','Stepana Bandery St.',16),(5,'Peter','Lee','University','Ukraine','Lviv','Stepana Bandery St.',16),(6,'Haley','Martinez','Home','USA','New York','Varick St.',73),(6,'Haley','Martinez','University','USA','New York','Chambers St.',199);
/*!40000 ALTER TABLE `students` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `studentsData`
--

DROP TABLE IF EXISTS `studentsData`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `studentsData` (
  `ID` int(11) DEFAULT NULL,
  `FirstName` varchar(50) DEFAULT NULL,
  `LastName` varchar(50) DEFAULT NULL,
  `StudentAge` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `studentsData`
--

LOCK TABLES `studentsData` WRITE;
/*!40000 ALTER TABLE `studentsData` DISABLE KEYS */;
INSERT INTO `studentsData` VALUES (1,'Igor','Pystovit',18),(2,'Elliot','Smith',27),(3,'Mark','Travolta',22),(4,'David','Letty',19),(5,'Peter','Lee',23),(6,'Haley','Martinez',19);
/*!40000 ALTER TABLE `studentsData` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-04-23 20:14:08
