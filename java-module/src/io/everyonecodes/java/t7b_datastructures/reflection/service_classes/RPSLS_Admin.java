package io.everyonecodes.java.t7b_datastructures.reflection.service_classes;

import io.everyonecodes.java.t7b_datastructures.reflection.data_classes.RPSLS_Options;
import io.everyonecodes.java.t7b_datastructures.reflection.data_classes.Result;

import java.util.*;

public class RPSLS_Admin {

    // I will create a map in which we have the move and which moves it defeats
    // if the move is not within the list, it means it is defeated by it.

    // these lines can be simplified if needed, kept it like this for my readability
    private Map<RPSLS_Options, List<RPSLS_Options>> movesMap;
    public void movesLogicStore(){
        movesMap = new HashMap<>();

        movesMap.put(RPSLS_Options.ROCK, List.of(RPSLS_Options.SCISSORS, RPSLS_Options.LIZARD));
        movesMap.put(RPSLS_Options.SCISSORS, List.of(RPSLS_Options.PAPER, RPSLS_Options.LIZARD));
        movesMap.put(RPSLS_Options.PAPER, List.of(RPSLS_Options.ROCK, RPSLS_Options.SPOCK));
        movesMap.put(RPSLS_Options.LIZARD, List.of(RPSLS_Options.SPOCK, RPSLS_Options.PAPER));
        movesMap.put(RPSLS_Options.SPOCK, List.of(RPSLS_Options.SCISSORS, RPSLS_Options.ROCK));
    }

    private Set<RPSLS_Options> knownMoves = new HashSet<>(
            Set.of(RPSLS_Options.ROCK,
                    RPSLS_Options.PAPER,
                    RPSLS_Options.SCISSORS,
                    RPSLS_Options.LIZARD,
                    RPSLS_Options.SPOCK
            )
    );

    private Set<String> legalMoves = new HashSet<>(
            Set.of(RPSLS_Options.ROCK.getName(),
                    RPSLS_Options.PAPER.getName(),
                    RPSLS_Options.SCISSORS.getName(),
                    RPSLS_Options.LIZARD.getName(),
                    RPSLS_Options.SPOCK.getName()
            )
    );


    public boolean checkCorrectInput(String userInput){
        return legalMoves.contains(userInput);
    }

    public String checkUserResult(String userStringInput){
        movesLogicStore();

        RPSLS_Options userInput = getInputAsRPSLS_Option(userStringInput);
        RPSLS_Options computerMove = getComputerMove();

        System.out.println("Computer picked: " + computerMove.getName());
        if (userInput.equals(computerMove)){
            return Result.DRAW.getName();
        } else if (movesMap.get(userInput).contains(computerMove)) {
            return Result.WON.getName();
        } else return Result.LOST.getName();

    }

    private RPSLS_Options getInputAsRPSLS_Option(String userInput){
        return switch (userInput) {
            case "rock" -> RPSLS_Options.ROCK;
            case "paper" -> RPSLS_Options.PAPER;
            case "scissors" -> RPSLS_Options.SCISSORS;
            case "lizard" -> RPSLS_Options.LIZARD;
            default -> RPSLS_Options.SPOCK;
        };
    }

    private RPSLS_Options getComputerMove(){
        Random random = new Random();
        return knownMoves.stream().toList().get(random.nextInt(knownMoves.size()));
    }

}
