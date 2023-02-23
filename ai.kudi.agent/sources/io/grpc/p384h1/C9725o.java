package io.grpc.p384h1;

import com.google.common.base.C5051n;
import io.grpc.AbstractC9520g;
import io.grpc.C9504d0;
import io.grpc.C9526h0;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChannelTracer.java */
/* renamed from: io.grpc.h1.o */
/* loaded from: classes2.dex */
public final class C9725o {

    /* renamed from: e */
    static final Logger f22825e = Logger.getLogger(AbstractC9520g.class.getName());

    /* renamed from: a */
    private final Object f22826a = new Object();

    /* renamed from: b */
    private final C9526h0 f22827b;

    /* renamed from: c */
    private final Collection<C9504d0> f22828c;

    /* renamed from: d */
    private int f22829d;

    /* compiled from: ChannelTracer.java */
    /* renamed from: io.grpc.h1.o$a */
    /* loaded from: classes2.dex */
    class C9726a extends ArrayDeque<C9504d0> {

        /* renamed from: c */
        final /* synthetic */ int f22830c;

        C9726a(int i) {
            this.f22830c = i;
        }

        @Override // java.util.ArrayDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque, java.util.Queue
        /* renamed from: d */
        public boolean add(C9504d0 c9504d0) {
            if (size() == this.f22830c) {
                removeFirst();
            }
            C9725o.m14123a(C9725o.this);
            return super.add(c9504d0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChannelTracer.java */
    /* renamed from: io.grpc.h1.o$b */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C9727b {

        /* renamed from: a */
        static final /* synthetic */ int[] f22832a;

        static {
            int[] iArr = new int[C9504d0.EnumC9506b.values().length];
            f22832a = iArr;
            try {
                iArr[C9504d0.EnumC9506b.CT_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22832a[C9504d0.EnumC9506b.CT_WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9725o(C9526h0 c9526h0, int i, long j, String str) {
        C5051n.m25779o(str, "description");
        C5051n.m25779o(c9526h0, "logId");
        this.f22827b = c9526h0;
        if (i > 0) {
            this.f22828c = new C9726a(i);
        } else {
            this.f22828c = null;
        }
        C9504d0.C9505a c9505a = new C9504d0.C9505a();
        c9505a.m14544b(str + " created");
        c9505a.m14543c(C9504d0.EnumC9506b.CT_INFO);
        c9505a.m14541e(j);
        m14119e(c9505a.m14545a());
    }

    /* renamed from: a */
    static /* synthetic */ int m14123a(C9725o c9725o) {
        int i = c9725o.f22829d;
        c9725o.f22829d = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static void m14120d(C9526h0 c9526h0, Level level, String str) {
        if (f22825e.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, "[" + c9526h0 + "] " + str);
            logRecord.setLoggerName(f22825e.getName());
            logRecord.setSourceClassName(f22825e.getName());
            logRecord.setSourceMethodName("log");
            f22825e.log(logRecord);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C9526h0 m14122b() {
        return this.f22827b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m14121c() {
        boolean z;
        synchronized (this.f22826a) {
            z = this.f22828c != null;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m14119e(C9504d0 c9504d0) {
        Level level;
        int i = C9727b.f22832a[c9504d0.f22237b.ordinal()];
        if (i == 1) {
            level = Level.FINE;
        } else if (i != 2) {
            level = Level.FINEST;
        } else {
            level = Level.FINER;
        }
        m14118f(c9504d0);
        m14120d(this.f22827b, level, c9504d0.f22236a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m14118f(C9504d0 c9504d0) {
        synchronized (this.f22826a) {
            if (this.f22828c != null) {
                this.f22828c.add(c9504d0);
            }
        }
    }
}
