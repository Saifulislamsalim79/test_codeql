package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;
import com.squareup.picasso.C7360t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: Request.java */
/* renamed from: com.squareup.picasso.w */
/* loaded from: classes2.dex */
public final class C7373w {

    /* renamed from: u */
    private static final long f17478u = TimeUnit.SECONDS.toNanos(5);

    /* renamed from: a */
    int f17479a;

    /* renamed from: b */
    long f17480b;

    /* renamed from: c */
    int f17481c;

    /* renamed from: d */
    public final Uri f17482d;

    /* renamed from: e */
    public final int f17483e;

    /* renamed from: f */
    public final String f17484f;

    /* renamed from: g */
    public final List<InterfaceC7330c0> f17485g;

    /* renamed from: h */
    public final int f17486h;

    /* renamed from: i */
    public final int f17487i;

    /* renamed from: j */
    public final boolean f17488j;

    /* renamed from: k */
    public final int f17489k;

    /* renamed from: l */
    public final boolean f17490l;

    /* renamed from: m */
    public final boolean f17491m;

    /* renamed from: n */
    public final float f17492n;

    /* renamed from: o */
    public final float f17493o;

    /* renamed from: p */
    public final float f17494p;

    /* renamed from: q */
    public final boolean f17495q;

    /* renamed from: r */
    public final boolean f17496r;

    /* renamed from: s */
    public final Bitmap.Config f17497s;

    /* renamed from: t */
    public final C7360t.EnumC7367f f17498t;

    /* compiled from: Request.java */
    /* renamed from: com.squareup.picasso.w$b */
    /* loaded from: classes2.dex */
    public static final class C7375b {

        /* renamed from: a */
        private Uri f17499a;

        /* renamed from: b */
        private int f17500b;

        /* renamed from: c */
        private String f17501c;

        /* renamed from: d */
        private int f17502d;

        /* renamed from: e */
        private int f17503e;

        /* renamed from: f */
        private boolean f17504f;

        /* renamed from: g */
        private int f17505g;

        /* renamed from: h */
        private boolean f17506h;

        /* renamed from: i */
        private boolean f17507i;

        /* renamed from: j */
        private float f17508j;

        /* renamed from: k */
        private float f17509k;

        /* renamed from: l */
        private float f17510l;

        /* renamed from: m */
        private boolean f17511m;

        /* renamed from: n */
        private boolean f17512n;

        /* renamed from: o */
        private List<InterfaceC7330c0> f17513o;

        /* renamed from: p */
        private Bitmap.Config f17514p;

        /* renamed from: q */
        private C7360t.EnumC7367f f17515q;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C7375b(Uri uri, int i, Bitmap.Config config) {
            this.f17499a = uri;
            this.f17500b = i;
            this.f17514p = config;
        }

