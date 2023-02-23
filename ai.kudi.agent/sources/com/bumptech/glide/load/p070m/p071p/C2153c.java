package com.bumptech.glide.load.p070m.p071p;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C1943b;
import com.bumptech.glide.EnumC1949f;
import com.bumptech.glide.load.EnumC1993a;
import com.bumptech.glide.load.p070m.C2137g;
import com.bumptech.glide.load.p070m.InterfaceC2130d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ThumbFetcher.java */
/* renamed from: com.bumptech.glide.load.m.p.c */
/* loaded from: classes2.dex */
public class C2153c implements InterfaceC2130d<InputStream> {

    /* renamed from: c */
    private final Uri f6453c;

    /* renamed from: d */
    private final C2157e f6454d;

    /* renamed from: e */
    private InputStream f6455e;

    /* compiled from: ThumbFetcher.java */
    /* renamed from: com.bumptech.glide.load.m.p.c$a */
    /* loaded from: classes2.dex */
    static class C2154a implements InterfaceC2156d {

        /* renamed from: b */
        private static final String[] f6456b = {"_data"};

        /* renamed from: a */
        private final ContentResolver f6457a;

        C2154a(ContentResolver contentResolver) {
            this.f6457a = contentResolver;
        }

        @Override // com.bumptech.glide.load.p070m.p071p.InterfaceC2156d
        /* renamed from: a */
        public Cursor mo33612a(Uri uri) {
            return this.f6457a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f6456b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* compiled from: ThumbFetcher.java */
    /* renamed from: com.bumptech.glide.load.m.p.c$b */
    /* loaded from: classes2.dex */
    static class C2155b implements InterfaceC2156d {

        /* renamed from: b */
        private static final String[] f6458b = {"_data"};

        /* renamed from: a */
        private final ContentResolver f6459a;

        C2155b(ContentResolver contentResolver) {
            this.f6459a = contentResolver;
        }

        @Override // com.bumptech.glide.load.p070m.p071p.InterfaceC2156d
        /* renamed from: a */
        public Cursor mo33612a(Uri uri) {
            return this.f6459a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f6458b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    C2153c(Uri uri, C2157e c2157e) {
        this.f6453c = uri;
        this.f6454d = c2157e;
    }

    /* renamed from: c */
    private static C2153c m33616c(Context context, Uri uri, InterfaceC2156d interfaceC2156d) {
        return new C2153c(uri, new C2157e(ComponentCallbacks2C1943b.m34169c(context).m34162j().m34183g(), interfaceC2156d, ComponentCallbacks2C1943b.m34169c(context).m34167e(), context.getContentResolver()));
    }

    /* renamed from: d */
    public static C2153c m33615d(Context context, Uri uri) {
        return m33616c(context, uri, new C2154a(context.getContentResolver()));
    }

    /* renamed from: f */
    public static C2153c m33614f(Context context, Uri uri) {
        return m33616c(context, uri, new C2155b(context.getContentResolver()));
    }

    /* renamed from: g */
    private InputStream m33613g() throws FileNotFoundException {
        InputStream m33608d = this.f6454d.m33608d(this.f6453c);
        int m33611a = m33608d != null ? this.f6454d.m33611a(this.f6453c) : -1;
        return m33611a != -1 ? new C2137g(m33608d, m33611a) : m33608d;
    }

    @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
    /* renamed from: a */
    public Class<InputStream> mo33507a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
    /* renamed from: b */
    public void mo33506b() {
        InputStream inputStream = this.f6455e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
    /* renamed from: e */
    public void mo33503e(EnumC1949f enumC1949f, InterfaceC2130d.InterfaceC2131a<? super InputStream> interfaceC2131a) {
        try {
            InputStream m33613g = m33613g();
            this.f6455e = m33613g;
            interfaceC2131a.mo33545d(m33613g);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e);
            }
            interfaceC2131a.mo33546c(e);
        }
    }

    @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
    public EnumC1993a getDataSource() {
        return EnumC1993a.LOCAL;
    }
}
