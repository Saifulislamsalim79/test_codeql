package io.grpc;

import com.google.common.base.C5042j;
import com.google.common.base.C5051n;
import io.grpc.AbstractC10001l;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: CallOptions.java */
/* renamed from: io.grpc.d */
/* loaded from: classes2.dex */
public final class C9502d {

    /* renamed from: k */
    public static final C9502d f22223k = new C9502d();

    /* renamed from: a */
    private C10065u f22224a;

    /* renamed from: b */
    private Executor f22225b;

    /* renamed from: c */
    private String f22226c;

    /* renamed from: d */
    private AbstractC9490c f22227d;

    /* renamed from: e */
    private String f22228e;

    /* renamed from: f */
    private Object[][] f22229f;

    /* renamed from: g */
    private List<AbstractC10001l.AbstractC10002a> f22230g;

    /* renamed from: h */
    private Boolean f22231h;

    /* renamed from: i */
    private Integer f22232i;

    /* renamed from: j */
    private Integer f22233j;

    /* compiled from: CallOptions.java */
    /* renamed from: io.grpc.d$a */
    /* loaded from: classes2.dex */
    public static final class C9503a<T> {

        /* renamed from: a */
        private final String f22234a;

        /* renamed from: b */
        private final T f22235b;

        private C9503a(String str, T t) {
            this.f22234a = str;
            this.f22235b = t;
        }

        /* renamed from: b */
        public static <T> C9503a<T> m14546b(String str) {
            C5051n.m25779o(str, "debugString");
            return new C9503a<>(str, null);
        }

        public String toString() {
            return this.f22234a;
        }
    }

    private C9502d() {
        this.f22230g = Collections.emptyList();
        this.f22229f = (Object[][]) Array.newInstance(Object.class, 0, 2);
    }

    /* renamed from: a */
    public String m14566a() {
        return this.f22226c;
    }

    /* renamed from: b */
    public String m14565b() {
        return this.f22228e;
    }

    /* renamed from: c */
    public AbstractC9490c m14564c() {
        return this.f22227d;
    }

    /* renamed from: d */
    public C10065u m14563d() {
        return this.f22224a;
    }

    /* renamed from: e */
    public Executor m14562e() {
        return this.f22225b;
    }

    /* renamed from: f */
    public Integer m14561f() {
        return this.f22232i;
    }

    /* renamed from: g */
    public Integer m14560g() {
        return this.f22233j;
    }

    /* renamed from: h */
    public <T> T m14559h(C9503a<T> c9503a) {
        C5051n.m25779o(c9503a, "key");
        int i = 0;
        while (true) {
            Object[][] objArr = this.f22229f;
            if (i >= objArr.length) {
                return (T) ((C9503a) c9503a).f22235b;
            }
            if (c9503a.equals(objArr[i][0])) {
                return (T) this.f22229f[i][1];
            }
            i++;
        }
    }

    /* renamed from: i */
    public List<AbstractC10001l.AbstractC10002a> m14558i() {
        return this.f22230g;
    }

    /* renamed from: j */
    public boolean m14557j() {
        return Boolean.TRUE.equals(this.f22231h);
    }

    /* renamed from: k */
    public C9502d m14556k(C10065u c10065u) {
        C9502d c9502d = new C9502d(this);
        c9502d.f22224a = c10065u;
        return c9502d;
    }

    /* renamed from: l */
    public C9502d m14555l(long j, TimeUnit timeUnit) {
        return m14556k(C10065u.m13151a(j, timeUnit));
    }

    /* renamed from: m */
    public C9502d m14554m(Executor executor) {
        C9502d c9502d = new C9502d(this);
        c9502d.f22225b = executor;
        return c9502d;
    }

    /* renamed from: n */
    public C9502d m14553n(int i) {
        C5051n.m25786h(i >= 0, "invalid maxsize %s", i);
        C9502d c9502d = new C9502d(this);
        c9502d.f22232i = Integer.valueOf(i);
        return c9502d;
    }

