package kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1;

import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
/* compiled from: TypeCheckingProcedure.java */
/* renamed from: kotlin.j0.o.c.p0.l.j1.v */
/* loaded from: classes3.dex */
public class C13046v {
    /* renamed from: a */
    private static /* synthetic */ void m6048a(int i) {
        String str = (i == 7 || i == 10) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 7 || i == 10) ? 2 : 3];
        switch (i) {
            case 1:
            case 3:
            case 16:
            case 18:
                objArr[0] = "supertype";
                break;
            case 2:
            case 15:
            case 17:
            default:
                objArr[0] = "subtype";
                break;
            case 4:
                objArr[0] = "typeCheckingProcedureCallbacks";
                break;
            case 5:
            case 8:
            case 21:
                objArr[0] = "parameter";
                break;
            case 6:
            case 9:
                objArr[0] = "argument";
                break;
            case 7:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure";
                break;
            case 11:
                objArr[0] = "type1";
                break;
            case 12:
                objArr[0] = "type2";
                break;
            case 13:
                objArr[0] = "typeParameter";
                break;
            case 14:
                objArr[0] = "typeArgument";
                break;
            case 19:
                objArr[0] = "subtypeArgumentProjection";
                break;
            case 20:
                objArr[0] = "supertypeArgumentProjection";
                break;
        }
        if (i == 7) {
            objArr[1] = "getOutType";
        } else if (i != 10) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure";
        } else {
            objArr[1] = "getInType";
        }
        switch (i) {
            case 5:
            case 6:
                objArr[2] = "getOutType";
                break;
            case 7:
            case 10:
                break;
            case 8:
            case 9:
                objArr[2] = "getInType";
                break;
            case 11:
            case 12:
                objArr[2] = "equalTypes";
                break;
            case 13:
            case 14:
                objArr[2] = "getEffectiveProjectionKind";
                break;
            case 15:
            case 16:
                objArr[2] = "isSubtypeOf";
                break;
            case 17:
            case 18:
                objArr[2] = "checkSubtypeForTheSameConstructor";
                break;
            case 19:
            case 20:
            case 21:
                objArr[2] = "capture";
                break;
            default:
                objArr[2] = "findCorrespondingSupertype";
                break;
        }
        String format = String.format(str, objArr);
        if (i != 7 && i != 10) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    /* renamed from: b */
    public static AbstractC12965b0 m6047b(AbstractC12965b0 abstractC12965b0, AbstractC12965b0 abstractC12965b02) {
        if (abstractC12965b0 == null) {
            m6048a(0);
            throw null;
        } else if (abstractC12965b02 != null) {
            return m6046c(abstractC12965b0, abstractC12965b02, new C13045u());
        } else {
            m6048a(1);
            throw null;
        }
    }

    /* renamed from: c */
    public static AbstractC12965b0 m6046c(AbstractC12965b0 abstractC12965b0, AbstractC12965b0 abstractC12965b02, InterfaceC13047w interfaceC13047w) {
        if (abstractC12965b0 == null) {
            m6048a(2);
            throw null;
        } else if (abstractC12965b02 == null) {
            m6048a(3);
            throw null;
        } else if (interfaceC13047w != null) {
            return C13057y.m6030d(abstractC12965b0, abstractC12965b02, interfaceC13047w);
        } else {
            m6048a(4);
            throw null;
        }
    }
}
