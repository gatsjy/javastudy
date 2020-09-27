package gamelevel;

public class Player {

    private PlayerLevel level;

    public Player(){
        level = new BeginnerLevel();
        level.showLevelMessage();
    }

    public PlayerLevel getLevel() {
        return level;
    }

    public void setLevel(PlayerLevel level) {
        this.level = level;
    }

    public void upgradeLevel(PlayerLevel playerLevel){
        this.level = playerLevel;
        playerLevel.showLevelMessage();
    }

    public void play(int count){
        level.go(count);
    }

}
