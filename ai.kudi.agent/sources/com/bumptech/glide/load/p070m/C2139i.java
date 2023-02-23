package com.bumptech.glide.load.p070m;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
/* compiled from: FileDescriptorLocalUriFetcher.java */
/* renamed from: com.bumptech.glide.load.m.i */
/* loaded from: classes2.dex */
public class C2139i extends AbstractC2145l<ParcelFileDescriptor> {
    public C2139i(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
    /* renamed from: a */
    public Class<ParcelFileDescriptor> mo33507a() {
        return ParcelFileDescriptor.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.p070m.AbstractC2145l
    /* renamed from: f */
    public void mo33630c(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.p070m.AbstractC2145l
    /* renamed from: g */
    public ParcelFileDescriptor mo33629d(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor.getParcelFileDescriptor();
        }
        throw new FileNotFoundException("FileDescriptor is null for: " + uri);
    }
}
