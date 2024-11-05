package org.projetos;

public interface Visitor {
    String exibirRelatorioDesenvolvimento(DesenvolvedorSoftware desenvolvedorSoftware);
    String exibirRelatorioCyberSecurity(CyberSecurity cyberSecurityAnalyst);
    String exibirRelatorioQA(Trainee traineeQualityAssurance);
}