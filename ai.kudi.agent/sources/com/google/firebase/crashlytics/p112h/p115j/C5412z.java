package com.google.firebase.crashlytics.p112h.p115j;

import com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
/* compiled from: FileBackedNativeSessionFile.java */
/* renamed from: com.google.firebase.crashlytics.h.j.z */
/* loaded from: classes2.dex */
class C5412z implements InterfaceC5358f0 {

    /* renamed from: a */
    private final File f13367a;

    /* renamed from: b */
    private final String f13368b;

    /* renamed from: c */
    private final String f13369c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5412z(String str, String str2, File file) {
        this.f13368b = str;
        this.f13369c = str2;
        this.f13367a = file;
    }

    /* renamed from: d */
    private byte[] m24827d() {
        byte[] bArr = new byte[8192];
        try {
            InputStream mo24829b = mo24829b();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            if (mo24829b == null) {
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                if (mo24829b != null) {
                    mo24829b.close();
                }
                return null;
            }
            while (true) {
                try {
                    int read = mo24829b.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    gZIPOutputStream.write(bArr, 0, read);
                } catch (Throwable th) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            gZIPOutputStream.finish();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            if (mo24829b != null) {
                mo24829b.close();
            }
            return byteArray;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // com.google.firebase.crashlytics.p112h.p115j.InterfaceC5358f0
    /* renamed from: a */
    public String mo24830a() {
        return this.f13369c;
    }

    @Override // com.google.firebase.crashlytics.p112h.p115j.InterfaceC5358f0
    /* renamed from: b */
    public InputStream mo24829b() {
        if (this.f13367a.exists() && this.f13367a.isFile()) {
            try {
                return new FileInputStream(this.f13367a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    @Override // com.google.firebase.crashlytics.p112h.p115j.InterfaceC5358f0
    /* renamed from: c */
    public AbstractC5448a0.AbstractC5454d.AbstractC5456b mo24828c() {
        byte[] m24827d = m24827d();
        if (m24827d != null) {
            AbstractC5448a0.AbstractC5454d.AbstractC5456b.AbstractC5457a m24754a = AbstractC5448a0.AbstractC5454d.AbstractC5456b.m24754a();
            m24754a.mo24646b(m24827d);
            m24754a.mo24645c(this.f13368b);
            return m24754a.mo24647a();
        }
        return null;
    }
}
