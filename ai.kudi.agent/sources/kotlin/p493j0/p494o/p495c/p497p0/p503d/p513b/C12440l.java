package kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b;

import kotlin.C13668y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.EnumC12052i;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.AbstractC12434j;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p529u.C12756d;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p529u.EnumC12757e;
import kotlin.p549l0.C13277t;
/* compiled from: methodSignatureMapping.kt */
/* renamed from: kotlin.j0.o.c.p0.d.b.l */
/* loaded from: classes3.dex */
final class C12440l implements InterfaceC12439k<AbstractC12434j> {

    /* renamed from: a */
    public static final C12440l f27626a = new C12440l();

    /* compiled from: methodSignatureMapping.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.b.l$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C12441a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f27627a;

        static {
            int[] iArr = new int[EnumC12052i.values().length];
            iArr[EnumC12052i.BOOLEAN.ordinal()] = 1;
            iArr[EnumC12052i.CHAR.ordinal()] = 2;
            iArr[EnumC12052i.BYTE.ordinal()] = 3;
            iArr[EnumC12052i.SHORT.ordinal()] = 4;
            iArr[EnumC12052i.INT.ordinal()] = 5;
            iArr[EnumC12052i.FLOAT.ordinal()] = 6;
            iArr[EnumC12052i.LONG.ordinal()] = 7;
            iArr[EnumC12052i.DOUBLE.ordinal()] = 8;
            f27627a = iArr;
        }
    }

    private C12440l() {
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12439k
    /* renamed from: g */
    public AbstractC12434j mo8897d(AbstractC12434j abstractC12434j) {
        l.f(abstractC12434j, "possiblyPrimitiveType");
        if (abstractC12434j instanceof AbstractC12434j.C12438d) {
            AbstractC12434j.C12438d c12438d = (AbstractC12434j.C12438d) abstractC12434j;
            if (c12438d.m8901i() != null) {
                String m6831f = C12756d.m6834c(c12438d.m8901i().m6823j()).m6831f();
                l.e(m6831f, "byFqNameWithoutInnerClasses(possiblyPrimitiveType.jvmPrimitiveType.wrapperFqName).internalName");
                return mo8898c(m6831f);
            }
            return abstractC12434j;
        }
        return abstractC12434j;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12439k
    /* renamed from: h */
    public AbstractC12434j mo8899b(String str) {
        EnumC12757e enumC12757e;
        AbstractC12434j c12437c;
        boolean m5415M;
        l.f(str, "representation");
        boolean z = false;
        boolean z2 = str.length() > 0;
        if (!C13668y.f30115a || z2) {
            char charAt = str.charAt(0);
            EnumC12757e[] values = EnumC12757e.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    enumC12757e = null;
                    break;
                }
                enumC12757e = values[i];
                if (enumC12757e.m6826g().charAt(0) == charAt) {
                    break;
                }
                i++;
            }
            if (enumC12757e == null) {
                if (charAt == 'V') {
                    return new AbstractC12434j.C12438d(null);
                }
                if (charAt == '[') {
                    String substring = str.substring(1);
                    l.e(substring, "(this as java.lang.String).substring(startIndex)");
                    c12437c = new AbstractC12434j.C12435a(mo8899b(substring));
                } else {
                    if (charAt == 'L') {
                        m5415M = C13277t.m5415M(str, ';', false, 2, null);
                        if (m5415M) {
                            z = true;
                        }
                    }
                    if (C13668y.f30115a && !z) {
                        throw new AssertionError("Type that is not primitive nor array should be Object, but '" + str + "' was found");
                    }
                    String substring2 = str.substring(1, str.length() - 1);
                    l.e(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    c12437c = new AbstractC12434j.C12437c(substring2);
                }
                return c12437c;
            }
            return new AbstractC12434j.C12438d(enumC12757e);
        }
        throw new AssertionError("empty string as JvmType");
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12439k
    /* renamed from: i */
    public AbstractC12434j.C12437c mo8898c(String str) {
        l.f(str, "internalName");
        return new AbstractC12434j.C12437c(str);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12439k
    /* renamed from: j */
    public AbstractC12434j mo8895f(EnumC12052i enumC12052i) {
        l.f(enumC12052i, "primitiveType");
        switch (C12441a.f27627a[enumC12052i.ordinal()]) {
            case 1:
                return AbstractC12434j.f27614a.m8910a();
            case 2:
                return AbstractC12434j.f27614a.m8908c();
            case 3:
                return AbstractC12434j.f27614a.m8909b();
            case 4:
                return AbstractC12434j.f27614a.m8903h();
            case 5:
                return AbstractC12434j.f27614a.m8905f();
            case 6:
                return AbstractC12434j.f27614a.m8906e();
            case 7:
                return AbstractC12434j.f27614a.m8904g();
            case 8:
                return AbstractC12434j.f27614a.m8907d();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12439k
    /* renamed from: k */
    public AbstractC12434j mo8896e() {
        return mo8898c("java/lang/Class");
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12439k
    /* renamed from: l */
    public String mo8900a(AbstractC12434j abstractC12434j) {
        String m6826g;
        l.f(abstractC12434j, "type");
        if (abstractC12434j instanceof AbstractC12434j.C12435a) {
            return l.m("[", mo8900a(((AbstractC12434j.C12435a) abstractC12434j).m8911i()));
        }
        if (abstractC12434j instanceof AbstractC12434j.C12438d) {
            EnumC12757e m8901i = ((AbstractC12434j.C12438d) abstractC12434j).m8901i();
            return (m8901i == null || (m6826g = m8901i.m6826g()) == null) ? "V" : m6826g;
        } else if (abstractC12434j instanceof AbstractC12434j.C12437c) {
            return 'L' + ((AbstractC12434j.C12437c) abstractC12434j).m8902i() + ';';
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
