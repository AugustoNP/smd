import javax.swing.*;

void main() {
    var JogadorUmEscolha = JOptionPane.showInputDialog(" Jogador um, \nEscreva 1 para pedra, 2 para papel, 3 pra tesoura");
    var JogadorDoisEscolha = JOptionPane.showInputDialog(" Jogador dois, \nEscreva 1 para pedra, 2 para papel, 3 pra tesoura");


    if (JogadorUmEscolha.equals("1") & JogadorDoisEscolha.equals("3")) {
        JOptionPane.showMessageDialog(null, "Jogador um ganhou!");
    } else if (JogadorUmEscolha.equals("1") & JogadorDoisEscolha.equals("2")){
        JOptionPane.showMessageDialog(null, "Jogador dois ganhou!");
    } else if (JogadorUmEscolha.equals("1") & JogadorDoisEscolha.equals("1")) {
        JOptionPane.showMessageDialog(null, "empate!");
    }

    if (JogadorUmEscolha.equals("2") & JogadorDoisEscolha.equals("1")) {
        JOptionPane.showMessageDialog(null, "Jogador um ganhou!");
    } else if (JogadorUmEscolha.equals("2") & JogadorDoisEscolha.equals("3")){
        JOptionPane.showMessageDialog(null, "Jogador dois ganhou!");
    } else if (JogadorUmEscolha.equals("2") & JogadorDoisEscolha.equals("2")) {
        JOptionPane.showMessageDialog(null, "empate!");
    }

    if (JogadorUmEscolha.equals("3") & JogadorDoisEscolha.equals("2")) {
        JOptionPane.showMessageDialog(null, "Jogador um ganhou!");
    } else if (JogadorUmEscolha.equals("3") & JogadorDoisEscolha.equals("1")){
        JOptionPane.showMessageDialog(null, "Jogador dois ganhou!");
    } else if (JogadorUmEscolha.equals("3") & JogadorDoisEscolha.equals("3")) {
        JOptionPane.showMessageDialog(null, "empate!");
    }


}
