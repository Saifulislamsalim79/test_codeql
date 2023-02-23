package com.bumptech.glide.load.p072n;

import android.util.Log;
import com.bumptech.glide.load.C2122h;
import com.bumptech.glide.load.InterfaceC1996d;
import com.bumptech.glide.load.engine.p069z.InterfaceC2095b;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: StreamEncoder.java */
/* renamed from: com.bumptech.glide.load.n.t */
/* loaded from: classes2.dex */
public class C2216t implements InterfaceC1996d<InputStream> {

    /* renamed from: a */
    private final InterfaceC2095b f6542a;

    public C2216t(InterfaceC2095b interfaceC2095b) {
        this.f6542a = interfaceC2095b;
    }

    @Override // com.bumptech.glide.load.InterfaceC1996d
    /* renamed from: c */
    public boolean mo33388a(InputStream inputStream, File file, C2122h c2122h) {
        byte[] bArr = (byte[]) this.f6542a.mo33714e(65536, byte[].class);
        boolean z = false;
        FileOutputStream fileOutputStream = null;
        try {
            try {
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    while (true) {
                        try {
                            int read = inputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            fileOutputStream2.write(bArr, 0, read);
                        } catch (IOException e) {
                            e = e;
                            fileOutputStream = fileOutputStream2;
                            if (Log.isLoggable("StreamEncoder", 3)) {
                                Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            this.f6542a.mo33715d(bArr);
                            return z;
                        } catch (Throwable th) {
                            th = th;
                            fileOutputStream = fileOutputStream2;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException unused) {
                                }
                            }
                            this.f6542a.mo33715d(bArr);
                            throw th;
                        }
                    }
                    fileOutputStream2.close();
                    z = true;
                    fileOutputStream2.close();
                } catch (IOException unused2) {
                }
            } catch (IOException e2) {
                e = e2;
            }
            this.f6542a.mo33715d(bArr);
            return z;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
