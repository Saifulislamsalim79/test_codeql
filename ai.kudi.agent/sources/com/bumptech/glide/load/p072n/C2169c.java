package com.bumptech.glide.load.p072n;

import android.util.Log;
import com.bumptech.glide.load.C2122h;
import com.bumptech.glide.load.InterfaceC1996d;
import com.bumptech.glide.p086q.C2367a;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: ByteBufferEncoder.java */
/* renamed from: com.bumptech.glide.load.n.c */
/* loaded from: classes2.dex */
public class C2169c implements InterfaceC1996d<ByteBuffer> {
    @Override // com.bumptech.glide.load.InterfaceC1996d
    /* renamed from: c */
    public boolean mo33388a(ByteBuffer byteBuffer, File file, C2122h c2122h) {
        try {
            C2367a.m33156e(byteBuffer, file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e);
            }
            return false;
        }
    }
}
