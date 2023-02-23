package com.bumptech.glide.load.p070m;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: StreamAssetPathFetcher.java */
/* renamed from: com.bumptech.glide.load.m.n */
/* loaded from: classes2.dex */
public class C2149n extends AbstractC2128b<InputStream> {
    public C2149n(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
    /* renamed from: a */
    public Class<InputStream> mo33507a() {
        return InputStream.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.p070m.AbstractC2128b
    /* renamed from: f */
    public void mo33634c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.p070m.AbstractC2128b
    /* renamed from: g */
    public InputStream mo33633d(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }
}
