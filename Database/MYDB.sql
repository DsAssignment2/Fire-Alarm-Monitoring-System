-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: firealarmsystemdb
-- ------------------------------------------------------
-- Server version	8.0.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Dumping data for table `registeredusers`
--

LOCK TABLES `registeredusers` WRITE;
/*!40000 ALTER TABLE `registeredusers` DISABLE KEYS */;
INSERT INTO `registeredusers` VALUES (1,'Admin','Perera','admin','adminPerera@gmail.com','21232f297a57a5a743894a0e4a801fc3',1),(2,'User','Silva','user','userSilva@gmail.com','ee11cbb19052e40b07aac0ca060c23ee',0),(3,'Kamani','R','user','userSilva@gmail.com','ee11cbb19052e40b07aac0ca060c23ee',0);
/*!40000 ALTER TABLE `registeredusers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `sensor`
--

LOCK TABLES `sensor` WRITE;
/*!40000 ALTER TABLE `sensor` DISABLE KEYS */;
INSERT INTO `sensor` VALUES (1,4,6,1,'F1','F101'),(2,7,5,1,'F2','F202'),(3,1,1,1,'F1','F103'),(4,10,1,0,'F3','F304'),(5,5,10,0,'F1','F102'),(6,1,9,1,'F1','F104'),(7,5,8,1,'F2','F201'),(8,1,6,0,'F4','F403'),(9,1,10,0,'F3','F301'),(10,9,7,1,'F2','F204'),(11,8,7,1,'F4','F404'),(12,8,6,1,'F2','F206');
/*!40000 ALTER TABLE `sensor` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-05-06 23:52:55
