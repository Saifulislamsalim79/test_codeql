package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.util.TypedValue;
import android.widget.ImageView;
import com.squareup.picasso.C7360t;
import com.squareup.picasso.C7373w;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: RequestCreator.java */
/* renamed from: com.squareup.picasso.x */
/* loaded from: classes2.dex */
public class C7376x {

    /* renamed from: m */
    private static final AtomicInteger f17516m = new AtomicInteger();

    /* renamed from: a */
    private final C7360t f17517a;

    /* renamed from: b */
    private final C7373w.C7375b f17518b;

    /* renamed from: c */
    private boolean f17519c;

    /* renamed from: d */
    private boolean f17520d;

    /* renamed from: e */
    private boolean f17521e = true;

    /* renamed from: f */
    private int f17522f;

    /* renamed from: g */
    private int f17523g;

    /* renamed from: h */
    private int f17524h;

    /* renamed from: i */
    private int f17525i;

    /* renamed from: j */
    private Drawable f17526j;

    /* renamed from: k */
    private Drawable f17527k;

    /* renamed from: l */
    private Object f17528l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7376x(C7360t c7360t, Uri uri, int i) {
        if (!c7360t.f17445o) {
            this.f17517a = c7360t;
            this.f17518b = new C7373w.C7375b(uri, i, c7360t.f17442l);
            return;
        }
        throw new IllegalStateException("Picasso instance already shut down. Cannot submit new requests.");
    }

    /* renamed from: b */
    private C7373w m18850b(long j) {
        int andIncrement = f17516m.getAndIncrement();
        C7373w m18856a = this.f17518b.m18856a();
        m18856a.f17479a = andIncrement;
        m18856a.f17480b = j;
        boolean z = this.f17517a.f17444n;
        if (z) {
            C7332d0.m18937t("Main", "created", m18856a.m18857g(), m18856a.toString());
        }
        this.f17517a.m18874n(m18856a);
        if (m18856a != m18856a) {
            m18856a.f17479a = andIncrement;
            m18856a.f17480b = j;
            if (z) {
                String m18860d = m18856a.m18860d();
                C7332d0.m18937t("Main", "changed", m18860d, "into " + m18856a);
            }
        }
        return m18856a;
    }

    /* renamed from: d */
    private Drawable m18848d() {
        int i = this.f17522f;
        if (i != 0) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 21) {
                return this.f17517a.f17435e.getDrawable(i);
            }
            if (i2 >= 16) {
                return this.f17517a.f17435e.getResources().getDrawable(this.f17522f);
            }
            TypedValue typedValue = new TypedValue();
            this.f17517a.f17435e.getResources().getValue(this.f17522f, typedValue, true);
            return this.f17517a.f17435e.getResources().getDrawable(typedValue.resourceId);
        }
        return this.f17526j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C7376x m18851a() {
        this.f17528l = null;
        return this;
    }

    /* renamed from: c */
    public C7376x m18849c(Drawable drawable) {
        if (drawable != null) {
            if (this.f17523g == 0) {
                this.f17527k = drawable;
                return this;
            }
            throw new IllegalStateException("Error image already set.");
        }
        throw new IllegalArgumentException("Error image may not be null.");
    }

    /* renamed from: e */
    public void m18847e(ImageView imageView) {
        m18846f(imageView, null);
    }

    /* renamed from: f */
    public void m18846f(ImageView imageView, InterfaceC7336e interfaceC7336e) {
        Bitmap m18877k;
        long nanoTime = System.nanoTime();
        C7332d0.m18954c();
        if (imageView != null) {
            if (!this.f17518b.m18855b()) {
                this.f17517a.m18886b(imageView);
                if (this.f17521e) {
                    C7370u.m18867d(imageView, m18848d());
                    return;
                }
                return;
            }
            if (this.f17520d) {
                if (!this.f17518b.m18854c()) {
                    int width = imageView.getWidth();
                    int height = imageView.getHeight();
                    if (width != 0 && height != 0) {
                        this.f17518b.m18853d(width, height);
                    } else {
                        if (this.f17521e) {
                            C7370u.m18867d(imageView, m18848d());
                        }
                        this.f17517a.m18884d(imageView, new ViewTreeObserver$OnPreDrawListenerC7339h(this, imageView, interfaceC7336e));
                        return;
                    }
                } else {
                    throw new IllegalStateException("Fit cannot be used with resize.");
                }
            }
            C7373w m18850b = m18850b(nanoTime);
            String m18951f = C7332d0.m18951f(m18850b);
            if (EnumC7354p.m18894a(this.f17524h) && (m18877k = this.f17517a.m18877k(m18951f)) != null) {
                this.f17517a.m18886b(imageView);
                C7360t c7360t = this.f17517a;
                C7370u.m18868c(imageView, c7360t.f17435e, m18877k, C7360t.EnumC7366e.MEMORY, this.f17519c, c7360t.f17443m);
                if (this.f17517a.f17444n) {
                    String m18857g = m18850b.m18857g();
                    C7332d0.m18937t("Main", MetricTracker.Action.COMPLETED, m18857g, "from " + C7360t.EnumC7366e.MEMORY);
                }
                if (interfaceC7336e != null) {
                    interfaceC7336e.onSuccess();
                    return;
                }
                return;
            }
            if (this.f17521e) {
                C7370u.m18867d(imageView, m18848d());
            }
            this.f17517a.m18882f(new C7347l(this.f17517a, imageView, m18850b, this.f17524h, this.f17525i, this.f17523g, this.f17527k, m18951f, this.f17528l, interfaceC7336e, this.f17519c));
            return;
        }
        throw new IllegalArgumentException("Target must not be null.");
    }

    /* renamed from: g */
    public C7376x m18845g(Drawable drawable) {
        if (this.f17521e) {
            if (this.f17522f == 0) {
                this.f17526j = drawable;
                return this;
            }
            throw new IllegalStateException("Placeholder image already set.");
        }
        throw new IllegalStateException("Already explicitly declared as no placeholder.");
    }

    /* renamed from: h */
    public C7376x m18844h(int i, int i2) {
        this.f17518b.m18853d(i, i2);
        return this;
    }

    /* renamed from: i */
    public C7376x m18843i(InterfaceC7330c0 interfaceC7330c0) {
        this.f17518b.m18852e(interfaceC7330c0);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public C7376x m18842j() {
        this.f17520d = false;
        return this;
    }
}
