package com.github.okamayana.filesys.mvp.directories;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Collection;
import java.util.List;

public class DirectoriesFragment extends Fragment implements DirectoriesContract.View {

    private DirectoriesContract.Presenter presenter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void setPresenter(DirectoriesContract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void showLoadingView(boolean visible) {

    }

    @Override
    public void showFiles(Collection<DirectoriesContract.Model> models) {

    }

    @Override
    public void showFileDetails(DirectoriesContract.Model model) {

    }

    @Override
    public void updateCurrentPathLabel(List<String> pathDirectories) {

    }

    @Override
    public void changeDirectoryViewType(DirectoryViewType directoryViewType) {

    }
}
