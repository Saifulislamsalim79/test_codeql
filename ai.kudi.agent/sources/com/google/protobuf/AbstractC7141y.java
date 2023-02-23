package com.google.protobuf;

import com.google.protobuf.AbstractC6994a;
import com.google.protobuf.AbstractC7141y;
import com.google.protobuf.AbstractC7141y.AbstractC7142a;
import com.google.protobuf.C6997a0;
import com.google.protobuf.C7020e;
import com.google.protobuf.C7118t1;
import com.google.protobuf.C7126u;
import com.google.protobuf.InterfaceC7100r0;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: GeneratedMessageLite.java */
/* renamed from: com.google.protobuf.y */
/* loaded from: classes2.dex */
public abstract class AbstractC7141y<MessageType extends AbstractC7141y<MessageType, BuilderType>, BuilderType extends AbstractC7142a<MessageType, BuilderType>> extends AbstractC6994a<MessageType, BuilderType> {
    private static Map<Object, AbstractC7141y<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected C7088o1 unknownFields = C7088o1.m19785c();
    protected int memoizedSerializedSize = -1;

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: com.google.protobuf.y$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC7142a<MessageType extends AbstractC7141y<MessageType, BuilderType>, BuilderType extends AbstractC7142a<MessageType, BuilderType>> extends AbstractC6994a.AbstractC6995a<MessageType, BuilderType> {

        /* renamed from: c */
        private final MessageType f17081c;

        /* renamed from: d */
        protected MessageType f17082d;

        /* renamed from: e */
        protected boolean f17083e = false;

        /* JADX INFO: Access modifiers changed from: protected */
        public AbstractC7142a(MessageType messagetype) {
            this.f17081c = messagetype;
            this.f17082d = (MessageType) messagetype.m19370z(EnumC7147f.NEW_MUTABLE_INSTANCE);
        }

        /* renamed from: E */
        private void m19364E(MessageType messagetype, MessageType messagetype2) {
            C7019d1.m20212a().m20208e(messagetype).mo19425a(messagetype, messagetype2);
        }

        /* renamed from: A */
        protected void m19369A() {
            MessageType messagetype = (MessageType) this.f17082d.m19370z(EnumC7147f.NEW_MUTABLE_INSTANCE);
            m19364E(messagetype, this.f17082d);
            this.f17082d = messagetype;
        }

        @Override // com.google.protobuf.InterfaceC7109s0
        /* renamed from: B */
        public MessageType mo19354a() {
            return this.f17081c;
        }

        /* renamed from: C */
        protected BuilderType m19367C(MessageType messagetype) {
            m19365D(messagetype);
            return this;
        }

        /* renamed from: D */
        public BuilderType m19365D(MessageType messagetype) {
            m19358z();
            m19364E(this.f17082d, messagetype);
            return this;
        }

        @Override // com.google.protobuf.InterfaceC7109s0
        /* renamed from: h */
        public final boolean mo19363h() {
            return AbstractC7141y.m19388H(this.f17082d, false);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.AbstractC6994a.AbstractC6995a
        /* renamed from: t */
        protected /* bridge */ /* synthetic */ AbstractC6994a.AbstractC6995a mo19362t(AbstractC6994a abstractC6994a) {
            m19367C((AbstractC7141y) abstractC6994a);
            return this;
        }

        @Override // com.google.protobuf.InterfaceC7100r0.InterfaceC7101a
        /* renamed from: w */
        public final MessageType build() {
            MessageType mo19366C0 = mo19366C0();
            if (mo19366C0.mo19363h()) {
                return mo19366C0;
            }
            throw AbstractC6994a.AbstractC6995a.m20236v(mo19366C0);
        }

        @Override // com.google.protobuf.InterfaceC7100r0.InterfaceC7101a
        /* renamed from: x */
        public MessageType mo19366C0() {
            if (this.f17083e) {
                return this.f17082d;
            }
            this.f17082d.m19387I();
            this.f17083e = true;
            return this.f17082d;
        }

        /* renamed from: y */
        public BuilderType clone() {
            BuilderType buildertype = (BuilderType) mo19354a().mo19352f();
            buildertype.m19365D(mo19366C0());
            return buildertype;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: z */
        public final void m19358z() {
            if (this.f17083e) {
                m19369A();
                this.f17083e = false;
            }
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: com.google.protobuf.y$b */
    /* loaded from: classes2.dex */
    protected static class C7143b<T extends AbstractC7141y<T, ?>> extends AbstractC7008b<T> {

        /* renamed from: a */
        private final T f17084a;

        public C7143b(T t) {
            this.f17084a = t;
        }

        @Override // com.google.protobuf.InterfaceC7007a1
        /* renamed from: a */
        public T parsePartialFrom(AbstractC7052j abstractC7052j, C7089p c7089p) throws InvalidProtocolBufferException {
            return (T) AbstractC7141y.m19382N(this.f17084a, abstractC7052j, c7089p);
        }

        @Override // com.google.protobuf.AbstractC7008b
        /* renamed from: b */
        public T mo41895parsePartialFrom(byte[] bArr, int i, int i2, C7089p c7089p) throws InvalidProtocolBufferException {
            return (T) AbstractC7141y.m19381O(this.f17084a, bArr, i, i2, c7089p);
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: com.google.protobuf.y$c */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC7144c<MessageType extends AbstractC7144c<MessageType, BuilderType>, BuilderType extends Object<MessageType, BuilderType>> extends AbstractC7141y<MessageType, BuilderType> implements Object<MessageType, BuilderType> {
        protected C7126u<C7145d> extensions = C7126u.m19553g();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: R */
        public C7126u<C7145d> m19355R() {
            if (this.extensions.m19546n()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        @Override // com.google.protobuf.AbstractC7141y, com.google.protobuf.InterfaceC7109s0
        /* renamed from: a */
        public /* bridge */ /* synthetic */ InterfaceC7100r0 mo19354a() {
            return super.mo19354a();
        }

        @Override // com.google.protobuf.AbstractC7141y, com.google.protobuf.InterfaceC7100r0
        /* renamed from: b */
        public /* bridge */ /* synthetic */ InterfaceC7100r0.InterfaceC7101a mo19353b() {
            return super.mo19353b();
        }

        @Override // com.google.protobuf.AbstractC7141y, com.google.protobuf.InterfaceC7100r0
        /* renamed from: f */
        public /* bridge */ /* synthetic */ InterfaceC7100r0.InterfaceC7101a mo19352f() {
            return super.mo19352f();
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: com.google.protobuf.y$d */
    /* loaded from: classes2.dex */
    static final class C7145d implements C7126u.InterfaceC7128b<C7145d> {

        /* renamed from: c */
        final C6997a0.InterfaceC7001d<?> f17085c;

        /* renamed from: d */
        final int f17086d;

        /* renamed from: e */
        final C7118t1.EnumC7120b f17087e;

        /* renamed from: f */
        final boolean f17088f;

        /* renamed from: w */
        final boolean f17089w;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.C7126u.InterfaceC7128b
        /* renamed from: E */
        public InterfaceC7100r0.InterfaceC7101a mo19351E(InterfaceC7100r0.InterfaceC7101a interfaceC7101a, InterfaceC7100r0 interfaceC7100r0) {
            AbstractC7142a abstractC7142a = (AbstractC7142a) interfaceC7101a;
            abstractC7142a.m19365D((AbstractC7141y) interfaceC7100r0);
            return abstractC7142a;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C7145d c7145d) {
            return this.f17086d - c7145d.f17086d;
        }

        /* renamed from: b */
        public C6997a0.InterfaceC7001d<?> m19349b() {
            return this.f17085c;
        }

        @Override // com.google.protobuf.C7126u.InterfaceC7128b
        /* renamed from: d */
        public int mo19348d() {
            return this.f17086d;
        }

        @Override // com.google.protobuf.C7126u.InterfaceC7128b
        /* renamed from: f */
        public boolean mo19347f() {
            return this.f17088f;
        }

        @Override // com.google.protobuf.C7126u.InterfaceC7128b
        /* renamed from: k */
        public C7118t1.EnumC7120b mo19346k() {
            return this.f17087e;
        }

        @Override // com.google.protobuf.C7126u.InterfaceC7128b
        /* renamed from: l */
        public C7118t1.EnumC7125c mo19345l() {
            return this.f17087e.m19561a();
        }

        @Override // com.google.protobuf.C7126u.InterfaceC7128b
        /* renamed from: s */
        public boolean mo19344s() {
            return this.f17089w;
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: com.google.protobuf.y$e */
    /* loaded from: classes2.dex */
    public static class C7146e<ContainingType extends InterfaceC7100r0, Type> extends AbstractC7083n<ContainingType, Type> {

        /* renamed from: a */
        final InterfaceC7100r0 f17090a;

        /* renamed from: b */
        final C7145d f17091b;

        /* renamed from: a */
        public C7118t1.EnumC7120b m19343a() {
            return this.f17091b.mo19346k();
        }

        /* renamed from: b */
        public InterfaceC7100r0 m19342b() {
            return this.f17090a;
        }

        /* renamed from: c */
        public int m19341c() {
            return this.f17091b.mo19348d();
        }

        /* renamed from: d */
        public boolean m19340d() {
            return this.f17091b.f17088f;
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: com.google.protobuf.y$f */
    /* loaded from: classes2.dex */
    public enum EnumC7147f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: C */
    public static C6997a0.InterfaceC7004g m19393C() {
        return C7149z.m19329k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: D */
    public static <E> C6997a0.InterfaceC7006i<E> m19392D() {
        return C7024e1.m20161f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public static <T extends AbstractC7141y<?, ?>> T m19391E(Class<T> cls) {
        AbstractC7141y<?, ?> abstractC7141y = defaultInstanceMap.get(cls);
        if (abstractC7141y == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC7141y = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (abstractC7141y == null) {
            abstractC7141y = (T) ((AbstractC7141y) C7102r1.m19671l(cls)).mo19354a();
            if (abstractC7141y != null) {
                defaultInstanceMap.put(cls, abstractC7141y);
            } else {
                throw new IllegalStateException();
            }
        }
        return (T) abstractC7141y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public static Object m19389G(Method method, Object obj, Object... objArr) {
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

    /* renamed from: H */
    protected static final <T extends AbstractC7141y<T, ?>> boolean m19388H(T t, boolean z) {
        byte byteValue = ((Byte) t.m19370z(EnumC7147f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean mo19422d = C7019d1.m20212a().m20208e(t).mo19422d(t);
        if (z) {
            t.m19394A(EnumC7147f.SET_MEMOIZED_IS_INITIALIZED, mo19422d ? t : null);
        }
        return mo19422d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.a0$g] */
    /* renamed from: J */
    public static C6997a0.InterfaceC7004g m19386J(C6997a0.InterfaceC7004g interfaceC7004g) {
        int size = interfaceC7004g.size();
        return interfaceC7004g.mo19330j(size == 0 ? 10 : size * 2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: K */
    public static <E> C6997a0.InterfaceC7006i<E> m19385K(C6997a0.InterfaceC7006i<E> interfaceC7006i) {
        int size = interfaceC7006i.size();
        return interfaceC7006i.mo19330j(size == 0 ? 10 : size * 2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: M */
    public static Object m19383M(InterfaceC7100r0 interfaceC7100r0, String str, Object[] objArr) {
        return new C7029f1(interfaceC7100r0, str, objArr);
    }

    /* renamed from: N */
    static <T extends AbstractC7141y<T, ?>> T m19382N(T t, AbstractC7052j abstractC7052j, C7089p c7089p) throws InvalidProtocolBufferException {
        T t2 = (T) t.m19370z(EnumC7147f.NEW_MUTABLE_INSTANCE);
        try {
            InterfaceC7038h1 m20208e = C7019d1.m20212a().m20208e(t2);
            m20208e.mo19421e(t2, C7062k.m19906P(abstractC7052j), c7089p);
            m20208e.mo19423c(t2);
            return t2;
        } catch (InvalidProtocolBufferException e) {
            e = e;
            if (e.m20258a()) {
                e = new InvalidProtocolBufferException(e);
            }
            e.m20247l(t2);
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e2.getCause());
            }
            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2);
            invalidProtocolBufferException.m20247l(t2);
            throw invalidProtocolBufferException;
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            throw e3;
        }
    }

    /* renamed from: O */
    static <T extends AbstractC7141y<T, ?>> T m19381O(T t, byte[] bArr, int i, int i2, C7089p c7089p) throws InvalidProtocolBufferException {
        T t2 = (T) t.m19370z(EnumC7147f.NEW_MUTABLE_INSTANCE);
        try {
            InterfaceC7038h1 m20208e = C7019d1.m20212a().m20208e(t2);
            m20208e.mo19420f(t2, bArr, i, i + i2, new C7020e.C7022b(c7089p));
            m20208e.mo19423c(t2);
            if (t2.memoizedHashCode == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (InvalidProtocolBufferException e) {
            e = e;
            if (e.m20258a()) {
                e = new InvalidProtocolBufferException(e);
            }
            e.m20247l(t2);
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e2.getCause());
            }
            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2);
            invalidProtocolBufferException.m20247l(t2);
            throw invalidProtocolBufferException;
        } catch (IndexOutOfBoundsException unused) {
            InvalidProtocolBufferException m20245n = InvalidProtocolBufferException.m20245n();
            m20245n.m20247l(t2);
            throw m20245n;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: P */
    public static <T extends AbstractC7141y<?, ?>> void m19380P(Class<T> cls, T t) {
        defaultInstanceMap.put(cls, t);
    }

    /* renamed from: A */
    protected Object m19394A(EnumC7147f enumC7147f, Object obj) {
        return mo14874B(enumC7147f, obj, null);
    }

    /* renamed from: B */
    protected abstract Object mo14874B(EnumC7147f enumC7147f, Object obj, Object obj2);

    @Override // com.google.protobuf.InterfaceC7109s0
    /* renamed from: F */
    public final MessageType mo19354a() {
        return (MessageType) m19370z(EnumC7147f.GET_DEFAULT_INSTANCE);
    }

    /* renamed from: I */
    protected void m19387I() {
        C7019d1.m20212a().m20208e(this).mo19423c(this);
    }

    @Override // com.google.protobuf.InterfaceC7100r0
    /* renamed from: L */
    public final BuilderType mo19352f() {
        return (BuilderType) m19370z(EnumC7147f.NEW_BUILDER);
    }

    @Override // com.google.protobuf.InterfaceC7100r0
    /* renamed from: Q */
    public final BuilderType mo19353b() {
        BuilderType buildertype = (BuilderType) m19370z(EnumC7147f.NEW_BUILDER);
        buildertype.m19365D(this);
        return buildertype;
    }

    @Override // com.google.protobuf.InterfaceC7100r0
    /* renamed from: d */
    public int mo19378d() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = C7019d1.m20212a().m20208e(this).mo19418h(this);
        }
        return this.memoizedSerializedSize;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C7019d1.m20212a().m20208e(this).mo19419g(this, (AbstractC7141y) obj);
        }
        return false;
    }

    @Override // com.google.protobuf.InterfaceC7100r0
    /* renamed from: g */
    public final InterfaceC7007a1<MessageType> mo19377g() {
        return (InterfaceC7007a1) m19370z(EnumC7147f.GET_PARSER);
    }

    @Override // com.google.protobuf.InterfaceC7109s0
    /* renamed from: h */
    public final boolean mo19363h() {
        return m19388H(this, true);
    }

    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int mo19416j = C7019d1.m20212a().m20208e(this).mo19416j(this);
        this.memoizedHashCode = mo19416j;
        return mo19416j;
    }

    @Override // com.google.protobuf.InterfaceC7100r0
    /* renamed from: j */
    public void mo19376j(CodedOutputStream codedOutputStream) throws IOException {
        C7019d1.m20212a().m20208e(this).mo19424b(this, C7074l.m19841P(codedOutputStream));
    }

    @Override // com.google.protobuf.AbstractC6994a
    /* renamed from: r */
    int mo19375r() {
        return this.memoizedSerializedSize;
    }

    public String toString() {
        return C7117t0.m19565e(this, super.toString());
    }

    @Override // com.google.protobuf.AbstractC6994a
    /* renamed from: v */
    void mo19374v(int i) {
        this.memoizedSerializedSize = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public Object m19373w() throws Exception {
        return m19370z(EnumC7147f.BUILD_MESSAGE_INFO);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x */
    public final <MessageType extends AbstractC7141y<MessageType, BuilderType>, BuilderType extends AbstractC7142a<MessageType, BuilderType>> BuilderType m19372x() {
        return (BuilderType) m19370z(EnumC7147f.NEW_BUILDER);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: y */
    public final <MessageType extends AbstractC7141y<MessageType, BuilderType>, BuilderType extends AbstractC7142a<MessageType, BuilderType>> BuilderType m19371y(MessageType messagetype) {
        BuilderType m19372x = m19372x();
        m19372x.m19365D(messagetype);
        return m19372x;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: z */
    public Object m19370z(EnumC7147f enumC7147f) {
        return mo14874B(enumC7147f, null, null);
    }
}
