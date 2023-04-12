package com.example.lab3.repository;

import com.example.lab3.entity.Doctor;
import com.example.lab3.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Doctorrepository extends JpaRepository<Doctor,Integer> {

    @Query(nativeQuery = true, value="select * from paciente p where p.doctor_id =  %?1%")
    List<Paciente> buscarPacientedeDcotor(Integer idDoctor);


    @Query(nativeQuery = true, value="select * from paciente p  where fecha_cita< '2023-04-11 00:00:00' and  p.doctor_id =  %?1%")
    List<Paciente> buscarPacientecitas(Integer idDoctor);

}
