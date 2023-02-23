package io.intercom.com.bumptech.glide.load.p398m;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: StreamAssetPathFetcher.java */
/* renamed from: io.intercom.com.bumptech.glide.load.m.k */
/* loaded from: classes3.dex */
public class C10647k extends AbstractC10630a<InputStream> {
    public C10647k(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
    /* renamed from: a */
    public Class<InputStream> mo12474a() {
        return InputStream.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.intercom.com.bumptech.glide.load.p398m.AbstractC10630a
    /* renamed from: f */
    public void mo12578c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.intercom.com.bumptech.glide.load.p398m.AbstractC10630a
    /* renamed from: g */
    public InputStream mo12577d(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }
}
