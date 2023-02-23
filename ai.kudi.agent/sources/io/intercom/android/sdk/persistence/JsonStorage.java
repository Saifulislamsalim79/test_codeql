package io.intercom.android.sdk.persistence;

import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.twig.Twig;
import io.intercom.android.sdk.utilities.IoUtils;
import io.intercom.com.google.gson.C10916e;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class JsonStorage {
    private static final Twig TWIG = LumberMill.getLogger();
    private final C10916e gson;

    /* loaded from: classes3.dex */
    public interface LoadFailureHandler {
        public static final LoadFailureHandler NONE = new LoadFailureHandler() { // from class: io.intercom.android.sdk.persistence.JsonStorage.LoadFailureHandler.1
            @Override // io.intercom.android.sdk.persistence.JsonStorage.LoadFailureHandler
            public void onLoadFailed(File file, Exception exc) {
            }
        };

        void onLoadFailed(File file, Exception exc);
    }

    /* loaded from: classes3.dex */
    public interface LoadHandler<T> {
        void onLoad(T t);
    }

    public JsonStorage(C10916e c10916e) {
        this.gson = c10916e;
    }

    public int getDirectoryFileCount(File file) {
        String[] list = file.list();
        if (list == null) {
            return 0;
        }
        return list.length;
    }

    public <T> void loadFilesInDirectory(File file, Class<T> cls, LoadHandler<List<T>> loadHandler) {
        loadFilesInDirectory(file, cls, loadHandler, LoadFailureHandler.NONE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> void loadThenDelete(File file, Class<T> cls, LoadHandler<T> loadHandler) {
        FileReader fileReader = null;
        try {
            FileReader fileReader2 = new FileReader(file);
            try {
                loadHandler.onLoad(this.gson.m11963h(fileReader2, cls));
                IoUtils.safelyDelete(file);
                IoUtils.closeQuietly(fileReader2);
            } catch (Exception unused) {
                fileReader = fileReader2;
                IoUtils.safelyDelete(file);
                IoUtils.closeQuietly(fileReader);
            } catch (Throwable th) {
                th = th;
                fileReader = fileReader2;
                IoUtils.safelyDelete(file);
                IoUtils.closeQuietly(fileReader);
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void saveToFileAsJson(Object obj, File file) {
        FileWriter fileWriter;
        FileWriter fileWriter2 = null;
        try {
            try {
                if (file.exists() && !file.delete()) {
                    throw new RuntimeException("Couldn't delete existing file at " + file.getAbsolutePath());
                }
                File parentFile = file.getParentFile();
                if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                    throw new RuntimeException("Couldn't create missing parent dir at " + parentFile.getAbsolutePath());
                }
                fileWriter = new FileWriter(file);
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.gson.m11948w(obj, fileWriter);
            IoUtils.closeQuietly(fileWriter);
        } catch (Exception e2) {
            e = e2;
            fileWriter2 = fileWriter;
            Twig twig = TWIG;
            twig.internal("Couldn't save file to disk: " + e);
            IoUtils.closeQuietly(fileWriter2);
        } catch (Throwable th2) {
            th = th2;
            fileWriter2 = fileWriter;
            IoUtils.closeQuietly(fileWriter2);
            throw th;
        }
    }

    public <T> void loadFilesInDirectory(File file, Class<T> cls, LoadHandler<List<T>> loadHandler, LoadFailureHandler loadFailureHandler) {
        FileReader fileReader;
        Exception e;
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return;
        }
        List<T> arrayList = new ArrayList<>(listFiles.length);
        FileReader fileReader2 = null;
        for (File file2 : listFiles) {
            try {
                fileReader = new FileReader(file2);
                try {
                    try {
                        arrayList.add(this.gson.m11963h(fileReader, cls));
                    } catch (Throwable th) {
                        th = th;
                        fileReader2 = fileReader;
                        IoUtils.closeQuietly(fileReader2);
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    loadFailureHandler.onLoadFailed(file2, e);
                    IoUtils.closeQuietly(fileReader);
                    fileReader2 = fileReader;
                }
            } catch (Exception e3) {
                fileReader = fileReader2;
                e = e3;
            } catch (Throwable th2) {
                th = th2;
            }
            IoUtils.closeQuietly(fileReader);
            fileReader2 = fileReader;
        }
        loadHandler.onLoad(arrayList);
    }
}
