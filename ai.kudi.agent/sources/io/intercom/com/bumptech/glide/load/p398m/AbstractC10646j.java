package io.intercom.com.bumptech.glide.load.p398m;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import io.intercom.com.bumptech.glide.EnumC10482g;
import io.intercom.com.bumptech.glide.load.EnumC10507a;
import io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b;
import java.io.FileNotFoundException;
import java.io.IOException;
/* compiled from: LocalUriFetcher.java */
/* renamed from: io.intercom.com.bumptech.glide.load.m.j */
/* loaded from: classes3.dex */
public abstract class AbstractC10646j<T> implements InterfaceC10631b<T> {

    /* renamed from: c */
    private final Uri f24445c;

    /* renamed from: d */
    private final ContentResolver f24446d;

    /* renamed from: e */
    private T f24447e;

    public AbstractC10646j(ContentResolver contentResolver, Uri uri) {
        this.f24446d = contentResolver;
        this.f24445c = uri;
    }

    @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
    /* renamed from: b */
    public void mo12473b() {
        T t = this.f24447e;
        if (t != null) {
            try {
                mo12574c(t);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: c */
    protected abstract void mo12574c(T t) throws IOException;

    @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
    public void cancel() {
    }

    /* renamed from: d */
    protected abstract T mo12573d(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;

    @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
    /* renamed from: e */
    public final void mo12472e(EnumC10482g enumC10482g, InterfaceC10631b.InterfaceC10632a<? super T> interfaceC10632a) {
        try {
            T mo12573d = mo12573d(this.f24445c, this.f24446d);
            this.f24447e = mo12573d;
            interfaceC10632a.mo12496d(mo12573d);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e);
            }
            interfaceC10632a.mo12497c(e);
        }
    }

    @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
    public EnumC10507a getDataSource() {
        return EnumC10507a.LOCAL;
    }
}
