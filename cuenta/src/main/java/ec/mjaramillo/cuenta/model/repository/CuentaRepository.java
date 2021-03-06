package ec.mjaramillo.cuenta.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec.mjaramillo.cuenta.model.entity.Cuenta;

@Repository
public interface CuentaRepository extends JpaRepository<Cuenta, Long>{
	public Cuenta findOneByNumeroCuenta(String numeroCuenta);
}
