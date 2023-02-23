package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.C13577g.InterfaceC13579b;
import kotlin.reflect.jvm.internal.impl.protobuf.C13588i;
import kotlin.reflect.jvm.internal.impl.protobuf.C13591j;
import kotlin.reflect.jvm.internal.impl.protobuf.C13624w;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FieldSet.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.g */
/* loaded from: classes3.dex */
public final class C13577g<FieldDescriptorType extends InterfaceC13579b<FieldDescriptorType>> {

    /* renamed from: d */
    private static final C13577g f29951d = new C13577g(true);

    /* renamed from: b */
    private boolean f29953b;

    /* renamed from: c */
    private boolean f29954c = false;

    /* renamed from: a */
    private final C13612t<FieldDescriptorType, Object> f29952a = C13612t.m4333p(16);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FieldSet.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.g$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C13578a {

        /* renamed from: a */
        static final /* synthetic */ int[] f29955a;

        /* renamed from: b */
        static final /* synthetic */ int[] f29956b;

        static {
            int[] iArr = new int[C13624w.EnumC13626b.values().length];
            f29956b = iArr;
            try {
                iArr[C13624w.EnumC13626b.f30045e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29956b[C13624w.EnumC13626b.f30046f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29956b[C13624w.EnumC13626b.f30047w.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29956b[C13624w.EnumC13626b.f30048x.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29956b[C13624w.EnumC13626b.f30049y.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29956b[C13624w.EnumC13626b.f30050z.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f29956b[C13624w.EnumC13626b.f30032A.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f29956b[C13624w.EnumC13626b.f30033B.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f29956b[C13624w.EnumC13626b.f30034C.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f29956b[C13624w.EnumC13626b.f30037F.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f29956b[C13624w.EnumC13626b.f30038G.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f29956b[C13624w.EnumC13626b.f30040I.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f29956b[C13624w.EnumC13626b.f30041J.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f29956b[C13624w.EnumC13626b.f30042K.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f29956b[C13624w.EnumC13626b.f30043L.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f29956b[C13624w.EnumC13626b.f30035D.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f29956b[C13624w.EnumC13626b.f30036E.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f29956b[C13624w.EnumC13626b.f30039H.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[C13624w.EnumC13631c.values().length];
            f29955a = iArr2;
            try {
                iArr2[C13624w.EnumC13631c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f29955a[C13624w.EnumC13631c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f29955a[C13624w.EnumC13631c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f29955a[C13624w.EnumC13631c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f29955a[C13624w.EnumC13631c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f29955a[C13624w.EnumC13631c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f29955a[C13624w.EnumC13631c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f29955a[C13624w.EnumC13631c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f29955a[C13624w.EnumC13631c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* compiled from: FieldSet.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.g$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC13579b<T extends InterfaceC13579b<T>> extends Comparable<T> {
        /* renamed from: d */
        int mo4419d();

        /* renamed from: f */
        boolean mo4418f();

        /* renamed from: k */
        C13624w.EnumC13626b mo4417k();

        /* renamed from: l */
        C13624w.EnumC13631c mo4416l();

        /* renamed from: s */
        boolean mo4415s();

        /* renamed from: u */
        InterfaceC13601o.InterfaceC13602a mo4414u(InterfaceC13601o.InterfaceC13602a interfaceC13602a, InterfaceC13601o interfaceC13601o);
    }

    private C13577g() {
    }

    /* renamed from: c */
    private Object m4473c(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return obj;
    }

    /* renamed from: d */
    private static int m4472d(C13624w.EnumC13626b enumC13626b, int i, Object obj) {
        int m4642D = CodedOutputStream.m4642D(i);
        if (enumC13626b == C13624w.EnumC13626b.f30035D) {
            m4642D *= 2;
        }
        return m4642D + m4471e(enumC13626b, obj);
    }

    /* renamed from: e */
    private static int m4471e(C13624w.EnumC13626b enumC13626b, Object obj) {
        switch (C13578a.f29956b[enumC13626b.ordinal()]) {
            case 1:
                return CodedOutputStream.m4607g(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.m4595m(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.m4587q(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.m4640F(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.m4589p(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.m4599k(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.m4601j(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.m4617b(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.m4643C((String) obj);
            case 10:
                if (obj instanceof AbstractC13570d) {
                    return CodedOutputStream.m4611e((AbstractC13570d) obj);
                }
                return CodedOutputStream.m4615c((byte[]) obj);
            case 11:
                return CodedOutputStream.m4641E(((Integer) obj).intValue());
            case 12:
                return CodedOutputStream.m4573x(((Integer) obj).intValue());
            case 13:
                return CodedOutputStream.m4571y(((Long) obj).longValue());
            case 14:
                return CodedOutputStream.m4569z(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.m4644B(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.m4593n((InterfaceC13601o) obj);
            case 17:
                if (obj instanceof C13591j) {
                    return CodedOutputStream.m4585r((C13591j) obj);
                }
                return CodedOutputStream.m4581t((InterfaceC13601o) obj);
            case 18:
                if (obj instanceof C13588i.InterfaceC13589a) {
                    return CodedOutputStream.m4603i(((C13588i.InterfaceC13589a) obj).mo4405d());
                }
                return CodedOutputStream.m4603i(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: f */
    public static int m4470f(InterfaceC13579b<?> interfaceC13579b, Object obj) {
        C13624w.EnumC13626b mo4417k = interfaceC13579b.mo4417k();
        int mo4419d = interfaceC13579b.mo4419d();
        if (interfaceC13579b.mo4418f()) {
            int i = 0;
            if (interfaceC13579b.mo4415s()) {
                for (Object obj2 : (List) obj) {
                    i += m4471e(mo4417k, obj2);
                }
                return CodedOutputStream.m4642D(mo4419d) + i + CodedOutputStream.m4577v(i);
            }
            for (Object obj3 : (List) obj) {
                i += m4472d(mo4417k, mo4419d, obj3);
            }
            return i;
        }
        return m4472d(mo4417k, mo4419d, obj);
    }

    /* renamed from: g */
    public static <T extends InterfaceC13579b<T>> C13577g<T> m4469g() {
        return f29951d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static int m4464l(C13624w.EnumC13626b enumC13626b, boolean z) {
        if (z) {
            return 2;
        }
        return enumC13626b.m4297b();
    }

    /* renamed from: o */
    private boolean m4461o(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.mo4416l() == C13624w.EnumC13631c.MESSAGE) {
            if (key.mo4418f()) {
                for (InterfaceC13601o interfaceC13601o : (List) entry.getValue()) {
                    if (!interfaceC13601o.mo4379h()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof InterfaceC13601o) {
                    if (!((InterfaceC13601o) value).mo4379h()) {
                        return false;
                    }
                } else if (value instanceof C13591j) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    /* renamed from: s */
    private void m4457s(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C13591j) {
            value = ((C13591j) value).m4403e();
        }
        if (key.mo4418f()) {
            Object m4468h = m4468h(key);
            if (m4468h == null) {
                m4468h = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) m4468h).add(m4473c(obj));
            }
            this.f29952a.m4332q(key, m4468h);
        } else if (key.mo4416l() == C13624w.EnumC13631c.MESSAGE) {
            Object m4468h2 = m4468h(key);
            if (m4468h2 == null) {
                this.f29952a.m4332q(key, m4473c(value));
                return;
            }
            this.f29952a.m4332q(key, key.mo4414u(((InterfaceC13601o) m4468h2).mo4386b(), (InterfaceC13601o) value).build());
        } else {
            this.f29952a.m4332q(key, m4473c(value));
        }
    }

    /* renamed from: t */
    public static <T extends InterfaceC13579b<T>> C13577g<T> m4456t() {
        return new C13577g<>();
    }

    /* renamed from: u */
    public static Object m4455u(C13573e c13573e, C13624w.EnumC13626b enumC13626b, boolean z) throws IOException {
        switch (C13578a.f29956b[enumC13626b.ordinal()]) {
            case 1:
                return Double.valueOf(c13573e.m4494m());
            case 2:
                return Float.valueOf(c13573e.m4490q());
            case 3:
                return Long.valueOf(c13573e.m4487t());
            case 4:
                return Long.valueOf(c13573e.m4514M());
            case 5:
                return Integer.valueOf(c13573e.m4488s());
            case 6:
                return Long.valueOf(c13573e.m4491p());
            case 7:
                return Integer.valueOf(c13573e.m4492o());
            case 8:
                return Boolean.valueOf(c13573e.m4496k());
            case 9:
                if (z) {
                    return c13573e.m4517J();
                }
                return c13573e.m4518I();
            case 10:
                return c13573e.m4495l();
            case 11:
                return Integer.valueOf(c13573e.m4515L());
            case 12:
                return Integer.valueOf(c13573e.m4522E());
            case 13:
                return Long.valueOf(c13573e.m4521F());
            case 14:
                return Integer.valueOf(c13573e.m4520G());
            case 15:
                return Long.valueOf(c13573e.m4519H());
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0023, code lost:
        if ((r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.C13588i.InterfaceC13589a) == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
        if ((r3 instanceof byte[]) == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002f, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
        if ((r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.C13591j) == false) goto L8;
     */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void m4453w(kotlin.reflect.jvm.internal.impl.protobuf.C13624w.EnumC13626b r2, java.lang.Object r3) {
        /*
            if (r3 == 0) goto L4e
            int[] r0 = kotlin.reflect.jvm.internal.impl.protobuf.C13577g.C13578a.f29955a
            kotlin.reflect.jvm.internal.impl.protobuf.w$c r2 = r2.m4298a()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L41;
                case 2: goto L3e;
                case 3: goto L3b;
                case 4: goto L38;
                case 5: goto L35;
                case 6: goto L32;
                case 7: goto L26;
                case 8: goto L1d;
                case 9: goto L14;
                default: goto L13;
            }
        L13:
            goto L43
        L14:
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
            if (r2 != 0) goto L30
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.C13591j
            if (r2 == 0) goto L2f
            goto L30
        L1d:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L30
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.C13588i.InterfaceC13589a
            if (r2 == 0) goto L2f
            goto L30
        L26:
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13570d
            if (r2 != 0) goto L30
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L2f
            goto L30
        L2f:
            r0 = 0
        L30:
            r1 = r0
            goto L43
        L32:
            boolean r1 = r3 instanceof java.lang.String
            goto L43
        L35:
            boolean r1 = r3 instanceof java.lang.Boolean
            goto L43
        L38:
            boolean r1 = r3 instanceof java.lang.Double
            goto L43
        L3b:
            boolean r1 = r3 instanceof java.lang.Float
            goto L43
        L3e:
            boolean r1 = r3 instanceof java.lang.Long
            goto L43
        L41:
            boolean r1 = r3 instanceof java.lang.Integer
        L43:
            if (r1 == 0) goto L46
            return
        L46:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        L4e:
            r2 = 0
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.C13577g.m4453w(kotlin.reflect.jvm.internal.impl.protobuf.w$b, java.lang.Object):void");
    }

    /* renamed from: x */
    private static void m4452x(CodedOutputStream codedOutputStream, C13624w.EnumC13626b enumC13626b, int i, Object obj) throws IOException {
        if (enumC13626b == C13624w.EnumC13626b.f30035D) {
            codedOutputStream.m4621Y(i, (InterfaceC13601o) obj);
            return;
        }
        codedOutputStream.m4574w0(i, m4464l(enumC13626b, false));
        m4451y(codedOutputStream, enumC13626b, obj);
    }

    /* renamed from: y */
    private static void m4451y(CodedOutputStream codedOutputStream, C13624w.EnumC13626b enumC13626b, Object obj) throws IOException {
        switch (C13578a.f29956b[enumC13626b.ordinal()]) {
            case 1:
                codedOutputStream.m4628R(((Double) obj).doubleValue());
                return;
            case 2:
                codedOutputStream.m4622X(((Float) obj).floatValue());
                return;
            case 3:
                codedOutputStream.m4614c0(((Long) obj).longValue());
                return;
            case 4:
                codedOutputStream.m4568z0(((Long) obj).longValue());
                return;
            case 5:
                codedOutputStream.m4616b0(((Integer) obj).intValue());
                return;
            case 6:
                codedOutputStream.m4624V(((Long) obj).longValue());
                return;
            case 7:
                codedOutputStream.m4625U(((Integer) obj).intValue());
                return;
            case 8:
                codedOutputStream.m4633M(((Boolean) obj).booleanValue());
                return;
            case 9:
                codedOutputStream.m4576v0((String) obj);
                return;
            case 10:
                if (obj instanceof AbstractC13570d) {
                    codedOutputStream.m4630P((AbstractC13570d) obj);
                    return;
                } else {
                    codedOutputStream.m4632N((byte[]) obj);
                    return;
                }
            case 11:
                codedOutputStream.m4570y0(((Integer) obj).intValue());
                return;
            case 12:
                codedOutputStream.m4586q0(((Integer) obj).intValue());
                return;
            case 13:
                codedOutputStream.m4584r0(((Long) obj).longValue());
                return;
            case 14:
                codedOutputStream.m4582s0(((Integer) obj).intValue());
                return;
            case 15:
                codedOutputStream.m4578u0(((Long) obj).longValue());
                return;
            case 16:
                codedOutputStream.m4620Z((InterfaceC13601o) obj);
                return;
            case 17:
                codedOutputStream.m4610e0((InterfaceC13601o) obj);
                return;
            case 18:
                if (obj instanceof C13588i.InterfaceC13589a) {
                    codedOutputStream.m4626T(((C13588i.InterfaceC13589a) obj).mo4405d());
                    return;
                } else {
                    codedOutputStream.m4626T(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    /* renamed from: z */
    public static void m4450z(InterfaceC13579b<?> interfaceC13579b, Object obj, CodedOutputStream codedOutputStream) throws IOException {
        C13624w.EnumC13626b mo4417k = interfaceC13579b.mo4417k();
        int mo4419d = interfaceC13579b.mo4419d();
        if (interfaceC13579b.mo4418f()) {
            List<Object> list = (List) obj;
            if (interfaceC13579b.mo4415s()) {
                codedOutputStream.m4574w0(mo4419d, 2);
                int i = 0;
                for (Object obj2 : list) {
                    i += m4471e(mo4417k, obj2);
                }
                codedOutputStream.m4590o0(i);
                for (Object obj3 : list) {
                    m4451y(codedOutputStream, mo4417k, obj3);
                }
                return;
            }
            for (Object obj4 : list) {
                m4452x(codedOutputStream, mo4417k, mo4419d, obj4);
            }
        } else if (obj instanceof C13591j) {
            m4452x(codedOutputStream, mo4417k, mo4419d, ((C13591j) obj).m4403e());
        } else {
            m4452x(codedOutputStream, mo4417k, mo4419d, obj);
        }
    }

    /* renamed from: a */
    public void m4475a(FieldDescriptorType fielddescriptortype, Object obj) {
        List list;
        if (fielddescriptortype.mo4418f()) {
            m4453w(fielddescriptortype.mo4417k(), obj);
            Object m4468h = m4468h(fielddescriptortype);
            if (m4468h == null) {
                list = new ArrayList();
                this.f29952a.m4332q(fielddescriptortype, list);
            } else {
                list = (List) m4468h;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: b */
    public C13577g<FieldDescriptorType> clone() {
        C13577g<FieldDescriptorType> m4456t = m4456t();
        for (int i = 0; i < this.f29952a.m4337k(); i++) {
            Map.Entry<FieldDescriptorType, Object> m4338j = this.f29952a.m4338j(i);
            m4456t.m4454v(m4338j.getKey(), m4338j.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.f29952a.m4336l()) {
            m4456t.m4454v(entry.getKey(), entry.getValue());
        }
        m4456t.f29954c = this.f29954c;
        return m4456t;
    }

    /* renamed from: h */
    public Object m4468h(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f29952a.get(fielddescriptortype);
        return obj instanceof C13591j ? ((C13591j) obj).m4403e() : obj;
    }

    /* renamed from: i */
    public Object m4467i(FieldDescriptorType fielddescriptortype, int i) {
        if (fielddescriptortype.mo4418f()) {
            Object m4468h = m4468h(fielddescriptortype);
            if (m4468h != null) {
                return ((List) m4468h).get(i);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: j */
    public int m4466j(FieldDescriptorType fielddescriptortype) {
        if (fielddescriptortype.mo4418f()) {
            Object m4468h = m4468h(fielddescriptortype);
            if (m4468h == null) {
                return 0;
            }
            return ((List) m4468h).size();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: k */
    public int m4465k() {
        int i = 0;
        for (int i2 = 0; i2 < this.f29952a.m4337k(); i2++) {
            Map.Entry<FieldDescriptorType, Object> m4338j = this.f29952a.m4338j(i2);
            i += m4470f(m4338j.getKey(), m4338j.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.f29952a.m4336l()) {
            i += m4470f(entry.getKey(), entry.getValue());
        }
        return i;
    }

    /* renamed from: m */
    public boolean m4463m(FieldDescriptorType fielddescriptortype) {
        if (fielddescriptortype.mo4418f()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.f29952a.get(fielddescriptortype) != null;
    }

    /* renamed from: n */
    public boolean m4462n() {
        for (int i = 0; i < this.f29952a.m4337k(); i++) {
            if (!m4461o(this.f29952a.m4338j(i))) {
                return false;
            }
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.f29952a.m4336l()) {
            if (!m4461o(entry)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: p */
    public Iterator<Map.Entry<FieldDescriptorType, Object>> m4460p() {
        if (this.f29954c) {
            return new C13591j.C13594c(this.f29952a.entrySet().iterator());
        }
        return this.f29952a.entrySet().iterator();
    }

    /* renamed from: q */
    public void m4459q() {
        if (this.f29953b) {
            return;
        }
        this.f29952a.mo4330o();
        this.f29953b = true;
    }

    /* renamed from: r */
    public void m4458r(C13577g<FieldDescriptorType> c13577g) {
        for (int i = 0; i < c13577g.f29952a.m4337k(); i++) {
            m4457s(c13577g.f29952a.m4338j(i));
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : c13577g.f29952a.m4336l()) {
            m4457s(entry);
        }
    }

    /* renamed from: v */
    public void m4454v(FieldDescriptorType fielddescriptortype, Object obj) {
        if (fielddescriptortype.mo4418f()) {
            if (obj instanceof List) {
                ArrayList<Object> arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                for (Object obj2 : arrayList) {
                    m4453w(fielddescriptortype.mo4417k(), obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            m4453w(fielddescriptortype.mo4417k(), obj);
        }
        if (obj instanceof C13591j) {
            this.f29954c = true;
        }
        this.f29952a.m4332q(fielddescriptortype, obj);
    }

    private C13577g(boolean z) {
        m4459q();
    }
}
