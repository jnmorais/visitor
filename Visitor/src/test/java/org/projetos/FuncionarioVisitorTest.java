package org.projetos;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioVisitorTest {

    @Test
    void deveExibirTraine(){
        Trainee trainee = new Trainee
                ("José", "Selenium / JUnit / Jira", "Unitário / Integração / Regressão");
        FuncionarioVisitor visitor = new FuncionarioVisitor();
        assertEquals("QA{Nome=José, Ferramentas='Selenium / JUnit / Jira'," +
                        " Tipos de teste=Unitário / Integração / Regressão}",
                visitor.exibir(trainee));
    }

    @Test
    void deveExibirDesenvolvimentoSoftware(){
        DesenvolvedorSoftware desenvolvedorSoftware = new DesenvolvedorSoftware
                ("João","Javascript", "Java");
        FuncionarioVisitor visitor = new FuncionarioVisitor();
        assertEquals("Dev{Nome=João, FrontEnd='Javascript', BackEnd=Java}", visitor.exibir(desenvolvedorSoftware));
    }

    @Test
    void deveExibirCyberSecurityAnalyst(){
        List<String> certificacoes = Arrays.asList("CISSP", "CEH", "CISM", "CompTIA Security+", "CIPP");
        CyberSecurity cyberSecurityAnalyst = new CyberSecurity("Carneiro, Valesca",
                certificacoes, "red team");
        FuncionarioVisitor visitor = new FuncionarioVisitor();
        assertEquals("CyberSecurityAnalyst{Nome=Carneiro, Valesca," +
                        " certificacoes=\"CISSP, CEH, CISM, CompTIA Security+, CIPP\", time=red team}",
                visitor.exibir(cyberSecurityAnalyst));
    }



}