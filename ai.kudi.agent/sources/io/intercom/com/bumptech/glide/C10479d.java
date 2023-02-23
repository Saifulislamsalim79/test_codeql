package io.intercom.com.bumptech.glide;

import android.content.Context;
import io.intercom.com.bumptech.glide.load.engine.C10549j;
import io.intercom.com.bumptech.glide.load.engine.p394a0.ExecutorServiceC10519a;
import io.intercom.com.bumptech.glide.load.engine.p396y.C10582f;
import io.intercom.com.bumptech.glide.load.engine.p396y.C10587j;
import io.intercom.com.bumptech.glide.load.engine.p396y.C10590k;
import io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10576b;
import io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10581e;
import io.intercom.com.bumptech.glide.load.engine.p397z.C10609f;
import io.intercom.com.bumptech.glide.load.engine.p397z.C10611g;
import io.intercom.com.bumptech.glide.load.engine.p397z.C10614i;
import io.intercom.com.bumptech.glide.load.engine.p397z.InterfaceC10599a;
import io.intercom.com.bumptech.glide.load.engine.p397z.InterfaceC10612h;
import io.intercom.com.bumptech.glide.p409m.C10820f;
import io.intercom.com.bumptech.glide.p409m.C10827l;
import io.intercom.com.bumptech.glide.p409m.InterfaceC10817d;
import io.intercom.com.bumptech.glide.p412p.C10856g;
import java.util.Map;
import p201g.p218e.C7521a;
/* compiled from: GlideBuilder.java */
/* renamed from: io.intercom.com.bumptech.glide.d */
/* loaded from: classes3.dex */
public final class C10479d {

    /* renamed from: b */
    private C10549j f23940b;

    /* renamed from: c */
    private InterfaceC10581e f23941c;

    /* renamed from: d */
    private InterfaceC10576b f23942d;

    /* renamed from: e */
    private InterfaceC10612h f23943e;

    /* renamed from: f */
    private ExecutorServiceC10519a f23944f;

    /* renamed from: g */
    private ExecutorServiceC10519a f23945g;

    /* renamed from: h */
    private InterfaceC10599a.InterfaceC10600a f23946h;

    /* renamed from: i */
    private C10614i f23947i;

    /* renamed from: j */
    private InterfaceC10817d f23948j;

    /* renamed from: m */
    private C10827l.InterfaceC10829b f23951m;

    /* renamed from: n */
    private ExecutorServiceC10519a f23952n;

    /* renamed from: a */
    private final Map<Class<?>, AbstractC10491j<?, ?>> f23939a = new C7521a();

    /* renamed from: k */
    private int f23949k = 4;

    /* renamed from: l */
    private C10856g f23950l = new C10856g();

    /* renamed from: o */
    private boolean f23953o = true;

    /* renamed from: a */
    public ComponentCallbacks2C10478c m13015a(Context context) {
        if (this.f23944f == null) {
            this.f23944f = ExecutorServiceC10519a.m12843f();
        }
        if (this.f23945g == null) {
            this.f23945g = ExecutorServiceC10519a.m12845d();
        }
        if (this.f23952n == null) {
            this.f23952n = ExecutorServiceC10519a.m12847b();
        }
        if (this.f23947i == null) {
            this.f23947i = new C10614i.C10615a(context).m12609i();
        }
        if (this.f23948j == null) {
            this.f23948j = new C10820f();
        }
        if (this.f23941c == null) {
            int m12622c = this.f23947i.m12622c();
            if (m12622c > 0) {
                this.f23941c = new C10590k(m12622c);
            } else {
                this.f23941c = new C10582f();
            }
        }
        if (this.f23942d == null) {
            this.f23942d = new C10587j(this.f23947i.m12623b());
        }
        if (this.f23943e == null) {
            this.f23943e = new C10611g(this.f23947i.m12620e());
        }
        if (this.f23946h == null) {
            this.f23946h = new C10609f(context);
        }
        if (this.f23940b == null) {
            this.f23940b = new C10549j(this.f23943e, this.f23946h, this.f23945g, this.f23944f, ExecutorServiceC10519a.m12841h(), ExecutorServiceC10519a.m12847b(), this.f23953o);
        }
        C10827l c10827l = new C10827l(this.f23951m);
        C10549j c10549j = this.f23940b;
        InterfaceC10612h interfaceC10612h = this.f23943e;
        InterfaceC10581e interfaceC10581e = this.f23941c;
        InterfaceC10576b interfaceC10576b = this.f23942d;
        InterfaceC10817d interfaceC10817d = this.f23948j;
        int i = this.f23949k;
        C10856g c10856g = this.f23950l;
        c10856g.m12162Q();
        return new ComponentCallbacks2C10478c(context, c10549j, interfaceC10612h, interfaceC10581e, interfaceC10576b, c10827l, interfaceC10817d, i, c10856g, this.f23939a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m13014b(C10827l.InterfaceC10829b interfaceC10829b) {
        this.f23951m = interfaceC10829b;
    }
}
