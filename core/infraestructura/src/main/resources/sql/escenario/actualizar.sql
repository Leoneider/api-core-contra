UPDATE escenario
SET nombre=:nombre, direccion=:direccion, valor=:valor, horainicial=:horaInicial, horafinal=:horaFinal, imagen=:imagen, updated_at=now()
where id = :id
