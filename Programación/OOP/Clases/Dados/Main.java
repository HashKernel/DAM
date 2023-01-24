package Dados;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce el nombre del jugador 1: ");
        String Player1 = input.next();

        System.out.println("Introduce el nombre del jugador 2: ");
        String Player2 = input.next();

        Jugador Jugador1 = new Jugador(Player1);
        Jugador Jugador2 = new Jugador(Player2);

        System.out.println("¿Quieres jugar a los dados? S/N");
        String decision = input.next();

        while (decision.equalsIgnoreCase("S")) {
            tirar(Jugador1,Jugador2);

            System.out.println("Quieres jugar de nuevo?");
            decision = input.next();
        }

        System.out.println();
    }

    public static void ganador(Jugador player1, Jugador player2) {
        String primerJugador = player1.getJugador();
        String segundoJugador = player2.getJugador();

        // EMPATE
        if (player1.tieneDosSeis() && player2.tieneDosSeis())
            System.out.println("EMPATE, LOS DOS JUGADORES TIENEN TODO 6");

        // JUGADOR 1 TIENE 2 SEIS Y GANA
        else if (player1.tieneDosSeis() && !player2.tieneDosSeis())
            System.out.println("Gana " + primerJugador + " ya que tiene dos seis mientras que" + segundoJugador + " no");

        // JUGADOR 2 TIENE 2 SEIS Y GANA
        else if (player2.tieneDosSeis() && !player1.tieneDosSeis())
            System.out.println("Gana " + segundoJugador +  " ya que tiene dos seis mientras que " + primerJugador + " no");

        // JUGADOR 2 GANA
        else if (player1.tieneUnSeis() && !player2.tieneUnSeis())
            System.out.println("Gana " + primerJugador + " ya que tiene un seis y " + segundoJugador +  " no");

        // JUGADOR 2 GANA
        else if (player2.tieneUnSeis() && !player1.tieneUnSeis())
            System.out.println("Gana " + segundoJugador +  " ya que tiene un seis y " + primerJugador + " no");

        // JUGADOR 1 GANA
        else if (player1.noTieneSeises() > player2.noTieneSeises())
            System.out.println("Gana " + primerJugador + " ya que la suma de sus dados es mayor");

        // JUGADOR 2 GANA
        else
            System.out.println("Gana " + segundoJugador +  " ya que la suma de sus dados es mayor");
    }

    public static void tirar(Jugador player1, Jugador player2) {
        player1.tirar();
        player2.tirar();

        ganador(player1,player2);

        System.out.println();
    }
}