    /* renamed from: o */
    public C9502d m14552o(int i) {
        C5051n.m25786h(i >= 0, "invalid maxsize %s", i);
        C9502d c9502d = new C9502d(this);
        c9502d.f22233j = Integer.valueOf(i);
        return c9502d;
    }

    /* renamed from: p */
    public <T> C9502d m14551p(C9503a<T> c9503a, T t) {
        C5051n.m25779o(c9503a, "key");
        C5051n.m25779o(t, "value");
        C9502d c9502d = new C9502d(this);
        int i = 0;
        while (true) {
            Object[][] objArr = this.f22229f;
            if (i >= objArr.length) {
                i = -1;
                break;
            } else if (c9503a.equals(objArr[i][0])) {
                break;
            } else {
                i++;
            }
        }
        Object[][] objArr2 = (Object[][]) Array.newInstance(Object.class, this.f22229f.length + (i == -1 ? 1 : 0), 2);
        c9502d.f22229f = objArr2;
        Object[][] objArr3 = this.f22229f;
        System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
        if (i == -1) {
            Object[][] objArr4 = c9502d.f22229f;
            int length = this.f22229f.length;
            Object[] objArr5 = new Object[2];
            objArr5[0] = c9503a;
            objArr5[1] = t;
            objArr4[length] = objArr5;
        } else {
            Object[][] objArr6 = c9502d.f22229f;
            Object[] objArr7 = new Object[2];
            objArr7[0] = c9503a;
            objArr7[1] = t;
            objArr6[i] = objArr7;
        }
        return c9502d;
    }

    /* renamed from: q */
    public C9502d m14550q(AbstractC10001l.AbstractC10002a abstractC10002a) {
        C9502d c9502d = new C9502d(this);
        ArrayList arrayList = new ArrayList(this.f22230g.size() + 1);
        arrayList.addAll(this.f22230g);
        arrayList.add(abstractC10002a);
        c9502d.f22230g = Collections.unmodifiableList(arrayList);
        return c9502d;
    }

    /* renamed from: r */
    public C9502d m14549r() {
        C9502d c9502d = new C9502d(this);
        c9502d.f22231h = Boolean.TRUE;
        return c9502d;
    }

    /* renamed from: s */
    public C9502d m14548s() {
        C9502d c9502d = new C9502d(this);
        c9502d.f22231h = Boolean.FALSE;
        return c9502d;
    }

    public String toString() {
        C5042j.C5044b m25812c = C5042j.m25812c(this);
        m25812c.m25808d("deadline", this.f22224a);
        m25812c.m25808d("authority", this.f22226c);
        m25812c.m25808d("callCredentials", this.f22227d);
        Executor executor = this.f22225b;
        m25812c.m25808d("executor", executor != null ? executor.getClass() : null);
        m25812c.m25808d("compressorName", this.f22228e);
        m25812c.m25808d("customOptions", Arrays.deepToString(this.f22229f));
        m25812c.m25807e("waitForReady", m14557j());
        m25812c.m25808d("maxInboundMessageSize", this.f22232i);
        m25812c.m25808d("maxOutboundMessageSize", this.f22233j);
        m25812c.m25808d("streamTracerFactories", this.f22230g);
        return m25812c.toString();
    }

    private C9502d(C9502d c9502d) {
        this.f22230g = Collections.emptyList();
        this.f22224a = c9502d.f22224a;
        this.f22226c = c9502d.f22226c;
        this.f22227d = c9502d.f22227d;
        this.f22225b = c9502d.f22225b;
        this.f22228e = c9502d.f22228e;
        this.f22229f = c9502d.f22229f;
        this.f22231h = c9502d.f22231h;
        this.f22232i = c9502d.f22232i;
        this.f22233j = c9502d.f22233j;
        this.f22230g = c9502d.f22230g;
    }
}
