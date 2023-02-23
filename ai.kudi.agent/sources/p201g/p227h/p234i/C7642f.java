package p201g.p227h.p234i;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import p201g.p227h.p237k.C7675h;
/* compiled from: FontsContractCompat.java */
/* renamed from: g.h.i.f */
/* loaded from: classes2.dex */
public class C7642f {

    /* compiled from: FontsContractCompat.java */
    /* renamed from: g.h.i.f$a */
    /* loaded from: classes2.dex */
    public static class C7643a {

        /* renamed from: a */
        private final int f18336a;

        /* renamed from: b */
        private final C7644b[] f18337b;

        @Deprecated
        public C7643a(int i, C7644b[] c7644bArr) {
            this.f18336a = i;
            this.f18337b = c7644bArr;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public static C7643a m17941a(int i, C7644b[] c7644bArr) {
            return new C7643a(i, c7644bArr);
        }

        /* renamed from: b */
        public C7644b[] m17940b() {
            return this.f18337b;
        }

        /* renamed from: c */
        public int m17939c() {
            return this.f18336a;
        }
    }

    /* compiled from: FontsContractCompat.java */
    /* renamed from: g.h.i.f$b */
    /* loaded from: classes2.dex */
    public static class C7644b {

        /* renamed from: a */
        private final Uri f18338a;

        /* renamed from: b */
        private final int f18339b;

        /* renamed from: c */
        private final int f18340c;

        /* renamed from: d */
        private final boolean f18341d;

        /* renamed from: e */
        private final int f18342e;

        @Deprecated
        public C7644b(Uri uri, int i, int i2, boolean z, int i3) {
            C7675h.m17866f(uri);
            this.f18338a = uri;
            this.f18339b = i;
            this.f18340c = i2;
            this.f18341d = z;
            this.f18342e = i3;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public static C7644b m17938a(Uri uri, int i, int i2, boolean z, int i3) {
            return new C7644b(uri, i, i2, z, i3);
        }

        /* renamed from: b */
        public int m17937b() {
            return this.f18342e;
        }

        /* renamed from: c */
        public int m17936c() {
            return this.f18339b;
        }

        /* renamed from: d */
        public Uri m17935d() {
            return this.f18338a;
        }

        /* renamed from: e */
        public int m17934e() {
            return this.f18340c;
        }

        /* renamed from: f */
        public boolean m17933f() {
            return this.f18341d;
        }
    }

    /* compiled from: FontsContractCompat.java */
    /* renamed from: g.h.i.f$c */
    /* loaded from: classes2.dex */
    public static class C7645c {
        /* renamed from: a */
        public void mo17932a(int i) {
            throw null;
        }

        /* renamed from: b */
        public void mo17931b(Typeface typeface) {
            throw null;
        }
    }

    /* renamed from: a */
    public static Typeface m17942a(Context context, C7635d c7635d, int i, boolean z, int i2, Handler handler, C7645c c7645c) {
        C7629a c7629a = new C7629a(c7645c, handler);
        if (z) {
            return C7636e.m17948e(context, c7635d, c7629a, i, i2);
        }
        return C7636e.m17949d(context, c7635d, i, null, c7629a);
    }
}
