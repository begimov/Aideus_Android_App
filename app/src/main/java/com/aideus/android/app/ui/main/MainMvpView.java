package com.aideus.android.app.ui.main;

import java.util.List;

import com.aideus.android.app.data.model.Ribot;
import com.aideus.android.app.ui.base.MvpView;

public interface MainMvpView extends MvpView {

    void showRibots(List<Ribot> ribots);

    void showRibotsEmpty();

    void showError();

}
