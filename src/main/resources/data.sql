INSERT INTO persona (persona_id,persona_codigo,persona_nombre,persona_apellido,persona_fecha_nacimiento,persona_username,
                    persona_password,persona_identificacion,persona_codigo_tipo_identificacion,persona_codigo_estado)
            VALUES  (1,'12','Juan Fernando','Cabuyales',SYSDATE,'juan_cabuyales','1234',1234,1,1);
            
INSERT INTO persona (persona_id,persona_codigo,persona_nombre,persona_apellido,persona_fecha_nacimiento,persona_username,
                    persona_password,persona_identificacion,persona_codigo_tipo_identificacion,persona_codigo_estado)
            VALUES (2,'13','Pedro Jose','Caballero',SYSDATE,'pedro_jose','5678',1235,2,2);
            
INSERT INTO entidad_general (entidad_general_id,entidad_general_codigo,entidad_general_nombre,entidad_general_fecha_creacion,
							 entidad_general_usuario_creacion,entidad_general_fecha_modificacion,entidad_general_usuario_modificacion,dtype)
			 VALUES (1,1,'CEDULA',SYSDATE,'Juan',SYSDATE,'Juan','TipoIdentificacion');
			
INSERT INTO entidad_general (entidad_general_id,entidad_general_codigo,entidad_general_nombre,entidad_general_fecha_creacion,
							 entidad_general_usuario_creacion,entidad_general_fecha_modificacion,entidad_general_usuario_modificacion,dtype)
			 VALUES (2,2,'Activo',SYSDATE,'Juan',SYSDATE,'Juan','TipoIdentificacion');
            
COMMIT;
