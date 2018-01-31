package com.github.okamayana.filesys.mvp;

public interface BaseView<T extends BasePresenter> {

    void setPresenter(T presenter);
}
