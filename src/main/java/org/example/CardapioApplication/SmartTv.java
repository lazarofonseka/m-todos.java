package org.example.CardapioApplication;

public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 23;

    //Método para ligar e desligar a smartTv
    public void ligar(){
        ligada =  true;
    }
    public  void desligar(){
        ligada = false;
    }

    //Métodos para aumentar e diminuir o volume da smartTv
    public void aumentarVolume(){
     // metodo comum    volume = volume + 1;
        volume++;//metodo simples.
        System.out.println("Aumentando o volume para : " + volume);
    }
    public void diminuirVolume(){
        System.out.println("Dimminuindo o volume para:" + volume);
        volume--;
        System.out.println("Dimminuindo o volume para:" + volume);
    }

    //Método para Mudar o Canal da smartTv
    public  void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }

}
