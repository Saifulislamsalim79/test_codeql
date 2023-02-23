package com.bumptech.glide.load.p070m;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.EnumC1949f;
import com.bumptech.glide.load.EnumC1993a;
import com.bumptech.glide.load.p070m.InterfaceC2130d;
import java.io.FileNotFoundException;
import java.io.IOException;
/* compiled from: LocalUriFetcher.java */
/* renamed from: com.bumptech.glide.load.m.l */
/* loaded from: classes2.dex */
public abstract class AbstractC2145l<T> implements InterfaceC2130d<T> {

    /* renamed from: c */
    private final Uri f6447c;

    /* renamed from: d */
    private final ContentResolver f6448d;

    /* renamed from: e */
    private T f6449e;

    public AbstractC2145l(ContentResolver contentResolver, Uri uri) {
        this.f6448d = contentResolver;
        this.f6447c = uri;
    }

    @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
    /* renamed from: b */
    public void mo33506b() {
        T t = this.f6449e;
        if (t != null) {
            try {
                mo33630c(t);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: c */
    protected abstract void mo33630c(T t) throws IOException;

    @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
    public void cancel() {
    }

    /* renamed from: d */
    protected abstract T mo33629d(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;

    @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
    /* renamed from: e */
    public final void mo33503e(EnumC1949f enumC1949f, InterfaceC2130d.InterfaceC2131a<? super T> interfaceC2131a) {
        try {
            T mo33629d = mo33629d(this.f6447c, this.f6448d);
            this.f6449e = mo33629d;
            interfaceC2131a.mo33545d(mo33629d);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e);
            }
            interfaceC2131a.mo33546c(e);
        }
    }

    @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
    public EnumC1993a getDataSource() {
        return EnumC1993a.LOCAL;
    }
}
