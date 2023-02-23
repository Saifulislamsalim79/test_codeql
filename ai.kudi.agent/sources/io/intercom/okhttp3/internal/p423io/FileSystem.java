package io.intercom.okhttp3.internal.p423io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import p425j.p429b.p433b.C11158l;
import p425j.p429b.p433b.InterfaceC11169r;
import p425j.p429b.p433b.InterfaceC11170s;
/* renamed from: io.intercom.okhttp3.internal.io.FileSystem */
/* loaded from: classes3.dex */
public interface FileSystem {
    public static final FileSystem SYSTEM = new FileSystem() { // from class: io.intercom.okhttp3.internal.io.FileSystem.1
        @Override // io.intercom.okhttp3.internal.p423io.FileSystem
        public InterfaceC11169r appendingSink(File file) throws FileNotFoundException {
            try {
                return C11158l.m11529a(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return C11158l.m11529a(file);
            }
        }

        @Override // io.intercom.okhttp3.internal.p423io.FileSystem
        public void delete(File file) throws IOException {
            if (file.delete() || !file.exists()) {
                return;
            }
            throw new IOException("failed to delete " + file);
        }

        @Override // io.intercom.okhttp3.internal.p423io.FileSystem
        public void deleteContents(File file) throws IOException {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        deleteContents(file2);
                    }
                    if (!file2.delete()) {
                        throw new IOException("failed to delete " + file2);
                    }
                }
                return;
            }
            throw new IOException("not a readable directory: " + file);
        }

        @Override // io.intercom.okhttp3.internal.p423io.FileSystem
        public boolean exists(File file) {
            return file.exists();
        }

        @Override // io.intercom.okhttp3.internal.p423io.FileSystem
        public void rename(File file, File file2) throws IOException {
            delete(file2);
            if (file.renameTo(file2)) {
                return;
            }
            throw new IOException("failed to rename " + file + " to " + file2);
        }

        @Override // io.intercom.okhttp3.internal.p423io.FileSystem
        public InterfaceC11169r sink(File file) throws FileNotFoundException {
            try {
                return C11158l.m11524f(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return C11158l.m11524f(file);
            }
        }

        @Override // io.intercom.okhttp3.internal.p423io.FileSystem
        public long size(File file) {
            return file.length();
        }

        @Override // io.intercom.okhttp3.internal.p423io.FileSystem
        public InterfaceC11170s source(File file) throws FileNotFoundException {
            return C11158l.m11520j(file);
        }
    };

    InterfaceC11169r appendingSink(File file) throws FileNotFoundException;

    void delete(File file) throws IOException;

    void deleteContents(File file) throws IOException;

    boolean exists(File file);

    void rename(File file, File file2) throws IOException;

    InterfaceC11169r sink(File file) throws FileNotFoundException;

    long size(File file);

    InterfaceC11170s source(File file) throws FileNotFoundException;
}
