package io.intercom.com.bumptech.glide.load.p398m.p399m;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import io.intercom.com.bumptech.glide.ComponentCallbacks2C10478c;
import io.intercom.com.bumptech.glide.EnumC10482g;
import io.intercom.com.bumptech.glide.load.EnumC10507a;
import io.intercom.com.bumptech.glide.load.p398m.C10638e;
import io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ThumbFetcher.java */
/* renamed from: io.intercom.com.bumptech.glide.load.m.m.c */
/* loaded from: classes3.dex */
public class C10651c implements InterfaceC10631b<InputStream> {

    /* renamed from: c */
    private final Uri f24449c;

    /* renamed from: d */
    private final C10655e f24450d;

    /* renamed from: e */
    private InputStream f24451e;

    /* compiled from: ThumbFetcher.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.m.m.c$a */
    /* loaded from: classes3.dex */
    static class C10652a implements InterfaceC10654d {

        /* renamed from: b */
        private static final String[] f24452b = {"_data"};

        /* renamed from: a */
        private final ContentResolver f24453a;

        C10652a(ContentResolver contentResolver) {
            this.f24453a = contentResolver;
        }

        @Override // io.intercom.com.bumptech.glide.load.p398m.p399m.InterfaceC10654d
        /* renamed from: a */
        public Cursor mo12556a(Uri uri) {
            return this.f24453a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f24452b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* compiled from: ThumbFetcher.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.m.m.c$b */
    /* loaded from: classes3.dex */
    static class C10653b implements InterfaceC10654d {

        /* renamed from: b */
        private static final String[] f24454b = {"_data"};

        /* renamed from: a */
        private final ContentResolver f24455a;

        C10653b(ContentResolver contentResolver) {
            this.f24455a = contentResolver;
        }

        @Override // io.intercom.com.bumptech.glide.load.p398m.p399m.InterfaceC10654d
        /* renamed from: a */
        public Cursor mo12556a(Uri uri) {
            return this.f24455a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f24454b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    C10651c(Uri uri, C10655e c10655e) {
        this.f24449c = uri;
        this.f24450d = c10655e;
    }

    /* renamed from: c */
    private static C10651c m12560c(Context context, Uri uri, InterfaceC10654d interfaceC10654d) {
        return new C10651c(uri, new C10655e(ComponentCallbacks2C10478c.m13034c(context).m13027j().m13050g(), interfaceC10654d, ComponentCallbacks2C10478c.m13034c(context).m13032e(), context.getContentResolver()));
    }

    /* renamed from: d */
    public static C10651c m12559d(Context context, Uri uri) {
        return m12560c(context, uri, new C10652a(context.getContentResolver()));
    }

    /* renamed from: f */
    public static C10651c m12558f(Context context, Uri uri) {
        return m12560c(context, uri, new C10653b(context.getContentResolver()));
    }

    /* renamed from: g */
    private InputStream m12557g() throws FileNotFoundException {
        InputStream m12554b = this.f24450d.m12554b(this.f24449c);
        int m12555a = m12554b != null ? this.f24450d.m12555a(this.f24449c) : -1;
        return m12555a != -1 ? new C10638e(m12554b, m12555a) : m12554b;
    }

    @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
    /* renamed from: a */
    public Class<InputStream> mo12474a() {
        return InputStream.class;
    }

    @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
    /* renamed from: b */
    public void mo12473b() {
        InputStream inputStream = this.f24451e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
    public void cancel() {
    }

    @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
    /* renamed from: e */
    public void mo12472e(EnumC10482g enumC10482g, InterfaceC10631b.InterfaceC10632a<? super InputStream> interfaceC10632a) {
        try {
            InputStream m12557g = m12557g();
            this.f24451e = m12557g;
            interfaceC10632a.mo12496d(m12557g);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e);
            }
            interfaceC10632a.mo12497c(e);
        }
    }

    @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
    public EnumC10507a getDataSource() {
        return EnumC10507a.LOCAL;
    }
}
