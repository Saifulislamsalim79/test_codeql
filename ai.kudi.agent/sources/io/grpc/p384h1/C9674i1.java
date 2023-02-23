package io.grpc.p384h1;

import io.grpc.AbstractC10040q0;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ManagedChannelOrphanWrapper.java */
/* renamed from: io.grpc.h1.i1 */
/* loaded from: classes2.dex */
public final class C9674i1 extends AbstractC9712m0 {

    /* renamed from: b */
    private static final ReferenceQueue<C9674i1> f22717b = new ReferenceQueue<>();

    /* renamed from: c */
    private static final ConcurrentMap<C9675a, C9675a> f22718c = new ConcurrentHashMap();

    /* renamed from: d */
    private static final Logger f22719d = Logger.getLogger(C9674i1.class.getName());

    /* compiled from: ManagedChannelOrphanWrapper.java */
    /* renamed from: io.grpc.h1.i1$a */
    /* loaded from: classes2.dex */
    static final class C9675a extends WeakReference<C9674i1> {

        /* renamed from: f */
        private static final boolean f22720f = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));

        /* renamed from: g */
        private static final RuntimeException f22721g = m14220c();

        /* renamed from: a */
        private final ReferenceQueue<C9674i1> f22722a;

        /* renamed from: b */
        private final ConcurrentMap<C9675a, C9675a> f22723b;

        /* renamed from: c */
        private final String f22724c;

        /* renamed from: d */
        private final Reference<RuntimeException> f22725d;

        /* renamed from: e */
        private final AtomicBoolean f22726e;

        C9675a(C9674i1 c9674i1, AbstractC10040q0 abstractC10040q0, ReferenceQueue<C9674i1> referenceQueue, ConcurrentMap<C9675a, C9675a> concurrentMap) {
            super(c9674i1, referenceQueue);
            RuntimeException runtimeException;
            this.f22726e = new AtomicBoolean();
            if (f22720f) {
                runtimeException = new RuntimeException("ManagedChannel allocation site");
            } else {
                runtimeException = f22721g;
            }
            this.f22725d = new SoftReference(runtimeException);
            this.f22724c = abstractC10040q0.toString();
            this.f22722a = referenceQueue;
            this.f22723b = concurrentMap;
            concurrentMap.put(this, this);
            m14222a(referenceQueue);
        }

        /* renamed from: a */
        static int m14222a(ReferenceQueue<C9674i1> referenceQueue) {
            int i = 0;
            while (true) {
                C9675a c9675a = (C9675a) referenceQueue.poll();
                if (c9675a == null) {
                    return i;
                }
                RuntimeException runtimeException = c9675a.f22725d.get();
                c9675a.m14221b();
                if (!c9675a.f22726e.get()) {
                    i++;
                    Level level = Level.SEVERE;
                    if (C9674i1.f22719d.isLoggable(level)) {
                        LogRecord logRecord = new LogRecord(level, "*~*~*~ Channel {0} was not shutdown properly!!! ~*~*~*" + System.getProperty("line.separator") + "    Make sure to call shutdown()/shutdownNow() and wait until awaitTermination() returns true.");
                        logRecord.setLoggerName(C9674i1.f22719d.getName());
                        logRecord.setParameters(new Object[]{c9675a.f22724c});
                        logRecord.setThrown(runtimeException);
                        C9674i1.f22719d.log(logRecord);
                    }
                }
            }
        }

        /* renamed from: b */
        private void m14221b() {
            super.clear();
            this.f22723b.remove(this);
            this.f22725d.clear();
        }

        /* renamed from: c */
        private static RuntimeException m14220c() {
            RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
            runtimeException.setStackTrace(new StackTraceElement[0]);
            return runtimeException;
        }

        @Override // java.lang.ref.Reference
        public void clear() {
            m14221b();
            m14222a(this.f22722a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9674i1(AbstractC10040q0 abstractC10040q0) {
        this(abstractC10040q0, f22717b, f22718c);
    }

    C9674i1(AbstractC10040q0 abstractC10040q0, ReferenceQueue<C9674i1> referenceQueue, ConcurrentMap<C9675a, C9675a> concurrentMap) {
        super(abstractC10040q0);
        new C9675a(this, abstractC10040q0, referenceQueue, concurrentMap);
    }
}
