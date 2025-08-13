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
  
#### Creacion de los repoository, para tener consultas

- AuthorRespository
- BookRepository
- LibraryUserRepository
- LoanRepository

#### Creacion de los metodos de los servicios (Posibles metodos para los end-points)

### 1️⃣ Para LibraryUser
- getAllUsers() → obtener todos los usuarios.

- getUserById(Long id) → traer un usuario específico por su ID.

- getUserByEmail(String email) → buscar un usuario por su correo.

- createUser(LibraryUserDTO dto) → dar de alta un usuario nuevo.

- updateUser(Long id, LibraryUserDTO dto) → actualizar información de un usuario.

- deleteUser(Long id) → eliminar un usuario.

- getUsersByRole(UserRol rol) → traer todos los usuarios de un rol específico (ej. solo empleados o admins).

### 2️⃣ Para Book
- getAllBooks() → lista completa de libros.

- getBookById(Long id) → traer un libro específico.

- getBooksByAuthor(Long authorId) → traer todos los libros de un autor.

- getBooksByGender(Genders gender) → filtrar libros por género.

- getAvailableBooks() → solo los libros que no están prestados.

- createBook(BookDTO dto) → agregar un libro nuevo.

- updateBook(Long id, BookDTO dto) → actualizar un libro existente.

- deleteBook(Long id) → eliminar un libro.

### 3️⃣ Para Author
- getAllAuthors() → todos los autores.

- getAuthorById(Long id) → un autor específico.

- getAuthorsByCountry(String country) → filtrar autores por país.

- createAuthor(AuthorDTO dto) → agregar un autor.

- updateAuthor(Long id, AuthorDTO dto) → modificar un autor.

- deleteAuthor(Long id) → eliminar un autor.

### 4️⃣ Para Loan
- getAllLoans() → todos los préstamos.

- getLoanById(Long id) → préstamo específico.

- getLoansByUser(Long userId) → historial de préstamos de un usuario.

- getLoansByBook(Long bookId) → historial de un libro.

- getActiveLoans() → préstamos actualmente activos (no devueltos).

- createLoan(LoanCreateDTO dto) → registrar un préstamo nuevo.

- returnLoan(Long loanId) → marcar un libro como devuelto.
