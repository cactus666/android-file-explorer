package com.github.okamayana.filesys.mvp;

public interface BaseMvpView<T extends BaseMvpPresenter> {

    void setPresenter(T presenter);
}
