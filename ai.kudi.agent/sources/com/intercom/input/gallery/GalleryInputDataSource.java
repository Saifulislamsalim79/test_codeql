package com.intercom.input.gallery;

import java.util.List;
/* loaded from: classes2.dex */
public interface GalleryInputDataSource {

    /* loaded from: classes2.dex */
    public interface Listener {
        void onError();

        void onSuccess(List<GalleryImage> list);
    }

    int getCount();

    void getImages(int i, String str);

    int getPermissionStatus();

    boolean isLoading();

    void requestPermission();

    void setListener(Listener listener);
}
