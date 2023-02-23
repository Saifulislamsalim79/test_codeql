package io.intercom.com.bumptech.glide.p412p.p414l;

import android.graphics.drawable.Drawable;
import io.intercom.com.bumptech.glide.load.EnumC10507a;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;
/* compiled from: DrawableCrossFadeFactory.java */
/* renamed from: io.intercom.com.bumptech.glide.p.l.a */
/* loaded from: classes3.dex */
public class C10873a implements InterfaceC10880e<Drawable> {

    /* renamed from: a */
    private final int f24833a;

    /* renamed from: b */
    private final boolean f24834b;

    /* renamed from: c */
    private C10875b f24835c;

    /* compiled from: DrawableCrossFadeFactory.java */
    /* renamed from: io.intercom.com.bumptech.glide.p.l.a$a */
    /* loaded from: classes3.dex */
    public static class C10874a {

        /* renamed from: a */
        private final int f24836a;

        /* renamed from: b */
        private boolean f24837b;

        public C10874a() {
            this(IjkMediaCodecInfo.RANK_SECURE);
        }

        /* renamed from: a */
        public C10873a m12052a() {
            return new C10873a(this.f24836a, this.f24837b);
        }

        public C10874a(int i) {
            this.f24836a = i;
        }
    }

    protected C10873a(int i, boolean z) {
        this.f24833a = i;
        this.f24834b = z;
    }

    /* renamed from: b */
    private InterfaceC10878d<Drawable> m12053b() {
        if (this.f24835c == null) {
            this.f24835c = new C10875b(this.f24833a, this.f24834b);
        }
        return this.f24835c;
    }

    @Override // io.intercom.com.bumptech.glide.p412p.p414l.InterfaceC10880e
    /* renamed from: a */
    public InterfaceC10878d<Drawable> mo12045a(EnumC10507a enumC10507a, boolean z) {
        return enumC10507a == EnumC10507a.MEMORY_CACHE ? C10876c.m12050b() : m12053b();
    }
}
