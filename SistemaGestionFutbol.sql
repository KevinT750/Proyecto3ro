CREATE DATABASE  IF NOT EXISTS `bddescuelafutbol1` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `bddescuelafutbol1`;
-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: bddescuelafutbol1
-- ------------------------------------------------------
-- Server version	8.0.36

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
-- Table structure for table `categoria`
--

DROP TABLE IF EXISTS `categoria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categoria` (
  `ID_CATEGORIA` int NOT NULL AUTO_INCREMENT,
  `NOMBRE` varchar(50) NOT NULL,
  PRIMARY KEY (`ID_CATEGORIA`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categoria`
--

LOCK TABLES `categoria` WRITE;
/*!40000 ALTER TABLE `categoria` DISABLE KEYS */;
INSERT INTO `categoria` VALUES (1,'Prebenjamines'),(2,'Benjamines'),(3,'Alevines'),(4,'Infantiles'),(5,'Cadetes'),(6,'Juveniles');
/*!40000 ALTER TABLE `categoria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `entrenadores`
--

DROP TABLE IF EXISTS `entrenadores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `entrenadores` (
  `ID_ENTRENADOR` int NOT NULL AUTO_INCREMENT,
  `CedulaEntrenador` varchar(10) NOT NULL,
  `NOMBREENT` varchar(50) NOT NULL,
  `APELLIDOENT` varchar(50) NOT NULL,
  `TELEFONO` varchar(50) NOT NULL,
  `Usuario` varchar(45) DEFAULT NULL,
  `Contrasenia` varchar(45) DEFAULT NULL,
  `Rol` enum('usuario','administrador') NOT NULL DEFAULT 'usuario',
  PRIMARY KEY (`ID_ENTRENADOR`),
  UNIQUE KEY `CedulaEntrenador_UNIQUE` (`CedulaEntrenador`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `entrenadores`
--

LOCK TABLES `entrenadores` WRITE;
/*!40000 ALTER TABLE `entrenadores` DISABLE KEYS */;
INSERT INTO `entrenadores` VALUES (1,'1755709605','Kevin','Teran','0998035014','Kevin750','1234','administrador');
/*!40000 ALTER TABLE `entrenadores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estudiante`
--

DROP TABLE IF EXISTS `estudiante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estudiante` (
  `IDEstudiante` int NOT NULL AUTO_INCREMENT,
  `CI_ESTUDIANTE` varchar(10) NOT NULL,
  `NOMBRES` varchar(50) NOT NULL,
  `APELLIDOS` varchar(50) NOT NULL,
  `FECHA_NACIMIENTO` date NOT NULL,
  `TELEFONO` varchar(10) NOT NULL,
  `PROVINCIA` varchar(50) NOT NULL,
  `CIUDAD` varchar(50) NOT NULL,
  `CORREO` varchar(50) NOT NULL,
  `EDAD` int NOT NULL,
  `Posicion` varchar(45) NOT NULL,
  `SubPosicion` varchar(45) NOT NULL,
  `NACIONALIDAD` varchar(20) NOT NULL,
  `PESO` decimal(5,2) NOT NULL,
  `ESTATURA` decimal(5,2) NOT NULL,
  `ID_CATEGORIA` int DEFAULT NULL,
  `ID_REPRESENTANTE` int DEFAULT NULL,
  PRIMARY KEY (`IDEstudiante`),
  UNIQUE KEY `CI_ESTUDIANTE_UNIQUE` (`CI_ESTUDIANTE`),
  KEY `fk_categoria` (`ID_CATEGORIA`),
  KEY `fk_representante_estudiante` (`ID_REPRESENTANTE`),
  CONSTRAINT `fk_categoria` FOREIGN KEY (`ID_CATEGORIA`) REFERENCES `categoria` (`ID_CATEGORIA`),
  CONSTRAINT `fk_representante_estudiante` FOREIGN KEY (`ID_REPRESENTANTE`) REFERENCES `representante` (`IDRepresentante`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estudiante`
--

LOCK TABLES `estudiante` WRITE;
/*!40000 ALTER TABLE `estudiante` DISABLE KEYS */;
INSERT INTO `estudiante` VALUES (1,'1755009605','Kevin','Teran','2010-07-02','0998035014','Azuay','Camilo Ponce Enríquez','Kevinteran750@gmail.com',13,'Portero','Ninguno','Argentina',70.00,1.50,4,1);
/*!40000 ALTER TABLE `estudiante` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pagos`
--

DROP TABLE IF EXISTS `pagos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pagos` (
  `ID_PAGOS` int NOT NULL AUTO_INCREMENT,
  `CI_ESTUDIANTE` varchar(10) NOT NULL,
  `FECHA_PAGO` date NOT NULL,
  `Estado` enum('Pagado','Debe') NOT NULL,
  `Monto` decimal(10,2) NOT NULL,
  PRIMARY KEY (`ID_PAGOS`),
  KEY `fk_ci_estudiante` (`CI_ESTUDIANTE`),
  CONSTRAINT `fk_ci_estudiante` FOREIGN KEY (`CI_ESTUDIANTE`) REFERENCES `estudiante` (`CI_ESTUDIANTE`),
  CONSTRAINT `pagos_chk_1` CHECK ((`Estado` in (_utf8mb4'Debe',_utf8mb4'Pagado')))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pagos`
--

LOCK TABLES `pagos` WRITE;
/*!40000 ALTER TABLE `pagos` DISABLE KEYS */;
/*!40000 ALTER TABLE `pagos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `representante`
--

DROP TABLE IF EXISTS `representante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `representante` (
  `IDRepresentante` int NOT NULL AUTO_INCREMENT,
  `CI_REPRESENTANTE` varchar(10) NOT NULL,
  `NOMBRE_REP` varchar(50) NOT NULL,
  `APELLIDO_REP` varchar(50) NOT NULL,
  `TELEFONO` varchar(10) NOT NULL,
  PRIMARY KEY (`IDRepresentante`),
  UNIQUE KEY `CI_REPRESENTANTE_UNIQUE` (`CI_REPRESENTANTE`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `representante`
--

LOCK TABLES `representante` WRITE;
/*!40000 ALTER TABLE `representante` DISABLE KEYS */;
INSERT INTO `representante` VALUES (1,'1002538146','Ivan','Teran','0998555147');
/*!40000 ALTER TABLE `representante` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'bddescuelafutbol1'
--

--
-- Dumping routines for database 'bddescuelafutbol1'
--
/*!50003 DROP FUNCTION IF EXISTS `AsignarCategoriaEstudiante` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` FUNCTION `AsignarCategoriaEstudiante`(edad_estudiante INT) RETURNS int
    DETERMINISTIC
BEGIN
    DECLARE categoria_id INT;

    IF edad_estudiante BETWEEN 5 AND 7 THEN
        SET categoria_id = 1; -- Prebenjamines
    ELSEIF edad_estudiante BETWEEN 8 AND 9 THEN
        SET categoria_id = 2; -- Benjamines
    ELSEIF edad_estudiante BETWEEN 10 AND 11 THEN
        SET categoria_id = 3; -- Alevines
    ELSEIF edad_estudiante BETWEEN 12 AND 13 THEN
        SET categoria_id = 4; -- Infantiles
    ELSEIF edad_estudiante BETWEEN 14 AND 15 THEN
        SET categoria_id = 5; -- Cadetes
    ELSEIF edad_estudiante BETWEEN 16 AND 18 THEN
        SET categoria_id = 6; -- Juveniles
    ELSE
        SET categoria_id = NULL; -- No se encontró una categoría adecuada
    END IF;

    RETURN categoria_id;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP FUNCTION IF EXISTS `ObtenerUltimoRepresentante` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` FUNCTION `ObtenerUltimoRepresentante`() RETURNS int
    DETERMINISTIC
BEGIN
    DECLARE last_representante_id INT;
    
    SELECT IDRepresentante INTO last_representante_id
    FROM representante
    ORDER BY IDRepresentante DESC
    LIMIT 1;
    
    RETURN last_representante_id;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `AgregarEstudiante` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `AgregarEstudiante`(
    IN ci_estudiante VARCHAR(10),
    IN nombres VARCHAR(50),
    IN apellidos VARCHAR(50),
    IN fecha_nacimiento DATE,
    IN telefono VARCHAR(10),
    IN provincia VARCHAR(50),
    IN ciudad VARCHAR(50),
    IN correo VARCHAR(50),
    IN edad INT,
    IN posicion VARCHAR(45),
    IN subposicion VARCHAR(45),
    IN nacionalidad VARCHAR(20),
    IN peso DECIMAL(5,2),
    IN estatura DECIMAL(5,2)
)
BEGIN
    DECLARE last_representante_id INT;
    DECLARE categoria_id INT;

    -- Obtener el ID del último representante
    SET last_representante_id = ObtenerUltimoRepresentante();

    -- Obtener el ID de la categoría según la edad
    SET categoria_id = AsignarCategoriaEstudiante(edad);

    -- Insertar el estudiante utilizando el último representante y la categoría asignada
    INSERT INTO estudiante (CI_ESTUDIANTE, NOMBRES, APELLIDOS, FECHA_NACIMIENTO, TELEFONO, PROVINCIA, CIUDAD, CORREO, EDAD, Posicion, SubPosicion, NACIONALIDAD, PESO, ESTATURA, ID_CATEGORIA, ID_REPRESENTANTE)
    VALUES (ci_estudiante, nombres, apellidos, fecha_nacimiento, telefono, provincia, ciudad, correo, edad, posicion, subposicion, nacionalidad, peso, estatura, categoria_id, last_representante_id);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `InsertarRepresentante` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `InsertarRepresentante`(
    IN ci_representante VARCHAR(10),
    IN nombre_rep VARCHAR(50),
    IN apellido_rep VARCHAR(50),
    IN telefono VARCHAR(10)
)
BEGIN
    INSERT INTO representante (CI_REPRESENTANTE, NOMBRE_REP, APELLIDO_REP, TELEFONO)
    VALUES (ci_representante, nombre_rep, apellido_rep, telefono);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-02-08 20:23:44
