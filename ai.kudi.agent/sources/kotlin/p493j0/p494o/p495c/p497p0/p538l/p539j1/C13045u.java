package kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1;

import kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0;
/* compiled from: TypeCheckerProcedureCallbacksImpl.java */
/* renamed from: kotlin.j0.o.c.p0.l.j1.u */
/* loaded from: classes3.dex */
class C13045u implements InterfaceC13047w {
    /* renamed from: b */
    private static /* synthetic */ void m6049b(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
            case 4:
                objArr[0] = "b";
                break;
            case 2:
            case 7:
                objArr[0] = "typeCheckingProcedure";
                break;
            case 3:
            default:
                objArr[0] = "a";
                break;
            case 5:
            case 10:
                objArr[0] = "subtype";
                break;
            case 6:
            case 11:
                objArr[0] = "supertype";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 9:
                objArr[0] = "typeProjection";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (i) {
            case 3:
            case 4:
                objArr[2] = "assertEqualTypeConstructors";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "assertSubtype";
                break;
            case 8:
            case 9:
                objArr[2] = "capture";
                break;
            case 10:
            case 11:
                objArr[2] = "noCorrespondingSupertype";
                break;
            default:
                objArr[2] = "assertEqualTypes";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.InterfaceC13047w
    /* renamed from: a */
    public boolean mo6045a(InterfaceC13125t0 interfaceC13125t0, InterfaceC13125t0 interfaceC13125t02) {
        if (interfaceC13125t0 == null) {
            m6049b(3);
            throw null;
        } else if (interfaceC13125t02 != null) {
            return interfaceC13125t0.equals(interfaceC13125t02);
        } else {
            m6049b(4);
            throw null;
        }
    }
}
