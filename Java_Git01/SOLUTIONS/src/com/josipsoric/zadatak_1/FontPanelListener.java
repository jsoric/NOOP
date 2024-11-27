package com.josipsoric.zadatak_1;

import java.util.EventListener;

public interface FontPanelListener extends EventListener {

    void fontSettings(String fontName, int fontSize);
    void resetSettings(String call);
}
