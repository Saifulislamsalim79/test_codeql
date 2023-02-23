package io.intercom.com.bumptech.glide.load.p400n;

import android.util.Log;
import io.intercom.com.bumptech.glide.load.C10626i;
import io.intercom.com.bumptech.glide.load.InterfaceC10510d;
import io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10576b;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: StreamEncoder.java */
/* renamed from: io.intercom.com.bumptech.glide.load.n.t */
/* loaded from: classes3.dex */
public class C10713t implements InterfaceC10510d<InputStream> {

    /* renamed from: a */
    private final InterfaceC10576b f24534a;

    public C10713t(InterfaceC10576b interfaceC10576b) {
        this.f24534a = interfaceC10576b;
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10510d
    /* renamed from: c */
    public boolean mo12306b(InputStream inputStream, File file, C10626i c10626i) {
        byte[] bArr = (byte[]) this.f24534a.mo12686e(65536, byte[].class);
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
                            this.f24534a.mo12687d(bArr);
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
                            this.f24534a.mo12687d(bArr);
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
            this.f24534a.mo12687d(bArr);
            return z;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
