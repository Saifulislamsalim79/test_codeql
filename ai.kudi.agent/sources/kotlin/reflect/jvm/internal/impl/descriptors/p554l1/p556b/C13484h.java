package kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b;

import java.util.ArrayList;
import java.util.List;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12275e;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b.AbstractC13478d;
/* compiled from: ReflectJavaAnnotationArguments.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1.b.h */
/* loaded from: classes3.dex */
public final class C13484h extends AbstractC13478d implements InterfaceC12275e {

    /* renamed from: c */
    private final Object[] f29840c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13484h(C12614f c12614f, Object[] objArr) {
        super(c12614f, null);
        l.f(objArr, "values");
        this.f29840c = objArr;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12275e
    /* renamed from: f */
    public List<AbstractC13478d> mo4869f() {
        Object[] objArr = this.f29840c;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            AbstractC13478d.C13479a c13479a = AbstractC13478d.f29837b;
            l.d(obj);
            arrayList.add(c13479a.m4876a(obj, null));
        }
        return arrayList;
    }
}
