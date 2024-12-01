package com.josipsoric.zadatak_3.strategy;

import java.util.EventListener;

public interface FormPanelListener extends EventListener {

    void sendButtonAction(String data);
}
