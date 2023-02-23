package kotlin.reflect.jvm.internal.impl.descriptors;
/* compiled from: DescriptorVisibility.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r */
/* loaded from: classes3.dex */
public abstract class AbstractC13523r extends AbstractC13544u {

    /* renamed from: a */
    private final AbstractC13333g1 f29878a;

    public AbstractC13523r(AbstractC13333g1 abstractC13333g1) {
        kotlin.e0.d.l.f(abstractC13333g1, "delegate");
        this.f29878a = abstractC13333g1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC13544u
    /* renamed from: b */
    public AbstractC13333g1 mo4711b() {
        return this.f29878a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC13544u
    /* renamed from: c */
    public String mo4710c() {
        return mo4711b().mo4947b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC13544u
    /* renamed from: f */
    public AbstractC13544u mo4707f() {
        AbstractC13544u m4725j = C13530t.m4725j(mo4711b().mo4946d());
        kotlin.e0.d.l.e(m4725j, "toDescriptorVisibility(delegate.normalize())");
        return m4725j;
    }
}
