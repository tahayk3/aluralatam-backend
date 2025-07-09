ALTER TABLE medicos
ADD CONSTRAINT unique_email UNIQUE (email),
ADD CONSTRAINT unique_documento UNIQUE (documento);