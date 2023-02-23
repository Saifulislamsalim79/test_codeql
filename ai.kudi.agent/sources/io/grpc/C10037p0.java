package io.grpc;

import com.google.common.base.C5051n;
import io.grpc.C9487b1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: LoadBalancerRegistry.java */
/* renamed from: io.grpc.p0 */
/* loaded from: classes2.dex */
public final class C10037p0 {

    /* renamed from: d */
    private static C10037p0 f23764d;

    /* renamed from: a */
    private final LinkedHashSet<AbstractC10034o0> f23766a = new LinkedHashSet<>();

    /* renamed from: b */
    private final LinkedHashMap<String, AbstractC10034o0> f23767b = new LinkedHashMap<>();

    /* renamed from: c */
    private static final Logger f23763c = Logger.getLogger(C10037p0.class.getName());

    /* renamed from: e */
    private static final Iterable<Class<?>> f23765e = m13249c();

    /* compiled from: LoadBalancerRegistry.java */
    /* renamed from: io.grpc.p0$a */
    /* loaded from: classes2.dex */
    private static final class C10038a implements C9487b1.InterfaceC9489b<AbstractC10034o0> {
        C10038a() {
        }

        @Override // io.grpc.C9487b1.InterfaceC9489b
        /* renamed from: c */
        public int mo13085b(AbstractC10034o0 abstractC10034o0) {
            return abstractC10034o0.mo13256c();
        }

        @Override // io.grpc.C9487b1.InterfaceC9489b
        /* renamed from: d */
        public boolean mo13086a(AbstractC10034o0 abstractC10034o0) {
            return abstractC10034o0.mo13255d();
        }
    }

    /* renamed from: a */
    private synchronized void m13251a(AbstractC10034o0 abstractC10034o0) {
        C5051n.m25789e(abstractC10034o0.mo13255d(), "isAvailable() returned false");
        this.f23766a.add(abstractC10034o0);
    }

    /* renamed from: b */
    public static synchronized C10037p0 m13250b() {
        C10037p0 c10037p0;
        synchronized (C10037p0.class) {
            if (f23764d == null) {
                List<AbstractC10034o0> m14607e = C9487b1.m14607e(AbstractC10034o0.class, f23765e, AbstractC10034o0.class.getClassLoader(), new C10038a());
                f23764d = new C10037p0();
                for (AbstractC10034o0 abstractC10034o0 : m14607e) {
                    Logger logger = f23763c;
                    logger.fine("Service loader found " + abstractC10034o0);
                    if (abstractC10034o0.mo13255d()) {
                        f23764d.m13251a(abstractC10034o0);
                    }
                }
                f23764d.m13247e();
            }
            c10037p0 = f23764d;
        }
        return c10037p0;
    }

    /* renamed from: c */
    static List<Class<?>> m13249c() {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(Class.forName("io.grpc.h1.s1"));
        } catch (ClassNotFoundException e) {
            f23763c.log(Level.WARNING, "Unable to find pick-first LoadBalancer", (Throwable) e);
        }
        try {
            arrayList.add(Class.forName("io.grpc.l1.b"));
        } catch (ClassNotFoundException e2) {
            f23763c.log(Level.FINE, "Unable to find round-robin LoadBalancer", (Throwable) e2);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: e */
    private synchronized void m13247e() {
        this.f23767b.clear();
        Iterator<AbstractC10034o0> it = this.f23766a.iterator();
        while (it.hasNext()) {
            AbstractC10034o0 next = it.next();
            String mo13257b = next.mo13257b();
            AbstractC10034o0 abstractC10034o0 = this.f23767b.get(mo13257b);
            if (abstractC10034o0 == null || abstractC10034o0.mo13256c() < next.mo13256c()) {
                this.f23767b.put(mo13257b, next);
            }
        }
    }

    /* renamed from: d */
    public synchronized AbstractC10034o0 m13248d(String str) {
        LinkedHashMap<String, AbstractC10034o0> linkedHashMap;
        linkedHashMap = this.f23767b;
        C5051n.m25779o(str, "policy");
        return linkedHashMap.get(str);
    }
}
