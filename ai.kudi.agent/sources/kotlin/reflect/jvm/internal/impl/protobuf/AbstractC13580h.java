package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13563a;
import kotlin.reflect.jvm.internal.impl.protobuf.C13577g;
import kotlin.reflect.jvm.internal.impl.protobuf.C13588i;
import kotlin.reflect.jvm.internal.impl.protobuf.C13624w;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o;
/* compiled from: GeneratedMessageLite.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.h */
/* loaded from: classes3.dex */
public abstract class AbstractC13580h extends AbstractC13563a implements Serializable {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.h$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C13581a {

        /* renamed from: a */
        static final /* synthetic */ int[] f29957a;

        static {
            int[] iArr = new int[C13624w.EnumC13631c.values().length];
            f29957a = iArr;
            try {
                iArr[C13624w.EnumC13631c.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29957a[C13624w.EnumC13631c.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.h$b */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC13582b<MessageType extends AbstractC13580h, BuilderType extends AbstractC13582b> extends AbstractC13563a.AbstractC13564a<BuilderType> {

        /* renamed from: c */
        private AbstractC13570d f29958c = AbstractC13570d.f29926c;

        @Override // 
        /* renamed from: j */
        public BuilderType clone() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
        /* renamed from: k */
        public abstract MessageType mo4380a();

        /* renamed from: l */
        public final AbstractC13570d m4441l() {
            return this.f29958c;
        }

        /* renamed from: n */
        public abstract BuilderType mo4440n(MessageType messagetype);

        /* renamed from: o */
        public final BuilderType m4439o(AbstractC13570d abstractC13570d) {
            this.f29958c = abstractC13570d;
            return this;
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.h$c */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC13583c<MessageType extends AbstractC13584d<MessageType>, BuilderType extends AbstractC13583c<MessageType, BuilderType>> extends AbstractC13582b<MessageType, BuilderType> implements Object<MessageType> {

        /* renamed from: d */
        private C13577g<C13586e> f29959d = C13577g.m4469g();

        /* renamed from: e */
        private boolean f29960e;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: q */
        public C13577g<C13586e> m4437q() {
            this.f29959d.m4459q();
            this.f29960e = false;
            return this.f29959d;
        }

        /* renamed from: r */
        private void m4436r() {
            if (this.f29960e) {
                return;
            }
            this.f29959d = this.f29959d.clone();
            this.f29960e = true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: s */
        public boolean m4435s() {
            return this.f29959d.m4462n();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: t */
        public final void m4434t(MessageType messagetype) {
            m4436r();
            this.f29959d.m4458r(((AbstractC13584d) messagetype).f29961c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.h$e */
    /* loaded from: classes3.dex */
    public static final class C13586e implements C13577g.InterfaceC13579b<C13586e> {

        /* renamed from: c */
        final C13588i.InterfaceC13590b<?> f29966c;

        /* renamed from: d */
        final int f29967d;

        /* renamed from: e */
        final C13624w.EnumC13626b f29968e;

        /* renamed from: f */
        final boolean f29969f;

        /* renamed from: w */
        final boolean f29970w;

        C13586e(C13588i.InterfaceC13590b<?> interfaceC13590b, int i, C13624w.EnumC13626b enumC13626b, boolean z, boolean z2) {
            this.f29966c = interfaceC13590b;
            this.f29967d = i;
            this.f29968e = enumC13626b;
            this.f29969f = z;
            this.f29970w = z2;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C13586e c13586e) {
            return this.f29967d - c13586e.f29967d;
        }

        /* renamed from: b */
        public C13588i.InterfaceC13590b<?> m4420b() {
            return this.f29966c;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C13577g.InterfaceC13579b
        /* renamed from: d */
        public int mo4419d() {
            return this.f29967d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C13577g.InterfaceC13579b
        /* renamed from: f */
        public boolean mo4418f() {
            return this.f29969f;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C13577g.InterfaceC13579b
        /* renamed from: k */
        public C13624w.EnumC13626b mo4417k() {
            return this.f29968e;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C13577g.InterfaceC13579b
        /* renamed from: l */
        public C13624w.EnumC13631c mo4416l() {
            return this.f29968e.m4298a();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C13577g.InterfaceC13579b
        /* renamed from: s */
        public boolean mo4415s() {
            return this.f29970w;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C13577g.InterfaceC13579b
        /* renamed from: u */
        public InterfaceC13601o.InterfaceC13602a mo4414u(InterfaceC13601o.InterfaceC13602a interfaceC13602a, InterfaceC13601o interfaceC13601o) {
            return ((AbstractC13582b) interfaceC13602a).mo4440n((AbstractC13580h) interfaceC13601o);
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.h$f */
    /* loaded from: classes3.dex */
    public static class C13587f<ContainingType extends InterfaceC13601o, Type> {

        /* renamed from: a */
        final ContainingType f29971a;

        /* renamed from: b */
        final Type f29972b;

        /* renamed from: c */
        final InterfaceC13601o f29973c;

        /* renamed from: d */
        final C13586e f29974d;

        /* renamed from: e */
        final Method f29975e;

        C13587f(ContainingType containingtype, Type type, InterfaceC13601o interfaceC13601o, C13586e c13586e, Class cls) {
            if (containingtype != null) {
                if (c13586e.mo4417k() == C13624w.EnumC13626b.f30036E && interfaceC13601o == null) {
                    throw new IllegalArgumentException("Null messageDefaultInstance");
                }
                this.f29971a = containingtype;
                this.f29972b = type;
                this.f29973c = interfaceC13601o;
                this.f29974d = c13586e;
                if (C13588i.InterfaceC13589a.class.isAssignableFrom(cls)) {
                    this.f29975e = AbstractC13580h.m4448k(cls, "valueOf", Integer.TYPE);
                    return;
                } else {
                    this.f29975e = null;
                    return;
                }
            }
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }

        /* renamed from: a */
        Object m4413a(Object obj) {
            if (this.f29974d.mo4418f()) {
                if (this.f29974d.mo4416l() == C13624w.EnumC13631c.ENUM) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : (List) obj) {
                        arrayList.add(m4409e(obj2));
                    }
                    return arrayList;
                }
                return obj;
            }
            return m4409e(obj);
        }

        /* renamed from: b */
        public ContainingType m4412b() {
            return this.f29971a;
        }

        /* renamed from: c */
        public InterfaceC13601o m4411c() {
            return this.f29973c;
        }

        /* renamed from: d */
        public int m4410d() {
            return this.f29974d.mo4419d();
        }

        /* renamed from: e */
        Object m4409e(Object obj) {
            return this.f29974d.mo4416l() == C13624w.EnumC13631c.ENUM ? AbstractC13580h.m4447l(this.f29975e, null, (Integer) obj) : obj;
        }

        /* renamed from: f */
        Object m4408f(Object obj) {
            return this.f29974d.mo4416l() == C13624w.EnumC13631c.ENUM ? Integer.valueOf(((C13588i.InterfaceC13589a) obj).mo4405d()) : obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC13580h() {
    }

    /* renamed from: k */
    static Method m4448k(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            String valueOf = String.valueOf(String.valueOf(cls.getName()));
            String valueOf2 = String.valueOf(String.valueOf(str));
            StringBuilder sb = new StringBuilder(valueOf.length() + 45 + valueOf2.length());
            sb.append("Generated message class \"");
            sb.append(valueOf);
            sb.append("\" missing method \"");
            sb.append(valueOf2);
            sb.append("\".");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* renamed from: l */
    static Object m4447l(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    /* renamed from: n */
    public static <ContainingType extends InterfaceC13601o, Type> C13587f<ContainingType, Type> m4446n(ContainingType containingtype, InterfaceC13601o interfaceC13601o, C13588i.InterfaceC13590b<?> interfaceC13590b, int i, C13624w.EnumC13626b enumC13626b, boolean z, Class cls) {
        return new C13587f<>(containingtype, Collections.emptyList(), interfaceC13601o, new C13586e(interfaceC13590b, i, enumC13626b, true, z), cls);
    }

    /* renamed from: o */
    public static <ContainingType extends InterfaceC13601o, Type> C13587f<ContainingType, Type> m4445o(ContainingType containingtype, Type type, InterfaceC13601o interfaceC13601o, C13588i.InterfaceC13590b<?> interfaceC13590b, int i, C13624w.EnumC13626b enumC13626b, Class cls) {
        return new C13587f<>(containingtype, type, interfaceC13601o, new C13586e(interfaceC13590b, i, enumC13626b, false, false), cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <MessageType extends kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o> boolean m4444q(kotlin.reflect.jvm.internal.impl.protobuf.C13577g<kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.C13586e> r5, MessageType r6, kotlin.reflect.jvm.internal.impl.protobuf.C13573e r7, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r8, kotlin.reflect.jvm.internal.impl.protobuf.C13575f r9, int r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.m4444q(kotlin.reflect.jvm.internal.impl.protobuf.g, kotlin.reflect.jvm.internal.impl.protobuf.o, kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream, kotlin.reflect.jvm.internal.impl.protobuf.f, int):boolean");
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: g */
    public InterfaceC13604q<? extends InterfaceC13601o> mo4382g() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public void mo4433m() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public boolean mo4432p(C13573e c13573e, CodedOutputStream codedOutputStream, C13575f c13575f, int i) throws IOException {
        return c13573e.m4511P(i, codedOutputStream);
    }

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.h$d */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC13584d<MessageType extends AbstractC13584d<MessageType>> extends AbstractC13580h implements Object<MessageType> {

        /* renamed from: c */
        private final C13577g<C13586e> f29961c;

        /* JADX INFO: Access modifiers changed from: protected */
        /* compiled from: GeneratedMessageLite.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.h$d$a */
        /* loaded from: classes3.dex */
        public class C13585a {

            /* renamed from: a */
            private final Iterator<Map.Entry<C13586e, Object>> f29962a;

            /* renamed from: b */
            private Map.Entry<C13586e, Object> f29963b;

            /* renamed from: c */
            private final boolean f29964c;

            /* synthetic */ C13585a(AbstractC13584d abstractC13584d, boolean z, C13581a c13581a) {
                this(z);
            }

            /* renamed from: a */
            public void m4422a(int i, CodedOutputStream codedOutputStream) throws IOException {
                while (true) {
                    Map.Entry<C13586e, Object> entry = this.f29963b;
                    if (entry == null || entry.getKey().mo4419d() >= i) {
                        return;
                    }
                    C13586e key = this.f29963b.getKey();
                    if (this.f29964c && key.mo4416l() == C13624w.EnumC13631c.MESSAGE && !key.mo4418f()) {
                        codedOutputStream.m4608f0(key.mo4419d(), (InterfaceC13601o) this.f29963b.getValue());
                    } else {
                        C13577g.m4450z(key, this.f29963b.getValue(), codedOutputStream);
                    }
                    if (this.f29962a.hasNext()) {
                        this.f29963b = this.f29962a.next();
                    } else {
                        this.f29963b = null;
                    }
                }
            }

            private C13585a(boolean z) {
                Iterator<Map.Entry<C13586e, Object>> m4460p = AbstractC13584d.this.f29961c.m4460p();
                this.f29962a = m4460p;
                if (m4460p.hasNext()) {
                    this.f29963b = this.f29962a.next();
                }
                this.f29964c = z;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public AbstractC13584d() {
            this.f29961c = C13577g.m4456t();
        }

        /* renamed from: z */
        private void m4423z(C13587f<MessageType, ?> c13587f) {
            if (c13587f.m4412b() != mo4380a()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h
        /* renamed from: m */
        public void mo4433m() {
            this.f29961c.m4459q();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h
        /* renamed from: p */
        public boolean mo4432p(C13573e c13573e, CodedOutputStream codedOutputStream, C13575f c13575f, int i) throws IOException {
            return AbstractC13580h.m4444q(this.f29961c, mo4380a(), c13573e, codedOutputStream, c13575f, i);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: s */
        public boolean m4430s() {
            return this.f29961c.m4462n();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: t */
        public int m4429t() {
            return this.f29961c.m4465k();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: u */
        public final <Type> Type m4428u(C13587f<MessageType, Type> c13587f) {
            m4423z(c13587f);
            Object m4468h = this.f29961c.m4468h(c13587f.f29974d);
            if (m4468h == null) {
                return c13587f.f29972b;
            }
            return (Type) c13587f.m4413a(m4468h);
        }

        /* renamed from: v */
        public final <Type> Type m4427v(C13587f<MessageType, List<Type>> c13587f, int i) {
            m4423z(c13587f);
            return (Type) c13587f.m4409e(this.f29961c.m4467i(c13587f.f29974d, i));
        }

        /* renamed from: w */
        public final <Type> int m4426w(C13587f<MessageType, List<Type>> c13587f) {
            m4423z(c13587f);
            return this.f29961c.m4466j(c13587f.f29974d);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: x */
        public final <Type> boolean m4425x(C13587f<MessageType, Type> c13587f) {
            m4423z(c13587f);
            return this.f29961c.m4463m(c13587f.f29974d);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: y */
        public AbstractC13584d<MessageType>.C13585a m4424y() {
            return new C13585a(this, false, null);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public AbstractC13584d(AbstractC13583c<MessageType, ?> abstractC13583c) {
            this.f29961c = abstractC13583c.m4437q();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC13580h(AbstractC13582b abstractC13582b) {
    }
}
