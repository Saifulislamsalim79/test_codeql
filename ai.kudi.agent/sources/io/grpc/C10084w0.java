package io.grpc;

import com.google.common.base.C5051n;
import com.google.common.collect.AbstractC5077j;
import io.grpc.AbstractC10069u0;
import io.grpc.C9487b1;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: NameResolverRegistry.java */
/* renamed from: io.grpc.w0 */
/* loaded from: classes2.dex */
public final class C10084w0 {

    /* renamed from: e */
    private static final Logger f23859e = Logger.getLogger(C10084w0.class.getName());

    /* renamed from: f */
    private static C10084w0 f23860f;

    /* renamed from: a */
    private final AbstractC10069u0.AbstractC10074d f23861a = new C10086b();

    /* renamed from: b */
    private String f23862b = "unknown";

    /* renamed from: c */
    private final LinkedHashSet<AbstractC10081v0> f23863c = new LinkedHashSet<>();

    /* renamed from: d */
    private AbstractC5077j<String, AbstractC10081v0> f23864d = AbstractC5077j.m25724l();

    /* compiled from: NameResolverRegistry.java */
    /* renamed from: io.grpc.w0$b */
    /* loaded from: classes2.dex */
    private final class C10086b extends AbstractC10069u0.AbstractC10074d {
        private C10086b() {
        }

        @Override // io.grpc.AbstractC10069u0.AbstractC10074d
        /* renamed from: a */
        public String mo13088a() {
            String str;
            synchronized (C10084w0.this) {
                str = C10084w0.this.f23862b;
            }
            return str;
        }

        @Override // io.grpc.AbstractC10069u0.AbstractC10074d
        /* renamed from: b */
        public AbstractC10069u0 mo13087b(URI uri, AbstractC10069u0.C10071b c10071b) {
            AbstractC10081v0 abstractC10081v0 = C10084w0.this.m13090f().get(uri.getScheme());
            if (abstractC10081v0 == null) {
                return null;
            }
            return abstractC10081v0.mo13087b(uri, c10071b);
        }
    }

    /* compiled from: NameResolverRegistry.java */
    /* renamed from: io.grpc.w0$c */
    /* loaded from: classes2.dex */
    private static final class C10087c implements C9487b1.InterfaceC9489b<AbstractC10081v0> {
        private C10087c() {
        }

        @Override // io.grpc.C9487b1.InterfaceC9489b
        /* renamed from: c */
        public int mo13085b(AbstractC10081v0 abstractC10081v0) {
            return abstractC10081v0.mo13102e();
        }

        @Override // io.grpc.C9487b1.InterfaceC9489b
        /* renamed from: d */
        public boolean mo13086a(AbstractC10081v0 abstractC10081v0) {
            return abstractC10081v0.mo13103d();
        }
    }

    /* renamed from: b */
    private synchronized void m13094b(AbstractC10081v0 abstractC10081v0) {
        C5051n.m25789e(abstractC10081v0.mo13103d(), "isAvailable() returned false");
        this.f23863c.add(abstractC10081v0);
    }

    /* renamed from: d */
    public static synchronized C10084w0 m13092d() {
        C10084w0 c10084w0;
        synchronized (C10084w0.class) {
            if (f23860f == null) {
                List<AbstractC10081v0> m14607e = C9487b1.m14607e(AbstractC10081v0.class, m13091e(), AbstractC10081v0.class.getClassLoader(), new C10087c());
                if (m14607e.isEmpty()) {
                    f23859e.warning("No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                }
                f23860f = new C10084w0();
                for (AbstractC10081v0 abstractC10081v0 : m14607e) {
                    Logger logger = f23859e;
                    logger.fine("Service loader found " + abstractC10081v0);
                    if (abstractC10081v0.mo13103d()) {
                        f23860f.m13094b(abstractC10081v0);
                    }
                }
                f23860f.m13089g();
            }
            c10084w0 = f23860f;
        }
        return c10084w0;
    }

    /* renamed from: e */
    static List<Class<?>> m13091e() {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(Class.forName("io.grpc.h1.d0"));
        } catch (ClassNotFoundException e) {
            f23859e.log(Level.FINE, "Unable to find DNS NameResolver", (Throwable) e);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: g */
    private synchronized void m13089g() {
        HashMap hashMap = new HashMap();
        int i = Integer.MIN_VALUE;
        String str = "unknown";
        Iterator<AbstractC10081v0> it = this.f23863c.iterator();
        while (it.hasNext()) {
            AbstractC10081v0 next = it.next();
            String m13104c = next.m13104c();
            AbstractC10081v0 abstractC10081v0 = (AbstractC10081v0) hashMap.get(m13104c);
            if (abstractC10081v0 == null || abstractC10081v0.mo13102e() < next.mo13102e()) {
                hashMap.put(m13104c, next);
            }
            if (i < next.mo13102e()) {
                i = next.mo13102e();
                str = next.m13104c();
            }
        }
        this.f23864d = AbstractC5077j.m25727c(hashMap);
        this.f23862b = str;
    }

    /* renamed from: c */
    public AbstractC10069u0.AbstractC10074d m13093c() {
        return this.f23861a;
    }

    /* renamed from: f */
    synchronized Map<String, AbstractC10081v0> m13090f() {
        return this.f23864d;
    }
}
