package p201g.p227h.p238l.p240i0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;
/* compiled from: InputContentInfoCompat.java */
/* renamed from: g.h.l.i0.c */
/* loaded from: classes2.dex */
public final class C7741c {

    /* renamed from: a */
    private final InterfaceC7744c f18496a;

    /* compiled from: InputContentInfoCompat.java */
    /* renamed from: g.h.l.i0.c$b */
    /* loaded from: classes2.dex */
    private static final class C7743b implements InterfaceC7744c {

        /* renamed from: a */
        private final Uri f18498a;

        /* renamed from: b */
        private final ClipDescription f18499b;

        /* renamed from: c */
        private final Uri f18500c;

        C7743b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f18498a = uri;
            this.f18499b = clipDescription;
            this.f18500c = uri2;
        }

        @Override // p201g.p227h.p238l.p240i0.C7741c.InterfaceC7744c
        /* renamed from: a */
        public ClipDescription mo17602a() {
            return this.f18499b;
        }

        @Override // p201g.p227h.p238l.p240i0.C7741c.InterfaceC7744c
        /* renamed from: b */
        public Uri mo17601b() {
            return this.f18498a;
        }

        @Override // p201g.p227h.p238l.p240i0.C7741c.InterfaceC7744c
        /* renamed from: c */
        public Uri mo17600c() {
            return this.f18500c;
        }

        @Override // p201g.p227h.p238l.p240i0.C7741c.InterfaceC7744c
        /* renamed from: d */
        public Object mo17599d() {
            return null;
        }

        @Override // p201g.p227h.p238l.p240i0.C7741c.InterfaceC7744c
        public void requestPermission() {
        }
    }

    /* compiled from: InputContentInfoCompat.java */
    /* renamed from: g.h.l.i0.c$c */
    /* loaded from: classes2.dex */
    private interface InterfaceC7744c {
        /* renamed from: a */
        ClipDescription mo17602a();

        /* renamed from: b */
        Uri mo17601b();

        /* renamed from: c */
        Uri mo17600c();

        /* renamed from: d */
        Object mo17599d();

        void requestPermission();
    }

    public C7741c(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f18496a = new C7742a(uri, clipDescription, uri2);
        } else {
            this.f18496a = new C7743b(uri, clipDescription, uri2);
        }
    }

    /* renamed from: f */
    public static C7741c m17603f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new C7741c(new C7742a(obj));
        }
        return null;
    }

    /* renamed from: a */
    public Uri m17608a() {
        return this.f18496a.mo17601b();
    }

    /* renamed from: b */
    public ClipDescription m17607b() {
        return this.f18496a.mo17602a();
    }

    /* renamed from: c */
    public Uri m17606c() {
        return this.f18496a.mo17600c();
    }

    /* renamed from: d */
    public void m17605d() {
        this.f18496a.requestPermission();
    }

    /* renamed from: e */
    public Object m17604e() {
        return this.f18496a.mo17599d();
    }

    /* compiled from: InputContentInfoCompat.java */
    /* renamed from: g.h.l.i0.c$a */
    /* loaded from: classes2.dex */
    private static final class C7742a implements InterfaceC7744c {

        /* renamed from: a */
        final InputContentInfo f18497a;

        C7742a(Object obj) {
            this.f18497a = (InputContentInfo) obj;
        }

        @Override // p201g.p227h.p238l.p240i0.C7741c.InterfaceC7744c
        /* renamed from: a */
        public ClipDescription mo17602a() {
            return this.f18497a.getDescription();
        }

        @Override // p201g.p227h.p238l.p240i0.C7741c.InterfaceC7744c
        /* renamed from: b */
        public Uri mo17601b() {
            return this.f18497a.getContentUri();
        }

        @Override // p201g.p227h.p238l.p240i0.C7741c.InterfaceC7744c
        /* renamed from: c */
        public Uri mo17600c() {
            return this.f18497a.getLinkUri();
        }

        @Override // p201g.p227h.p238l.p240i0.C7741c.InterfaceC7744c
        /* renamed from: d */
        public Object mo17599d() {
            return this.f18497a;
        }

        @Override // p201g.p227h.p238l.p240i0.C7741c.InterfaceC7744c
        public void requestPermission() {
            this.f18497a.requestPermission();
        }

        C7742a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f18497a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    private C7741c(InterfaceC7744c interfaceC7744c) {
        this.f18496a = interfaceC7744c;
    }
}
