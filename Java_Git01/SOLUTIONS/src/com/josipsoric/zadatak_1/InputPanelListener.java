package com.josipsoric.zadatak_1;

import java.util.EventListener;

public interface InputPanelListener extends EventListener {

    void sendButtonClick(String input);
}
