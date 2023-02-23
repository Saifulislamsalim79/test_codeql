package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
/* compiled from: MessageLite.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.o */
/* loaded from: classes3.dex */
public interface InterfaceC13601o extends InterfaceC13603p {

    /* compiled from: MessageLite.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.o$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC13602a extends Cloneable, InterfaceC13603p {
        /* renamed from: V */
        InterfaceC13602a mo4381V(C13573e c13573e, C13575f c13575f) throws IOException;

        InterfaceC13601o build();
    }

    /* renamed from: b */
    InterfaceC13602a mo4386b();

    /* renamed from: c */
    void mo4385c(CodedOutputStream codedOutputStream) throws IOException;

    /* renamed from: d */
    int mo4384d();

    /* renamed from: f */
    InterfaceC13602a mo4383f();

    /* renamed from: g */
    InterfaceC13604q<? extends InterfaceC13601o> mo4382g();
}
