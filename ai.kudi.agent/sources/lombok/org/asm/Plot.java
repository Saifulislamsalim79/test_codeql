package lombok.org.asm;

import lombok.org.asm.asm.Paint;
/* loaded from: classes.dex */
public final class Plot {

    /* renamed from: a */
    public static final C14309t f31299a;

    /* renamed from: b */
    public static final Paint f31300b;

    /* renamed from: d */
    public static final Paint f31301d;

    /* renamed from: e */
    public static final Paint f31302e;

    /* renamed from: f */
    public static final C14309t f31303f;

    /* renamed from: g */
    public static final Paint f31304g;

    /* renamed from: k */
    public static final Paint f31305k;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Paint $r0 = new Paint("COMPLETING_ALREADY");
        f31301d = $r0;
        Paint $r02 = new Paint("COMPLETING_WAITING_CHILDREN");
        f31302e = $r02;
        Paint $r03 = new Paint("COMPLETING_RETRY");
        f31300b = $r03;
        Paint $r04 = new Paint("TOO_LATE_TO_CANCEL");
        f31304g = $r04;
        Paint $r05 = new Paint("SEALED");
        f31305k = $r05;
        C14309t $r1 = new C14309t(false);
        f31299a = $r1;
        C14309t $r12 = new C14309t(true);
        f31303f = $r12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static final java.lang.Object m2356a(java.lang.Object obj) {
        InterfaceC14267e $r3;
        boolean $z0 = obj instanceof AnnotationWriter;
        java.lang.Object $r1 = !$z0 ? null : obj;
        AnnotationWriter $r2 = (AnnotationWriter) $r1;
        return ($r2 == null || ($r3 = $r2.f31265a) == null) ? obj : $r3;
    }
}
