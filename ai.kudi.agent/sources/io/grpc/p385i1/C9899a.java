package io.grpc.p385i1;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import com.google.common.base.C5051n;
import io.grpc.p384h1.ExecutorC9587d2;
import io.grpc.p385i1.C9904b;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.IOException;
import java.net.Socket;
import p425j.p443d.C11266b;
import p425j.p443d.C11267c;
import p576m.C14342c;
import p576m.C14366t;
import p576m.InterfaceC14364r;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AsyncSink.java */
/* renamed from: io.grpc.i1.a */
/* loaded from: classes2.dex */
public final class C9899a implements InterfaceC14364r {

    /* renamed from: A */
    private Socket f23243A;

    /* renamed from: e */
    private final ExecutorC9587d2 f23246e;

    /* renamed from: f */
    private final C9904b.InterfaceC9905a f23247f;

    /* renamed from: z */
    private InterfaceC14364r f23251z;

    /* renamed from: c */
    private final Object f23244c = new Object();

    /* renamed from: d */
    private final C14342c f23245d = new C14342c();

    /* renamed from: w */
    private boolean f23248w = false;

    /* renamed from: x */
    private boolean f23249x = false;

    /* renamed from: y */
    private boolean f23250y = false;

    /* compiled from: AsyncSink.java */
    /* renamed from: io.grpc.i1.a$a */
    /* loaded from: classes2.dex */
    class C9900a extends AbstractRunnableC9903d {

        /* renamed from: d */
        final C11266b f23252d;

        C9900a() {
            super(C9899a.this, null);
            this.f23252d = C11267c.m11255e();
        }

        @Override // io.grpc.p385i1.C9899a.AbstractRunnableC9903d
        /* renamed from: a */
        public void mo13732a() throws IOException {
            C11267c.m11254f("WriteRunnable.runWrite");
            C11267c.m11256d(this.f23252d);
            C14342c c14342c = new C14342c();
            try {
                synchronized (C9899a.this.f23244c) {
                    c14342c.mo1444r0(C9899a.this.f23245d, C9899a.this.f23245d.m2073F());
                    C9899a.this.f23248w = false;
                }
                C9899a.this.f23251z.mo1444r0(c14342c, c14342c.m2072F0());
            } finally {
                C11267c.m11252h("WriteRunnable.runWrite");
            }
        }
    }

    /* compiled from: AsyncSink.java */
    /* renamed from: io.grpc.i1.a$b */
    /* loaded from: classes2.dex */
    class C9901b extends AbstractRunnableC9903d {

        /* renamed from: d */
        final C11266b f23254d;

        C9901b() {
            super(C9899a.this, null);
            this.f23254d = C11267c.m11255e();
        }

        @Override // io.grpc.p385i1.C9899a.AbstractRunnableC9903d
        /* renamed from: a */
        public void mo13732a() throws IOException {
            C11267c.m11254f("WriteRunnable.runFlush");
            C11267c.m11256d(this.f23254d);
            C14342c c14342c = new C14342c();
            try {
                synchronized (C9899a.this.f23244c) {
                    c14342c.mo1444r0(C9899a.this.f23245d, C9899a.this.f23245d.m2072F0());
                    C9899a.this.f23249x = false;
                }
                C9899a.this.f23251z.mo1444r0(c14342c, c14342c.m2072F0());
                C9899a.this.f23251z.flush();
            } finally {
                C11267c.m11252h("WriteRunnable.runFlush");
            }
        }
    }

    /* compiled from: AsyncSink.java */
    /* renamed from: io.grpc.i1.a$c */
    /* loaded from: classes2.dex */
    class RunnableC9902c implements Runnable {
        RunnableC9902c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C9899a.this.f23245d.close();
            try {
                if (C9899a.this.f23251z != null) {
                    C9899a.this.f23251z.close();
                }
            } catch (IOException e) {
                C9899a.this.f23247f.mo13639a(e);
            }
            try {
                if (C9899a.this.f23243A != null) {
                    C9899a.this.f23243A.close();
                }
            } catch (IOException e2) {
                C9899a.this.f23247f.mo13639a(e2);
            }
        }
    }

    /* compiled from: AsyncSink.java */
    /* renamed from: io.grpc.i1.a$d */
    /* loaded from: classes2.dex */
    private abstract class AbstractRunnableC9903d implements Runnable {
        private AbstractRunnableC9903d() {
        }

        /* renamed from: a */
        public abstract void mo13732a() throws IOException;

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (C9899a.this.f23251z != null) {
                    mo13732a();
                    return;
                }
                throw new IOException("Unable to perform write due to unavailable sink.");
            } catch (Exception e) {
                C9899a.this.f23247f.mo13639a(e);
            }
        }

        /* synthetic */ AbstractRunnableC9903d(C9899a c9899a, C9900a c9900a) {
            this();
        }
    }

    private C9899a(ExecutorC9587d2 executorC9587d2, C9904b.InterfaceC9905a interfaceC9905a) {
        C5051n.m25779o(executorC9587d2, "executor");
        this.f23246e = executorC9587d2;
        C5051n.m25779o(interfaceC9905a, "exceptionHandler");
        this.f23247f = interfaceC9905a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: V */
    public static C9899a m13736V(ExecutorC9587d2 executorC9587d2, C9904b.InterfaceC9905a interfaceC9905a) {
        return new C9899a(executorC9587d2, interfaceC9905a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public void m13737P(InterfaceC14364r interfaceC14364r, Socket socket) {
        C5051n.m25773u(this.f23251z == null, "AsyncSink's becomeConnected should only be called once.");
        C5051n.m25779o(interfaceC14364r, "sink");
        this.f23251z = interfaceC14364r;
        C5051n.m25779o(socket, "socket");
        this.f23243A = socket;
    }

    @Override // p576m.InterfaceC14364r, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f23250y) {
            return;
        }
        this.f23250y = true;
        this.f23246e.execute(new RunnableC9902c());
    }

    @Override // p576m.InterfaceC14364r, java.io.Flushable
    public void flush() throws IOException {
        if (!this.f23250y) {
            C11267c.m11254f("AsyncSink.flush");
            try {
                synchronized (this.f23244c) {
                    if (this.f23249x) {
                        return;
                    }
                    this.f23249x = true;
                    this.f23246e.execute(new C9901b());
                    return;
                }
            } finally {
                C11267c.m11252h("AsyncSink.flush");
            }
        }
        throw new IOException(MetricTracker.Action.CLOSED);
    }

    @Override // p576m.InterfaceC14364r
    /* renamed from: r0 */
    public void mo1444r0(C14342c c14342c, long j) throws IOException {
        C5051n.m25779o(c14342c, TransactionField.TRANSACTION_CHANNEL);
        if (!this.f23250y) {
            C11267c.m11254f("AsyncSink.write");
            try {
                synchronized (this.f23244c) {
                    this.f23245d.mo1444r0(c14342c, j);
                    if (!this.f23248w && !this.f23249x && this.f23245d.m2073F() > 0) {
                        this.f23248w = true;
                        this.f23246e.execute(new C9900a());
                        return;
                    }
                    return;
                }
            } finally {
                C11267c.m11252h("AsyncSink.write");
            }
        }
        throw new IOException(MetricTracker.Action.CLOSED);
    }

    @Override // p576m.InterfaceC14364r
    public C14366t timeout() {
        return C14366t.f31663d;
    }
}
