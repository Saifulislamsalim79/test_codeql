package com.google.protobuf;

import com.google.protobuf.AbstractC7141y;
import com.google.protobuf.C7118t1;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ExtensionSchemaLite.java */
/* renamed from: com.google.protobuf.r */
/* loaded from: classes2.dex */
final class C7098r extends AbstractC7093q<AbstractC7141y.C7145d> {

    /* compiled from: ExtensionSchemaLite.java */
    /* renamed from: com.google.protobuf.r$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C7099a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16930a;

        static {
            int[] iArr = new int[C7118t1.EnumC7120b.values().length];
            f16930a = iArr;
            try {
                iArr[C7118t1.EnumC7120b.f16962e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16930a[C7118t1.EnumC7120b.f16963f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16930a[C7118t1.EnumC7120b.f16964w.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16930a[C7118t1.EnumC7120b.f16965x.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16930a[C7118t1.EnumC7120b.f16966y.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16930a[C7118t1.EnumC7120b.f16967z.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16930a[C7118t1.EnumC7120b.f16949A.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16930a[C7118t1.EnumC7120b.f16950B.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f16930a[C7118t1.EnumC7120b.f16955G.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f16930a[C7118t1.EnumC7120b.f16957I.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f16930a[C7118t1.EnumC7120b.f16958J.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f16930a[C7118t1.EnumC7120b.f16959K.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f16930a[C7118t1.EnumC7120b.f16960L.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f16930a[C7118t1.EnumC7120b.f16956H.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f16930a[C7118t1.EnumC7120b.f16954F.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f16930a[C7118t1.EnumC7120b.f16951C.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f16930a[C7118t1.EnumC7120b.f16952D.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f16930a[C7118t1.EnumC7120b.f16953E.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.AbstractC7093q
    /* renamed from: a */
    public int mo19720a(Map.Entry<?, ?> entry) {
        return ((AbstractC7141y.C7145d) entry.getKey()).mo19348d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.AbstractC7093q
    /* renamed from: b */
    public Object mo19719b(C7089p c7089p, InterfaceC7100r0 interfaceC7100r0, int i) {
        return c7089p.m19770a(interfaceC7100r0, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.AbstractC7093q
    /* renamed from: c */
    public C7126u<AbstractC7141y.C7145d> mo19718c(Object obj) {
        return ((AbstractC7141y.AbstractC7144c) obj).extensions;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.AbstractC7093q
    /* renamed from: d */
    public C7126u<AbstractC7141y.C7145d> mo19717d(Object obj) {
        return ((AbstractC7141y.AbstractC7144c) obj).m19355R();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.AbstractC7093q
    /* renamed from: e */
    public boolean mo19716e(InterfaceC7100r0 interfaceC7100r0) {
        return interfaceC7100r0 instanceof AbstractC7141y.AbstractC7144c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.AbstractC7093q
    /* renamed from: f */
    public void mo19715f(Object obj) {
        mo19718c(obj).m19541s();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.AbstractC7093q
    /* renamed from: g */
    public <UT, UB> UB mo19714g(InterfaceC7032g1 interfaceC7032g1, Object obj, C7089p c7089p, C7126u<AbstractC7141y.C7145d> c7126u, UB ub, AbstractC7085n1<UT, UB> abstractC7085n1) throws IOException {
        Object m19552h;
        ArrayList arrayList;
        AbstractC7141y.C7146e c7146e = (AbstractC7141y.C7146e) obj;
        int m19341c = c7146e.m19341c();
        if (c7146e.f17091b.mo19347f() && c7146e.f17091b.mo19344s()) {
            switch (C7099a.f16930a[c7146e.m19343a().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    interfaceC7032g1.mo19910L(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    interfaceC7032g1.mo19915G(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    interfaceC7032g1.mo19882p(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    interfaceC7032g1.mo19885m(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    interfaceC7032g1.mo19880r(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    interfaceC7032g1.mo19907O(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    interfaceC7032g1.mo19877u(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    interfaceC7032g1.mo19874x(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    interfaceC7032g1.mo19891g(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    interfaceC7032g1.mo19894d(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    interfaceC7032g1.mo19881q(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    interfaceC7032g1.mo19897a(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    interfaceC7032g1.mo19893e(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    interfaceC7032g1.mo19879s(arrayList);
                    ub = (UB) C7061j1.m19922z(m19341c, arrayList, c7146e.f17091b.m19349b(), ub, abstractC7085n1);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + c7146e.f17091b.mo19346k());
            }
            c7126u.m19537w(c7146e.f17091b, arrayList);
        } else {
            Object obj2 = null;
            if (c7146e.m19343a() == C7118t1.EnumC7120b.f16956H) {
                int mo19914H = interfaceC7032g1.mo19914H();
                if (c7146e.f17091b.m19349b().m20224a(mo19914H) == null) {
                    return (UB) C7061j1.m19967L(m19341c, mo19914H, ub, abstractC7085n1);
                }
                obj2 = Integer.valueOf(mo19914H);
            } else {
                switch (C7099a.f16930a[c7146e.m19343a().ordinal()]) {
                    case 1:
                        obj2 = Double.valueOf(interfaceC7032g1.readDouble());
                        break;
                    case 2:
                        obj2 = Float.valueOf(interfaceC7032g1.readFloat());
                        break;
                    case 3:
                        obj2 = Long.valueOf(interfaceC7032g1.mo19909M());
                        break;
                    case 4:
                        obj2 = Long.valueOf(interfaceC7032g1.mo19896b());
                        break;
                    case 5:
                        obj2 = Integer.valueOf(interfaceC7032g1.mo19914H());
                        break;
                    case 6:
                        obj2 = Long.valueOf(interfaceC7032g1.mo19895c());
                        break;
                    case 7:
                        obj2 = Integer.valueOf(interfaceC7032g1.mo19889i());
                        break;
                    case 8:
                        obj2 = Boolean.valueOf(interfaceC7032g1.mo19888j());
                        break;
                    case 9:
                        obj2 = Integer.valueOf(interfaceC7032g1.mo19883o());
                        break;
                    case 10:
                        obj2 = Integer.valueOf(interfaceC7032g1.mo19912J());
                        break;
                    case 11:
                        obj2 = Long.valueOf(interfaceC7032g1.mo19886l());
                        break;
                    case 12:
                        obj2 = Integer.valueOf(interfaceC7032g1.mo19876v());
                        break;
                    case 13:
                        obj2 = Long.valueOf(interfaceC7032g1.mo19875w());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        obj2 = interfaceC7032g1.mo19916F();
                        break;
                    case 16:
                        obj2 = interfaceC7032g1.mo19873y();
                        break;
                    case 17:
                        obj2 = interfaceC7032g1.mo19872z(c7146e.m19342b().getClass(), c7089p);
                        break;
                    case 18:
                        obj2 = interfaceC7032g1.mo19890h(c7146e.m19342b().getClass(), c7089p);
                        break;
                }
            }
            if (c7146e.m19340d()) {
                c7126u.m19559a(c7146e.f17091b, obj2);
            } else {
                int i = C7099a.f16930a[c7146e.m19343a().ordinal()];
                if ((i == 17 || i == 18) && (m19552h = c7126u.m19552h(c7146e.f17091b)) != null) {
                    obj2 = C6997a0.m20228h(m19552h, obj2);
                }
                c7126u.m19537w(c7146e.f17091b, obj2);
            }
        }
        return ub;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.AbstractC7093q
    /* renamed from: h */
    public void mo19713h(InterfaceC7032g1 interfaceC7032g1, Object obj, C7089p c7089p, C7126u<AbstractC7141y.C7145d> c7126u) throws IOException {
        AbstractC7141y.C7146e c7146e = (AbstractC7141y.C7146e) obj;
        c7126u.m19537w(c7146e.f17091b, interfaceC7032g1.mo19890h(c7146e.m19342b().getClass(), c7089p));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.AbstractC7093q
    /* renamed from: i */
    public void mo19712i(AbstractC7039i abstractC7039i, Object obj, C7089p c7089p, C7126u<AbstractC7141y.C7145d> c7126u) throws IOException {
        AbstractC7141y.C7146e c7146e = (AbstractC7141y.C7146e) obj;
        InterfaceC7100r0 mo19366C0 = c7146e.m19342b().mo19352f().mo19366C0();
        AbstractC7025f m20157P = AbstractC7025f.m20157P(ByteBuffer.wrap(abstractC7039i.m20100X()), true);
        C7019d1.m20212a().m20211b(mo19366C0, m20157P, c7089p);
        c7126u.m19537w(c7146e.f17091b, mo19366C0);
        if (m20157P.mo19921A() != Integer.MAX_VALUE) {
            throw InvalidProtocolBufferException.m20256c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.AbstractC7093q
    /* renamed from: j */
    public void mo19711j(InterfaceC7131u1 interfaceC7131u1, Map.Entry<?, ?> entry) throws IOException {
        AbstractC7141y.C7145d c7145d = (AbstractC7141y.C7145d) entry.getKey();
        if (c7145d.mo19347f()) {
            switch (C7099a.f16930a[c7145d.mo19346k().ordinal()]) {
                case 1:
                    C7061j1.m19963P(c7145d.mo19348d(), (List) entry.getValue(), interfaceC7131u1, c7145d.mo19344s());
                    return;
                case 2:
                    C7061j1.m19959T(c7145d.mo19348d(), (List) entry.getValue(), interfaceC7131u1, c7145d.mo19344s());
                    return;
                case 3:
                    C7061j1.m19956W(c7145d.mo19348d(), (List) entry.getValue(), interfaceC7131u1, c7145d.mo19344s());
                    return;
                case 4:
                    C7061j1.m19943e0(c7145d.mo19348d(), (List) entry.getValue(), interfaceC7131u1, c7145d.mo19344s());
                    return;
                case 5:
                    C7061j1.m19957V(c7145d.mo19348d(), (List) entry.getValue(), interfaceC7131u1, c7145d.mo19344s());
                    return;
                case 6:
                    C7061j1.m19960S(c7145d.mo19348d(), (List) entry.getValue(), interfaceC7131u1, c7145d.mo19344s());
                    return;
                case 7:
                    C7061j1.m19961R(c7145d.mo19348d(), (List) entry.getValue(), interfaceC7131u1, c7145d.mo19344s());
                    return;
                case 8:
                    C7061j1.m19965N(c7145d.mo19348d(), (List) entry.getValue(), interfaceC7131u1, c7145d.mo19344s());
                    return;
                case 9:
                    C7061j1.m19945d0(c7145d.mo19348d(), (List) entry.getValue(), interfaceC7131u1, c7145d.mo19344s());
                    return;
                case 10:
                    C7061j1.m19954Y(c7145d.mo19348d(), (List) entry.getValue(), interfaceC7131u1, c7145d.mo19344s());
                    return;
                case 11:
                    C7061j1.m19953Z(c7145d.mo19348d(), (List) entry.getValue(), interfaceC7131u1, c7145d.mo19344s());
                    return;
                case 12:
                    C7061j1.m19951a0(c7145d.mo19348d(), (List) entry.getValue(), interfaceC7131u1, c7145d.mo19344s());
                    return;
                case 13:
                    C7061j1.m19949b0(c7145d.mo19348d(), (List) entry.getValue(), interfaceC7131u1, c7145d.mo19344s());
                    return;
                case 14:
                    C7061j1.m19957V(c7145d.mo19348d(), (List) entry.getValue(), interfaceC7131u1, c7145d.mo19344s());
                    return;
                case 15:
                    C7061j1.m19964O(c7145d.mo19348d(), (List) entry.getValue(), interfaceC7131u1);
                    return;
                case 16:
                    C7061j1.m19947c0(c7145d.mo19348d(), (List) entry.getValue(), interfaceC7131u1);
                    return;
                case 17:
                    List list = (List) entry.getValue();
                    if (list == null || list.isEmpty()) {
                        return;
                    }
                    C7061j1.m19958U(c7145d.mo19348d(), (List) entry.getValue(), interfaceC7131u1, C7019d1.m20212a().m20209d(list.get(0).getClass()));
                    return;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 == null || list2.isEmpty()) {
                        return;
                    }
                    C7061j1.m19955X(c7145d.mo19348d(), (List) entry.getValue(), interfaceC7131u1, C7019d1.m20212a().m20209d(list2.get(0).getClass()));
                    return;
                default:
                    return;
            }
        }
        switch (C7099a.f16930a[c7145d.mo19346k().ordinal()]) {
            case 1:
                interfaceC7131u1.mo19446g(c7145d.mo19348d(), ((Double) entry.getValue()).doubleValue());
                return;
            case 2:
                interfaceC7131u1.mo19461G(c7145d.mo19348d(), ((Float) entry.getValue()).floatValue());
                return;
            case 3:
                interfaceC7131u1.mo19436q(c7145d.mo19348d(), ((Long) entry.getValue()).longValue());
                return;
            case 4:
                interfaceC7131u1.mo19438o(c7145d.mo19348d(), ((Long) entry.getValue()).longValue());
                return;
            case 5:
                interfaceC7131u1.mo19430w(c7145d.mo19348d(), ((Integer) entry.getValue()).intValue());
                return;
            case 6:
                interfaceC7131u1.mo19442k(c7145d.mo19348d(), ((Long) entry.getValue()).longValue());
                return;
            case 7:
                interfaceC7131u1.mo19447f(c7145d.mo19348d(), ((Integer) entry.getValue()).intValue());
                return;
            case 8:
                interfaceC7131u1.mo19435r(c7145d.mo19348d(), ((Boolean) entry.getValue()).booleanValue());
                return;
            case 9:
                interfaceC7131u1.mo19449d(c7145d.mo19348d(), ((Integer) entry.getValue()).intValue());
                return;
            case 10:
                interfaceC7131u1.mo19433t(c7145d.mo19348d(), ((Integer) entry.getValue()).intValue());
                return;
            case 11:
                interfaceC7131u1.mo19427z(c7145d.mo19348d(), ((Long) entry.getValue()).longValue());
                return;
            case 12:
                interfaceC7131u1.mo19454N(c7145d.mo19348d(), ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                interfaceC7131u1.mo19462F(c7145d.mo19348d(), ((Long) entry.getValue()).longValue());
                return;
            case 14:
                interfaceC7131u1.mo19430w(c7145d.mo19348d(), ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                interfaceC7131u1.mo19431v(c7145d.mo19348d(), (AbstractC7039i) entry.getValue());
                return;
            case 16:
                interfaceC7131u1.mo19439n(c7145d.mo19348d(), (String) entry.getValue());
                return;
            case 17:
                interfaceC7131u1.mo19434s(c7145d.mo19348d(), entry.getValue(), C7019d1.m20212a().m20209d(entry.getValue().getClass()));
                return;
            case 18:
                interfaceC7131u1.mo19443j(c7145d.mo19348d(), entry.getValue(), C7019d1.m20212a().m20209d(entry.getValue().getClass()));
                return;
            default:
                return;
        }
    }
}
