CREATE DEFINER=`root`@`localhost` PROCEDURE `VerPagos`()
BEGIN
    SELECT e.CI_ESTUDIANTE, e.NOMBRES, e.APELLIDOS, p.FECHA_PAGO, p.Estado, p.Monto
    FROM estudiante e
    INNER JOIN pagos p ON e.CI_ESTUDIANTE = p.CI_ESTUDIANTE;
END



CREATE DEFINER=`root`@`localhost` PROCEDURE `InsertarPago`(
    IN CI_estudiante_param VARCHAR(10),
    IN monto_param DECIMAL(10,2)
)
BEGIN
    DECLARE fecha_pago_param DATE;

    -- Generar la fecha actual
    SET fecha_pago_param = CURDATE();

    -- Insertar el pago en la tabla pagos
    INSERT INTO pagos (CI_ESTUDIANTE, FECHA_PAGO, Estado, Monto)
    VALUES (CI_estudiante_param, fecha_pago_param, 'Pagado', monto_param);
END
