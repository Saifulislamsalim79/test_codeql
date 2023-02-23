package com.bumptech.glide.load.p070m;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
/* compiled from: FileDescriptorAssetPathFetcher.java */
/* renamed from: com.bumptech.glide.load.m.h */
/* loaded from: classes2.dex */
public class C2138h extends AbstractC2128b<ParcelFileDescriptor> {
    public C2138h(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
    /* renamed from: a */
    public Class<ParcelFileDescriptor> mo33507a() {
        return ParcelFileDescriptor.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.p070m.AbstractC2128b
    /* renamed from: f */
    public void mo33634c(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.p070m.AbstractC2128b
    /* renamed from: g */
    public ParcelFileDescriptor mo33633d(AssetManager assetManager, String str) throws IOException {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }
}
