package io.intercom.com.bumptech.glide.load.engine.p397z;

import android.content.Context;
import io.intercom.com.bumptech.glide.load.engine.p397z.C10606d;
import java.io.File;
/* compiled from: InternalCacheDiskCacheFactory.java */
/* renamed from: io.intercom.com.bumptech.glide.load.engine.z.f */
/* loaded from: classes3.dex */
public final class C10609f extends C10606d {

    /* compiled from: InternalCacheDiskCacheFactory.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.engine.z.f$a */
    /* loaded from: classes3.dex */
    class C10610a implements C10606d.InterfaceC10607a {

        /* renamed from: a */
        final /* synthetic */ Context f24397a;

        /* renamed from: b */
        final /* synthetic */ String f24398b;

        C10610a(Context context, String str) {
            this.f24397a = context;
            this.f24398b = str;
        }

        @Override // io.intercom.com.bumptech.glide.load.engine.p397z.C10606d.InterfaceC10607a
        /* renamed from: a */
        public File mo12633a() {
            File cacheDir = this.f24397a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f24398b != null ? new File(cacheDir, this.f24398b) : cacheDir;
        }
    }

    public C10609f(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public C10609f(Context context, String str, long j) {
        super(new C10610a(context, str), j);
    }
}
