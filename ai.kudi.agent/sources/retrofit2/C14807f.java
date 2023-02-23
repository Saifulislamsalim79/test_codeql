package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import retrofit2.InterfaceC14802c;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DefaultCallAdapterFactory.java */
/* renamed from: retrofit2.f */
/* loaded from: classes3.dex */
public final class C14807f extends InterfaceC14802c.AbstractC14803a {

    /* renamed from: a */
    static final InterfaceC14802c.AbstractC14803a f33080a = new C14807f();

    /* compiled from: DefaultCallAdapterFactory.java */
    /* renamed from: retrofit2.f$a */
    /* loaded from: classes3.dex */
    class C14808a implements InterfaceC14802c<Object, InterfaceC14801b<?>> {

        /* renamed from: a */
        final /* synthetic */ Type f33081a;

        C14808a(C14807f c14807f, Type type) {
            this.f33081a = type;
        }

        @Override // retrofit2.InterfaceC14802c
        /* renamed from: a */
        public /* bridge */ /* synthetic */ InterfaceC14801b<?> mo324a(InterfaceC14801b<Object> interfaceC14801b) {
            m326b(interfaceC14801b);
            return interfaceC14801b;
        }

        /* renamed from: b */
        public InterfaceC14801b<Object> m326b(InterfaceC14801b<Object> interfaceC14801b) {
            return interfaceC14801b;
        }

        @Override // retrofit2.InterfaceC14802c
        public Type responseType() {
            return this.f33081a;
        }
    }

    C14807f() {
    }

    @Override // retrofit2.InterfaceC14802c.AbstractC14803a
    /* renamed from: a */
    public InterfaceC14802c<?, ?> mo325a(Type type, Annotation[] annotationArr, C14841m c14841m) {
        if (InterfaceC14802c.AbstractC14803a.m328c(type) != InterfaceC14801b.class) {
            return null;
        }
        return new C14808a(this, C14846o.m235f(type));
    }
}
