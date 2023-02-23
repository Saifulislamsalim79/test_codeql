package kotlin.reflect.jvm.internal.impl.descriptors.p550h1;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import java.util.Map;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p522h.AbstractC12624c;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r.AbstractC12712g;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13545u0;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13340c;
/* compiled from: AnnotationDescriptorImpl.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.h1.d */
/* loaded from: classes3.dex */
public class C13342d implements InterfaceC13340c {

    /* renamed from: a */
    private final AbstractC12965b0 f29496a;

    /* renamed from: b */
    private final Map<C12614f, AbstractC12712g<?>> f29497b;

    /* renamed from: c */
    private final InterfaceC13545u0 f29498c;

    public C13342d(AbstractC12965b0 abstractC12965b0, Map<C12614f, AbstractC12712g<?>> map, InterfaceC13545u0 interfaceC13545u0) {
        if (abstractC12965b0 == null) {
            m5324b(0);
            throw null;
        } else if (map == null) {
            m5324b(1);
            throw null;
        } else if (interfaceC13545u0 != null) {
            this.f29496a = abstractC12965b0;
            this.f29497b = map;
            this.f29498c = interfaceC13545u0;
        } else {
            m5324b(2);
            throw null;
        }
    }

    /* renamed from: b */
    private static /* synthetic */ void m5324b(int i) {
        String str = (i == 3 || i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 3 || i == 4 || i == 5) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "valueArguments";
        } else if (i == 2) {
            objArr[0] = TransactionField.TRANSACTION_CHANNEL;
        } else if (i == 3 || i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i == 3) {
            objArr[1] = "getType";
        } else if (i == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 3 && i != 4 && i != 5) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i != 3 && i != 4 && i != 5) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13340c
    /* renamed from: a */
    public Map<C12614f, AbstractC12712g<?>> mo5312a() {
        Map<C12614f, AbstractC12712g<?>> map = this.f29497b;
        if (map != null) {
            return map;
        }
        m5324b(4);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13340c
    /* renamed from: c */
    public AbstractC12965b0 mo5310c() {
        AbstractC12965b0 abstractC12965b0 = this.f29496a;
        if (abstractC12965b0 != null) {
            return abstractC12965b0;
        }
        m5324b(3);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13340c
    /* renamed from: f */
    public C12609c mo5309f() {
        return InterfaceC13340c.C13341a.m5325a(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13340c
    /* renamed from: m */
    public InterfaceC13545u0 mo5308m() {
        InterfaceC13545u0 interfaceC13545u0 = this.f29498c;
        if (interfaceC13545u0 != null) {
            return interfaceC13545u0;
        }
        m5324b(5);
        throw null;
    }

    public String toString() {
        return AbstractC12624c.f28404b.mo7204r(this, null);
    }
}
