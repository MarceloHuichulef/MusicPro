-- MySQL dump 10.13  Distrib 8.0.32, for macos13 (x86_64)
--
-- Host: 35.193.123.52    Database: productos
-- ------------------------------------------------------
-- Server version	8.0.26-google

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
SET @MYSQLDUMP_TEMP_LOG_BIN = @@SESSION.SQL_LOG_BIN;
SET @@SESSION.SQL_LOG_BIN= 0;

--
-- GTID state at the beginning of the backup 
--

SET @@GLOBAL.GTID_PURGED=/*!80000 '+'*/ 'baafdc8b-0e04-11ee-8fbf-42010a400003:1-725';

--
-- Table structure for table `instrumento`
--

DROP TABLE IF EXISTS `instrumento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `instrumento` (
  `id_instrumento` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `marca` varchar(45) DEFAULT NULL,
  `id_categoria` int DEFAULT NULL,
  `id_subcategoria` int DEFAULT NULL,
  PRIMARY KEY (`id_instrumento`),
  KEY `id_categoria` (`id_categoria`),
  KEY `id_subcategoria` (`id_subcategoria`),
  CONSTRAINT `instrumento_ibfk_1` FOREIGN KEY (`id_categoria`) REFERENCES `categoria` (`id`),
  CONSTRAINT `instrumento_ibfk_2` FOREIGN KEY (`id_subcategoria`) REFERENCES `subcategoria` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `instrumento`
--

LOCK TABLES `instrumento` WRITE;
/*!40000 ALTER TABLE `instrumento` DISABLE KEYS */;
INSERT INTO `instrumento` VALUES (1,'Guitarra de Cuerpo Solido','Yamaha',1,1),(2,'Guitarra Acústica','Gibson',1,1),(3,'Guitarra Eléctrica','Gibson',1,1),(4,'Bajo de Cuatro Cuerdas','Yamaha',1,2),(5,'Bajo de Cinco Cuerdas','Jackson',1,2),(6,'Bajo Activo','Subwoofer',1,2),(7,'Bajo Pasivo','Yamaha',1,2),(8,'Piano de media cola','Bechstein',1,3),(9,'Piano de cola entera','Yamaha',1,3),(10,'Pianolas','Yamaha',1,3),(11,'Batería Acústica Roja','Tama',2,4),(12,'Batería Acústica Verde','Pearl',2,4),(13,'Batería Acústica Azul','Sonor',2,4),(14,'Batería Acústica Negra','Mapex',2,4),(15,'Batería Electrónica Roja','Ronald',2,5),(16,'Batería Electrónica Negra','Alesis',2,5),(17,'Cabezal Nvk 8500bt','ENGL',3,6),(18,'Cabezal 4300BT NEO','Marshall',3,6),(19,'Cabezal Tube Logic 100W','Pavey',3,6),(20,'Cabezal AM300P 2X 8\" 100w','EVH',3,6),(21,'Caja Powerball E645 100 vatios','ENGL',3,7),(22,'Caja Mg 412 Acf','Marshall',3,7),(23,'Caja Pasiva Peavey Modelo Pv-215 Smallbox','Peavey',3,7),(24,'Caja 5150III 2X12 Gabinete, Ivory','EVH',3,7),(25,'Audifonos','JBL',4,8),(26,'Monitores','Acer',4,8),(27,'Parlantes','JBL',4,8),(28,'Cables','XLR',4,8),(29,'Micrófonos','Shure',4,8),(30,'Interfaces','ESI U22 XT',4,8),(31,'Mixers','Peavey',4,8);
/*!40000 ALTER TABLE `instrumento` ENABLE KEYS */;
UNLOCK TABLES;
SET @@SESSION.SQL_LOG_BIN = @MYSQLDUMP_TEMP_LOG_BIN;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-06-18 15:16:43
