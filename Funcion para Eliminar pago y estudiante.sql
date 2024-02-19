DELIMITER \\
CREATE FUNCTION EliminarEstudiantePagos (cedula_estudiante VARCHAR(10)) RETURNS tinyint(1)
DETERMINISTIC
BEGIN
    DECLARE estudiante_eliminado BOOLEAN DEFAULT FALSE;
    
    -- Eliminar registros de pagos asociados al estudiante
    DELETE FROM pagos WHERE CI_ESTUDIANTE = cedula_estudiante;
    
    -- Comprobar si se eliminaron registros de pagos
    IF ROW_COUNT() > 0 THEN
        -- Eliminar al estudiante
        DELETE FROM estudiante WHERE CI_ESTUDIANTE = cedula_estudiante;
        SET estudiante_eliminado = TRUE;
    END IF;
    
    RETURN estudiante_eliminado;
END \\
DELIMITER ;

