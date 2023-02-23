package kotlin.reflect.jvm.internal.impl.descriptors;
/* compiled from: Visibility.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.g1 */
/* loaded from: classes3.dex */
public abstract class AbstractC13333g1 {

    /* renamed from: a */
    private final String f29490a;

    /* renamed from: b */
    private final boolean f29491b;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC13333g1(String str, boolean z) {
        kotlin.e0.d.l.f(str, "name");
        this.f29490a = str;
        this.f29491b = z;
    }

    /* renamed from: a */
    public Integer mo4948a(AbstractC13333g1 abstractC13333g1) {
        kotlin.e0.d.l.f(abstractC13333g1, "visibility");
        return C13321f1.f29479a.m5331a(this, abstractC13333g1);
    }

    /* renamed from: b */
    public String mo4947b() {
        return this.f29490a;
    }

    /* renamed from: c */
    public final boolean m5329c() {
        return this.f29491b;
    }

    /* renamed from: d */
    public AbstractC13333g1 mo4946d() {
        return this;
    }

    public final String toString() {
        return mo4947b();
    }
}
