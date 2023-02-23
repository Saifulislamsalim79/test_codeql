package kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12284n;
import kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b.AbstractC13508w;
/* compiled from: ReflectJavaField.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1.b.p */
/* loaded from: classes3.dex */
public final class C13500p extends AbstractC13502r implements InterfaceC12284n {

    /* renamed from: a */
    private final Field f29859a;

    public C13500p(Field field) {
        l.f(field, "member");
        this.f29859a = field;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12284n
    /* renamed from: M */
    public boolean mo4822M() {
        return mo4807c0().isEnumConstant();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12284n
    /* renamed from: W */
    public boolean mo4821W() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b.AbstractC13502r
    /* renamed from: e0 */
    public Field mo4807c0() {
        return this.f29859a;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12284n
    /* renamed from: f0 */
    public AbstractC13508w mo4820c() {
        AbstractC13508w.C13509a c13509a = AbstractC13508w.f29866a;
        Type genericType = mo4807c0().getGenericType();
        l.e(genericType, "member.genericType");
        return c13509a.m4789a(genericType);
    }
}
