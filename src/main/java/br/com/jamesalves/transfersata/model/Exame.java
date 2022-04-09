package br.com.jamesalves.transfersata.model;

import javax.persistence.*;
import java.util.List;

@Table(name = "exame")
@Entity
public class Exame {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "descricao")
    private String descricao;

    @ElementCollection
    @CollectionTable(name = "exame_requisito", joinColumns = @JoinColumn(name = "owner_id"))
    @Column(name = "requisito")
    private List<Requisito> requisito;

    public List<Requisito> getRequisito() {
        return requisito;
    }

    public void setRequisito(List<Requisito> requisito) {
        this.requisito = requisito;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}