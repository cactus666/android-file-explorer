package com.github.okamayana.filesys.mvp.directories;

import com.github.okamayana.filesys.mvp.BaseMvpPresenter;
import com.github.okamayana.filesys.mvp.BaseMvpView;

import java.io.File;
import java.util.Collection;
import java.util.List;

import lombok.Builder;
import lombok.Value;

import static com.github.okamayana.filesys.util.Checks.checkNotNull;

public interface DirectoriesContract {

    interface View extends BaseMvpView<Presenter> {

        void showLoadingView(boolean visible);

        void showFiles(Collection<Model> models);

        void showFileDetails(Model model);

        void updateCurrentPathLabel(List<String> pathDirectories);

        void changeDirectoryViewType(DirectoryViewType directoryViewType);
    }

    interface Presenter extends BaseMvpPresenter {

        void navigateTo(String path);

        void navigateUp();

        void delete(Model... models);

        void rename(Model model, String newFileName);

        void openDetails(Model model);
    }

    @Value
    @Builder
    class Model {
        String canonicalPath;
        String name;
        long sizeInBytes;
        boolean isDirectory;
        List<Model> children;
        List<Boolean> userPermissions;
        List<Boolean> groupPermissions;
        List<Boolean> ownerPermissions;
        String ownerUserName;
        String ownerGroupName;

        public static File toFile(Model model) {
            checkNotNull(model);
            return new File(model.canonicalPath);
        }
    }
}
