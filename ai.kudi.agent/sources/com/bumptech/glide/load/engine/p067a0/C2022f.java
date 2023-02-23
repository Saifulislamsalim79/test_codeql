package com.bumptech.glide.load.engine.p067a0;

import android.content.Context;
import com.bumptech.glide.load.engine.p067a0.C2019d;
import java.io.File;
/* compiled from: InternalCacheDiskCacheFactory.java */
/* renamed from: com.bumptech.glide.load.engine.a0.f */
/* loaded from: classes2.dex */
public final class C2022f extends C2019d {

    /* compiled from: InternalCacheDiskCacheFactory.java */
    /* renamed from: com.bumptech.glide.load.engine.a0.f$a */
    /* loaded from: classes2.dex */
    class C2023a implements C2019d.InterfaceC2020a {

        /* renamed from: a */
        final /* synthetic */ Context f6124a;

        /* renamed from: b */
        final /* synthetic */ String f6125b;

        C2023a(Context context, String str) {
            this.f6124a = context;
            this.f6125b = str;
        }

        @Override // com.bumptech.glide.load.engine.p067a0.C2019d.InterfaceC2020a
        /* renamed from: a */
        public File mo33914a() {
            File cacheDir = this.f6124a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f6125b != null ? new File(cacheDir, this.f6125b) : cacheDir;
        }
    }

    public C2022f(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public C2022f(Context context, String str, long j) {
        super(new C2023a(context, str), j);
    }
}
