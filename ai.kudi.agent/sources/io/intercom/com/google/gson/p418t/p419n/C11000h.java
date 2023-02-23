package io.intercom.com.google.gson.p418t.p419n;

import io.intercom.com.google.gson.AbstractC10936q;
import io.intercom.com.google.gson.C10916e;
import io.intercom.com.google.gson.InterfaceC10938r;
import io.intercom.com.google.gson.p418t.C10968h;
import io.intercom.com.google.gson.p422u.C11058a;
import io.intercom.com.google.gson.stream.C10939a;
import io.intercom.com.google.gson.stream.C10942c;
import io.intercom.com.google.gson.stream.EnumC10941b;
import java.io.IOException;
import java.util.ArrayList;
/* compiled from: ObjectTypeAdapter.java */
/* renamed from: io.intercom.com.google.gson.t.n.h */
/* loaded from: classes3.dex */
public final class C11000h extends AbstractC10936q<Object> {

    /* renamed from: b */
    public static final InterfaceC10938r f25028b = new C11001a();

    /* renamed from: a */
    private final C10916e f25029a;

    /* compiled from: ObjectTypeAdapter.java */
    /* renamed from: io.intercom.com.google.gson.t.n.h$a */
    /* loaded from: classes3.dex */
    static class C11001a implements InterfaceC10938r {
        C11001a() {
        }

        @Override // io.intercom.com.google.gson.InterfaceC10938r
        /* renamed from: a */
        public <T> AbstractC10936q<T> mo11671a(C10916e c10916e, C11058a<T> c11058a) {
            if (c11058a.m11659c() == Object.class) {
                return new C11000h(c10916e);
            }
            return null;
        }
    }

    /* compiled from: ObjectTypeAdapter.java */
    /* renamed from: io.intercom.com.google.gson.t.n.h$b */
    /* loaded from: classes3.dex */
    static /* synthetic */ class C11002b {

        /* renamed from: a */
        static final /* synthetic */ int[] f25030a;

        static {
            int[] iArr = new int[EnumC10941b.values().length];
            f25030a = iArr;
            try {
                iArr[EnumC10941b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25030a[EnumC10941b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25030a[EnumC10941b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25030a[EnumC10941b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f25030a[EnumC10941b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f25030a[EnumC10941b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    C11000h(C10916e c10916e) {
        this.f25029a = c10916e;
    }

    @Override // io.intercom.com.google.gson.AbstractC10936q
    /* renamed from: b */
    public Object mo11675b(C10939a c10939a) throws IOException {
        switch (C11002b.f25030a[c10939a.mo11789C0().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                c10939a.mo11781c();
                while (c10939a.mo11785V()) {
                    arrayList.add(mo11675b(c10939a));
                }
                c10939a.mo11788J();
                return arrayList;
            case 2:
                C10968h c10968h = new C10968h();
                c10939a.mo11776g();
                while (c10939a.mo11785V()) {
                    c10968h.put(c10939a.mo11772o0(), mo11675b(c10939a));
                }
                c10939a.mo11787O();
                return c10968h;
            case 3:
                return c10939a.mo11770z0();
            case 4:
                return Double.valueOf(c10939a.mo11775g0());
            case 5:
                return Boolean.valueOf(c10939a.mo11777f0());
            case 6:
                c10939a.mo11771w0();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // io.intercom.com.google.gson.AbstractC10936q
    /* renamed from: d */
    public void mo11674d(C10942c c10942c, Object obj) throws IOException {
        if (obj == null) {
            c10942c.mo11757f0();
            return;
        }
        AbstractC10936q m11958m = this.f25029a.m11958m(obj.getClass());
        if (m11958m instanceof C11000h) {
            c10942c.mo11766F();
            c10942c.mo11760O();
            return;
        }
        m11958m.mo11674d(c10942c, obj);
    }
}
