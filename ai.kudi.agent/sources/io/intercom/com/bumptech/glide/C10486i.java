package io.intercom.com.bumptech.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import io.intercom.com.bumptech.glide.load.engine.AbstractC10544i;
import io.intercom.com.bumptech.glide.load.p402o.p407g.C10793c;
import io.intercom.com.bumptech.glide.p409m.C10831n;
import io.intercom.com.bumptech.glide.p409m.C10834p;
import io.intercom.com.bumptech.glide.p409m.InterfaceC10815c;
import io.intercom.com.bumptech.glide.p409m.InterfaceC10817d;
import io.intercom.com.bumptech.glide.p409m.InterfaceC10822h;
import io.intercom.com.bumptech.glide.p409m.InterfaceC10823i;
import io.intercom.com.bumptech.glide.p409m.InterfaceC10830m;
import io.intercom.com.bumptech.glide.p412p.C10856g;
import io.intercom.com.bumptech.glide.p412p.InterfaceC10850c;
import io.intercom.com.bumptech.glide.p412p.p413k.AbstractC10870i;
import io.intercom.com.bumptech.glide.p412p.p413k.InterfaceC10869h;
import io.intercom.com.bumptech.glide.p412p.p414l.InterfaceC10878d;
import io.intercom.com.bumptech.glide.p416r.C10893i;
import java.io.File;
/* compiled from: RequestManager.java */
/* renamed from: io.intercom.com.bumptech.glide.i */
/* loaded from: classes3.dex */
public class C10486i implements InterfaceC10823i {

    /* renamed from: C */
    private static final C10856g f23991C;

    /* renamed from: D */
    private static final C10856g f23992D;

    /* renamed from: A */
    private final InterfaceC10815c f23993A;

    /* renamed from: B */
    private C10856g f23994B;

    /* renamed from: c */
    protected final ComponentCallbacks2C10478c f23995c;

    /* renamed from: d */
    protected final Context f23996d;

    /* renamed from: e */
    final InterfaceC10822h f23997e;

    /* renamed from: f */
    private final C10831n f23998f;

    /* renamed from: w */
    private final InterfaceC10830m f23999w;

    /* renamed from: x */
    private final C10834p f24000x;

    /* renamed from: y */
    private final Runnable f24001y;

    /* renamed from: z */
    private final Handler f24002z;

