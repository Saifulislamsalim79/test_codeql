package kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.p514a0;

import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.C12386v;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12447o;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.p514a0.C12408a;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p516a0.p517b.C12494e;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12608b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r.C12711f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13545u0;
/* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
/* renamed from: kotlin.j0.o.c.p0.d.b.a0.b */
/* loaded from: classes3.dex */
public class C12411b implements InterfaceC12447o.InterfaceC12450c {

    /* renamed from: i */
    private static final boolean f27560i = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));

    /* renamed from: j */
    private static final Map<C12608b, C12408a.EnumC12409a> f27561j;

    /* renamed from: a */
    private int[] f27562a = null;

    /* renamed from: b */
    private String f27563b = null;

    /* renamed from: c */
    private int f27564c = 0;

    /* renamed from: d */
    private String f27565d = null;

    /* renamed from: e */
    private String[] f27566e = null;

    /* renamed from: f */
    private String[] f27567f = null;

    /* renamed from: g */
    private String[] f27568g = null;

    /* renamed from: h */
    private C12408a.EnumC12409a f27569h = null;

    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
    /* renamed from: kotlin.j0.o.c.p0.d.b.a0.b$b */
    /* loaded from: classes3.dex */
    private static abstract class AbstractC12413b implements InterfaceC12447o.InterfaceC12449b {

        /* renamed from: a */
        private final List<String> f27570a = new ArrayList();

        /* renamed from: f */
        private static /* synthetic */ void m8973f(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "enumEntryName";
            } else if (i == 2) {
                objArr[0] = "classLiteralValue";
            } else if (i != 3) {
                objArr[0] = "enumClassId";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$CollectStringArrayAnnotationVisitor";
            if (i == 2) {
                objArr[2] = "visitClassLiteral";
            } else if (i != 3) {
                objArr[2] = "visitEnum";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12447o.InterfaceC12449b
        /* renamed from: a */
        public void mo8877a() {
            mo8962g((String[]) this.f27570a.toArray(new String[0]));
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12447o.InterfaceC12449b
        /* renamed from: b */
        public void mo8876b(Object obj) {
            if (obj instanceof String) {
                this.f27570a.add((String) obj);
            }
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12447o.InterfaceC12449b
        /* renamed from: c */
        public void mo8875c(C12608b c12608b, C12614f c12614f) {
            if (c12608b == null) {
                m8973f(0);
                throw null;
            } else if (c12614f != null) {
            } else {
                m8973f(1);
                throw null;
            }
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12447o.InterfaceC12449b
        /* renamed from: d */
        public InterfaceC12447o.InterfaceC12448a mo8874d(C12608b c12608b) {
            if (c12608b != null) {
                return null;
            }
            m8973f(3);
            throw null;
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12447o.InterfaceC12449b
        /* renamed from: e */
        public void mo8873e(C12711f c12711f) {
            if (c12711f != null) {
                return;
            }
            m8973f(2);
            throw null;
        }

        /* renamed from: g */
        protected abstract void mo8962g(String[] strArr);
    }

    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
    /* renamed from: kotlin.j0.o.c.p0.d.b.a0.b$c */
    /* loaded from: classes3.dex */
    private class C12414c implements InterfaceC12447o.InterfaceC12448a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
        /* renamed from: kotlin.j0.o.c.p0.d.b.a0.b$c$a */
        /* loaded from: classes3.dex */
        public class C12415a extends AbstractC12413b {
            C12415a() {
            }

            /* renamed from: f */
            private static /* synthetic */ void m8969f(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1", "visitEnd"));
            }

            @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.p514a0.C12411b.AbstractC12413b
            /* renamed from: g */
            protected void mo8962g(String[] strArr) {
                if (strArr != null) {
                    C12411b.this.f27566e = strArr;
                } else {
                    m8969f(0);
                    throw null;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
        /* renamed from: kotlin.j0.o.c.p0.d.b.a0.b$c$b */
        /* loaded from: classes3.dex */
        public class C12416b extends AbstractC12413b {
            C12416b() {
            }

            /* renamed from: f */
            private static /* synthetic */ void m8968f(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2", "visitEnd"));
            }

            @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.p514a0.C12411b.AbstractC12413b
            /* renamed from: g */
            protected void mo8962g(String[] strArr) {
                if (strArr != null) {
                    C12411b.this.f27567f = strArr;
                } else {
                    m8968f(0);
                    throw null;
                }
            }
        }

        private C12414c() {
        }

        /* renamed from: g */
        private static /* synthetic */ void m8972g(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "classLiteralValue";
            } else if (i == 7) {
                objArr[0] = "classId";
            } else if (i == 4) {
                objArr[0] = "enumClassId";
            } else if (i != 5) {
                objArr[0] = "name";
            } else {
                objArr[0] = "enumEntryName";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor";
            switch (i) {
                case 2:
                    objArr[2] = "visitArray";
                    break;
                case 3:
                case 4:
                case 5:
                    objArr[2] = "visitEnum";
                    break;
                case 6:
                case 7:
                    objArr[2] = "visitAnnotation";
                    break;
                default:
                    objArr[2] = "visitClassLiteral";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: h */
        private InterfaceC12447o.InterfaceC12449b m8971h() {
            return new C12415a();
        }

        /* renamed from: i */
        private InterfaceC12447o.InterfaceC12449b m8970i() {
            return new C12416b();
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12447o.InterfaceC12448a
        /* renamed from: a */
        public void mo8883a() {
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12447o.InterfaceC12448a
        /* renamed from: b */
        public void mo8882b(C12614f c12614f, C12711f c12711f) {
            if (c12614f == null) {
                m8972g(0);
                throw null;
            } else if (c12711f != null) {
            } else {
                m8972g(1);
                throw null;
            }
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12447o.InterfaceC12448a
        /* renamed from: c */
        public void mo8881c(C12614f c12614f, Object obj) {
            if (c12614f == null) {
                return;
            }
            String m7353b = c12614f.m7353b();
            if ("k".equals(m7353b)) {
                if (obj instanceof Integer) {
                    C12411b.this.f27569h = C12408a.EnumC12409a.m8986e(((Integer) obj).intValue());
                }
            } else if ("mv".equals(m7353b)) {
                if (obj instanceof int[]) {
                    C12411b.this.f27562a = (int[]) obj;
                }
            } else if ("xs".equals(m7353b)) {
                if (obj instanceof String) {
                    C12411b.this.f27563b = (String) obj;
                }
            } else if ("xi".equals(m7353b)) {
                if (obj instanceof Integer) {
                    C12411b.this.f27564c = ((Integer) obj).intValue();
                }
            } else if ("pn".equals(m7353b) && (obj instanceof String)) {
                C12411b.this.f27565d = (String) obj;
            }
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12447o.InterfaceC12448a
        /* renamed from: d */
        public void mo8880d(C12614f c12614f, C12608b c12608b, C12614f c12614f2) {
            if (c12614f == null) {
                m8972g(3);
                throw null;
            } else if (c12608b == null) {
                m8972g(4);
                throw null;
            } else if (c12614f2 != null) {
            } else {
                m8972g(5);
                throw null;
            }
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12447o.InterfaceC12448a
        /* renamed from: e */
        public InterfaceC12447o.InterfaceC12448a mo8879e(C12614f c12614f, C12608b c12608b) {
            if (c12614f == null) {
                m8972g(6);
                throw null;
            } else if (c12608b != null) {
                return null;
            } else {
                m8972g(7);
                throw null;
            }
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12447o.InterfaceC12448a
        /* renamed from: f */
        public InterfaceC12447o.InterfaceC12449b mo8878f(C12614f c12614f) {
            if (c12614f != null) {
                String m7353b = c12614f.m7353b();
                if ("d1".equals(m7353b)) {
                    return m8971h();
                }
                if ("d2".equals(m7353b)) {
                    return m8970i();
                }
                return null;
            }
            m8972g(2);
            throw null;
        }
    }

    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
    /* renamed from: kotlin.j0.o.c.p0.d.b.a0.b$d */
    /* loaded from: classes3.dex */
    private class C12417d implements InterfaceC12447o.InterfaceC12448a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
        /* renamed from: kotlin.j0.o.c.p0.d.b.a0.b$d$a */
        /* loaded from: classes3.dex */
        public class C12418a extends AbstractC12413b {
            C12418a() {
            }

            /* renamed from: f */
            private static /* synthetic */ void m8964f(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", TransactionBreakDownItemType.DATA, "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1", "visitEnd"));
            }

            @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.p514a0.C12411b.AbstractC12413b
            /* renamed from: g */
            protected void mo8962g(String[] strArr) {
                if (strArr != null) {
                    C12411b.this.f27566e = strArr;
                } else {
                    m8964f(0);
                    throw null;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
        /* renamed from: kotlin.j0.o.c.p0.d.b.a0.b$d$b */
        /* loaded from: classes3.dex */
        public class C12419b extends AbstractC12413b {
            C12419b() {
            }

            /* renamed from: f */
            private static /* synthetic */ void m8963f(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", TransactionBreakDownItemType.DATA, "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2", "visitEnd"));
            }

            @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.p514a0.C12411b.AbstractC12413b
            /* renamed from: g */
            protected void mo8962g(String[] strArr) {
                if (strArr != null) {
                    C12411b.this.f27567f = strArr;
                } else {
                    m8963f(0);
                    throw null;
                }
            }
        }

        private C12417d() {
        }

        /* renamed from: g */
        private static /* synthetic */ void m8967g(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "classLiteralValue";
            } else if (i == 7) {
                objArr[0] = "classId";
            } else if (i == 4) {
                objArr[0] = "enumClassId";
            } else if (i != 5) {
                objArr[0] = "name";
            } else {
                objArr[0] = "enumEntryName";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor";
            switch (i) {
                case 2:
                    objArr[2] = "visitArray";
                    break;
                case 3:
                case 4:
                case 5:
                    objArr[2] = "visitEnum";
                    break;
                case 6:
                case 7:
                    objArr[2] = "visitAnnotation";
                    break;
                default:
                    objArr[2] = "visitClassLiteral";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: h */
        private InterfaceC12447o.InterfaceC12449b m8966h() {
            return new C12418a();
        }

        /* renamed from: i */
        private InterfaceC12447o.InterfaceC12449b m8965i() {
            return new C12419b();
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12447o.InterfaceC12448a
        /* renamed from: a */
        public void mo8883a() {
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12447o.InterfaceC12448a
        /* renamed from: b */
        public void mo8882b(C12614f c12614f, C12711f c12711f) {
            if (c12614f == null) {
                m8967g(0);
                throw null;
            } else if (c12711f != null) {
            } else {
                m8967g(1);
                throw null;
            }
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12447o.InterfaceC12448a
        /* renamed from: c */
        public void mo8881c(C12614f c12614f, Object obj) {
            if (c12614f == null) {
                return;
            }
            String m7353b = c12614f.m7353b();
            if ("version".equals(m7353b)) {
                if (obj instanceof int[]) {
                    C12411b.this.f27562a = (int[]) obj;
                }
            } else if ("multifileClassName".equals(m7353b)) {
                C12411b.this.f27563b = obj instanceof String ? (String) obj : null;
            }
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12447o.InterfaceC12448a
        /* renamed from: d */
        public void mo8880d(C12614f c12614f, C12608b c12608b, C12614f c12614f2) {
            if (c12614f == null) {
                m8967g(3);
                throw null;
            } else if (c12608b == null) {
                m8967g(4);
                throw null;
            } else if (c12614f2 != null) {
            } else {
                m8967g(5);
                throw null;
            }
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12447o.InterfaceC12448a
        /* renamed from: e */
        public InterfaceC12447o.InterfaceC12448a mo8879e(C12614f c12614f, C12608b c12608b) {
            if (c12614f == null) {
                m8967g(6);
                throw null;
            } else if (c12608b != null) {
                return null;
            } else {
                m8967g(7);
                throw null;
            }
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12447o.InterfaceC12448a
        /* renamed from: f */
        public InterfaceC12447o.InterfaceC12449b mo8878f(C12614f c12614f) {
            if (c12614f != null) {
                String m7353b = c12614f.m7353b();
                if (!TransactionBreakDownItemType.DATA.equals(m7353b) && !"filePartClassNames".equals(m7353b)) {
                    if ("strings".equals(m7353b)) {
                        return m8965i();
                    }
                    return null;
                }
                return m8966h();
            }
            m8967g(2);
            throw null;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f27561j = hashMap;
        hashMap.put(C12608b.m7384m(new C12609c("kotlin.jvm.internal.KotlinClass")), C12408a.EnumC12409a.CLASS);
        f27561j.put(C12608b.m7384m(new C12609c("kotlin.jvm.internal.KotlinFileFacade")), C12408a.EnumC12409a.FILE_FACADE);
        f27561j.put(C12608b.m7384m(new C12609c("kotlin.jvm.internal.KotlinMultifileClass")), C12408a.EnumC12409a.MULTIFILE_CLASS);
        f27561j.put(C12608b.m7384m(new C12609c("kotlin.jvm.internal.KotlinMultifileClassPart")), C12408a.EnumC12409a.MULTIFILE_CLASS_PART);
        f27561j.put(C12608b.m7384m(new C12609c("kotlin.jvm.internal.KotlinSyntheticClass")), C12408a.EnumC12409a.SYNTHETIC_CLASS);
    }

    /* renamed from: d */
    private static /* synthetic */ void m8983d(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            objArr[0] = "classId";
        } else {
            objArr[0] = TransactionField.TRANSACTION_CHANNEL;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor";
        objArr[2] = "visitAnnotation";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* renamed from: m */
    private boolean m8974m() {
        C12408a.EnumC12409a enumC12409a = this.f27569h;
        return enumC12409a == C12408a.EnumC12409a.CLASS || enumC12409a == C12408a.EnumC12409a.FILE_FACADE || enumC12409a == C12408a.EnumC12409a.MULTIFILE_CLASS_PART;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12447o.InterfaceC12450c
    /* renamed from: a */
    public void mo8872a() {
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12447o.InterfaceC12450c
    /* renamed from: b */
    public InterfaceC12447o.InterfaceC12448a mo8871b(C12608b c12608b, InterfaceC13545u0 interfaceC13545u0) {
        C12408a.EnumC12409a enumC12409a;
        if (c12608b == null) {
            m8983d(0);
            throw null;
        } else if (interfaceC13545u0 != null) {
            if (c12608b.m7395b().equals(C12386v.f27468a)) {
                return new C12414c();
            }
            if (f27560i || this.f27569h != null || (enumC12409a = f27561j.get(c12608b)) == null) {
                return null;
            }
            this.f27569h = enumC12409a;
            return new C12417d();
        } else {
            m8983d(1);
            throw null;
        }
    }

    /* renamed from: l */
    public C12408a m8975l() {
        if (this.f27569h == null || this.f27562a == null) {
            return null;
        }
        C12494e c12494e = new C12494e(this.f27562a, (this.f27564c & 8) != 0);
        if (!c12494e.m8642h()) {
            this.f27568g = this.f27566e;
            this.f27566e = null;
        } else if (m8974m() && this.f27566e == null) {
            return null;
        }
        return new C12408a(this.f27569h, c12494e, this.f27566e, this.f27568g, this.f27567f, this.f27563b, this.f27564c, this.f27565d);
    }
}
