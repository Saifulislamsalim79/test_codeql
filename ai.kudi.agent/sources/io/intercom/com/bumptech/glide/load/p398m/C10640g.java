package io.intercom.com.bumptech.glide.load.p398m;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
/* compiled from: FileDescriptorLocalUriFetcher.java */
/* renamed from: io.intercom.com.bumptech.glide.load.m.g */
/* loaded from: classes3.dex */
public class C10640g extends AbstractC10646j<ParcelFileDescriptor> {
    public C10640g(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
    /* renamed from: a */
    public Class<ParcelFileDescriptor> mo12474a() {
        return ParcelFileDescriptor.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.intercom.com.bumptech.glide.load.p398m.AbstractC10646j
    /* renamed from: f */
    public void mo12574c(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.intercom.com.bumptech.glide.load.p398m.AbstractC10646j
    /* renamed from: g */
    public ParcelFileDescriptor mo12573d(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor.getParcelFileDescriptor();
        }
        throw new FileNotFoundException("FileDescriptor is null for: " + uri);
    }
}
