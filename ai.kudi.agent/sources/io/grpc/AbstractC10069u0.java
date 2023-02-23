package io.grpc;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import com.google.common.base.C5042j;
import com.google.common.base.C5046k;
import com.google.common.base.C5051n;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: NameResolver.java */
/* renamed from: io.grpc.u0 */
/* loaded from: classes2.dex */
public abstract class AbstractC10069u0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NameResolver.java */
    /* renamed from: io.grpc.u0$a */
    /* loaded from: classes2.dex */
    public class C10070a extends AbstractC10075e {

        /* renamed from: a */
        final /* synthetic */ InterfaceC10076f f23830a;

        C10070a(AbstractC10069u0 abstractC10069u0, InterfaceC10076f interfaceC10076f) {
            this.f23830a = interfaceC10076f;
        }

        @Override // io.grpc.AbstractC10069u0.AbstractC10075e, io.grpc.AbstractC10069u0.InterfaceC10076f
        /* renamed from: a */
        public void mo13117a(C9497c1 c9497c1) {
            this.f23830a.mo13117a(c9497c1);
        }

        @Override // io.grpc.AbstractC10069u0.AbstractC10075e
        /* renamed from: c */
        public void mo13118c(C10077g c10077g) {
            this.f23830a.mo13116b(c10077g.m13115a(), c10077g.m13114b());
        }
    }

    /* compiled from: NameResolver.java */
    /* renamed from: io.grpc.u0$b */
    /* loaded from: classes2.dex */
    public static final class C10071b {

        /* renamed from: a */
        private final int f23831a;

        /* renamed from: b */
        private final InterfaceC10094z0 f23832b;

        /* renamed from: c */
        private final ExecutorC9513e1 f23833c;

        /* renamed from: d */
        private final AbstractC10079h f23834d;

        /* renamed from: e */
        private final ScheduledExecutorService f23835e;

        /* renamed from: f */
        private final AbstractC9520g f23836f;

        /* renamed from: g */
        private final Executor f23837g;

        /* compiled from: NameResolver.java */
        /* renamed from: io.grpc.u0$b$a */
        /* loaded from: classes2.dex */
        public static final class C10072a {

            /* renamed from: a */
            private Integer f23838a;

            /* renamed from: b */
            private InterfaceC10094z0 f23839b;

            /* renamed from: c */
            private ExecutorC9513e1 f23840c;

            /* renamed from: d */
            private AbstractC10079h f23841d;

            /* renamed from: e */
            private ScheduledExecutorService f23842e;

            /* renamed from: f */
            private AbstractC9520g f23843f;

            /* renamed from: g */
            private Executor f23844g;

            C10072a() {
            }

            /* renamed from: a */
            public C10071b m13130a() {
                return new C10071b(this.f23838a, this.f23839b, this.f23840c, this.f23841d, this.f23842e, this.f23843f, this.f23844g, null);
            }

            /* renamed from: b */
            public C10072a m13129b(AbstractC9520g abstractC9520g) {
                C5051n.m25780n(abstractC9520g);
                this.f23843f = abstractC9520g;
                return this;
            }

            /* renamed from: c */
            public C10072a m13128c(int i) {
                this.f23838a = Integer.valueOf(i);
                return this;
            }

            /* renamed from: d */
            public C10072a m13127d(Executor executor) {
                this.f23844g = executor;
                return this;
            }

            /* renamed from: e */
            public C10072a m13126e(InterfaceC10094z0 interfaceC10094z0) {
                C5051n.m25780n(interfaceC10094z0);
                this.f23839b = interfaceC10094z0;
                return this;
            }

            /* renamed from: f */
            public C10072a m13125f(ScheduledExecutorService scheduledExecutorService) {
                C5051n.m25780n(scheduledExecutorService);
                this.f23842e = scheduledExecutorService;
                return this;
            }

            /* renamed from: g */
            public C10072a m13124g(AbstractC10079h abstractC10079h) {
                C5051n.m25780n(abstractC10079h);
                this.f23841d = abstractC10079h;
                return this;
            }

            /* renamed from: h */
            public C10072a m13123h(ExecutorC9513e1 executorC9513e1) {
                C5051n.m25780n(executorC9513e1);
                this.f23840c = executorC9513e1;
                return this;
            }
        }

        /* synthetic */ C10071b(Integer num, InterfaceC10094z0 interfaceC10094z0, ExecutorC9513e1 executorC9513e1, AbstractC10079h abstractC10079h, ScheduledExecutorService scheduledExecutorService, AbstractC9520g abstractC9520g, Executor executor, C10070a c10070a) {
            this(num, interfaceC10094z0, executorC9513e1, abstractC10079h, scheduledExecutorService, abstractC9520g, executor);
        }

        /* renamed from: f */
        public static C10072a m13131f() {
            return new C10072a();
        }

        /* renamed from: a */
        public int m13136a() {
            return this.f23831a;
        }

        /* renamed from: b */
        public Executor m13135b() {
            return this.f23837g;
        }

        /* renamed from: c */
        public InterfaceC10094z0 m13134c() {
            return this.f23832b;
        }

        /* renamed from: d */
        public AbstractC10079h m13133d() {
            return this.f23834d;
        }

        /* renamed from: e */
        public ExecutorC9513e1 m13132e() {
            return this.f23833c;
        }

        public String toString() {
            C5042j.C5044b m25812c = C5042j.m25812c(this);
            m25812c.m25810b("defaultPort", this.f23831a);
            m25812c.m25808d("proxyDetector", this.f23832b);
            m25812c.m25808d("syncContext", this.f23833c);
            m25812c.m25808d("serviceConfigParser", this.f23834d);
            m25812c.m25808d("scheduledExecutorService", this.f23835e);
            m25812c.m25808d("channelLogger", this.f23836f);
            m25812c.m25808d("executor", this.f23837g);
            return m25812c.toString();
        }

        private C10071b(Integer num, InterfaceC10094z0 interfaceC10094z0, ExecutorC9513e1 executorC9513e1, AbstractC10079h abstractC10079h, ScheduledExecutorService scheduledExecutorService, AbstractC9520g abstractC9520g, Executor executor) {
            C5051n.m25779o(num, "defaultPort not set");
            this.f23831a = num.intValue();
            C5051n.m25779o(interfaceC10094z0, "proxyDetector not set");
            this.f23832b = interfaceC10094z0;
            C5051n.m25779o(executorC9513e1, "syncContext not set");
            this.f23833c = executorC9513e1;
            C5051n.m25779o(abstractC10079h, "serviceConfigParser not set");
            this.f23834d = abstractC10079h;
            this.f23835e = scheduledExecutorService;
            this.f23836f = abstractC9520g;
            this.f23837g = executor;
        }
    }

    /* compiled from: NameResolver.java */
    /* renamed from: io.grpc.u0$d */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC10074d {
        /* renamed from: a */
        public abstract String mo13088a();

        /* renamed from: b */
        public abstract AbstractC10069u0 mo13087b(URI uri, C10071b c10071b);
    }

    /* compiled from: NameResolver.java */
    /* renamed from: io.grpc.u0$e */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC10075e implements InterfaceC10076f {
        @Override // io.grpc.AbstractC10069u0.InterfaceC10076f
        /* renamed from: a */
        public abstract void mo13117a(C9497c1 c9497c1);

        @Override // io.grpc.AbstractC10069u0.InterfaceC10076f
        @Deprecated
        /* renamed from: b */
        public final void mo13116b(List<C10090y> list, C9477a c9477a) {
            C10077g.C10078a m13112d = C10077g.m13112d();
            m13112d.m13110b(list);
            m13112d.m13109c(c9477a);
            mo13118c(m13112d.m13111a());
        }

        /* renamed from: c */
        public abstract void mo13118c(C10077g c10077g);
    }

    /* compiled from: NameResolver.java */
    /* renamed from: io.grpc.u0$f */
    /* loaded from: classes2.dex */
    public interface InterfaceC10076f {
        /* renamed from: a */
        void mo13117a(C9497c1 c9497c1);

        /* renamed from: b */
        void mo13116b(List<C10090y> list, C9477a c9477a);
    }

    /* compiled from: NameResolver.java */
    /* renamed from: io.grpc.u0$g */
    /* loaded from: classes2.dex */
    public static final class C10077g {

        /* renamed from: a */
        private final List<C10090y> f23847a;

        /* renamed from: b */
        private final C9477a f23848b;

        /* renamed from: c */
        private final C10073c f23849c;

        /* compiled from: NameResolver.java */
        /* renamed from: io.grpc.u0$g$a */
        /* loaded from: classes2.dex */
        public static final class C10078a {

            /* renamed from: a */
            private List<C10090y> f23850a = Collections.emptyList();

            /* renamed from: b */
            private C9477a f23851b = C9477a.f22159b;

            /* renamed from: c */
            private C10073c f23852c;

            C10078a() {
            }

            /* renamed from: a */
            public C10077g m13111a() {
                return new C10077g(this.f23850a, this.f23851b, this.f23852c);
            }

            /* renamed from: b */
            public C10078a m13110b(List<C10090y> list) {
                this.f23850a = list;
                return this;
            }

            /* renamed from: c */
            public C10078a m13109c(C9477a c9477a) {
                this.f23851b = c9477a;
                return this;
            }

            /* renamed from: d */
            public C10078a m13108d(C10073c c10073c) {
                this.f23852c = c10073c;
                return this;
            }
        }

        C10077g(List<C10090y> list, C9477a c9477a, C10073c c10073c) {
            this.f23847a = Collections.unmodifiableList(new ArrayList(list));
            C5051n.m25779o(c9477a, "attributes");
            this.f23848b = c9477a;
            this.f23849c = c10073c;
        }

        /* renamed from: d */
        public static C10078a m13112d() {
            return new C10078a();
        }

        /* renamed from: a */
        public List<C10090y> m13115a() {
            return this.f23847a;
        }

        /* renamed from: b */
        public C9477a m13114b() {
            return this.f23848b;
        }

        /* renamed from: c */
        public C10073c m13113c() {
            return this.f23849c;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C10077g) {
                C10077g c10077g = (C10077g) obj;
                return C5046k.m25800a(this.f23847a, c10077g.f23847a) && C5046k.m25800a(this.f23848b, c10077g.f23848b) && C5046k.m25800a(this.f23849c, c10077g.f23849c);
            }
            return false;
        }

        public int hashCode() {
            return C5046k.m25799b(this.f23847a, this.f23848b, this.f23849c);
        }

        public String toString() {
            C5042j.C5044b m25812c = C5042j.m25812c(this);
            m25812c.m25808d("addresses", this.f23847a);
            m25812c.m25808d("attributes", this.f23848b);
            m25812c.m25808d("serviceConfig", this.f23849c);
            return m25812c.toString();
        }
    }

    /* compiled from: NameResolver.java */
    /* renamed from: io.grpc.u0$h */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC10079h {
        /* renamed from: a */
        public abstract C10073c mo13107a(Map<String, ?> map);
    }

    /* renamed from: a */
    public abstract String mo13141a();

    /* renamed from: b */
    public void mo13140b() {
    }

    /* renamed from: c */
    public abstract void mo13139c();

    /* renamed from: d */
    public void mo13138d(AbstractC10075e abstractC10075e) {
        mo13137e(abstractC10075e);
    }

    /* renamed from: e */
    public void mo13137e(InterfaceC10076f interfaceC10076f) {
        if (interfaceC10076f instanceof AbstractC10075e) {
            mo13138d((AbstractC10075e) interfaceC10076f);
        } else {
            mo13138d(new C10070a(this, interfaceC10076f));
        }
    }

    /* compiled from: NameResolver.java */
    /* renamed from: io.grpc.u0$c */
    /* loaded from: classes2.dex */
    public static final class C10073c {

        /* renamed from: a */
        private final C9497c1 f23845a;

        /* renamed from: b */
        private final Object f23846b;

        private C10073c(Object obj) {
            C5051n.m25779o(obj, "config");
            this.f23846b = obj;
            this.f23845a = null;
        }

        /* renamed from: a */
        public static C10073c m13122a(Object obj) {
            return new C10073c(obj);
        }

        /* renamed from: b */
        public static C10073c m13121b(C9497c1 c9497c1) {
            return new C10073c(c9497c1);
        }

        /* renamed from: c */
        public Object m13120c() {
            return this.f23846b;
        }

        /* renamed from: d */
        public C9497c1 m13119d() {
            return this.f23845a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C10073c.class != obj.getClass()) {
                return false;
            }
            C10073c c10073c = (C10073c) obj;
            return C5046k.m25800a(this.f23845a, c10073c.f23845a) && C5046k.m25800a(this.f23846b, c10073c.f23846b);
        }

        public int hashCode() {
            return C5046k.m25799b(this.f23845a, this.f23846b);
        }

        public String toString() {
            if (this.f23846b != null) {
                C5042j.C5044b m25812c = C5042j.m25812c(this);
                m25812c.m25808d("config", this.f23846b);
                return m25812c.toString();
            }
            C5042j.C5044b m25812c2 = C5042j.m25812c(this);
            m25812c2.m25808d(IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, this.f23845a);
            return m25812c2.toString();
        }

        private C10073c(C9497c1 c9497c1) {
            this.f23846b = null;
            C5051n.m25779o(c9497c1, TransactionField.STATUS);
            this.f23845a = c9497c1;
            C5051n.m25784j(!c9497c1.m14580p(), "cannot use OK status: %s", c9497c1);
        }
    }
}