        /* renamed from: a */
        public C7373w m18856a() {
            if (this.f17506h && this.f17504f) {
                throw new IllegalStateException("Center crop and center inside can not be used together.");
            }
            if (this.f17504f && this.f17502d == 0 && this.f17503e == 0) {
                throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
            }
            if (this.f17506h && this.f17502d == 0 && this.f17503e == 0) {
                throw new IllegalStateException("Center inside requires calling resize with positive width and height.");
            }
            if (this.f17515q == null) {
                this.f17515q = C7360t.EnumC7367f.NORMAL;
            }
            return new C7373w(this.f17499a, this.f17500b, this.f17501c, this.f17513o, this.f17502d, this.f17503e, this.f17504f, this.f17506h, this.f17505g, this.f17507i, this.f17508j, this.f17509k, this.f17510l, this.f17511m, this.f17512n, this.f17514p, this.f17515q);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean m18855b() {
            return (this.f17499a == null && this.f17500b == 0) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean m18854c() {
            return (this.f17502d == 0 && this.f17503e == 0) ? false : true;
        }

        /* renamed from: d */
        public C7375b m18853d(int i, int i2) {
            if (i >= 0) {
                if (i2 >= 0) {
                    if (i2 == 0 && i == 0) {
                        throw new IllegalArgumentException("At least one dimension has to be positive number.");
                    }
                    this.f17502d = i;
                    this.f17503e = i2;
                    return this;
                }
                throw new IllegalArgumentException("Height must be positive number or 0.");
            }
            throw new IllegalArgumentException("Width must be positive number or 0.");
        }

        /* renamed from: e */
        public C7375b m18852e(InterfaceC7330c0 interfaceC7330c0) {
            if (interfaceC7330c0 != null) {
                if (interfaceC7330c0.key() != null) {
                    if (this.f17513o == null) {
                        this.f17513o = new ArrayList(2);
                    }
                    this.f17513o.add(interfaceC7330c0);
                    return this;
                }
                throw new IllegalArgumentException("Transformation key must not be null.");
            }
            throw new IllegalArgumentException("Transformation must not be null.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public String m18863a() {
        Uri uri = this.f17482d;
        if (uri != null) {
            return String.valueOf(uri.getPath());
        }
        return Integer.toHexString(this.f17483e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m18862b() {
        return this.f17485g != null;
    }

    /* renamed from: c */
    public boolean m18861c() {
        return (this.f17486h == 0 && this.f17487i == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public String m18860d() {
        long nanoTime = System.nanoTime() - this.f17480b;
        if (nanoTime > f17478u) {
            return m18857g() + '+' + TimeUnit.NANOSECONDS.toSeconds(nanoTime) + 's';
        }
        return m18857g() + '+' + TimeUnit.NANOSECONDS.toMillis(nanoTime) + "ms";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean m18859e() {
        return m18861c() || this.f17492n != 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean m18858f() {
        return m18859e() || m18862b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public String m18857g() {
        return "[R" + this.f17479a + ']';
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Request{");
        int i = this.f17483e;
        if (i > 0) {
            sb.append(i);
        } else {
            sb.append(this.f17482d);
        }
        List<InterfaceC7330c0> list = this.f17485g;
        if (list != null && !list.isEmpty()) {
            for (InterfaceC7330c0 interfaceC7330c0 : this.f17485g) {
                sb.append(' ');
                sb.append(interfaceC7330c0.key());
            }
        }
        if (this.f17484f != null) {
            sb.append(" stableKey(");
            sb.append(this.f17484f);
            sb.append(')');
        }
        if (this.f17486h > 0) {
            sb.append(" resize(");
            sb.append(this.f17486h);
            sb.append(',');
            sb.append(this.f17487i);
            sb.append(')');
        }
        if (this.f17488j) {
            sb.append(" centerCrop");
        }
        if (this.f17490l) {
            sb.append(" centerInside");
        }
        if (this.f17492n != 0.0f) {
            sb.append(" rotation(");
            sb.append(this.f17492n);
            if (this.f17495q) {
                sb.append(" @ ");
                sb.append(this.f17493o);
                sb.append(',');
                sb.append(this.f17494p);
            }
            sb.append(')');
        }
        if (this.f17496r) {
            sb.append(" purgeable");
        }
        if (this.f17497s != null) {
            sb.append(' ');
            sb.append(this.f17497s);
        }
        sb.append('}');
        return sb.toString();
    }

    private C7373w(Uri uri, int i, String str, List<InterfaceC7330c0> list, int i2, int i3, boolean z, boolean z2, int i4, boolean z3, float f, float f2, float f3, boolean z4, boolean z5, Bitmap.Config config, C7360t.EnumC7367f enumC7367f) {
        this.f17482d = uri;
        this.f17483e = i;
        this.f17484f = str;
        if (list == null) {
            this.f17485g = null;
        } else {
            this.f17485g = Collections.unmodifiableList(list);
        }
        this.f17486h = i2;
        this.f17487i = i3;
        this.f17488j = z;
        this.f17490l = z2;
        this.f17489k = i4;
        this.f17491m = z3;
        this.f17492n = f;
        this.f17493o = f2;
        this.f17494p = f3;
        this.f17495q = z4;
        this.f17496r = z5;
        this.f17497s = config;
        this.f17498t = enumC7367f;
    }
}
