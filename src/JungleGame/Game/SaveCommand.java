package JungleGame.Game;

import JungleGame.IO.OutputHandler;

/**
 * Created by Douglas Liu on 4/4/2018.
 */
public class SaveCommand extends Command{
    public SaveCommand(String saveFile) {
        this.saveFile = saveFile;
    }

    @Override
    public boolean execute(Board board) {
        OutputHandler out = OutputHandler.getOutputHandler();

        if (board.save(saveFile)) {
            out.printPrompt("Game saved.\n");
            return true;
        } else {
            out.printPrompt("Fail to save.\n");
            return false;
        }
    }

    private String saveFile;
}
