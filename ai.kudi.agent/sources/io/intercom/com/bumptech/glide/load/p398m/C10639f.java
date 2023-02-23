package io.intercom.com.bumptech.glide.load.p398m;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
/* compiled from: FileDescriptorAssetPathFetcher.java */
/* renamed from: io.intercom.com.bumptech.glide.load.m.f */
/* loaded from: classes3.dex */
public class C10639f extends AbstractC10630a<ParcelFileDescriptor> {
    public C10639f(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
    /* renamed from: a */
    public Class<ParcelFileDescriptor> mo12474a() {
        return ParcelFileDescriptor.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.intercom.com.bumptech.glide.load.p398m.AbstractC10630a
    /* renamed from: f */
    public void mo12578c(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.intercom.com.bumptech.glide.load.p398m.AbstractC10630a
    /* renamed from: g */
    public ParcelFileDescriptor mo12577d(AssetManager assetManager, String str) throws IOException {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }
}
