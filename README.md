# api-biblioteca-backend

#### Tecnologioas Utilizadas

[] Spring boot
[] Spring Web
[] Spring Data Jpa
[] Spring tools
[] Mysql Driver
[] Spring Security
[] Jwt

#### Entidades pricipales

- Book (id, nombre, autor, genero, descripcion, stock)
- Author (id, nombre, pais)
- LibraryUser (id, nombre, rol, email, contraseña)
- Loan (id usuario_id, libro_id, fecha_prestamo, fecha_devolucion)

####  Creacion de los DTOs (Mismos datos)

- Book (id, nombre, autor, genero, descripcion, stock)
- Author (id, nombre, pais)
- LibraryUser (id, nombre, rol, email, contraseña)
- Loan (id usuario_id, libro_id, fecha_prestamo, fecha_devolucion)
  
#### Creacion de los repoositoty, para tener colsultas