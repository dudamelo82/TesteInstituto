
package br.cadastro.entidade.instituto;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


/**
 *
 * @author USUARIO
 */
@ManagedBean(name = "alunoBean")
@SessionScoped
public class AlunoBean {
    private Aluno aluno = new Aluno();
    private List<Aluno> alunos = new ArrayList<>();
    
    /**
     *
     */
    public void adicionar (){
        alunos.add(aluno);
        aluno = new Aluno();
    
    }

    /**
     *
     * @return
     */
    public Aluno getAluno() {
        return aluno;
    }

    /**
     *
     * @param aluno
     */
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    /**
     *
     * @return
     */
    public List<Aluno> getAlunos() {
        return alunos;
    }

    /**
     *
     * @param alunos
     */
    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
    
  
    
    
    
}
