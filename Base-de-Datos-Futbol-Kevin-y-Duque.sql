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
  `Rol` enum('USUARIO','ADMINISTRADOR') NOT NULL DEFAULT 'USUARIO',
  PRIMARY KEY (`ID_ENTRENADOR`),
  UNIQUE KEY `CedulaEntrenador_UNIQUE` (`CedulaEntrenador`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `entrenadores`
--

LOCK TABLES `entrenadores` WRITE;
/*!40000 ALTER TABLE `entrenadores` DISABLE KEYS */;
INSERT INTO `entrenadores` VALUES (1,'1755709605','Kevin','Teran','0998035014','Kevin750','1234','ADMINISTRADOR'),(2,'1002538146','Kevin','Teran','0998035014','Usuario','1234','USUARIO'),(4,'1002530147','Steveen','Meneses','0998015041','Admin','1234','ADMINISTRADOR'),(5,'1003621041','Juan','Guzman','0998034157','Juan123','Admin123','ADMINISTRADOR'),(6,'1002538147','Jose','Delgado','0998035014','','','USUARIO'),(7,'1760315992','Brayan','Duque','0963266659','Belial','123','ADMINISTRADOR');
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
  `PESO` double NOT NULL,
  `ESTATURA` double NOT NULL,
  `ID_CATEGORIA` int DEFAULT NULL,
  `ID_REPRESENTANTE` int DEFAULT NULL,
  PRIMARY KEY (`IDEstudiante`),
  UNIQUE KEY `CI_ESTUDIANTE_UNIQUE` (`CI_ESTUDIANTE`),
  KEY `fk_categoria` (`ID_CATEGORIA`),
  KEY `fk_representante_estudiante` (`ID_REPRESENTANTE`),
  CONSTRAINT `fk_categoria` FOREIGN KEY (`ID_CATEGORIA`) REFERENCES `categoria` (`ID_CATEGORIA`),
  CONSTRAINT `fk_representante_estudiante` FOREIGN KEY (`ID_REPRESENTANTE`) REFERENCES `representante` (`IDRepresentante`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estudiante`
--

LOCK TABLES `estudiante` WRITE;
/*!40000 ALTER TABLE `estudiante` DISABLE KEYS */;
INSERT INTO `estudiante` VALUES (23,'1234567890','Juan','Pérez','2016-05-15','1234567890','Provincia1','Ciudad1','juan@example.com',8,'Posicion1','SubPosicion1','Ecuatoriana',30.5,1.6,1,NULL),(24,'2345678901','María','Gómez','2012-03-20','2345678901','Provincia2','Ciudad2','maria@example.com',10,'Posicion2','SubPosicion2','Ecuatoriana',35.2,1.65,2,NULL),(25,'3456789012','Luis','López','2010-09-10','3456789012','Provincia3','Ciudad3','luis@example.com',11,'Posicion3','SubPosicion3','Ecuatoriana',40,1.7,3,NULL),(26,'4567890123','Ana','Martínez','2008-07-05','4567890123','Provincia4','Ciudad4','ana@example.com',13,'Posicion4','SubPosicion4','Ecuatoriana',45.75,1.75,4,NULL),(27,'5678901234','Pedro','Rodríguez','2007-12-25','5678901234','Provincia5','Ciudad5','pedro@example.com',14,'Posicion5','SubPosicion5','Ecuatoriana',50.3,1.8,5,NULL),(28,'6789012345','Sofía','Hernández','2005-11-30','6789012345','Provincia6','Ciudad6','sofia@example.com',16,'Posicion6','SubPosicion6','Ecuatoriana',55,1.85,1,NULL),(29,'7890123456','Carlos','García','2004-08-12','7890123456','Provincia7','Ciudad7','carlos@example.com',17,'Posicion7','SubPosicion7','Ecuatoriana',60.5,1.9,2,NULL),(30,'8901234567','Laura','Fernández','2002-06-18','8901234567','Provincia8','Ciudad8','laura@example.com',18,'Posicion8','SubPosicion8','Ecuatoriana',65.75,1.95,6,NULL),(31,'9012345678','Miguel','López','2015-04-08','9012345678','Provincia9','Ciudad9','miguel@example.com',6,'Posicion9','SubPosicion9','Ecuatoriana',70,2,6,NULL),(32,'0123456789','Ana','Pérez','2013-02-14','0123456789','Provincia10','Ciudad10','ana2@example.com',9,'Posicion10','SubPosicion10','Ecuatoriana',75.25,2.05,1,NULL),(33,'1002631041','Brayan','Torres','2009-06-07','0998015064','Azuay','Camilo Ponce Enríquez','kevin@gmail.com',14,'Portero','Ninguno','Argentina',50,1.75,5,17);
/*!40000 ALTER TABLE `estudiante` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `InsertarPagoEstudiante` AFTER INSERT ON `estudiante` FOR EACH ROW BEGIN
    -- Insertar una nueva fila en la tabla pagos para el nuevo estudiante
    INSERT INTO pagos (CI_ESTUDIANTE, FECHA_PAGO, Estado, Monto)
    VALUES (NEW.CI_ESTUDIANTE, CURDATE(), 'Pagado', 0);
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `eliminar_pagos_despues_de_estudiante` BEFORE DELETE ON `estudiante` FOR EACH ROW BEGIN
    DELETE FROM pagos WHERE CI_ESTUDIANTE = OLD.CI_ESTUDIANTE;
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `pagos`
--

DROP TABLE IF EXISTS `pagos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pagos` (
  `ID_PAGOS` int NOT NULL AUTO_INCREMENT,
  `CI_ESTUDIANTE` varchar(10) NOT NULL,
  `FECHA_PAGO` date DEFAULT NULL,
  `Estado` enum('Pagado','Debe') NOT NULL,
  `Monto` decimal(10,2) NOT NULL,
  PRIMARY KEY (`ID_PAGOS`),
  KEY `fk_ci_estudiante` (`CI_ESTUDIANTE`),
  CONSTRAINT `fk_ci_estudiante` FOREIGN KEY (`CI_ESTUDIANTE`) REFERENCES `estudiante` (`CI_ESTUDIANTE`),
  CONSTRAINT `pagos_chk_1` CHECK ((`Estado` in (_utf8mb4'Debe',_utf8mb4'Pagado')))
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pagos`
--

LOCK TABLES `pagos` WRITE;
/*!40000 ALTER TABLE `pagos` DISABLE KEYS */;
INSERT INTO `pagos` VALUES (7,'1234567890','2024-02-19','Pagado',0.00),(8,'2345678901','2024-02-19','Pagado',0.00),(9,'3456789012','2024-02-19','Debe',10.00),(10,'4567890123','2024-02-19','Pagado',0.00),(11,'5678901234','2024-02-19','Debe',10.00),(12,'6789012345','2024-02-19','Pagado',0.00),(13,'7890123456','2024-02-19','Pagado',0.00),(14,'8901234567','2024-02-19','Debe',10.00),(15,'9012345678','2024-02-19','Pagado',0.00),(16,'0123456789','2024-02-19','Pagado',0.00),(17,'1002631041','2024-02-19','Pagado',0.00);
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
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `representante`
--

LOCK TABLES `representante` WRITE;
/*!40000 ALTER TABLE `representante` DISABLE KEYS */;
INSERT INTO `representante` VALUES (1,'1002538146','Ivan','Teran','0998555147'),(4,'1755709605','Jose','Sa','null'),(7,'1002417961','Ivan','Hi','null'),(9,'1002335014','Jose','Meneses','null'),(10,'1002335015','Jose','Meneses','null'),(11,'1000241530','Juan','Perez','null'),(12,'1000000218','Juan','Teran','0998035012'),(14,'1755709607','Jose','Torres','null'),(15,'1755709608','Jose','Torres','null'),(16,'1002301784','Dilan','Leon','null'),(17,'1003617486','Juan','Torres','null'),(18,'1002538149','Kevin','Teran','null');
/*!40000 ALTER TABLE `representante` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'bddescuelafutbol1'
--
/*!50106 SET @save_time_zone= @@TIME_ZONE */ ;
/*!50106 DROP EVENT IF EXISTS `CambiarEstadoPago` */;
DELIMITER ;;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;;
/*!50003 SET character_set_client  = utf8mb4 */ ;;
/*!50003 SET character_set_results = utf8mb4 */ ;;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;;
/*!50003 SET @saved_time_zone      = @@time_zone */ ;;
/*!50003 SET time_zone             = 'SYSTEM' */ ;;
/*!50106 CREATE*/ /*!50117 DEFINER=`root`@`localhost`*/ /*!50106 EVENT `CambiarEstadoPago` ON SCHEDULE EVERY 1 MONTH STARTS '2024-01-01 00:00:00' ON COMPLETION NOT PRESERVE ENABLE DO BEGIN
    UPDATE pagos
    SET Estado = 'Debe', FECHA_PAGO = NULL
    WHERE Estado = 'Pagado' AND DAYOFMONTH(NOW()) = 1;
END */ ;;
/*!50003 SET time_zone             = @saved_time_zone */ ;;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;;
/*!50003 SET character_set_client  = @saved_cs_client */ ;;
/*!50003 SET character_set_results = @saved_cs_results */ ;;
/*!50003 SET collation_connection  = @saved_col_connection */ ;;
DELIMITER ;
/*!50106 SET TIME_ZONE= @save_time_zone */ ;

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
/*!50003 DROP PROCEDURE IF EXISTS `ActualizarDatosEstudiante` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ActualizarDatosEstudiante`(
    IN cedula_estudiante VARCHAR(10),
    IN nuevos_nombres VARCHAR(50),
    IN nuevos_apellidos VARCHAR(50),
    IN nuevo_telefono VARCHAR(10),
    IN nuevo_correo VARCHAR(50),
    IN nueva_posicion VARCHAR(45),
    IN nueva_subposicion VARCHAR(45),
    IN nuevo_peso DECIMAL(5,2),
    IN nueva_estatura DECIMAL(5,2)
)
BEGIN
    UPDATE estudiante
    SET NOMBRES = nuevos_nombres,
        APELLIDOS = nuevos_apellidos,
        TELEFONO = nuevo_telefono,
        CORREO = nuevo_correo,
        Posicion = nueva_posicion,
        SubPosicion = nueva_subposicion,
        PESO = nuevo_peso,
        ESTATURA = nueva_estatura
    WHERE CI_ESTUDIANTE = cedula_estudiante;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `ActualizarPagos` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ActualizarPagos`()
BEGIN
    -- Primero, establecemos la nueva fecha al inicio del mes actual
    DECLARE nueva_fecha DATE;
    SET nueva_fecha = CURDATE() + INTERVAL 1 MONTH - INTERVAL DAY(CURDATE()) DAY;

    -- Luego, actualizamos el estado de los pagos
    UPDATE pagos SET Estado = 'Debe', FECHA_PAGO = NULL;

    -- Por último, actualizamos el monto sumando 10
    UPDATE pagos SET Monto = Monto + 10;

    -- Imprimimos un mensaje para verificar que se realizó la actualización correctamente
    SELECT 'Se han actualizado los pagos exitosamente.' AS Mensaje;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `actualizar_entrenador` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `actualizar_entrenador`(
    IN p_cedula VARCHAR(10),
    IN p_nombre VARCHAR(50),
    IN p_apellido VARCHAR(50),
    IN p_telefono VARCHAR(50),
    IN p_usuario VARCHAR(45),
    IN p_contrasenia VARCHAR(45),
    IN p_rol ENUM('usuario', 'administrador')
)
BEGIN
    UPDATE entrenadores
    SET NOMBREENT = p_nombre,
        APELLIDOENT = p_apellido,
        TELEFONO = p_telefono,
        Usuario = p_usuario,
        Contrasenia = p_contrasenia,
        Rol = p_rol
    WHERE CedulaEntrenador = p_cedula;
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

    -- Insertar el estudiante solo si la edad es menor o igual a 18 años
    IF edad <= 18 THEN
        INSERT INTO estudiante (CI_ESTUDIANTE, NOMBRES, APELLIDOS, FECHA_NACIMIENTO, TELEFONO, PROVINCIA, CIUDAD, CORREO, EDAD, Posicion, SubPosicion, NACIONALIDAD, PESO, ESTATURA, ID_CATEGORIA, ID_REPRESENTANTE)
        VALUES (ci_estudiante, nombres, apellidos, fecha_nacimiento, telefono, provincia, ciudad, correo, edad, posicion, subposicion, nacionalidad, peso, estatura, categoria_id, last_representante_id);
        SELECT 'Estudiante insertado exitosamente';
    ELSE
        SELECT 'El estudiante no cumple con la edad mínima requerida';
    END IF;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `BuscarPorCedula` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `BuscarPorCedula`(IN CI_ESTUDIANTE_PARAM VARCHAR(10))
BEGIN
    SELECT * FROM estudiante WHERE CI_ESTUDIANTE LIKE CONCAT('%', CI_ESTUDIANTE_PARAM, '%');
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `BuscarPorNombre` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `BuscarPorNombre`(IN NOMBRE VARCHAR(50))
BEGIN
    SELECT * FROM estudiante WHERE NOMBRES LIKE CONCAT('%', NOMBRE, '%');
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `InsertarEntrenador` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `InsertarEntrenador`(
    IN p_CedulaEntrenador VARCHAR(10),
    IN p_NOMBREENT VARCHAR(50),
    IN p_APELLIDOENT VARCHAR(50),
    IN p_TELEFONO VARCHAR(50),
    IN p_Usuario VARCHAR(45),
    IN p_Contrasenia VARCHAR(45),
    IN p_Rol ENUM('usuario', 'administrador')
)
BEGIN
    INSERT INTO entrenadores (CedulaEntrenador, NOMBREENT, APELLIDOENT, TELEFONO, Usuario, Contrasenia, Rol)
    VALUES (p_CedulaEntrenador, p_NOMBREENT, p_APELLIDOENT, p_TELEFONO, p_Usuario, p_Contrasenia, p_Rol);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `InsertarPago` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `InsertarPago`(
    IN CI_estudiante_param varchar(10),
    IN monto_param decimal(10,2)
)
BEGIN
    DECLARE monto_actual decimal(10,2);
    DECLARE estado_actual enum('Pagado','Debe');
    DECLARE fecha_actual date;

    -- Obtener el monto y el estado actual del estudiante
    SELECT Monto, Estado INTO monto_actual, estado_actual
    FROM pagos
    WHERE CI_ESTUDIANTE = CI_estudiante_param
    ORDER BY FECHA_PAGO DESC
    LIMIT 1;

    -- Restar el monto proporcionado con el monto actual en la base de datos
    SET monto_actual = monto_actual - monto_param;

    -- Obtener la fecha actual
    SET fecha_actual = CURDATE();

    -- Cambiar el estado a "Pagado" solo si el monto resultante es 0
    IF monto_actual <= 0 THEN
        SET estado_actual = 'Pagado';
    ELSE
        SET estado_actual = 'Debe';
    END IF;

    -- Actualizar el pago con los nuevos datos
    UPDATE pagos 
    SET FECHA_PAGO = fecha_actual, Estado = estado_actual, Monto = monto_actual
    WHERE CI_ESTUDIANTE = CI_estudiante_param;
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
/*!50003 DROP PROCEDURE IF EXISTS `MostrarEntrenadores` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `MostrarEntrenadores`()
BEGIN
    SELECT * FROM entrenadores;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `MostrarEntrenadoresPorCedula` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `MostrarEntrenadoresPorCedula`(IN p_cedula VARCHAR(10))
BEGIN
    SELECT * FROM entrenadores WHERE CedulaEntrenador LIKE CONCAT('%', p_cedula, '%');
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `MostrarEntrenadoresPorNombre` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `MostrarEntrenadoresPorNombre`(IN p_nombre VARCHAR(50))
BEGIN
    SELECT * FROM entrenadores WHERE NOMBREENT LIKE CONCAT('%', p_nombre, '%');
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `MostrarEntrenadoresPorRol` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `MostrarEntrenadoresPorRol`(IN p_rol ENUM('usuario','administrador'))
BEGIN
    SELECT * FROM entrenadores WHERE Rol = p_rol;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `MostrarEstudiantesPorCategoria` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `MostrarEstudiantesPorCategoria`(
    IN categoria_id INT
)
BEGIN
    SELECT *
    FROM estudiante
    WHERE ID_CATEGORIA = categoria_id;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `ObtenerDatosEstudiantePorCedula` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ObtenerDatosEstudiantePorCedula`(IN cedula_estudiante VARCHAR(10))
BEGIN
    SELECT NOMBRES, APELLIDOS, TELEFONO, CORREO, Posicion, SubPosicion, PESO, ESTATURA, EDAD
    FROM estudiante
    WHERE CI_ESTUDIANTE = cedula_estudiante;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `VerEstudiantes` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `VerEstudiantes`()
BEGIN
    SELECT * FROM estudiante;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `VerPagos` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `VerPagos`()
BEGIN
    SELECT e.CI_ESTUDIANTE, e.NOMBRES, e.APELLIDOS, p.FECHA_PAGO, p.Estado, p.Monto
    FROM estudiante e
    INNER JOIN pagos p ON e.CI_ESTUDIANTE = p.CI_ESTUDIANTE;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `VerPagosCedula` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `VerPagosCedula`(IN CI_estudiante_param varchar(10))
BEGIN
    SELECT e.CI_ESTUDIANTE, e.NOMBRES, e.APELLIDOS, p.FECHA_PAGO, p.Estado, p.Monto
    FROM estudiante e
    INNER JOIN pagos p ON e.CI_ESTUDIANTE = p.CI_ESTUDIANTE
    WHERE e.CI_ESTUDIANTE = CI_estudiante_param;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `VerPagosPorEstado` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `VerPagosPorEstado`(IN estado_param enum('Pagado','Debe'))
BEGIN
    SELECT e.CI_ESTUDIANTE, e.NOMBRES, e.APELLIDOS, p.FECHA_PAGO, p.Estado, p.Monto
    FROM estudiante e
    INNER JOIN pagos p ON e.CI_ESTUDIANTE = p.CI_ESTUDIANTE
    WHERE p.Estado = estado_param;
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

-- Dump completed on 2024-02-20 15:41:36


INSERT INTO `entrenadores` (`CedulaEntrenador`, `NOMBREENT`, `APELLIDOENT`, `TELEFONO`, `Usuario`, `Contrasenia`, `Rol`) 
VALUES ('1234567890', 'Kevin', 'Teran', '123-456-7890', 'Admin123', 'Admin123', 'ADMINISTRADOR');
