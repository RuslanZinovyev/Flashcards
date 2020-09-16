package flashcards;

import static flashcards.FlashCardService.addCard;
import static flashcards.FlashCardService.askCard;
import static flashcards.FlashCardService.exportToFile;
import static flashcards.FlashCardService.importFromFile;
import static flashcards.FlashCardService.logToFile;
import static flashcards.FlashCardService.printHardestCards;
import static flashcards.FlashCardService.removeCard;
import static flashcards.FlashCardService.resetStats;

public class Menu {

    public static String INTRODUCTION = "Input the action (add, remove, import, export, ask, exit, log, hardest card, reset stats):";

    public static void getCommand(String actionName) {
        switch (actionName) {
            case "add":
                addCard();
                break;
            case "remove":
                removeCard();
                break;
            case "import":
                importFromFile();
                break;
            case "export":
                exportToFile();
                break;
            case "ask":
                askCard();
                break;
            case "exit":
                System.out.println("Bye bye!");
                break;
            case "log":
                logToFile();
                break;
            case "hardest card":
                printHardestCards();
                break;
            case "reset stats":
                resetStats();
                break;
        }
    }
}
