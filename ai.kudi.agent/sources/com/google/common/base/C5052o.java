package com.google.common.base;
/* compiled from: Splitter.java */
/* renamed from: com.google.common.base.o */
/* loaded from: classes2.dex */
public final class C5052o {

    /* renamed from: a */
    private final boolean f12698a;

    /* renamed from: b */
    private final InterfaceC5054b f12699b;

    /* renamed from: c */
    private final int f12700c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Splitter.java */
    /* renamed from: com.google.common.base.o$a */
    /* loaded from: classes2.dex */
    public class C5053a implements InterfaceC5054b {
        C5053a(AbstractC5028c abstractC5028c) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Splitter.java */
    /* renamed from: com.google.common.base.o$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC5054b {
    }

    private C5052o(InterfaceC5054b interfaceC5054b) {
        this(interfaceC5054b, false, AbstractC5028c.m25831c(), Integer.MAX_VALUE);
    }

    /* renamed from: a */
    public static C5052o m25770a(char c) {
        return m25769b(AbstractC5028c.m25832b(c));
    }

    /* renamed from: b */
    public static C5052o m25769b(AbstractC5028c abstractC5028c) {
        C5051n.m25780n(abstractC5028c);
        return new C5052o(new C5053a(abstractC5028c));
    }

    /* renamed from: c */
    public C5052o m25768c() {
        return m25767d(AbstractC5028c.m25829e());
    }

    /* renamed from: d */
    public C5052o m25767d(AbstractC5028c abstractC5028c) {
        C5051n.m25780n(abstractC5028c);
        return new C5052o(this.f12699b, this.f12698a, abstractC5028c, this.f12700c);
    }

    private C5052o(InterfaceC5054b interfaceC5054b, boolean z, AbstractC5028c abstractC5028c, int i) {
        this.f12699b = interfaceC5054b;
        this.f12698a = z;
        this.f12700c = i;
    }
}
