DROP TABLE IF EXISTS persona;
  
CREATE TABLE persona (
  persona_id INT AUTO_INCREMENT  PRIMARY KEY,
  persona_codigo NUMERIC,
  persona_nombre VARCHAR(100) NOT NULL,
  persona_apellido VARCHAR(100) NOT NULL,
  persona_fecha_nacimiento DATE,
  persona_username VARCHAR(20) NOT NULL,
  persona_password VARCHAR(50) NOT NULL,
  persona_identificacion NUMERIC,
  persona_codigo_tipo_identificacion NUMERIC,
  persona_codigo_estado NUMERIC  
);

DROP TABLE IF EXISTS entidad_general;

CREATE TABLE entidad_general(
  entidad_general_id INT AUTO_INCREMENT  PRIMARY KEY,
  entidad_general_codigo NUMERIC,
  entidad_general_nombre VARCHAR(20) NOT NULL,
  entidad_general_fecha_creacion TIMESTAMP,
  entidad_general_usuario_creacion VARCHAR(20) NOT NULL,
  entidad_general_fecha_modificacion TIMESTAMP NOT NULL,
  entidad_general_usuario_modificacion VARCHAR(20) NOT NULL,
  dtype VARCHAR(20) DEFAULT NULL
)