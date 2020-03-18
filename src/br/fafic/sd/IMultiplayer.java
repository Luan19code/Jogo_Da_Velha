package br.fafic.sd;

import java.rmi.Remote;
import java.rmi.RemoteException;
import javax.swing.JButton;

public interface IMultiplayer extends Remote {

    public void verificaSimbolo(int codigo, String simbolo) throws RemoteException;

}
