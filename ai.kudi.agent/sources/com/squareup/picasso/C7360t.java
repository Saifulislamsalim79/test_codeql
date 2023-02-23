package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.widget.ImageView;
import com.squareup.picasso.AbstractC7316a;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
/* compiled from: Picasso.java */
/* renamed from: com.squareup.picasso.t */
/* loaded from: classes2.dex */
public class C7360t {

    /* renamed from: p */
    static final Handler f17429p = new HandlerC7361a(Looper.getMainLooper());

    /* renamed from: q */
    static volatile C7360t f17430q = null;

    /* renamed from: a */
    private final InterfaceC7365d f17431a;

    /* renamed from: b */
    private final InterfaceC7368g f17432b;

    /* renamed from: c */
    private final C7363c f17433c;

    /* renamed from: d */
    private final List<AbstractC7377y> f17434d;

    /* renamed from: e */
    final Context f17435e;

    /* renamed from: f */
    final C7340i f17436f;

    /* renamed from: g */
    final InterfaceC7331d f17437g;

    /* renamed from: h */
    final C7318a0 f17438h;

    /* renamed from: i */
    final Map<Object, AbstractC7316a> f17439i;

    /* renamed from: j */
    final Map<ImageView, ViewTreeObserver$OnPreDrawListenerC7339h> f17440j;

    /* renamed from: k */
    final ReferenceQueue<Object> f17441k;

    /* renamed from: l */
    final Bitmap.Config f17442l;

    /* renamed from: m */
    boolean f17443m;

    /* renamed from: n */
    volatile boolean f17444n;

    /* renamed from: o */
    boolean f17445o;

