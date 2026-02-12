package com.CidadeDeCrateus.Cadastro.Gestao;

import com.CidadeDeCrateus.Cadastro.Demolay.DemolayModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "tb_gestao")
public class GestaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String gestao;

    private String cargo;

    @OneToMany(mappedBy = "gestao")
    private List<DemolayModel> demolays;

}
