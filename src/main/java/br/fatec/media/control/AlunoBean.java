package br.fatec.media.control;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.fatec.media.model.Aluno;

@ManagedBean
@RequestScoped
public class AlunoBean {
	private Aluno aluno = new Aluno();
	private String situacao;

	public AlunoBean() {
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	
	public String calcularMedia() {
		aluno.setMedia((aluno.getP1() + aluno.getP2()) / 2);
		if (aluno.getMedia() >= 6) {
			situacao = "Aprovado";
		}
		else if (aluno.getMedia() < 2) {
			situacao = "Reprovado";
		}
		else {
			situacao = "A3";
		}
		return "/media";
	}
}
