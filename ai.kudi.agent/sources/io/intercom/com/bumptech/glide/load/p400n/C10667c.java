package io.intercom.com.bumptech.glide.load.p400n;

import android.util.Log;
import io.intercom.com.bumptech.glide.load.C10626i;
import io.intercom.com.bumptech.glide.load.InterfaceC10510d;
import io.intercom.com.bumptech.glide.p416r.C10883a;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: ByteBufferEncoder.java */
/* renamed from: io.intercom.com.bumptech.glide.load.n.c */
/* loaded from: classes3.dex */
public class C10667c implements InterfaceC10510d<ByteBuffer> {
    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10510d
    /* renamed from: c */
    public boolean mo12306b(ByteBuffer byteBuffer, File file, C10626i c10626i) {
        try {
            C10883a.m12040d(byteBuffer, file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e);
            }
            return false;
        }
    }
}
