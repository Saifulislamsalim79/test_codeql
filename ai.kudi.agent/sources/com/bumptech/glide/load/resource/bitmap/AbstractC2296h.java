package com.bumptech.glide.load.resource.bitmap;

import android.os.Build;
import com.bumptech.glide.load.C2119g;
/* compiled from: DownsampleStrategy.java */
/* renamed from: com.bumptech.glide.load.resource.bitmap.h */
/* loaded from: classes2.dex */
public abstract class AbstractC2296h {

    /* renamed from: a */
    public static final AbstractC2296h f6676a = new C2298b();

    /* renamed from: b */
    public static final AbstractC2296h f6677b = new C2297a();

    /* renamed from: c */
    public static final AbstractC2296h f6678c = new C2299c();

    /* renamed from: d */
    public static final AbstractC2296h f6679d;

    /* renamed from: e */
    public static final C2119g<AbstractC2296h> f6680e;

    /* renamed from: f */
    static final boolean f6681f;

    /* compiled from: DownsampleStrategy.java */
    /* renamed from: com.bumptech.glide.load.resource.bitmap.h$a */
    /* loaded from: classes2.dex */
    private static class C2297a extends AbstractC2296h {
        C2297a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC2296h
        /* renamed from: a */
        public EnumC2300d mo33377a(int i, int i2, int i3, int i4) {
            return EnumC2300d.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC2296h
        /* renamed from: b */
        public float mo33376b(int i, int i2, int i3, int i4) {
            return Math.max(i3 / i, i4 / i2);
        }
    }

    /* compiled from: DownsampleStrategy.java */
    /* renamed from: com.bumptech.glide.load.resource.bitmap.h$b */
    /* loaded from: classes2.dex */
    private static class C2298b extends AbstractC2296h {
        C2298b() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC2296h
        /* renamed from: a */
        public EnumC2300d mo33377a(int i, int i2, int i3, int i4) {
            if (AbstractC2296h.f6681f) {
                return EnumC2300d.QUALITY;
            }
            return EnumC2300d.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC2296h
        /* renamed from: b */
        public float mo33376b(int i, int i2, int i3, int i4) {
            if (AbstractC2296h.f6681f) {
                return Math.min(i3 / i, i4 / i2);
            }
            int max = Math.max(i2 / i4, i / i3);
            if (max == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(max);
        }
    }

    /* compiled from: DownsampleStrategy.java */
    /* renamed from: com.bumptech.glide.load.resource.bitmap.h$c */
    /* loaded from: classes2.dex */
    private static class C2299c extends AbstractC2296h {
        C2299c() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC2296h
        /* renamed from: a */
        public EnumC2300d mo33377a(int i, int i2, int i3, int i4) {
            return EnumC2300d.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC2296h
        /* renamed from: b */
        public float mo33376b(int i, int i2, int i3, int i4) {
            return 1.0f;
        }
    }

    /* compiled from: DownsampleStrategy.java */
    /* renamed from: com.bumptech.glide.load.resource.bitmap.h$d */
    /* loaded from: classes2.dex */
    public enum EnumC2300d {
        MEMORY,
        QUALITY
    }

    static {
        AbstractC2296h abstractC2296h = f6677b;
        f6679d = abstractC2296h;
        f6680e = C2119g.m33663f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", abstractC2296h);
        f6681f = Build.VERSION.SDK_INT >= 19;
    }

    /* renamed from: a */
    public abstract EnumC2300d mo33377a(int i, int i2, int i3, int i4);

    /* renamed from: b */
    public abstract float mo33376b(int i, int i2, int i3, int i4);
}
