package bridge;

import camp.nextstep.edu.missionutils.Console;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {

    /**
     * 다리의 길이를 입력받는다.
     */
    public int readBridgeSize() {
        int bridgeSize = Integer.parseInt(getUserInputWithMessage(Messages.BRIDGE_SIZE_MESSAGE));
        return bridgeSize;
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving() {
        String movingDirection = getUserInputWithMessage(Messages.MOVING_DIRECTION_MESSAGE);
        return movingDirection;
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
        String gameCommand = getUserInputWithMessage(Messages.RETRY_CHOICE_MESSAGE);
        return gameCommand;
    }

    private String getUserInputWithMessage(String message) {
        System.out.println(message);
        return Console.readLine();
    }
}
