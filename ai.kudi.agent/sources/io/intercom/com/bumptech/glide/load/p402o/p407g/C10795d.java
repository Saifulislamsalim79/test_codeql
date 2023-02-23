package io.intercom.com.bumptech.glide.load.p402o.p407g;

import android.util.Log;
import io.intercom.com.bumptech.glide.load.C10626i;
import io.intercom.com.bumptech.glide.load.EnumC10509c;
import io.intercom.com.bumptech.glide.load.InterfaceC10628k;
import io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t;
import io.intercom.com.bumptech.glide.p416r.C10883a;
import java.io.File;
import java.io.IOException;
/* compiled from: GifDrawableEncoder.java */
/* renamed from: io.intercom.com.bumptech.glide.load.o.g.d */
/* loaded from: classes3.dex */
public class C10795d implements InterfaceC10628k<C10793c> {
    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10628k
    /* renamed from: a */
    public EnumC10509c mo12307a(C10626i c10626i) {
        return EnumC10509c.SOURCE;
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10510d
    /* renamed from: c */
    public boolean mo12306b(InterfaceC10569t<C10793c> interfaceC10569t, File file, C10626i c10626i) {
        try {
            C10883a.m12040d(interfaceC10569t.get().m12319c(), file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            }
            return false;
        }
    }
}
