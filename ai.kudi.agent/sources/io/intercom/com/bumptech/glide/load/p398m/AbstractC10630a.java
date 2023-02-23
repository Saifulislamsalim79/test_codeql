package io.intercom.com.bumptech.glide.load.p398m;

import android.content.res.AssetManager;
import android.util.Log;
import io.intercom.com.bumptech.glide.EnumC10482g;
import io.intercom.com.bumptech.glide.load.EnumC10507a;
import io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b;
import java.io.IOException;
/* compiled from: AssetPathFetcher.java */
/* renamed from: io.intercom.com.bumptech.glide.load.m.a */
/* loaded from: classes3.dex */
public abstract class AbstractC10630a<T> implements InterfaceC10631b<T> {

    /* renamed from: c */
    private final String f24425c;

    /* renamed from: d */
    private final AssetManager f24426d;

    /* renamed from: e */
    private T f24427e;

    public AbstractC10630a(AssetManager assetManager, String str) {
        this.f24426d = assetManager;
        this.f24425c = str;
    }

    @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
    /* renamed from: b */
    public void mo12473b() {
        T t = this.f24427e;
        if (t == null) {
            return;
        }
        try {
            mo12578c(t);
        } catch (IOException unused) {
        }
    }

    /* renamed from: c */
    protected abstract void mo12578c(T t) throws IOException;

    @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
    public void cancel() {
    }

    /* renamed from: d */
    protected abstract T mo12577d(AssetManager assetManager, String str) throws IOException;

    @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
    /* renamed from: e */
    public void mo12472e(EnumC10482g enumC10482g, InterfaceC10631b.InterfaceC10632a<? super T> interfaceC10632a) {
        try {
            T mo12577d = mo12577d(this.f24426d, this.f24425c);
            this.f24427e = mo12577d;
            interfaceC10632a.mo12496d(mo12577d);
        } catch (IOException e) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
            }
            interfaceC10632a.mo12497c(e);
        }
    }

    @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
    public EnumC10507a getDataSource() {
        return EnumC10507a.LOCAL;
    }
}
