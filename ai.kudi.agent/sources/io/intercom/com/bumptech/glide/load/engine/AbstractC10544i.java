package io.intercom.com.bumptech.glide.load.engine;

import io.intercom.com.bumptech.glide.load.EnumC10507a;
import io.intercom.com.bumptech.glide.load.EnumC10509c;
/* compiled from: DiskCacheStrategy.java */
/* renamed from: io.intercom.com.bumptech.glide.load.engine.i */
/* loaded from: classes3.dex */
public abstract class AbstractC10544i {

    /* renamed from: a */
    public static final AbstractC10544i f24236a = new C10545a();

    /* renamed from: b */
    public static final AbstractC10544i f24237b = new C10546b();

    /* renamed from: c */
    public static final AbstractC10544i f24238c = new C10547c();

    /* renamed from: d */
    public static final AbstractC10544i f24239d = new C10548d();

    /* compiled from: DiskCacheStrategy.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.engine.i$a */
    /* loaded from: classes3.dex */
    static class C10545a extends AbstractC10544i {
        C10545a() {
        }

        @Override // io.intercom.com.bumptech.glide.load.engine.AbstractC10544i
        /* renamed from: a */
        public boolean mo12775a() {
            return false;
        }

        @Override // io.intercom.com.bumptech.glide.load.engine.AbstractC10544i
        /* renamed from: b */
        public boolean mo12774b() {
            return false;
        }

        @Override // io.intercom.com.bumptech.glide.load.engine.AbstractC10544i
        /* renamed from: c */
        public boolean mo12773c(EnumC10507a enumC10507a) {
            return false;
        }

        @Override // io.intercom.com.bumptech.glide.load.engine.AbstractC10544i
        /* renamed from: d */
        public boolean mo12772d(boolean z, EnumC10507a enumC10507a, EnumC10509c enumC10509c) {
            return false;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.engine.i$b */
    /* loaded from: classes3.dex */
    static class C10546b extends AbstractC10544i {
        C10546b() {
        }

        @Override // io.intercom.com.bumptech.glide.load.engine.AbstractC10544i
        /* renamed from: a */
        public boolean mo12775a() {
            return true;
        }

        @Override // io.intercom.com.bumptech.glide.load.engine.AbstractC10544i
        /* renamed from: b */
        public boolean mo12774b() {
            return false;
        }

        @Override // io.intercom.com.bumptech.glide.load.engine.AbstractC10544i
        /* renamed from: c */
        public boolean mo12773c(EnumC10507a enumC10507a) {
            return (enumC10507a == EnumC10507a.DATA_DISK_CACHE || enumC10507a == EnumC10507a.MEMORY_CACHE) ? false : true;
        }

        @Override // io.intercom.com.bumptech.glide.load.engine.AbstractC10544i
        /* renamed from: d */
        public boolean mo12772d(boolean z, EnumC10507a enumC10507a, EnumC10509c enumC10509c) {
            return false;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.engine.i$c */
    /* loaded from: classes3.dex */
    static class C10547c extends AbstractC10544i {
        C10547c() {
        }

        @Override // io.intercom.com.bumptech.glide.load.engine.AbstractC10544i
        /* renamed from: a */
        public boolean mo12775a() {
            return false;
        }

        @Override // io.intercom.com.bumptech.glide.load.engine.AbstractC10544i
        /* renamed from: b */
        public boolean mo12774b() {
            return true;
        }

        @Override // io.intercom.com.bumptech.glide.load.engine.AbstractC10544i
        /* renamed from: c */
        public boolean mo12773c(EnumC10507a enumC10507a) {
            return false;
        }

        @Override // io.intercom.com.bumptech.glide.load.engine.AbstractC10544i
        /* renamed from: d */
        public boolean mo12772d(boolean z, EnumC10507a enumC10507a, EnumC10509c enumC10509c) {
            return (enumC10507a == EnumC10507a.RESOURCE_DISK_CACHE || enumC10507a == EnumC10507a.MEMORY_CACHE) ? false : true;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.engine.i$d */
    /* loaded from: classes3.dex */
    static class C10548d extends AbstractC10544i {
        C10548d() {
        }

        @Override // io.intercom.com.bumptech.glide.load.engine.AbstractC10544i
        /* renamed from: a */
        public boolean mo12775a() {
            return true;
        }

        @Override // io.intercom.com.bumptech.glide.load.engine.AbstractC10544i
        /* renamed from: b */
        public boolean mo12774b() {
            return true;
        }

        @Override // io.intercom.com.bumptech.glide.load.engine.AbstractC10544i
        /* renamed from: c */
        public boolean mo12773c(EnumC10507a enumC10507a) {
            return enumC10507a == EnumC10507a.REMOTE;
        }

        @Override // io.intercom.com.bumptech.glide.load.engine.AbstractC10544i
        /* renamed from: d */
        public boolean mo12772d(boolean z, EnumC10507a enumC10507a, EnumC10509c enumC10509c) {
            return ((z && enumC10507a == EnumC10507a.DATA_DISK_CACHE) || enumC10507a == EnumC10507a.LOCAL) && enumC10509c == EnumC10509c.TRANSFORMED;
        }
    }

    /* renamed from: a */
    public abstract boolean mo12775a();

    /* renamed from: b */
    public abstract boolean mo12774b();

    /* renamed from: c */
    public abstract boolean mo12773c(EnumC10507a enumC10507a);

    /* renamed from: d */
    public abstract boolean mo12772d(boolean z, EnumC10507a enumC10507a, EnumC10509c enumC10509c);
}
