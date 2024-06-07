package pe.edu.cibertec.DAAII_T1_Nicolas_Segovia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DAAII_T1_Nicolas_Segovia.model.bd.Rol;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer> {
    Rol findByNomrol(String nomrol);
}
