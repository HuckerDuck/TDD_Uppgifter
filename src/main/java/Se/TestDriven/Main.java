package Se.TestDriven;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Card> cards = new ArrayList<Card>();
        ArrayList<Card> userCards = new ArrayList<Card>();
        String[] suits = {"Hearts", "Clubs", "Diamonds", "Spades"};
        String[] cardPlaceholders = {"Jack", "Queen", "King", "Ace"};
        boolean isplaying = true;
        Scanner scanner = new Scanner(System.in);
        String choice = "";



        // For Loop med 10
        for (int i = 2; i <= 10; i++) {

            for(int j = 0; j < 4; j++){
                cards.add(new Card(String.valueOf(i), suits[j], i, cardTypes.Number));
            }
        }

        for (int i = 10; i <= 13; i++) {

            for(int j = 0; j < 4; j++){
                cards.add(new Card(cardPlaceholders[j], suits[j], i, cardTypes.Rank));
            }
        }

        while (isplaying) {
            System.out.println();
            System.out.println("Välj en siffra mellan 1-5");
            System.out.println();
            System.out.println("1 - Lägg till ett kort ");
            System.out.println("2 - Ta bort ett kort ");
            System.out.println("3 - Blanda Kortlek ");
            System.out.println("4 - Visa din kort ");
            System.out.println("5 - Avsluta ");
            System.out.println();

            System.out.print("Gör ditt val: ");
            choice = scanner.nextLine();



            switch(choice){
                //! Lägga till kort
                case "1":
                    Card card = cards.get(new Random().nextInt(cards.size()));
                    userCards.add(card);
                    cards.remove(card);
                    System.out.println();
                    System.out.println("Du fick ett: " + card.toString());

                    System.out.println("Antal kort kvar i kortleken: " + cards.size());



                    break;

                //! Ta bort kort
                case "2":
                    System.out.println(userCards);
                    userCards.remove(userCards.size()-1);
                    break;

                //! Shuffle
                case "3":
                    Collections.shuffle(cards);
                    System.out.println("Shufflar Kortleken");
                    break;

                //! Visa din kort
                case "4":
                    System.out.println();
                    System.out.println(userCards);
                    break;

                //! Avsluta
                case "5":
                    System.out.println();
                    System.out.println("Avslutas");
                    System.out.println("...");
                    System.out.println("...");
                    isplaying = false;
                    break;

                default:

            }

        }







    }
}