package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.EnumC1993a;
import com.bumptech.glide.load.EnumC1995c;
/* compiled from: DiskCacheStrategy.java */
/* renamed from: com.bumptech.glide.load.engine.j */
/* loaded from: classes2.dex */
public abstract class AbstractC2060j {

    /* renamed from: a */
    public static final AbstractC2060j f6252a = new C2061a();

    /* renamed from: b */
    public static final AbstractC2060j f6253b = new C2062b();

    /* renamed from: c */
    public static final AbstractC2060j f6254c = new C2063c();

    /* compiled from: DiskCacheStrategy.java */
    /* renamed from: com.bumptech.glide.load.engine.j$a */
    /* loaded from: classes2.dex */
    class C2061a extends AbstractC2060j {
        C2061a() {
        }

        @Override // com.bumptech.glide.load.engine.AbstractC2060j
        /* renamed from: a */
        public boolean mo33816a() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC2060j
        /* renamed from: b */
        public boolean mo33815b() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC2060j
        /* renamed from: c */
        public boolean mo33814c(EnumC1993a enumC1993a) {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC2060j
        /* renamed from: d */
        public boolean mo33813d(boolean z, EnumC1993a enumC1993a, EnumC1995c enumC1995c) {
            return false;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    /* renamed from: com.bumptech.glide.load.engine.j$b */
    /* loaded from: classes2.dex */
    class C2062b extends AbstractC2060j {
        C2062b() {
        }

        @Override // com.bumptech.glide.load.engine.AbstractC2060j
        /* renamed from: a */
        public boolean mo33816a() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC2060j
        /* renamed from: b */
        public boolean mo33815b() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC2060j
        /* renamed from: c */
        public boolean mo33814c(EnumC1993a enumC1993a) {
            return (enumC1993a == EnumC1993a.DATA_DISK_CACHE || enumC1993a == EnumC1993a.MEMORY_CACHE) ? false : true;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC2060j
        /* renamed from: d */
        public boolean mo33813d(boolean z, EnumC1993a enumC1993a, EnumC1995c enumC1995c) {
            return false;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    /* renamed from: com.bumptech.glide.load.engine.j$c */
    /* loaded from: classes2.dex */
    class C2063c extends AbstractC2060j {
        C2063c() {
        }

        @Override // com.bumptech.glide.load.engine.AbstractC2060j
        /* renamed from: a */
        public boolean mo33816a() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC2060j
        /* renamed from: b */
        public boolean mo33815b() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC2060j
        /* renamed from: c */
        public boolean mo33814c(EnumC1993a enumC1993a) {
            return enumC1993a == EnumC1993a.REMOTE;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC2060j
        /* renamed from: d */
        public boolean mo33813d(boolean z, EnumC1993a enumC1993a, EnumC1995c enumC1995c) {
            return ((z && enumC1993a == EnumC1993a.DATA_DISK_CACHE) || enumC1993a == EnumC1993a.LOCAL) && enumC1995c == EnumC1995c.TRANSFORMED;
        }
    }

    /* renamed from: a */
    public abstract boolean mo33816a();

    /* renamed from: b */
    public abstract boolean mo33815b();

    /* renamed from: c */
    public abstract boolean mo33814c(EnumC1993a enumC1993a);

    /* renamed from: d */
    public abstract boolean mo33813d(boolean z, EnumC1993a enumC1993a, EnumC1995c enumC1995c);
}
