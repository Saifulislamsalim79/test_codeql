package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p565l.AbstractC14120b0;
import p565l.AbstractC14135d0;
import retrofit2.InterfaceC14805e;
import retrofit2.q.v;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuiltInConverters.java */
/* renamed from: retrofit2.a */
/* loaded from: classes3.dex */
public final class C14784a extends InterfaceC14805e.AbstractC14806a {

    /* compiled from: BuiltInConverters.java */
    /* renamed from: retrofit2.a$a */
    /* loaded from: classes3.dex */
    static final class C14785a implements InterfaceC14805e<AbstractC14135d0, AbstractC14135d0> {

        /* renamed from: a */
        static final C14785a f33051a = new C14785a();

        C14785a() {
        }

        @Override // retrofit2.InterfaceC14805e
        /* renamed from: a */
        public AbstractC14135d0 convert(AbstractC14135d0 abstractC14135d0) throws IOException {
            try {
                return C14846o.m240a(abstractC14135d0);
            } finally {
                abstractC14135d0.close();
            }
        }
    }

    /* compiled from: BuiltInConverters.java */
    /* renamed from: retrofit2.a$b */
    /* loaded from: classes3.dex */
    static final class C14786b implements InterfaceC14805e<AbstractC14120b0, AbstractC14120b0> {

        /* renamed from: a */
        static final C14786b f33052a = new C14786b();

        C14786b() {
        }

        /* renamed from: a */
        public AbstractC14120b0 m347a(AbstractC14120b0 abstractC14120b0) {
            return abstractC14120b0;
        }

        @Override // retrofit2.InterfaceC14805e
        public /* bridge */ /* synthetic */ AbstractC14120b0 convert(AbstractC14120b0 abstractC14120b0) throws IOException {
            AbstractC14120b0 abstractC14120b02 = abstractC14120b0;
            m347a(abstractC14120b02);
            return abstractC14120b02;
        }
    }

    /* compiled from: BuiltInConverters.java */
    /* renamed from: retrofit2.a$c */
    /* loaded from: classes3.dex */
    static final class C14787c implements InterfaceC14805e<AbstractC14135d0, AbstractC14135d0> {

        /* renamed from: a */
        static final C14787c f33053a = new C14787c();

        C14787c() {
        }

        /* renamed from: a */
        public AbstractC14135d0 m346a(AbstractC14135d0 abstractC14135d0) {
            return abstractC14135d0;
        }

        @Override // retrofit2.InterfaceC14805e
        public /* bridge */ /* synthetic */ AbstractC14135d0 convert(AbstractC14135d0 abstractC14135d0) throws IOException {
            AbstractC14135d0 abstractC14135d02 = abstractC14135d0;
            m346a(abstractC14135d02);
            return abstractC14135d02;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BuiltInConverters.java */
    /* renamed from: retrofit2.a$d */
    /* loaded from: classes3.dex */
    public static final class C14788d implements InterfaceC14805e<Object, String> {

        /* renamed from: a */
        static final C14788d f33054a = new C14788d();

        C14788d() {
        }

        @Override // retrofit2.InterfaceC14805e
        /* renamed from: a */
        public String convert(Object obj) {
            return obj.toString();
        }
    }

    /* compiled from: BuiltInConverters.java */
    /* renamed from: retrofit2.a$e */
    /* loaded from: classes3.dex */
    static final class C14789e implements InterfaceC14805e<AbstractC14135d0, Void> {

        /* renamed from: a */
        static final C14789e f33055a = new C14789e();

        C14789e() {
        }

        @Override // retrofit2.InterfaceC14805e
        /* renamed from: a */
        public Void convert(AbstractC14135d0 abstractC14135d0) {
            abstractC14135d0.close();
            return null;
        }
    }

    @Override // retrofit2.InterfaceC14805e.AbstractC14806a
    /* renamed from: a */
    public InterfaceC14805e<?, AbstractC14120b0> mo222a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C14841m c14841m) {
        if (AbstractC14120b0.class.isAssignableFrom(C14846o.m232i(type))) {
            return C14786b.f33052a;
        }
        return null;
    }

    @Override // retrofit2.InterfaceC14805e.AbstractC14806a
    /* renamed from: b */
    public InterfaceC14805e<AbstractC14135d0, ?> mo221b(Type type, Annotation[] annotationArr, C14841m c14841m) {
        if (type == AbstractC14135d0.class) {
            if (C14846o.m228m(annotationArr, v.class)) {
                return C14787c.f33053a;
            }
            return C14785a.f33051a;
        } else if (type == Void.class) {
            return C14789e.f33055a;
        } else {
            return null;
        }
    }
}
