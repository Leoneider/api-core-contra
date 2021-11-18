INSERT INTO public.usuario
(documento, nombres, apellidos, celular, email, fecha_nacimiento, "password", created_at, updated_at)
VALUES(:documento, :nombres, :apellidos, :celular, :email, :fechaNacimiento, :password, now(), now());
