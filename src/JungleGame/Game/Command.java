package JungleGame.Game;

/**
 * Created by Douglas Liu on 4/4/2018.
 */
public abstract class Command {
    // TODO: Extend this class with different commands

    // Return true when execute successfully
    public abstract boolean execute(Board board);
}