    /* compiled from: RequestManager.java */
    /* renamed from: io.intercom.com.bumptech.glide.i$a */
    /* loaded from: classes3.dex */
    class RunnableC10487a implements Runnable {
        RunnableC10487a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C10486i c10486i = C10486i.this;
            c10486i.f23997e.mo12256b(c10486i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RequestManager.java */
    /* renamed from: io.intercom.com.bumptech.glide.i$b */
    /* loaded from: classes3.dex */
    public class RunnableC10488b implements Runnable {

        /* renamed from: c */
        final /* synthetic */ InterfaceC10869h f24004c;

        RunnableC10488b(InterfaceC10869h interfaceC10869h) {
            this.f24004c = interfaceC10869h;
        }

        @Override // java.lang.Runnable
        public void run() {
            C10486i.this.m12981e(this.f24004c);
        }
    }

    /* compiled from: RequestManager.java */
    /* renamed from: io.intercom.com.bumptech.glide.i$c */
    /* loaded from: classes3.dex */
    private static class C10489c extends AbstractC10870i<View, Object> {
        C10489c(View view) {
            super(view);
        }

        @Override // io.intercom.com.bumptech.glide.p412p.p413k.InterfaceC10869h
        public void onResourceReady(Object obj, InterfaceC10878d<? super Object> interfaceC10878d) {
        }
    }

    /* compiled from: RequestManager.java */
    /* renamed from: io.intercom.com.bumptech.glide.i$d */
    /* loaded from: classes3.dex */
    private static class C10490d implements InterfaceC10815c.InterfaceC10816a {

        /* renamed from: a */
        private final C10831n f24006a;

        C10490d(C10831n c10831n) {
            this.f24006a = c10831n;
        }

        @Override // io.intercom.com.bumptech.glide.p409m.InterfaceC10815c.InterfaceC10816a
        /* renamed from: a */
        public void mo12262a(boolean z) {
            if (z) {
                this.f24006a.m12230e();
            }
        }
    }

    static {
        C10856g m12146e = C10856g.m12146e(Bitmap.class);
        m12146e.m12162Q();
        f23991C = m12146e;
        C10856g.m12146e(C10793c.class).m12162Q();
        f23992D = C10856g.m12142g(AbstractC10544i.f24237b).m12151b0(EnumC10482g.LOW).m12136j0(true);
    }

    public C10486i(ComponentCallbacks2C10478c componentCallbacks2C10478c, InterfaceC10822h interfaceC10822h, InterfaceC10830m interfaceC10830m, Context context) {
        this(componentCallbacks2C10478c, interfaceC10822h, interfaceC10830m, new C10831n(), componentCallbacks2C10478c.m13030g(), context);
    }

    /* renamed from: o */
    private void m12971o(InterfaceC10869h<?> interfaceC10869h) {
        if (m12972n(interfaceC10869h) || this.f23995c.m13021p(interfaceC10869h) || interfaceC10869h.getRequest() == null) {
            return;
        }
        InterfaceC10850c request = interfaceC10869h.getRequest();
        interfaceC10869h.setRequest(null);
        request.clear();
    }

    /* renamed from: a */
    public <ResourceType> C10483h<ResourceType> m12985a(Class<ResourceType> cls) {
        return new C10483h<>(this.f23995c, this, cls, this.f23996d);
    }

    /* renamed from: b */
    public C10483h<Bitmap> m12984b() {
        C10483h<Bitmap> m12985a = m12985a(Bitmap.class);
        m12985a.m13004b(f23991C);
        return m12985a;
    }

    /* renamed from: c */
    public C10483h<Drawable> m12983c() {
        return m12985a(Drawable.class);
    }

    /* renamed from: d */
    public void m12982d(View view) {
        m12981e(new C10489c(view));
    }

    /* renamed from: e */
    public void m12981e(InterfaceC10869h<?> interfaceC10869h) {
        if (interfaceC10869h == null) {
            return;
        }
        if (C10893i.m11996q()) {
            m12971o(interfaceC10869h);
        } else {
            this.f24002z.post(new RunnableC10488b(interfaceC10869h));
        }
    }

    /* renamed from: f */
    public C10483h<File> m12980f() {
        C10483h<File> m12985a = m12985a(File.class);
        m12985a.m13004b(f23992D);
        return m12985a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public C10856g m12979g() {
        return this.f23994B;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public <T> AbstractC10491j<?, T> m12978h(Class<T> cls) {
        return this.f23995c.m13028i().m13010d(cls);
    }

    /* renamed from: i */
    public C10483h<Drawable> m12977i(String str) {
        C10483h<Drawable> m12983c = m12983c();
        m12983c.m12990q(str);
        return m12983c;
    }

    /* renamed from: j */
    public void m12976j() {
        C10893i.m12011b();
        this.f23998f.m12231d();
    }

    /* renamed from: k */
    public void m12975k() {
        C10893i.m12011b();
        this.f23998f.m12229f();
    }

    /* renamed from: l */
    protected void m12974l(C10856g c10856g) {
        C10856g clone = c10856g.clone();
        clone.m12152b();
        this.f23994B = clone;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m12973m(InterfaceC10869h<?> interfaceC10869h, InterfaceC10850c interfaceC10850c) {
        this.f24000x.m12215c(interfaceC10869h);
        this.f23998f.m12228g(interfaceC10850c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean m12972n(InterfaceC10869h<?> interfaceC10869h) {
        InterfaceC10850c request = interfaceC10869h.getRequest();
        if (request == null) {
            return true;
        }
        if (this.f23998f.m12233b(request)) {
            this.f24000x.m12214d(interfaceC10869h);
            interfaceC10869h.setRequest(null);
            return true;
        }
        return false;
    }

    @Override // io.intercom.com.bumptech.glide.p409m.InterfaceC10823i
    public void onDestroy() {
        this.f24000x.onDestroy();
        for (InterfaceC10869h<?> interfaceC10869h : this.f24000x.m12216b()) {
            m12981e(interfaceC10869h);
        }
        this.f24000x.m12217a();
        this.f23998f.m12232c();
        this.f23997e.mo12257a(this);
        this.f23997e.mo12257a(this.f23993A);
        this.f24002z.removeCallbacks(this.f24001y);
        this.f23995c.m13019r(this);
    }

    @Override // io.intercom.com.bumptech.glide.p409m.InterfaceC10823i
    public void onStart() {
        m12975k();
        this.f24000x.onStart();
    }

    @Override // io.intercom.com.bumptech.glide.p409m.InterfaceC10823i
    public void onStop() {
        m12976j();
        this.f24000x.onStop();
    }

    public String toString() {
        return super.toString() + "{tracker=" + this.f23998f + ", treeNode=" + this.f23999w + "}";
    }

    C10486i(ComponentCallbacks2C10478c componentCallbacks2C10478c, InterfaceC10822h interfaceC10822h, InterfaceC10830m interfaceC10830m, C10831n c10831n, InterfaceC10817d interfaceC10817d, Context context) {
        this.f24000x = new C10834p();
        this.f24001y = new RunnableC10487a();
        this.f24002z = new Handler(Looper.getMainLooper());
        this.f23995c = componentCallbacks2C10478c;
        this.f23997e = interfaceC10822h;
        this.f23999w = interfaceC10830m;
        this.f23998f = c10831n;
        this.f23996d = context;
        this.f23993A = interfaceC10817d.mo12258a(context.getApplicationContext(), new C10490d(c10831n));
        if (C10893i.m11997p()) {
            this.f24002z.post(this.f24001y);
        } else {
            interfaceC10822h.mo12256b(this);
        }
        interfaceC10822h.mo12256b(this.f23993A);
        m12974l(componentCallbacks2C10478c.m13028i().m13011c());
        componentCallbacks2C10478c.m13022o(this);
    }
}
