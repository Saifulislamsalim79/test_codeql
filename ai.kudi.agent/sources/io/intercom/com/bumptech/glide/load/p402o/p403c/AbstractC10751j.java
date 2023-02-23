package io.intercom.com.bumptech.glide.load.p402o.p403c;
/* compiled from: DownsampleStrategy.java */
/* renamed from: io.intercom.com.bumptech.glide.load.o.c.j */
/* loaded from: classes3.dex */
public abstract class AbstractC10751j {

    /* renamed from: a */
    public static final AbstractC10751j f24573a = new C10754c();

    /* renamed from: b */
    public static final AbstractC10751j f24574b = new C10753b();

    /* renamed from: c */
    public static final AbstractC10751j f24575c = new C10752a();

    /* renamed from: d */
    public static final AbstractC10751j f24576d = f24574b;

    /* compiled from: DownsampleStrategy.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.o.c.j$a */
    /* loaded from: classes3.dex */
    private static class C10752a extends AbstractC10751j {
        C10752a() {
        }

        @Override // io.intercom.com.bumptech.glide.load.p402o.p403c.AbstractC10751j
        /* renamed from: a */
        public EnumC10755d mo12424a(int i, int i2, int i3, int i4) {
            return EnumC10755d.QUALITY;
        }

        @Override // io.intercom.com.bumptech.glide.load.p402o.p403c.AbstractC10751j
        /* renamed from: b */
        public float mo12423b(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, AbstractC10751j.f24573a.mo12423b(i, i2, i3, i4));
        }
    }

    /* compiled from: DownsampleStrategy.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.o.c.j$b */
    /* loaded from: classes3.dex */
    private static class C10753b extends AbstractC10751j {
        C10753b() {
        }

        @Override // io.intercom.com.bumptech.glide.load.p402o.p403c.AbstractC10751j
        /* renamed from: a */
        public EnumC10755d mo12424a(int i, int i2, int i3, int i4) {
            return EnumC10755d.QUALITY;
        }

        @Override // io.intercom.com.bumptech.glide.load.p402o.p403c.AbstractC10751j
        /* renamed from: b */
        public float mo12423b(int i, int i2, int i3, int i4) {
            return Math.max(i3 / i, i4 / i2);
        }
    }

    /* compiled from: DownsampleStrategy.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.o.c.j$c */
    /* loaded from: classes3.dex */
    private static class C10754c extends AbstractC10751j {
        C10754c() {
        }

        @Override // io.intercom.com.bumptech.glide.load.p402o.p403c.AbstractC10751j
        /* renamed from: a */
        public EnumC10755d mo12424a(int i, int i2, int i3, int i4) {
            return EnumC10755d.QUALITY;
        }

        @Override // io.intercom.com.bumptech.glide.load.p402o.p403c.AbstractC10751j
        /* renamed from: b */
        public float mo12423b(int i, int i2, int i3, int i4) {
            return Math.min(i3 / i, i4 / i2);
        }
    }

    /* compiled from: DownsampleStrategy.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.o.c.j$d */
    /* loaded from: classes3.dex */
    public enum EnumC10755d {
        MEMORY,
        QUALITY
    }

    /* renamed from: a */
    public abstract EnumC10755d mo12424a(int i, int i2, int i3, int i4);

    /* renamed from: b */
    public abstract float mo12423b(int i, int i2, int i3, int i4);
}
