package kotlinx.coroutines.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.C13288p;
import kotlin.C13291q;
import kotlin.C13666w;
import kotlin.p474a0.C11703b;
import kotlin.p483e0.C11754a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p557z.C13715n;
import kotlinx.coroutines.InterfaceC13814f0;
/* compiled from: ExceptionsConstuctor.kt */
/* renamed from: kotlinx.coroutines.internal.h */
/* loaded from: classes3.dex */
public final class C13884h {

    /* renamed from: a */
    private static final int f30363a = m3509d(Throwable.class, -1);

    /* renamed from: b */
    private static final ReentrantReadWriteLock f30364b = new ReentrantReadWriteLock();

    /* renamed from: c */
    private static final WeakHashMap<Class<? extends Throwable>, InterfaceC11767l<Throwable, Throwable>> f30365c = new WeakHashMap<>();

    /* compiled from: ExceptionsConstuctor.kt */
    /* renamed from: kotlinx.coroutines.internal.h$a */
    /* loaded from: classes3.dex */
    public static final class C13885a extends AbstractC11802m implements InterfaceC11767l<Throwable, Throwable> {

        /* renamed from: c */
        final /* synthetic */ Constructor f30366c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13885a(Constructor constructor) {
            super(1);
            this.f30366c = constructor;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final Throwable invoke(Throwable th) {
            Object m5358a;
            Object newInstance;
            try {
                C13288p.C13289a c13289a = C13288p.f29444c;
                newInstance = this.f30366c.newInstance(th.getMessage(), th);
            } catch (Throwable th2) {
                C13288p.C13289a c13289a2 = C13288p.f29444c;
                m5358a = C13291q.m5358a(th2);
                C13288p.m5362a(m5358a);
            }
            if (newInstance != null) {
                m5358a = (Throwable) newInstance;
                C13288p.m5362a(m5358a);
                if (C13288p.m5360c(m5358a)) {
                    m5358a = null;
                }
                return (Throwable) m5358a;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    /* compiled from: ExceptionsConstuctor.kt */
    /* renamed from: kotlinx.coroutines.internal.h$b */
    /* loaded from: classes3.dex */
    public static final class C13886b extends AbstractC11802m implements InterfaceC11767l<Throwable, Throwable> {

        /* renamed from: c */
        final /* synthetic */ Constructor f30367c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13886b(Constructor constructor) {
            super(1);
            this.f30367c = constructor;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final Throwable invoke(Throwable th) {
            Object m5358a;
            Object newInstance;
            try {
                C13288p.C13289a c13289a = C13288p.f29444c;
                newInstance = this.f30367c.newInstance(th);
            } catch (Throwable th2) {
                C13288p.C13289a c13289a2 = C13288p.f29444c;
                m5358a = C13291q.m5358a(th2);
                C13288p.m5362a(m5358a);
            }
            if (newInstance != null) {
                m5358a = (Throwable) newInstance;
                C13288p.m5362a(m5358a);
                if (C13288p.m5360c(m5358a)) {
                    m5358a = null;
                }
                return (Throwable) m5358a;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    /* compiled from: ExceptionsConstuctor.kt */
    /* renamed from: kotlinx.coroutines.internal.h$c */
    /* loaded from: classes3.dex */
    public static final class C13887c extends AbstractC11802m implements InterfaceC11767l<Throwable, Throwable> {

        /* renamed from: c */
        final /* synthetic */ Constructor f30368c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13887c(Constructor constructor) {
            super(1);
            this.f30368c = constructor;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final Throwable invoke(Throwable th) {
            Throwable th2;
            Object newInstance;
            try {
                C13288p.C13289a c13289a = C13288p.f29444c;
                newInstance = this.f30368c.newInstance(th.getMessage());
            } catch (Throwable th3) {
                C13288p.C13289a c13289a2 = C13288p.f29444c;
                Object m5358a = C13291q.m5358a(th3);
                C13288p.m5362a(m5358a);
                th2 = m5358a;
            }
            if (newInstance != null) {
                Throwable th4 = (Throwable) newInstance;
                th4.initCause(th);
                C13288p.m5362a(th4);
                th2 = th4;
                boolean m5360c = C13288p.m5360c(th2);
                Object obj = th2;
                if (m5360c) {
                    obj = null;
                }
                return (Throwable) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    /* compiled from: ExceptionsConstuctor.kt */
    /* renamed from: kotlinx.coroutines.internal.h$d */
    /* loaded from: classes3.dex */
    public static final class C13888d extends AbstractC11802m implements InterfaceC11767l<Throwable, Throwable> {

        /* renamed from: c */
        final /* synthetic */ Constructor f30369c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13888d(Constructor constructor) {
            super(1);
            this.f30369c = constructor;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final Throwable invoke(Throwable th) {
            Throwable th2;
            Object newInstance;
            try {
                C13288p.C13289a c13289a = C13288p.f29444c;
                newInstance = this.f30369c.newInstance(new Object[0]);
            } catch (Throwable th3) {
                C13288p.C13289a c13289a2 = C13288p.f29444c;
                Object m5358a = C13291q.m5358a(th3);
                C13288p.m5362a(m5358a);
                th2 = m5358a;
            }
            if (newInstance != null) {
                Throwable th4 = (Throwable) newInstance;
                th4.initCause(th);
                C13288p.m5362a(th4);
                th2 = th4;
                boolean m5360c = C13288p.m5360c(th2);
                Object obj = th2;
                if (m5360c) {
                    obj = null;
                }
                return (Throwable) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    /* compiled from: Comparisons.kt */
    /* renamed from: kotlinx.coroutines.internal.h$e */
    /* loaded from: classes3.dex */
    public static final class C13889e<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int m10416a;
            m10416a = C11703b.m10416a(Integer.valueOf(((Constructor) t2).getParameterTypes().length), Integer.valueOf(((Constructor) t).getParameterTypes().length));
            return m10416a;
        }
    }

    /* compiled from: ExceptionsConstuctor.kt */
    /* renamed from: kotlinx.coroutines.internal.h$f */
    /* loaded from: classes3.dex */
    static final class C13890f extends AbstractC11802m implements InterfaceC11767l {

        /* renamed from: c */
        public static final C13890f f30370c = new C13890f();

        C13890f() {
            super(1);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final Void invoke(Throwable th) {
            return null;
        }
    }

    /* compiled from: ExceptionsConstuctor.kt */
    /* renamed from: kotlinx.coroutines.internal.h$g */
    /* loaded from: classes3.dex */
    static final class C13891g extends AbstractC11802m implements InterfaceC11767l {

        /* renamed from: c */
        public static final C13891g f30371c = new C13891g();

        C13891g() {
            super(1);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final Void invoke(Throwable th) {
            return null;
        }
    }

    /* renamed from: a */
    private static final InterfaceC11767l<Throwable, Throwable> m3512a(Constructor<?> constructor) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        int length = parameterTypes.length;
        if (length != 0) {
            if (length != 1) {
                if (length == 2 && kotlin.e0.d.l.b(parameterTypes[0], String.class) && kotlin.e0.d.l.b(parameterTypes[1], Throwable.class)) {
                    return new C13885a(constructor);
                }
                return null;
            }
            Class<?> cls = parameterTypes[0];
            if (kotlin.e0.d.l.b(cls, Throwable.class)) {
                return new C13886b(constructor);
            }
            if (kotlin.e0.d.l.b(cls, String.class)) {
                return new C13887c(constructor);
            }
            return null;
        }
        return new C13888d(constructor);
    }

    /* renamed from: b */
    private static final int m3511b(Class<?> cls, int i) {
        do {
            int i2 = 0;
            for (Field field : cls.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    i2++;
                }
            }
            i += i2;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i;
    }

    /* renamed from: c */
    static /* synthetic */ int m3510c(Class cls, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return m3511b(cls, i);
    }

    /* renamed from: d */
    private static final int m3509d(Class<?> cls, int i) {
        Integer m5358a;
        C11754a.m10361e(cls);
        try {
            C13288p.C13289a c13289a = C13288p.f29444c;
            m5358a = Integer.valueOf(m3510c(cls, 0, 1, null));
            C13288p.m5362a(m5358a);
        } catch (Throwable th) {
            C13288p.C13289a c13289a2 = C13288p.f29444c;
            m5358a = C13291q.m5358a(th);
            C13288p.m5362a(m5358a);
        }
        Integer valueOf = Integer.valueOf(i);
        if (C13288p.m5360c(m5358a)) {
            m5358a = valueOf;
        }
        return ((Number) m5358a).intValue();
    }

    /* renamed from: e */
    public static final <E extends Throwable> E m3508e(E e) {
        Object m5358a;
        List m4034Q;
        ReentrantReadWriteLock.ReadLock readLock;
        int readHoldCount;
        ReentrantReadWriteLock.WriteLock writeLock;
        if (e instanceof InterfaceC13814f0) {
            try {
                C13288p.C13289a c13289a = C13288p.f29444c;
                m5358a = ((InterfaceC13814f0) e).mo3616a();
                C13288p.m5362a(m5358a);
            } catch (Throwable th) {
                C13288p.C13289a c13289a2 = C13288p.f29444c;
                m5358a = C13291q.m5358a(th);
                C13288p.m5362a(m5358a);
            }
            return (E) (C13288p.m5360c(m5358a) ? null : m5358a);
        }
        ReentrantReadWriteLock.ReadLock readLock2 = f30364b.readLock();
        readLock2.lock();
        try {
            InterfaceC11767l<Throwable, Throwable> interfaceC11767l = f30365c.get(e.getClass());
            if (interfaceC11767l == null) {
                int i = 0;
                if (f30363a != m3509d(e.getClass(), 0)) {
                    ReentrantReadWriteLock reentrantReadWriteLock = f30364b;
                    readLock = reentrantReadWriteLock.readLock();
                    readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                    for (int i2 = 0; i2 < readHoldCount; i2++) {
                        readLock.unlock();
                    }
                    writeLock = reentrantReadWriteLock.writeLock();
                    writeLock.lock();
                    try {
                        f30365c.put(e.getClass(), C13890f.f30370c);
                        C13666w c13666w = C13666w.f30112a;
                        return null;
                    } finally {
                        while (i < readHoldCount) {
                            readLock.lock();
                            i++;
                        }
                        writeLock.unlock();
                    }
                }
                m4034Q = C13715n.m4034Q(e.getClass().getConstructors(), new C13889e());
                Iterator it = m4034Q.iterator();
                InterfaceC11767l<Throwable, Throwable> interfaceC11767l2 = null;
                while (it.hasNext() && (interfaceC11767l2 = m3512a((Constructor) it.next())) == null) {
                }
                ReentrantReadWriteLock reentrantReadWriteLock2 = f30364b;
                readLock = reentrantReadWriteLock2.readLock();
                readHoldCount = reentrantReadWriteLock2.getWriteHoldCount() == 0 ? reentrantReadWriteLock2.getReadHoldCount() : 0;
                for (int i3 = 0; i3 < readHoldCount; i3++) {
                    readLock.unlock();
                }
                writeLock = reentrantReadWriteLock2.writeLock();
                writeLock.lock();
                try {
                    f30365c.put(e.getClass(), interfaceC11767l2 == null ? C13891g.f30371c : interfaceC11767l2);
                    C13666w c13666w2 = C13666w.f30112a;
                    while (i < readHoldCount) {
                        readLock.lock();
                        i++;
                    }
                    writeLock.unlock();
                    if (interfaceC11767l2 == null) {
                        return null;
                    }
                    return (E) interfaceC11767l2.invoke(e);
                } finally {
                    while (i < readHoldCount) {
                        readLock.lock();
                        i++;
                    }
                    writeLock.unlock();
                }
            }
            return (E) interfaceC11767l.invoke(e);
        } finally {
            readLock2.unlock();
        }
    }
}
