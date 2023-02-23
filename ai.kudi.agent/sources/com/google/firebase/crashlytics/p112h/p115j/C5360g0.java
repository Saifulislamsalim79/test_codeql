package com.google.firebase.crashlytics.p112h.p115j;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.GZIPOutputStream;
/* compiled from: NativeSessionFileGzipper.java */
/* renamed from: com.google.firebase.crashlytics.h.j.g0 */
/* loaded from: classes2.dex */
class C5360g0 {
    /* renamed from: a */
    private static void m25054a(InputStream inputStream, File file) throws IOException {
        if (inputStream == null) {
            return;
        }
        byte[] bArr = new byte[8192];
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read > 0) {
                        gZIPOutputStream2.write(bArr, 0, read);
                    } else {
                        gZIPOutputStream2.finish();
                        C5373n.m24996f(gZIPOutputStream2);
                        return;
                    }
                } catch (Throwable th) {
                    th = th;
                    gZIPOutputStream = gZIPOutputStream2;
                    C5373n.m24996f(gZIPOutputStream);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m25053b(File file, List<InterfaceC5358f0> list) {
        for (InterfaceC5358f0 interfaceC5358f0 : list) {
            InputStream inputStream = null;
            try {
                inputStream = interfaceC5358f0.mo24829b();
                if (inputStream != null) {
                    m25054a(inputStream, new File(file, interfaceC5358f0.mo24830a()));
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                C5373n.m24996f(null);
                throw th;
            }
            C5373n.m24996f(inputStream);
        }
    }
}
