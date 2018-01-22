public class TennisGame3 implements TennisGame {
  
  private int firstPlayerScore;
  private int secondPlayerScore;
  private String firstPlayer;
  private String secondPlayer;
  private String[] stateOfPlayOptions = new String[]{"Love", "Fifteen", "Thirty", "Forty"};

  public TennisGame3(String firstPlayer, String secondPlayer) {
    this.firstPlayer = firstPlayer;
    this.secondPlayer = secondPlayer;
  }

  public String getGameStateOption (int index) {
    return stateOfPlayOptions[index];
  }
  public String gameStateUnderForty() {
    String firstPlayerActualGameState = getGameStateOption(firstPlayerScore);
    String secondPlayerActualGameState = getGameStateOption(secondPlayerScore);
    if (firstPlayerScore == secondPlayerScore) {
       return firstPlayerActualGameState + " - All";
    } else {
       return firstPlayerActualGameState + " - " + secondPlayerActualGameState;
    }
  }

  public String getPlayerNameWithHigherScore() {
    if (firstPlayerScore > secondPlayerScore) {
      return firstPlayer;
    } else {
      return secondPlayer;
    }
  }

  public String gameStateOverForty () {
    String playerInAdvantage = getPlayerNameWithHigherScore();
    if (firstPlayerScore == secondPlayerScore) {
      return "Deuce";
    } else if ((firstPlayerScore - secondPlayerScore) * (firstPlayerScore - secondPlayerScore) == 1) {
      return "Advantage " + playerInAdvantage;
    } else {
      return "Win for " + playerInAdvantage;
    }
  }

  public String getScore() {
    if (firstPlayerScore < 4 && secondPlayerScore < 4) {
      return gameStateUnderForty();
    } else {
      return gameStateOverForty();
    }
  }

  public void wonPoint(String playerName) {
    if (playerName == "player1")
      this.firstPlayerScore += 1;
    else
      this.secondPlayerScore += 1;
  }
}
