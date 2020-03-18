package br.fafic.sd;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Multiplayer extends UnicastRemoteObject implements IMultiplayer {

    public Multiplayer() throws RemoteException {

    }

//    @Override
//    public String logar(String usuario, String senha) throws RemoteException {
//        if(usuario.equalsIgnoreCase("admin")
//                && senha.equalsIgnoreCase("admin")
//                ){
//            return "Seja Bem-Vindo Luciano";
//        }
//            return "Login ou senha invalido!";
//    }
    @Override
    public void verificaSimbolo(int codigo, String sibolo) throws RemoteException {

//        Principal prin = new Principal();
//        System.out.println(codigo + "codigo server ");
//
//        prin.valor(codigo);
        gravar(codigo + "\n", sibolo + "\n");

        System.out.println("CONECTOU");

//        JOptionPane.showMessageDialog(null, "Seu Amigo " + sibolo + " Jogou!");

    }

    public void gravar(String texto, String texto2) {
        try {
            File file = new File("codigoCliente.txt");

            if (file.exists()) {
                file.delete();

            }
            FileWriter ficheiro = new FileWriter("codigoCliente.txt");

            ficheiro.write(texto);
            ficheiro.write(texto2);
            ficheiro.close();

        } catch (IOException ex) {
            Logger.getLogger(Multiplayer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//    public static void Ler() {
//        int variavel_retornavel = 0;
//        try {
//            FileReader leitura = new FileReader("codigoCliente.txt");
//
//            BufferedReader br = new BufferedReader(leitura);
//
////            enviar_Codigo(Integer.parseInt(br.readLine()));
////            enviar_Simbolo(br.readLine());
//            System.out.println("MINHA V: " + variavel_retornavel);
//
//        } catch (IOException ex) {
//            Logger.getLogger(Multiplayer.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
}
