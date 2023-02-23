package io.grpc;

import com.google.common.base.C5051n;
import io.grpc.C9487b1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes2.dex */
public final class ManagedChannelRegistry {

    /* renamed from: c */
    private static final Logger f22149c = Logger.getLogger(ManagedChannelRegistry.class.getName());

    /* renamed from: d */
    private static ManagedChannelRegistry f22150d;

    /* renamed from: a */
    private final LinkedHashSet<ManagedChannelProvider> f22151a = new LinkedHashSet<>();

    /* renamed from: b */
    private List<ManagedChannelProvider> f22152b = Collections.emptyList();

    /* loaded from: classes2.dex */
    public static final class ProviderNotFoundException extends RuntimeException {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.ManagedChannelRegistry$a */
    /* loaded from: classes2.dex */
    public class C9475a implements Comparator<ManagedChannelProvider> {
        C9475a(ManagedChannelRegistry managedChannelRegistry) {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(ManagedChannelProvider managedChannelProvider, ManagedChannelProvider managedChannelProvider2) {
            return managedChannelProvider.mo13713c() - managedChannelProvider2.mo13713c();
        }
    }

    /* renamed from: io.grpc.ManagedChannelRegistry$b */
    /* loaded from: classes2.dex */
    private static final class C9476b implements C9487b1.InterfaceC9489b<ManagedChannelProvider> {
        private C9476b() {
        }

        @Override // io.grpc.C9487b1.InterfaceC9489b
        /* renamed from: c */
        public int mo13085b(ManagedChannelProvider managedChannelProvider) {
            return managedChannelProvider.mo13713c();
        }

        @Override // io.grpc.C9487b1.InterfaceC9489b
        /* renamed from: d */
        public boolean mo13086a(ManagedChannelProvider managedChannelProvider) {
            return managedChannelProvider.mo13714b();
        }

        /* synthetic */ C9476b(C9475a c9475a) {
            this();
        }
    }

    /* renamed from: a */
    private synchronized void m14644a(ManagedChannelProvider managedChannelProvider) {
        C5051n.m25789e(managedChannelProvider.mo13714b(), "isAvailable() returned false");
        this.f22151a.add(managedChannelProvider);
    }

    /* renamed from: b */
    public static synchronized ManagedChannelRegistry m14643b() {
        ManagedChannelRegistry managedChannelRegistry;
        synchronized (ManagedChannelRegistry.class) {
            if (f22150d == null) {
                List<ManagedChannelProvider> m14607e = C9487b1.m14607e(ManagedChannelProvider.class, m14642c(), ManagedChannelProvider.class.getClassLoader(), new C9476b(null));
                f22150d = new ManagedChannelRegistry();
                for (ManagedChannelProvider managedChannelProvider : m14607e) {
                    Logger logger = f22149c;
                    logger.fine("Service loader found " + managedChannelProvider);
                    if (managedChannelProvider.mo13714b()) {
                        f22150d.m14644a(managedChannelProvider);
                    }
                }
                f22150d.m14639f();
            }
            managedChannelRegistry = f22150d;
        }
        return managedChannelRegistry;
    }

    /* renamed from: c */
    static List<Class<?>> m14642c() {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(Class.forName("io.grpc.i1.f"));
        } catch (ClassNotFoundException e) {
            f22149c.log(Level.FINE, "Unable to find OkHttpChannelProvider", (Throwable) e);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.NettyChannelProvider"));
        } catch (ClassNotFoundException e2) {
            f22149c.log(Level.FINE, "Unable to find NettyChannelProvider", (Throwable) e2);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: f */
    private synchronized void m14639f() {
        ArrayList arrayList = new ArrayList(this.f22151a);
        Collections.sort(arrayList, Collections.reverseOrder(new C9475a(this)));
        this.f22152b = Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public ManagedChannelProvider m14641d() {
        List<ManagedChannelProvider> m14640e = m14640e();
        if (m14640e.isEmpty()) {
            return null;
        }
        return m14640e.get(0);
    }

    /* renamed from: e */
    synchronized List<ManagedChannelProvider> m14640e() {
        return this.f22152b;
    }
}
