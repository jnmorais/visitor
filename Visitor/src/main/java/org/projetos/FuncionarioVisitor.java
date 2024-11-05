package org.projetos;

public class FuncionarioVisitor implements Visitor{

    public String exibir(Funcionario funcionario) {
        return funcionario.aceitar(this);
    }

    @Override
    public String exibirRelatorioCyberSecurity(CyberSecurity cyberSecurity) {
        String certificacoes = String.join(", ", cyberSecurity.getCertificacoes());
        return "CyberSecurityAnalyst{" +
                "Nome=" + cyberSecurity.getNome() +
                ", certificacoes=\"" + certificacoes + "\"" +
                ", time=" + cyberSecurity.getTime() +
                '}';
    }

    @Override
    public String exibirRelatorioDesenvolvimento(DesenvolvedorSoftware desenvolvedorSoftware){
        return "Dev{" +
                "Nome=" + desenvolvedorSoftware.getNome() +
                ", FrontEnd='" + desenvolvedorSoftware.getTecnologiasFrontEnd() + '\'' +
                ", BackEnd=" + desenvolvedorSoftware.getTecnologiasBackEnd() +
                '}';
    }

    public String exibirRelatorioQA(Trainee trainee){
        return "QA{" +
                "Nome=" + trainee.getNome() +
                ", Ferramentas='" + trainee.getFerramentas() + '\'' +
                ", Tipos de teste=" + trainee.getTiposTeste() +
                '}';
    }
}
