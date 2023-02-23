package com.bumptech.glide.load.p070m;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
/* compiled from: AssetFileDescriptorLocalUriFetcher.java */
/* renamed from: com.bumptech.glide.load.m.a */
/* loaded from: classes2.dex */
public final class C2127a extends AbstractC2145l<AssetFileDescriptor> {
    public C2127a(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
    /* renamed from: a */
    public Class<AssetFileDescriptor> mo33507a() {
        return AssetFileDescriptor.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.p070m.AbstractC2145l
    /* renamed from: f */
    public void mo33630c(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.p070m.AbstractC2145l
    /* renamed from: g */
    public AssetFileDescriptor mo33629d(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor;
        }
        throw new FileNotFoundException("FileDescriptor is null for: " + uri);
    }
}
