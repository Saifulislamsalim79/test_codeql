package com.bumptech.glide.load.p074o.p078g;

import android.util.Log;
import com.bumptech.glide.load.C2122h;
import com.bumptech.glide.load.EnumC1995c;
import com.bumptech.glide.load.InterfaceC2125k;
import com.bumptech.glide.load.engine.InterfaceC2087u;
import com.bumptech.glide.p086q.C2367a;
import java.io.File;
import java.io.IOException;
/* compiled from: GifDrawableEncoder.java */
/* renamed from: com.bumptech.glide.load.o.g.d */
/* loaded from: classes2.dex */
public class C2267d implements InterfaceC2125k<C2265c> {
    @Override // com.bumptech.glide.load.InterfaceC2125k
    /* renamed from: b */
    public EnumC1995c mo33387b(C2122h c2122h) {
        return EnumC1995c.SOURCE;
    }

    @Override // com.bumptech.glide.load.InterfaceC1996d
    /* renamed from: c */
    public boolean mo33388a(InterfaceC2087u<C2265c> interfaceC2087u, File file, C2122h c2122h) {
        try {
            C2367a.m33156e(interfaceC2087u.get().m33454c(), file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            }
            return false;
        }
    }
}
