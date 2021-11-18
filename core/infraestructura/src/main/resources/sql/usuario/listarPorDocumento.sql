SELECT id, documento, nombres, apellidos, celular, email, fecha_nacimiento
FROM usuario
WHERE documento = :documento;