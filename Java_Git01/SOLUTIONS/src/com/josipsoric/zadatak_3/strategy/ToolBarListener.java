package com.josipsoric.zadatak_3.strategy;

import java.util.EventListener;

public interface ToolBarListener extends EventListener {

    void toolBarBtnClick(String btnName);
}
