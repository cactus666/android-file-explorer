package com.github.okamayana.filesys.directories;

import com.github.okamayana.filesys.mvp.BasePresenter;
import com.github.okamayana.filesys.mvp.BaseView;

import java.io.File;
import java.util.Collection;
import java.util.List;

public interface DirectoriesContract {

    interface View extends BaseView<Presenter> {

        void showLoadingView(boolean visible);

        void showDirectoryFiles(Collection<File> files);

        void showFileDetails(File file);

        void updateCurrentPathLabel(List<String> pathDirectories);

        void changeDirectoryViewType(DirectoryViewType directoryViewType);
    }

    interface Presenter extends BasePresenter {

        void loadFiles(String path);

        void deleteFile(File... file);
    }
}
