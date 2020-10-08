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

DROP TABLE IF EXISTS tipo_identificacion;
  
CREATE TABLE tipo_identificacion (
  tipo_identificacion_id INT AUTO_INCREMENT  PRIMARY KEY,
  tipo_identificacion_codigo NUMERIC,
  tipo_identificacion_nombre VARCHAR(20) NOT NULL,
  tipo_identificacion_fecha_creacion TIMESTAMP,
  tipo_identificacion_usuario_creacion VARCHAR(20) NOT NULL,
  tipo_identificacion_fecha_modificacion TIMESTAMP NOT NULL,
  tipo_identificacion_usuario_modificacion VARCHAR(20) NOT NULL
);

DROP TABLE IF EXISTS estado;
  
CREATE TABLE estado (
  estado_id INT AUTO_INCREMENT  PRIMARY KEY,
  estado_codigo NUMERIC,
  estado_nombre VARCHAR(20) NOT NULL,
  estado_fecha_creacion TIMESTAMP,
  estado_usuario_creacion VARCHAR(20) NOT NULL,
  estado_fecha_modificacion TIMESTAMP NOT NULL,
  estado_usuario_modificacion VARCHAR(20) NOT NULL
);