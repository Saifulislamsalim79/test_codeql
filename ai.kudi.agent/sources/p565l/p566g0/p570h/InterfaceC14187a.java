package p565l.p566g0.p570h;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import p576m.C14353l;
import p576m.InterfaceC14364r;
import p576m.InterfaceC14365s;
/* compiled from: FileSystem.java */
/* renamed from: l.g0.h.a */
/* loaded from: classes3.dex */
public interface InterfaceC14187a {

    /* renamed from: a */
    public static final InterfaceC14187a f31035a = new C14188a();

    /* compiled from: FileSystem.java */
    /* renamed from: l.g0.h.a$a */
    /* loaded from: classes3.dex */
    class C14188a implements InterfaceC14187a {
        C14188a() {
        }

        @Override // p565l.p566g0.p570h.InterfaceC14187a
        public InterfaceC14364r appendingSink(File file) throws FileNotFoundException {
            try {
                return C14353l.m2024a(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return C14353l.m2024a(file);
            }
        }

        @Override // p565l.p566g0.p570h.InterfaceC14187a
        public void delete(File file) throws IOException {
            if (file.delete() || !file.exists()) {
                return;
            }
            throw new IOException("failed to delete " + file);
        }

        @Override // p565l.p566g0.p570h.InterfaceC14187a
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

        @Override // p565l.p566g0.p570h.InterfaceC14187a
        public boolean exists(File file) {
            return file.exists();
        }

        @Override // p565l.p566g0.p570h.InterfaceC14187a
        public void rename(File file, File file2) throws IOException {
            delete(file2);
            if (file.renameTo(file2)) {
                return;
            }
            throw new IOException("failed to rename " + file + " to " + file2);
        }

        @Override // p565l.p566g0.p570h.InterfaceC14187a
        public InterfaceC14364r sink(File file) throws FileNotFoundException {
            try {
                return C14353l.m2019f(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return C14353l.m2019f(file);
            }
        }

        @Override // p565l.p566g0.p570h.InterfaceC14187a
        public long size(File file) {
            return file.length();
        }

        @Override // p565l.p566g0.p570h.InterfaceC14187a
        public InterfaceC14365s source(File file) throws FileNotFoundException {
            return C14353l.m2015j(file);
        }
    }

    InterfaceC14364r appendingSink(File file) throws FileNotFoundException;

    void delete(File file) throws IOException;

    void deleteContents(File file) throws IOException;

    boolean exists(File file);

    void rename(File file, File file2) throws IOException;

    InterfaceC14364r sink(File file) throws FileNotFoundException;

    long size(File file);

    InterfaceC14365s source(File file) throws FileNotFoundException;
}