    /* compiled from: Picasso.java */
    /* renamed from: com.squareup.picasso.t$a */
    /* loaded from: classes2.dex */
    static class HandlerC7361a extends Handler {
        HandlerC7361a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 3) {
                AbstractC7316a abstractC7316a = (AbstractC7316a) message.obj;
                if (abstractC7316a.m19005g().f17444n) {
                    C7332d0.m18937t("Main", "canceled", abstractC7316a.f17294b.m18860d(), "target got garbage collected");
                }
                abstractC7316a.f17293a.m18887a(abstractC7316a.m19001k());
                return;
            }
            int i2 = 0;
            if (i == 8) {
                List list = (List) message.obj;
                int size = list.size();
                while (i2 < size) {
                    RunnableC7323c runnableC7323c = (RunnableC7323c) list.get(i2);
                    runnableC7323c.f17356d.m18885c(runnableC7323c);
                    i2++;
                }
            } else if (i == 13) {
                List list2 = (List) message.obj;
                int size2 = list2.size();
                while (i2 < size2) {
                    AbstractC7316a abstractC7316a2 = (AbstractC7316a) list2.get(i2);
                    abstractC7316a2.f17293a.m18876l(abstractC7316a2);
                    i2++;
                }
            } else {
                throw new AssertionError("Unknown handler message received: " + message.what);
            }
        }
    }

    /* compiled from: Picasso.java */
    /* renamed from: com.squareup.picasso.t$b */
    /* loaded from: classes2.dex */
    public static class C7362b {

        /* renamed from: a */
        private final Context f17446a;

        /* renamed from: b */
        private InterfaceC7345j f17447b;

        /* renamed from: c */
        private ExecutorService f17448c;

        /* renamed from: d */
        private InterfaceC7331d f17449d;

        /* renamed from: e */
        private InterfaceC7365d f17450e;

        /* renamed from: f */
        private InterfaceC7368g f17451f;

        /* renamed from: g */
        private List<AbstractC7377y> f17452g;

        /* renamed from: h */
        private Bitmap.Config f17453h;

        /* renamed from: i */
        private boolean f17454i;

        /* renamed from: j */
        private boolean f17455j;

        public C7362b(Context context) {
            if (context != null) {
                this.f17446a = context.getApplicationContext();
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }

        /* renamed from: a */
        public C7360t m18873a() {
            Context context = this.f17446a;
            if (this.f17447b == null) {
                this.f17447b = new C7359s(context);
            }
            if (this.f17449d == null) {
                this.f17449d = new C7348m(context);
            }
            if (this.f17448c == null) {
                this.f17448c = new C7371v();
            }
            if (this.f17451f == null) {
                this.f17451f = InterfaceC7368g.f17468a;
            }
            C7318a0 c7318a0 = new C7318a0(this.f17449d);
            return new C7360t(context, new C7340i(context, this.f17448c, C7360t.f17429p, this.f17447b, this.f17449d, c7318a0), this.f17449d, this.f17450e, this.f17451f, this.f17452g, c7318a0, this.f17453h, this.f17454i, this.f17455j);
        }
    }

    /* compiled from: Picasso.java */
    /* renamed from: com.squareup.picasso.t$c */
    /* loaded from: classes2.dex */
    private static class C7363c extends Thread {

        /* renamed from: c */
        private final ReferenceQueue<Object> f17456c;

        /* renamed from: d */
        private final Handler f17457d;

        /* compiled from: Picasso.java */
        /* renamed from: com.squareup.picasso.t$c$a */
        /* loaded from: classes2.dex */
        class RunnableC7364a implements Runnable {

            /* renamed from: c */
            final /* synthetic */ Exception f17458c;

            RunnableC7364a(C7363c c7363c, Exception exc) {
                this.f17458c = exc;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new RuntimeException(this.f17458c);
            }
        }

        C7363c(ReferenceQueue<Object> referenceQueue, Handler handler) {
            this.f17456c = referenceQueue;
            this.f17457d = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    AbstractC7316a.C7317a c7317a = (AbstractC7316a.C7317a) this.f17456c.remove(1000L);
                    Message obtainMessage = this.f17457d.obtainMessage();
                    if (c7317a != null) {
                        obtainMessage.what = 3;
                        obtainMessage.obj = c7317a.f17305a;
                        this.f17457d.sendMessage(obtainMessage);
                    } else {
                        obtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e) {
                    this.f17457d.post(new RunnableC7364a(this, e));
                    return;
                }
            }
        }
    }

    /* compiled from: Picasso.java */
    /* renamed from: com.squareup.picasso.t$d */
    /* loaded from: classes2.dex */
    public interface InterfaceC7365d {
        /* renamed from: a */
        void m18872a(C7360t c7360t, Uri uri, Exception exc);
    }

    /* compiled from: Picasso.java */
    /* renamed from: com.squareup.picasso.t$e */
    /* loaded from: classes2.dex */
    public enum EnumC7366e {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(-65536);
        

        /* renamed from: c */
        final int f17463c;

        EnumC7366e(int i) {
            this.f17463c = i;
        }
    }

    /* compiled from: Picasso.java */
    /* renamed from: com.squareup.picasso.t$f */
    /* loaded from: classes2.dex */
    public enum EnumC7367f {
        LOW,
        NORMAL,
        HIGH
    }

    /* compiled from: Picasso.java */
    /* renamed from: com.squareup.picasso.t$g */
    /* loaded from: classes2.dex */
    public interface InterfaceC7368g {

        /* renamed from: a */
        public static final InterfaceC7368g f17468a = new C7369a();

        /* compiled from: Picasso.java */
        /* renamed from: com.squareup.picasso.t$g$a */
        /* loaded from: classes2.dex */
        static class C7369a implements InterfaceC7368g {
            C7369a() {
            }

            @Override // com.squareup.picasso.C7360t.InterfaceC7368g
            /* renamed from: a */
            public C7373w mo18871a(C7373w c7373w) {
                return c7373w;
            }
        }

        /* renamed from: a */
        C7373w mo18871a(C7373w c7373w);
    }

    C7360t(Context context, C7340i c7340i, InterfaceC7331d interfaceC7331d, InterfaceC7365d interfaceC7365d, InterfaceC7368g interfaceC7368g, List<AbstractC7377y> list, C7318a0 c7318a0, Bitmap.Config config, boolean z, boolean z2) {
        this.f17435e = context;
        this.f17436f = c7340i;
        this.f17437g = interfaceC7331d;
        this.f17431a = interfaceC7365d;
        this.f17432b = interfaceC7368g;
        this.f17442l = config;
        ArrayList arrayList = new ArrayList((list != null ? list.size() : 0) + 7);
        arrayList.add(new C7379z(context));
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new C7337f(context));
        arrayList.add(new C7352o(context));
        arrayList.add(new C7338g(context));
        arrayList.add(new C7321b(context));
        arrayList.add(new C7346k(context));
        arrayList.add(new C7356r(c7340i.f17380d, c7318a0));
        this.f17434d = Collections.unmodifiableList(arrayList);
        this.f17438h = c7318a0;
        this.f17439i = new WeakHashMap();
        this.f17440j = new WeakHashMap();
        this.f17443m = z;
        this.f17444n = z2;
        this.f17441k = new ReferenceQueue<>();
        C7363c c7363c = new C7363c(this.f17441k, f17429p);
        this.f17433c = c7363c;
        c7363c.start();
    }

    /* renamed from: e */
    private void m18883e(Bitmap bitmap, EnumC7366e enumC7366e, AbstractC7316a abstractC7316a, Exception exc) {
        if (abstractC7316a.m19000l()) {
            return;
        }
        if (!abstractC7316a.m18999m()) {
            this.f17439i.remove(abstractC7316a.m19001k());
        }
        if (bitmap == null) {
            abstractC7316a.mo18906c(exc);
            if (this.f17444n) {
                C7332d0.m18937t("Main", "errored", abstractC7316a.f17294b.m18860d(), exc.getMessage());
            }
        } else if (enumC7366e != null) {
            abstractC7316a.mo18907b(bitmap, enumC7366e);
            if (this.f17444n) {
                String m18860d = abstractC7316a.f17294b.m18860d();
                C7332d0.m18937t("Main", MetricTracker.Action.COMPLETED, m18860d, "from " + enumC7366e);
            }
        } else {
            throw new AssertionError("LoadedFrom cannot be null.");
        }
    }

    /* renamed from: g */
    public static C7360t m18881g() {
        if (f17430q == null) {
            synchronized (C7360t.class) {
                if (f17430q == null) {
                    if (PicassoProvider.f17292c != null) {
                        f17430q = new C7362b(PicassoProvider.f17292c).m18873a();
                    } else {
                        throw new IllegalStateException("context == null");
                    }
                }
            }
        }
        return f17430q;
    }

    /* renamed from: a */
    void m18887a(Object obj) {
        C7332d0.m18954c();
        AbstractC7316a remove = this.f17439i.remove(obj);
        if (remove != null) {
            remove.mo18908a();
            this.f17436f.m18931c(remove);
        }
        if (obj instanceof ImageView) {
            ViewTreeObserver$OnPreDrawListenerC7339h remove2 = this.f17440j.remove((ImageView) obj);
            if (remove2 != null) {
                remove2.m18934a();
            }
        }
    }

    /* renamed from: b */
    public void m18886b(ImageView imageView) {
        if (imageView != null) {
            m18887a(imageView);
            return;
        }
        throw new IllegalArgumentException("view cannot be null.");
    }

    /* renamed from: c */
    void m18885c(RunnableC7323c runnableC7323c) {
        AbstractC7316a m18976h = runnableC7323c.m18976h();
        List<AbstractC7316a> m18975i = runnableC7323c.m18975i();
        boolean z = true;
        boolean z2 = (m18975i == null || m18975i.isEmpty()) ? false : true;
        if (m18976h == null && !z2) {
            z = false;
        }
        if (z) {
            Uri uri = runnableC7323c.m18974j().f17482d;
            Exception m18973k = runnableC7323c.m18973k();
            Bitmap m18965s = runnableC7323c.m18965s();
            EnumC7366e m18969o = runnableC7323c.m18969o();
            if (m18976h != null) {
                m18883e(m18965s, m18969o, m18976h, m18973k);
            }
            if (z2) {
                int size = m18975i.size();
                for (int i = 0; i < size; i++) {
                    m18883e(m18965s, m18969o, m18975i.get(i), m18973k);
                }
            }
            InterfaceC7365d interfaceC7365d = this.f17431a;
            if (interfaceC7365d == null || m18973k == null) {
                return;
            }
            interfaceC7365d.m18872a(this, uri, m18973k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m18884d(ImageView imageView, ViewTreeObserver$OnPreDrawListenerC7339h viewTreeObserver$OnPreDrawListenerC7339h) {
        if (this.f17440j.containsKey(imageView)) {
            m18887a(imageView);
        }
        this.f17440j.put(imageView, viewTreeObserver$OnPreDrawListenerC7339h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m18882f(AbstractC7316a abstractC7316a) {
        Object m19001k = abstractC7316a.m19001k();
        if (m19001k != null && this.f17439i.get(m19001k) != abstractC7316a) {
            m18887a(m19001k);
            this.f17439i.put(m19001k, abstractC7316a);
        }
        m18875m(abstractC7316a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public List<AbstractC7377y> m18880h() {
        return this.f17434d;
    }

    /* renamed from: i */
    public C7376x m18879i(Uri uri) {
        return new C7376x(this, uri, 0);
    }

    /* renamed from: j */
    public C7376x m18878j(String str) {
        if (str == null) {
            return new C7376x(this, null, 0);
        }
        if (str.trim().length() != 0) {
            return m18879i(Uri.parse(str));
        }
        throw new IllegalArgumentException("Path must not be empty.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public Bitmap m18877k(String str) {
        Bitmap mo18904b = this.f17437g.mo18904b(str);
        if (mo18904b != null) {
            this.f17438h.m18995d();
        } else {
            this.f17438h.m18994e();
        }
        return mo18904b;
    }

    /* renamed from: l */
    void m18876l(AbstractC7316a abstractC7316a) {
        Bitmap m18877k = EnumC7354p.m18894a(abstractC7316a.f17297e) ? m18877k(abstractC7316a.m19008d()) : null;
        if (m18877k != null) {
            m18883e(m18877k, EnumC7366e.MEMORY, abstractC7316a, null);
            if (this.f17444n) {
                String m18860d = abstractC7316a.f17294b.m18860d();
                C7332d0.m18937t("Main", MetricTracker.Action.COMPLETED, m18860d, "from " + EnumC7366e.MEMORY);
                return;
            }
            return;
        }
        m18882f(abstractC7316a);
        if (this.f17444n) {
            C7332d0.m18938s("Main", "resumed", abstractC7316a.f17294b.m18860d());
        }
    }

    /* renamed from: m */
    void m18875m(AbstractC7316a abstractC7316a) {
        this.f17436f.m18926h(abstractC7316a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public C7373w m18874n(C7373w c7373w) {
        this.f17432b.mo18871a(c7373w);
        if (c7373w != null) {
            return c7373w;
        }
        throw new IllegalStateException("Request transformer " + this.f17432b.getClass().getCanonicalName() + " returned null for " + c7373w);
    }
}
