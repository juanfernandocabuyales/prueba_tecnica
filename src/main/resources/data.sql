INSERT INTO persona (persona_codigo,persona_nombre,persona_apellido,persona_fecha_nacimiento,persona_username,
                    persona_password,persona_identificacion,persona_codigo_tipo_identificacion,persona_codigo_estado)
            VALUES  ('12','Juan Fernando','Cabuyales',SYSDATE,'juan_cabuyales','1234',1234,1,1);
            
INSERT INTO persona (persona_codigo,persona_nombre,persona_apellido,persona_fecha_nacimiento,persona_username,
                    persona_password,persona_identificacion,persona_codigo_tipo_identificacion,persona_codigo_estado)
            VALUES ('13','Pedro Jose','Caballero',SYSDATE,'pedro_jose','5678',1235,1,1);
            
INSERT INTO tipo_identificacion (tipo_identificacion_codigo,tipo_identificacion_nombre,tipo_identificacion_fecha_creacion,
								 tipo_identificacion_usuario_creacion,tipo_identificacion_fecha_modificacion,tipo_identificacion_usuario_modificacion)
			VALUES (1,'CEDULA',SYSDATE,'Juan',SYSDATE,'Juan',1);
			
INSERT INTO estado (estado_codigo,estado_nombre,estado_fecha_creacion,estado_usuario_creacion,estado_fecha_modificacion,estado_usuario_modificacion)
            VALUES (1,'Activo',SYSDATE,'Juan',SYSDATE,'Juan');
