package kotlin.reflect.jvm.internal.impl.descriptors.p553k1;

import kotlin.e0.d.l;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC13333g1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13321f1;
/* compiled from: JavaVisibilities.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.k1.b */
/* loaded from: classes3.dex */
public final class C13450b extends AbstractC13333g1 {

    /* renamed from: c */
    public static final C13450b f29806c = new C13450b();

    private C13450b() {
        super("protected_and_package", true);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC13333g1
    /* renamed from: a */
    public Integer mo4948a(AbstractC13333g1 abstractC13333g1) {
        l.f(abstractC13333g1, "visibility");
        if (l.b(this, abstractC13333g1)) {
            return 0;
        }
        if (abstractC13333g1 == C13321f1.C13323b.f29482c) {
            return null;
        }
        return Integer.valueOf(C13321f1.f29479a.m5330b(abstractC13333g1) ? 1 : -1);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC13333g1
    /* renamed from: b */
    public String mo4947b() {
        return "protected/*protected and package*/";
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC13333g1
    /* renamed from: d */
    public AbstractC13333g1 mo4946d() {
        return C13321f1.C13328g.f29487c;
    }
}
