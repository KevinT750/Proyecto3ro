DELIMITER //
CREATE PROCEDURE `BuscarPersona`(
    IN cedula VARCHAR(10)
)
BEGIN
    SELECT *
    FROM estudiante
    WHERE CI_ESTUDIANTE LIKE CONCAT('%', cedula, '%');
END //
DELIMITER ;

drop procedure BuscarPersona;
drop procedure BuscarPorCI;
DELIMITER //
CREATE PROCEDURE `BuscarPorNombre`(
    IN NOMBRE VARCHAR(50)
)
BEGIN
    SELECT * FROM estudiante WHERE NOMBRES LIKE CONCAT('%', NOMBRE, '%');
END //
DELIMITER ;



DELIMITER //
CREATE PROCEDURE `VerEstudiantes`()
BEGIN
    SELECT * FROM estudiante;
END //
DELIMITER ;


DELIMITER //
CREATE PROCEDURE `sp_ActualizarEstudiante`(
    IN p_ci_estudiante VARCHAR(10),
    IN p_nombres VARCHAR(50),
    IN p_apellidos VARCHAR(50),
    IN p_fecha_nacimiento DATE,
    IN p_telefono VARCHAR(10),
    IN p_provincia VARCHAR(25),
    IN p_ciudad VARCHAR(25),
    IN p_correo VARCHAR(50),
    IN p_edad INT,
    IN p_posicion VARCHAR(30),
    IN p_subposicion VARCHAR(30),
    IN p_nacionalidad VARCHAR(20),
    IN p_peso DECIMAL(5,2),
    IN p_estatura DECIMAL(5,2)
)
BEGIN
    UPDATE estudiante
    SET NOMBRES = p_nombres,
        APELLIDOS = p_apellidos,
        FECHA_NACIMIENTO = p_fecha_nacimiento,
        TELEFONO = p_telefono,
        PROVINCIA = p_provincia,
        CIUDAD = p_ciudad,
        CORREO = p_correo,
        EDAD = p_edad,
        POSICION = p_posicion,
        SUBPOSICION = p_subposicion,
        NACIONALIDAD = p_nacionalidad,
        PESO = p_peso,
        ESTATURA = p_estatura
    WHERE CI_ESTUDIANTE = p_ci_estudiante;
END //
DELIMITER ;



DELIMITER //
CREATE DEFINER=`root`@`localhost` PROCEDURE `VerPagos`()
BEGIN
    SELECT e.CI_ESTUDIANTE, e.NOMBRES, e.APELLIDOS, p.FECHA_PAGO, p.Estado, p.Monto
    FROM estudiante e
    INNER JOIN pagos p ON e.CI_ESTUDIANTE = p.CI_ESTUDIANTE;
END //
DELIMITER ;


drop procedure VerPagos;



DELIMITER //
CREATE PROCEDURE InsertarPago(
    IN CI_estudiante_param varchar(10),
    IN fecha_pago_param date,
    IN estado_param enum('Pagado','Debe'),
    IN monto_param decimal(10,2)
)
BEGIN
    INSERT INTO pagos (CI_ESTUDIANTE, FECHA_PAGO, Estado, Monto)
    VALUES (CI_estudiante_param, fecha_pago_param, estado_param, monto_param);
END //
DELIMITER ;
