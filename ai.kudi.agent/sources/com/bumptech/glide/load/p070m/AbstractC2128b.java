package com.bumptech.glide.load.p070m;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.EnumC1949f;
import com.bumptech.glide.load.EnumC1993a;
import com.bumptech.glide.load.p070m.InterfaceC2130d;
import java.io.IOException;
/* compiled from: AssetPathFetcher.java */
/* renamed from: com.bumptech.glide.load.m.b */
/* loaded from: classes2.dex */
public abstract class AbstractC2128b<T> implements InterfaceC2130d<T> {

    /* renamed from: c */
    private final String f6423c;

    /* renamed from: d */
    private final AssetManager f6424d;

    /* renamed from: e */
    private T f6425e;

    public AbstractC2128b(AssetManager assetManager, String str) {
        this.f6424d = assetManager;
        this.f6423c = str;
    }

    @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
    /* renamed from: b */
    public void mo33506b() {
        T t = this.f6425e;
        if (t == null) {
            return;
        }
        try {
            mo33634c(t);
        } catch (IOException unused) {
        }
    }

    /* renamed from: c */
    protected abstract void mo33634c(T t) throws IOException;

    @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
    public void cancel() {
    }

    /* renamed from: d */
    protected abstract T mo33633d(AssetManager assetManager, String str) throws IOException;

    @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
    /* renamed from: e */
    public void mo33503e(EnumC1949f enumC1949f, InterfaceC2130d.InterfaceC2131a<? super T> interfaceC2131a) {
        try {
            T mo33633d = mo33633d(this.f6424d, this.f6423c);
            this.f6425e = mo33633d;
            interfaceC2131a.mo33545d(mo33633d);
        } catch (IOException e) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
            }
            interfaceC2131a.mo33546c(e);
        }
    }

    @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
    public EnumC1993a getDataSource() {
        return EnumC1993a.LOCAL;
    }
}
