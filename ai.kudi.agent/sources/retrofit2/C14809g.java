package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import retrofit2.InterfaceC14802c;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ExecutorCallAdapterFactory.java */
/* renamed from: retrofit2.g */
/* loaded from: classes3.dex */
public final class C14809g extends InterfaceC14802c.AbstractC14803a {

    /* renamed from: a */
    final Executor f33082a;

    /* compiled from: ExecutorCallAdapterFactory.java */
    /* renamed from: retrofit2.g$a */
    /* loaded from: classes3.dex */
    class C14810a implements InterfaceC14802c<Object, InterfaceC14801b<?>> {

        /* renamed from: a */
        final /* synthetic */ Type f33083a;

        C14810a(Type type) {
            this.f33083a = type;
        }

        @Override // retrofit2.InterfaceC14802c
        /* renamed from: b */
        public InterfaceC14801b<Object> mo324a(InterfaceC14801b<Object> interfaceC14801b) {
            return new C14811b(C14809g.this.f33082a, interfaceC14801b);
        }

        @Override // retrofit2.InterfaceC14802c
        public Type responseType() {
            return this.f33083a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExecutorCallAdapterFactory.java */
    /* renamed from: retrofit2.g$b */
    /* loaded from: classes3.dex */
    public static final class C14811b<T> implements InterfaceC14801b<T> {

        /* renamed from: c */
        final Executor f33085c;

        /* renamed from: d */
        final InterfaceC14801b<T> f33086d;

        /* compiled from: ExecutorCallAdapterFactory.java */
        /* renamed from: retrofit2.g$b$a */
        /* loaded from: classes3.dex */
        class C14812a implements InterfaceC14804d<T> {

            /* renamed from: c */
            final /* synthetic */ InterfaceC14804d f33087c;

            /* compiled from: ExecutorCallAdapterFactory.java */
            /* renamed from: retrofit2.g$b$a$a */
            /* loaded from: classes3.dex */
            class RunnableC14813a implements Runnable {

                /* renamed from: c */
                final /* synthetic */ C14840l f33089c;

                RunnableC14813a(C14840l c14840l) {
                    this.f33089c = c14840l;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (C14811b.this.f33086d.isCanceled()) {
                        C14812a c14812a = C14812a.this;
                        c14812a.f33087c.mo322a(C14811b.this, new IOException("Canceled"));
                        return;
                    }
                    C14812a c14812a2 = C14812a.this;
                    c14812a2.f33087c.mo321b(C14811b.this, this.f33089c);
                }
            }

            /* compiled from: ExecutorCallAdapterFactory.java */
            /* renamed from: retrofit2.g$b$a$b */
            /* loaded from: classes3.dex */
            class RunnableC14814b implements Runnable {

                /* renamed from: c */
                final /* synthetic */ Throwable f33091c;

                RunnableC14814b(Throwable th) {
                    this.f33091c = th;
                }

                @Override // java.lang.Runnable
                public void run() {
                    C14812a c14812a = C14812a.this;
                    c14812a.f33087c.mo322a(C14811b.this, this.f33091c);
                }
            }

            C14812a(InterfaceC14804d interfaceC14804d) {
                this.f33087c = interfaceC14804d;
            }

            @Override // retrofit2.InterfaceC14804d
            /* renamed from: a */
            public void mo322a(InterfaceC14801b<T> interfaceC14801b, Throwable th) {
                C14811b.this.f33085c.execute(new RunnableC14814b(th));
            }

            @Override // retrofit2.InterfaceC14804d
            /* renamed from: b */
            public void mo321b(InterfaceC14801b<T> interfaceC14801b, C14840l<T> c14840l) {
                C14811b.this.f33085c.execute(new RunnableC14813a(c14840l));
            }
        }

        C14811b(Executor executor, InterfaceC14801b<T> interfaceC14801b) {
            this.f33085c = executor;
            this.f33086d = interfaceC14801b;
        }

        @Override // retrofit2.InterfaceC14801b
        public void cancel() {
            this.f33086d.cancel();
        }

        @Override // retrofit2.InterfaceC14801b
        public C14840l<T> execute() throws IOException {
            return this.f33086d.execute();
        }

        @Override // retrofit2.InterfaceC14801b
        /* renamed from: g0 */
        public void mo317g0(InterfaceC14804d<T> interfaceC14804d) {
            C14846o.m239b(interfaceC14804d, "callback == null");
            this.f33086d.mo317g0(new C14812a(interfaceC14804d));
        }

        @Override // retrofit2.InterfaceC14801b
        public boolean isCanceled() {
            return this.f33086d.isCanceled();
        }

        @Override // retrofit2.InterfaceC14801b
        public InterfaceC14801b<T> clone() {
            return new C14811b(this.f33085c, this.f33086d.mo41960clone());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C14809g(Executor executor) {
        this.f33082a = executor;
    }

    @Override // retrofit2.InterfaceC14802c.AbstractC14803a
    /* renamed from: a */
    public InterfaceC14802c<?, ?> mo325a(Type type, Annotation[] annotationArr, C14841m c14841m) {
        if (InterfaceC14802c.AbstractC14803a.m328c(type) != InterfaceC14801b.class) {
            return null;
        }
        return new C14810a(C14846o.m235f(type));
    }
}
